package com.yandex.go.taxi.order.details.v2.core;

import android.os.SystemClock;
import com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType;
import com.yandex.go.taxi.order.details.v2.state.RideCardState$ProcessingStep;
import defpackage.a3y0;
import defpackage.bgk0;
import defpackage.bms;
import defpackage.h73;
import defpackage.hst;
import defpackage.jdk0;
import defpackage.jst;
import defpackage.mjk0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.onk0;
import defpackage.qnk0;
import defpackage.s5r;
import defpackage.t5r;
import defpackage.tcc;
import defpackage.v4r0;
import defpackage.vpr;
import defpackage.zjk0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.object.DriveState;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lvpr;", "Lqnk0;", "", "", "presentationItems", "", "Lzjk0;", "uiStateMap", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/util/List;Ljava/util/Map;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.core.RideCardItemComposer$getItemStates$1", f = "RideCardItemComposer.kt", l = {HProv.PP_FAST_CODE}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardItemComposer$getItemStates$1 extends SuspendLambda implements bms {
    final /* synthetic */ RideCardPresentationType $presentationType;
    int I$0;
    long J$0;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardItemComposer$getItemStates$1(c cVar, RideCardPresentationType rideCardPresentationType, Continuation continuation) {
        super(4, continuation);
        this.this$0 = cVar;
        this.$presentationType = rideCardPresentationType;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        RideCardItemComposer$getItemStates$1 rideCardItemComposer$getItemStates$1 = new RideCardItemComposer$getItemStates$1(this.this$0, this.$presentationType, (Continuation) obj4);
        rideCardItemComposer$getItemStates$1.L$0 = (vpr) obj;
        rideCardItemComposer$getItemStates$1.L$1 = (List) obj2;
        rideCardItemComposer$getItemStates$1.L$2 = (Map) obj3;
        return rideCardItemComposer$getItemStates$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        List list = (List) this.L$1;
        Map map = (Map) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return zy11Var;
        }
        kotlin.b.b(obj);
        DriveState c = this.this$0.a.c();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        t5r o = kotlin.sequences.b.o(new h73(1, list), new RideCardItemComposer$getItemStates$1$stateSequence$1(1, map, Map.class, "get", "get(Ljava/lang/Object;)Ljava/lang/Object;", 0));
        List s = kotlin.sequences.b.s(o);
        int i2 = s.size() < list.size() ? 1 : 0;
        this.this$0.getClass();
        s5r s5rVar = new s5r(kotlin.sequences.b.h(kotlin.sequences.b.l(o, new jdk0(14)), mjk0.a));
        zjk0 zjk0Var = s5rVar.hasNext() ? (zjk0) s5rVar.next() : null;
        ArrayList arrayList = new ArrayList();
        if (zjk0Var != null && !(zjk0Var instanceof bgk0)) {
            arrayList.add(zjk0Var);
        }
        while (s5rVar.hasNext()) {
            zjk0 zjk0Var2 = (zjk0) s5rVar.next();
            if (!(zjk0Var instanceof onk0) || !(zjk0Var2 instanceof onk0)) {
                if (!(zjk0Var instanceof bgk0) || !(zjk0Var2 instanceof bgk0)) {
                    if (s5rVar.hasNext() || !(zjk0Var2 instanceof bgk0)) {
                        arrayList.add(zjk0Var2);
                        zjk0Var = zjk0Var2;
                    }
                }
            }
        }
        RideCardState$ProcessingStep rideCardState$ProcessingStep = arrayList.isEmpty() ? RideCardState$ProcessingStep.EMPTY : i2 != 0 ? RideCardState$ProcessingStep.PROCESSING : RideCardState$ProcessingStep.READY;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((zjk0) it.next()).getId());
        }
        kotlin.collections.a.J0(arrayList2);
        if (this.this$0.k) {
            Set N0 = kotlin.collections.a.N0(list);
            List list2 = s;
            ArrayList arrayList3 = new ArrayList(tcc.n(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((zjk0) it2.next()).getId());
            }
            if (!v4r0.g(N0, kotlin.collections.a.N0(arrayList3)).isEmpty()) {
                this.this$0.g.getClass();
                a3y0.h(new String[]{"getItemStates", "missingElements"});
                hst hstVar = jst.e;
                return zy11Var;
            }
        }
        this.this$0.g.getClass();
        a3y0.h(new String[]{"getItemStates"});
        hst hstVar2 = jst.e;
        c cVar = this.this$0;
        if (!cVar.k && rideCardState$ProcessingStep == RideCardState$ProcessingStep.READY) {
            cVar.k = true;
        }
        qnk0 qnk0Var = new qnk0(arrayList, rideCardState$ProcessingStep, this.$presentationType, c, cVar.c.k);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.L$5 = null;
        this.L$6 = null;
        this.L$7 = null;
        this.L$8 = null;
        this.J$0 = elapsedRealtime;
        this.I$0 = i2;
        this.label = 1;
        return vprVar.emit(qnk0Var, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
