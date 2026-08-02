package com.yandex.go.flex.main_screen.presentation.scroll;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.acw0;
import defpackage.j5e0;
import defpackage.mip0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t1w;
import defpackage.tse;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.flex.main_screen.presentation.scroll.ScrollSpanDelegate$observePaddings$1", f = "ScrollSpanDelegate.kt", l = {130}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class ScrollSpanDelegate$observePaddings$1 extends SuspendLambda implements wls {
    final /* synthetic */ RecyclerView $this_observePaddings;
    int label;
    final /* synthetic */ mip0 this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lt1w;", "insets", "", "headerHeight", "<anonymous>", "(Lt1w;I)Lt1w;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.flex.main_screen.presentation.scroll.ScrollSpanDelegate$observePaddings$1$2", f = "ScrollSpanDelegate.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.flex.main_screen.presentation.scroll.ScrollSpanDelegate$observePaddings$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements zls {
        /* synthetic */ int I$0;
        /* synthetic */ Object L$0;
        int label;

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int intValue = ((Number) obj2).intValue();
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(3, (Continuation) obj3);
            anonymousClass2.L$0 = (t1w) obj;
            anonymousClass2.I$0 = intValue;
            return anonymousClass2.invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            t1w t1wVar = (t1w) this.L$0;
            int i = this.I$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                kotlin.b.b(obj);
                return t1w.a(t1wVar, i);
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollSpanDelegate$observePaddings$1(RecyclerView recyclerView, mip0 mip0Var, Continuation continuation) {
        super(2, continuation);
        this.$this_observePaddings = recyclerView;
        this.this$0 = mip0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScrollSpanDelegate$observePaddings$1(this.$this_observePaddings, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScrollSpanDelegate$observePaddings$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            kotlinx.coroutines.flow.b a = com.yandex.go.flex.main_screen.utils.a.a(this.$this_observePaddings);
            mip0 mip0Var = this.this$0;
            m0 m0Var = new m0(com.yandex.go.coroutines.b.d(new c(a, mip0Var, this.$this_observePaddings), new ScrollSpanDelegate$observePaddings$1$invokeSuspend$$inlined$start$1(mip0Var.c, null)), e.d(((acw0) this.this$0.b).a), new AnonymousClass2(3, null));
            j5e0 j5e0Var = new j5e0(12, this.this$0);
            this.label = 1;
            if (m0Var.collect(j5e0Var, this) == coroutineSingletons) {
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
