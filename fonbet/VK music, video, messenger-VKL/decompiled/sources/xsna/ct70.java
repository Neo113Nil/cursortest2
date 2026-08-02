package xsna;

import com.vk.music.playlist.display.audiobook.offline.presentation.feature.OfflineAudioBookChaptersMviState;
import xsna.an50;

/* compiled from: OfflineAudioBookChaptersMviStore.kt */
/* loaded from: classes3.dex */
public final class ct70 implements bt70, mm50<OfflineAudioBookChaptersMviState, us70, at70> {
    public final /* synthetic */ mm50<OfflineAudioBookChaptersMviState, us70, at70> b;

    public ct70(int i, String str, ts70 ts70Var) {
        this.b = new ql50((aqw) null, 7).a(an50.a.b(new rn8(new g5b(str, 3)), new wn8(new w53(ts70Var, i, 2), 0), new un8()));
    }

    @Override // xsna.mm50
    public final uic G(izs<? super OfflineAudioBookChaptersMviState, s3q0> izsVar) {
        return this.b.G(izsVar);
    }

    @Override // xsna.mm50
    public final uic R(izs<? super at70, s3q0> izsVar) {
        return this.b.R(izsVar);
    }

    @Override // xsna.mm50
    public final void b(us70 us70Var) {
        this.b.b(us70Var);
    }

    @Override // xsna.uic
    public final void clear() {
        this.b.clear();
    }

    @Override // xsna.mm50
    public final OfflineAudioBookChaptersMviState getCurrentState() {
        return this.b.getCurrentState();
    }
}
