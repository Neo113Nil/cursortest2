package com.yandex.go.quark.dynamic;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b0;
import com.yandex.quark.yango.ActiveMode;
import defpackage.coh;
import defpackage.doh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t6z;
import defpackage.tpr;
import defpackage.tse;
import defpackage.ul2;
import defpackage.wls;
import defpackage.wmt;
import defpackage.ymt;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.quark.dynamic.QuarkServiceImpl$updateGoCapabilityLocationJob$1", f = "QuarkServiceImpl.kt", l = {110}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class QuarkServiceImpl$updateGoCapabilityLocationJob$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ h this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.quark.dynamic.QuarkServiceImpl$updateGoCapabilityLocationJob$1$1", f = "QuarkServiceImpl.kt", l = {114}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.quark.dynamic.QuarkServiceImpl$updateGoCapabilityLocationJob$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ h this$0;

        @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
        /* renamed from: com.yandex.go.quark.dynamic.QuarkServiceImpl$updateGoCapabilityLocationJob$1$1$2, reason: invalid class name */
        final /* synthetic */ class AnonymousClass2 extends AdaptedFunctionReference implements wls {
            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                zzs zzsVar = (zzs) obj;
                coh cohVar = ((doh) ((h) this.receiver).g.a.getValue()).b;
                t6z t6zVar = new t6z(zzsVar.a, zzsVar.b, zzsVar.c);
                ymt ymtVar = cohVar.b;
                synchronized (ymtVar) {
                    wmt wmtVar = ymtVar.d;
                    ActiveMode activeMode = wmtVar.b;
                    wmtVar.getClass();
                    wmt wmtVar2 = new wmt(t6zVar, activeMode);
                    ymtVar.d = wmtVar2;
                    ul2 f = ymtVar.f(wmtVar2);
                    synchronized (ymtVar) {
                        ymtVar.e = f;
                        ymtVar.e(f);
                    }
                    return zy11.a;
                }
                return zy11.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(h hVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = hVar;
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
            if (i == 0) {
                kotlin.b.b(obj);
                tpr t = kotlinx.coroutines.flow.e.t(new e(((ru.yandex.taxi.preorder.source.userposition.e) this.this$0.i).n()));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(2, this.this$0, h.class, "configureGoCapabilityLocation", "configureGoCapabilityLocation(Lru/yandex/taxi/common_models/net/GeoPoint;)V", 4);
                this.label = 1;
                if (kotlinx.coroutines.flow.e.k(t, anonymousClass2, this) == coroutineSingletons) {
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
    public QuarkServiceImpl$updateGoCapabilityLocationJob$1(h hVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new QuarkServiceImpl$updateGoCapabilityLocationJob$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((QuarkServiceImpl$updateGoCapabilityLocationJob$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            h hVar = this.this$0;
            Lifecycle lifecycle = hVar.c;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(hVar, null);
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
