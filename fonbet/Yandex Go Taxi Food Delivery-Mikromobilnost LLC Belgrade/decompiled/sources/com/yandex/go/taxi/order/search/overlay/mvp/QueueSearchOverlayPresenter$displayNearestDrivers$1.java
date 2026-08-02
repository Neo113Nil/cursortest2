package com.yandex.go.taxi.order.search.overlay.mvp;

import defpackage.cwa1;
import defpackage.dvw;
import defpackage.kol0;
import defpackage.m58;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.okg0;
import defpackage.pkg0;
import defpackage.tcc;
import defpackage.tse;
import defpackage.wls;
import defpackage.ym11;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.search.overlay.mvp.QueueSearchOverlayPresenter$displayNearestDrivers$1", f = "QueueSearchOverlayPresenter.kt", l = {154}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class QueueSearchOverlayPresenter$displayNearestDrivers$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<m58> $cars;
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueueSearchOverlayPresenter$displayNearestDrivers$1(a aVar, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$cars = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new QueueSearchOverlayPresenter$displayNearestDrivers$1(this.this$0, this.$cars, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((QueueSearchOverlayPresenter$displayNearestDrivers$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0104 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0115  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0105 -> B:5:0x0109). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List list;
        int i;
        a aVar;
        Ref$BooleanRef ref$BooleanRef;
        long currentTimeMillis;
        Ref$IntRef ref$IntRef;
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        zy11 zy11Var = zy11.a;
        if (i2 != 0) {
            if (i2 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            currentTimeMillis = this.J$0;
            i = this.I$0;
            ref$BooleanRef = (Ref$BooleanRef) this.L$6;
            Ref$IntRef ref$IntRef2 = (Ref$IntRef) this.L$5;
            Ref$BooleanRef ref$BooleanRef2 = (Ref$BooleanRef) this.L$4;
            List list2 = (List) this.L$3;
            a aVar2 = (a) this.L$2;
            kotlin.b.b(obj);
            a aVar3 = aVar2;
            List list3 = list2;
            Ref$IntRef ref$IntRef3 = ref$IntRef2;
            Ref$BooleanRef ref$BooleanRef3 = ref$BooleanRef2;
            a = obj;
            ref$BooleanRef.element = ((Boolean) a).booleanValue();
            if (!ref$BooleanRef3.element) {
                int i3 = ref$IntRef3.element;
                ref$IntRef3.element = i3 + 1;
                if (i3 < i) {
                    ref$BooleanRef = ref$BooleanRef3;
                    ref$IntRef = ref$IntRef3;
                    list = list3;
                    aVar = aVar3;
                    kotlinx.coroutines.a.k(get_context());
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = aVar;
                    this.L$3 = list;
                    this.L$4 = ref$BooleanRef;
                    this.L$5 = ref$IntRef;
                    this.L$6 = ref$BooleanRef;
                    this.I$0 = i;
                    this.J$0 = currentTimeMillis;
                    this.label = 1;
                    aVar.getClass();
                    kol0 kol0Var = new kol0(dvw.b(this));
                    ((okg0) aVar.Dg()).Da(list, aVar.Lg(), new pkg0(kol0Var));
                    a = kol0Var.a();
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (a != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    aVar3 = aVar;
                    list3 = list;
                    ref$IntRef3 = ref$IntRef;
                    ref$BooleanRef3 = ref$BooleanRef;
                    ref$BooleanRef.element = ((Boolean) a).booleanValue();
                    if (!ref$BooleanRef3.element) {
                    }
                }
            }
            new Long(System.currentTimeMillis() - currentTimeMillis);
            okg0 okg0Var = (okg0) this.this$0.Dg();
            List<m58> list4 = this.$cars;
            this.this$0.getClass();
            okg0Var.We(list4);
            return zy11Var;
        }
        kotlin.b.b(obj);
        ArrayList arrayList = this.this$0.B;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((m58) it.next()).c);
        }
        List b = ym11.b(arrayList2);
        if (b.isEmpty()) {
            return zy11Var;
        }
        List i4 = this.this$0.x.b().V().i();
        ArrayList arrayList3 = new ArrayList(tcc.n(i4, 10));
        Iterator it2 = i4.iterator();
        while (it2.hasNext()) {
            arrayList3.add(cwa1.d((zzs) it2.next()));
        }
        b.addAll(arrayList3);
        a aVar4 = this.this$0;
        Ref$BooleanRef ref$BooleanRef4 = new Ref$BooleanRef();
        Ref$IntRef ref$IntRef4 = new Ref$IntRef();
        list = b;
        i = 3;
        aVar = aVar4;
        ref$BooleanRef = ref$BooleanRef4;
        currentTimeMillis = System.currentTimeMillis();
        ref$IntRef = ref$IntRef4;
        kotlinx.coroutines.a.k(get_context());
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = aVar;
        this.L$3 = list;
        this.L$4 = ref$BooleanRef;
        this.L$5 = ref$IntRef;
        this.L$6 = ref$BooleanRef;
        this.I$0 = i;
        this.J$0 = currentTimeMillis;
        this.label = 1;
        aVar.getClass();
        kol0 kol0Var2 = new kol0(dvw.b(this));
        ((okg0) aVar.Dg()).Da(list, aVar.Lg(), new pkg0(kol0Var2));
        a = kol0Var2.a();
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (a != coroutineSingletons) {
        }
    }
}
