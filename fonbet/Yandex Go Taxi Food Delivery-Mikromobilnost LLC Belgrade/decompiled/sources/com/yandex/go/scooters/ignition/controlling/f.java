package com.yandex.go.scooters.ignition.controlling;

import com.yandex.go.scooters.analytics.ScootersAnalytics$ScootersIgnitionButtonName;
import com.yandex.go.scooters.ignition.data.j;
import com.yandex.go.scooters.ignition.data.model.ScootersIgnitionExperiment;
import com.yandex.go.scooters.ignition.domain.k;
import com.yandex.go.scooters.ignition.domain.model.ScootersIgnitionOption;
import com.yandex.go.scooters.ignition.domain.n;
import defpackage.a80;
import defpackage.aqn0;
import defpackage.asn0;
import defpackage.b64;
import defpackage.bqn0;
import defpackage.brn0;
import defpackage.cl7;
import defpackage.cqn0;
import defpackage.crn0;
import defpackage.cx60;
import defpackage.dqn0;
import defpackage.dvw;
import defpackage.dx60;
import defpackage.eqn0;
import defpackage.fqn0;
import defpackage.hbp0;
import defpackage.hfa0;
import defpackage.j18;
import defpackage.jl40;
import defpackage.kpn0;
import defpackage.lpn0;
import defpackage.m950;
import defpackage.mpn0;
import defpackage.ny61;
import defpackage.qu;
import defpackage.qwo0;
import defpackage.qxm0;
import defpackage.sy60;
import defpackage.tpr;
import defpackage.tse0;
import defpackage.uj;
import defpackage.vpn0;
import defpackage.vqn0;
import defpackage.w040;
import defpackage.w511;
import defpackage.wls;
import defpackage.wpn0;
import defpackage.x4e;
import defpackage.xpn0;
import defpackage.ypn0;
import defpackage.z7n0;
import defpackage.zpn0;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes13.dex */
public final class f {
    public final qxm0 a;
    public final qwo0 b;
    public final k c;
    public final brn0 d;
    public final com.yandex.go.scooters.payments.domain.a e;
    public final com.yandex.go.scooters.ignition.data.d f;
    public final vqn0 g;
    public final n h;
    public final j i;
    public final w040 j;

    public f(qxm0 qxm0Var, qwo0 qwo0Var, k kVar, brn0 brn0Var, com.yandex.go.scooters.payments.domain.a aVar, com.yandex.go.scooters.ignition.data.d dVar, vqn0 vqn0Var, n nVar, j jVar, w040 w040Var) {
        this.a = qxm0Var;
        this.b = qwo0Var;
        this.c = kVar;
        this.d = brn0Var;
        this.e = aVar;
        this.f = dVar;
        this.g = vqn0Var;
        this.h = nVar;
        this.i = jVar;
        this.j = w040Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ScootersIgnitionOption scootersIgnitionOption, int i, mpn0 mpn0Var, vpn0 vpn0Var, ContinuationImpl continuationImpl) {
        ScootersIgnitionControllingUiActionInteractor$clickOnOption$1 scootersIgnitionControllingUiActionInteractor$clickOnOption$1;
        int i2;
        vpn0 vpn0Var2;
        vpn0 vpn0Var3;
        vpn0 vpn0Var4;
        if (continuationImpl instanceof ScootersIgnitionControllingUiActionInteractor$clickOnOption$1) {
            scootersIgnitionControllingUiActionInteractor$clickOnOption$1 = (ScootersIgnitionControllingUiActionInteractor$clickOnOption$1) continuationImpl;
            int i3 = scootersIgnitionControllingUiActionInteractor$clickOnOption$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                scootersIgnitionControllingUiActionInteractor$clickOnOption$1.label = i3 - Integer.MIN_VALUE;
                ScootersIgnitionControllingUiActionInteractor$clickOnOption$1 scootersIgnitionControllingUiActionInteractor$clickOnOption$12 = scootersIgnitionControllingUiActionInteractor$clickOnOption$1;
                Object obj = scootersIgnitionControllingUiActionInteractor$clickOnOption$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = scootersIgnitionControllingUiActionInteractor$clickOnOption$12.label;
                zy11 zy11Var = zy11.a;
                if (i2 == 0) {
                    if (i2 == 1) {
                        vpn0Var2 = (vpn0) scootersIgnitionControllingUiActionInteractor$clickOnOption$12.L$2;
                        kotlin.b.b(obj);
                        vpn0Var2.a.g(zy11Var);
                        return zy11Var;
                    }
                    if (i2 == 2) {
                        vpn0Var3 = (vpn0) scootersIgnitionControllingUiActionInteractor$clickOnOption$12.L$2;
                        kotlin.b.b(obj);
                        vpn0Var3.a.g(zy11Var);
                        return zy11Var;
                    }
                    if (i2 != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vpn0Var4 = (vpn0) scootersIgnitionControllingUiActionInteractor$clickOnOption$12.L$2;
                    kotlin.b.b(obj);
                    vpn0Var4.a.g(zy11Var);
                    return zy11Var;
                }
                kotlin.b.b(obj);
                int i4 = fqn0.a[scootersIgnitionOption.ordinal()];
                qxm0 qxm0Var = this.a;
                if (i4 == 1) {
                    qxm0Var.c(ScootersAnalytics$ScootersIgnitionButtonName.AllowNotification);
                    wls scootersIgnitionControllingUiActionInteractor$clickOnOption$2 = new ScootersIgnitionControllingUiActionInteractor$clickOnOption$2(2, this, f.class, "handleNotificationOption", "handleNotificationOption-mm8j1I0(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                    scootersIgnitionControllingUiActionInteractor$clickOnOption$12.L$0 = null;
                    scootersIgnitionControllingUiActionInteractor$clickOnOption$12.L$1 = null;
                    scootersIgnitionControllingUiActionInteractor$clickOnOption$12.L$2 = vpn0Var;
                    scootersIgnitionControllingUiActionInteractor$clickOnOption$12.I$0 = i;
                    scootersIgnitionControllingUiActionInteractor$clickOnOption$12.label = 1;
                    if (b(mpn0Var, scootersIgnitionOption, i, scootersIgnitionControllingUiActionInteractor$clickOnOption$2, scootersIgnitionControllingUiActionInteractor$clickOnOption$12) != obj2) {
                        vpn0Var2 = vpn0Var;
                        vpn0Var2.a.g(zy11Var);
                        return zy11Var;
                    }
                } else if (i4 == 2) {
                    qxm0Var.c(ScootersAnalytics$ScootersIgnitionButtonName.AllowGeolocation);
                    wls scootersIgnitionControllingUiActionInteractor$clickOnOption$3 = new ScootersIgnitionControllingUiActionInteractor$clickOnOption$3(2, this, f.class, "handleGeolocationOption", "handleGeolocationOption-mm8j1I0(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                    scootersIgnitionControllingUiActionInteractor$clickOnOption$12.L$0 = null;
                    scootersIgnitionControllingUiActionInteractor$clickOnOption$12.L$1 = null;
                    scootersIgnitionControllingUiActionInteractor$clickOnOption$12.L$2 = vpn0Var;
                    scootersIgnitionControllingUiActionInteractor$clickOnOption$12.I$0 = i;
                    scootersIgnitionControllingUiActionInteractor$clickOnOption$12.label = 2;
                    if (b(mpn0Var, scootersIgnitionOption, i, scootersIgnitionControllingUiActionInteractor$clickOnOption$3, scootersIgnitionControllingUiActionInteractor$clickOnOption$12) != obj2) {
                        vpn0Var3 = vpn0Var;
                        vpn0Var3.a.g(zy11Var);
                        return zy11Var;
                    }
                } else {
                    if (i4 != 3) {
                        w511.b();
                        return null;
                    }
                    qxm0Var.c(ScootersAnalytics$ScootersIgnitionButtonName.AllowBluetooth);
                    wls scootersIgnitionControllingUiActionInteractor$clickOnOption$4 = new ScootersIgnitionControllingUiActionInteractor$clickOnOption$4(2, this, f.class, "handleBluetoothOption", "handleBluetoothOption-mm8j1I0(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                    scootersIgnitionControllingUiActionInteractor$clickOnOption$12.L$0 = null;
                    scootersIgnitionControllingUiActionInteractor$clickOnOption$12.L$1 = null;
                    scootersIgnitionControllingUiActionInteractor$clickOnOption$12.L$2 = vpn0Var;
                    scootersIgnitionControllingUiActionInteractor$clickOnOption$12.I$0 = i;
                    scootersIgnitionControllingUiActionInteractor$clickOnOption$12.label = 3;
                    if (b(mpn0Var, scootersIgnitionOption, i, scootersIgnitionControllingUiActionInteractor$clickOnOption$4, scootersIgnitionControllingUiActionInteractor$clickOnOption$12) != obj2) {
                        vpn0Var4 = vpn0Var;
                        vpn0Var4.a.g(zy11Var);
                        return zy11Var;
                    }
                }
                return obj2;
            }
        }
        scootersIgnitionControllingUiActionInteractor$clickOnOption$1 = new ScootersIgnitionControllingUiActionInteractor$clickOnOption$1(this, continuationImpl);
        ScootersIgnitionControllingUiActionInteractor$clickOnOption$1 scootersIgnitionControllingUiActionInteractor$clickOnOption$122 = scootersIgnitionControllingUiActionInteractor$clickOnOption$1;
        Object obj3 = scootersIgnitionControllingUiActionInteractor$clickOnOption$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = scootersIgnitionControllingUiActionInteractor$clickOnOption$122.label;
        zy11 zy11Var2 = zy11.a;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x015c, code lost:
    
        if (r2.s() == r4) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0179 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, uj] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(mpn0 mpn0Var, ScootersIgnitionOption scootersIgnitionOption, int i, wls wlsVar, ContinuationImpl continuationImpl) {
        ScootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1 scootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1;
        int i2;
        ScootersIgnitionOption scootersIgnitionOption2;
        int i3;
        wls wlsVar2;
        mpn0 mpn0Var2;
        ScootersIgnitionExperiment.Ui.PermissionsInfo permissionsInfo;
        ScootersIgnitionExperiment.Ui.PermissionsInfoItem permissionsInfoItem;
        if (continuationImpl instanceof ScootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1) {
            scootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1 = (ScootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1) continuationImpl;
            int i4 = scootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                scootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1.label = i4 - Integer.MIN_VALUE;
                Object obj = scootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = scootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1.label;
                zy11 zy11Var = zy11.a;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    if (i != 0) {
                        scootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1.L$0 = mpn0Var;
                        scootersIgnitionOption2 = scootersIgnitionOption;
                        scootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1.L$1 = scootersIgnitionOption2;
                        scootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1.L$2 = wlsVar;
                        scootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1.I$0 = i;
                        scootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1.label = 1;
                        Object b = this.d.a.b(scootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1);
                        if (b != coroutineSingletons) {
                            obj = b;
                            i3 = i;
                            wlsVar2 = wlsVar;
                            mpn0Var2 = mpn0Var;
                        }
                    }
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            i3 = scootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1.I$0;
                            wlsVar2 = (wls) scootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1.L$2;
                            kotlin.b.b(obj);
                            crn0 crn0Var = new crn0(i3);
                            scootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1.L$0 = null;
                            scootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1.L$1 = null;
                            scootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1.L$2 = null;
                            scootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1.L$3 = null;
                            scootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1.L$4 = null;
                            scootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1.I$0 = i3;
                            scootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1.label = 4;
                            return wlsVar2.invoke(crn0Var, scootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1) != coroutineSingletons ? coroutineSingletons : zy11Var;
                        }
                        if (i2 != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                i3 = scootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1.I$0;
                wlsVar2 = (wls) scootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1.L$2;
                scootersIgnitionOption2 = (ScootersIgnitionOption) scootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1.L$1;
                mpn0Var2 = (mpn0) scootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1.L$0;
                kotlin.b.b(obj);
                ScootersIgnitionExperiment.Ui.PermissionsInfoContainer permissionsInfoContainer = ((ScootersIgnitionExperiment) obj).r.f;
                permissionsInfo = permissionsInfoContainer == null ? permissionsInfoContainer.a : null;
                if (permissionsInfo != null) {
                    crn0 crn0Var2 = new crn0(i3);
                    scootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1.L$0 = null;
                    scootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1.L$1 = null;
                    scootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1.L$2 = null;
                    scootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1.L$3 = null;
                    scootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1.I$0 = i3;
                    scootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1.label = 2;
                    if (wlsVar2.invoke(crn0Var2, scootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1) == coroutineSingletons) {
                    }
                } else {
                    int i5 = fqn0.a[scootersIgnitionOption2.ordinal()];
                    if (i5 == 1) {
                        permissionsInfoItem = permissionsInfo.a;
                    } else if (i5 == 2) {
                        permissionsInfoItem = permissionsInfo.b;
                    } else {
                        if (i5 != 3) {
                            w511.b();
                            return null;
                        }
                        permissionsInfoItem = permissionsInfo.c;
                    }
                    if (permissionsInfoItem != null) {
                        scootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1.L$0 = mpn0Var2;
                        scootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1.L$1 = scootersIgnitionOption2;
                        scootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1.L$2 = wlsVar2;
                        scootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1.L$3 = null;
                        scootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1.L$4 = null;
                        scootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1.I$0 = i3;
                        scootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1.label = 3;
                        j18 j18Var = new j18(1, dvw.b(scootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1));
                        Ref$ObjectRef y = b64.y(j18Var);
                        cx60 cx60Var = new cx60(6, y);
                        cl7 cl7Var = new cl7(j18Var, cx60Var);
                        a80 a80Var = new a80(28, new ScootersIgnitionControllingUiActionInteractor$clickOnSpecificOptiondlKKtPk$$inlined$suspendCallbackApi$2(1, cl7Var, cl7.class, "success", "success(Ljava/lang/Object;)V", 0));
                        c cVar = mpn0Var2.a;
                        cVar.A((m950) cVar.K.get(), new asn0(scootersIgnitionOption2), new lpn0(a80Var));
                        y.element = uj.G;
                        if (cl7Var.c()) {
                            cx60Var.invoke();
                        } else {
                            j18Var.w(new dx60(cl7Var, 7));
                        }
                    }
                    crn0 crn0Var3 = new crn0(i3);
                    scootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1.L$0 = null;
                    scootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1.L$1 = null;
                    scootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1.L$2 = null;
                    scootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1.L$3 = null;
                    scootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1.L$4 = null;
                    scootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1.I$0 = i3;
                    scootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1.label = 4;
                    if (wlsVar2.invoke(crn0Var3, scootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1) != coroutineSingletons) {
                    }
                }
            }
        }
        scootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1 = new ScootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1(this, continuationImpl);
        Object obj2 = scootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = scootersIgnitionControllingUiActionInteractor$clickOnSpecificOption$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i2 != 0) {
        }
        ScootersIgnitionExperiment.Ui.PermissionsInfoContainer permissionsInfoContainer2 = ((ScootersIgnitionExperiment) obj2).r.f;
        if (permissionsInfoContainer2 == null) {
        }
        if (permissionsInfo != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0164 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(eqn0 eqn0Var, mpn0 mpn0Var, vpn0 vpn0Var, ContinuationImpl continuationImpl) {
        ScootersIgnitionControllingUiActionInteractor$handleAction$1 scootersIgnitionControllingUiActionInteractor$handleAction$1;
        int i;
        tpr d;
        if (continuationImpl instanceof ScootersIgnitionControllingUiActionInteractor$handleAction$1) {
            scootersIgnitionControllingUiActionInteractor$handleAction$1 = (ScootersIgnitionControllingUiActionInteractor$handleAction$1) continuationImpl;
            int i2 = scootersIgnitionControllingUiActionInteractor$handleAction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersIgnitionControllingUiActionInteractor$handleAction$1.label = i2 - Integer.MIN_VALUE;
                ScootersIgnitionControllingUiActionInteractor$handleAction$1 scootersIgnitionControllingUiActionInteractor$handleAction$12 = scootersIgnitionControllingUiActionInteractor$handleAction$1;
                Object obj = scootersIgnitionControllingUiActionInteractor$handleAction$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersIgnitionControllingUiActionInteractor$handleAction$12.label;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                kotlin.b.b(obj);
                boolean l = jl40.l(eqn0Var, dqn0.a);
                qxm0 qxm0Var = this.a;
                if (l) {
                    qwo0 qwo0Var = this.b;
                    boolean a = qwo0Var.a();
                    boolean z = !a;
                    HashMap p = tse0.p(qxm0Var);
                    qxm0Var.a.a("Scooters.Ignition.Opened", p, 1, x4e.r(z, p, "is_first_time"));
                    if (!a) {
                        qwo0Var.q.setValue(qwo0Var, qwo0.B[15], Boolean.TRUE);
                    }
                    com.yandex.go.scooters.payments.domain.a aVar = this.e;
                    if (aVar.c().equals(hfa0.c)) {
                        d = aVar.d(null, true);
                        scootersIgnitionControllingUiActionInteractor$handleAction$12.L$0 = null;
                        scootersIgnitionControllingUiActionInteractor$handleAction$12.L$1 = null;
                        scootersIgnitionControllingUiActionInteractor$handleAction$12.L$2 = null;
                        scootersIgnitionControllingUiActionInteractor$handleAction$12.I$0 = z ? 1 : 0;
                        scootersIgnitionControllingUiActionInteractor$handleAction$12.label = 1;
                        if (kotlinx.coroutines.flow.e.y(d, scootersIgnitionControllingUiActionInteractor$handleAction$12) == obj2) {
                            return obj2;
                        }
                    }
                    return zy11Var;
                }
                if (eqn0Var instanceof xpn0) {
                    mpn0Var.a.r(new qu(9));
                    return zy11Var;
                }
                if (eqn0Var instanceof zpn0) {
                    qxm0Var.c(ScootersAnalytics$ScootersIgnitionButtonName.Enable);
                    hbp0.e(this.g.a(), null, null, new ScootersIgnitionControllingUiActionInteractor$handleAction$2(this, null), 3);
                    mpn0Var.a.r(new qu(9));
                    return zy11Var;
                }
                if (eqn0Var instanceof ypn0) {
                    qxm0Var.c(ScootersAnalytics$ScootersIgnitionButtonName.Disable);
                    e eVar = new e(this, mpn0Var);
                    c cVar = mpn0Var.a;
                    cVar.z((m950) cVar.L.get(), new kpn0(eVar));
                    return zy11Var;
                }
                if (eqn0Var instanceof cqn0) {
                    qxm0Var.c(ScootersAnalytics$ScootersIgnitionButtonName.ItemOnboarding);
                    String str = ((cqn0) eqn0Var).a;
                    c cVar2 = mpn0Var.a;
                    cVar2.A((m950) cVar2.J.get(), new z7n0(str, true), sy60.Q2);
                    return zy11Var;
                }
                if (eqn0Var instanceof bqn0) {
                    bqn0 bqn0Var = (bqn0) eqn0Var;
                    qxm0Var.c(bqn0Var.b ? ScootersAnalytics$ScootersIgnitionButtonName.ItemLegalTerms : ScootersAnalytics$ScootersIgnitionButtonName.BottomLegalTerms);
                    mpn0Var.a(bqn0Var.a);
                    return zy11Var;
                }
                if (eqn0Var instanceof aqn0) {
                    mpn0Var.a(((aqn0) eqn0Var).a);
                    return zy11Var;
                }
                if (!(eqn0Var instanceof wpn0)) {
                    w511.b();
                    return null;
                }
                wpn0 wpn0Var = (wpn0) eqn0Var;
                int i3 = wpn0Var.b;
                if (i3 != 0) {
                    ScootersIgnitionOption scootersIgnitionOption = wpn0Var.a;
                    scootersIgnitionControllingUiActionInteractor$handleAction$12.L$0 = null;
                    scootersIgnitionControllingUiActionInteractor$handleAction$12.L$1 = null;
                    scootersIgnitionControllingUiActionInteractor$handleAction$12.L$2 = null;
                    scootersIgnitionControllingUiActionInteractor$handleAction$12.label = 2;
                    Object a2 = a(scootersIgnitionOption, i3, mpn0Var, vpn0Var, scootersIgnitionControllingUiActionInteractor$handleAction$12);
                    if (a2 != obj2) {
                        return a2;
                    }
                }
                return zy11Var;
            }
        }
        scootersIgnitionControllingUiActionInteractor$handleAction$1 = new ScootersIgnitionControllingUiActionInteractor$handleAction$1(this, continuationImpl);
        ScootersIgnitionControllingUiActionInteractor$handleAction$1 scootersIgnitionControllingUiActionInteractor$handleAction$122 = scootersIgnitionControllingUiActionInteractor$handleAction$1;
        Object obj3 = scootersIgnitionControllingUiActionInteractor$handleAction$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersIgnitionControllingUiActionInteractor$handleAction$122.label;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
    }
}
