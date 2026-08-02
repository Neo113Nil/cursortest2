package ru.ok.android.webrtc.protocol.impl.notifications;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.protocol.RtcFormat;
import ru.ok.android.webrtc.protocol.RtcNotification;
import ru.ok.android.webrtc.protocol.RtcNotificationReceiver;
import ru.ok.android.webrtc.protocol.RtcNotificationSerializer;
import ru.ok.android.webrtc.protocol.RtcTransport;
import xsna.qye;
import xsna.rml;
import xsna.tw70;
import xsna.wq8;
import xsna.zs6;

/* loaded from: classes9.dex */
public class RtcNotificationReceiverImpl implements RtcNotificationReceiver {
    public static final String RTC_NOTIF_RECV = "RtcNotifRecv";
    public final RtcNotificationSerializer a;
    public final RTCLog b;
    public final HandlerThread d;
    public final Handler e;
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public final Handler f = new Handler(Looper.getMainLooper());
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final AtomicReference h = new AtomicReference(null);
    public final a i = new a(this);

    public static class Builder {
        public RtcNotificationSerializer a = null;
        public RTCLog b = null;

        public RtcNotificationReceiverImpl build() {
            return new RtcNotificationReceiverImpl(this);
        }

        public Builder setLog(@Nullable RTCLog rTCLog) {
            this.b = rTCLog;
            return this;
        }

        public Builder setSerializer(@Nullable RtcNotificationSerializer rtcNotificationSerializer) {
            this.a = rtcNotificationSerializer;
            return this;
        }
    }

    public RtcNotificationReceiverImpl(Builder builder) {
        RtcNotificationSerializer rtcNotificationSerializer = builder.a;
        if (rtcNotificationSerializer == null) {
            throw new IllegalArgumentException("Illegal 'serializer' value: null");
        }
        RTCLog rTCLog = builder.b;
        if (rTCLog == null) {
            throw new IllegalArgumentException("Illegal 'log' value: null");
        }
        this.a = rtcNotificationSerializer;
        this.b = rTCLog;
        HandlerThread handlerThread = new HandlerThread(RTC_NOTIF_RECV);
        this.d = handlerThread;
        handlerThread.start();
        this.e = new Handler(handlerThread.getLooper());
    }

    public final /* synthetic */ void a(boolean z) {
        RtcTransport rtcTransport = (RtcTransport) this.h.get();
        if (rtcTransport != null) {
            rtcTransport.removeDataListener(this.i);
            if (z) {
                rtcTransport.dispose();
            }
        }
    }

    @Override // ru.ok.android.webrtc.protocol.RtcNotificationReceiver
    public void addListener(@NonNull RtcNotificationReceiver.Listener listener) {
        if (listener == null) {
            throw new IllegalArgumentException("Illegal 'listener' value: null");
        }
        this.c.add(listener);
    }

    public void awaitTermination(int i) throws InterruptedException {
        this.d.join(i);
    }

    public final /* synthetic */ void b(RtcNotification rtcNotification) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            try {
                ((RtcNotificationReceiver.Listener) it.next()).onNotificationReceived(rtcNotification);
            } catch (Throwable th) {
                this.b.reportException("RtcNotificationReceiver", "rtc.notification.handle.notificationreceived", th);
            }
        }
    }

    public void dispose(boolean z) {
        if (this.g.compareAndSet(false, true)) {
            this.e.removeCallbacksAndMessages(null);
            this.e.post(new tw70(this, z));
            this.d.quitSafely();
        }
    }

    @Override // ru.ok.android.webrtc.protocol.RtcNotificationReceiver
    public void removeListener(@NonNull RtcNotificationReceiver.Listener listener) {
        if (listener == null) {
            throw new IllegalArgumentException("Illegal 'listener' value: null");
        }
        this.c.remove(listener);
    }

    public void setTransport(@Nullable RtcTransport rtcTransport) {
        if (this.g.get()) {
            throw new IllegalStateException("Instance is disposed");
        }
        this.e.post(new wq8(4, this, rtcTransport));
    }

    public final void a(RtcTransport rtcTransport) {
        RtcTransport rtcTransport2;
        if (this.g.get() || (rtcTransport2 = (RtcTransport) this.h.get()) == rtcTransport) {
            return;
        }
        this.h.set(rtcTransport);
        if (rtcTransport2 != null) {
            rtcTransport2.removeDataListener(this.i);
        }
        if (rtcTransport != null) {
            rtcTransport.addDataListener(this.i);
        }
    }

    public final /* synthetic */ void b(Throwable th) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            try {
                ((RtcNotificationReceiver.Listener) it.next()).onNotificationError(th);
            } catch (Throwable th2) {
                this.b.reportException("RtcNotificationReceiver", "rtc.notification.handle.notificationerror", th2);
            }
        }
    }

    public void dispose() {
        dispose(false);
    }

    public final /* synthetic */ void b(byte[] bArr, RtcFormat rtcFormat) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            try {
                ((RtcNotificationReceiver.Listener) it.next()).onRtcDataReceived(bArr, rtcFormat);
            } catch (Throwable th) {
                this.b.reportException("RtcNotificationReceiver", "rtc.notification.handle.datareceived", th);
            }
        }
    }

    public final void a(RtcNotification rtcNotification) {
        this.f.post(new zs6(4, this, rtcNotification));
    }

    public final void a(Throwable th) {
        this.f.post(new qye(12, this, th));
    }

    public final void a(byte[] bArr, RtcFormat rtcFormat) {
        this.f.post(new rml(this, bArr, rtcFormat, 3));
    }
}
