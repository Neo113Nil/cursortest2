package com.yandex.go.drive.sdkintegration.domain.session.unified_polling;

import com.yandex.go.drive.sdkintegration.domain.session.f;
import defpackage.jl40;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rsn;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.j0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.drive.sdkintegration.domain.session.unified_polling.UnifiedPollingSessionStateInteractor$collectDriveStateAndPreloadNativeSessionIfNeeded$1", f = "UnifiedPollingSessionStateInteractor.kt", l = {HProv.ALG_SID_SHA3_224}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class UnifiedPollingSessionStateInteractor$collectDriveStateAndPreloadNativeSessionIfNeeded$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ e this$0;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lrsn;", "", "Lcom/yandex/go/drive/api/models/GoDriveSessionState;", "holder", "Lzy11;", "<anonymous>", "(Lrsn;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.drive.sdkintegration.domain.session.unified_polling.UnifiedPollingSessionStateInteractor$collectDriveStateAndPreloadNativeSessionIfNeeded$1$2", f = "UnifiedPollingSessionStateInteractor.kt", l = {83}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.drive.sdkintegration.domain.session.unified_polling.UnifiedPollingSessionStateInteractor$collectDriveStateAndPreloadNativeSessionIfNeeded$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ e this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(e eVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((rsn) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AtomicReference atomicReference;
            rsn rsnVar = (rsn) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                List list = (List) rsnVar.b;
                Object obj2 = (List) rsnVar.a;
                if (obj2 == null) {
                    obj2 = EmptyList.a;
                }
                if (!jl40.l(list, obj2)) {
                    e eVar = this.this$0;
                    atomicReference = eVar.e;
                    f fVar = (f) eVar.b.get();
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = atomicReference;
                    this.label = 1;
                    obj = fVar.a(this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11.a;
            }
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            atomicReference = (AtomicReference) this.L$3;
            kotlin.b.b(obj);
            atomicReference.set(obj);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnifiedPollingSessionStateInteractor$collectDriveStateAndPreloadNativeSessionIfNeeded$1(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UnifiedPollingSessionStateInteractor$collectDriveStateAndPreloadNativeSessionIfNeeded$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UnifiedPollingSessionStateInteractor$collectDriveStateAndPreloadNativeSessionIfNeeded$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            mth mthVar = new mth(new j0(null, kotlinx.coroutines.flow.e.t(new b(new mth(this.this$0.c, 6))), new UnifiedPollingSessionStateInteractor$collectDriveStateAndPreloadNativeSessionIfNeeded$1$invokeSuspend$$inlined$withPreviousEmit$1(3, null)), 6);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
            this.label = 1;
            if (kotlinx.coroutines.flow.e.k(mthVar, anonymousClass2, this) == coroutineSingletons) {
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
