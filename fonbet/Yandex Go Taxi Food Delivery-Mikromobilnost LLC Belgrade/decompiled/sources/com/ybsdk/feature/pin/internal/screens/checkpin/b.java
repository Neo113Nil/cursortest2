package com.ybsdk.feature.pin.internal.screens.checkpin;

import android.os.SystemClock;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.TechEvents$TechGetRemoteConfigBlockingResultTrigger;
import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.pin.api.entities.PinScenario;
import com.ybsdk.feature.pin.api.entities.ReissueActionType;
import com.ybsdk.feature.pin.api.entities.StartSessionState;
import com.ybsdk.feature.pin.api.entities.e;
import com.ybsdk.feature.pin.api.entities.g;
import com.ybsdk.feature.pin.api.entities.h;
import com.ybsdk.feature.pin.api.entities.i;
import com.ybsdk.feature.pin.api.entities.k;
import com.ybsdk.feature.pin.internal.entities.PinCode;
import com.ybsdk.feature.pin.internal.entities.PinTokenEntity;
import com.ybsdk.feature.pin.internal.screens.checkpin.CheckPinFragment;
import com.ybsdk.feature.pin.internal.screens.createpin.CreatePinFragment;
import com.ybsdk.feature.pin.internal.screens.createpin.CreatePinScreenParams;
import com.ybsdk.feature.pin.internal.screens.createpin.OnFinishStrategy;
import com.ybsdk.feature.remote.config.api.retriever.RemoteConfigUpdateTrigger;
import defpackage.awv;
import defpackage.ay5;
import defpackage.b9s0;
import defpackage.bwb0;
import defpackage.dhb;
import defpackage.ds31;
import defpackage.dzh0;
import defpackage.e3n;
import defpackage.e90;
import defpackage.ehb;
import defpackage.em3;
import defpackage.f8z0;
import defpackage.ff8;
import defpackage.fnb0;
import defpackage.h791;
import defpackage.hyb0;
import defpackage.irp0;
import defpackage.j3h;
import defpackage.jl40;
import defpackage.khb;
import defpackage.l5g;
import defpackage.lhb;
import defpackage.lrp0;
import defpackage.lz70;
import defpackage.mhb;
import defpackage.n0t0;
import defpackage.n8a;
import defpackage.nhb;
import defpackage.nw70;
import defpackage.ny61;
import defpackage.phb;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.qhb;
import defpackage.qoi0;
import defpackage.r5s0;
import defpackage.rcc;
import defpackage.s630;
import defpackage.saj;
import defpackage.tfl0;
import defpackage.tis0;
import defpackage.tje;
import defpackage.trp0;
import defpackage.uc5;
import defpackage.ux5;
import defpackage.v8z0;
import defpackage.w511;
import defpackage.x4c;
import defpackage.xui0;
import defpackage.y0c;
import defpackage.ycp0;
import defpackage.yj70;
import defpackage.yvf0;
import defpackage.zva0;
import defpackage.zvb0;
import defpackage.zy11;
import java.io.Serializable;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import kotlin.Result;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes3.dex */
public final class b extends uc5 {
    public final CheckPinFragment.CheckPinScreenParams B;
    public final ux5 C;
    public final com.ybsdk.feature.pin.internal.domain.a D;
    public final com.ybsdk.feature.pin.internal.domain.b E;
    public final ycp0 F;
    public final com.ybsdk.feature.pinstorage.internal.data.c G;
    public final lz70 H;
    public final awv I;
    public final yj70 J;
    public final com.ybsdk.di.modules.features.pin.a K;
    public final bwb0 L;
    public final xui0 M;
    public final tfl0 N;
    public final lz70 O;
    public final ff8 P;
    public final nw70 Q;
    public final tis0 R;
    public boolean S;
    public boolean T;
    public final AtomicBoolean U;
    public pzt0 V;

    public b(CheckPinFragment.CheckPinScreenParams checkPinScreenParams, ux5 ux5Var, com.ybsdk.feature.pin.internal.domain.a aVar, com.ybsdk.feature.pin.internal.domain.b bVar, ycp0 ycp0Var, com.ybsdk.feature.pinstorage.internal.data.c cVar, lz70 lz70Var, awv awvVar, yj70 yj70Var, com.ybsdk.di.modules.features.pin.a aVar2, lz70 lz70Var2, bwb0 bwb0Var, xui0 xui0Var, tfl0 tfl0Var, lz70 lz70Var3, ff8 ff8Var, nw70 nw70Var, ehb ehbVar) {
        super(new n8a(15, checkPinScreenParams, aVar2), new e90(10, checkPinScreenParams, bwb0Var));
        hyb0 hyb0Var;
        Long l;
        this.B = checkPinScreenParams;
        this.C = ux5Var;
        this.D = aVar;
        this.E = bVar;
        this.F = ycp0Var;
        this.G = cVar;
        this.H = lz70Var;
        this.I = awvVar;
        this.J = yj70Var;
        this.K = aVar2;
        this.L = bwb0Var;
        this.M = xui0Var;
        this.N = tfl0Var;
        this.O = lz70Var3;
        this.P = ff8Var;
        this.Q = nw70Var;
        this.R = new tis0(checkPinScreenParams.getCheckType(), checkPinScreenParams.getDropBackStack(), (AppAnalyticsReporter) ((l5g) ehbVar.a.a).get(), 7);
        this.U = new AtomicBoolean(false);
        if (!this.S && checkPinScreenParams.getCheckType() == CheckType.ENTER && cVar.h() && (l = (hyb0Var = (hyb0) lz70Var2.b).c) != null) {
            long uptimeMillis = SystemClock.uptimeMillis() - l.longValue();
            if (!hyb0Var.d) {
                hyb0Var.d = true;
                zva0 zva0Var = hyb0Var.e;
                if (zva0Var != null) {
                    zva0Var.a();
                }
                hyb0Var.e = null;
                em3 em3Var = hyb0Var.b.S;
                LinkedHashMap linkedHashMap = new LinkedHashMap(1);
                linkedHashMap.put("duration", Integer.valueOf((int) uptimeMillis));
                em3Var.a.a("request_pin_screen.open", linkedHashMap);
                if (uptimeMillis > 1000) {
                    trp0 trp0Var = trp0.a;
                    trp0.f(new irp0(uptimeMillis));
                }
            }
        }
        tje.N(ds31.a(this), null, null, new CheckPinViewModel$3(this, null), 3);
        tje.N(ds31.a(this), null, null, new CheckPinViewModel$4(this, null), 3);
        tje.N(ds31.a(this), null, null, new CheckPinViewModel$5(this, null), 3);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(1:(1:(4:12|13|14|15)(2:17|18))(6:19|20|(1:21)|24|14|15))(1:26))(2:46|(1:48))|27|(2:(1:30)(1:45)|(4:32|(1:33)|36|(5:38|(2:40|41)|20|(1:21)|24)(2:42|43)))|14|15))|54|6|7|(0)(0)|27|(0)|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0044, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e8, code lost:
    
        r5 = defpackage.trp0.a;
        defpackage.trp0.e(new defpackage.gqp0(r0, "Decrypt", true, "decodeBiometric"));
        r3.L$0 = r0;
        r3.label = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00fe, code lost:
    
        if (r2.t(r3) == r4) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0101, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b0(b bVar, ay5 ay5Var, ContinuationImpl continuationImpl) {
        CheckPinViewModel$decodeBiometric$1 checkPinViewModel$decodeBiometric$1;
        int i;
        ay5 ay5Var2;
        Object k;
        r0 r0Var;
        Object value;
        String str;
        pz40 Y;
        r0 r0Var2;
        Object value2;
        com.ybsdk.feature.pinstorage.internal.data.c cVar = bVar.G;
        if (continuationImpl instanceof CheckPinViewModel$decodeBiometric$1) {
            checkPinViewModel$decodeBiometric$1 = (CheckPinViewModel$decodeBiometric$1) continuationImpl;
            int i2 = checkPinViewModel$decodeBiometric$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                checkPinViewModel$decodeBiometric$1.label = i2 - Integer.MIN_VALUE;
                Object obj = checkPinViewModel$decodeBiometric$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = checkPinViewModel$decodeBiometric$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ay5Var2 = ay5Var;
                    checkPinViewModel$decodeBiometric$1.L$0 = ay5Var2;
                    checkPinViewModel$decodeBiometric$1.label = 1;
                    k = cVar.k(checkPinViewModel$decodeBiometric$1);
                    if (k == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Exception exc = (Exception) checkPinViewModel$decodeBiometric$1.L$0;
                            kotlin.b.b(obj);
                            bVar.o0(exc);
                            return zy11.a;
                        }
                        kotlin.b.b(obj);
                        str = (String) obj;
                        Y = bVar.Y();
                        do {
                            r0Var2 = (r0) Y;
                            value2 = r0Var2.getValue();
                        } while (!r0Var2.k(value2, phb.a((phb) value2, false, false, null, str, null, null, null, null, false, null, 4063)));
                        bVar.j0(null, true);
                        return zy11.a;
                    }
                    ay5 ay5Var3 = (ay5) checkPinViewModel$decodeBiometric$1.L$0;
                    kotlin.b.b(obj);
                    k = obj;
                    ay5Var2 = ay5Var3;
                }
                if (((Boolean) k).booleanValue()) {
                    if ((ay5Var2 != null ? ay5Var2.b : null) != null) {
                        pz40 Y2 = bVar.Y();
                        do {
                            r0Var = (r0) Y2;
                            value = r0Var.getValue();
                        } while (!r0Var.k(value, phb.a((phb) value, false, false, null, null, khb.a, null, null, null, false, null, 4031)));
                        com.ybsdk.feature.pin.internal.domain.a aVar = bVar.D;
                        Cipher cipher = ay5Var2.b;
                        if (cipher == null) {
                            throw new IllegalStateException("No cipher exist");
                        }
                        checkPinViewModel$decodeBiometric$1.L$0 = null;
                        checkPinViewModel$decodeBiometric$1.label = 2;
                        obj = aVar.a(cipher, checkPinViewModel$decodeBiometric$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        str = (String) obj;
                        Y = bVar.Y();
                        do {
                            r0Var2 = (r0) Y;
                            value2 = r0Var2.getValue();
                        } while (!r0Var2.k(value2, phb.a((phb) value2, false, false, null, str, null, null, null, null, false, null, 4063)));
                        bVar.j0(null, true);
                    }
                }
                return zy11.a;
            }
        }
        checkPinViewModel$decodeBiometric$1 = new CheckPinViewModel$decodeBiometric$1(bVar, continuationImpl);
        Object obj2 = checkPinViewModel$decodeBiometric$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = checkPinViewModel$decodeBiometric$1.label;
        if (i != 0) {
        }
        if (((Boolean) k).booleanValue()) {
        }
        return zy11.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(2:29|30)(2:26|(1:28)))|11|(1:12)|16))|34|6|7|(0)(0)|11|(1:12)|16) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0058, code lost:
    
        r14 = defpackage.trp0.a;
        defpackage.trp0.e(new defpackage.gqp0(r0, "Encrypt", true, "encryptBiometricPin"));
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c0(b bVar, ay5 ay5Var, ContinuationImpl continuationImpl) {
        CheckPinViewModel$encryptBiometricPin$1 checkPinViewModel$encryptBiometricPin$1;
        int i;
        pz40 Y;
        r0 r0Var;
        Object value;
        Cipher cipher;
        bVar.getClass();
        if (continuationImpl instanceof CheckPinViewModel$encryptBiometricPin$1) {
            checkPinViewModel$encryptBiometricPin$1 = (CheckPinViewModel$encryptBiometricPin$1) continuationImpl;
            int i2 = checkPinViewModel$encryptBiometricPin$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                checkPinViewModel$encryptBiometricPin$1.label = i2 - Integer.MIN_VALUE;
                Object obj = checkPinViewModel$encryptBiometricPin$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = checkPinViewModel$encryptBiometricPin$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.ybsdk.feature.pin.internal.domain.a aVar = bVar.D;
                    String str = ((phb) bVar.X()).f;
                    if (ay5Var == null || (cipher = ay5Var.b) == null) {
                        throw new IllegalStateException("No cipher exist");
                    }
                    checkPinViewModel$encryptBiometricPin$1.label = 1;
                    if (aVar.b(str, cipher, checkPinViewModel$encryptBiometricPin$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                Y = bVar.Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, phb.a((phb) value, false, false, null, null, khb.c, null, null, null, false, null, 4031)));
                return zy11.a;
            }
        }
        checkPinViewModel$encryptBiometricPin$1 = new CheckPinViewModel$encryptBiometricPin$1(bVar, continuationImpl);
        Object obj2 = checkPinViewModel$encryptBiometricPin$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = checkPinViewModel$encryptBiometricPin$1.label;
        if (i != 0) {
        }
        Y = bVar.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, phb.a((phb) value, false, false, null, null, khb.c, null, null, null, false, null, 4031)));
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x011b, code lost:
    
        if (r1 == r5) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x012d, code lost:
    
        if (r1 == r5) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d0(b bVar, ContinuationImpl continuationImpl) {
        CheckPinViewModel$exitFromScreen$1 checkPinViewModel$exitFromScreen$1;
        int i;
        FragmentScreen b;
        tfl0 tfl0Var = bVar.N;
        CheckPinFragment.CheckPinScreenParams checkPinScreenParams = bVar.B;
        if (continuationImpl instanceof CheckPinViewModel$exitFromScreen$1) {
            checkPinViewModel$exitFromScreen$1 = (CheckPinViewModel$exitFromScreen$1) continuationImpl;
            int i2 = checkPinViewModel$exitFromScreen$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                checkPinViewModel$exitFromScreen$1.label = i2 - Integer.MIN_VALUE;
                Object obj = checkPinViewModel$exitFromScreen$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = checkPinViewModel$exitFromScreen$1.label;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    if (i == 1) {
                        tfl0Var = (tfl0) checkPinViewModel$exitFromScreen$1.L$0;
                        kotlin.b.b(obj);
                        tfl0Var.i((List) obj);
                        return zy11Var;
                    }
                    if (i == 2) {
                        tfl0Var = (tfl0) checkPinViewModel$exitFromScreen$1.L$0;
                        kotlin.b.b(obj);
                        tfl0Var.m((List) obj);
                        return zy11Var;
                    }
                    if (i == 3) {
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                int i3 = qhb.a[checkPinScreenParams.getCheckType().ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 == 4) {
                                tfl0Var.e();
                                return zy11Var;
                            }
                            if (i3 != 5) {
                                w511.b();
                                return null;
                            }
                            tis0 tis0Var = bVar.R;
                            if (((CheckType) tis0Var.c) == CheckType.SET_BIOMETRY) {
                                ((AppAnalyticsReporter) tis0Var.w).S.a.a("enable_biometry.done", null);
                            }
                            tfl0Var.e();
                            return zy11Var;
                        }
                        PinTokenEntity pinTokenEntity = ((phb) bVar.X()).l;
                        if (pinTokenEntity != null) {
                            ycp0 ycp0Var = bVar.F;
                            PinScenario analyticsScenario = checkPinScreenParams.getCheckType().getAnalyticsScenario();
                            Text.Resource resource = new Text.Resource(dzh0.ybsdk_pin_change_pin_title);
                            ycp0Var.getClass();
                            CreatePinScreenParams createPinScreenParams = new CreatePinScreenParams(pinTokenEntity, null, analyticsScenario, null, false, null, resource, 42, null);
                            OpenScreenRequirement.WithUid withUid = OpenScreenRequirement.WithUid.INSTANCE;
                            b = new FragmentScreen(CreatePinFragment.SCREEN_KEY, false, createPinScreenParams, null, qoi0.a(CreatePinFragment.class), withUid, 10, null);
                        } else {
                            x4c.g("Exception during exitFromScreen() in CheckPinViewModel", new NullPointerException("CheckPinPresenter: CHANGE_PIN currentTokenEntity=null"), null, null, 12);
                            b = ycp0.b(bVar.F, null, null, checkPinScreenParams.getCheckType().getAnalyticsScenario(), false, new Text.Resource(dzh0.ybsdk_pin_change_pin_title), 3);
                        }
                        tfl0Var.l(b);
                        return zy11Var;
                    }
                    checkPinViewModel$exitFromScreen$1.label = 3;
                    if (bVar.l0(checkPinViewModel$exitFromScreen$1) != obj2) {
                        return zy11Var;
                    }
                } else if (checkPinScreenParams.getDropBackStack()) {
                    checkPinViewModel$exitFromScreen$1.L$0 = tfl0Var;
                    checkPinViewModel$exitFromScreen$1.label = 1;
                    obj = bVar.i0(true, checkPinViewModel$exitFromScreen$1);
                } else {
                    checkPinViewModel$exitFromScreen$1.L$0 = tfl0Var;
                    checkPinViewModel$exitFromScreen$1.label = 2;
                    obj = bVar.i0(false, checkPinViewModel$exitFromScreen$1);
                }
                return obj2;
            }
        }
        checkPinViewModel$exitFromScreen$1 = new CheckPinViewModel$exitFromScreen$1(bVar, continuationImpl);
        Object obj3 = checkPinViewModel$exitFromScreen$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = checkPinViewModel$exitFromScreen$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e0(b bVar, ContinuationImpl continuationImpl) {
        CheckPinViewModel$fetchRemoteConfig$1 checkPinViewModel$fetchRemoteConfig$1;
        int i;
        long j;
        Object value;
        r0 r0Var;
        Object value2;
        xui0 xui0Var = bVar.M;
        if (continuationImpl instanceof CheckPinViewModel$fetchRemoteConfig$1) {
            checkPinViewModel$fetchRemoteConfig$1 = (CheckPinViewModel$fetchRemoteConfig$1) continuationImpl;
            int i2 = checkPinViewModel$fetchRemoteConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                checkPinViewModel$fetchRemoteConfig$1.label = i2 - Integer.MIN_VALUE;
                Object obj = checkPinViewModel$fetchRemoteConfig$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = checkPinViewModel$fetchRemoteConfig$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    long a = s630.a();
                    checkPinViewModel$fetchRemoteConfig$1.J$0 = a;
                    checkPinViewModel$fetchRemoteConfig$1.label = 1;
                    obj = ((com.ybsdk.rconfig.retriever.d) xui0Var).b(checkPinViewModel$fetchRemoteConfig$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    j = a;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = checkPinViewModel$fetchRemoteConfig$1.J$0;
                    kotlin.b.b(obj);
                }
                v8z0 v8z0Var = (v8z0) obj;
                long a2 = f8z0.a(j);
                value = v8z0Var.a.getValue();
                long j2 = v8z0Var.b;
                if (value instanceof Result.Failure) {
                    ((AppAnalyticsReporter) bVar.R.w).m0.e(TechEvents$TechGetRemoteConfigBlockingResultTrigger.PIN_CHECK, (int) e3n.e(j2), (int) e3n.e(a2));
                    return value;
                }
                x4c.g("Failed to fetch remote config before pin check", Result.a(value), null, Collections.singletonList(lrp0.y), 4);
                com.ybsdk.rconfig.retriever.d dVar = (com.ybsdk.rconfig.retriever.d) xui0Var;
                com.ybsdk.rconfig.retriever.d.c(dVar, dVar.i, RemoteConfigUpdateTrigger.PIN_CHECK);
                pz40 Y = bVar.Y();
                do {
                    r0Var = (r0) Y;
                    value2 = r0Var.getValue();
                } while (!r0Var.k(value2, phb.a((phb) value2, false, false, null, null, new nhb(Result.a(value)), null, null, null, true, null, 3007)));
                return value;
            }
        }
        checkPinViewModel$fetchRemoteConfig$1 = new CheckPinViewModel$fetchRemoteConfig$1(bVar, continuationImpl);
        Object obj2 = checkPinViewModel$fetchRemoteConfig$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = checkPinViewModel$fetchRemoteConfig$1.label;
        if (i != 0) {
        }
        v8z0 v8z0Var2 = (v8z0) obj2;
        long a22 = f8z0.a(j);
        value = v8z0Var2.a.getValue();
        long j22 = v8z0Var2.b;
        if (value instanceof Result.Failure) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f0(b bVar, ContinuationImpl continuationImpl) {
        CheckPinViewModel$openIssuePinIfPinLost$1 checkPinViewModel$openIssuePinIfPinLost$1;
        Object obj;
        int i;
        bVar.getClass();
        if (continuationImpl instanceof CheckPinViewModel$openIssuePinIfPinLost$1) {
            checkPinViewModel$openIssuePinIfPinLost$1 = (CheckPinViewModel$openIssuePinIfPinLost$1) continuationImpl;
            int i2 = checkPinViewModel$openIssuePinIfPinLost$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                checkPinViewModel$openIssuePinIfPinLost$1.label = i2 - Integer.MIN_VALUE;
                obj = checkPinViewModel$openIssuePinIfPinLost$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = checkPinViewModel$openIssuePinIfPinLost$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.ybsdk.feature.pin.internal.domain.b bVar2 = bVar.E;
                    checkPinViewModel$openIssuePinIfPinLost$1.label = 1;
                    obj = bVar2.b.l(checkPinViewModel$openIssuePinIfPinLost$1);
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
                if (!((Boolean) obj).booleanValue()) {
                    tfl0 tfl0Var = bVar.N;
                    ycp0 ycp0Var = bVar.F;
                    CreatePinScreenParams createPinScreenParams = new CreatePinScreenParams(null, null, PinScenario.REISSUE_PIN, null, bVar.K.a, null, null, HProv.PP_SET_PIN, null);
                    ycp0Var.getClass();
                    OpenScreenRequirement.WithUid withUid = OpenScreenRequirement.WithUid.INSTANCE;
                    tfl0Var.l(new FragmentScreen(CreatePinFragment.SCREEN_KEY, false, createPinScreenParams, 0 == true ? 1 : 0, qoi0.a(CreatePinFragment.class), withUid, 10, null));
                }
                return zy11.a;
            }
        }
        checkPinViewModel$openIssuePinIfPinLost$1 = new CheckPinViewModel$openIssuePinIfPinLost$1(bVar, continuationImpl);
        obj = checkPinViewModel$openIssuePinIfPinLost$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = checkPinViewModel$openIssuePinIfPinLost$1.label;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x01fc, code lost:
    
        if (r8.w(r9) == r10) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x018f, code lost:
    
        if (r8.w(r9) == r10) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01e8, code lost:
    
        if (r3 == r10) goto L75;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003d  */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2, types: [fse, kotlin.coroutines.Continuation, kotlinx.coroutines.CoroutineStart] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g0(b bVar, StartSessionState startSessionState, boolean z, ContinuationImpl continuationImpl) {
        CheckPinViewModel$processStartSessionResponse$1 checkPinViewModel$processStartSessionResponse$1;
        int i;
        FragmentScreen a;
        r0 r0Var;
        Object value;
        FragmentScreen a2;
        ?? r5;
        StartSessionState startSessionState2;
        boolean z2;
        pz40 Y;
        r0 r0Var2;
        Object value2;
        int i2;
        pz40 Y2;
        r0 r0Var3;
        Object value3;
        Map map;
        ?? r52;
        r0 r0Var4;
        Object value4;
        Map map2;
        StartSessionState startSessionState3 = startSessionState;
        awv awvVar = bVar.I;
        tfl0 tfl0Var = bVar.N;
        khb khbVar = khb.d;
        com.ybsdk.feature.pin.internal.domain.b bVar2 = bVar.E;
        tis0 tis0Var = bVar.R;
        com.ybsdk.feature.pinstorage.internal.data.c cVar = bVar.G;
        if (continuationImpl instanceof CheckPinViewModel$processStartSessionResponse$1) {
            checkPinViewModel$processStartSessionResponse$1 = (CheckPinViewModel$processStartSessionResponse$1) continuationImpl;
            int i3 = checkPinViewModel$processStartSessionResponse$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                checkPinViewModel$processStartSessionResponse$1.label = i3 - Integer.MIN_VALUE;
                Object obj = checkPinViewModel$processStartSessionResponse$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = checkPinViewModel$processStartSessionResponse$1.label;
                char c = 3;
                Object obj2 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    boolean z3 = startSessionState3 instanceof e;
                    tis0Var.W(z3);
                    if (!z3) {
                        if (startSessionState3 instanceof k) {
                            pz40 Y3 = bVar.Y();
                            while (true) {
                                r0 r0Var5 = (r0) Y3;
                                Object value5 = r0Var5.getValue();
                                r5 = obj2;
                                if (r0Var5.k(value5, phb.a((phb) value5, false, false, null, null, khbVar, null, null, null, false, null, 4031))) {
                                    break;
                                }
                                obj2 = r5;
                                c = 3;
                            }
                            tje.N(ds31.a(bVar), r5, r5, new CheckPinViewModel$moveToSecondFactor$1(bVar, ((k) startSessionState3).a, r5), 3);
                        } else {
                            Map map3 = null;
                            if (startSessionState3 instanceof g) {
                                bVar2.b.E(false);
                                a2 = ((zvb0) awvVar).a(null, true);
                                tfl0Var.k(a2);
                            } else if (startSessionState3 instanceof h) {
                                checkPinViewModel$processStartSessionResponse$1.L$0 = startSessionState3;
                                checkPinViewModel$processStartSessionResponse$1.label = 2;
                                map = map3;
                            } else if (!(startSessionState3 instanceof i)) {
                                a = ((zvb0) awvVar).a(startSessionState3, true);
                                tfl0Var.k(a);
                            } else if (z) {
                                ((AppAnalyticsReporter) tis0Var.w).S.a.a("reissue_pin.show_forgot_code_screen", null);
                                pz40 Y4 = bVar.Y();
                                do {
                                    r0Var = (r0) Y4;
                                    value = r0Var.getValue();
                                } while (!r0Var.k(value, phb.a((phb) value, false, false, null, null, khbVar, null, null, null, true, null, 3007)));
                            } else {
                                checkPinViewModel$processStartSessionResponse$1.L$0 = startSessionState3;
                                checkPinViewModel$processStartSessionResponse$1.label = 3;
                                obj = cVar.a(checkPinViewModel$processStartSessionResponse$1);
                                r52 = map3;
                            }
                        }
                        return zy11.a;
                    }
                    checkPinViewModel$processStartSessionResponse$1.L$0 = startSessionState3;
                    checkPinViewModel$processStartSessionResponse$1.Z$0 = z;
                    checkPinViewModel$processStartSessionResponse$1.label = 1;
                    if (cVar.n(checkPinViewModel$processStartSessionResponse$1) != coroutineSingletons) {
                        startSessionState2 = startSessionState3;
                        z2 = z;
                        cVar.E(true);
                        ((com.ybsdk.di.modules.features.pin.b) bVar2.c).a.g(z2);
                        Y = bVar.Y();
                        do {
                            r0Var2 = (r0) Y;
                            value2 = r0Var2.getValue();
                        } while (!r0Var2.k(value2, phb.a((phb) value2, false, false, null, null, null, null, null, startSessionState2, false, null, 3567)));
                        ((com.ybsdk.common.repositiories.auth.g) bVar.J.a).f.updateAndGet(new saj(4, new fnb0(6)));
                        i2 = qhb.a[bVar.B.getCheckType().ordinal()];
                        if (i2 != 1) {
                        }
                        Y2 = bVar.Y();
                        do {
                            r0Var3 = (r0) Y2;
                            value3 = r0Var3.getValue();
                        } while (!r0Var3.k(value3, phb.a((phb) value3, false, false, null, null, khb.c, null, null, null, false, null, 4031)));
                        return zy11.a;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    z2 = checkPinViewModel$processStartSessionResponse$1.Z$0;
                    StartSessionState startSessionState4 = (StartSessionState) checkPinViewModel$processStartSessionResponse$1.L$0;
                    kotlin.b.b(obj);
                    startSessionState2 = startSessionState4;
                    cVar.E(true);
                    ((com.ybsdk.di.modules.features.pin.b) bVar2.c).a.g(z2);
                    Y = bVar.Y();
                    do {
                        r0Var2 = (r0) Y;
                        value2 = r0Var2.getValue();
                    } while (!r0Var2.k(value2, phb.a((phb) value2, false, false, null, null, null, null, null, startSessionState2, false, null, 3567)));
                    ((com.ybsdk.common.repositiories.auth.g) bVar.J.a).f.updateAndGet(new saj(4, new fnb0(6)));
                    i2 = qhb.a[bVar.B.getCheckType().ordinal()];
                    if (i2 != 1 || i2 == 2 || i2 == 3 || i2 == 4) {
                        Y2 = bVar.Y();
                        do {
                            r0Var3 = (r0) Y2;
                            value3 = r0Var3.getValue();
                        } while (!r0Var3.k(value3, phb.a((phb) value3, false, false, null, null, khb.c, null, null, null, false, null, 4031)));
                    } else {
                        if (i2 != 5) {
                            w511.b();
                            return null;
                        }
                        bVar.z0();
                    }
                    return zy11.a;
                }
                if (i == 2) {
                    startSessionState3 = (StartSessionState) checkPinViewModel$processStartSessionResponse$1.L$0;
                    kotlin.b.b(obj);
                    map = null;
                    ((AppAnalyticsReporter) tis0Var.w).S.a.a("reissue_pin.show_forgot_code_screen", map);
                    bVar.s0(true, ((h) startSessionState3).a);
                    return zy11.a;
                }
                if (i != 3) {
                    if (i != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    map2 = null;
                    ((AppAnalyticsReporter) tis0Var.w).S.a.a("pin_code.reset_pin_after_recover_attempt", map2);
                    bVar.s0(true, ReissueActionType.TOO_MANY_ATTEMPTS);
                    return zy11.a;
                }
                startSessionState3 = (StartSessionState) checkPinViewModel$processStartSessionResponse$1.L$0;
                kotlin.b.b(obj);
                r52 = 0;
                StartSessionState startSessionState5 = startSessionState3;
                if (((Boolean) obj).booleanValue()) {
                    pz40 Y5 = bVar.Y();
                    do {
                        r0Var4 = (r0) Y5;
                        value4 = r0Var4.getValue();
                    } while (!r0Var4.k(value4, phb.a((phb) value4, false, false, null, null, new lhb(r52), Integer.valueOf(((i) startSessionState5).a), null, null, false, null, 3903)));
                    return zy11.a;
                }
                checkPinViewModel$processStartSessionResponse$1.L$0 = r52;
                checkPinViewModel$processStartSessionResponse$1.label = 4;
                map2 = r52;
            }
        }
        checkPinViewModel$processStartSessionResponse$1 = new CheckPinViewModel$processStartSessionResponse$1(bVar, continuationImpl);
        Object obj3 = checkPinViewModel$processStartSessionResponse$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = checkPinViewModel$processStartSessionResponse$1.label;
        char c2 = 3;
        Object obj22 = null;
        if (i != 0) {
        }
    }

    public final void h0(int i) {
        r0 r0Var;
        Object value;
        phb phbVar;
        if (jl40.l(((phb) X()).g, khb.d) && ((phb) X()).f.length() != 4) {
            pz40 Y = Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
                phbVar = (phb) value;
            } while (!r0Var.k(value, phb.a(phbVar, false, false, null, phbVar.f + i, null, null, null, null, false, null, 4047)));
            if (((phb) X()).f.length() == 4) {
                j0(null, false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable i0(boolean z, ContinuationImpl continuationImpl) {
        CheckPinViewModel$buildExitScreenChainWithEnterType$1 checkPinViewModel$buildExitScreenChainWithEnterType$1;
        Object obj;
        int i;
        List list;
        List list2;
        if (continuationImpl instanceof CheckPinViewModel$buildExitScreenChainWithEnterType$1) {
            checkPinViewModel$buildExitScreenChainWithEnterType$1 = (CheckPinViewModel$buildExitScreenChainWithEnterType$1) continuationImpl;
            int i2 = checkPinViewModel$buildExitScreenChainWithEnterType$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                checkPinViewModel$buildExitScreenChainWithEnterType$1.label = i2 - Integer.MIN_VALUE;
                obj = checkPinViewModel$buildExitScreenChainWithEnterType$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = checkPinViewModel$buildExitScreenChainWithEnterType$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ListBuilder a = rcc.a();
                    a.add(((zvb0) this.I).a(((phb) X()).j, z));
                    checkPinViewModel$buildExitScreenChainWithEnterType$1.L$0 = a;
                    checkPinViewModel$buildExitScreenChainWithEnterType$1.L$1 = a;
                    checkPinViewModel$buildExitScreenChainWithEnterType$1.label = 1;
                    Object f = this.E.f(checkPinViewModel$buildExitScreenChainWithEnterType$1);
                    if (f == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    list = a;
                    obj = f;
                    list2 = list;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list2 = (List) checkPinViewModel$buildExitScreenChainWithEnterType$1.L$1;
                    list = (List) checkPinViewModel$buildExitScreenChainWithEnterType$1.L$0;
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    String m448constructorimpl = PinCode.m448constructorimpl(((phb) X()).f);
                    PinScenario analyticsScenario = this.B.getCheckType().getAnalyticsScenario();
                    this.F.getClass();
                    list2.add(ycp0.a(analyticsScenario, m448constructorimpl));
                }
                return ((ListBuilder) list).j();
            }
        }
        checkPinViewModel$buildExitScreenChainWithEnterType$1 = new CheckPinViewModel$buildExitScreenChainWithEnterType$1(this, continuationImpl);
        obj = checkPinViewModel$buildExitScreenChainWithEnterType$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = checkPinViewModel$buildExitScreenChainWithEnterType$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return ((ListBuilder) list).j();
    }

    public final void j0(String str, boolean z) {
        if (jl40.l(((phb) X()).g, khb.b)) {
            return;
        }
        tis0 tis0Var = this.R;
        AppAnalyticsReporter appAnalyticsReporter = (AppAnalyticsReporter) tis0Var.w;
        int i = dhb.a[((CheckType) tis0Var.c).ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            if (z) {
                appAnalyticsReporter.S.a.a("enter_pin.enter_by_biometry", null);
            } else {
                appAnalyticsReporter.S.a.a("enter_pin.enter_by_code", null);
            }
        } else if (i == 4) {
            appAnalyticsReporter.S.a.a("enable_biometry.enter_by_code", null);
        } else {
            if (i != 5) {
                w511.b();
                return;
            }
            appAnalyticsReporter.S.a.a("change_pin.enter_by_code", null);
        }
        this.V = tje.N(ds31.a(this), null, null, new CheckPinViewModel$checkCode$1(this, str, z, null), 3);
    }

    public final com.ybsdk.feature.pin.internal.domain.a k0() {
        return this.D;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l0(ContinuationImpl continuationImpl) {
        CheckPinViewModel$navigateExitFromValidatePinScenario$1 checkPinViewModel$navigateExitFromValidatePinScenario$1;
        int i;
        boolean booleanValue;
        FragmentScreen a;
        if (continuationImpl instanceof CheckPinViewModel$navigateExitFromValidatePinScenario$1) {
            checkPinViewModel$navigateExitFromValidatePinScenario$1 = (CheckPinViewModel$navigateExitFromValidatePinScenario$1) continuationImpl;
            int i2 = checkPinViewModel$navigateExitFromValidatePinScenario$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                checkPinViewModel$navigateExitFromValidatePinScenario$1.label = i2 - Integer.MIN_VALUE;
                Object obj = checkPinViewModel$navigateExitFromValidatePinScenario$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = checkPinViewModel$navigateExitFromValidatePinScenario$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    checkPinViewModel$navigateExitFromValidatePinScenario$1.label = 1;
                    obj = this.E.f(checkPinViewModel$navigateExitFromValidatePinScenario$1);
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
                booleanValue = ((Boolean) obj).booleanValue();
                CheckPinFragment.CheckPinScreenParams checkPinScreenParams = this.B;
                tfl0 tfl0Var = this.N;
                if (!booleanValue) {
                    String m448constructorimpl = PinCode.m448constructorimpl(((phb) X()).f);
                    PinScenario analyticsScenario = checkPinScreenParams.getCheckType().getAnalyticsScenario();
                    this.F.getClass();
                    tfl0Var.l(ycp0.a(analyticsScenario, m448constructorimpl));
                } else if (checkPinScreenParams.getDropBackStack()) {
                    tfl0Var.e();
                } else {
                    a = ((zvb0) this.I).a(((phb) X()).j, true);
                    tfl0Var.l(a);
                }
                return zy11.a;
            }
        }
        checkPinViewModel$navigateExitFromValidatePinScenario$1 = new CheckPinViewModel$navigateExitFromValidatePinScenario$1(this, continuationImpl);
        Object obj2 = checkPinViewModel$navigateExitFromValidatePinScenario$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = checkPinViewModel$navigateExitFromValidatePinScenario$1.label;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        CheckPinFragment.CheckPinScreenParams checkPinScreenParams2 = this.B;
        tfl0 tfl0Var2 = this.N;
        if (!booleanValue) {
        }
        return zy11.a;
    }

    public final void m0() {
        CheckPinFragment.CheckPinScreenParams checkPinScreenParams = this.B;
        boolean canReturnOnPreviousScreen$feature_pin_release = checkPinScreenParams.getCheckType().canReturnOnPreviousScreen$feature_pin_release();
        tfl0 tfl0Var = this.N;
        if (!canReturnOnPreviousScreen$feature_pin_release || checkPinScreenParams.getDropBackStack()) {
            tfl0Var.f();
        } else {
            tfl0Var.e();
        }
    }

    public final void n0() {
        this.U.set(false);
        if (this.B.getCheckType() == CheckType.SET_BIOMETRY) {
            this.N.e();
        }
    }

    public final void o0(Throwable th) {
        int i;
        pz40 Y;
        r0 r0Var;
        Object value;
        int i2 = qhb.a[this.B.getCheckType().ordinal()];
        if (i2 != 1) {
            if (i2 == 2 || i2 == 3 || i2 == 4) {
                i = dzh0.ybsdk_common_error_try_again;
                Z(new b9s0(new n0t0(new Text.Resource(dzh0.ybsdk_nfc_payments_tokenization_fail_snackbar_title), new Text.Resource(i))));
                Y = Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, phb.a((phb) value, false, false, null, null, new mhb(th, null, 2), null, null, null, false, null, 4030)));
            }
            if (i2 != 5) {
                w511.b();
                return;
            }
        }
        i = dzh0.ybsdk_pin_biometric_failed_to_init;
        Z(new b9s0(new n0t0(new Text.Resource(dzh0.ybsdk_nfc_payments_tokenization_fail_snackbar_title), new Text.Resource(i))));
        Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, phb.a((phb) value, false, false, null, null, new mhb(th, null, 2), null, null, null, false, null, 4030)));
    }

    public final void p0(Throwable th) {
        tje.N(ds31.a(this), null, null, new CheckPinViewModel$onBiometricInitError$1(this, th, null), 3);
    }

    public final void q0(ay5 ay5Var) {
        this.U.set(false);
        tje.N(ds31.a(this), null, null, new CheckPinViewModel$onBiometricSuccess$1(this, ay5Var, null), 3);
    }

    public final void r0() {
        tje.N(ds31.a(this), null, null, new CheckPinViewModel$onCreateView$1(this, null), 3);
    }

    public final void s0(boolean z, ReissueActionType reissueActionType) {
        r0 r0Var;
        Object value;
        if (((phb) X()).g instanceof nhb) {
            Z(y0c.a);
            pz40 Y = Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, phb.a((phb) value, false, false, null, "", khb.d, null, null, null, false, null, 2975)));
            return;
        }
        CheckPinFragment.CheckPinScreenParams checkPinScreenParams = this.B;
        OnFinishStrategy onFinishStrategy = checkPinScreenParams.getCheckType().isEnterOrValidateOnReturn$feature_pin_release() ? OnFinishStrategy.OPEN_INITIAL_PRESENTER : OnFinishStrategy.EXIT;
        if (reissueActionType == null) {
            reissueActionType = ReissueActionType.NONE;
        }
        FragmentScreen b = ycp0.b(this.F, reissueActionType, onFinishStrategy, z ? PinScenario.REISSUE_PIN : PinScenario.FORGOT_PIN, false, null, 16);
        tfl0 tfl0Var = this.N;
        if (z) {
            tfl0Var.l(b);
        } else if (checkPinScreenParams.getCheckType().isEnterOrValidateOnReturn$feature_pin_release()) {
            tfl0Var.h(b);
        } else {
            tfl0Var.l(b);
        }
    }

    public final void u0() {
        this.S = true;
    }

    public final void v0(String str) {
        if (jl40.l(((phb) X()).g, khb.c)) {
            return;
        }
        pzt0 pzt0Var = this.V;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.V = null;
        this.T = true;
        ((AppAnalyticsReporter) this.R.w).S.a.a("enter_pin.action_button_clicked", null);
        h791.e((j3h) ((yvf0) this.O.b).get(), str, false, null, 14);
    }

    public final void w0(int i) {
        r0 r0Var;
        Object value;
        this.U.set(false);
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, phb.a((phb) value, false, false, null, null, new mhb(null, Integer.valueOf(i), 1), null, null, null, false, null, 4031)));
    }

    public final void x0() {
        if (this.T) {
            this.T = false;
            tje.N(ds31.a(this), null, null, new CheckPinViewModel$resetInResume$1(this, null), 3);
        }
    }

    public final void y0(String str) {
        j0(str, false);
    }

    public final void z0() {
        if (this.U.compareAndSet(false, true)) {
            Z(new r5s0(this.B.getCheckType(), this.C));
        }
    }
}
