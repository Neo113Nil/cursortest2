package com.ybsdk.screens.registration.phoneconfirmation.domain.interactors;

import com.ybsdk.di.modules.e;
import com.ybsdk.screens.registration.data.c;
import com.ybsdk.screens.registration.domain.RegistrationPhone;
import defpackage.ny61;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a {
    public final e a;
    public final c b;

    public a(e eVar, c cVar) {
        this.a = eVar;
        this.b = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (r6.a.a(r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, RegistrationPhone registrationPhone, ContinuationImpl continuationImpl) {
        PhoneConfirmationInteractor$startConfirmation$1 phoneConfirmationInteractor$startConfirmation$1;
        int i;
        if (continuationImpl instanceof PhoneConfirmationInteractor$startConfirmation$1) {
            phoneConfirmationInteractor$startConfirmation$1 = (PhoneConfirmationInteractor$startConfirmation$1) continuationImpl;
            int i2 = phoneConfirmationInteractor$startConfirmation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                phoneConfirmationInteractor$startConfirmation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = phoneConfirmationInteractor$startConfirmation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = phoneConfirmationInteractor$startConfirmation$1.label;
                if (i != 0) {
                    b.b(obj);
                    phoneConfirmationInteractor$startConfirmation$1.L$0 = str;
                    phoneConfirmationInteractor$startConfirmation$1.L$1 = registrationPhone;
                    phoneConfirmationInteractor$startConfirmation$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    registrationPhone = (RegistrationPhone) phoneConfirmationInteractor$startConfirmation$1.L$1;
                    str = (String) phoneConfirmationInteractor$startConfirmation$1.L$0;
                    b.b(obj);
                    ((Result) obj).getClass();
                }
                phoneConfirmationInteractor$startConfirmation$1.L$0 = null;
                phoneConfirmationInteractor$startConfirmation$1.L$1 = null;
                phoneConfirmationInteractor$startConfirmation$1.label = 2;
                Object a = this.b.a(str, registrationPhone, phoneConfirmationInteractor$startConfirmation$1);
                return a != coroutineSingletons ? coroutineSingletons : a;
            }
        }
        phoneConfirmationInteractor$startConfirmation$1 = new PhoneConfirmationInteractor$startConfirmation$1(this, continuationImpl);
        Object obj2 = phoneConfirmationInteractor$startConfirmation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = phoneConfirmationInteractor$startConfirmation$1.label;
        if (i != 0) {
        }
        phoneConfirmationInteractor$startConfirmation$1.L$0 = null;
        phoneConfirmationInteractor$startConfirmation$1.L$1 = null;
        phoneConfirmationInteractor$startConfirmation$1.label = 2;
        Object a2 = this.b.a(str, registrationPhone, phoneConfirmationInteractor$startConfirmation$1);
        if (a2 != coroutineSingletons2) {
        }
    }
}
