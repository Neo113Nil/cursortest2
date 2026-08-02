package xsna;

import com.vk.dto.music.Thumb;
import xsna.b78;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class uwq implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uwq(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                axq axqVar = (axq) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-540010565, intValue, -1, "com.vk.design.demo.presentation.screens.feed.FeedAvatarAnimatedStackScreenContent.AvatarAnimatedStackList.<anonymous>.<anonymous>.<anonymous> (FeedAvatarAnimatedStackScreenContent.kt:93)");
                    }
                    axqVar.j("Один аватар, текст и анимация", aVar, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                b78 b78Var = (b78) this.c;
                Thumb thumb = (Thumb) obj;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1816994399, intValue2, -1, "com.vk.music.stickyplayer.presentation.components.MiniPlayerImage.<anonymous> (MusicStandaloneBottomPlayer.kt:221)");
                }
                boolean z = b78Var instanceof b78.i;
                q630 q630Var = q630.a.a;
                if (z) {
                    q630Var = hr80.m(q630Var, l5g.d, vog0.b(6));
                }
                n750.d(thumb, rte0.d(txj0.q(q630Var, 44), vog0.b(6)), aVar2, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                break;
            case 2:
                hh80 hh80Var = (hh80) this.c;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(239679550, intValue3, -1, "com.vk.onboardingpromo.impl.ui.view.ButtonPagerComponent.<anonymous> (OnboardingPromoDefaultSlides.kt:387)");
                    }
                    ff80 ff80Var = hh80Var.d.d;
                    yqv0.c(ff80Var.b, null, pf80.h(false, ff80Var.e, aVar3), null, null, 0, 0, null, 0, false, 0, 0, null, null, aVar3, 0, 0, 16378);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            default:
                d8d0 d8d0Var = (d8d0) this.c;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if (aVar4.t(intValue4 & 1, (intValue4 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1243332471, intValue4, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlockGoodsContentImpl.ContentItems.<anonymous>.<anonymous>.<anonymous> (PrimaryBlockGoodsContentImpl.kt:141)");
                    }
                    d8d0Var.t(null, aVar4, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                break;
        }
        return s3q0.a;
    }
}
