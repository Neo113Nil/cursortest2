package xsna;

import androidx.compose.runtime.a;
import com.vk.catalog2.common.ui.mvp.holder.container.FirstPinnedTabLayoutVh;
import com.vk.core.preference.Preference;
import com.vk.draftslist.impl.ui.DraftsListFragment;
import com.vk.im.edu.ui.compose.item.ThreeButtonsItemView;
import com.vk.im.settings.DarkThemeTimetableFragment;
import kotlin.NoWhenBranchMatchedException;
import xsna.rpq;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class f9h implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f9h(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        int i2 = 0;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((g9h) obj3).c.x(((Integer) obj).intValue());
                return s3q0.a;
            case 1:
                vpi vpiVar = (vpi) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                int i3 = vpi.f1;
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-380463620, intValue, -1, "com.vk.core.compose.modal.ComposeModalBottomSheet.prepareMainContent.<anonymous> (ComposeModalBottomSheet.kt:39)");
                    }
                    vpiVar.Zn(0, aVar);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 2:
                DarkThemeTimetableFragment darkThemeTimetableFragment = (DarkThemeTimetableFragment) obj3;
                int intValue2 = ((Integer) obj).intValue();
                int intValue3 = ((Integer) obj2).intValue();
                nyo0 nyo0Var = darkThemeTimetableFragment.P;
                if (nyo0Var == null) {
                    nyo0Var = null;
                }
                nyo0Var.getClass();
                Preference.F(intValue2, "THEME_TIMETABLE", "HOUR_END");
                nyo0 nyo0Var2 = darkThemeTimetableFragment.P;
                (nyo0Var2 != null ? nyo0Var2 : null).getClass();
                Preference.F(intValue3, "THEME_TIMETABLE", "MINUTE_END");
                darkThemeTimetableFragment.eo();
                dhr0.j(dhr0.a, darkThemeTimetableFragment.kn());
                return s3q0.a;
            case 3:
                DraftsListFragment draftsListFragment = (DraftsListFragment) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                qcy<Object>[] qcyVarArr = DraftsListFragment.Q;
                if (aVar2.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1597200006, intValue4, -1, "com.vk.draftslist.impl.ui.DraftsListFragment.ScreenContent.<anonymous> (DraftsListFragment.kt:103)");
                    }
                    boolean J = aVar2.J(draftsListFragment);
                    Object x = aVar2.x();
                    if (J || x == c0012a) {
                        x = new udo(draftsListFragment, i2);
                        aVar2.R(x);
                    }
                    izs izsVar = (izs) x;
                    boolean J2 = aVar2.J(draftsListFragment);
                    Object x2 = aVar2.x();
                    if (J2 || x2 == c0012a) {
                        x2 = new vdo(draftsListFragment, null);
                        aVar2.R(x2);
                    }
                    r37.a(izsVar, (yzs) x2, efi.a, aVar2, 384, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 4:
                cqq cqqVar = (cqq) obj3;
                rui ruiVar = (rui) obj;
                nn50 nn50Var = (nn50) obj2;
                final f64 a = ruiVar.a(new gpq(cqqVar, nn50Var));
                es60 es60Var = cqqVar.m;
                cpq cpqVar = cqqVar.k;
                final f64 a2 = ruiVar.a(new x5o0(es60Var, cpqVar, nn50Var));
                final f64 a3 = ruiVar.a(new dpq(es60Var, cpqVar, nn50Var));
                final f64 a4 = ruiVar.a(new y5o0(es60Var, cpqVar, nn50Var));
                final f64 a5 = ruiVar.a(new b6o0(es60Var, cpqVar, nn50Var));
                final f64 a6 = ruiVar.a(new apq(es60Var, cpqVar, nn50Var));
                final f64 a7 = ruiVar.a(new epq(es60Var, nn50Var));
                final f64 a8 = ruiVar.a(new a6o0(es60Var, cpqVar, nn50Var));
                final f64 a9 = ruiVar.a(new bpq(es60Var, cpqVar, nn50Var));
                ruiVar.b = new wzs() { // from class: xsna.npq
                    @Override // xsna.wzs
                    public final Object invoke(Object obj4, Object obj5) {
                        qk50 qk50Var = (qk50) obj4;
                        rpq rpqVar = (rpq) obj5;
                        if (rpqVar instanceof rpq.c) {
                            return qk50Var.a(f64.this, rpqVar);
                        }
                        if (rpqVar instanceof tpq) {
                            return qk50Var.a(a2, rpqVar);
                        }
                        if (rpqVar instanceof vpq) {
                            return qk50Var.a(a3, rpqVar);
                        }
                        if (rpqVar instanceof spq) {
                            return qk50Var.a(a9, rpqVar);
                        }
                        if (rpqVar instanceof upq) {
                            return qk50Var.a(a4, rpqVar);
                        }
                        if (rpqVar instanceof wpq) {
                            return qk50Var.a(a5, rpqVar);
                        }
                        if (rpqVar instanceof rpq.a) {
                            return qk50Var.a(a6, rpqVar);
                        }
                        if (rpqVar instanceof xpq) {
                            return qk50Var.a(a8, rpqVar);
                        }
                        if (rpqVar instanceof rpq.b) {
                            return qk50Var.a(a7, rpqVar);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                };
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                ((tyq) obj3).f(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 6:
                ((Integer) obj).intValue();
                Integer num = (Integer) obj2;
                num.intValue();
                ((FirstPinnedTabLayoutVh) obj3).q = num;
                return s3q0.a;
            case 7:
                ((Integer) obj2).getClass();
                ((yct) obj3).co(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 8:
                ((Integer) obj2).getClass();
                rlu.a((gzs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 9:
                ((ohb0) obj3).Y6(((Boolean) obj).booleanValue());
                return s3q0.a;
            case 10:
                float floatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                ((vak0) ((zfe0) obj3).e).g(floatValue);
                return s3q0.a;
            case 11:
                e64 e64Var = (e64) obj3;
                em50 em50Var = (em50) obj;
                t4n0 t4n0Var = (t4n0) obj2;
                if (t4n0Var instanceof s4n0) {
                    return em50Var.a(e64Var, t4n0Var);
                }
                throw new NoWhenBranchMatchedException();
            case 12:
                return ThreeButtonsItemView.z((ThreeButtonsItemView) obj3, (androidx.compose.runtime.a) obj, ((Integer) obj2).intValue());
            default:
                com.vk.core.compose.component.datetime.g gVar = (com.vk.core.compose.component.datetime.g) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue5 & 1, (intValue5 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(135313239, intValue5, -1, "com.vk.core.compose.component.datetime.VkDateRangePickerDialog.<anonymous>.<anonymous> (VkDateRangePicker.kt:94)");
                    }
                    boolean J3 = aVar3.J(gVar);
                    Object x3 = aVar3.x();
                    if (J3 || x3 == c0012a) {
                        x3 = new fem0(gVar, 11);
                        aVar3.R(x3);
                    }
                    bqv0.e((gzs) x3, aVar3, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ f9h(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
