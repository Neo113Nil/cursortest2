package com.yandex.passport.common.ui.compose;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b0;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.m3u0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.common.ui.compose.UtilKt$CollectEffects$1$1", f = "Util.kt", l = {56}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class UtilKt$CollectEffects$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ tpr $effects;
    final /* synthetic */ m3u0 $latestOnEffect$delegate;
    final /* synthetic */ Lifecycle $lifecycle;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
    @mvg(c = "com.yandex.passport.common.ui.compose.UtilKt$CollectEffects$1$1$1", f = "Util.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE}, m = "invokeSuspend")
    /* renamed from: com.yandex.passport.common.ui.compose.UtilKt$CollectEffects$1$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ tpr $effects;
        final /* synthetic */ m3u0 $latestOnEffect$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(tpr tprVar, m3u0 m3u0Var, Continuation continuation) {
            super(2, continuation);
            this.$effects = tprVar;
            this.$latestOnEffect$delegate = m3u0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$effects, this.$latestOnEffect$delegate, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                tpr tprVar = this.$effects;
                b bVar = new b(0, this.$latestOnEffect$delegate);
                this.label = 1;
                if (tprVar.collect(bVar, this) == coroutineSingletons) {
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
    public UtilKt$CollectEffects$1$1(Lifecycle lifecycle, tpr tprVar, m3u0 m3u0Var, Continuation continuation) {
        super(2, continuation);
        this.$lifecycle = lifecycle;
        this.$effects = tprVar;
        this.$latestOnEffect$delegate = m3u0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UtilKt$CollectEffects$1$1(this.$lifecycle, this.$effects, this.$latestOnEffect$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UtilKt$CollectEffects$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Lifecycle lifecycle = this.$lifecycle;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$effects, this.$latestOnEffect$delegate, null);
            this.label = 1;
            if (b0.b(lifecycle, state, anonymousClass1, this) == coroutineSingletons) {
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
