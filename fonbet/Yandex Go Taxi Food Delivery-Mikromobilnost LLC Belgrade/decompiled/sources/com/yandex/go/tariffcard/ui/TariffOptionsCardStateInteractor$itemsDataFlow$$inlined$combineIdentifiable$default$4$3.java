package com.yandex.go.tariffcard.ui;

import defpackage.aij0;
import defpackage.bix0;
import defpackage.cp1;
import defpackage.d3u;
import defpackage.eij0;
import defpackage.f6v;
import defpackage.fnx0;
import defpackage.h6v;
import defpackage.ikt;
import defpackage.jmw0;
import defpackage.jx40;
import defpackage.k3i;
import defpackage.k3x;
import defpackage.kix0;
import defpackage.l1f;
import defpackage.lix0;
import defpackage.mix0;
import defpackage.mvg;
import defpackage.nkt;
import defpackage.ny61;
import defpackage.onx0;
import defpackage.oto0;
import defpackage.oz8;
import defpackage.ozh;
import defpackage.pex0;
import defpackage.pix0;
import defpackage.pmx0;
import defpackage.qpi;
import defpackage.rib1;
import defpackage.saj0;
import defpackage.scc;
import defpackage.t3q0;
import defpackage.tcc;
import defpackage.tix0;
import defpackage.v421;
import defpackage.vom;
import defpackage.vpr;
import defpackage.w8u;
import defpackage.wls;
import defpackage.z9j0;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lvpr;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Array;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.tariffcard.ui.TariffOptionsCardStateInteractor$itemsDataFlow$$inlined$combineIdentifiable$default$4$3", f = "TariffOptionsCardStateInteractor.kt", l = {329, MSException.ERROR_MORE_DATA}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class TariffOptionsCardStateInteractor$itemsDataFlow$$inlined$combineIdentifiable$default$4$3 extends SuspendLambda implements zls {
    final /* synthetic */ boolean $isDebug$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ tix0 this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u00012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0002H\n"}, d2 = {"R", CA20Status.STATUS_REQUEST_K, "Lh6v;", "it", "<anonymous>"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.tariffcard.ui.TariffOptionsCardStateInteractor$itemsDataFlow$$inlined$combineIdentifiable$default$4$3$1", f = "TariffOptionsCardStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.tariffcard.ui.TariffOptionsCardStateInteractor$itemsDataFlow$$inlined$combineIdentifiable$default$4$3$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ f6v[] $args;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ tix0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(f6v[] f6vVarArr, Continuation continuation, tix0 tix0Var) {
            super(2, continuation);
            this.$args = f6vVarArr;
            this.this$0 = tix0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$args, continuation, this.this$0);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((h6v) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            f6v[] f6vVarArr = this.$args;
            Object obj2 = f6vVarArr[0].b;
            Object obj3 = f6vVarArr[1].b;
            Object obj4 = f6vVarArr[2].b;
            Object obj5 = f6vVarArr[3].b;
            Object obj6 = f6vVarArr[4].b;
            Object obj7 = f6vVarArr[5].b;
            Object obj8 = f6vVarArr[6].b;
            Object obj9 = f6vVarArr[7].b;
            Object obj10 = f6vVarArr[8].b;
            Object obj11 = f6vVarArr[9].b;
            Object obj12 = f6vVarArr[10].b;
            Object obj13 = f6vVarArr[11].b;
            aij0 aij0Var = (aij0) f6vVarArr[12].b;
            nkt nktVar = (nkt) obj13;
            jx40 jx40Var = (jx40) obj12;
            pmx0 pmx0Var = (pmx0) obj11;
            List list = (List) obj10;
            List list2 = (List) obj9;
            List list3 = (List) obj8;
            List list4 = (List) obj7;
            Triple triple = (Triple) obj5;
            l1f l1fVar = (l1f) obj4;
            w8u w8uVar = (w8u) obj3;
            fnx0 fnx0Var = (fnx0) obj2;
            oz8 oz8Var = (oz8) triple.getFirst();
            v421 v421Var = (v421) triple.getSecond();
            d3u d3uVar = (d3u) triple.getThird();
            pex0 pex0Var = fnx0Var.c;
            boolean z = this.this$0.t.a.a(pex0Var) || k3i.a(pex0Var);
            onx0 onx0Var = rib1.c(this.this$0.p.b(), fnx0Var.d, pex0Var.u0) ? onx0.a : null;
            List singletonList = Collections.singletonList(qpi.a);
            if (!z) {
                singletonList = null;
            }
            List list5 = EmptyList.a;
            if (singletonList == null) {
                singletonList = list5;
            }
            List list6 = list4;
            onx0 onx0Var2 = onx0Var;
            List list7 = singletonList;
            ArrayList arrayList = new ArrayList(tcc.n(list6, 10));
            int i = 0;
            for (Iterator it = list6.iterator(); it.hasNext(); it = it) {
                Object next = it.next();
                int i2 = i + 1;
                if (i < 0) {
                    scc.m();
                    throw null;
                }
                arrayList.add(new z9j0(false, (saj0) next));
                i = i2;
            }
            ArrayList arrayList2 = nktVar.a;
            ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
            int i3 = 0;
            for (Iterator it2 = arrayList2.iterator(); it2.hasNext(); it2 = it2) {
                Object next2 = it2.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    scc.m();
                    throw null;
                }
                arrayList3.add(new ikt(false, (jmw0) next2));
                i3 = i4;
            }
            List singletonList2 = Collections.singletonList(new ozh(pex0Var.b, pex0Var.u0));
            lix0 lix0Var = new lix0();
            kix0 kix0Var = new kix0(list2, new pix0(list2, 1));
            kix0 kix0Var2 = new kix0(kotlin.collections.a.m0(arrayList, list7), vom.N);
            kix0 kix0Var3 = new kix0(arrayList3, vom.P);
            kix0 kix0Var4 = new kix0(list3, new pix0(list3, 0));
            String str = pmx0Var != null ? pmx0Var.a : null;
            if (str == null || str.length() == 0) {
                str = null;
            }
            eij0 eij0Var = str != null ? new eij0(str) : null;
            kix0 kix0Var5 = new kix0(pmx0Var != null ? pmx0Var.b : list5, vom.Q);
            kix0 a = lix0.a(w8uVar);
            kix0 a2 = lix0.a(onx0Var2);
            kix0 b = lix0.b(lix0Var, v421Var.a);
            vom vomVar = vom.O;
            if (aij0Var != null) {
                list5 = Collections.singletonList(aij0Var);
            }
            f0 f0Var = new f0(lix0.a(oz8Var != null ? oz8Var.a : null), a, new mix0(w8uVar.b, (t3q0) ((oto0) this.this$0.r.a.a).get()), kix0Var3, this.this$0.p.i(), lix0.b(lix0Var, singletonList2), a2, b, kix0Var, kix0Var2, new kix0(list5, new cp1(vomVar, 17)), lix0.a(l1fVar), oz8Var, lix0.b(lix0Var, jx40Var.a), kix0Var4, this.this$0, lix0Var, list, kix0Var5, eij0Var, d3uVar, fnx0Var);
            bix0 bix0Var = new bix0();
            f0Var.invoke(bix0Var);
            return new k3x(bix0Var.a, w8uVar.a.e, w8uVar.b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffOptionsCardStateInteractor$itemsDataFlow$$inlined$combineIdentifiable$default$4$3(Continuation continuation, boolean z, tix0 tix0Var) {
        super(3, continuation);
        this.$isDebug$inlined = z;
        this.this$0 = tix0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TariffOptionsCardStateInteractor$itemsDataFlow$$inlined$combineIdentifiable$default$4$3 tariffOptionsCardStateInteractor$itemsDataFlow$$inlined$combineIdentifiable$default$4$3 = new TariffOptionsCardStateInteractor$itemsDataFlow$$inlined$combineIdentifiable$default$4$3((Continuation) obj3, this.$isDebug$inlined, this.this$0);
        tariffOptionsCardStateInteractor$itemsDataFlow$$inlined$combineIdentifiable$default$4$3.L$0 = (vpr) obj;
        tariffOptionsCardStateInteractor$itemsDataFlow$$inlined$combineIdentifiable$default$4$3.L$1 = (Object[]) obj2;
        return tariffOptionsCardStateInteractor$itemsDataFlow$$inlined$combineIdentifiable$default$4$3.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0060, code lost:
    
        if (r0.emit(r9, r8) == r2) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0062, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        if (r9 == r2) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Object[] objArr = (Object[]) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            f6v[] f6vVarArr = (f6v[]) objArr;
            boolean z = this.$isDebug$inlined;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(f6vVarArr, null, this.this$0);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = vprVar;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 1;
            obj = ru.yandex.taxi.requirements.utils.c.a(f6vVarArr, z, anonymousClass1, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar = (vpr) this.L$2;
            kotlin.b.b(obj);
        }
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.label = 2;
    }
}
