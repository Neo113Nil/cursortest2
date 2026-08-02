package xsna;

import android.text.TextUtils;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.X3;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.core.preference.Preference;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.search.params.impl.presentation.modal.education.mvi.model.EducationState;
import com.vk.search.params.impl.presentation.modal.education.mvi.model.d;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.cri;
import xsna.dt1;
import xsna.kyl;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class mog implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mog(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15 */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        byte b;
        List O0;
        int i = this.b;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        byte b2 = 0;
        b2 = 0;
        Object obj3 = this.d;
        Object obj4 = this.c;
        int i2 = 1;
        switch (i) {
            case 0:
                UIBlockList uIBlockList = (UIBlockList) obj;
                com.vk.movika.tools.controls.seekbar.m mVar = new com.vk.movika.tools.controls.seekbar.m(4, (nog) obj4, (wzd0) obj3);
                for (UIBlock uIBlock : uIBlockList.y) {
                    mVar.invoke(uIBlockList, uIBlock);
                    if (uIBlock instanceof UIBlockList) {
                        o19.w((UIBlockList) uIBlock, mVar);
                    }
                }
                return uIBlockList;
            case 1:
                ((Integer) obj2).getClass();
                ((boj) obj4).a((mnj) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 2:
                DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) obj4;
                String str = (String) obj3;
                CharSequence charSequence = (CharSequence) obj2;
                String[] strArr = DebugDevSettingsFragment.t0;
                if (TextUtils.isEmpty(charSequence)) {
                    ?? r1 = !str.equals("5.285");
                    o2l.a.getClass();
                    Preference.i().edit().putString(X3.s, "5.285").apply();
                    b = r1;
                } else {
                    String charSequence2 = charSequence.toString();
                    if (charSequence2.matches("^\\d+\\.\\d+$") && !charSequence2.equals("5.285")) {
                        b2 = 1;
                    }
                    o2l.a.getClass();
                    Preference.i().edit().putString(X3.s, charSequence2).apply();
                    b = b2;
                }
                if (b != false) {
                    debugDevSettingsFragment.ko();
                }
                return null;
            case 3:
                izs izsVar = (izs) obj4;
                mtk0 mtk0Var = (mtk0) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-250942811, intValue, -1, "com.vk.ecomm.cart.impl.points_map.ui.compose.DeliveryPointsMapScreenContent.<anonymous>.<anonymous> (DeliveryPointsMapScreen.kt:76)");
                    }
                    eyl.a(izsVar, ((kyl.c) mtk0Var.getValue()).d, ((kyl.c) mtk0Var.getValue()).e, null, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 4:
                ((Integer) obj2).getClass();
                vzo.b((euc) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 5:
                r7p r7pVar = (r7p) obj4;
                izs izsVar2 = (izs) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-550794071, intValue2, -1, "com.vk.search.params.impl.presentation.modal.education.view.EducationFilterBottomSheetContent.Content.<anonymous> (EducationFilterBottomSheetContent.kt:54)");
                    }
                    zak0 zak0Var = (zak0) r7pVar.e.e;
                    d.b bVar = (d.b) zak0Var.getValue();
                    if (bVar instanceof d.b.a) {
                        aVar2.K(-1930862498);
                        d.b.a aVar3 = (d.b.a) ((d.b) zak0Var.getValue());
                        yzt0<EducationState.InstitutionType> yzt0Var = aVar3.a;
                        Object obj5 = EducationState.InstitutionType.SCHOOL;
                        wh50 d = jk50.d(yzt0Var, obj5, aVar2, 48);
                        wh50 c = jk50.c(aVar3.b, aVar2);
                        wh50 c2 = jk50.c(aVar3.c, aVar2);
                        wh50 c3 = jk50.c(aVar3.d, aVar2);
                        wh50 a = jk50.a(aVar3.e, aVar2, 0, 3);
                        wh50 c4 = jk50.c(aVar3.f, aVar2);
                        a.m mVar2 = androidx.compose.foundation.layout.a.c;
                        dt1.a.getClass();
                        androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar2, dt1.a.n, aVar2, 0);
                        int hashCode = Long.hashCode(n34.n(aVar2));
                        sy90 D = aVar2.D();
                        q630.a aVar4 = q630.a.a;
                        q630 c5 = qri.c(aVar2, aVar4);
                        cri.h7.getClass();
                        LayoutNode.a aVar5 = cri.a.b;
                        if (aVar2.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar2.H();
                        if (aVar2.L()) {
                            aVar2.I(aVar5);
                        } else {
                            aVar2.f();
                        }
                        k9q0.w(aVar2, a2, cri.a.f);
                        k9q0.w(aVar2, D, cri.a.e);
                        k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
                        k9q0.t(aVar2, cri.a.h);
                        k9q0.w(aVar2, c5, cri.a.d);
                        String N = d370.N(R.string.search_params_institution_type_school, 0, aVar2);
                        String N2 = d370.N(R.string.search_params_institution_type_university, 0, aVar2);
                        boolean z = d.getValue() == obj5;
                        boolean J = aVar2.J(izsVar2);
                        Object x = aVar2.x();
                        if (J || x == c0012a) {
                            x = new zsa(izsVar2, i2);
                            aVar2.R(x);
                        }
                        a8p.e(0, aVar2, N, N2, (izs) x, z);
                        String N3 = d370.N(R.string.search_params_city_title, 0, aVar2);
                        String str2 = (String) ((d.a) c.getValue()).a;
                        String N4 = d370.N(R.string.search_params_city_not_selected, 0, aVar2);
                        boolean J2 = aVar2.J(izsVar2);
                        Object x2 = aVar2.x();
                        int i3 = 6;
                        if (J2 || x2 == c0012a) {
                            x2 = new tq0(izsVar2, i3);
                            aVar2.R(x2);
                        }
                        a8p.d(N3, str2, N4, (gzs) x2, aVar2, 0);
                        String N5 = d370.N(R.string.search_params_education_institution_title, 0, aVar2);
                        String str3 = (String) ((d.a) c2.getValue()).a;
                        String N6 = d370.N(R.string.search_params_institution_not_selected, 0, aVar2);
                        boolean z2 = ((d.a) c2.getValue()).b;
                        boolean J3 = aVar2.J(izsVar2);
                        Object x3 = aVar2.x();
                        if (J3 || x3 == c0012a) {
                            x3 = new a97(izsVar2, 4);
                            aVar2.R(x3);
                        }
                        a8p.c(0, aVar2, N5, str3, N6, (gzs) x3, z2);
                        String N7 = d370.N(R.string.search_params_education_year_title, 0, aVar2);
                        Integer num = (Integer) ((d.a) c3.getValue()).a;
                        String N8 = d370.N(R.string.search_params_date_not_selected, 0, aVar2);
                        List singletonList = Collections.singletonList(0);
                        k9x k9xVar = (k9x) a.getValue();
                        ArrayList u0 = j5g.u0((k9xVar == null || (O0 = j5g.O0(k9xVar)) == null) ? EmptyList.b : O0, singletonList);
                        boolean z3 = ((d.a) c3.getValue()).b;
                        boolean J4 = aVar2.J(izsVar2);
                        Object x4 = aVar2.x();
                        if (J4 || x4 == c0012a) {
                            x4 = new shf(izsVar2, i2, b2);
                            aVar2.R(x4);
                        }
                        a8p.g(N7, num, N8, u0, (wzs) x4, z3, aVar2, 0);
                        f9t.e(txj0.h(aVar4, 20), aVar2, 6);
                        String N9 = d370.N(R.string.search_params_apply_button, 0, aVar2);
                        boolean booleanValue = ((Boolean) c4.getValue()).booleanValue();
                        boolean J5 = aVar2.J(izsVar2);
                        Object x5 = aVar2.x();
                        if (J5 || x5 == c0012a) {
                            x5 = new wq0(izsVar2, 3);
                            aVar2.R(x5);
                        }
                        a8p.a(N9, booleanValue, (gzs) x5, aVar2, 0);
                        aVar2.G();
                        aVar2.j();
                    } else {
                        if (!(bVar instanceof d.b.C1771b)) {
                            throw alb0.c(-1032119322, aVar2);
                        }
                        aVar2.K(-1927550427);
                        a8p.b(0, aVar2);
                        aVar2.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 6:
                ((Integer) obj2).getClass();
                ((kpv) obj4).c((q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 7:
                ((Integer) obj2).getClass();
                fg70.e((dg70) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            default:
                izs izsVar3 = (izs) obj4;
                wh50 wh50Var = (wh50) obj3;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar6.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1469666288, intValue3, -1, "com.vk.design.demo.presentation.components.SupportedThemesTopBar.<anonymous> (SupportedThemesTopBar.kt:87)");
                    }
                    boolean J6 = aVar6.J(izsVar3);
                    Object x6 = aVar6.x();
                    if (J6 || x6 == c0012a) {
                        x6 = new z1m(izsVar3, wh50Var, i2);
                        aVar6.R(x6);
                    }
                    jjn0.d((izs) x6, aVar6, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ mog(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}
