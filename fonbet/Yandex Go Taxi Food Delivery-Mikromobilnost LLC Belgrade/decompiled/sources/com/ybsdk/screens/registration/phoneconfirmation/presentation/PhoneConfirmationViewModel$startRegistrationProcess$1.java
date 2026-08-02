package com.ybsdk.screens.registration.phoneconfirmation.presentation;

import com.ybsdk.api.entities.YBProduct;
import com.ybsdk.screens.registration.domain.RegistrationPhone;
import defpackage.ds31;
import defpackage.heb0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.r8j0;
import defpackage.s8j0;
import defpackage.t8j0;
import defpackage.tje;
import defpackage.tse;
import defpackage.u8j0;
import defpackage.wls;
import defpackage.yqi0;
import defpackage.z94;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.screens.registration.phoneconfirmation.presentation.PhoneConfirmationViewModel$startRegistrationProcess$1", f = "PhoneConfirmationViewModel.kt", l = {66}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PhoneConfirmationViewModel$startRegistrationProcess$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneConfirmationViewModel$startRegistrationProcess$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PhoneConfirmationViewModel$startRegistrationProcess$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PhoneConfirmationViewModel$startRegistrationProcess$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        Object obj2;
        r0 r0Var2;
        Object value2;
        r0 r0Var3;
        Object value3;
        heb0 heb0Var;
        r8j0 r8j0Var;
        RegistrationPhone.UserCustomPhoneEntity userCustomPhoneEntity;
        boolean z;
        yqi0 yqi0Var;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            z94 z94Var = aVar.F.b0;
            Map<String, String> additionalRegistrationParams = aVar.B.getAdditionalRegistrationParams();
            LinkedHashMap linkedHashMap = new LinkedHashMap(1);
            linkedHashMap.put(Constants.KEY_DATA, additionalRegistrationParams);
            z94Var.a.a("registration.initiated", linkedHashMap);
            pz40 Y = this.this$0.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, heb0.a((heb0) value, new t8j0(), null, null, false, null, false, 254)));
            a aVar2 = this.this$0;
            com.ybsdk.screens.registration.domain.interactors.a aVar3 = aVar2.D;
            YBProduct product = aVar2.B.getProduct();
            Map<String, String> additionalRegistrationParams2 = this.this$0.B.getAdditionalRegistrationParams();
            this.label = 1;
            Object e = aVar3.e(product, additionalRegistrationParams2, this);
            if (e == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj2 = e;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            obj2 = ((Result) obj).getValue();
        }
        a aVar4 = this.this$0;
        if (!(obj2 instanceof Result.Failure)) {
            yqi0 yqi0Var2 = (yqi0) obj2;
            z94 z94Var2 = aVar4.F.b0;
            RegistrationPhone registrationPhone = yqi0Var2.b;
            boolean z2 = registrationPhone != null;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(1);
            linkedHashMap2.put("phone_number_suggested", Boolean.valueOf(z2));
            z94Var2.a.a("registration.loaded", linkedHashMap2);
            pz40 Y2 = aVar4.Y();
            do {
                r0Var3 = (r0) Y2;
                value3 = r0Var3.getValue();
                heb0Var = (heb0) value3;
                r8j0Var = new r8j0(yqi0Var2, null, 14);
                userCustomPhoneEntity = registrationPhone instanceof RegistrationPhone.UserCustomPhoneEntity ? (RegistrationPhone.UserCustomPhoneEntity) registrationPhone : null;
                z = registrationPhone instanceof RegistrationPhone.PredefinedPhoneEntity;
            } while (!r0Var3.k(value3, heb0.a(heb0Var, r8j0Var, null, null, z, userCustomPhoneEntity != null ? userCustomPhoneEntity.getPhone() : null, z, 78)));
            if (z) {
                RegistrationPhone.PredefinedPhoneEntity predefinedPhoneEntity = (RegistrationPhone.PredefinedPhoneEntity) registrationPhone;
                u8j0 u8j0Var = ((heb0) aVar4.X()).a;
                if (u8j0Var != null && (yqi0Var = (yqi0) u8j0Var.a()) != null && (str = yqi0Var.a) != null) {
                    tje.N(ds31.a(aVar4), null, null, new PhoneConfirmationViewModel$startConfirmation$1(aVar4, str, predefinedPhoneEntity, null), 3);
                }
            }
        }
        a aVar5 = this.this$0;
        Throwable a = Result.a(obj2);
        if (a != null) {
            pz40 Y3 = aVar5.Y();
            do {
                r0Var2 = (r0) Y3;
                value2 = r0Var2.getValue();
            } while (!r0Var2.k(value2, heb0.a((heb0) value2, new s8j0(a), null, null, false, null, false, 254)));
        }
        return zy11.a;
    }
}
