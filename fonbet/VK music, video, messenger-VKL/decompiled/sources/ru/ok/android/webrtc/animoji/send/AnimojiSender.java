package ru.ok.android.webrtc.animoji.send;

import android.os.SystemClock;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.animoji.AnimojiCore;
import ru.ok.android.webrtc.animoji.AnimojiLandmarkConsumer;
import ru.ok.android.webrtc.animoji.send.AnimojiSender;
import ru.ok.android.webrtc.animoji.stats.AnimojiStatHandle;
import ru.ok.android.webrtc.animoji.util.AnimojiDataPackagePayload;
import ru.ok.android.webrtc.animoji.util.DataChannelSenderThread;
import ru.ok.android.webrtc.protocol.RtcTransport;
import ru.ok.android.webrtc.utils.ColorUtils;
import xsna.bjn0;
import xsna.epx;
import xsna.ghp;
import xsna.go9;
import xsna.gq;
import xsna.jli0;
import xsna.rli0;
import xsna.roy0;
import xsna.sl3;

@CallInternalApi
/* loaded from: classes9.dex */
public final class AnimojiSender implements AnimojiLandmarkConsumer {

    @Deprecated
    public static final String TAG = "AniSend";

    @Deprecated
    public static final boolean debugsend = false;
    public final AnimojiCore a;
    public final AnimojiStatHandle b;
    public volatile Integer c;
    public volatile RtcTransport d;
    public volatile DataChannelSenderThread e;
    public final RtcTransport.ConnectionStateListener f = new RtcTransport.ConnectionStateListener() { // from class: xsna.ns2
        @Override // ru.ok.android.webrtc.protocol.RtcTransport.ConnectionStateListener
        public final void onConnectionStateChanged(RtcTransport rtcTransport, boolean z) {
            AnimojiSender.a(AnimojiSender.this, rtcTransport, z);
        }
    };
    public volatile roy0 g;
    public volatile long h;

    public AnimojiSender(AnimojiCore animojiCore, AnimojiStatHandle animojiStatHandle, Integer num) {
        this.a = animojiCore;
        this.b = animojiStatHandle;
        this.c = num;
        Integer num2 = this.c;
        this.g = (num2 != null && num2.intValue() == 1) ? null : new roy0(this);
        animojiCore.addLandmarkConsumer(this);
    }

    public static final void a(AnimojiSender animojiSender, RtcTransport rtcTransport, boolean z) {
        roy0 roy0Var = animojiSender.g;
        if (roy0Var != null) {
            roy0Var.a();
        }
    }

    public final void clearTransport() {
        RtcTransport rtcTransport = this.d;
        if (rtcTransport != null) {
            rtcTransport.removeConnectionStateListener(this.f);
        }
        this.d = null;
        DataChannelSenderThread dataChannelSenderThread = this.e;
        if (dataChannelSenderThread != null) {
            dataChannelSenderThread.shutdown();
            dataChannelSenderThread.releaseTransport();
        }
        this.e = null;
    }

    public final boolean isVersionSpecified() {
        return this.c != null;
    }

    @Override // ru.ok.android.webrtc.animoji.AnimojiLandmarkConsumer
    public void onBgColor(int i) {
        roy0 roy0Var = this.g;
        Integer num = this.c;
        if (roy0Var != null) {
            roy0Var.a = Integer.valueOf(i);
            roy0Var.a();
            return;
        }
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 2) {
                a(intValue, new AnimojiDataPackagePayload.BgColor(i));
                return;
            }
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("AnimojiSender has neither version nor startup data");
        RTCLog logger$webrtc_android_sdk_release = this.a.getLogger$webrtc_android_sdk_release();
        String message = illegalStateException.getMessage();
        if (message == null) {
            message = "animoji error";
        }
        logger$webrtc_android_sdk_release.reportException(TAG, message, illegalStateException);
        roy0 roy0Var2 = new roy0(this);
        roy0Var2.a = Integer.valueOf(i);
        roy0Var2.a();
        this.g = roy0Var2;
    }

    @Override // ru.ok.android.webrtc.animoji.AnimojiLandmarkConsumer
    public void onEndOfStream() {
        roy0 roy0Var = this.g;
        Integer num = this.c;
        if (roy0Var != null) {
            this.g = new roy0(this);
            return;
        }
        if (num != null) {
            a(num.intValue(), AnimojiDataPackagePayload.EOS.INSTANCE);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("AnimojiSender has neither version nor startup data");
        RTCLog logger$webrtc_android_sdk_release = this.a.getLogger$webrtc_android_sdk_release();
        String message = illegalStateException.getMessage();
        if (message == null) {
            message = "animoji error";
        }
        logger$webrtc_android_sdk_release.reportException(TAG, message, illegalStateException);
        roy0 roy0Var2 = new roy0(this);
        this.g = new roy0(this);
        this.g = roy0Var2;
    }

    @Override // ru.ok.android.webrtc.animoji.AnimojiLandmarkConsumer
    public void onLandmarks(Double[] dArr) {
        roy0 roy0Var = this.g;
        Integer num = this.c;
        if (roy0Var != null) {
            roy0Var.b = dArr;
            return;
        }
        if (num != null) {
            int intValue = num.intValue();
            int length = dArr.length;
            float[] fArr = new float[length];
            for (int i = 0; i < length; i++) {
                fArr[i] = (float) dArr[i].doubleValue();
            }
            a(intValue, new AnimojiDataPackagePayload.AnimojiData(fArr));
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("AnimojiSender has neither version nor startup data");
        RTCLog logger$webrtc_android_sdk_release = this.a.getLogger$webrtc_android_sdk_release();
        String message = illegalStateException.getMessage();
        if (message == null) {
            message = "animoji error";
        }
        logger$webrtc_android_sdk_release.reportException(TAG, message, illegalStateException);
        roy0 roy0Var2 = new roy0(this);
        roy0Var2.b = dArr;
        this.g = roy0Var2;
    }

    public final void release() {
        clearTransport();
        this.a.removeConsumer(this);
    }

    public final void setTransport(RtcTransport rtcTransport) {
        clearTransport();
        this.d = rtcTransport;
        rtcTransport.addConnectionStateListener(this.f);
        this.h = SystemClock.elapsedRealtime();
        this.b.onLandmarksSenderCreated();
        this.e = new DataChannelSenderThread(rtcTransport, this.b, 0, 4, null);
        DataChannelSenderThread dataChannelSenderThread = this.e;
        if (dataChannelSenderThread != null) {
            dataChannelSenderThread.start();
        }
        roy0 roy0Var = this.g;
        if (roy0Var != null) {
            roy0Var.a();
        }
    }

    public final void setVersion(int i) {
        if (isVersionSpecified()) {
            Throwable th = new Throwable("Resetting animoji protocol version");
            RTCLog logger$webrtc_android_sdk_release = this.a.getLogger$webrtc_android_sdk_release();
            String message = th.getMessage();
            if (message == null) {
                message = "animoji error";
            }
            logger$webrtc_android_sdk_release.logException(TAG, message, th);
        }
        this.c = Integer.valueOf(i);
        roy0 roy0Var = this.g;
        if (roy0Var != null) {
            roy0Var.a();
        }
    }

    public final void a(int i, AnimojiDataPackagePayload.AnimojiSendPackagePayload animojiSendPackagePayload) {
        DataChannelSenderThread dataChannelSenderThread;
        AnimojiSendDataPackage create = AnimojiSendDataPackage.Companion.create(i, (int) (SystemClock.elapsedRealtime() - this.h), animojiSendPackagePayload);
        if (epx.f((create == null || (dataChannelSenderThread = this.e) == null) ? null : Boolean.valueOf(dataChannelSenderThread.addPackage(create)), Boolean.TRUE)) {
            return;
        }
        bjn0.b("package was not sent: ", a(animojiSendPackagePayload), this.a.getLogger$webrtc_android_sdk_release(), TAG);
    }

    public static String a(AnimojiDataPackagePayload.AnimojiSendPackagePayload animojiSendPackagePayload) {
        if (animojiSendPackagePayload instanceof AnimojiDataPackagePayload.AnimojiData) {
            AnimojiDataPackagePayload.AnimojiData animojiData = (AnimojiDataPackagePayload.AnimojiData) animojiSendPackagePayload;
            int length = animojiData.getData().length;
            float[] data = animojiData.getData();
            return gq.b(length, "lmarks: (", ") ", TextUtils.join(StringUtils.COMMA, new jli0(rli0.y(data.length == 0 ? ghp.a : new sl3(data), 4))), "...");
        }
        if (animojiSendPackagePayload instanceof AnimojiDataPackagePayload.BgColor) {
            return go9.b("bgColor: 0x", ColorUtils.INSTANCE.colorToHex(((AnimojiDataPackagePayload.BgColor) animojiSendPackagePayload).getColor()));
        }
        if (animojiSendPackagePayload instanceof AnimojiDataPackagePayload.EOS) {
            return "EOS";
        }
        throw new NoWhenBranchMatchedException();
    }
}
