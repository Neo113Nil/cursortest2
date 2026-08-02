package com.yandex.messaging.internal.view.chat.input.textsuggest;

import androidx.lifecycle.Lifecycle;
import defpackage.bax0;
import defpackage.j3b;
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
import kotlinx.coroutines.flow.h0;
import kotlinx.coroutines.flow.internal.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.view.chat.input.textsuggest.TextSuggestViewReporter$1", f = "TextSuggestViewReporter.kt", l = {34, 36}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class TextSuggestViewReporter$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ d this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.yandex.messaging.internal.view.chat.input.textsuggest.TextSuggestViewReporter$1$1", f = "TextSuggestViewReporter.kt", l = {39}, m = "invokeSuspend")
    /* renamed from: com.yandex.messaging.internal.view.chat.input.textsuggest.TextSuggestViewReporter$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ d this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(d dVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
            tpr a = this.this$0.e.a(null);
            bax0 bax0Var = new bax0(18, this.this$0);
            this.label = 1;
            Object collect = ((e) a).collect(new h0(bax0Var), this);
            if (collect != coroutineSingletons) {
                collect = zy11Var;
            }
            return collect == coroutineSingletons ? coroutineSingletons : zy11Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextSuggestViewReporter$1(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TextSuggestViewReporter$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TextSuggestViewReporter$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        if (androidx.lifecycle.b0.b(r1, r4, r5, r6) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (r7 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        d dVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            dVar = this.this$0;
            tpr a = dVar.b.a(dVar.a);
            this.L$0 = dVar;
            this.label = 1;
            obj = kotlinx.coroutines.flow.e.y(a, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dVar = (d) this.L$0;
            kotlin.b.b(obj);
        }
        dVar.f = ((j3b) obj).b;
        d dVar2 = this.this$0;
        Lifecycle lifecycle = dVar2.c;
        Lifecycle.State state = Lifecycle.State.STARTED;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(dVar2, null);
        this.L$0 = null;
        this.label = 2;
    }
}
