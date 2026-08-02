package com.yandex.go.dynamic.impl;

import android.app.Activity;
import com.yandex.go.dynamic.api.DynamicFeature;
import defpackage.c8n;
import defpackage.g6u;
import defpackage.g7n;
import defpackage.mvg;
import defpackage.mvt0;
import defpackage.ny61;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.dynamic.impl.DynamicFeatureLoaderImpl$showConfirmationDialog$1", f = "DynamicFeatureLoaderImpl.kt", l = {238, 239}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class DynamicFeatureLoaderImpl$showConfirmationDialog$1 extends SuspendLambda implements wls {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ DynamicFeature $feature;
    final /* synthetic */ mvt0 $state;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.dynamic.impl.DynamicFeatureLoaderImpl$showConfirmationDialog$1$1", f = "DynamicFeatureLoaderImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.dynamic.impl.DynamicFeatureLoaderImpl$showConfirmationDialog$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ mvt0 $state;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b bVar, mvt0 mvt0Var, Activity activity, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bVar;
            this.$state = mvt0Var;
            this.$activity = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$state, this.$activity, continuation);
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
            kotlin.b.b(obj);
            b bVar = this.this$0;
            c8n c8nVar = b.i;
            bVar.m().c(this.$state, this.$activity);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicFeatureLoaderImpl$showConfirmationDialog$1(b bVar, DynamicFeature dynamicFeature, mvt0 mvt0Var, Activity activity, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$feature = dynamicFeature;
        this.$state = mvt0Var;
        this.$activity = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DynamicFeatureLoaderImpl$showConfirmationDialog$1(this.this$0, this.$feature, this.$state, this.$activity, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DynamicFeatureLoaderImpl$showConfirmationDialog$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        if (r3 == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            g7n g7nVar = this.this$0.c;
            DynamicFeature dynamicFeature = this.$feature;
            this.label = 1;
            g7nVar.b.emit(dynamicFeature, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        this.this$0.b.getClass();
        sjh sjhVar = uyj.a;
        g6u g6uVar = o400.a;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$state, this.$activity, null);
        this.label = 2;
        return tje.k0(g6uVar, anonymousClass1, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
