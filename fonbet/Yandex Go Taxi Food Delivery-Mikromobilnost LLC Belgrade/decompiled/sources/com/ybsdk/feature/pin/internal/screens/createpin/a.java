package com.ybsdk.feature.pin.internal.screens.createpin;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.feature.pin.api.entities.PinScenario;
import com.ybsdk.feature.pin.api.entities.ReissueActionType;
import com.ybsdk.feature.pin.api.entities.StartSessionState;
import com.ybsdk.feature.pin.api.entities.e;
import com.ybsdk.feature.pin.api.entities.g;
import com.ybsdk.feature.pin.api.entities.h;
import com.ybsdk.feature.pin.api.entities.i;
import com.ybsdk.feature.pin.api.entities.k;
import com.ybsdk.feature.pin.internal.domain.b;
import com.ybsdk.feature.pin.internal.entities.PinTokenEntity;
import com.ybsdk.feature.pinstorage.internal.data.c;
import defpackage.a7f;
import defpackage.awv;
import defpackage.b7f;
import defpackage.bwb0;
import defpackage.c7f;
import defpackage.ds31;
import defpackage.dye;
import defpackage.e7f;
import defpackage.fj3;
import defpackage.gtb1;
import defpackage.jl40;
import defpackage.l5g;
import defpackage.lyc;
import defpackage.lz70;
import defpackage.ny61;
import defpackage.p1b;
import defpackage.pz40;
import defpackage.s6f;
import defpackage.t6f;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.uc5;
import defpackage.ux5;
import defpackage.v8e;
import defpackage.w511;
import defpackage.x6f;
import defpackage.y6f;
import defpackage.ycp0;
import defpackage.z6f;
import defpackage.zvb0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public final CreatePinScreenParams B;
    public final b C;
    public final ycp0 D;
    public final ux5 E;
    public final awv F;
    public final lz70 G;
    public final c H;
    public final com.ybsdk.di.modules.features.pin.a I;
    public final tfl0 J;
    public final bwb0 K;
    public final fj3 L;
    public final p1b M;

    public a(CreatePinScreenParams createPinScreenParams, b bVar, ycp0 ycp0Var, ux5 ux5Var, awv awvVar, lz70 lz70Var, c cVar, com.ybsdk.di.modules.features.pin.a aVar, tfl0 tfl0Var, bwb0 bwb0Var, fj3 fj3Var, t6f t6fVar) {
        super(new lyc(25, createPinScreenParams), new v8e(5, aVar));
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        this.B = createPinScreenParams;
        this.C = bVar;
        this.D = ycp0Var;
        this.E = ux5Var;
        this.F = awvVar;
        this.G = lz70Var;
        this.H = cVar;
        this.I = aVar;
        this.J = tfl0Var;
        this.K = bwb0Var;
        this.L = fj3Var;
        PinScenario scenario = createPinScreenParams.getScenario();
        AppAnalyticsReporter appAnalyticsReporter = (AppAnalyticsReporter) ((l5g) t6fVar.a.a).get();
        p1b p1bVar = new p1b(scenario, appAnalyticsReporter);
        this.M = p1bVar;
        int i = e7f.a[createPinScreenParams.getReissueActionType().ordinal()];
        if (i == 1) {
            p1bVar.l();
            pz40 Y = Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, c7f.a((c7f) value, null, null, null, new x6f(CreatePinState$PinStatusType.TooManyAttempts, new Throwable("Too many attempts input of PIN")), null, null, 239)));
            appAnalyticsReporter.S.a.a("reissue_pin.show_forgot_code_screen", null);
            return;
        }
        b7f b7fVar = b7f.a;
        if (i == 2) {
            String verificationToken = createPinScreenParams.getVerificationToken();
            if (verificationToken != null && verificationToken.length() != 0) {
                tje.N(ds31.a(this), null, null, new CreatePinViewModel$issuePinToken$1(this, null, null), 3);
                return;
            }
            p1bVar.l();
            if (createPinScreenParams.getToken() == null) {
                tje.N(ds31.a(this), null, null, new CreatePinViewModel$issuePinToken$1(this, null, null), 3);
            } else {
                pz40 Y2 = Y();
                do {
                    r0Var2 = (r0) Y2;
                    value2 = r0Var2.getValue();
                } while (!r0Var2.k(value2, c7f.a((c7f) value2, null, null, b7fVar, null, createPinScreenParams.getToken(), null, 219)));
            }
            this.M.n();
            return;
        }
        if (i != 3) {
            w511.b();
            throw null;
        }
        p1bVar.l();
        if (createPinScreenParams.getToken() == null) {
            tje.N(ds31.a(this), null, null, new CreatePinViewModel$issuePinToken$1(this, null, null), 3);
        } else {
            pz40 Y3 = Y();
            while (true) {
                r0 r0Var3 = (r0) Y3;
                Object value3 = r0Var3.getValue();
                b7f b7fVar2 = b7fVar;
                if (r0Var3.k(value3, c7f.a((c7f) value3, null, null, b7fVar2, null, createPinScreenParams.getToken(), null, 219))) {
                    break;
                } else {
                    b7fVar = b7fVar2;
                }
            }
        }
        this.M.n();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b0(a aVar, StartSessionState startSessionState, ContinuationImpl continuationImpl) {
        CreatePinViewModel$processStartSessionResponse$1 createPinViewModel$processStartSessionResponse$1;
        int i;
        FragmentScreen a;
        r0 r0Var;
        Object value;
        FragmentScreen a2;
        r0 r0Var2;
        Object value2;
        r0 r0Var3;
        Object value3;
        awv awvVar = aVar.F;
        tfl0 tfl0Var = aVar.J;
        c cVar = aVar.H;
        b bVar = aVar.C;
        p1b p1bVar = aVar.M;
        if (continuationImpl instanceof CreatePinViewModel$processStartSessionResponse$1) {
            createPinViewModel$processStartSessionResponse$1 = (CreatePinViewModel$processStartSessionResponse$1) continuationImpl;
            int i2 = createPinViewModel$processStartSessionResponse$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                createPinViewModel$processStartSessionResponse$1.label = i2 - Integer.MIN_VALUE;
                Object obj = createPinViewModel$processStartSessionResponse$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = createPinViewModel$processStartSessionResponse$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    boolean z = startSessionState instanceof e;
                    p1bVar.k(z);
                    if (z) {
                        ((com.ybsdk.di.modules.features.pin.b) bVar.c).a.g(false);
                        pz40 Y = aVar.Y();
                        do {
                            r0Var3 = (r0) Y;
                            value3 = r0Var3.getValue();
                        } while (!r0Var3.k(value3, c7f.a((c7f) value3, null, null, a7f.a, null, null, (e) startSessionState, HProv.PP_PASSWD_TERM)));
                        cVar.E(true);
                    } else {
                        boolean z2 = startSessionState instanceof k;
                        b7f b7fVar = b7f.a;
                        if (z2) {
                            p1bVar.m();
                            pz40 Y2 = aVar.Y();
                            do {
                                r0Var2 = (r0) Y2;
                                value2 = r0Var2.getValue();
                            } while (!r0Var2.k(value2, c7f.a((c7f) value2, null, null, b7fVar, null, null, null, 251)));
                            tje.N(ds31.a(aVar), null, null, new CreatePinViewModel$moveToSecondFactor$1(null, aVar, ((k) startSessionState).a, null), 3);
                        } else if (startSessionState instanceof g) {
                            bVar.b.E(false);
                            pz40 Y3 = aVar.Y();
                            do {
                                r0Var = (r0) Y3;
                                value = r0Var.getValue();
                            } while (!r0Var.k(value, c7f.a((c7f) value, null, null, b7fVar, null, null, null, 251)));
                            a2 = ((zvb0) awvVar).a(null, true);
                            tfl0Var.k(a2);
                        } else if (startSessionState instanceof h) {
                            createPinViewModel$processStartSessionResponse$1.label = 1;
                            if (cVar.w(createPinViewModel$processStartSessionResponse$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else if (startSessionState instanceof i) {
                            tje.N(ds31.a(aVar), null, null, new CreatePinViewModel$issuePinToken$1(aVar, null, null), 3);
                        } else {
                            a = ((zvb0) awvVar).a(startSessionState, true);
                            tfl0Var.k(a);
                        }
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                tje.N(ds31.a(aVar), null, null, new CreatePinViewModel$issuePinToken$1(aVar, null, null), 3);
                return zy11.a;
            }
        }
        createPinViewModel$processStartSessionResponse$1 = new CreatePinViewModel$processStartSessionResponse$1(aVar, continuationImpl);
        Object obj2 = createPinViewModel$processStartSessionResponse$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = createPinViewModel$processStartSessionResponse$1.label;
        if (i != 0) {
        }
        tje.N(ds31.a(aVar), null, null, new CreatePinViewModel$issuePinToken$1(aVar, null, null), 3);
        return zy11.a;
    }

    public final void c0(int i) {
        r0 r0Var;
        Object value;
        c7f c7fVar;
        r0 r0Var2;
        Object value2;
        r0 r0Var3;
        Object value3;
        if (jl40.l(((c7f) X()).c, b7f.a)) {
            boolean b = ((c7f) X()).b(0);
            p1b p1bVar = this.M;
            if (!b) {
                a0(new dye(6, c7f.a((c7f) X(), ((c7f) X()).a + i, null, null, null, null, null, 246)));
                c7f c7fVar2 = (c7f) X();
                gtb1 gtb1Var = c7fVar2.c;
                if (gtb1Var instanceof y6f) {
                    if (((y6f) gtb1Var).a == 0) {
                        return;
                    }
                } else if (c7fVar2.a.length() < 4) {
                    return;
                }
                AppAnalyticsReporter appAnalyticsReporter = (AppAnalyticsReporter) p1bVar.b;
                int i2 = s6f.a[((PinScenario) p1bVar.a).ordinal()];
                if (i2 == 1) {
                    appAnalyticsReporter.S.a.a("setup_pin.show_repeat_code", null);
                    return;
                }
                if (i2 == 2) {
                    appAnalyticsReporter.S.a.a("forgot_pin.show_repeat_code", null);
                    return;
                } else if (i2 == 3) {
                    appAnalyticsReporter.S.a.a("reissue_pin.show_repeat_code", null);
                    return;
                } else {
                    if (i2 != 4) {
                        return;
                    }
                    appAnalyticsReporter.S.a.a("change_pin.show_repeat_code", null);
                    return;
                }
            }
            if (((c7f) X()).b(1)) {
                return;
            }
            pz40 Y = Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
                c7fVar = (c7f) value;
            } while (!r0Var.k(value, c7f.a(c7fVar, null, c7fVar.b + i, null, null, null, null, 253)));
            if (((c7f) X()).b(1)) {
                c7f c7fVar3 = (c7f) X();
                if (jl40.l(c7fVar3.a, c7fVar3.b)) {
                    pz40 Y2 = Y();
                    do {
                        r0Var3 = (r0) Y2;
                        value3 = r0Var3.getValue();
                    } while (!r0Var3.k(value3, c7f.a((c7f) value3, null, null, z6f.a, null, null, null, 251)));
                    PinTokenEntity pinTokenEntity = ((c7f) X()).f;
                    if (pinTokenEntity != null) {
                        tje.N(ds31.a(this), null, null, new CreatePinViewModel$sendCode$2$1(this, pinTokenEntity, null), 3);
                        return;
                    }
                    return;
                }
                pz40 Y3 = Y();
                do {
                    r0Var2 = (r0) Y3;
                    value2 = r0Var2.getValue();
                } while (!r0Var2.k(value2, c7f.a((c7f) value2, null, null, y6f.c, null, null, null, 251)));
                AppAnalyticsReporter appAnalyticsReporter2 = (AppAnalyticsReporter) p1bVar.b;
                int i3 = s6f.a[((PinScenario) p1bVar.a).ordinal()];
                if (i3 == 1) {
                    appAnalyticsReporter2.S.a.a("setup_pin.repeat_code_error", null);
                } else if (i3 == 2) {
                    appAnalyticsReporter2.S.a.a("forgot_pin.repeat_code_error", null);
                } else if (i3 == 3) {
                    appAnalyticsReporter2.S.a.a("reissue_pin.repeat_code_error", null);
                } else if (i3 == 4) {
                    appAnalyticsReporter2.S.a.a("change_pin.repeat_code_error", null);
                }
                p1bVar.n();
            }
        }
    }

    public final void d0() {
        r0 r0Var;
        Object value;
        if (((c7f) X()).f == null) {
            tje.N(ds31.a(this), null, null, new CreatePinViewModel$issuePinToken$1(this, ReissueActionType.SETUP_PIN, null), 3);
            return;
        }
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, c7f.a((c7f) value, null, null, b7f.a, new x6f(CreatePinState$PinStatusType.None, x6f.c), null, null, 235)));
    }

    public final boolean e0() {
        if (!this.I.a || !this.B.getShow2faLogoutButton()) {
            return false;
        }
        this.L.getClass();
        return true;
    }

    public final void f0() {
        tje.N(ds31.a(this), null, null, new CreatePinViewModel$onSuccess$1(this, null), 3);
    }
}
