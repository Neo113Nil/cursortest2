package defpackage;

import androidx.compose.material3.SheetValue;
import androidx.compose.material3.w;
import androidx.compose.ui.semantics.f;
import com.yandex.go.address.models.Address;
import com.yandex.go.mainscreen.superapp.impl.fragment.a;
import com.yandex.go.taxi.summary.mobilityhub.analytics.TransitRoutesHubAnalytics$HubGeneration;
import com.yandex.xplat.payment.sdk.NetworkServiceRetryingStrategy;
import com.ybsdk.feature.savings.internal.entities.CellType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Result;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.masstransit.router.i;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes10.dex */
public final /* synthetic */ class cc2 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ cc2(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.w = obj2;
        this.x = obj3;
        this.b = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0148  */
    @Override // defpackage.tls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Address address;
        boolean z;
        List list;
        CellType cellType;
        Object[] objArr;
        ArrayList arrayList;
        CellType cellType2;
        int i = this.a;
        int i2 = 6;
        int i3 = 0;
        boolean z2 = this.b;
        zy11 zy11Var = zy11.a;
        zzs zzsVar = null;
        Object obj2 = this.x;
        Object obj3 = this.w;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                l8v l8vVar = (l8v) obj3;
                c36 c36Var = (c36) obj2;
                c1y c1yVar = (c1y) obj;
                c1yVar.a();
                k28 k28Var = c1yVar.a;
                if (((Boolean) ((sls) obj4).invoke()).booleanValue()) {
                    if (z2) {
                        long P = k28Var.P();
                        nfh nfhVar = k28Var.b;
                        long v = nfhVar.v();
                        nfhVar.q().save();
                        try {
                            ((cot) nfhVar.a).m(-1.0f, 1.0f, P);
                            k28Var.d(l8vVar, c36Var);
                        } finally {
                            b64.C(nfhVar, v);
                        }
                    } else {
                        k28Var.d(l8vVar, c36Var);
                    }
                }
                return zy11Var;
            case 1:
                uu20 uu20Var = new uu20(((rka0) obj).a, z2, (String) obj4, (String) obj3);
                qs20 qs20Var = ((bt5) obj2).e;
                return qs20Var.a.f(uu20Var, new rv10(17), NetworkServiceRetryingStrategy.retryOnce).h(new os20(qs20Var, i3)).f(new os20(qs20Var, r5));
            case 2:
                String str = (String) obj4;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                mnq0 mnq0Var = (mnq0) obj;
                if (str.length() == 0) {
                    str = str3;
                }
                r5 = (6 & 16) == 0 ? z2 ? 1 : 0 : 1;
                f.t(mnq0Var, new kk2(unr0.o("", "", str.length() == 0 ? "" : str.concat(". "), (str2 == null || str2.length() == 0) ? "" : str2.concat(". "))));
                if (r5 != 0) {
                    f.f(mnq0Var, null, new s7s0(23));
                } else {
                    f.a(mnq0Var);
                }
                return zy11Var;
            case 3:
                PointType pointType = (PointType) obj4;
                Address address2 = (Address) obj3;
                pv0 pv0Var = (pv0) obj2;
                i iVar = ((ny30) obj).a;
                int i4 = jy30.a[pointType.ordinal()];
                if (i4 != 1) {
                    if (i4 != 2) {
                        w511.b();
                        return null;
                    }
                    if (pv0Var != null && (address = pv0Var.a) != null) {
                        zzsVar = address.B();
                    }
                } else if (address2 != null) {
                    zzsVar = address2.B();
                }
                lc30 lc30Var = new lc30(pointType, pv0Var, zzsVar);
                a aVar = iVar.P().a.z0;
                q5z.h(aVar);
                iVar.E(new uw7(aVar, 1), lc30Var, new ly30(lc30Var, z2, iVar), hxx.a);
                return zy11Var;
            case 4:
                w3j0 w3j0Var = (w3j0) obj;
                ((ai50) obj4).getClass();
                ai50.b(w3j0Var, (d43) obj3);
                w3j0Var.d("type", ai50.a(z2));
                w3j0Var.a.put("button_text", ((kyx) obj2).c);
                return w3j0Var;
            case 5:
                stk0 stk0Var = (stk0) obj4;
                tls tlsVar = (tls) obj3;
                kuk0 kuk0Var = (kuk0) obj2;
                mnq0 mnq0Var2 = (mnq0) obj;
                f.l(mnq0Var2, stk0Var.f);
                Boolean valueOf = Boolean.valueOf(stk0Var.d.b);
                if (z2) {
                    f.p(mnq0Var2, 3);
                    f.f(mnq0Var2, null, new o8k0(i2, tlsVar, kuk0Var));
                }
                f.q(mnq0Var2, valueOf.booleanValue());
                return zy11Var;
            case 6:
                com.ybsdk.feature.savings.internal.screens.dashboard.a aVar2 = (com.ybsdk.feature.savings.internal.screens.dashboard.a) obj3;
                rbv rbvVar = (rbv) obj2;
                ebm0 ebm0Var = (ebm0) obj;
                boolean z3 = obj4 instanceof Result.Failure;
                iam0 iam0Var = (iam0) (z3 ? null : obj4);
                ham0 ham0Var = iam0Var != null ? iam0Var.i : null;
                iam0 iam0Var2 = (iam0) (z3 ? null : obj4);
                Throwable a = Result.a(obj4);
                if (aVar2.O && aVar2.M.a.b.a.a.getBoolean("savings_drag_and_drop_should_show_onboarding", true)) {
                    if (z3) {
                        obj4 = null;
                    }
                    iam0 iam0Var3 = (iam0) obj4;
                    if (iam0Var3 != null && (list = iam0Var3.f) != null) {
                        List<gc5> list2 = list;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            for (gc5 gc5Var : list2) {
                                cam0 cam0Var = gc5Var instanceof cam0 ? (cam0) gc5Var : null;
                                if (cam0Var == null || (cellType = cam0Var.l) == null) {
                                    scm0 scm0Var = gc5Var instanceof scm0 ? (scm0) gc5Var : null;
                                    cellType = scm0Var != null ? scm0Var.i : null;
                                }
                                if (cellType == CellType.OPENING || cellType == CellType.CLOSING) {
                                    objArr = true;
                                    arrayList = new ArrayList();
                                    for (Object obj5 : list2) {
                                        gc5 gc5Var2 = (gc5) obj5;
                                        cam0 cam0Var2 = gc5Var2 instanceof cam0 ? (cam0) gc5Var2 : null;
                                        if (cam0Var2 == null || (cellType2 = cam0Var2.l) == null) {
                                            scm0 scm0Var2 = gc5Var2 instanceof scm0 ? (scm0) gc5Var2 : null;
                                            cellType2 = scm0Var2 != null ? scm0Var2.i : null;
                                        }
                                        if (cellType2 == CellType.EXISTING) {
                                            arrayList.add(obj5);
                                        }
                                    }
                                    if (arrayList.size() >= 2 && objArr == false && iam0Var3.h.isEmpty()) {
                                        z = true;
                                        return ebm0.a(ebm0Var, null, z3, a, false, rbvVar, iam0Var2, 0, this.b, z, ham0Var, 65);
                                    }
                                }
                            }
                        }
                        objArr = false;
                        arrayList = new ArrayList();
                        while (r1.hasNext()) {
                        }
                        if (arrayList.size() >= 2) {
                            z = true;
                            return ebm0.a(ebm0Var, null, z3, a, false, rbvVar, iam0Var2, 0, this.b, z, ham0Var, 65);
                        }
                    }
                }
                z = false;
                return ebm0.a(ebm0Var, null, z3, a, false, rbvVar, iam0Var2, 0, this.b, z, ham0Var, 65);
            case 7:
                sls slsVar = (sls) obj4;
                sls slsVar2 = (sls) obj3;
                tls tlsVar2 = (tls) obj2;
                SheetValue sheetValue = (SheetValue) obj;
                boolean z4 = this.b;
                if (z4 && sheetValue == SheetValue.PartiallyExpanded) {
                    sheetValue = SheetValue.Expanded;
                }
                return new w(z4, slsVar, slsVar2, sheetValue, tlsVar2);
            case 8:
                ((set0) obj4).a(PointType.DESTINATION, (Address) obj, (SourcePicker) obj3, (ModalViewOrigin) obj2, this.b, false, false);
                return zy11Var;
            default:
                String str4 = (String) obj4;
                List list3 = (List) obj3;
                List list4 = (List) obj2;
                vw20 vw20Var = (vw20) obj;
                ww20 ww20Var = vw20Var.a;
                j2v j2vVar = vw20Var.b;
                fn6 fn6Var = ww20Var.P;
                if (fn6Var != null) {
                    f541 f541Var = new f541(str4, ww20Var.J.a.a(), TransitRoutesHubAnalytics$HubGeneration.Second.getEventValue(), list4, list3, this.b);
                    d0g d0gVar = ((c0g) ((i6r) ((n3g) fn6Var.d).m)).A.a;
                    ww20Var.D(new m541((n141) d0gVar.a.se.get(), d0gVar.b), f541Var, new sw20(ww20Var, j2vVar, i3));
                }
                return zy11Var;
        }
    }

    public /* synthetic */ cc2(Object obj, Object obj2, boolean z, Object obj3, int i) {
        this.a = i;
        this.c = obj;
        this.w = obj2;
        this.b = z;
        this.x = obj3;
    }

    public /* synthetic */ cc2(Object obj, boolean z, Object obj2, Object obj3, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
        this.w = obj2;
        this.x = obj3;
    }

    public /* synthetic */ cc2(boolean z, Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
        this.w = obj2;
        this.x = obj3;
    }
}
