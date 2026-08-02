package defpackage;

import androidx.compose.material3.SheetValue;
import androidx.compose.material3.l;
import androidx.compose.material3.w;
import androidx.compose.ui.semantics.a;
import androidx.compose.ui.semantics.f;
import defpackage.tje;
import java.util.ArrayList;
import kotlin.collections.EmptyList;

/* loaded from: classes14.dex */
public final /* synthetic */ class ax5 implements tls {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ ax5(bx5 bx5Var, mnz0 mnz0Var, String str, boolean z, String str2, String str3, sr4 sr4Var) {
        this.b = bx5Var;
        this.A = mnz0Var;
        this.c = str;
        this.w = z;
        this.x = str2;
        this.y = str3;
        this.z = sr4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayList] */
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str;
        Boolean bool;
        EmptyList emptyList;
        puz0 puz0Var;
        puz0 puz0Var2;
        int i = this.a;
        int i2 = 2;
        zy11 zy11Var = zy11.a;
        final int i3 = 0;
        boolean z = this.w;
        String str2 = this.c;
        Object obj2 = this.z;
        Object obj3 = this.A;
        Object obj4 = this.y;
        Object obj5 = this.b;
        Object obj6 = this.x;
        String str3 = null;
        r12 = null;
        r12 = null;
        nif nifVar = null;
        EmptyList emptyList2 = null;
        str3 = null;
        switch (i) {
            case 0:
                bx5 bx5Var = (bx5) obj5;
                break;
            case 1:
                bx5 bx5Var2 = (bx5) obj5;
                mnz0 mnz0Var = (mnz0) obj3;
                String str4 = (String) obj6;
                String str5 = (String) obj4;
                sr4 sr4Var = (sr4) obj2;
                mvv mvvVar = (mvv) obj;
                q7w q7wVar = mvvVar.b;
                bx5Var2.p.invoke(q7wVar);
                rwo rwoVar = bx5Var2.l;
                sv90 sv90Var = qv90.a;
                if (q7wVar != null && (str = q7wVar.a) != null) {
                    str3 = str;
                }
                sv90Var.getClass();
                ((y22) rwoVar).a(sv90.t(str3));
                break;
            case 2:
                final w wVar = (w) obj5;
                String str6 = (String) obj6;
                String str7 = (String) obj4;
                sls slsVar = (sls) obj3;
                final tse tseVar = (tse) obj2;
                mnq0 mnq0Var = (mnq0) obj;
                if (z) {
                    zvr zvrVar = new zvr(9, slsVar);
                    kgx[] kgxVarArr = f.a;
                    mnq0Var.a(a.v, new ag(str2, zvrVar));
                    SheetValue d = wVar.d();
                    SheetValue sheetValue = SheetValue.PartiallyExpanded;
                    if (d != sheetValue) {
                        if (wVar.e.d().c(sheetValue)) {
                            mnq0Var.a(a.u, new ag(str7, new sls() { // from class: androidx.compose.material3.m
                                @Override // defpackage.sls
                                public final Object invoke() {
                                    w wVar2 = w.this;
                                    if (((Boolean) wVar2.d.invoke(SheetValue.PartiallyExpanded)).booleanValue()) {
                                        tje.N(tseVar, null, null, new ModalBottomSheetKt$ModalBottomSheetContent$6$2$2$1$1$3$1(wVar2, null), 3);
                                    }
                                    return Boolean.TRUE;
                                }
                            }));
                            break;
                        }
                    } else {
                        mnq0Var.a(a.t, new ag(str6, new l(wVar, tseVar, wVar, i2)));
                        break;
                    }
                }
                break;
            case 3:
                xlj0 xlj0Var = (xlj0) obj5;
                final qkj0 qkj0Var = (qkj0) obj6;
                final tls tlsVar = (tls) obj4;
                final fgd fgdVar = (fgd) obj3;
                sls slsVar2 = (sls) obj2;
                mnq0 mnq0Var2 = (mnq0) obj;
                f.l(mnq0Var2, str2);
                final int i4 = 1;
                kkj0 kkj0Var = kkj0.a;
                if (xlj0Var != null) {
                    if (qkj0Var != null && !qkj0Var.equals(kkj0Var) && !(qkj0Var instanceof lkj0) && !(qkj0Var instanceof mkj0)) {
                        if (!(qkj0Var instanceof nkj0)) {
                            if (!(qkj0Var instanceof okj0)) {
                                if (!(qkj0Var instanceof pkj0)) {
                                    w511.b();
                                    break;
                                }
                            } else {
                                i2 = 3;
                            }
                        } else {
                            i2 = 1;
                        }
                    } else {
                        i2 = 0;
                    }
                    f.p(mnq0Var2, i2);
                    f.f(mnq0Var2, null, new zvr(26, slsVar2));
                }
                if (!z) {
                    f.a(mnq0Var2);
                }
                if (qkj0Var == null || qkj0Var.equals(kkj0Var) || (qkj0Var instanceof lkj0) || (qkj0Var instanceof mkj0)) {
                    bool = null;
                } else if (qkj0Var instanceof nkj0) {
                    bool = Boolean.valueOf(((nkj0) qkj0Var).a);
                } else if (qkj0Var instanceof okj0) {
                    bool = Boolean.valueOf(((okj0) qkj0Var).a);
                } else if (qkj0Var instanceof pkj0) {
                    bool = Boolean.valueOf(((pkj0) qkj0Var).a);
                } else {
                    w511.b();
                }
                if (bool != null) {
                    f.q(mnq0Var2, bool.booleanValue());
                }
                EmptyList emptyList3 = EmptyList.a;
                if (qkj0Var != null) {
                    if (qkj0Var instanceof lkj0) {
                        emptyList = scc.h(new nif(new sls() { // from class: nij0
                            @Override // defpackage.sls
                            public final Object invoke() {
                                int i5 = i3;
                                fgd fgdVar2 = fgdVar;
                                qkj0 qkj0Var2 = qkj0Var;
                                tls tlsVar2 = tlsVar;
                                switch (i5) {
                                    case 0:
                                        lkj0 lkj0Var = (lkj0) qkj0Var2;
                                        tlsVar2.invoke(lkj0Var.b);
                                        fgdVar2.a(lkj0Var.b.a());
                                        break;
                                    default:
                                        pkj0 pkj0Var = (pkj0) qkj0Var2;
                                        tlsVar2.invoke(pkj0Var.b);
                                        fgdVar2.a(pkj0Var.b.a());
                                        break;
                                }
                                return Boolean.TRUE;
                            }
                        }, ((lkj0) qkj0Var).c));
                    } else if (qkj0Var instanceof pkj0) {
                        pkj0 pkj0Var = (pkj0) qkj0Var;
                        emptyList = scc.h(pkj0Var.b != null ? new nif(new sls() { // from class: nij0
                            @Override // defpackage.sls
                            public final Object invoke() {
                                int i5 = i4;
                                fgd fgdVar2 = fgdVar;
                                qkj0 qkj0Var2 = qkj0Var;
                                tls tlsVar2 = tlsVar;
                                switch (i5) {
                                    case 0:
                                        lkj0 lkj0Var = (lkj0) qkj0Var2;
                                        tlsVar2.invoke(lkj0Var.b);
                                        fgdVar2.a(lkj0Var.b.a());
                                        break;
                                    default:
                                        pkj0 pkj0Var2 = (pkj0) qkj0Var2;
                                        tlsVar2.invoke(pkj0Var2.b);
                                        fgdVar2.a(pkj0Var2.b.a());
                                        break;
                                }
                                return Boolean.TRUE;
                            }
                        }, pkj0Var.c) : null);
                    } else if (qkj0Var instanceof mkj0) {
                        ArrayList arrayList = ((mkj0) qkj0Var).a;
                        ?? arrayList2 = new ArrayList(arrayList.size());
                        int size = arrayList.size();
                        while (i3 < size) {
                            jkj0 jkj0Var = (jkj0) arrayList.get(i3);
                            arrayList2.add(new nif(new mij0(tlsVar, jkj0Var, fgdVar, 1), jkj0Var.a.toString()));
                            i3++;
                        }
                        emptyList2 = arrayList2;
                    } else if (qkj0Var.equals(kkj0Var) || (qkj0Var instanceof nkj0) || (qkj0Var instanceof okj0)) {
                        emptyList2 = emptyList3;
                    } else {
                        w511.b();
                    }
                    emptyList2 = emptyList;
                }
                if (emptyList2 != null) {
                    emptyList3 = emptyList2;
                }
                f.m(mnq0Var2, emptyList3);
                break;
            default:
                quz0 quz0Var = (quz0) obj5;
                tls tlsVar2 = (tls) obj4;
                qm4 qm4Var = (qm4) obj3;
                mnq0 mnq0Var3 = (mnq0) obj;
                f.l(mnq0Var3, str2);
                f.q(mnq0Var3, z);
                f.p(mnq0Var3, 0);
                f.f(mnq0Var3, (String) obj6, new n7l0(17, (sls) obj2));
                nif nifVar2 = (quz0Var == null || (puz0Var2 = quz0Var.g) == null) ? null : new nif(new gyt0(25, tlsVar2, puz0Var2), quz0Var.c.a);
                if (qm4Var != null) {
                    if (!(qm4Var instanceof qm4)) {
                        w511.b();
                        break;
                    } else {
                        quz0 quz0Var2 = qm4Var.d;
                        if (quz0Var2 != null && (puz0Var = quz0Var2.g) != null) {
                            nifVar = new nif(new gyt0(25, tlsVar2, puz0Var), quz0Var2.c.a);
                        }
                    }
                }
                f.m(mnq0Var3, j73.A(new nif[]{nifVar2, nifVar}));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ ax5(bx5 bx5Var, String str, mvv mvvVar, boolean z, String str2, String str3, sr4 sr4Var) {
        this.b = bx5Var;
        this.c = str;
        this.A = mvvVar;
        this.w = z;
        this.x = str2;
        this.y = str3;
        this.z = sr4Var;
    }

    public /* synthetic */ ax5(String str, xlj0 xlj0Var, qkj0 qkj0Var, boolean z, tls tlsVar, fgd fgdVar, sls slsVar) {
        this.c = str;
        this.b = xlj0Var;
        this.x = qkj0Var;
        this.w = z;
        this.y = tlsVar;
        this.A = fgdVar;
        this.z = slsVar;
    }

    public /* synthetic */ ax5(String str, boolean z, String str2, quz0 quz0Var, tls tlsVar, qm4 qm4Var, sls slsVar) {
        this.c = str;
        this.w = z;
        this.x = str2;
        this.b = quz0Var;
        this.y = tlsVar;
        this.A = qm4Var;
        this.z = slsVar;
    }

    public /* synthetic */ ax5(boolean z, w wVar, String str, String str2, String str3, sls slsVar, tse tseVar) {
        this.w = z;
        this.b = wVar;
        this.c = str;
        this.x = str2;
        this.y = str3;
        this.A = slsVar;
        this.z = tseVar;
    }
}
