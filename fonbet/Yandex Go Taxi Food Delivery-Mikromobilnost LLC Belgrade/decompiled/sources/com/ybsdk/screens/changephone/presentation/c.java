package com.ybsdk.screens.changephone.presentation;

import android.content.Context;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.webview.api.WebViewScreenParams;
import com.ybsdk.navigation.ScenarioResultReceiver$ChangePhoneResult;
import com.ybsdk.rconfig.configs.SupportEntryPointsImpl;
import defpackage.dfr;
import defpackage.ds31;
import defpackage.gjw0;
import defpackage.h791;
import defpackage.j3h;
import defpackage.jc9;
import defpackage.le9;
import defpackage.me9;
import defpackage.np41;
import defpackage.nvd;
import defpackage.ny61;
import defpackage.oe9;
import defpackage.pe9;
import defpackage.pz40;
import defpackage.re9;
import defpackage.se9;
import defpackage.te9;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.uc5;
import defpackage.us3;
import defpackage.w4o;
import defpackage.w511;
import defpackage.ye9;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class c extends uc5 {
    public final ChangePhoneStatusScreenParams B;
    public final com.ybsdk.screens.registration.domain.interactors.a C;
    public final com.ybsdk.rconfig.b D;
    public final tfl0 E;
    public final j3h F;
    public final np41 G;
    public final com.ybsdk.screens.registration.a H;
    public final nvd I;
    public final us3 J;
    public final Context K;
    public final com.ybsdk.feature.pinstorage.internal.data.c L;
    public final com.ybsdk.screens.initial.a M;

    public c(ye9 ye9Var, ChangePhoneStatusScreenParams changePhoneStatusScreenParams, com.ybsdk.screens.registration.domain.interactors.a aVar, com.ybsdk.rconfig.b bVar, tfl0 tfl0Var, j3h j3hVar, np41 np41Var, com.ybsdk.screens.registration.a aVar2, nvd nvdVar, us3 us3Var, Context context, com.ybsdk.feature.pinstorage.internal.data.c cVar, com.ybsdk.screens.initial.a aVar3) {
        super(new jc9(8), ye9Var);
        r0 r0Var;
        Object value;
        this.B = changePhoneStatusScreenParams;
        this.C = aVar;
        this.D = bVar;
        this.E = tfl0Var;
        this.F = j3hVar;
        this.G = np41Var;
        this.H = aVar2;
        this.I = nvdVar;
        this.J = us3Var;
        this.K = context;
        this.L = cVar;
        this.M = aVar3;
        int i = a.a[changePhoneStatusScreenParams.getShowStatus().ordinal()];
        if (i == 1) {
            tje.N(ds31.a(this), null, null, new ChangePhoneStatusViewModel$2(this, null), 3);
            return;
        }
        if (i == 2) {
            Text.Empty empty = Text.Empty.INSTANCE;
            h0(empty, empty);
        } else {
            if (i != 3) {
                w511.b();
                throw null;
            }
            Text.Empty empty2 = Text.Empty.INSTANCE;
            us3Var.y(d.a(context, empty2).toString(), false);
            pz40 Y = Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, new le9(empty2, empty2, c0(null))));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
    
        if (((defpackage.tpr) r9).collect(r2, r0) != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        if (r9 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b0(c cVar, ContinuationImpl continuationImpl) {
        ChangePhoneStatusViewModel$pollChangePhoneStatus$1 changePhoneStatusViewModel$pollChangePhoneStatus$1;
        int i;
        r0 r0Var;
        Object value;
        cVar.getClass();
        if (continuationImpl instanceof ChangePhoneStatusViewModel$pollChangePhoneStatus$1) {
            changePhoneStatusViewModel$pollChangePhoneStatus$1 = (ChangePhoneStatusViewModel$pollChangePhoneStatus$1) continuationImpl;
            int i2 = changePhoneStatusViewModel$pollChangePhoneStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                changePhoneStatusViewModel$pollChangePhoneStatus$1.label = i2 - Integer.MIN_VALUE;
                Object obj = changePhoneStatusViewModel$pollChangePhoneStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = changePhoneStatusViewModel$pollChangePhoneStatus$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pz40 Y = cVar.Y();
                    do {
                        r0Var = (r0) Y;
                        value = r0Var.getValue();
                    } while (!r0Var.k(value, new oe9(null, null, null)));
                    com.ybsdk.screens.registration.domain.interactors.a aVar = cVar.C;
                    String applicationId = cVar.B.getApplicationId();
                    changePhoneStatusViewModel$pollChangePhoneStatus$1.label = 1;
                    obj = aVar.c(applicationId, false, false, changePhoneStatusViewModel$pollChangePhoneStatus$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return zy11.a;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                b bVar = new b(cVar);
                changePhoneStatusViewModel$pollChangePhoneStatus$1.label = 2;
            }
        }
        changePhoneStatusViewModel$pollChangePhoneStatus$1 = new ChangePhoneStatusViewModel$pollChangePhoneStatus$1(cVar, continuationImpl);
        Object obj2 = changePhoneStatusViewModel$pollChangePhoneStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = changePhoneStatusViewModel$pollChangePhoneStatus$1.label;
        if (i != 0) {
        }
        b bVar2 = new b(cVar);
        changePhoneStatusViewModel$pollChangePhoneStatus$1.label = 2;
    }

    public final String c0(String str) {
        if (str != null) {
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        com.ybsdk.rconfig.b bVar = this.D;
        bVar.getClass();
        dfr b = gjw0.b(bVar.f);
        SupportEntryPointsImpl supportEntryPointsImpl = (SupportEntryPointsImpl) bVar.d(b).getData();
        SupportEntryPointsImpl supportEntryPointsImpl2 = (SupportEntryPointsImpl) b.c.getData();
        String changePhoneFailed = supportEntryPointsImpl.getChangePhoneFailed();
        return changePhoneFailed.length() == 0 ? supportEntryPointsImpl2.getChangePhoneFailed() : changePhoneFailed;
    }

    public final void d0() {
        se9 se9Var = (se9) X();
        boolean z = se9Var instanceof le9;
        np41 np41Var = this.G;
        j3h j3hVar = this.F;
        nvd nvdVar = this.I;
        if (z) {
            nvdVar.h(ScenarioResultReceiver$ChangePhoneResult.FAIL);
            String str = ((le9) X()).c;
            h791.f(j3hVar, str, com.ybsdk.feature.webview.api.a.b(np41Var, str, null, WebViewScreenParams.Auth.NONE, 2));
            return;
        }
        if (se9Var instanceof me9) {
            tje.N(ds31.a(this), null, null, new ChangePhoneStatusViewModel$onActionButtonClick$1(this, null), 3);
            return;
        }
        if (se9Var instanceof re9) {
            nvdVar.h(ScenarioResultReceiver$ChangePhoneResult.SUCCESS);
            boolean forceNavigateToInitialViewModelOnResult = this.B.getForceNavigateToInitialViewModelOnResult();
            tfl0 tfl0Var = this.E;
            if (forceNavigateToInitialViewModelOnResult) {
                tfl0Var.j(com.ybsdk.screens.initial.a.c(this.M));
                return;
            } else {
                tfl0Var.e();
                return;
            }
        }
        if (!(se9Var instanceof pe9)) {
            if (se9Var instanceof oe9) {
                return;
            }
            w511.b();
            return;
        }
        com.ybsdk.rconfig.b bVar = this.D;
        bVar.getClass();
        w4o w4oVar = bVar.f;
        dfr b = gjw0.b(w4oVar);
        SupportEntryPointsImpl supportEntryPointsImpl = (SupportEntryPointsImpl) bVar.d(b).getData();
        SupportEntryPointsImpl supportEntryPointsImpl2 = (SupportEntryPointsImpl) b.c.getData();
        String changePhoneProcessing = supportEntryPointsImpl.getChangePhoneProcessing();
        if (changePhoneProcessing.length() == 0) {
            changePhoneProcessing = supportEntryPointsImpl2.getChangePhoneProcessing();
        }
        dfr b2 = gjw0.b(w4oVar);
        SupportEntryPointsImpl supportEntryPointsImpl3 = (SupportEntryPointsImpl) bVar.d(b2).getData();
        SupportEntryPointsImpl supportEntryPointsImpl4 = (SupportEntryPointsImpl) b2.c.getData();
        String changePhoneProcessing2 = supportEntryPointsImpl3.getChangePhoneProcessing();
        if (changePhoneProcessing2.length() == 0) {
            changePhoneProcessing2 = supportEntryPointsImpl4.getChangePhoneProcessing();
        }
        h791.f(j3hVar, changePhoneProcessing, com.ybsdk.feature.webview.api.a.b(np41Var, changePhoneProcessing2, null, WebViewScreenParams.Auth.NONE, 2));
    }

    public final void e0() {
        this.I.h(ScenarioResultReceiver$ChangePhoneResult.FAIL);
        boolean forceNavigateToInitialViewModelOnResult = this.B.getForceNavigateToInitialViewModelOnResult();
        tfl0 tfl0Var = this.E;
        if (forceNavigateToInitialViewModelOnResult) {
            tfl0Var.j(com.ybsdk.screens.initial.a.c(this.M));
        } else {
            tfl0Var.e();
        }
    }

    public final void f0() {
        Z(te9.a);
    }

    public final void g0() {
        se9 se9Var = (se9) X();
        if (!(se9Var instanceof me9)) {
            if ((se9Var instanceof le9) || (se9Var instanceof oe9) || (se9Var instanceof pe9) || (se9Var instanceof re9)) {
                return;
            }
            w511.b();
            return;
        }
        this.I.h(ScenarioResultReceiver$ChangePhoneResult.FAIL);
        com.ybsdk.rconfig.b bVar = this.D;
        bVar.getClass();
        dfr b = gjw0.b(bVar.f);
        SupportEntryPointsImpl supportEntryPointsImpl = (SupportEntryPointsImpl) bVar.d(b).getData();
        SupportEntryPointsImpl supportEntryPointsImpl2 = (SupportEntryPointsImpl) b.c.getData();
        String changePhoneNetworkError = supportEntryPointsImpl.getChangePhoneNetworkError();
        if (changePhoneNetworkError.length() == 0) {
            changePhoneNetworkError = supportEntryPointsImpl2.getChangePhoneNetworkError();
        }
        h791.f(this.F, changePhoneNetworkError, com.ybsdk.feature.webview.api.a.b(this.G, changePhoneNetworkError, null, WebViewScreenParams.Auth.NONE, 2));
    }

    public final void h0(Text text, Text text2) {
        r0 r0Var;
        Object value;
        this.J.y(null, true);
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, new re9(text, text2)));
    }
}
