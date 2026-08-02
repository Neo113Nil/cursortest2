package com.yandex.passport.internal.ui.bouncer.loading;

import com.yandex.passport.internal.ui.bouncer.model.a2;
import defpackage.jqr;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.bouncer.loading.WaitConnectionContentKt$WaitConnectionContent$1$1", f = "WaitConnectionContent.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class WaitConnectionContentKt$WaitConnectionContent$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ a2 $data;
    final /* synthetic */ oz40 $isButtonReadyToShow$delegate;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lzy11;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 0, 0})
    @mvg(c = "com.yandex.passport.internal.ui.bouncer.loading.WaitConnectionContentKt$WaitConnectionContent$1$1$1", f = "WaitConnectionContent.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.yandex.passport.internal.ui.bouncer.loading.WaitConnectionContentKt$WaitConnectionContent$1$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ oz40 $isButtonReadyToShow$delegate;
        /* synthetic */ boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(oz40 oz40Var, Continuation continuation) {
            super(2, continuation);
            this.$isButtonReadyToShow$delegate = oz40Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$isButtonReadyToShow$delegate, continuation);
            anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create(bool, (Continuation) obj2);
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
            this.$isButtonReadyToShow$delegate.setValue(Boolean.valueOf(this.Z$0));
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WaitConnectionContentKt$WaitConnectionContent$1$1(a2 a2Var, oz40 oz40Var, Continuation continuation) {
        super(2, continuation);
        this.$data = a2Var;
        this.$isButtonReadyToShow$delegate = oz40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        WaitConnectionContentKt$WaitConnectionContent$1$1 waitConnectionContentKt$WaitConnectionContent$1$1 = new WaitConnectionContentKt$WaitConnectionContent$1$1(this.$data, this.$isButtonReadyToShow$delegate, continuation);
        waitConnectionContentKt$WaitConnectionContent$1$1.L$0 = obj;
        return waitConnectionContentKt$WaitConnectionContent$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        WaitConnectionContentKt$WaitConnectionContent$1$1 waitConnectionContentKt$WaitConnectionContent$1$1 = (WaitConnectionContentKt$WaitConnectionContent$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        waitConnectionContentKt$WaitConnectionContent$1$1.invokeSuspend(zy11Var);
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
        kotlinx.coroutines.flow.e.H((tse) this.L$0, new jqr(kotlinx.coroutines.flow.e.t((n0) this.$data.b.b), new AnonymousClass1(this.$isButtonReadyToShow$delegate, null), 3));
        return zy11.a;
    }
}
