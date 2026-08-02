package com.yandex.go.flex.main_screen.domain;

import com.yandex.go.flex.main_screen.api.domain.SuperappTopPlaqueType;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pwz0;
import defpackage.qit0;
import defpackage.taw0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.w511;
import defpackage.wls;
import defpackage.z131;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.flex.main_screen.domain.SuperappFlexAddressInteractor$launchVariableUpdates$1", f = "SuperappFlexAddressInteractor.kt", l = {38, 45, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class SuperappFlexAddressInteractor$launchVariableUpdates$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ g this$0;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.flex.main_screen.domain.SuperappFlexAddressInteractor$launchVariableUpdates$1$1, reason: invalid class name */
    /* loaded from: classes12.dex */
    final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements zls {
        public static final AnonymousClass1 a = new AnonymousClass1(3, 4, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V");

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return new Pair((String) obj, (pwz0) obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperappFlexAddressInteractor$launchVariableUpdates$1(g gVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperappFlexAddressInteractor$launchVariableUpdates$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperappFlexAddressInteractor$launchVariableUpdates$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0092, code lost:
    
        if (r7 == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e1, code lost:
    
        if (r7 == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0031, code lost:
    
        if (r7 == r0) goto L28;
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
            h hVar = this.this$0.f;
            this.label = 1;
            obj = hVar.a(this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        int i2 = taw0.a[((SuperappTopPlaqueType) obj).ordinal()];
        if (i2 == 1) {
            tpr t = kotlinx.coroutines.flow.e.t(new m0(com.yandex.go.coroutines.b.d(kotlinx.coroutines.flow.e.t(new e((com.yandex.go.route.interactor.g) this.this$0.c.f())), new SuperappFlexAddressInteractor$launchVariableUpdates$1$invokeSuspend$$inlined$start$1(null, null)), this.this$0.e.a(), AnonymousClass1.a));
            this.this$0.a.getClass();
            tpr F = kotlinx.coroutines.flow.e.F(t, uyj.a);
            f fVar = new f(this.this$0);
            this.label = 2;
            obj = F.collect(fVar, this);
        } else {
            if (i2 != 2 && i2 != 3) {
                w511.b();
                return null;
            }
            this.this$0.b.i(new z131("superapp.location_state", SuperappFlexAddressInteractor$LocationState.OK.getRawValue()));
            tpr t2 = kotlinx.coroutines.flow.e.t(new e((com.yandex.go.route.interactor.g) this.this$0.c.f()));
            this.this$0.a.getClass();
            tpr F2 = kotlinx.coroutines.flow.e.F(t2, uyj.a);
            qit0 qit0Var = new qit0(19, this.this$0);
            this.label = 3;
            obj = F2.collect(qit0Var, this);
        }
        return coroutineSingletons;
    }
}
