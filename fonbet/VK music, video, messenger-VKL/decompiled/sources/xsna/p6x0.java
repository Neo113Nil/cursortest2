package xsna;

import com.vk.voip.OKVoipEngine;
import ru.ok.android.webrtc.media_options.MediaOptionState;
import ru.ok.android.webrtc.participant.media.MuteEvent;

/* compiled from: VoipWatchMoviePlayerController.kt */
/* loaded from: classes7.dex */
public final class p6x0 implements ys10 {
    public final /* synthetic */ io.reactivex.rxjava3.core.r<Boolean> a;

    public p6x0(io.reactivex.rxjava3.core.r<Boolean> rVar) {
        this.a = rVar;
    }

    @Override // xsna.ys10
    public final void a(MuteEvent muteEvent, boolean z) {
        this.a.onNext(Boolean.valueOf(OKVoipEngine.b.getMediaOptionsForCurrentUser().getMovieSharingState() != MediaOptionState.MUTED_PERMANENT));
    }
}
