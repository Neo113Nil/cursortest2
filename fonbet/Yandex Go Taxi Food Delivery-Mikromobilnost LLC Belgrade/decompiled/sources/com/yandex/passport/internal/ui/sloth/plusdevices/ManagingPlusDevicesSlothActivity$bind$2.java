package com.yandex.passport.internal.ui.sloth.plusdevices;

import com.yandex.passport.sloth.data.SlothParams;
import com.yandex.passport.sloth.ui.b1;
import com.yandex.passport.sloth.ui.u0;
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
@mvg(c = "com.yandex.passport.internal.ui.sloth.plusdevices.ManagingPlusDevicesSlothActivity$bind$2", f = "ManagingPlusDevicesSlothActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ManagingPlusDevicesSlothActivity$bind$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ManagingPlusDevicesSlothActivity this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
    @mvg(c = "com.yandex.passport.internal.ui.sloth.plusdevices.ManagingPlusDevicesSlothActivity$bind$2$1", f = "ManagingPlusDevicesSlothActivity.kt", l = {HProv.PP_SECURITY_LEVEL}, m = "invokeSuspend")
    /* renamed from: com.yandex.passport.internal.ui.sloth.plusdevices.ManagingPlusDevicesSlothActivity$bind$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ ManagingPlusDevicesSlothActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ManagingPlusDevicesSlothActivity managingPlusDevicesSlothActivity, Continuation continuation) {
            super(2, continuation);
            this.this$0 = managingPlusDevicesSlothActivity;
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
            v viewModel;
            com.yandex.passport.internal.ui.sloth.r rVar;
            com.yandex.passport.internal.ui.sloth.r rVar2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                viewModel = this.this$0.getViewModel();
                rVar = this.this$0.component;
                if (rVar == null) {
                    rVar = null;
                }
                SlothParams params = rVar.getParams();
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
            rVar2 = this.this$0.component;
            ((com.yandex.passport.sloth.ui.d0) (rVar2 != null ? rVar2 : null).getUi().b.d.getValue()).c(new u0(b1Var));
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManagingPlusDevicesSlothActivity$bind$2(ManagingPlusDevicesSlothActivity managingPlusDevicesSlothActivity, Continuation continuation) {
        super(2, continuation);
        this.this$0 = managingPlusDevicesSlothActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ManagingPlusDevicesSlothActivity$bind$2 managingPlusDevicesSlothActivity$bind$2 = new ManagingPlusDevicesSlothActivity$bind$2(this.this$0, continuation);
        managingPlusDevicesSlothActivity$bind$2.L$0 = obj;
        return managingPlusDevicesSlothActivity$bind$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ManagingPlusDevicesSlothActivity$bind$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return tje.N((tse) this.L$0, null, null, new AnonymousClass1(this.this$0, null), 3);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
