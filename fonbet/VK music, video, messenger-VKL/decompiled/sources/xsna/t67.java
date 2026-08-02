package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import com.vk.catalog2.common.dto.api.CatalogFilterData;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class t67 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t67(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        switch (this.b) {
            case 0:
                izs izsVar = (izs) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1286487736, intValue, -1, "com.vk.biometrics.lock.impl.presentation.base.mvi.onboarding.BiometricsLockOnboardingView.MainScreen.<anonymous> (BiometricsLockOnboardingView.kt:54)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j2 = ylu0Var.getBackground().g;
                    e.a aVar2 = androidx.compose.ui.graphics.e.a;
                    q630.a aVar3 = q630.a.a;
                    q630 m = hr80.m(aVar3, j2, aVar2);
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar, 0);
                    int hashCode = Long.hashCode(n34.n(aVar));
                    sy90 D = aVar.D();
                    q630 c = qri.c(aVar, m);
                    cri.h7.getClass();
                    LayoutNode.a aVar4 = cri.a.b;
                    if (aVar.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar.H();
                    if (aVar.L()) {
                        aVar.I(aVar4);
                    } else {
                        aVar.f();
                    }
                    k9q0.w(aVar, a, cri.a.f);
                    k9q0.w(aVar, D, cri.a.e);
                    k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar, cri.a.h);
                    k9q0.w(aVar, c, cri.a.d);
                    String N = d370.N(R.string.bl_onboarding_placeholder_title, 0, aVar);
                    String N2 = d370.N(R.string.bl_onboarding_placeholder_subtitle, 0, aVar);
                    if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                        szw.a("invalid weight; must be greater than zero");
                    }
                    a87.a(N, N2, s200.E(new xpy(1.0f, true), 32, 48), null, aVar, 0, 8);
                    q630 D2 = s200.D(txj0.f(aVar3, 1.0f), 16);
                    ButtonSize buttonSize = ButtonSize.Large;
                    String N3 = d370.N(R.string.bl_onboarding_placeholder_btn, 0, aVar);
                    ButtonStyle buttonStyle = ButtonStyle.Primary;
                    ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                    boolean J = aVar.J(izsVar);
                    Object x = aVar.x();
                    if (J || x == a.C0011a.a) {
                        x = new cr0(izsVar, 1);
                        aVar.R(x);
                    }
                    bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, D2, null, false, false, null, null, null, N3, null, null, null, null, false, null, null, null, aVar, 28080, 0, 0, 4190176);
                    aVar.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                v0r v0rVar = (v0r) this.c;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar5.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(886328546, intValue2, -1, "com.vk.design.demo.presentation.screens.feed.FeedInlineCommentsScreenContent.InlineCommentsList.<anonymous>.<anonymous>.<anonymous> (FeedInlineCommentsScreenContent.kt:89)");
                    }
                    v0rVar.n("аватар + имя + текст", aVar5, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
            case 2:
                CatalogFilterData catalogFilterData = (CatalogFilterData) this.c;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (aVar6.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(452789408, intValue3, -1, "com.vk.catalog2.common.ui.mvp.holder.music.MusicSubsectionFilterButtonVh.bindData.<anonymous>.<anonymous>.<anonymous> (MusicSubsectionFilterButtonVh.kt:79)");
                    }
                    String str = catalogFilterData.c;
                    if (catalogFilterData.e) {
                        aVar6.K(-1442882173);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var2 = (ylu0) aVar6.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j = ylu0Var2.getText().m;
                        aVar6.j();
                    } else {
                        aVar6.K(-1442781919);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var3 = (ylu0) aVar6.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j = ylu0Var3.getText().p;
                        aVar6.j();
                    }
                    yqv0.c(str, null, j, null, null, 0, 0, null, 0, false, 0, 0, null, null, aVar6, 0, 0, 16378);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                return s3q0.a;
            default:
                lv90 lv90Var = (lv90) this.c;
                y4i0 y4i0Var = (y4i0) obj;
                androidx.compose.runtime.a aVar7 = (androidx.compose.runtime.a) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= aVar7.J(y4i0Var) ? 4 : 2;
                }
                if (aVar7.t(intValue4 & 1, (intValue4 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-231786957, intValue4, -1, "com.vk.search.params.impl.presentation.modal.PeopleSearchFiltersBottomSheet.GenderField.<anonymous> (PeopleSearchFiltersBottomSheet.kt:224)");
                    }
                    String N4 = d370.N(R.string.vk_discover_search_gender_any, 0, aVar7);
                    f1m f1mVar = lv90Var.n1;
                    boolean z = ((Number) f1mVar.getValue()).intValue() == 0;
                    q630.a aVar8 = q630.a.a;
                    q630 E = ahn.E(aVar8, "people_search_filters_gender_any");
                    boolean y = aVar7.y(lv90Var);
                    Object x2 = aVar7.x();
                    Object obj4 = a.C0011a.a;
                    if (y || x2 == obj4) {
                        x2 = new f550(lv90Var, 11);
                        aVar7.R(x2);
                    }
                    gzs gzsVar = (gzs) x2;
                    int i = (intValue4 & 14) | 3072;
                    lv90Var.io(y4i0Var, N4, z, E, gzsVar, aVar7, i);
                    String N5 = d370.N(R.string.vk_discover_search_gender_female, 0, aVar7);
                    boolean z2 = ((Number) f1mVar.getValue()).intValue() == 1;
                    q630 E2 = ahn.E(aVar8, "people_search_filters_gender_female");
                    boolean y2 = aVar7.y(lv90Var);
                    Object x3 = aVar7.x();
                    if (y2 || x3 == obj4) {
                        x3 = new f5x(lv90Var, 25);
                        aVar7.R(x3);
                    }
                    lv90Var.io(y4i0Var, N5, z2, E2, (gzs) x3, aVar7, i);
                    String N6 = d370.N(R.string.vk_discover_search_gender_male, 0, aVar7);
                    boolean z3 = ((Number) f1mVar.getValue()).intValue() == 2;
                    q630 E3 = ahn.E(aVar8, "people_search_filters_gender_male");
                    boolean y3 = aVar7.y(lv90Var);
                    Object x4 = aVar7.x();
                    if (y3 || x4 == obj4) {
                        x4 = new yu60(lv90Var, 6);
                        aVar7.R(x4);
                    }
                    lv90Var.io(y4i0Var, N6, z3, E3, (gzs) x4, aVar7, i);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar7.h();
                }
                return s3q0.a;
        }
    }
}
