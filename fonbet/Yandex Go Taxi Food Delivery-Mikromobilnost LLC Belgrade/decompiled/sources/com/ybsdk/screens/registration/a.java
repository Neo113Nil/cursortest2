package com.ybsdk.screens.registration;

import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.ybsdk.api.entities.YBProduct;
import com.ybsdk.api.pro.entities.RegistrationType$OngoingOperation;
import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.deeplink.api.Deeplink;
import com.ybsdk.rconfig.b;
import com.ybsdk.screens.changephone.presentation.ChangePhoneStatusFragment;
import com.ybsdk.screens.changephone.presentation.ChangePhoneStatusScreenParams;
import com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationFinishStrategy;
import com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationParams;
import com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationTarget;
import com.ybsdk.screens.registration.data.c;
import com.ybsdk.screens.registration.phoneconfirmation.presentation.PhoneConfirmationFragment;
import com.ybsdk.screens.registration.phoneconfirmation.presentation.PhoneConfirmationParams;
import defpackage.a3h;
import defpackage.cri0;
import defpackage.hri0;
import defpackage.kcs;
import defpackage.kg51;
import defpackage.ny61;
import defpackage.qoi0;
import defpackage.tc9;
import defpackage.w691;
import defpackage.x4c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a implements kcs {
    public final /* synthetic */ tc9 a;
    public final hri0 b;
    public final kg51 c;
    public final c d;
    public final b e;
    public final com.ybsdk.common.repositiories.onboarding.a f;
    public final a3h g;

    public a(hri0 hri0Var, kg51 kg51Var, c cVar, b bVar, com.ybsdk.common.repositiories.onboarding.a aVar, a3h a3hVar, Map map) {
        this.a = new tc9(map, 10);
        this.b = hri0Var;
        this.c = kg51Var;
        this.d = cVar;
        this.e = bVar;
        this.f = aVar;
        this.g = a3hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Map] */
    public static FragmentScreen d(a aVar, YBProduct yBProduct, LinkedHashMap linkedHashMap, boolean z, String str, int i) {
        LinkedHashMap f = (i & 2) != 0 ? kotlin.collections.b.f() : linkedHashMap;
        RegistrationType$OngoingOperation registrationType$OngoingOperation = RegistrationType$OngoingOperation.REGISTRATION;
        boolean z2 = (i & 8) != 0 ? true : z;
        hri0 hri0Var = aVar.b;
        PhoneConfirmationParams phoneConfirmationParams = new PhoneConfirmationParams(yBProduct, f, registrationType$OngoingOperation, false, z2, str);
        hri0Var.getClass();
        return new FragmentScreen("PhoneConfirmationScreen", false, phoneConfirmationParams, null, qoi0.a(PhoneConfirmationFragment.class), OpenScreenRequirement.WithUid.INSTANCE, 10, null);
    }

    public static FragmentScreen e(a aVar, CodeConfirmationParams.HeaderText headerText, String str, CodeConfirmationParams.HeaderImage headerImage, Text text, boolean z, Integer num, CodeConfirmationFinishStrategy codeConfirmationFinishStrategy, String str2, OpenScreenRequirement openScreenRequirement, boolean z2, CodeConfirmationTarget codeConfirmationTarget, int i) {
        CodeConfirmationParams.HeaderImage headerImage2 = (i & 4) != 0 ? null : headerImage;
        Text text2 = (i & 8) != 0 ? null : text;
        Integer num2 = (i & 32) != 0 ? null : num;
        CodeConfirmationFinishStrategy codeConfirmationFinishStrategy2 = (i & 64) != 0 ? CodeConfirmationFinishStrategy.None.INSTANCE : codeConfirmationFinishStrategy;
        boolean z3 = (i & 128) != 0;
        String str3 = (i & 256) != 0 ? "request_key_authorization" : str2;
        boolean z4 = (i & 1024) != 0 ? false : z2;
        CodeConfirmationTarget codeConfirmationTarget2 = (i & 2048) != 0 ? CodeConfirmationTarget.YbAuthorization.INSTANCE : codeConfirmationTarget;
        hri0 hri0Var = aVar.b;
        CodeConfirmationParams.Authorization authorization = new CodeConfirmationParams.Authorization(headerText, text2, str, headerImage2, z, z4, num2, codeConfirmationFinishStrategy2, z3, codeConfirmationTarget2, str3);
        hri0Var.getClass();
        return hri0.a(authorization, openScreenRequirement);
    }

    @Override // defpackage.kcs
    public final Fragment a(String str) {
        return this.a.a(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        RegistrationFeature$getRegistrationNext$1 registrationFeature$getRegistrationNext$1;
        int i;
        Object a;
        Throwable a2;
        if (continuationImpl instanceof RegistrationFeature$getRegistrationNext$1) {
            registrationFeature$getRegistrationNext$1 = (RegistrationFeature$getRegistrationNext$1) continuationImpl;
            int i2 = registrationFeature$getRegistrationNext$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                registrationFeature$getRegistrationNext$1.label = i2 - Integer.MIN_VALUE;
                Object obj = registrationFeature$getRegistrationNext$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = registrationFeature$getRegistrationNext$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    registrationFeature$getRegistrationNext$1.label = 1;
                    a = this.f.a(str2, str, str3, registrationFeature$getRegistrationNext$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                }
                a2 = Result.a(a);
                if (a2 == null) {
                    x4c.g("Exception while getRegistrationNext() in RegistrationApplicationStatusViewModel", a2, null, null, 12);
                    return new Result.Failure(a2);
                }
                List list = ((cri0) a).a;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Deeplink e = w691.e(this.g, Uri.parse((String) it.next()), true, null, false, 12);
                    if (e != null) {
                        arrayList.add(e);
                    }
                }
                return arrayList;
            }
        }
        registrationFeature$getRegistrationNext$1 = new RegistrationFeature$getRegistrationNext$1(this, continuationImpl);
        Object obj2 = registrationFeature$getRegistrationNext$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = registrationFeature$getRegistrationNext$1.label;
        if (i != 0) {
        }
        a2 = Result.a(a);
        if (a2 == null) {
        }
    }

    public final FragmentScreen c(String str, boolean z, ChangePhoneStatusScreenParams.Status status) {
        this.c.getClass();
        ChangePhoneStatusScreenParams changePhoneStatusScreenParams = new ChangePhoneStatusScreenParams(str, z, false, status);
        this.b.getClass();
        return new FragmentScreen("ChangePhoneStatusScreen", false, changePhoneStatusScreenParams, null, qoi0.a(ChangePhoneStatusFragment.class), OpenScreenRequirement.WithUid.INSTANCE, 10, null);
    }
}
