package com.yandex.passport.internal.ui.sloth.authsdk;

import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.report.reporters.i1;
import com.yandex.passport.sloth.data.SlothParams;
import com.yandex.passport.sloth.ui.b1;
import com.yandex.passport.sloth.ui.u0;
import defpackage.bvf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ll8x;", "<anonymous>", "(Ltse;)Ll8x;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.sloth.authsdk.AuthSdkSlothActivity$bind$2", f = "AuthSdkSlothActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AuthSdkSlothActivity$bind$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AuthSdkSlothActivity this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
    @mvg(c = "com.yandex.passport.internal.ui.sloth.authsdk.AuthSdkSlothActivity$bind$2$1", f = "AuthSdkSlothActivity.kt", l = {HProv.PP_FAST_CODE}, m = "invokeSuspend")
    /* renamed from: com.yandex.passport.internal.ui.sloth.authsdk.AuthSdkSlothActivity$bind$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ AuthSdkSlothActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AuthSdkSlothActivity authSdkSlothActivity, Continuation continuation) {
            super(2, continuation);
            this.this$0 = authSdkSlothActivity;
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
            i iVar;
            i0 viewModel;
            i iVar2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                iVar = this.this$0.component;
                if (iVar == null) {
                    iVar = null;
                }
                SlothParams params = iVar.getParams();
                viewModel = this.this$0.getViewModel();
                this.label = 1;
                obj = viewModel.W(params, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            b1 b1Var = (b1) obj;
            iVar2 = this.this$0.component;
            ((com.yandex.passport.sloth.ui.d0) (iVar2 != null ? iVar2 : null).getUi().b.c.getValue()).c(new u0(b1Var));
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthSdkSlothActivity$bind$2(AuthSdkSlothActivity authSdkSlothActivity, Continuation continuation) {
        super(2, continuation);
        this.this$0 = authSdkSlothActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AuthSdkSlothActivity$bind$2 authSdkSlothActivity$bind$2 = new AuthSdkSlothActivity$bind$2(this.this$0, continuation);
        authSdkSlothActivity$bind$2.L$0 = obj;
        return authSdkSlothActivity$bind$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AuthSdkSlothActivity$bind$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PassportProcessGlobalComponent passportProcessGlobalComponent;
        i0 viewModel;
        i0 viewModel2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        tje.N((tse) this.L$0, null, null, new AnonymousClass1(this.this$0, null), 3);
        passportProcessGlobalComponent = this.this$0.globalComponent;
        if (passportProcessGlobalComponent == null) {
            passportProcessGlobalComponent = null;
        }
        i1 webAmReporter = passportProcessGlobalComponent.getWebAmReporter();
        viewModel = this.this$0.getViewModel();
        tje.N(bvf0.a(get_context()), null, null, new AuthSdkSlothActivity$bind$2$invokeSuspend$$inlined$collectOn$1(viewModel.w, null, this.this$0, webAmReporter), 3);
        viewModel2 = this.this$0.getViewModel();
        return tje.N(bvf0.a(get_context()), null, null, new AuthSdkSlothActivity$bind$2$invokeSuspend$$inlined$collectOn$2(viewModel2.x, null, this.this$0, webAmReporter), 3);
    }
}
