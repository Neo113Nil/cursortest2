package xsna;

import com.vk.log.L;
import com.vk.search.params.api.SearchParams;
import com.vk.search.ui.api.SearchInputMethod;
import com.vk.search.ui.api.SearchQuery;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;
import xsna.b9q0;
import xsna.ish0;
import xsna.ksh0;
import xsna.lsh0;
import xsna.rrh0;
import xsna.wqh0;
import xsna.zno;

/* compiled from: SearchFeature.kt */
/* loaded from: classes5.dex */
public final class vqh0 extends wk50<nsh0, ksh0, wqh0, rrh0> {
    public final lsh0 f;
    public final f4z g;
    public final qsi h;
    public ksh0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vqh0(csh0 csh0Var) {
        super(wqh0.h.b, csh0Var);
        lsh0 lsh0Var = new lsh0();
        this.f = lsh0Var;
        this.g = new f4z();
        qsi qsiVar = new qsi();
        this.h = qsiVar;
        this.i = new ksh0(null, null, 31);
        new yp1(1, this, vqh0.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", 0, 11);
        uqh0 uqh0Var = new uqh0(1, this, vqh0.class, "dispatchSideEffect", "dispatchSideEffect([Lcom/vk/search/ui/impl/feature/spec/SearchFeatureSideEffect;)V", 0);
        io.reactivex.rxjava3.subjects.f<lsh0.b> fVar = lsh0Var.a;
        b630 b630Var = new b630(new msh0(1, lsh0Var, lsh0.class, "proceedDelayEvent", "proceedDelayEvent(Lcom/vk/search/ui/impl/feature/feature_delegate/SearchFeatureUiSideEffectDelegate$DelayEvent;)Lio/reactivex/rxjava3/core/Maybe;", 0), 11);
        fVar.getClass();
        io.reactivex.rxjava3.disposables.c subscribe = io.reactivex.rxjava3.core.q.O(e43.l(new io.reactivex.rxjava3.internal.operators.observable.m0(fVar, b630Var), lsh0Var.b.u0(500L, TimeUnit.MILLISECONDS))).L(io.reactivex.rxjava3.internal.functions.a.a, false).subscribe(new hu50(uqh0Var, 15), new f2u(new p8(L.a, 7), 16));
        mgn mgnVar = new mgn(subscribe);
        if (!qsiVar.b) {
            synchronized (qsiVar) {
                if (!qsiVar.b && !subscribe.h()) {
                    qsiVar.a.add(mgnVar);
                    return;
                }
                s3q0 s3q0Var = s3q0.a;
            }
        }
        if (subscribe.h()) {
            return;
        }
        mgnVar.cancel();
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f9, code lost:
    
        if (r9 == r12) goto L73;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    @Override // xsna.wk50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N(ksh0 ksh0Var, wqh0 wqh0Var) {
        SearchQuery searchQuery;
        boolean z;
        int i;
        ksh0 ksh0Var2 = ksh0Var;
        wqh0 wqh0Var2 = wqh0Var;
        boolean z2 = ksh0Var2.f;
        irh0 irh0Var = ksh0Var2.d;
        ksh0.a aVar = ksh0Var2.e;
        ksh0.b bVar = ksh0Var2.b;
        if (wqh0Var2.equals(wqh0.h.b)) {
            T(rrh0.a.b);
        } else {
            SearchQuery i2 = null;
            SearchParams searchParams = null;
            boolean z3 = false;
            if (wqh0Var2 instanceof wqh0.k) {
                wqh0.k kVar = (wqh0.k) wqh0Var2;
                Object[] objArr = (kVar instanceof wqh0.u) && ((wqh0.u) kVar).c.equals(b9q0.c.a);
                if (objArr == true) {
                    SearchQuery i3 = kVar.i();
                    if (i3 != null) {
                        searchQuery = new SearchQuery(i3.b, bVar.b.c, i3.d, i3.e);
                        if (searchQuery != null && !searchQuery.equals(bVar.b)) {
                            if (objArr == false) {
                                if (bVar.d) {
                                    String str = searchQuery.b;
                                    String str2 = bVar.b.b;
                                    int length = str.length();
                                    int i4 = 0;
                                    while (true) {
                                        i = -1;
                                        if (i4 >= length) {
                                            i4 = -1;
                                            break;
                                        } else if (!ro.j(str.charAt(i4))) {
                                            break;
                                        } else {
                                            i4++;
                                        }
                                    }
                                    int length2 = str2.length();
                                    int i5 = 0;
                                    while (true) {
                                        if (i5 >= length2) {
                                            i5 = -1;
                                            break;
                                        } else if (!ro.j(str2.charAt(i5))) {
                                            break;
                                        } else {
                                            i5++;
                                        }
                                    }
                                    if (i4 != -1 && i5 != -1) {
                                        int length3 = str.length() - 1;
                                        if (length3 >= 0) {
                                            while (true) {
                                                int i6 = length3 - 1;
                                                if (!ro.j(str.charAt(length3))) {
                                                    break;
                                                } else if (i6 < 0) {
                                                    break;
                                                } else {
                                                    length3 = i6;
                                                }
                                            }
                                        }
                                        length3 = -1;
                                        int length4 = str2.length() - 1;
                                        if (length4 >= 0) {
                                            while (true) {
                                                int i7 = length4 - 1;
                                                if (!ro.j(str2.charAt(length4))) {
                                                    i = length4;
                                                    break;
                                                } else if (i7 < 0) {
                                                    break;
                                                } else {
                                                    length4 = i7;
                                                }
                                            }
                                        }
                                        int i8 = length3 - i4;
                                        if (i8 == i - i5) {
                                            int i9 = i8 + 1;
                                            for (int i10 = 0; i10 < i9; i10++) {
                                                if (str.charAt(length3 - i10) == str2.charAt(i - i10)) {
                                                }
                                            }
                                        }
                                    }
                                    bVar = ksh0.b.a(bVar, searchQuery, null, z, false, 10);
                                }
                                z = false;
                                bVar = ksh0.b.a(bVar, searchQuery, null, z, false, 10);
                            }
                            z = true;
                            bVar = ksh0.b.a(bVar, searchQuery, null, z, false, 10);
                        }
                        V(bVar, kVar, ksh0Var2);
                    }
                } else {
                    i2 = kVar.i();
                }
                searchQuery = i2;
                if (searchQuery != null) {
                    if (objArr == false) {
                    }
                    z = true;
                    bVar = ksh0.b.a(bVar, searchQuery, null, z, false, 10);
                }
                V(bVar, kVar, ksh0Var2);
            } else if (wqh0Var2 instanceof wqh0.i) {
                wqh0.i iVar = (wqh0.i) wqh0Var2;
                SearchParams searchParams2 = iVar.b;
                SearchParams searchParams3 = bVar.c;
                if (searchParams3 != null && fpf0.a(searchParams3.getClass()).c(searchParams2)) {
                    V(ksh0.b.a(ksh0Var2.b, null, iVar.b, false, false, 13), iVar, ksh0Var2);
                }
            } else {
                boolean z4 = wqh0Var2 instanceof wqh0.o;
                ish0 ish0Var = ish0.m.a;
                if (z4) {
                    wqh0.o oVar = (wqh0.o) wqh0Var2;
                    boolean z5 = oVar.b;
                    if (!z5 && !irh0Var.a) {
                        ish0Var = new ish0.q(true);
                    }
                    if (z5 || !oVar.c || !z2) {
                        U(ish0Var);
                    }
                } else if (wqh0Var2 instanceof wqh0.e) {
                    wqh0.e eVar = (wqh0.e) wqh0Var2;
                    if (aVar instanceof ksh0.a.b) {
                        T(new rrh0.e(eVar.b));
                    }
                } else if (wqh0Var2.equals(wqh0.q.b)) {
                    T(new rrh0.b(true));
                    if (!bVar.d) {
                        if ((aVar instanceof ksh0.a.b) && myc0.f(this.i.b.b.b)) {
                            z3 = true;
                        }
                        T(new rrh0.d(ksh0.b.a(bVar, null, null, true, z3, 3)));
                    }
                } else if (wqh0Var2.equals(wqh0.p.b)) {
                    if (z2) {
                        T(new rrh0.b(false));
                    }
                    T(new rrh0.d(ksh0.b.a(ksh0Var2.b, null, null, false, false, 7)));
                } else {
                    boolean equals = wqh0Var2.equals(wqh0.j.b);
                    lsh0 lsh0Var = this.f;
                    if (equals) {
                        SearchParams searchParams4 = bVar.c;
                        if (searchParams4 != null) {
                            lsh0Var.b.onNext(new ish0.f(searchParams4));
                        }
                    } else if (wqh0Var2.equals(wqh0.r.b)) {
                        SearchParams searchParams5 = bVar.c;
                        if (searchParams5 != null) {
                            searchParams = searchParams5.copy();
                            searchParams.reset();
                        }
                        V(ksh0.b.a(ksh0Var2.b, null, searchParams, false, false, 13), wqh0Var2, ksh0Var2);
                    } else {
                        boolean equals2 = wqh0Var2.equals(wqh0.c.b);
                        ish0 ish0Var2 = ish0.e.a;
                        ish0 ish0Var3 = ish0.b.a;
                        if (equals2) {
                            lsh0Var.c.onNext(lsh0.a.CATALOG);
                            dsh0 dsh0Var = ksh0Var2.c;
                            if (myc0.f(dsh0Var.a) || irh0Var.e) {
                                U(ish0Var3, new ish0.r(dsh0Var), ish0Var);
                            } else {
                                U(ish0Var3, ish0Var2, new ish0.r(dsh0Var));
                            }
                        } else if (wqh0Var2.equals(wqh0.g.b)) {
                            SearchQuery searchQuery2 = bVar.b;
                            SearchParams searchParams6 = bVar.c;
                            int length5 = searchQuery2.b.length();
                            ish0 ish0Var4 = ish0.p.a;
                            if (length5 == 0 && ((searchParams6 == null || searchParams6.I()) && bVar.b.d == null)) {
                                U(ish0Var4);
                            } else {
                                SearchParams copy = searchParams6 != null ? searchParams6.copy() : null;
                                if (copy != null) {
                                    copy.reset();
                                }
                                V(new ksh0.b(new SearchQuery("", SearchInputMethod.Keyboard, null, null, 12, null), copy, 12), wqh0Var2, ksh0Var2);
                                U(ish0Var4);
                            }
                        } else if (wqh0Var2.equals(wqh0.d.b)) {
                            lsh0Var.c.onNext(lsh0.a.CATALOG);
                        } else if (wqh0Var2.equals(wqh0.a.b)) {
                            if (aVar instanceof ksh0.a.b) {
                                ksh0.a.b bVar2 = (ksh0.a.b) aVar;
                                lsh0Var.c.onNext(lsh0.a.CATALOG);
                                T(rrh0.c.b);
                                ListBuilder e = e43.e();
                                e.add(new ish0.r(bVar2.a.c));
                                yqh0 yqh0Var = bVar2.b;
                                if (yqh0Var != null) {
                                    e.add(new ish0.o(yqh0Var));
                                    if (!drm0.N(bVar2.a.b.b.b)) {
                                        e.add(ish0.h.a);
                                    }
                                } else {
                                    e.add(ish0Var);
                                }
                                ish0[] ish0VarArr = (ish0[]) e.g().toArray(new ish0[0]);
                                U((ish0[]) Arrays.copyOf(ish0VarArr, ish0VarArr.length));
                            } else {
                                U(ish0.j.a);
                            }
                        } else if (wqh0Var2 instanceof wqh0.f) {
                            U(new ish0.d());
                        } else {
                            if (!wqh0Var2.equals(wqh0.b.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            U(ish0Var3, ish0Var2);
                        }
                    }
                }
            }
        }
        this.i = ksh0Var2;
    }

    public final void U(ish0... ish0VarArr) {
        ish0[] ish0VarArr2 = (ish0[]) Arrays.copyOf(ish0VarArr, ish0VarArr.length);
        int length = ish0VarArr2.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (ish0VarArr2[i] instanceof ish0.n) {
                C(wqh0.q.b);
                break;
            }
            i++;
        }
        ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
        com.vk.mvi.core.internal.executors.a.c(new tx(21, ish0VarArr, this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x005b, code lost:
    
        if (xsna.epx.f(r21.b.b, r8.b.b.b) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x006e, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x006c, code lost:
    
        if (xsna.drm0.N(r21.b.b) == false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0220  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V(ksh0.b bVar, wqh0 wqh0Var, ksh0 ksh0Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        dsh0 a;
        char c;
        char c2;
        long j;
        irh0 irh0Var = ksh0Var.d;
        ksh0.b bVar2 = ksh0Var.b;
        dsh0 dsh0Var = ksh0Var.c;
        ksh0.a aVar = ksh0Var.e;
        if (irh0Var.d) {
            if (wqh0Var instanceof wqh0.k) {
                wqh0.k kVar = (wqh0.k) wqh0Var;
                if (!(kVar instanceof wqh0.u) && !(kVar instanceof wqh0.t)) {
                    if (!(kVar instanceof wqh0.s) && !(kVar instanceof wqh0.l)) {
                        if (!(kVar instanceof wqh0.n)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (((wqh0.n) kVar).c && !drm0.N(bVar.b.b)) {
                            ksh0 ksh0Var2 = this.i;
                            if (ksh0Var2.e instanceof ksh0.a.b) {
                            }
                        }
                    }
                }
            } else {
                z = aVar instanceof ksh0.a.b;
            }
            z2 = aVar instanceof ksh0.a.b;
            if (z != z2) {
                T(z ? new rrh0.h(ksh0Var) : rrh0.g.b);
                if (z) {
                    U(ish0.g.a);
                } else if (wqh0Var instanceof wqh0.m) {
                    wqh0.m mVar = (wqh0.m) wqh0Var;
                    if (mVar.i().c == SearchInputMethod.Suggest && !drm0.N(mVar.i().b)) {
                        U(ish0.h.a);
                    }
                }
            }
            z3 = irh0Var.c;
            int i = irh0Var.f;
            b9q0.c cVar = b9q0.c.a;
            if (z3) {
                z4 = true;
            } else {
                if (wqh0Var instanceof wqh0.k) {
                    if (!(wqh0Var instanceof wqh0.t) && !(wqh0Var instanceof wqh0.l)) {
                        if ((wqh0Var instanceof wqh0.s) || (wqh0Var instanceof wqh0.n)) {
                            if (epx.f(bVar.b.b, bVar2.b.b)) {
                                z5 = dsh0Var.e;
                            }
                        } else {
                            if (!(wqh0Var instanceof wqh0.u)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            b9q0 b9q0Var = ((wqh0.u) wqh0Var).c;
                            if (b9q0Var instanceof b9q0.b) {
                                z5 = ((b9q0.b) b9q0Var).a;
                            } else {
                                if (!b9q0Var.equals(cVar)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                z5 = dsh0Var.e;
                            }
                        }
                    }
                    z4 = false;
                } else {
                    z5 = dsh0Var.e;
                }
                z4 = z5;
            }
            if (!epx.f(bVar2, bVar)) {
                T(new rrh0.d(bVar));
            }
            SearchQuery searchQuery = bVar.b;
            SearchInputMethod searchInputMethod = searchQuery.c;
            boolean z6 = z;
            dsh0 dsh0Var2 = new dsh0(drm0.p0(searchQuery.b).toString(), searchQuery.e, searchQuery.c, searchQuery.d, z4, bVar.c, z6);
            if (wqh0Var instanceof wqh0.s) {
                searchInputMethod = myc0.f(bVar.b.b) ? SearchInputMethod.QueryViewClick : SearchInputMethod.Keyboard;
            }
            a = dsh0.a(dsh0Var2, searchInputMethod, false, 123);
            if (!a.equals(dsh0Var)) {
                return;
            }
            T(new rrh0.f(a));
            boolean z7 = (wqh0Var instanceof wqh0.u) && ((wqh0.u) wqh0Var).c.equals(cVar);
            SearchInputMethod searchInputMethod2 = dsh0Var.c;
            String str = dsh0Var.a;
            dsh0 a2 = dsh0.a(a, searchInputMethod2, false, 123);
            String str2 = a.a;
            boolean equals = a2.equals(dsh0Var);
            lsh0 lsh0Var = this.f;
            if (!equals) {
                lsh0Var.c.onNext(lsh0.a.CATALOG);
            }
            if (z7 || equals) {
                U(new ish0.r(a));
                return;
            }
            ish0 ish0Var = ish0.b.a;
            ish0 ish0Var2 = ish0.e.a;
            if (i <= 0 || !myc0.f(str2)) {
                c = 0;
            } else {
                c = 0;
                if (str2.length() < i) {
                    if (myc0.f(str) && str.length() >= i) {
                        U(ish0Var, ish0Var2, new ish0.r(a));
                        return;
                    } else if (str.length() == 0) {
                        U(ish0Var2, new ish0.r(a));
                        return;
                    } else {
                        U(new ish0.r(a));
                        return;
                    }
                }
            }
            if (!myc0.f(str2)) {
                SearchParams searchParams = a.f;
                if ((searchParams != null ? searchParams.I() : true) && !irh0Var.e) {
                    c2 = c;
                    if (c2 != 0) {
                        ish0 rVar = new ish0.r(a);
                        ish0[] ish0VarArr = new ish0[3];
                        ish0VarArr[c] = ish0Var;
                        ish0VarArr[1] = ish0Var2;
                        ish0VarArr[2] = rVar;
                        U(ish0VarArr);
                        return;
                    }
                    if ((str.length() == 0 ? (char) 1 : c) != 0 && myc0.f(str2)) {
                        ish0[] ish0VarArr2 = new ish0[1];
                        ish0VarArr2[c] = ish0Var2;
                        U(ish0VarArr2);
                    }
                    ish0.n nVar = ish0.m.a;
                    if (z6 == z2) {
                        if (z6) {
                            nVar = new ish0.q(true);
                        } else if (!irh0Var.a) {
                            nVar = new ish0.q(irh0Var.b);
                        }
                    }
                    if ((wqh0Var instanceof wqh0.l) && myc0.f(str2) && (irh0Var.g || (!z6 && !z2))) {
                        j = irh0Var.h;
                    } else {
                        zno.a aVar2 = zno.c;
                        j = 0;
                    }
                    zno.a aVar3 = zno.c;
                    if ((j > 0 ? (char) 1 : c) == 0) {
                        ish0 rVar2 = new ish0.r(a);
                        ish0[] ish0VarArr3 = new ish0[3];
                        ish0VarArr3[c] = ish0Var;
                        ish0VarArr3[1] = rVar2;
                        ish0VarArr3[2] = nVar;
                        U(ish0VarArr3);
                        return;
                    }
                    ish0 rVar3 = new ish0.r(a);
                    ish0[] ish0VarArr4 = new ish0[2];
                    ish0VarArr4[c] = ish0Var;
                    ish0VarArr4[1] = rVar3;
                    U(ish0VarArr4);
                    lsh0Var.a.onNext(new lsh0.b(j, nVar, lsh0.a.CATALOG));
                    return;
                }
            }
            c2 = 1;
            if (c2 != 0) {
            }
        }
        z = false;
        z2 = aVar instanceof ksh0.a.b;
        if (z != z2) {
        }
        z3 = irh0Var.c;
        int i2 = irh0Var.f;
        b9q0.c cVar2 = b9q0.c.a;
        if (z3) {
        }
        if (!epx.f(bVar2, bVar)) {
        }
        SearchQuery searchQuery2 = bVar.b;
        SearchInputMethod searchInputMethod3 = searchQuery2.c;
        boolean z62 = z;
        dsh0 dsh0Var22 = new dsh0(drm0.p0(searchQuery2.b).toString(), searchQuery2.e, searchQuery2.c, searchQuery2.d, z4, bVar.c, z62);
        if (wqh0Var instanceof wqh0.s) {
        }
        a = dsh0.a(dsh0Var22, searchInputMethod3, false, 123);
        if (!a.equals(dsh0Var)) {
        }
    }

    @Override // xsna.wk50, xsna.g4z
    public final void onDestroy() {
        super.onDestroy();
        this.h.cancel();
    }
}
