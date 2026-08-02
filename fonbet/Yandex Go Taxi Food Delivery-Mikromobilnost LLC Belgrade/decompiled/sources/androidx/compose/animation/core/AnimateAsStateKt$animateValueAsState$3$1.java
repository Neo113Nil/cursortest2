package androidx.compose.animation.core;

import defpackage.ci9;
import defpackage.jj2;
import defpackage.jl40;
import defpackage.jq6;
import defpackage.m3u0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oi9;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.twt0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1", f = "AnimateAsState.kt", l = {430}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class AnimateAsStateKt$animateValueAsState$3$1 extends SuspendLambda implements wls {
    final /* synthetic */ m3u0 $animSpec$delegate;
    final /* synthetic */ a $animatable;
    final /* synthetic */ ci9 $channel;
    final /* synthetic */ m3u0 $listener$delegate;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1", f = "AnimateAsState.kt", l = {439}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ m3u0 $animSpec$delegate;
        final /* synthetic */ a $animatable;
        final /* synthetic */ m3u0 $listener$delegate;
        final /* synthetic */ Object $newTarget;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Object obj, a aVar, m3u0 m3u0Var, m3u0 m3u0Var2, Continuation continuation) {
            super(2, continuation);
            this.$newTarget = obj;
            this.$animatable = aVar;
            this.$animSpec$delegate = m3u0Var;
            this.$listener$delegate = m3u0Var2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$newTarget, this.$animatable, this.$animSpec$delegate, this.$listener$delegate, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AnonymousClass1 anonymousClass1;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                if (!jl40.l(this.$newTarget, this.$animatable.f.getValue())) {
                    a aVar = this.$animatable;
                    Object obj2 = this.$newTarget;
                    m3u0 m3u0Var = this.$animSpec$delegate;
                    twt0 twt0Var = b.a;
                    jj2 jj2Var = (jj2) m3u0Var.getValue();
                    this.label = 1;
                    anonymousClass1 = this;
                    if (a.d(aVar, obj2, jj2Var, null, null, anonymousClass1, 12) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11.a;
            }
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            anonymousClass1 = this;
            m3u0 m3u0Var2 = anonymousClass1.$listener$delegate;
            twt0 twt0Var2 = b.a;
            tls tlsVar = (tls) m3u0Var2.getValue();
            if (tlsVar != null) {
                tlsVar.invoke(anonymousClass1.$animatable.e());
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimateAsStateKt$animateValueAsState$3$1(ci9 ci9Var, a aVar, m3u0 m3u0Var, m3u0 m3u0Var2, Continuation continuation) {
        super(2, continuation);
        this.$channel = ci9Var;
        this.$animatable = aVar;
        this.$animSpec$delegate = m3u0Var;
        this.$listener$delegate = m3u0Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AnimateAsStateKt$animateValueAsState$3$1 animateAsStateKt$animateValueAsState$3$1 = new AnimateAsStateKt$animateValueAsState$3$1(this.$channel, this.$animatable, this.$animSpec$delegate, this.$listener$delegate, continuation);
        animateAsStateKt$animateValueAsState$3$1.L$0 = obj;
        return animateAsStateKt$animateValueAsState$3$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AnimateAsStateKt$animateValueAsState$3$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0034 -> B:5:0x0037). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        jq6 it;
        tse tseVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tse tseVar2 = (tse) this.L$0;
            it = this.$channel.iterator();
            tseVar = tseVar2;
            this.L$0 = tseVar;
            this.L$1 = it;
            this.label = 1;
            obj = it.a(this);
            if (obj == coroutineSingletons) {
            }
            if (((Boolean) obj).booleanValue()) {
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = (jq6) this.L$1;
            tseVar = (tse) this.L$0;
            kotlin.b.b(obj);
            if (((Boolean) obj).booleanValue()) {
                Object b = it.b();
                Object b2 = oi9.b(this.$channel.g());
                tje.N(tseVar, null, null, new AnonymousClass1(b2 == null ? b : b2, this.$animatable, this.$animSpec$delegate, this.$listener$delegate, null), 3);
                this.L$0 = tseVar;
                this.L$1 = it;
                this.label = 1;
                obj = it.a(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                if (((Boolean) obj).booleanValue()) {
                    return zy11.a;
                }
            }
        }
    }
}
