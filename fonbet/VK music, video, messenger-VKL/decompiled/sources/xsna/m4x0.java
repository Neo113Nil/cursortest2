package xsna;

import com.vk.voip.OKVoipEngine;
import ru.ok.android.webrtc.media_options.MediaOptions;
import ru.ok.android.webrtc.participant.media.MuteEvent;

/* compiled from: VoipViewModel.kt */
/* loaded from: classes7.dex */
public final class m4x0 implements ys10 {
    public final /* synthetic */ io.reactivex.rxjava3.core.r<MediaOptions> a;

    public m4x0(io.reactivex.rxjava3.core.r<MediaOptions> rVar) {
        this.a = rVar;
    }

    @Override // xsna.ys10
    public final void a(MuteEvent muteEvent, boolean z) {
        io.reactivex.rxjava3.core.r<MediaOptions> rVar = this.a;
        if (rVar.h()) {
            return;
        }
        rVar.onNext(OKVoipEngine.b.getMediaOptionsForCurrentUser());
    }
}
