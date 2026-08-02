package xsna;

import ru.ok.android.webrtc.participant.talking.OwnTalkingReporter;

/* loaded from: classes8.dex */
public final class i5z0 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ OwnTalkingReporter b;

    public i5z0(OwnTalkingReporter ownTalkingReporter) {
        this.b = ownTalkingReporter;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        OwnTalkingReporter.access$onVoiceStopped(this.b);
    }
}
