package com.yandex.go.taxi.order.change.driver;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.g050;
import defpackage.ie60;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.xa9;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lxa9;", "<anonymous>", "(Ltse;)Lxa9;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.change.driver.ChangeDriverRepository$triggerReorder$2", f = "ChangeDriverRepository.kt", l = {139, SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE, 54, 54}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ChangeDriverRepository$triggerReorder$2 extends SuspendLambda implements wls {
    final /* synthetic */ o2y0 $orderHolder;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ d this$0;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lnoh;", "Lxa9;", "<anonymous>", "(Ltse;)Lnoh;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.order.change.driver.ChangeDriverRepository$triggerReorder$2$1", f = "ChangeDriverRepository.kt", l = {139}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.order.change.driver.ChangeDriverRepository$triggerReorder$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ o2y0 $orderHolder;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ d this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(d dVar, o2y0 o2y0Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = dVar;
            this.$orderHolder = o2y0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$orderHolder, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            d dVar;
            g050 g050Var;
            o2y0 o2y0Var;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                dVar = this.this$0;
                kotlinx.coroutines.sync.a aVar = dVar.e;
                o2y0 o2y0Var2 = this.$orderHolder;
                this.L$0 = aVar;
                this.L$1 = dVar;
                this.L$2 = o2y0Var2;
                this.label = 1;
                if (aVar.a(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                g050Var = aVar;
                o2y0Var = o2y0Var2;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o2y0Var = (o2y0) this.L$2;
                dVar = (d) this.L$1;
                g050Var = (g050) this.L$0;
                kotlin.b.b(obj);
            }
            try {
                return (noh) dVar.d.remove(o2y0Var.b().a);
            } finally {
                g050Var.d(null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeDriverRepository$triggerReorder$2(d dVar, o2y0 o2y0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$orderHolder = o2y0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChangeDriverRepository$triggerReorder$2 changeDriverRepository$triggerReorder$2 = new ChangeDriverRepository$triggerReorder$2(this.this$0, this.$orderHolder, continuation);
        changeDriverRepository$triggerReorder$2.L$0 = obj;
        return changeDriverRepository$triggerReorder$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChangeDriverRepository$triggerReorder$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d8 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        g050 g050Var;
        o2y0 o2y0Var;
        d dVar;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (Throwable th) {
            ie60 ie60Var = ie60.a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$orderHolder, null);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = th;
            this.L$3 = null;
            this.label = 4;
            if (tje.k0(ie60Var, anonymousClass1, this) != coroutineSingletons) {
                throw th;
            }
        }
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                d dVar2 = this.this$0;
                g050Var = dVar2.e;
                o2y0Var = this.$orderHolder;
                this.L$0 = tseVar;
                this.L$1 = g050Var;
                this.L$2 = dVar2;
                this.L$3 = o2y0Var;
                this.label = 1;
                if (g050Var.a(this) != coroutineSingletons) {
                    dVar = dVar2;
                }
            }
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    xa9 xa9Var = (xa9) obj;
                    ie60 ie60Var2 = ie60.a;
                    AnonymousClass1 anonymousClass12 = new AnonymousClass1(this.this$0, this.$orderHolder, null);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = xa9Var;
                    this.label = 3;
                    return tje.k0(ie60Var2, anonymousClass12, this) != coroutineSingletons ? coroutineSingletons : xa9Var;
                }
                if (i == 3) {
                    xa9 xa9Var2 = (xa9) this.L$2;
                    kotlin.b.b(obj);
                    return xa9Var2;
                }
                if (i != 4) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Throwable th2 = (Throwable) this.L$2;
                kotlin.b.b(obj);
                throw th2;
            }
            o2y0Var = (o2y0) this.L$3;
            dVar = (d) this.L$2;
            g050Var = (g050) this.L$1;
            kotlin.b.b(obj);
            LinkedHashMap linkedHashMap = dVar.d;
            String str = o2y0Var.b().a;
            Object obj2 = linkedHashMap.get(str);
            if (obj2 == null) {
                obj2 = tje.h(tseVar, null, null, new ChangeDriverRepository$triggerReorder$2$responseResult$1$1$1(dVar, o2y0Var, null), 3);
                linkedHashMap.put(str, obj2);
            }
            noh nohVar = (noh) obj2;
            g050Var.d(null);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 2;
            obj = nohVar.k(this);
            if (obj == coroutineSingletons) {
            }
            xa9 xa9Var3 = (xa9) obj;
            ie60 ie60Var22 = ie60.a;
            AnonymousClass1 anonymousClass122 = new AnonymousClass1(this.this$0, this.$orderHolder, null);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = xa9Var3;
            this.label = 3;
            if (tje.k0(ie60Var22, anonymousClass122, this) != coroutineSingletons) {
            }
        } catch (Throwable th3) {
            g050Var.d(null);
            throw th3;
        }
    }
}
