package com.yandex.passport.internal.ui.sloth.menu;

import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.properties.UserMenuProperties;
import com.yandex.passport.internal.report.reporters.i1;
import com.yandex.passport.sloth.ui.b1;
import com.yandex.passport.sloth.ui.d0;
import com.yandex.passport.sloth.ui.u0;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.bvf0;
import defpackage.mns0;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ll8x;", "<anonymous>", "(Ltse;)Ll8x;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.sloth.menu.UserMenuActivity$bindOrError$2", f = "UserMenuActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class UserMenuActivity$bindOrError$2 extends SuspendLambda implements wls {
    final /* synthetic */ UserMenuProperties $userMenuProperties;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ UserMenuActivity this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
    @mvg(c = "com.yandex.passport.internal.ui.sloth.menu.UserMenuActivity$bindOrError$2$1", f = "UserMenuActivity.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.TRANSLATE_KIT_VALUE}, m = "invokeSuspend")
    /* renamed from: com.yandex.passport.internal.ui.sloth.menu.UserMenuActivity$bindOrError$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ ModernAccount $account;
        final /* synthetic */ UserMenuProperties $userMenuProperties;
        int label;
        final /* synthetic */ UserMenuActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UserMenuActivity userMenuActivity, UserMenuProperties userMenuProperties, ModernAccount modernAccount, Continuation continuation) {
            super(2, continuation);
            this.this$0 = userMenuActivity;
            this.$userMenuProperties = userMenuProperties;
            this.$account = modernAccount;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$userMenuProperties, this.$account, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            s viewModel;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                viewModel = this.this$0.getViewModel();
                UserMenuProperties userMenuProperties = this.$userMenuProperties;
                ModernAccount modernAccount = this.$account;
                this.label = 1;
                obj = viewModel.W(userMenuProperties, modernAccount, this);
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
            e eVar = this.this$0.component;
            h hVar = (eVar != null ? eVar : null).getUiController().a;
            ((d0) hVar.c.d.getValue()).c(new u0(b1Var));
            ((FrameLayout) new mns0((d0) hVar.c.d.getValue()).getRoot()).setVisibility(0);
            ((LinearLayout) hVar.w.getRoot()).setVisibility(8);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserMenuActivity$bindOrError$2(UserMenuActivity userMenuActivity, UserMenuProperties userMenuProperties, Continuation continuation) {
        super(2, continuation);
        this.this$0 = userMenuActivity;
        this.$userMenuProperties = userMenuProperties;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UserMenuActivity$bindOrError$2 userMenuActivity$bindOrError$2 = new UserMenuActivity$bindOrError$2(this.this$0, this.$userMenuProperties, continuation);
        userMenuActivity$bindOrError$2.L$0 = obj;
        return userMenuActivity$bindOrError$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UserMenuActivity$bindOrError$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PassportProcessGlobalComponent passportProcessGlobalComponent;
        PassportProcessGlobalComponent passportProcessGlobalComponent2;
        s viewModel;
        s viewModel2;
        s viewModel3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        tse tseVar = (tse) this.L$0;
        passportProcessGlobalComponent = this.this$0.globalComponent;
        if (passportProcessGlobalComponent == null) {
            passportProcessGlobalComponent = null;
        }
        tje.N(tseVar, null, null, new AnonymousClass1(this.this$0, this.$userMenuProperties, passportProcessGlobalComponent.getCurrentAccountManager().a(), null), 3);
        passportProcessGlobalComponent2 = this.this$0.globalComponent;
        if (passportProcessGlobalComponent2 == null) {
            passportProcessGlobalComponent2 = null;
        }
        i1 webAmReporter = passportProcessGlobalComponent2.getWebAmReporter();
        viewModel = this.this$0.getViewModel();
        tje.N(bvf0.a(get_context()), null, null, new UserMenuActivity$bindOrError$2$invokeSuspend$$inlined$collectOn$1(viewModel.b, null, webAmReporter), 3);
        viewModel2 = this.this$0.getViewModel();
        tje.N(bvf0.a(get_context()), null, null, new UserMenuActivity$bindOrError$2$invokeSuspend$$inlined$collectOn$2(viewModel2.c, null, this.this$0, webAmReporter), 3);
        viewModel3 = this.this$0.getViewModel();
        return tje.N(bvf0.a(get_context()), null, null, new UserMenuActivity$bindOrError$2$invokeSuspend$$inlined$collectOn$3(viewModel3.w, null, this.this$0), 3);
    }
}
