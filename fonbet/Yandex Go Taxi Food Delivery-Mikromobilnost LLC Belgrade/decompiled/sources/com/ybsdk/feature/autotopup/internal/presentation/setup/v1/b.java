package com.ybsdk.feature.autotopup.internal.presentation.setup.v1;

import androidx.lifecycle.Lifecycle;
import com.ybsdk.core.analytics.generated.AutoTopupSettingsResultTypeAutotopup;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsBackSaveVersion;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsExitVersion;
import com.ybsdk.core.analytics.generated.delegates.CommonEvents$FullscreenNotificationButtonClickButtonType;
import com.ybsdk.core.analytics.generated.delegates.CommonEvents$FullscreenNotificationButtonClickScreen;
import com.ybsdk.core.analytics.generated.delegates.CommonEvents$FullscreenNotificationCloseScreen;
import com.ybsdk.core.analytics.generated.delegates.CommonEvents$FullscreenNotificationShownScreen;
import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.autotopup.api.AutoTopupSwitchStatus;
import com.ybsdk.feature.autotopup.api.AutoTopupType;
import com.ybsdk.feature.autotopup.api.TwoFactorAuthResult;
import com.ybsdk.feature.autotopup.api.domain.model.AutoTopupRequestStatusPollingOption;
import com.ybsdk.feature.autotopup.internal.domain.analytics.data.BottomSheetConfirmSaveDataEvent;
import com.ybsdk.feature.autotopup.internal.domain.analytics.data.ClickEvent;
import com.ybsdk.feature.autotopup.internal.domain.c;
import com.ybsdk.feature.autotopup.internal.domain.e;
import com.ybsdk.feature.autotopup.internal.domain.entities.AutoFundInputType;
import com.ybsdk.feature.autotopup.internal.domain.entities.AutoTopupInputType;
import com.ybsdk.feature.autotopup.internal.domain.f;
import com.ybsdk.feature.autotopup.internal.presentation.result.AutoTopupResultParams;
import com.ybsdk.feature.autotopup.internal.presentation.setup.v1.b;
import com.ybsdk.feature.deeplink.api.DeeplinkHandleResult$DeeplinkType;
import com.ybsdk.feature.settings.api.SettingsOpeningSource;
import com.ybsdk.feature.transfer.api.TransferSelectedTargetEntity;
import defpackage.a24;
import defpackage.at01;
import defpackage.b3z;
import defpackage.bqg;
import defpackage.c24;
import defpackage.cqg;
import defpackage.d24;
import defpackage.d2b1;
import defpackage.dqg;
import defpackage.ds31;
import defpackage.dzh0;
import defpackage.e24;
import defpackage.e2b1;
import defpackage.e5a0;
import defpackage.em3;
import defpackage.f02;
import defpackage.f5a0;
import defpackage.g191;
import defpackage.g8e;
import defpackage.gao;
import defpackage.gtu0;
import defpackage.h0;
import defpackage.h0w;
import defpackage.h52;
import defpackage.h5a0;
import defpackage.h791;
import defpackage.hu3;
import defpackage.i5z0;
import defpackage.iky0;
import defpackage.iu3;
import defpackage.iw3;
import defpackage.iz3;
import defpackage.j04;
import defpackage.j14;
import defpackage.j3h;
import defpackage.j73;
import defpackage.jl40;
import defpackage.ju3;
import defpackage.jw3;
import defpackage.k2b1;
import defpackage.k4;
import defpackage.ku3;
import defpackage.l04;
import defpackage.l14;
import defpackage.l76;
import defpackage.lrp0;
import defpackage.lz3;
import defpackage.m14;
import defpackage.mv3;
import defpackage.mz3;
import defpackage.mzl0;
import defpackage.n0t0;
import defpackage.nk2;
import defpackage.np41;
import defpackage.nsz0;
import defpackage.nv3;
import defpackage.ny61;
import defpackage.nz3;
import defpackage.nzl0;
import defpackage.o14;
import defpackage.ov3;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.qis;
import defpackage.qz3;
import defpackage.r14;
import defpackage.rsa1;
import defpackage.rv3;
import defpackage.s8j0;
import defpackage.sls;
import defpackage.srp0;
import defpackage.sv3;
import defpackage.sy3;
import defpackage.t8j0;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.trc;
import defpackage.txz0;
import defpackage.ty21;
import defpackage.ty3;
import defpackage.u24;
import defpackage.u8j0;
import defpackage.uc5;
import defpackage.uk11;
import defpackage.unr0;
import defpackage.us3;
import defpackage.uz21;
import defpackage.vou0;
import defpackage.vvb1;
import defpackage.vz21;
import defpackage.vz6;
import defpackage.w511;
import defpackage.wz21;
import defpackage.x0h;
import defpackage.x4c;
import defpackage.xz21;
import defpackage.yvf0;
import defpackage.z94;
import defpackage.zka1;
import defpackage.zy11;
import defpackage.zz6;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* loaded from: classes3.dex */
public final class b extends uc5 {
    public final AutoTopupSetupParams B;
    public final tfl0 C;
    public final iz3 D;
    public final uk11 E;
    public final iw3 F;
    public final g191 G;
    public final jw3 H;
    public final l04 I;
    public final ov3 J;
    public final h0w K;
    public final com.ybsdk.feature.banners.impl.domain.interactors.a L;
    public final e M;
    public final c N;
    public final us3 O;
    public final f P;
    public boolean Q;
    public pzt0 R;
    public pzt0 S;
    public pzt0 T;
    public pzt0 U;

    public b(AutoTopupSetupParams autoTopupSetupParams, tfl0 tfl0Var, iz3 iz3Var, uk11 uk11Var, iw3 iw3Var, g191 g191Var, jw3 jw3Var, l04 l04Var, ov3 ov3Var, h0w h0wVar, com.ybsdk.feature.banners.impl.domain.interactors.a aVar, e eVar, c cVar, a24 a24Var, u24 u24Var, us3 us3Var) {
        super(new f02(11, autoTopupSetupParams), a24Var);
        this.B = autoTopupSetupParams;
        this.C = tfl0Var;
        this.D = iz3Var;
        this.E = uk11Var;
        this.F = iw3Var;
        this.G = g191Var;
        this.H = jw3Var;
        this.I = l04Var;
        this.J = ov3Var;
        this.K = h0wVar;
        this.L = aVar;
        this.M = eVar;
        this.N = cVar;
        this.O = us3Var;
        f fVar = new f(ds31.a(this), (com.ybsdk.feature.autotopup.internal.data.b) ((k4) u24Var.a.b).get());
        this.P = fVar;
        final int i = 0;
        fVar.b(new j14(this, i));
        final int i2 = 1;
        sv3 sv3Var = (sv3) iw3Var;
        sv3Var.b(new j14(this, i2));
        sls slsVar = new sls(this) { // from class: k14
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                r0 r0Var;
                Object value;
                int i3 = i;
                zy11 zy11Var = zy11.a;
                b bVar = this.b;
                switch (i3) {
                    case 0:
                        bVar.f0();
                        pz40 Y = bVar.Y();
                        do {
                            r0Var = (r0) Y;
                            value = r0Var.getValue();
                        } while (!r0Var.k(value, j04.a((j04) value, null, false, null, null, null, null, null, null, vvb1.c, null, null, null, null, null, null, null, 261631)));
                    default:
                        bVar.a0(new j14(bVar, 2));
                        break;
                }
                return zy11Var;
            }
        };
        b3z b3zVar = sv3Var.a;
        DeeplinkHandleResult$DeeplinkType deeplinkHandleResult$DeeplinkType = DeeplinkHandleResult$DeeplinkType.SCREEN_OPEN;
        b3zVar.a(new rv3(deeplinkHandleResult$DeeplinkType, slsVar, 0));
        b3zVar.a(new mv3(deeplinkHandleResult$DeeplinkType, new a(this), 7));
        b3zVar.a(new rv3(deeplinkHandleResult$DeeplinkType, new sls(this) { // from class: k14
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                r0 r0Var;
                Object value;
                int i3 = i2;
                zy11 zy11Var = zy11.a;
                b bVar = this.b;
                switch (i3) {
                    case 0:
                        bVar.f0();
                        pz40 Y = bVar.Y();
                        do {
                            r0Var = (r0) Y;
                            value = r0Var.getValue();
                        } while (!r0Var.k(value, j04.a((j04) value, null, false, null, null, null, null, null, null, vvb1.c, null, null, null, null, null, null, null, 261631)));
                    default:
                        bVar.a0(new j14(bVar, 2));
                        break;
                }
                return zy11Var;
            }
        }, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x008b, code lost:
    
        if (r2 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00c1, code lost:
    
        if (r5 == null) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b0(b bVar, qz3 qz3Var, h5a0 h5a0Var, ContinuationImpl continuationImpl) {
        AutoTopupSetupViewModel$validateFields$1 autoTopupSetupViewModel$validateFields$1;
        int i;
        AutoTopupSwitchStatus autoTopupSwitchStatus;
        AutoTopupSwitchStatus autoTopupSwitchStatus2;
        AutoTopupSwitchStatus autoTopupSwitchStatus3;
        ty21 ty21Var;
        h5a0 h5a0Var2;
        xz21 xz21Var;
        r0 r0Var;
        Object value;
        Boolean valueOf;
        lz3 lz3Var;
        qz3 qz3Var2 = qz3Var;
        bVar.getClass();
        if (continuationImpl instanceof AutoTopupSetupViewModel$validateFields$1) {
            autoTopupSetupViewModel$validateFields$1 = (AutoTopupSetupViewModel$validateFields$1) continuationImpl;
            int i2 = autoTopupSetupViewModel$validateFields$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoTopupSetupViewModel$validateFields$1.label = i2 - Integer.MIN_VALUE;
                Object obj = autoTopupSetupViewModel$validateFields$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoTopupSetupViewModel$validateFields$1.label;
                mzl0 mzl0Var = null;
                boolean z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str = qz3Var2.a;
                    String b = ((j04) bVar.X()).b();
                    String c = ((j04) bVar.X()).c();
                    h5a0 h5a0Var3 = ((j04) bVar.X()).f;
                    AutoTopupType d = k2b1.d(qz3Var2, ((j04) bVar.X()).k);
                    Boolean bool = ((j04) bVar.X()).n;
                    if (bool != null) {
                        boolean booleanValue = bool.booleanValue();
                        if (booleanValue) {
                            autoTopupSwitchStatus = AutoTopupSwitchStatus.ENABLED;
                        } else {
                            if (booleanValue) {
                                w511.b();
                                return null;
                            }
                            autoTopupSwitchStatus = AutoTopupSwitchStatus.DISABLED;
                        }
                    }
                    boolean z2 = qz3Var2.j.a;
                    if (z2) {
                        autoTopupSwitchStatus = AutoTopupSwitchStatus.ENABLED;
                    } else {
                        if (z2) {
                            w511.b();
                            return null;
                        }
                        autoTopupSwitchStatus = AutoTopupSwitchStatus.DISABLED;
                    }
                    AutoTopupSwitchStatus autoTopupSwitchStatus4 = autoTopupSwitchStatus;
                    String str2 = ((j04) bVar.X()).m;
                    Boolean bool2 = ((j04) bVar.X()).l;
                    if (bool2 != null) {
                        boolean booleanValue2 = bool2.booleanValue();
                        if (booleanValue2) {
                            autoTopupSwitchStatus3 = AutoTopupSwitchStatus.ENABLED;
                        } else {
                            if (booleanValue2) {
                                w511.b();
                                return null;
                            }
                            autoTopupSwitchStatus3 = AutoTopupSwitchStatus.DISABLED;
                        }
                    }
                    lz3 lz3Var2 = qz3Var2.k;
                    if (lz3Var2 != null) {
                        boolean z3 = lz3Var2.a;
                        if (z3) {
                            autoTopupSwitchStatus3 = AutoTopupSwitchStatus.ENABLED;
                        } else {
                            if (z3) {
                                w511.b();
                                return null;
                            }
                            autoTopupSwitchStatus3 = AutoTopupSwitchStatus.DISABLED;
                        }
                        autoTopupSwitchStatus2 = autoTopupSwitchStatus3;
                        ty21Var = new ty21(str, b, c, h5a0Var3, d, autoTopupSwitchStatus4, autoTopupSwitchStatus2, str2);
                        f fVar = bVar.P;
                        autoTopupSetupViewModel$validateFields$1.L$0 = qz3Var2;
                        autoTopupSetupViewModel$validateFields$1.L$1 = h5a0Var;
                        autoTopupSetupViewModel$validateFields$1.L$2 = ty21Var;
                        autoTopupSetupViewModel$validateFields$1.label = 1;
                        obj = fVar.a(ty21Var, autoTopupSetupViewModel$validateFields$1);
                        if (obj != coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        h5a0Var2 = h5a0Var;
                    } else {
                        autoTopupSwitchStatus2 = null;
                        ty21Var = new ty21(str, b, c, h5a0Var3, d, autoTopupSwitchStatus4, autoTopupSwitchStatus2, str2);
                        f fVar2 = bVar.P;
                        autoTopupSetupViewModel$validateFields$1.L$0 = qz3Var2;
                        autoTopupSetupViewModel$validateFields$1.L$1 = h5a0Var;
                        autoTopupSetupViewModel$validateFields$1.L$2 = ty21Var;
                        autoTopupSetupViewModel$validateFields$1.label = 1;
                        obj = fVar2.a(ty21Var, autoTopupSetupViewModel$validateFields$1);
                        if (obj != coroutineSingletons) {
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ty21 ty21Var2 = (ty21) autoTopupSetupViewModel$validateFields$1.L$2;
                    h5a0 h5a0Var4 = (h5a0) autoTopupSetupViewModel$validateFields$1.L$1;
                    qz3 qz3Var3 = (qz3) autoTopupSetupViewModel$validateFields$1.L$0;
                    kotlin.b.b(obj);
                    ty21Var = ty21Var2;
                    qz3Var2 = qz3Var3;
                    h5a0Var2 = h5a0Var4;
                }
                xz21Var = (xz21) obj;
                if (!(xz21Var instanceof vz21)) {
                    ty21Var = ((vz21) xz21Var).a;
                } else {
                    if (xz21Var instanceof uz21) {
                        pz40 Y = bVar.Y();
                        do {
                            r0Var = (r0) Y;
                            value = r0Var.getValue();
                        } while (!r0Var.k(value, j04.a((j04) value, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262139)));
                        return null;
                    }
                    if (!jl40.l(xz21Var, wz21.a)) {
                        w511.b();
                        return null;
                    }
                }
                qz3 qz3Var4 = (qz3) ((j04) bVar.X()).a.a();
                valueOf = (qz3Var4 != null || (lz3Var = qz3Var4.k) == null) ? null : Boolean.valueOf(lz3Var.a);
                if (valueOf != null) {
                    if (!valueOf.equals(Boolean.TRUE) && !valueOf.equals(Boolean.FALSE)) {
                        w511.b();
                        return null;
                    }
                    String str3 = ty21Var.h;
                    AutoTopupSwitchStatus autoTopupSwitchStatus5 = ty21Var.g;
                    int i3 = autoTopupSwitchStatus5 == null ? -1 : r14.a[autoTopupSwitchStatus5.ordinal()];
                    if (i3 == -1) {
                        z = valueOf.booleanValue();
                    } else if (i3 != 1) {
                        if (i3 != 2) {
                            w511.b();
                            return null;
                        }
                        z = false;
                    }
                    mzl0Var = new mzl0(z, str3);
                }
                return new nzl0(ty21Var.a, ty21Var.b, ty21Var.c, h5a0Var2, k2b1.d(qz3Var2, ((j04) bVar.X()).k), ty21Var.f, mzl0Var);
            }
        }
        autoTopupSetupViewModel$validateFields$1 = new AutoTopupSetupViewModel$validateFields$1(bVar, continuationImpl);
        Object obj2 = autoTopupSetupViewModel$validateFields$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoTopupSetupViewModel$validateFields$1.label;
        mzl0 mzl0Var2 = null;
        boolean z4 = true;
        if (i != 0) {
        }
        xz21Var = (xz21) obj2;
        if (!(xz21Var instanceof vz21)) {
        }
        qz3 qz3Var42 = (qz3) ((j04) bVar.X()).a.a();
        if (qz3Var42 != null) {
        }
        if (valueOf != null) {
        }
        return new nzl0(ty21Var.a, ty21Var.b, ty21Var.c, h5a0Var2, k2b1.d(qz3Var2, ((j04) bVar.X()).k), ty21Var.f, mzl0Var2);
    }

    public final void A0(String str) {
        h0w h0wVar = this.K;
        h791.f((j3h) ((yvf0) h0wVar.b).get(), str, ((com.ybsdk.feature.webview.internal.a) ((np41) h0wVar.c)).f(str));
        i5z0.a.a("open WebViewScreen", new Object[0]);
    }

    public final void B0(TransferSelectedTargetEntity transferSelectedTargetEntity) {
        this.Q = false;
        if (transferSelectedTargetEntity == null) {
            return;
        }
        e5a0 a = at01.a(transferSelectedTargetEntity);
        com.ybsdk.core.utils.text.b bVar = Text.Companion;
        int i = dzh0.ybsdk_deposit_deposit_payment_method_prefix;
        com.ybsdk.core.utils.text.c cVar = Text.Formatted.Arg.Companion;
        String title = transferSelectedTargetEntity.getTitle();
        cVar.getClass();
        Text.Formatted.Arg[] argArr = {new Text.Formatted.Arg.StringArg(title)};
        bVar.getClass();
        V0(e5a0.e(a, com.ybsdk.core.utils.text.b.b(i, argArr)));
    }

    public final boolean C0(String str, CommonEvents$FullscreenNotificationButtonClickButtonType commonEvents$FullscreenNotificationButtonClickButtonType) {
        boolean d = ((j04) X()).d();
        h5a0 h5a0Var = ((j04) X()).f;
        if (!d || !(h5a0Var instanceof e5a0) || str == null) {
            return false;
        }
        String c = gtu0.c(str, "NSPK_ID_PLACEHOLDER", ((e5a0) h5a0Var).f);
        vou0 vou0Var = ((j04) X()).o;
        String str2 = vou0Var != null ? vou0Var.c : null;
        em3 em3Var = this.O.a.o;
        CommonEvents$FullscreenNotificationButtonClickScreen commonEvents$FullscreenNotificationButtonClickScreen = CommonEvents$FullscreenNotificationButtonClickScreen.AUTOTOPUP;
        LinkedHashMap linkedHashMap = new LinkedHashMap(5);
        linkedHashMap.put(MetaDataField.SCREEN_FIELD, commonEvents$FullscreenNotificationButtonClickScreen.getOriginalValue());
        if (str2 != null) {
            linkedHashMap.put("fullscreen_name", str2);
        }
        linkedHashMap.put("action", c);
        linkedHashMap.put("button_type", commonEvents$FullscreenNotificationButtonClickButtonType.getOriginalValue());
        em3Var.a.a("fullscreen_notification.button.click", linkedHashMap);
        ((sv3) this.F).c(c);
        return true;
    }

    public final void D0() {
        String str = ((j04) X()).m;
        z94 z94Var = this.I.a.e;
        z94Var.a.a("auto_topup.settings.moment_of_payment.sum_correcting", g8e.w(1, "sum", str));
    }

    public final void E0() {
        String b = ((j04) X()).b();
        z94 z94Var = this.I.a.e;
        z94Var.a.a("auto_topup.settings.topup_target_sum.changed", g8e.w(1, "sum", b));
    }

    public final void F0() {
        String c = ((j04) X()).c();
        z94 z94Var = this.I.a.e;
        z94Var.a.a("auto_topup.settings.topup_lower_limit.changed", g8e.w(1, "sum", c));
    }

    public final void G0() {
        r0 r0Var;
        Object value;
        j04 j04Var;
        e0();
        W0();
        f0();
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
            j04Var = (j04) value;
        } while (!r0Var.k(value, j04.a(j04Var, null, false, null, null, null, null, null, null, new ju3(j04Var.f), null, null, null, null, null, null, null, 261631)));
    }

    public final void H0() {
        zz6 zz6Var;
        vou0 vou0Var = ((j04) X()).o;
        if (C0((vou0Var == null || (zz6Var = vou0Var.j) == null) ? null : zz6Var.a.c, CommonEvents$FullscreenNotificationButtonClickButtonType.PRIMARY)) {
            return;
        }
        this.I.b(ClickEvent.CLICK_BUTTON);
        U0(null);
    }

    public final void I0(TwoFactorAuthResult twoFactorAuthResult) {
        r0 r0Var;
        Object value;
        this.Q = false;
        if (twoFactorAuthResult.equals(TwoFactorAuthResult.Cancel.INSTANCE)) {
            pz40 Y = Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, j04.a((j04) value, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262075)));
            return;
        }
        if (twoFactorAuthResult instanceof TwoFactorAuthResult.Success) {
            U0(((TwoFactorAuthResult.Success) twoFactorAuthResult).getVerificationToken());
        } else {
            w511.b();
        }
    }

    public final void J0() {
        if (this.Q) {
            g0();
        }
        this.Q = false;
    }

    public final void K0() {
        r0 r0Var;
        Object value;
        e0();
        W0();
        if (((j04) X()).d() || ((j04) X()).f()) {
            U0(null);
            return;
        }
        qz3 qz3Var = (qz3) ((j04) X()).a.a();
        if (qz3Var == null) {
            return;
        }
        h5a0 h5a0Var = ((j04) X()).f;
        if (h5a0Var == null) {
            Y0(new n0t0(unr0.h(Text.Companion, dzh0.ybsdk_auto_topup_snackbar_error_no_account_selected_title), new Text.Resource(dzh0.ybsdk_auto_topup_snackbar_error_no_account_selected_subtitle)));
            Z(m14.a);
            return;
        }
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, j04.a((j04) value, null, true, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262139)));
        pzt0 pzt0Var = this.T;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        pzt0 pzt0Var2 = this.U;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        this.U = tje.N(ds31.a(this), null, null, new AutoTopupSetupViewModel$onSaveButtonClick$2(this, qz3Var, h5a0Var, null), 3);
    }

    public final void L0() {
        T0();
    }

    public final void M0() {
        zz6 zz6Var;
        vz6 vz6Var;
        vou0 vou0Var = ((j04) X()).o;
        C0((vou0Var == null || (zz6Var = vou0Var.j) == null || (vz6Var = zz6Var.b) == null) ? null : vz6Var.c, CommonEvents$FullscreenNotificationButtonClickButtonType.SECONDARY);
    }

    public final void N0() {
        W0();
    }

    public final void O0() {
        d0();
    }

    public final void P0(int i) {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, j04.a((j04) value, null, false, null, null, null, null, null, null, null, Integer.valueOf(i), null, null, null, null, null, null, 261119)));
        qz3 qz3Var = (qz3) ((j04) X()).a.a();
        AutoTopupType d = qz3Var != null ? k2b1.d(qz3Var, ((j04) X()).k) : null;
        z94 z94Var = this.I.a.e;
        Integer c = rsa1.c(d);
        Integer valueOf = Integer.valueOf(c != null ? c.intValue() : 10);
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        linkedHashMap.put("autotopup_type", valueOf);
        z94Var.a.a("auto_topup.settings.type.change", linkedHashMap);
        e0();
        W0();
        W0();
    }

    public final void Q0(String str) {
        d0();
        Z0(AutoTopupInputType.THRESHOLD, str);
    }

    public final void R0() {
        nz3 nz3Var;
        nsz0 nsz0Var;
        String str;
        e0();
        qz3 qz3Var = (qz3) ((j04) X()).a.a();
        if (qz3Var != null && (nz3Var = qz3Var.h) != null && (nsz0Var = nz3Var.c) != null && (str = nsz0Var.b) != null) {
            e2b1.b(this.H, str);
        }
        this.I.a.e.a.a("auto_topup.settings.info.tapped", null);
    }

    public final void S0(Lifecycle lifecycle) {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, j04.a((j04) value, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 245759)));
        this.Q = true;
        ((sv3) this.F).a(lifecycle);
    }

    public final void T0() {
        r0 r0Var;
        Object value;
        j04 j04Var;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
            j04Var = (j04) value;
        } while (!r0Var.k(value, j04.a(j04Var, null, false, null, null, null, null, null, null, new ju3(j04Var.f), null, null, null, null, null, null, null, 261631)));
    }

    public final void U0(String str) {
        r0 r0Var;
        Object value;
        d0();
        qz3 qz3Var = (qz3) ((j04) X()).a.a();
        if (qz3Var == null) {
            return;
        }
        h5a0 h5a0Var = ((j04) X()).f;
        if (h5a0Var == null) {
            Y0(gao.e(null, null, null, 7));
            Z(m14.a);
            return;
        }
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, j04.a((j04) value, null, true, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262139)));
        pzt0 pzt0Var = this.T;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.T = tje.N(ds31.a(this), null, null, new AutoTopupSetupViewModel$saveAutoTopup$2(this, qz3Var, h5a0Var, str, null), 3);
    }

    public final void V0(h5a0 h5a0Var) {
        r0 r0Var;
        Object value;
        z94 z94Var = this.I.a.e;
        Map a = h52.a(h5a0Var);
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        linkedHashMap.put("payment_method", a);
        z94Var.a.a("auto_topup.settings.method_change", linkedHashMap);
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, j04.a((j04) value, null, false, null, null, h5a0Var, null, null, null, null, null, null, null, null, null, null, null, 262111)));
        W0();
    }

    public final void W0() {
        qz3 qz3Var;
        AutoTopupSwitchStatus autoTopupSwitchStatus;
        lz3 lz3Var;
        qz3 qz3Var2 = (qz3) ((j04) X()).a.a();
        AutoTopupSwitchStatus autoTopupSwitchStatus2 = null;
        String str = qz3Var2 != null ? qz3Var2.a : null;
        if (str != null) {
            qz3 qz3Var3 = (qz3) ((j04) X()).a.a();
            mz3 mz3Var = qz3Var3 != null ? qz3Var3.j : null;
            if (mz3Var == null || (qz3Var = (qz3) ((j04) X()).a.a()) == null) {
                return;
            }
            AutoTopupType d = k2b1.d(qz3Var, ((j04) X()).k);
            String b = ((j04) X()).b();
            String c = ((j04) X()).c();
            h5a0 h5a0Var = ((j04) X()).f;
            Boolean bool = ((j04) X()).n;
            if (bool == null) {
                boolean z = mz3Var.a;
                if (z) {
                    autoTopupSwitchStatus = AutoTopupSwitchStatus.ENABLED;
                } else {
                    if (z) {
                        w511.b();
                        return;
                    }
                    autoTopupSwitchStatus = AutoTopupSwitchStatus.DISABLED;
                }
            } else if (bool.equals(Boolean.TRUE)) {
                autoTopupSwitchStatus = AutoTopupSwitchStatus.ENABLED;
            } else {
                if (!bool.equals(Boolean.FALSE)) {
                    w511.b();
                    return;
                }
                autoTopupSwitchStatus = AutoTopupSwitchStatus.DISABLED;
            }
            AutoTopupSwitchStatus autoTopupSwitchStatus3 = autoTopupSwitchStatus;
            String str2 = ((j04) X()).m;
            Boolean bool2 = ((j04) X()).l;
            if (bool2 == null) {
                qz3 qz3Var4 = (qz3) ((j04) X()).a.a();
                Boolean valueOf = (qz3Var4 == null || (lz3Var = qz3Var4.k) == null) ? null : Boolean.valueOf(lz3Var.a);
                if (jl40.l(valueOf, Boolean.TRUE)) {
                    autoTopupSwitchStatus2 = AutoTopupSwitchStatus.ENABLED;
                } else if (jl40.l(valueOf, Boolean.FALSE)) {
                    autoTopupSwitchStatus2 = AutoTopupSwitchStatus.DISABLED;
                } else if (valueOf != null) {
                    w511.b();
                    return;
                }
            } else if (bool2.equals(Boolean.TRUE)) {
                autoTopupSwitchStatus2 = AutoTopupSwitchStatus.ENABLED;
            } else {
                if (!bool2.equals(Boolean.FALSE)) {
                    w511.b();
                    return;
                }
                autoTopupSwitchStatus2 = AutoTopupSwitchStatus.DISABLED;
            }
            this.P.c.g(new ty21(str, b, c, h5a0Var, d, autoTopupSwitchStatus3, autoTopupSwitchStatus2, str2));
        }
    }

    public final void X0(qis qisVar) {
        tje.N(ds31.a(this), null, null, new AutoTopupSetupViewModel$showFullscreen$1(this, qisVar, null), 3);
    }

    public final void Y0(n0t0 n0t0Var) {
        Z(new o14(n0t0Var));
    }

    public final void Z0(txz0 txz0Var, String str) {
        r0 r0Var;
        Object value;
        if (txz0Var == AutoTopupInputType.AMOUNT) {
            a0(new h0(str, 9));
            return;
        }
        if (txz0Var == AutoTopupInputType.THRESHOLD) {
            a0(new h0(str, 10));
            return;
        }
        if (txz0Var != AutoFundInputType.AUTOFUND_MONEY) {
            w511.b();
            return;
        }
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, j04.a((j04) value, null, false, null, null, null, null, null, null, null, null, null, str == null ? "" : str, null, null, null, null, 258047)));
    }

    public final void a1(h5a0 h5a0Var) {
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        ku3 ku3Var = ((j04) X()).j;
        if (ku3Var instanceof ju3) {
            pz40 Y = Y();
            do {
                r0Var2 = (r0) Y;
                value2 = r0Var2.getValue();
            } while (!r0Var2.k(value2, j04.a((j04) value2, null, false, null, null, null, null, null, null, new ju3(h5a0Var), null, null, null, null, null, null, null, 261631)));
            return;
        }
        if (!(ku3Var instanceof iu3)) {
            x4c.g("onSelectedPaymentMethodChanged with state", null, String.valueOf(((j04) X()).j), Collections.singletonList(lrp0.b), 2);
            return;
        }
        pz40 Y2 = Y();
        do {
            r0Var = (r0) Y2;
            value = r0Var.getValue();
        } while (!r0Var.k(value, j04.a((j04) value, null, false, null, null, null, null, null, null, new iu3(h5a0Var), null, null, null, null, null, null, null, 261631)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004a, code lost:
    
        if (r6 != null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List c0() {
        qz3 qz3Var = (qz3) ((j04) X()).a.a();
        if (qz3Var == null) {
            return EmptyList.a;
        }
        lz3 lz3Var = qz3Var.k;
        boolean z = qz3Var.j.a;
        Boolean bool = ((j04) X()).n;
        boolean booleanValue = bool != null ? bool.booleanValue() : z;
        boolean z2 = false;
        boolean z3 = lz3Var != null ? lz3Var.a : false;
        Boolean bool2 = ((j04) X()).l;
        if (bool2 == null) {
            bool2 = lz3Var != null ? Boolean.valueOf(lz3Var.a) : null;
        }
        z2 = bool2.booleanValue();
        AutoTopupSettingsResultTypeAutotopup autoTopupSettingsResultTypeAutotopup = AutoTopupSettingsResultTypeAutotopup.AUTOFUND;
        if (z3 == z2) {
            autoTopupSettingsResultTypeAutotopup = null;
        }
        return j73.A(new AutoTopupSettingsResultTypeAutotopup[]{autoTopupSettingsResultTypeAutotopup, z != booleanValue ? AutoTopupSettingsResultTypeAutotopup.AUTOTOPUP : null});
    }

    public final void d0() {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, j04.a((j04) value, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262015)));
    }

    public final void e0() {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, j04.a((j04) value, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 261887)));
    }

    public final void f0() {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, j04.a((j04) value, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 261631)));
    }

    public final void g0() {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, j04.a((j04) value, new t8j0(), false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262142)));
        pzt0 pzt0Var = this.S;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.S = tje.N(ds31.a(this), null, null, new AutoTopupSetupViewModel$loadData$2(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h0(ty3 ty3Var, boolean z, vou0 vou0Var, ContinuationImpl continuationImpl) {
        AutoTopupSetupViewModel$loadSetupRequestResult$1 autoTopupSetupViewModel$loadSetupRequestResult$1;
        int i;
        boolean z2;
        Object a;
        vou0 vou0Var2;
        boolean z3;
        Throwable a2;
        ty3 ty3Var2 = ty3Var;
        lrp0 lrp0Var = lrp0.b;
        if (continuationImpl instanceof AutoTopupSetupViewModel$loadSetupRequestResult$1) {
            autoTopupSetupViewModel$loadSetupRequestResult$1 = (AutoTopupSetupViewModel$loadSetupRequestResult$1) continuationImpl;
            int i2 = autoTopupSetupViewModel$loadSetupRequestResult$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoTopupSetupViewModel$loadSetupRequestResult$1.label = i2 - Integer.MIN_VALUE;
                Object obj = autoTopupSetupViewModel$loadSetupRequestResult$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoTopupSetupViewModel$loadSetupRequestResult$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str = ty3Var2.a;
                    boolean z4 = ty3Var2.e;
                    AutoTopupRequestStatusPollingOption autoTopupRequestStatusPollingOption = AutoTopupRequestStatusPollingOption.SHORT;
                    autoTopupSetupViewModel$loadSetupRequestResult$1.L$0 = ty3Var2;
                    autoTopupSetupViewModel$loadSetupRequestResult$1.L$1 = vou0Var;
                    z2 = z;
                    autoTopupSetupViewModel$loadSetupRequestResult$1.Z$0 = z2;
                    autoTopupSetupViewModel$loadSetupRequestResult$1.label = 1;
                    a = this.N.a(str, z4, autoTopupRequestStatusPollingOption, autoTopupSetupViewModel$loadSetupRequestResult$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    vou0Var2 = vou0Var;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z5 = autoTopupSetupViewModel$loadSetupRequestResult$1.Z$0;
                    vou0Var2 = (vou0) autoTopupSetupViewModel$loadSetupRequestResult$1.L$1;
                    ty3 ty3Var3 = (ty3) autoTopupSetupViewModel$loadSetupRequestResult$1.L$0;
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                    z2 = z5;
                    ty3Var2 = ty3Var3;
                }
                z3 = a instanceof Result.Failure;
                l04 l04Var = this.I;
                if (!z3) {
                    dqg dqgVar = (dqg) a;
                    if (dqgVar instanceof cqg) {
                        e24 e24Var = (e24) ((cqg) dqgVar).a;
                        if (e24Var instanceof c24) {
                            x4c.g("3ds for auto topup setup is not supported", null, null, Collections.singletonList(lrp0Var), 6);
                            Y0(gao.e(null, null, null, 7));
                        } else {
                            if (!(e24Var instanceof d24)) {
                                w511.b();
                                return null;
                            }
                            l04Var.j((qz3) ((j04) X()).a.a(), ty3Var2.a);
                            if (z2) {
                                this.J.a.a.edit().putBoolean("need_show_auto_topup_tooltip", true).apply();
                            }
                            boolean d = ((j04) X()).d();
                            tfl0 tfl0Var = this.C;
                            e eVar = this.M;
                            iz3 iz3Var = this.D;
                            if (!d) {
                                d24 d24Var = (d24) e24Var;
                                AutoTopupResultParams.NoPolling noPolling = new AutoTopupResultParams.NoPolling(d24Var.e, d24Var.f, d24Var.b, d24Var.c, d24Var.d, eVar.c.a(), c0());
                                iz3Var.getClass();
                                tfl0Var.l(iz3.a(noPolling));
                            } else if (((j04) X()).e()) {
                                sy3 sy3Var = ty3Var2.d;
                                if (sy3Var != null) {
                                    AutoTopupResultParams.NoPolling noPolling2 = new AutoTopupResultParams.NoPolling(sy3Var.d, null, sy3Var.a, sy3Var.b, sy3Var.c, eVar.c.a(), c0());
                                    iz3Var.getClass();
                                    tfl0Var.l(iz3.a(noPolling2));
                                } else {
                                    x4c.h("Don't have result screen for auto topup saving without confirmation instruction", new srp0[]{lrp0Var}, null, 12);
                                    Y0(gao.e(null, null, null, 7));
                                }
                            } else {
                                this.O.a.o.h(CommonEvents$FullscreenNotificationShownScreen.AUTOTOPUP, vou0Var2 != null ? vou0Var2.c : null, null, null, null, null, null, null);
                                pz40 Y = Y();
                                while (true) {
                                    r0 r0Var = (r0) Y;
                                    Object value = r0Var.getValue();
                                    vou0 vou0Var3 = vou0Var2;
                                    if (r0Var.k(value, j04.a((j04) value, null, false, null, null, null, null, null, null, null, null, null, null, null, vou0Var3, null, null, 245755))) {
                                        break;
                                    }
                                    vou0Var2 = vou0Var3;
                                }
                            }
                        }
                    } else {
                        if (!(dqgVar instanceof bqg)) {
                            w511.b();
                            return null;
                        }
                        bqg bqgVar = (bqg) dqgVar;
                        String str2 = bqgVar.b;
                        String str3 = bqgVar.a;
                        l04Var.i(str3, (qz3) ((j04) X()).a.a(), ty3Var2.a);
                        Y0(new n0t0(g8e.i(Text.Companion, str3), d.f(str2)));
                        x4c.g("failed to setup auto topup", null, "error=" + str3 + ", description=" + str2, Collections.singletonList(lrp0Var), 2);
                    }
                }
                a2 = Result.a(a);
                if (a2 != null) {
                    l04Var.i(a2.getMessage(), (qz3) ((j04) X()).a.a(), ty3Var2.a);
                    Y0(gao.e(null, null, a2, 3));
                    x4c.g("failed to setup auto topup", null, String.valueOf(a2), Collections.singletonList(lrp0Var), 2);
                }
                return zy11.a;
            }
        }
        autoTopupSetupViewModel$loadSetupRequestResult$1 = new AutoTopupSetupViewModel$loadSetupRequestResult$1(this, continuationImpl);
        Object obj2 = autoTopupSetupViewModel$loadSetupRequestResult$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoTopupSetupViewModel$loadSetupRequestResult$1.label;
        if (i != 0) {
        }
        z3 = a instanceof Result.Failure;
        l04 l04Var2 = this.I;
        if (!z3) {
        }
        a2 = Result.a(a);
        if (a2 != null) {
        }
        return zy11.a;
    }

    public final void i0(String str) {
        d0();
        Z0(AutoFundInputType.AUTOFUND_MONEY, str);
    }

    public final void j0(String str) {
        d0();
        Z0(AutoTopupInputType.AMOUNT, str);
    }

    public final void k0(int i, int i2) {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, j04.a((j04) value, null, false, null, null, null, null, null, null, null, null, null, null, null, null, new trc(i2, i), null, 229375)));
    }

    public final void l0(boolean z) {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, j04.a((j04) value, null, false, null, null, null, null, null, null, null, null, Boolean.valueOf(z), null, null, null, null, null, 260095)));
        z94 z94Var = this.I.a.e;
        z94Var.a.a("auto_topup.settings.moment_of_payment_toggle.tapped", g8e.w(1, "action", rsa1.e(z)));
        e0();
        W0();
        W0();
    }

    public final void m0(boolean z) {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, j04.a((j04) value, null, false, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(z), null, null, null, 253951)));
        z94 z94Var = this.I.a.e;
        z94Var.a.a("auto_topup.settings.topup_toggle.tapped", g8e.w(1, ACSPConstants.STATUS, rsa1.e(z)));
        e0();
        W0();
        W0();
    }

    public final void n0() {
        String str = ((j04) X()).q;
        Z(new l14(str != null ? g8e.i(Text.Companion, str) : null));
        this.I.a.e.a.a("auto_topup.settings.moment_of_payment_info.tapped", null);
    }

    public final void o0() {
        lz3 lz3Var;
        iky0 iky0Var;
        String str;
        e0();
        qz3 qz3Var = (qz3) ((j04) X()).a.a();
        if (qz3Var == null || (lz3Var = qz3Var.k) == null || (iky0Var = lz3Var.f) == null || (str = iky0Var.b) == null) {
            return;
        }
        e2b1.b(this.H, str);
    }

    public final void p0() {
        iky0 iky0Var;
        String str;
        e0();
        qz3 qz3Var = (qz3) ((j04) X()).a.a();
        if (qz3Var == null || (iky0Var = qz3Var.j.e) == null || (str = iky0Var.b) == null) {
            return;
        }
        e2b1.b(this.H, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0108 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q0() {
        boolean c;
        boolean z;
        boolean z2;
        pz40 Y;
        r0 r0Var;
        Object value;
        lz3 lz3Var;
        h5a0 h5a0Var;
        z94 z94Var = this.I.a.e;
        AutotopupEvents$AutoTopupSettingsExitVersion autotopupEvents$AutoTopupSettingsExitVersion = AutotopupEvents$AutoTopupSettingsExitVersion.V1;
        boolean z3 = true;
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        linkedHashMap.put("version", autotopupEvents$AutoTopupSettingsExitVersion.getOriginalValue());
        z94Var.a.a("auto_topup.settings.exit", linkedHashMap);
        j04 j04Var = (j04) X();
        u8j0 u8j0Var = j04Var.a;
        h5a0 h5a0Var2 = j04Var.f;
        String id = h5a0Var2 != null ? h5a0Var2.getId() : null;
        qz3 qz3Var = (qz3) u8j0Var.a();
        boolean l = jl40.l(id, (qz3Var == null || (h5a0Var = qz3Var.m) == null) ? null : h5a0Var.getId());
        qz3 qz3Var2 = (qz3) u8j0Var.a();
        Boolean valueOf = (qz3Var2 == null || (lz3Var = qz3Var2.k) == null) ? null : Boolean.valueOf(lz3Var.a);
        Boolean bool = j04Var.l;
        qz3 qz3Var3 = (qz3) u8j0Var.a();
        Boolean valueOf2 = qz3Var3 != null ? Boolean.valueOf(qz3Var3.j.a) : null;
        Boolean bool2 = j04Var.n;
        if (valueOf != null) {
            Boolean bool3 = Boolean.TRUE;
            if (!valueOf.equals(bool3)) {
                Boolean bool4 = Boolean.FALSE;
                if (!valueOf.equals(bool4)) {
                    w511.b();
                    return;
                } else if (jl40.l(bool, bool3)) {
                    c = d2b1.c(j04Var);
                } else if (!jl40.l(bool, bool4) && bool != null) {
                    w511.b();
                    return;
                }
            } else {
                if (!jl40.l(bool, Boolean.FALSE)) {
                    if (!jl40.l(bool, bool3) && bool != null) {
                        w511.b();
                        return;
                    }
                    c = d2b1.c(j04Var);
                    z = true;
                    if (valueOf2 != null) {
                        Boolean bool5 = Boolean.TRUE;
                        if (!valueOf2.equals(bool5)) {
                            Boolean bool6 = Boolean.FALSE;
                            if (!valueOf2.equals(bool6)) {
                                w511.b();
                                return;
                            } else if (jl40.l(bool2, bool5)) {
                                z3 = d2b1.d(j04Var);
                            } else if (!jl40.l(bool2, bool6) && bool2 != null) {
                                w511.b();
                                return;
                            }
                        } else if (!jl40.l(bool2, Boolean.FALSE)) {
                            if (!jl40.l(bool2, bool5) && bool2 != null) {
                                w511.b();
                                return;
                            }
                            z2 = d2b1.d(j04Var);
                            if (!l && c && z && z2 && z3) {
                                this.C.e();
                                return;
                            }
                            Y = Y();
                            do {
                                r0Var = (r0) Y;
                                value = r0Var.getValue();
                            } while (!r0Var.k(value, j04.a((j04) value, null, false, null, null, null, null, null, null, hu3.a, null, null, null, null, null, null, null, 261631)));
                        }
                        z2 = z3;
                        z3 = false;
                        if (!l) {
                        }
                        Y = Y();
                        do {
                            r0Var = (r0) Y;
                            value = r0Var.getValue();
                        } while (!r0Var.k(value, j04.a((j04) value, null, false, null, null, null, null, null, null, hu3.a, null, null, null, null, null, null, null, 261631)));
                    }
                    z2 = true;
                    if (!l) {
                    }
                    Y = Y();
                    do {
                        r0Var = (r0) Y;
                        value = r0Var.getValue();
                    } while (!r0Var.k(value, j04.a((j04) value, null, false, null, null, null, null, null, null, hu3.a, null, null, null, null, null, null, null, 261631)));
                }
                c = true;
            }
            z = false;
            if (valueOf2 != null) {
            }
            z2 = true;
            if (!l) {
            }
            Y = Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, j04.a((j04) value, null, false, null, null, null, null, null, null, hu3.a, null, null, null, null, null, null, null, 261631)));
        }
        c = true;
        z = true;
        if (valueOf2 != null) {
        }
        z2 = true;
        if (!l) {
        }
        Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, j04.a((j04) value, null, false, null, null, null, null, null, null, hu3.a, null, null, null, null, null, null, null, 261631)));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r0() {
        h5a0 h5a0Var;
        r0 r0Var;
        Object value;
        Object obj;
        ku3 ku3Var = ((j04) X()).j;
        qz3 qz3Var = (qz3) ((j04) X()).a.a();
        ArrayList arrayList = null;
        h5a0 h5a0Var2 = null;
        List list = qz3Var != null ? qz3Var.f.a : null;
        if (ku3Var instanceof ju3) {
            h5a0 h5a0Var3 = ((ju3) ku3Var).a;
            if (h5a0Var3 == null) {
                h5a0Var3 = ((j04) X()).f;
                if (list != null) {
                    List list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            if (jl40.l(((h5a0) it.next()).getId(), h5a0Var3 != null ? h5a0Var3.getId() : null)) {
                                break;
                            }
                        }
                    }
                }
                h5a0Var3 = null;
                if (h5a0Var3 == null) {
                    if (list != null) {
                        h5a0Var2 = (h5a0) kotlin.collections.a.R(list);
                    }
                    if (!jl40.l(h5a0Var2, ((j04) X()).f) && h5a0Var2 != null) {
                        V0(h5a0Var2);
                    }
                }
            }
            h5a0Var2 = h5a0Var3;
            if (!jl40.l(h5a0Var2, ((j04) X()).f)) {
                V0(h5a0Var2);
            }
        } else if (ku3Var instanceof iu3) {
            h5a0 h5a0Var4 = ((iu3) ku3Var).a;
            if (h5a0Var4 == null) {
                h5a0Var4 = ((j04) X()).f;
                if (list != null) {
                    List list3 = list;
                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                        Iterator it2 = list3.iterator();
                        while (it2.hasNext()) {
                            if (jl40.l(((h5a0) it2.next()).getId(), h5a0Var4 != null ? h5a0Var4.getId() : null)) {
                                break;
                            }
                        }
                    }
                }
                h5a0Var4 = null;
                if (h5a0Var4 == null) {
                    h5a0Var4 = list != null ? (h5a0) kotlin.collections.a.R(list) : null;
                }
            }
            if ((h5a0Var4 instanceof f5a0 ? (f5a0) h5a0Var4 : null) == null) {
                T0();
                return;
            }
            if (!jl40.l(h5a0Var4, ((j04) X()).f)) {
                V0(h5a0Var4);
                if (list != null) {
                    Iterator it3 = list.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it3.next();
                            if (((h5a0) obj) instanceof f5a0) {
                                break;
                            }
                        }
                    }
                    h5a0Var = (h5a0) obj;
                } else {
                    h5a0Var = null;
                }
                ArrayList arrayList2 = list != null ? new ArrayList(list) : null;
                if (list != null && h5a0Var != null) {
                    if (arrayList2 != null) {
                        Iterator it4 = arrayList2.iterator();
                        int i = 0;
                        while (true) {
                            if (!it4.hasNext()) {
                                i = -1;
                                break;
                            } else if (((h5a0) it4.next()) instanceof f5a0) {
                                break;
                            } else {
                                i++;
                            }
                        }
                        if (i != -1) {
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList3.set(i, h5a0Var4);
                            arrayList = arrayList3;
                        }
                    }
                    if (arrayList != null) {
                        u8j0 d = zka1.d(((j04) X()).a, new nk2(arrayList, 2));
                        pz40 Y = Y();
                        do {
                            r0Var = (r0) Y;
                            value = r0Var.getValue();
                        } while (!r0Var.k(value, j04.a((j04) value, d, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262142)));
                    }
                } else if (arrayList2 != null) {
                    arrayList2.add(h5a0Var4);
                }
                arrayList = arrayList2;
                if (arrayList != null) {
                }
            }
        } else if (jl40.l(ku3Var, vvb1.c)) {
            nv3 nv3Var = (nv3) this.H;
            nv3Var.b.h(nv3Var.c.d(SettingsOpeningSource.MENU));
        } else if (jl40.l(ku3Var, hu3.a)) {
            this.I.a.e.a(BottomSheetConfirmSaveDataEvent.SAVED.getEventName(), AutotopupEvents$AutoTopupSettingsBackSaveVersion.V1);
            K0();
        } else if (!jl40.l(ku3Var, l76.x) && ku3Var != null) {
            w511.b();
            return;
        }
        f0();
    }

    public final void s0() {
        ku3 ku3Var = ((j04) X()).j;
        if (!jl40.l(ku3Var, l76.x) && !(ku3Var instanceof ju3) && !(ku3Var instanceof iu3) && !jl40.l(ku3Var, vvb1.c) && ku3Var != null) {
            if (!ku3Var.equals(hu3.a)) {
                w511.b();
                return;
            } else {
                this.I.a.e.a(BottomSheetConfirmSaveDataEvent.NOT_SAVED.getEventName(), AutotopupEvents$AutoTopupSettingsBackSaveVersion.V1);
                this.C.e();
            }
        }
        f0();
    }

    public final void t0() {
        g0();
    }

    public final void u0() {
        String supportUrl;
        u8j0 u8j0Var = ((j04) X()).a;
        s8j0 s8j0Var = u8j0Var instanceof s8j0 ? (s8j0) u8j0Var : null;
        Throwable th = s8j0Var != null ? s8j0Var.a : null;
        FailDataException failDataException = th instanceof FailDataException ? (FailDataException) th : null;
        if (failDataException == null || (supportUrl = failDataException.getSupportUrl()) == null) {
            return;
        }
        nv3 nv3Var = (nv3) this.H;
        if (nv3Var.a.c(supportUrl).a instanceof x0h) {
            nv3Var.b.h(com.ybsdk.feature.webview.api.a.b(nv3Var.d, supportUrl, null, null, 6));
        }
    }

    public final void v0() {
        r0 r0Var;
        Object value;
        vou0 vou0Var = ((j04) X()).o;
        String str = vou0Var != null ? vou0Var.c : null;
        em3 em3Var = this.O.a.o;
        CommonEvents$FullscreenNotificationCloseScreen commonEvents$FullscreenNotificationCloseScreen = CommonEvents$FullscreenNotificationCloseScreen.AUTOTOPUP;
        LinkedHashMap linkedHashMap = new LinkedHashMap(3);
        linkedHashMap.put(MetaDataField.SCREEN_FIELD, commonEvents$FullscreenNotificationCloseScreen.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("fullscreen_name", str);
        }
        em3Var.a.a("fullscreen_notification.close", linkedHashMap);
        if (((j04) X()).d()) {
            this.C.e();
            return;
        }
        this.I.b(ClickEvent.EXIT);
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, j04.a((j04) value, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 245759)));
    }

    public final void w0() {
        if (((j04) X()).j instanceof hu3) {
            this.I.a.e.a(BottomSheetConfirmSaveDataEvent.BACK.getEventName(), AutotopupEvents$AutoTopupSettingsBackSaveVersion.V1);
        }
        f0();
    }

    public final void x0() {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, j04.a((j04) value, null, false, null, null, null, null, null, AutoFundInputType.AUTOFUND_MONEY, null, null, null, null, null, null, null, null, 261887)));
        W0();
    }

    public final void y0() {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, j04.a((j04) value, null, false, null, null, null, null, null, AutoTopupInputType.AMOUNT, null, null, null, null, null, null, null, null, 261887)));
        W0();
    }

    public final void z0() {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, j04.a((j04) value, null, false, null, null, null, null, null, AutoTopupInputType.THRESHOLD, null, null, null, null, null, null, null, null, 261887)));
        W0();
    }
}
