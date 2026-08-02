package xsna;

import com.vk.newsfeed.impl.presenters.EntriesListPresenter;
import com.vk.search.model.VideoSearchFiltersImpl;
import com.vk.video.ui.upload.impl.publish.presentation.author.fragment.AuthorArguments;
import com.vk.video.ui.upload.impl.publish.presentation.author.fragment.AuthorModalInternalComponent;
import com.vkontakte.android.R;
import kotlin.Triple;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class cd4 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cd4(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        int i2 = 2;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((kd4) obj3).b(ne7.I(1), (androidx.compose.runtime.a) obj);
                break;
            case 1:
                AuthorModalInternalComponent.a aVar = AuthorModalInternalComponent.i;
                ((sti) obj).a(new r75((AuthorArguments) obj3, (sl50) obj2));
                break;
            case 2:
                jai jaiVar = (jai) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1653220969, intValue, -1, "com.vk.music.stickyplayer.presentation.components.BigPlayerScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (BigPlayerScaffold.kt:533)");
                    }
                    if (cq.i(0, aVar2, jaiVar)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                ny9.a((q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 4:
                ((JSONObject) obj3).put(String.valueOf(((Long) obj).longValue()), ((Long) obj2).longValue());
                break;
            case 5:
                a5n a5nVar = (a5n) obj3;
                isi isiVar = (isi) obj;
                sj50 sj50Var = (sj50) obj2;
                z3n z3nVar = a5nVar.a;
                isiVar.c = new v4n(isiVar.a(new ac0(sj50Var, z3nVar)), isiVar.a(new j3n(z3nVar, sj50Var)), isiVar.a(new yb0(sj50Var, z3nVar)), isiVar.a(new u3n(z3nVar, sj50Var, a5nVar.e)), isiVar.a(new a6n(sj50Var)));
                break;
            case 6:
                u1c0 u1c0Var = (u1c0) obj;
                u1c0Var.h = (ol60) j5g.a0(new q5w().a(0, new Triple(u1c0Var.a, u1c0Var.b, ((EntriesListPresenter) obj3).b.M0())));
                break;
            case 7:
                ((Integer) obj2).getClass();
                ((wvq) obj3).j(ne7.I(1), (androidx.compose.runtime.a) obj);
                break;
            case 8:
                f6s f6sVar = (f6s) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-274897854, intValue2, -1, "com.vk.newsfeed.common.recycler.holders.FooterComposeHolder.<anonymous> (FooterComposeHolder.kt:163)");
                    }
                    q6s j7 = f6sVar.j7();
                    if (j7 == null) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        break;
                    } else {
                        dz5.a(null, kai.c(1821993375, new fd1(i2, f6sVar, j7), aVar3), aVar3, 24576);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    }
                } else {
                    aVar3.h();
                }
                break;
            case 9:
                ((Integer) obj2).getClass();
                int i3 = c430.h1;
                ((c430) obj3).co(ne7.I(9), (androidx.compose.runtime.a) obj);
                break;
            case 10:
                hh80 hh80Var = (hh80) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(548700266, intValue3, -1, "com.vk.onboardingpromo.impl.ui.view.DotComponent.<anonymous>.<anonymous> (OnboardingPromoFullscreenSlides.kt:325)");
                    }
                    lg90 a = pg90.a(hh80Var.e ? R.drawable.vk_icon_mute_cross_16 : R.drawable.vk_icon_volume_16, 0, aVar4);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar4.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    pzu0.b(a, null, null, ylu0Var.getIcon().c, aVar4, 56, 4);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                break;
            case 11:
                fgb0 fgb0Var = (fgb0) obj3;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar5.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-576803773, intValue4, -1, "com.vk.music.stickyplayer.presentation.components.podcast.PodcastBigPlayerControls.Content.<anonymous> (PodcastBigPlayerControls.kt:39)");
                    }
                    fgb0Var.c(0, aVar5);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                break;
            default:
                tet0 tet0Var = (tet0) obj3;
                int intValue5 = ((Integer) obj).intValue();
                wh50<set0> wh50Var = tet0Var.m;
                VideoSearchFiltersImpl copy = ((set0) ((zak0) wh50Var).getValue()).copy();
                copy.i = ((Number) tet0Var.o.get(intValue5)).intValue();
                copy.m = ((ecr) obj2).getType();
                ((zak0) wh50Var).setValue(copy);
                tet0Var.B();
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ cd4(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
