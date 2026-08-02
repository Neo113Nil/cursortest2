package com.yandex.go.preorder.map;

import com.yandex.go.address.position_confirmation.j;
import com.yandex.mapkit.ScreenRect;
import defpackage.jqr;
import defpackage.mvg;
import defpackage.nfv0;
import defpackage.ny61;
import defpackage.ofv0;
import defpackage.sls;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.xfv0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.preorder.map.RouteAnimationsHolderImpl$launchAnimationJob$1", f = "RouteAnimationsHolderImpl.kt", l = {HProv.PP_LICENSE, 161}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class RouteAnimationsHolderImpl$launchAnimationJob$1 extends SuspendLambda implements wls {
    final /* synthetic */ sls $rectHookAnimation;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/mapkit/ScreenRect;", "it", "Lzy11;", "<anonymous>", "(Lcom/yandex/mapkit/ScreenRect;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.preorder.map.RouteAnimationsHolderImpl$launchAnimationJob$1$1", f = "RouteAnimationsHolderImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.preorder.map.RouteAnimationsHolderImpl$launchAnimationJob$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ sls $rectHookAnimation;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(sls slsVar, Continuation continuation) {
            super(2, continuation);
            this.$rectHookAnimation = slsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$rectHookAnimation, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((ScreenRect) obj, (Continuation) obj2);
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
            this.$rectHookAnimation.invoke();
            return zy11.a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
    @mvg(c = "com.yandex.go.preorder.map.RouteAnimationsHolderImpl$launchAnimationJob$1$2", f = "RouteAnimationsHolderImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.preorder.map.RouteAnimationsHolderImpl$launchAnimationJob$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        /* synthetic */ int I$0;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(2, continuation);
            anonymousClass2.I$0 = ((Number) obj).intValue();
            return anonymousClass2;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = this.I$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                kotlin.b.b(obj);
                return Boolean.valueOf(i == 0);
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteAnimationsHolderImpl$launchAnimationJob$1(a aVar, sls slsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$rectHookAnimation = slsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RouteAnimationsHolderImpl$launchAnimationJob$1(this.this$0, this.$rectHookAnimation, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RouteAnimationsHolderImpl$launchAnimationJob$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        if (kotlinx.coroutines.flow.e.z(r9, r1, r8) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        if (kotlinx.coroutines.flow.e.y(r9, r8) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.a.requestFocusRect();
            tpr p = e.p(new jqr(this.this$0.a.m1(), new AnonymousClass1(this.$rectHookAnimation, null), 3), 250L);
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                a aVar = this.this$0;
                aVar.a(aVar.p);
                boolean z = aVar.p;
                xfv0 xfv0Var = aVar.d;
                if (z) {
                    xfv0Var.a(nfv0.a);
                    j jVar = aVar.e;
                    if (jVar.d.g()) {
                        jVar.l.a(false);
                    }
                } else {
                    xfv0Var.a(ofv0.a);
                }
                aVar.f.g();
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        r0 r0Var = this.this$0.l;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(2, null);
        this.label = 2;
    }
}
