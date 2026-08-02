package xsna;

import com.vk.music.bottomsheets.audiobook.AudioBookChapterBottomSheetLaunchPoint;
import com.vk.music.bottomsheets.audiobook.chapter.presentation.feature.AudioBookChapterMviState;
import xsna.an50;

/* compiled from: AudioBookChapterMviStore.kt */
/* loaded from: classes3.dex */
public final class se4 implements qe4, mm50<AudioBookChapterMviState, je4, pe4> {
    public final /* synthetic */ mm50<AudioBookChapterMviState, je4, pe4> b;

    public se4(AudioBookChapterBottomSheetLaunchPoint audioBookChapterBottomSheetLaunchPoint, ce4 ce4Var) {
        this.b = new ql50((aqw) null, 7).a(an50.a.b(new rn8(new i50(audioBookChapterBottomSheetLaunchPoint, 4)), new wn8(new yx0(ce4Var, 4), 0), new un8()));
    }

    @Override // xsna.mm50
    public final uic G(izs<? super AudioBookChapterMviState, s3q0> izsVar) {
        return this.b.G(izsVar);
    }

    @Override // xsna.mm50
    public final uic R(izs<? super pe4, s3q0> izsVar) {
        return this.b.R(izsVar);
    }

    @Override // xsna.mm50
    public final void b(je4 je4Var) {
        this.b.b(je4Var);
    }

    @Override // xsna.uic
    public final void clear() {
        this.b.clear();
    }

    @Override // xsna.mm50
    public final AudioBookChapterMviState getCurrentState() {
        return this.b.getCurrentState();
    }
}
