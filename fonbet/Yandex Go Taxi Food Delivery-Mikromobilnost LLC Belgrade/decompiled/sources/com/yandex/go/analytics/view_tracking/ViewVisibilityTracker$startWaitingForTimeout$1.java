package com.yandex.go.analytics.view_tracking;

import defpackage.g6u;
import defpackage.g6v;
import defpackage.hsc;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.analytics.view_tracking.ViewVisibilityTracker$startWaitingForTimeout$1", f = "ViewVisibilityTracker.kt", l = {213, 214, 217}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ViewVisibilityTracker$startWaitingForTimeout$1 extends SuspendLambda implements wls {
    final /* synthetic */ g6v $model;
    final /* synthetic */ Enum<Object> $state;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.analytics.view_tracking.ViewVisibilityTracker$startWaitingForTimeout$1$1", f = "ViewVisibilityTracker.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.analytics.view_tracking.ViewVisibilityTracker$startWaitingForTimeout$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ g6v $model;
        final /* synthetic */ Enum<Object> $state;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, Enum r2, g6v g6vVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
            this.$state = r2;
            this.$model = g6vVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$state, this.$model, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((tse) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            Map map = (Map) this.this$0.e.get(this.$state);
            if (map != null) {
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewVisibilityTracker$startWaitingForTimeout$1(a aVar, Enum r2, g6v g6vVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$state = r2;
        this.$model = g6vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ViewVisibilityTracker$startWaitingForTimeout$1(this.this$0, this.$state, this.$model, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ViewVisibilityTracker$startWaitingForTimeout$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007d, code lost:
    
        if (defpackage.tje.k0(r9, r1, r8) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (r9.emit(r6, r8) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0031, code lost:
    
        if (kotlinx.coroutines.a.j(r6, r8) == r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            long j = this.this$0.a.b;
            this.label = 1;
        } else if (i == 1) {
            b.b(obj);
        } else {
            if (i != 2) {
                if (i == 3) {
                    b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            Set set = (Set) this.this$0.d.get(this.$state);
            if (set != null) {
                set.add(((hsc) this.$model).b);
            }
            this.this$0.b.getClass();
            sjh sjhVar = uyj.a;
            g6u g6uVar = o400.a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$state, this.$model, null);
            this.label = 3;
        }
        n0 n0Var = this.this$0.g;
        Pair pair = new Pair(this.$state, this.$model);
        this.label = 2;
    }
}
