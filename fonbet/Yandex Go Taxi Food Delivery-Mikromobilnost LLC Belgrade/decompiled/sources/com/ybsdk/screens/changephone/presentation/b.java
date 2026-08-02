package com.ybsdk.screens.changephone.presentation;

import com.ybsdk.common.repositiories.applications.poller.ApplicationStatusFailedException;
import com.ybsdk.core.analytics.generated.delegates.ChangePhoneEvents$ChangePhoneStateChangedState;
import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationParams;
import defpackage.dzh0;
import defpackage.ee9;
import defpackage.hri0;
import defpackage.jl40;
import defpackage.le9;
import defpackage.me9;
import defpackage.n2e0;
import defpackage.ny61;
import defpackage.o2e0;
import defpackage.od9;
import defpackage.oe9;
import defpackage.p2e0;
import defpackage.pe9;
import defpackage.pz40;
import defpackage.q2e0;
import defpackage.r2e0;
import defpackage.s2e0;
import defpackage.tfl0;
import defpackage.unr0;
import defpackage.us3;
import defpackage.ve9;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import java.util.Collections;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class b implements vpr {
    public final /* synthetic */ c a;

    public b(c cVar) {
        this.a = cVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(s2e0 s2e0Var, Continuation continuation) {
        ChangePhoneStatusViewModel$pollChangePhoneStatus$3$emit$1 changePhoneStatusViewModel$pollChangePhoneStatus$3$emit$1;
        int i;
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        r0 r0Var3;
        Object value3;
        r0 r0Var4;
        Object value4;
        if (continuation instanceof ChangePhoneStatusViewModel$pollChangePhoneStatus$3$emit$1) {
            changePhoneStatusViewModel$pollChangePhoneStatus$3$emit$1 = (ChangePhoneStatusViewModel$pollChangePhoneStatus$3$emit$1) continuation;
            int i2 = changePhoneStatusViewModel$pollChangePhoneStatus$3$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                changePhoneStatusViewModel$pollChangePhoneStatus$3$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = changePhoneStatusViewModel$pollChangePhoneStatus$3$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = changePhoneStatusViewModel$pollChangePhoneStatus$3$emit$1.label;
                int i3 = 1;
                c cVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (s2e0Var instanceof q2e0) {
                        ee9 ee9Var = (ee9) ((q2e0) s2e0Var).a;
                        switch (ve9.a[ee9Var.a.ordinal()]) {
                            case 1:
                                Text text = ee9Var.b;
                                if (text == null) {
                                    text = Text.Empty.INSTANCE;
                                }
                                Text text2 = ee9Var.c;
                                if (text2 == null) {
                                    text2 = Text.Empty.INSTANCE;
                                }
                                cVar.h0(text, text2);
                                break;
                            case 2:
                                cVar.J.z(ChangePhoneEvents$ChangePhoneStateChangedState.SMS_CONFIRMATION);
                                com.ybsdk.feature.pinstorage.internal.data.c cVar2 = cVar.L;
                                changePhoneStatusViewModel$pollChangePhoneStatus$3$emit$1.label = 1;
                                if (cVar2.w(changePhoneStatusViewModel$pollChangePhoneStatus$3$emit$1) == coroutineSingletons) {
                                }
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                break;
                            default:
                                w511.b();
                                break;
                        }
                        return null;
                    }
                    if (s2e0Var instanceof n2e0) {
                        Throwable th = ((n2e0) s2e0Var).a;
                        if (th instanceof ApplicationStatusFailedException) {
                            ApplicationStatusFailedException applicationStatusFailedException = (ApplicationStatusFailedException) th;
                            Text title = applicationStatusFailedException.getTitle();
                            Text description = applicationStatusFailedException.getDescription();
                            String c0 = cVar.c0(applicationStatusFailedException.getSupportUrl());
                            cVar.J.y(d.a(cVar.K, title).toString(), false);
                            pz40 Y = cVar.Y();
                            do {
                                r0Var4 = (r0) Y;
                                value4 = r0Var4.getValue();
                            } while (!r0Var4.k(value4, new le9(title, description, cVar.c0(c0))));
                        } else {
                            cVar.J.y(th.getMessage(), false);
                            pz40 Y2 = cVar.Y();
                            do {
                                r0Var3 = (r0) Y2;
                                value3 = r0Var3.getValue();
                            } while (!r0Var3.k(value3, new me9(th)));
                        }
                    } else if (jl40.l(s2e0Var, r2e0.a)) {
                        cVar.J.y("timeout", false);
                        pz40 Y3 = cVar.Y();
                        do {
                            r0Var2 = (r0) Y3;
                            value2 = r0Var2.getValue();
                        } while (!r0Var2.k(value2, new le9(unr0.h(Text.Companion, dzh0.ybsdk_common_default_error), new Text.Resource(dzh0.ybsdk_common_error_view_message), cVar.c0(null))));
                    } else if (!jl40.l(s2e0Var, o2e0.a)) {
                        if (!(s2e0Var instanceof p2e0)) {
                            w511.b();
                            return null;
                        }
                        if (!(cVar.X() instanceof pe9)) {
                            p2e0 p2e0Var = (p2e0) s2e0Var;
                            boolean z = p2e0Var.d;
                            us3 us3Var = cVar.J;
                            if (z) {
                                us3Var.z(ChangePhoneEvents$ChangePhoneStateChangedState.LONG_POLLING);
                                cVar.a0(new od9(i3, cVar));
                            } else {
                                us3Var.z(ChangePhoneEvents$ChangePhoneStateChangedState.POLLING);
                                pz40 Y4 = cVar.Y();
                                do {
                                    r0Var = (r0) Y4;
                                    value = r0Var.getValue();
                                } while (!r0Var.k(value, new oe9(p2e0Var.a, p2e0Var.b, p2e0Var.c)));
                            }
                        }
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                boolean forceNavigateToInitialViewModelOnResult = cVar.B.getForceNavigateToInitialViewModelOnResult();
                tfl0 tfl0Var = cVar.E;
                com.ybsdk.screens.registration.a aVar = cVar.H;
                String applicationId = cVar.B.getApplicationId();
                hri0 hri0Var = aVar.b;
                aVar.c.getClass();
                CodeConfirmationParams.ChangePhone changePhone = new CodeConfirmationParams.ChangePhone(applicationId, false, forceNavigateToInitialViewModelOnResult, CodeConfirmationParams.HeaderImage.CloseButton.INSTANCE, null, 16, null);
                OpenScreenRequirement.WithUid withUid = OpenScreenRequirement.WithUid.INSTANCE;
                hri0Var.getClass();
                tfl0Var.i(Collections.singletonList(hri0.a(changePhone, withUid)));
                return zy11.a;
            }
        }
        changePhoneStatusViewModel$pollChangePhoneStatus$3$emit$1 = new ChangePhoneStatusViewModel$pollChangePhoneStatus$3$emit$1(this, continuation);
        Object obj2 = changePhoneStatusViewModel$pollChangePhoneStatus$3$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = changePhoneStatusViewModel$pollChangePhoneStatus$3$emit$1.label;
        int i32 = 1;
        c cVar3 = this.a;
        if (i != 0) {
        }
        boolean forceNavigateToInitialViewModelOnResult2 = cVar3.B.getForceNavigateToInitialViewModelOnResult();
        tfl0 tfl0Var2 = cVar3.E;
        com.ybsdk.screens.registration.a aVar2 = cVar3.H;
        String applicationId2 = cVar3.B.getApplicationId();
        hri0 hri0Var2 = aVar2.b;
        aVar2.c.getClass();
        CodeConfirmationParams.ChangePhone changePhone2 = new CodeConfirmationParams.ChangePhone(applicationId2, false, forceNavigateToInitialViewModelOnResult2, CodeConfirmationParams.HeaderImage.CloseButton.INSTANCE, null, 16, null);
        OpenScreenRequirement.WithUid withUid2 = OpenScreenRequirement.WithUid.INSTANCE;
        hri0Var2.getClass();
        tfl0Var2.i(Collections.singletonList(hri0.a(changePhone2, withUid2)));
        return zy11.a;
    }
}
