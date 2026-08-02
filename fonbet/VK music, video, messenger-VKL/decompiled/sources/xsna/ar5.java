package xsna;

import com.vk.clips.design.view.interests.AvatarWithStepProgress;
import com.vk.clips.interests.impl.ui.ClipsInterestsViewState;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;

/* compiled from: AvatarController.kt */
/* loaded from: classes16.dex */
public final class ar5 extends wtt0<ClipsInterestsViewState.d> {
    public final AvatarWithStepProgress d;
    public final int e;

    public ar5(AvatarWithStepProgress avatarWithStepProgress, int i, pkn0 pkn0Var) {
        super(pkn0Var);
        this.d = avatarWithStepProgress;
        this.e = i;
    }

    @Override // xsna.wtt0
    public final void a(ClipsInterestsViewState.d dVar, ClipsInterestsViewState.d dVar2) {
        ImageSize Cb;
        String str;
        ClipsInterestsViewState.d dVar3 = dVar;
        ClipsInterestsViewState.d dVar4 = dVar2;
        ClipsInterestsViewState.a aVar = dVar4.b;
        Image image = aVar.a;
        if (!epx.f(dVar3 != null ? dVar3.b.a : null, image) && image != null && (Cb = image.Cb(this.e, true, false)) != null && (str = Cb.d.d) != null) {
            this.d.setImage(str);
        }
        if (dVar3 == null || dVar3.b.b != aVar.b) {
            this.a.execute(new zq5(0, this, dVar4));
        }
    }

    @Override // xsna.wtt0
    public final boolean b(ClipsInterestsViewState.d dVar, ClipsInterestsViewState.d dVar2) {
        ClipsInterestsViewState.d dVar3 = dVar;
        ClipsInterestsViewState.d dVar4 = dVar2;
        return (dVar3.a == dVar4.a && epx.f(dVar3.b, dVar4.b)) ? false : true;
    }
}
