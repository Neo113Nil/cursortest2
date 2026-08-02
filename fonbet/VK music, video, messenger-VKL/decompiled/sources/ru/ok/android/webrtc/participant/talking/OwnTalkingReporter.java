package ru.ok.android.webrtc.participant.talking;

import io.reactivex.rxjava3.android.schedulers.a;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.subjects.f;
import java.util.concurrent.TimeUnit;
import ru.ok.android.webrtc.RTCLog;
import xsna.gzs;
import xsna.i5z0;
import xsna.s3q0;

/* loaded from: classes9.dex */
public final class OwnTalkingReporter {
    public final RTCLog a;
    public final gzs b;
    public final f c;
    public final c d;
    public Listener e;
    public boolean f;

    public interface Listener {
        void onTalking(boolean z);
    }

    public OwnTalkingReporter(RTCLog rTCLog, gzs<Boolean> gzsVar) {
        this.a = rTCLog;
        this.b = gzsVar;
        f fVar = new f();
        this.c = fVar;
        this.d = fVar.y(1000L, TimeUnit.MILLISECONDS).a0(a.b()).subscribe(new i5z0(this));
    }

    public static final void access$onVoiceStopped(OwnTalkingReporter ownTalkingReporter) {
        if (ownTalkingReporter.f) {
            ownTalkingReporter.a.log("OwnTalkingReporter", "on voice stop detected and reported");
            Listener listener = ownTalkingReporter.e;
            if (listener != null) {
                listener.onTalking(false);
            }
            ownTalkingReporter.f = false;
        }
    }

    public final void onVoiceDetected() {
        if (((Boolean) this.b.invoke()).booleanValue()) {
            if (!this.f) {
                this.a.log("OwnTalkingReporter", "on voice start detected and reported");
                Listener listener = this.e;
                if (listener != null) {
                    listener.onTalking(true);
                }
                this.f = true;
            }
            this.c.onNext(s3q0.a);
        }
    }

    public final void release() {
        this.d.dispose();
    }

    public final void setListener(Listener listener) {
        this.e = listener;
    }
}
