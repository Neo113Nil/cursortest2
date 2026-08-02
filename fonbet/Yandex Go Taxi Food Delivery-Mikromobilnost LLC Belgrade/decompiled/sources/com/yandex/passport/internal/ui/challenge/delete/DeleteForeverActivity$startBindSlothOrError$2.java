package com.yandex.passport.internal.ui.challenge.delete;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.properties.PassportDeleteAccountPropertiesImpl;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.challenge.delete.DeleteForeverActivity$startBindSlothOrError$2", f = "DeleteForeverActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class DeleteForeverActivity$startBindSlothOrError$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DeleteForeverActivity this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
    @mvg(c = "com.yandex.passport.internal.ui.challenge.delete.DeleteForeverActivity$startBindSlothOrError$2$1", f = "DeleteForeverActivity.kt", l = {201, 203}, m = "invokeSuspend")
    /* renamed from: com.yandex.passport.internal.ui.challenge.delete.DeleteForeverActivity$startBindSlothOrError$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ DeleteForeverActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DeleteForeverActivity deleteForeverActivity, Continuation continuation) {
            super(2, continuation);
            this.this$0 = deleteForeverActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
        
            if (r8 == r0) goto L17;
         */
        /* JADX WARN: Removed duplicated region for block: B:9:0x009b  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            i0 component;
            i0 component2;
            Object value;
            i0 component3;
            DeleteForeverActivity deleteForeverActivity;
            Throwable a;
            i0 component4;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                component = this.this$0.getComponent();
                com.yandex.passport.internal.usecase.k0 getLocationIdUseCase = component.getGetLocationIdUseCase();
                component2 = this.this$0.getComponent();
                Uid B = com.yandex.passport.internal.util.p.B(component2.getProperties().getUid());
                this.label = 1;
                obj = getLocationIdUseCase.a(B, this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    deleteForeverActivity = (DeleteForeverActivity) this.L$1;
                    value = this.L$0;
                    kotlin.b.b(obj);
                    component4 = deleteForeverActivity.getComponent();
                    ((com.yandex.passport.sloth.ui.d0) component4.getDeleteForeverSlothUi().b.e.getValue()).c(new com.yandex.passport.sloth.ui.u0((com.yandex.passport.sloth.ui.b1) obj));
                    DeleteForeverActivity deleteForeverActivity2 = this.this$0;
                    a = Result.a(value);
                    if (a != null) {
                        deleteForeverActivity2.reloginOrError(a);
                    }
                    return zy11.a;
                }
                kotlin.b.b(obj);
            }
            value = ((Result) obj).getValue();
            DeleteForeverActivity deleteForeverActivity3 = this.this$0;
            if (!(value instanceof Result.Failure)) {
                long longValue = ((Number) value).longValue();
                f1 viewModel = deleteForeverActivity3.getViewModel();
                component3 = deleteForeverActivity3.getComponent();
                PassportDeleteAccountPropertiesImpl properties = component3.getProperties();
                this.L$0 = value;
                this.L$1 = deleteForeverActivity3;
                this.label = 2;
                Object X = viewModel.X(properties, longValue, this);
                if (X != coroutineSingletons) {
                    deleteForeverActivity = deleteForeverActivity3;
                    obj = X;
                    component4 = deleteForeverActivity.getComponent();
                    ((com.yandex.passport.sloth.ui.d0) component4.getDeleteForeverSlothUi().b.e.getValue()).c(new com.yandex.passport.sloth.ui.u0((com.yandex.passport.sloth.ui.b1) obj));
                }
                return coroutineSingletons;
            }
            DeleteForeverActivity deleteForeverActivity22 = this.this$0;
            a = Result.a(value);
            if (a != null) {
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteForeverActivity$startBindSlothOrError$2(DeleteForeverActivity deleteForeverActivity, Continuation continuation) {
        super(2, continuation);
        this.this$0 = deleteForeverActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DeleteForeverActivity$startBindSlothOrError$2 deleteForeverActivity$startBindSlothOrError$2 = new DeleteForeverActivity$startBindSlothOrError$2(this.this$0, continuation);
        deleteForeverActivity$startBindSlothOrError$2.L$0 = obj;
        return deleteForeverActivity$startBindSlothOrError$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DeleteForeverActivity$startBindSlothOrError$2 deleteForeverActivity$startBindSlothOrError$2 = (DeleteForeverActivity$startBindSlothOrError$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        deleteForeverActivity$startBindSlothOrError$2.invokeSuspend(zy11Var);
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
        tje.N((tse) this.L$0, null, null, new AnonymousClass1(this.this$0, null), 3);
        return zy11.a;
    }
}
