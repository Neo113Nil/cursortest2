package com.yandex.go.where_you_are.impl.presentation;

import android.graphics.Rect;
import defpackage.a3v;
import defpackage.jpx0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.where_you_are.impl.presentation.WhereYouAreBubbleHolder$show$1", f = "WhereYouAreBubbleHolder.kt", l = {62}, m = "invokeSuspend", v = 2)
/* loaded from: classes11.dex */
final class WhereYouAreBubbleHolder$show$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ d this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lzy11;", "<unused var>", "Landroid/graphics/Rect;", "rect", "<anonymous>", "(VLandroid/graphics/Rect;)Landroid/graphics/Rect;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.where_you_are.impl.presentation.WhereYouAreBubbleHolder$show$1$1", f = "WhereYouAreBubbleHolder.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.where_you_are.impl.presentation.WhereYouAreBubbleHolder$show$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements zls {
        /* synthetic */ Object L$0;
        int label;

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(3, (Continuation) obj3);
            anonymousClass1.L$0 = (Rect) obj2;
            return anonymousClass1.invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Rect rect = (Rect) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                kotlin.b.b(obj);
                return rect;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WhereYouAreBubbleHolder$show$1(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WhereYouAreBubbleHolder$show$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WhereYouAreBubbleHolder$show$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        tpr d = com.yandex.go.coroutines.b.d(this.this$0.j, new WhereYouAreBubbleHolder$show$1$invokeSuspend$$inlined$start$1(zy11Var, null));
        a3v a3vVar = this.this$0.b;
        m0 m0Var = new m0(d, com.yandex.go.coroutines.b.d(new c(a3vVar.Pd()), new WhereYouAreBubbleHolder$pinRectFlow$$inlined$start$1(a3vVar.Gf(), null)), new AnonymousClass1(3, null));
        jpx0 jpx0Var = new jpx0(9, this.this$0);
        this.label = 1;
        return m0Var.collect(jpx0Var, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
