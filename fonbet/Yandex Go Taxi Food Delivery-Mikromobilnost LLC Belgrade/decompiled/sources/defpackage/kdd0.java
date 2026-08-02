package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.os.Looper;
import android.view.ContextThemeWrapper;
import com.yandex.go.scooters.photocontrol.api.ScootersExamType;
import com.yandex.go.scooters.photocontrol.camera_ui.photo_result.c;
import com.yandex.go.scooters.photocontrol.camera_ui.photo_result.d;
import com.yandex.go.taxi.summary.api.analytics.SummaryExpandReason;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.a;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.preorder.tollroad.analytics.TollRoadDialogAnalytics$Button;
import ru.yandex.taxi.preorder.tollroad.analytics.TollRoadDialogAnalytics$CloseReason;
import ru.yandex.taxi.preorder.tollroad.analytics.TollRoadSetReason;
import ru.yandex.taxi.preorder.tollroad.compose.navigation.b;
import ru.yandex.taxi.requirements.ListItemType;
import ru.yandex.taxi.requirements.analytics.RequirementRemoveSource;
import ru.yandex.taxi.requirements.interactor.ChangeRequirementCounterInteractor$RequirementChangeType;
import ru.yandex.taxi.summary.requirements.list.models.RequirementsDueViewPosition;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes14.dex */
public final class kdd0 implements ziy {
    public Object a;
    public Object b;
    public Object c;
    public Object d;

    public kdd0(fes0 fes0Var, fes0 fes0Var2, PorterDuff.Mode mode) {
        this.a = fes0Var;
        this.b = fes0Var2;
        this.d = mode;
        this.c = a.a(new r0d0(15, this));
    }

    public static ArrayList i(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new dij0((anx0) it.next(), false, false));
        }
        return arrayList;
    }

    public static String k(String str) {
        Map map = kko0.a;
        String g0 = evu0.g0(str, ":", str);
        String d0 = evu0.d0(str, ":", str);
        String str2 = (String) kko0.a.get(g0);
        if (str2 != null) {
            g0 = str2;
        }
        return g8e.p(g0, ":", d0);
    }

    @Override // defpackage.ziy
    public void a(int i, int i2) {
        float f = i;
        float f2 = i2;
        ((fes0) this.a).e(f, f2);
        ((fes0) this.b).e(f, f2);
    }

    @Override // defpackage.ziy
    public Shader b() {
        return (Shader) ((i3y) this.c).getValue();
    }

    public c c(ScootersExamType scootersExamType, Set set, iio0 iio0Var) {
        Context context = (Context) this.a;
        fva0 fva0Var = (fva0) this.b;
        ljo0 b = ((vr) this.c).b(scootersExamType);
        uio0 uio0Var = ((vio0) this.d).a;
        return new c(context, fva0Var, b, new d((tt2) ((e7g) uio0Var.c).get(), (e2e0) ((xvf0) uio0Var.a).get(), (e) ((xvf0) uio0Var.b).get(), (krl0) ((mam0) uio0Var.e).get(), (aio0) ((mbo0) uio0Var.f).get(), (ijo0) ((xvf0) uio0Var.d).get(), scootersExamType, set, iio0Var));
    }

    public Object d(iej0 iej0Var, oiv0 oiv0Var, SuspendLambda suspendLambda) {
        ff9 ff9Var = (ff9) this.b;
        if (iej0Var instanceof bej0) {
            bej0 bej0Var = (bej0) iej0Var;
            oiv0Var.o(bej0Var.b, bej0Var.a);
        } else if (iej0Var instanceof eej0) {
            oiv0Var.q();
        } else if (iej0Var instanceof fej0) {
            oiv0Var.g();
        } else if (iej0Var instanceof cej0) {
            cej0 cej0Var = (cej0) iej0Var;
            ((hf9) ff9Var).a(cej0Var.a, cej0Var.b, ChangeRequirementCounterInteractor$RequirementChangeType.DECREMENT);
        } else if (iej0Var instanceof dej0) {
            dej0 dej0Var = (dej0) iej0Var;
            ((hf9) ff9Var).a(dej0Var.a, dej0Var.b, ChangeRequirementCounterInteractor$RequirementChangeType.INCREMENT);
        } else {
            if (iej0Var instanceof gej0) {
                gej0 gej0Var = (gej0) iej0Var;
                p(gej0Var.a, gej0Var.b);
                return ((pev0) this.c).a(new gdv0(SummaryExpandReason.AUTO_REMOVE_ALT_CHOICE_BUBBLE_CLICK), suspendLambda);
            }
            if (!(iej0Var instanceof hej0)) {
                w511.b();
                return null;
            }
            hej0 hej0Var = (hej0) iej0Var;
            p(hej0Var.a, hej0Var.b);
        }
        return zy11.a;
    }

    public void e(kuk0 kuk0Var, ztk0 ztk0Var) {
        ru.yandex.taxi.preorder.tollroad.data.e eVar = (ru.yandex.taxi.preorder.tollroad.data.e) this.a;
        tqz0 tqz0Var = (tqz0) this.d;
        teh tehVar = (teh) this.b;
        if (kuk0Var instanceof fuk0) {
            eVar.e(false, TollRoadSetReason.OPTION_SELECTED);
            tehVar.z(false);
            tehVar.u(TollRoadDialogAnalytics$Button.SELECT_ROUTE);
            return;
        }
        if (kuk0Var instanceof juk0) {
            eVar.e(true, TollRoadSetReason.OPTION_SELECTED);
            tehVar.z(true);
            tehVar.u(TollRoadDialogAnalytics$Button.SELECT_ROUTE);
            return;
        }
        int i = 9;
        if (kuk0Var instanceof huk0) {
            tqz0Var.n();
            tehVar.u(TollRoadDialogAnalytics$Button.DONE);
            tehVar.s(TollRoadDialogAnalytics$CloseReason.DONE);
            ((buk0) ztk0Var).a.r(new qu(i));
            return;
        }
        if (kuk0Var instanceof cuk0) {
            tehVar.u(TollRoadDialogAnalytics$Button.ANDROID_BACK_BUTTON);
            tehVar.s(TollRoadDialogAnalytics$CloseReason.ANDROID_BACK_BUTTON);
            tqz0Var.o();
            ((buk0) ztk0Var).a.r(new qu(i));
            return;
        }
        if (kuk0Var instanceof iuk0) {
            tehVar.s(TollRoadDialogAnalytics$CloseReason.ROLL_OFF);
            tqz0Var.o();
            ((buk0) ztk0Var).a.r(new qu(i));
            return;
        }
        if (kuk0Var instanceof guk0) {
            tehVar.s(TollRoadDialogAnalytics$CloseReason.MAP_TAPPED);
            tqz0Var.o();
            ((buk0) ztk0Var).a.r(new qu(i));
            return;
        }
        if (kuk0Var instanceof euk0) {
            xtk0 xtk0Var = (xtk0) this.c;
            euk0 euk0Var = (euk0) kuk0Var;
            xtk0Var.a.F8(euk0Var.a, euk0Var.b, xtk0Var.b);
            return;
        }
        if (kuk0Var instanceof duk0) {
            String str = ((duk0) kuk0Var).a;
            buk0 buk0Var = (buk0) ztk0Var;
            buk0Var.getClass();
            CoreWebViewConfig.a aVar = new CoreWebViewConfig.a();
            aVar.b = str;
            aVar.h = true;
            aVar.i = true;
            aVar.j = true;
            UiWebViewConfig uiWebViewConfig = new UiWebViewConfig(aVar.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194302, null);
            b bVar = buk0Var.a;
            bVar.A((m950) bVar.K.get(), uiWebViewConfig, sy60.Q2);
        }
    }

    public d3u f(d3u d3uVar, Map map) {
        hij0 hij0Var;
        cjw0 cjw0Var;
        hij0 hij0Var2;
        cjw0 cjw0Var2;
        zkz0 zkz0Var = (zkz0) this.d;
        ArrayList<List> arrayList = d3uVar.b;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        for (List<Object> list : arrayList) {
            ArrayList arrayList3 = new ArrayList(tcc.n(list, 10));
            for (Object obj : list) {
                if ((obj instanceof hij0) && (cjw0Var2 = (hij0Var2 = (hij0) obj).b) != null) {
                    Boolean bool = (Boolean) map.get(hij0Var2.a.a);
                    if (!(bool != null ? bool.booleanValue() : zkz0Var.a(hij0Var2))) {
                        cjw0Var2 = null;
                    }
                    obj = hij0.m(hij0Var2, cjw0Var2, false, false, 29);
                }
                arrayList3.add(obj);
            }
            arrayList2.add(arrayList3);
        }
        ArrayList<Object> arrayList4 = d3uVar.c;
        ArrayList arrayList5 = new ArrayList(tcc.n(arrayList4, 10));
        for (Object obj2 : arrayList4) {
            if ((obj2 instanceof hij0) && (cjw0Var = (hij0Var = (hij0) obj2).b) != null) {
                Boolean bool2 = (Boolean) map.get(hij0Var.a.a);
                if (!(bool2 != null ? bool2.booleanValue() : zkz0Var.a(hij0Var))) {
                    cjw0Var = null;
                }
                obj2 = hij0.m(hij0Var, cjw0Var, false, false, 29);
            }
            arrayList5.add(obj2);
        }
        return new d3u(d3uVar.a, arrayList2, arrayList5);
    }

    public d3u g(ygj0 ygj0Var, cxu0 cxu0Var) {
        gij0 gij0Var;
        mhx0 jij0Var;
        boolean z;
        ListBuilder listBuilder;
        gij0 gij0Var2;
        mhx0 jij0Var2;
        Context context = (Context) this.a;
        List list = ygj0Var.b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean z2 = false;
            int i = 10;
            if (!it.hasNext()) {
                List list2 = ygj0Var.b;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list2) {
                    if (obj instanceof qwz0) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ArrayList<apj0> arrayList4 = ((qwz0) it2.next()).a;
                    if (cxu0Var == null) {
                        gij0Var = null;
                    } else {
                        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, cxu0Var.b);
                        gij0Var = new gij0(qje.u(contextThemeWrapper.getTheme(), xng0.controlMinor), qje.u(contextThemeWrapper.getTheme(), xng0.controlMain));
                    }
                    ListBuilder a = rcc.a();
                    ArrayList arrayList5 = new ArrayList(tcc.n(arrayList4, i));
                    for (apj0 apj0Var : arrayList4) {
                        cjw0 j = j(apj0Var);
                        int i2 = sij0.a[((apj0Var.f != null || apj0Var.g) ? ListItemType.USUAL : ListItemType.TOGGLE).ordinal()];
                        if (i2 == 1) {
                            z = false;
                            jij0Var = new jij0(apj0Var, false, false);
                        } else {
                            if (i2 != 2) {
                                w511.b();
                                return null;
                            }
                            jij0Var = new hij0(apj0Var, j, gij0Var);
                            z = false;
                        }
                        arrayList5.add(jij0Var);
                        z2 = z;
                    }
                    a.addAll(arrayList5);
                    ycc.r(a.j(), arrayList3);
                    z2 = z2;
                    i = 10;
                }
                return new d3u(ygj0Var.a, arrayList, arrayList3);
            }
            wgj0 wgj0Var = (wgj0) it.next();
            if (wgj0Var instanceof cqj0) {
                cqj0 cqj0Var = (cqj0) wgj0Var;
                if (cxu0Var == null) {
                    gij0Var2 = null;
                } else {
                    ContextThemeWrapper contextThemeWrapper2 = new ContextThemeWrapper(context, cxu0Var.b);
                    gij0Var2 = new gij0(qje.u(contextThemeWrapper2.getTheme(), xng0.controlMinor), qje.u(contextThemeWrapper2.getTheme(), xng0.controlMain));
                }
                ListBuilder a2 = rcc.a();
                String str = cqj0Var.a;
                yhj0 yhj0Var = str.length() > 0 ? new yhj0(str) : null;
                if (yhj0Var != null) {
                    a2.add(yhj0Var);
                }
                List list3 = cqj0Var.b;
                ArrayList arrayList6 = new ArrayList(tcc.n(list3, 10));
                int i3 = 0;
                for (Object obj2 : list3) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        scc.m();
                        throw null;
                    }
                    apj0 apj0Var2 = (apj0) obj2;
                    cjw0 j2 = j(apj0Var2);
                    int i5 = sij0.a[((apj0Var2.f != null || apj0Var2.g) ? ListItemType.USUAL : ListItemType.TOGGLE).ordinal()];
                    if (i5 == 1) {
                        jij0Var2 = new jij0(apj0Var2, false, false);
                    } else {
                        if (i5 != 2) {
                            w511.b();
                            return null;
                        }
                        jij0Var2 = new hij0(apj0Var2, j2, gij0Var2);
                    }
                    arrayList6.add(jij0Var2);
                    i3 = i4;
                }
                a2.addAll(arrayList6);
                listBuilder = a2.j();
            } else {
                if (!(wgj0Var instanceof lx8) && !(wgj0Var instanceof qwz0)) {
                    w511.b();
                    return null;
                }
                listBuilder = null;
            }
            if (listBuilder != null) {
                arrayList.add(listBuilder);
            }
        }
    }

    public List h(z5s0 z5s0Var, n470 n470Var, ioj0 ioj0Var, g9w g9wVar, cw70 cw70Var, y4p y4pVar, ct01 ct01Var) {
        zuj0 zuj0Var = (zuj0) this.c;
        return j73.A(new kij0[]{ct01Var.d ? new iij0(ct01Var.a, ct01Var.b, ct01Var.c, ((avj0) zuj0Var).h(kyh0.common_remove), ct01Var.e, false, false) : null, z5s0Var.a.length() > 0 ? new vhj0(z5s0Var, false, false) : null, n470Var.a.length() > 0 ? new whj0(n470Var, false, false) : null, null, (ioj0Var.a.length() <= 0 || ioj0Var.g != RequirementsDueViewPosition.DEFAULT) ? null : new aij0(ioj0Var, ioj0Var.h, false, false), g9wVar != null ? new zhj0(g9wVar, ((avj0) zuj0Var).h(kyh0.common_remove), false, false) : null, cw70Var.a.length() > 0 ? new bij0(cw70Var, ((avj0) zuj0Var).h(kyh0.common_remove), false, false) : null, y4pVar.a.length() > 0 ? new xhj0(y4pVar, ((avj0) zuj0Var).h(kyh0.common_remove), false, false) : null});
    }

    public cjw0 j(apj0 apj0Var) {
        pdc pdcVar = (pdc) this.b;
        idj0 idj0Var = apj0Var.h;
        gdj0 gdj0Var = idj0Var != null ? idj0Var.a.b : null;
        if (gdj0Var == null) {
            return null;
        }
        ufu ufuVar = (ufu) pdcVar;
        return new cjw0(gdj0Var.a, ufuVar.i(gdj0Var.c), ufuVar.b(gdj0Var.b));
    }

    public long l(String str) {
        String a = kko0.a(str);
        qwo0 qwo0Var = (qwo0) this.c;
        long j = qwo0Var.a.j(a, 0L);
        if (j > 0) {
            return j;
        }
        Number number = (Number) ((sls) this.b).invoke();
        qwo0Var.a.q(number.longValue(), a);
        return number.longValue();
    }

    public void m(String str) {
        x770 x770Var = (x770) this.a;
        String str2 = ((o2y0) this.d).b().a;
        if (str == null || str.length() <= 0) {
            str = null;
        }
        HashMap p = x4e.p("order_id", str2);
        if (str != null) {
            p.put("pricing_message", str);
        }
        x770Var.a.a("PriceChangeCard.CancelButtonTapped", p, 2, new HashMap());
    }

    public void n(String str) {
        x770 x770Var = (x770) this.a;
        x770Var.a.a("PriceChangeCard.ConfirmButtonTapped", g8e.u("order_id", ((o2y0) this.d).b().a, "pricing_message", str), 2, new HashMap());
    }

    public void o(String str) {
        synchronized (this.d) {
            cne0 cne0Var = ((qwo0) this.c).a;
            cne0Var.t("polling_execution_ids", v4r0.f(cne0Var.n("polling_execution_ids"), str));
        }
        ((qwo0) this.c).a.w(kko0.a(str));
    }

    public void p(String str, String str2) {
        ((f580) this.d).e(str, evu0.J(str2) ? EmptyList.a : Collections.singletonList(str2), RequirementRemoveSource.BUBBLE, null);
        ((yjj0) ((bxi0) this.a)).a(str, str2, null, "");
    }

    public void q(float f) {
        ((fes0) this.a).f(f);
        ((fes0) this.b).f(f);
    }

    public void r(float f) {
        ((fes0) this.a).g(f);
        ((fes0) this.b).g(f);
    }

    public /* synthetic */ kdd0(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public kdd0(n5t0 n5t0Var, naz0 naz0Var, vcz0 vcz0Var, fw10 fw10Var) {
        this.a = n5t0Var;
        this.b = naz0Var;
        this.c = fw10Var;
        this.d = Looper.myLooper();
    }
}
