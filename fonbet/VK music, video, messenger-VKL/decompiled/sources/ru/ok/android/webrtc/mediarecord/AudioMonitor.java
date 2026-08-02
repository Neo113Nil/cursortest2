package ru.ok.android.webrtc.mediarecord;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioRecordingConfiguration;
import android.os.Build;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.stat.audio.AudioErrorEvent;
import xsna.c5g;
import xsna.go9;
import xsna.izs;
import xsna.j5g;
import xsna.p1z0;
import xsna.s3q0;
import xsna.xnz;

@CallInternalApi
/* loaded from: classes9.dex */
public final class AudioMonitor {

    @Deprecated
    public static final long AUDIO_STATE_CHECK_INTERVAL_MS = 3000;

    @Deprecated
    public static final String LOG_TAG = "AudioMonitor";
    public final WeakReference a;
    public final RTCLog b;
    public final boolean c;
    public final izs d;
    public final q e = q.R(3000, TimeUnit.MILLISECONDS);
    public c f = EmptyDisposable.INSTANCE;
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final AtomicBoolean h = new AtomicBoolean(false);

    public AudioMonitor(WeakReference<Context> weakReference, RTCLog rTCLog, boolean z, izs<? super AudioErrorEvent, s3q0> izsVar) {
        this.a = weakReference;
        this.b = rTCLog;
        this.c = z;
        this.d = izsVar;
    }

    public static final void access$checkAudioState(AudioMonitor audioMonitor) {
        audioMonitor.getClass();
        try {
            audioMonitor.a();
        } catch (Throwable th) {
            audioMonitor.b.logException(LOG_TAG, "Can't get recording configuration list", th);
        }
    }

    public final void a() {
        Context context;
        boolean isClientSilenced;
        if ((this.g.get() && this.h.get()) || (context = (Context) this.a.get()) == null) {
            return;
        }
        Object systemService = context.getSystemService("audio");
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        if (audioManager == null) {
            return;
        }
        List<AudioRecordingConfiguration> activeRecordingConfigurations = audioManager.getActiveRecordingConfigurations();
        if (!this.g.get()) {
            Iterator<T> it = activeRecordingConfigurations.iterator();
            while (it.hasNext()) {
                isClientSilenced = ((AudioRecordingConfiguration) it.next()).isClientSilenced();
                if (isClientSilenced && this.g.compareAndSet(false, true)) {
                    this.d.invoke(new AudioErrorEvent("record", "run", "audio session is silenced", null, 8, null));
                }
            }
        }
        if (activeRecordingConfigurations.size() <= 1 || !this.h.compareAndSet(false, true)) {
            return;
        }
        izs izsVar = this.d;
        ArrayList arrayList = new ArrayList(c5g.u(activeRecordingConfigurations, 10));
        Iterator<T> it2 = activeRecordingConfigurations.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(((AudioRecordingConfiguration) it2.next()).getClientAudioSessionId()));
        }
        izsVar.invoke(new AudioErrorEvent("record", "run", go9.b("concurrent audio sessions: ", j5g.g0(arrayList, ", ", null, null, 0, null, 62)), null, 8, null));
    }

    public final void release() {
        this.f.dispose();
    }

    public final void start() {
        if (!this.c || Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.f = this.e.subscribe(new xnz(this, 1), new p1z0());
    }
}
