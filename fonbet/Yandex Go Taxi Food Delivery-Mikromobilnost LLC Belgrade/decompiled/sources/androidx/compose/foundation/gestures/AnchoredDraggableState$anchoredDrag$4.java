package androidx.compose.foundation.gestures;

import defpackage.bms;
import defpackage.lah;
import defpackage.mvg;
import defpackage.n62;
import defpackage.ny61;
import defpackage.o62;
import defpackage.tls;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4", f = "AnchoredDraggable.kt", l = {1206}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class AnchoredDraggableState$anchoredDrag$4 extends SuspendLambda implements tls {
    final /* synthetic */ bms $block;
    final /* synthetic */ Object $targetValue;
    int label;
    final /* synthetic */ e this$0;

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0018\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lkotlin/Pair;", "Llah;", "<destruct>", "Lzy11;", "<anonymous>", "(Lkotlin/Pair;)V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4$2", f = "AnchoredDraggable.kt", l = {1208}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ bms $block;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ e this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(bms bmsVar, e eVar, Continuation continuation) {
            super(2, continuation);
            this.$block = bmsVar;
            this.this$0 = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((Pair) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                Pair pair = (Pair) this.L$0;
                lah lahVar = (lah) pair.getFirst();
                Object second = pair.getSecond();
                bms bmsVar = this.$block;
                o62 o62Var = this.this$0.n;
                this.label = 1;
                if (bmsVar.invoke(o62Var, lahVar, second, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableState$anchoredDrag$4(e eVar, Object obj, bms bmsVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = eVar;
        this.$targetValue = obj;
        this.$block = bmsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new AnchoredDraggableState$anchoredDrag$4(this.this$0, this.$targetValue, this.$block, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((AnchoredDraggableState$anchoredDrag$4) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar = this.this$0;
            eVar.l.setValue(this.$targetValue);
            e eVar2 = this.this$0;
            n62 n62Var = new n62(eVar2, 3);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, eVar2, null);
            this.label = 1;
            if (c.c(n62Var, anonymousClass2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        if (((Boolean) this.this$0.a.invoke(this.$targetValue)).booleanValue()) {
            float f = this.this$0.d().f(this.$targetValue);
            e eVar3 = this.this$0;
            eVar3.n.a(f, eVar3.k.getFloatValue());
            e eVar4 = this.this$0;
            eVar4.h.setValue(this.$targetValue);
            this.this$0.h(this.$targetValue);
        }
        return zy11.a;
    }
}
