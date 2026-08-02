package com.yandex.go.taxi.order.map.overlay;

import com.yandex.mapkit.Animation;
import defpackage.f4c0;
import defpackage.ktk0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.scc;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.map.overlay.RoadObjectsOverlay$updateVisibility$1", f = "RoadObjectsOverlay.kt", l = {HProv.PP_HASHOID}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RoadObjectsOverlay$updateVisibility$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $withAnimation;
    Object L$0;
    int label;
    final /* synthetic */ ktk0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoadObjectsOverlay$updateVisibility$1(ktk0 ktk0Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ktk0Var;
        this.$withAnimation = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RoadObjectsOverlay$updateVisibility$1(this.this$0, this.$withAnimation, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RoadObjectsOverlay$updateVisibility$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ktk0 ktk0Var = this.this$0;
            List list2 = ktk0Var.l;
            ktk0Var.d.getClass();
            sjh sjhVar = uyj.a;
            RoadObjectsOverlay$updateVisibility$1$indexesToHide$1 roadObjectsOverlay$updateVisibility$1$indexesToHide$1 = new RoadObjectsOverlay$updateVisibility$1$indexesToHide$1(this.this$0, list2, null);
            this.L$0 = list2;
            this.label = 1;
            obj = tje.k0(sjhVar, roadObjectsOverlay$updateVisibility$1$indexesToHide$1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            list = list2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = (List) this.L$0;
            kotlin.b.b(obj);
        }
        Set set = (Set) obj;
        CopyOnWriteArrayList copyOnWriteArrayList = this.this$0.h;
        boolean z = this.$withAnimation;
        Iterator it = copyOnWriteArrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                scc.m();
                throw null;
            }
            f4c0 f4c0Var = (f4c0) next;
            boolean z2 = !set.contains(new Integer(list.size() + i2));
            if (z) {
                f4c0Var.j(z2, new Animation(Animation.Type.SMOOTH, 0.3f), null);
            } else {
                f4c0Var.i(z2);
            }
            i2 = i3;
        }
        return zy11.a;
    }
}
