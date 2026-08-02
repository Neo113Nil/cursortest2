package com.yandex.go.analytics;

import android.app.Activity;
import android.content.Intent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b0;
import defpackage.a32;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.analytics.AnalyticsActivityCreateListener$onActivityCreate$1", f = "AnalyticsActivityCreateListener.kt", l = {45}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class AnalyticsActivityCreateListener$onActivityCreate$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.analytics.AnalyticsActivityCreateListener$onActivityCreate$1$1", f = "AnalyticsActivityCreateListener.kt", l = {47, 61}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.analytics.AnalyticsActivityCreateListener$onActivityCreate$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
        
            if (kotlinx.coroutines.a.d(r6) == r0) goto L31;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            boolean z = true;
            try {
                if (i == 0) {
                    kotlin.b.b(obj);
                    a aVar = this.this$0;
                    ru.yandex.taxi.analytics.j jVar = aVar.b;
                    Activity activity = aVar.a;
                    this.label = 1;
                    if (jVar.k(activity, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        throw new KotlinNothingValueException();
                    }
                    kotlin.b.b(obj);
                }
                a aVar2 = this.this$0;
                a32 a32Var = aVar2.f;
                if (!a32Var.b) {
                    a32Var.b = true;
                    Intent intent = aVar2.a.getIntent();
                    String dataString = intent != null ? intent.getDataString() : null;
                    if (dataString == null || dataString.length() == 0) {
                        z = false;
                    }
                    a aVar3 = this.this$0;
                    aVar3.d.a(aVar3.f.c, z, aVar3.e.c(), dataString);
                }
                this.label = 2;
            } catch (Throwable th) {
                a aVar4 = this.this$0;
                aVar4.b.j(aVar4.a);
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticsActivityCreateListener$onActivityCreate$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AnalyticsActivityCreateListener$onActivityCreate$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AnalyticsActivityCreateListener$onActivityCreate$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0;
            Lifecycle lifecycle = aVar.h;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(aVar, null);
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
