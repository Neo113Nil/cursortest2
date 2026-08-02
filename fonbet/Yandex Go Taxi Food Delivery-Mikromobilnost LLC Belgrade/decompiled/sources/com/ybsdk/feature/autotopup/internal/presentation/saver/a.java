package com.ybsdk.feature.autotopup.internal.presentation.saver;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.ybsdk.core.analytics.generated.AutoTopupSettingsResultTypeAutotopup;
import com.ybsdk.core.analytics.generated.delegates.RegularAutotopupEvents$RegularAutotopupDeactivateButtonClickButton;
import com.ybsdk.core.analytics.generated.delegates.RegularAutotopupEvents$RegularAutotopupSaveChangesButtonClickButton;
import com.ybsdk.core.analytics.generated.delegates.RegularAutotopupEvents$RegularAutotopupSaveChangesOpenStateAutotopup;
import com.ybsdk.core.analytics.generated.delegates.RegularAutotopupEvents$RegularAutotopupSettingsButtonClickButton;
import com.ybsdk.core.analytics.generated.delegates.RegularAutotopupEvents$RegularAutotopupSettingsButtonClickStateAutotopup;
import com.ybsdk.core.analytics.generated.delegates.RegularAutotopupEvents$RegularAutotopupSettingsLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.RegularAutotopupEvents$RegularAutotopupSettingsPeriodButtonClickStateAutotopup;
import com.ybsdk.core.analytics.generated.delegates.RegularAutotopupEvents$RegularAutotopupSettingsSourceButtonClickButton;
import com.ybsdk.core.analytics.generated.delegates.RegularAutotopupEvents$RegularAutotopupSettingsSourceButtonClickStateAutotopup;
import com.ybsdk.core.analytics.generated.delegates.RegularAutotopupEvents$RegularAutotopupSettingsSourceCardButtonClickButton;
import com.ybsdk.core.analytics.generated.delegates.RegularAutotopupEvents$RegularAutotopupSettingsSourceOpenStateAutotopup;
import com.ybsdk.core.analytics.generated.delegates.RegularAutotopupEvents$RegularAutotopupSettingsWhenOpenBottomsheetType;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.NumberFormatUtils$Currencies;
import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.autotopup.api.TwoFactorAuthResult;
import com.ybsdk.feature.autotopup.api.domain.model.AutoTopupRequestStatusPollingOption;
import com.ybsdk.feature.autotopup.internal.domain.entities.regular.DayOfWeek;
import com.ybsdk.feature.autotopup.internal.domain.entities.regular.FrequencyType;
import com.ybsdk.feature.autotopup.internal.domain.entities.regular.RegularAutotopupStatusEntity;
import com.ybsdk.feature.autotopup.internal.presentation.result.AutoTopupResultParams;
import com.ybsdk.feature.autotopup.internal.presentation.saver.helpers.AutoTopupRegularSettingsValidationHelper;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import com.ybsdk.widgets.common.bottomsheet.daychoosers.MonthDayChooserView$State$Mode;
import com.ybsdk.widgets.common.bottomsheet.daychoosers.WeekDayChooserView$State$WeekDay;
import defpackage.asi0;
import defpackage.bqg;
import defpackage.bvu0;
import defpackage.by3;
import defpackage.c24;
import defpackage.cqg;
import defpackage.csi0;
import defpackage.ct11;
import defpackage.cy3;
import defpackage.d24;
import defpackage.dk11;
import defpackage.dqg;
import defpackage.ds31;
import defpackage.dsg;
import defpackage.dsi0;
import defpackage.dy3;
import defpackage.dzh0;
import defpackage.e24;
import defpackage.e5a0;
import defpackage.ek11;
import defpackage.eo1;
import defpackage.esi0;
import defpackage.evu0;
import defpackage.ey3;
import defpackage.f42;
import defpackage.ffx;
import defpackage.g5a0;
import defpackage.g8e;
import defpackage.gao;
import defpackage.giq0;
import defpackage.gy3;
import defpackage.h5a0;
import defpackage.iw3;
import defpackage.iz3;
import defpackage.jl40;
import defpackage.jqp0;
import defpackage.l0p;
import defpackage.lrp0;
import defpackage.n0t0;
import defpackage.ny61;
import defpackage.odq0;
import defpackage.p73;
import defpackage.py3;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.qx3;
import defpackage.r7b1;
import defpackage.rgq0;
import defpackage.rx3;
import defpackage.s8j0;
import defpackage.scc;
import defpackage.sv3;
import defpackage.sx3;
import defpackage.t170;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.trp0;
import defpackage.tx3;
import defpackage.ty3;
import defpackage.u170;
import defpackage.u8j0;
import defpackage.uc5;
import defpackage.uda0;
import defpackage.uk11;
import defpackage.unr0;
import defpackage.uza;
import defpackage.v170;
import defpackage.vx3;
import defpackage.w170;
import defpackage.w511;
import defpackage.w530;
import defpackage.x0h;
import defpackage.x4c;
import defpackage.x5;
import defpackage.xx3;
import defpackage.y5e;
import defpackage.yx3;
import defpackage.z630;
import defpackage.zri0;
import defpackage.zx3;
import defpackage.zy11;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public final AutoTopupRegularParams B;
    public final tfl0 C;
    public final Context D;
    public final w530 E;
    public final AutoTopupRegularSettingsValidationHelper F;
    public final com.ybsdk.feature.autotopup.internal.domain.b G;
    public final iz3 H;
    public final com.ybsdk.feature.autotopup.internal.domain.c I;
    public final iw3 J;
    public final uk11 K;
    public final f42 L;
    public pzt0 M;
    public String N;
    public by3 O;
    public final n0 P;
    public boolean Q;

    public a(AutoTopupRegularParams autoTopupRegularParams, tfl0 tfl0Var, Context context, w530 w530Var, AutoTopupRegularSettingsValidationHelper autoTopupRegularSettingsValidationHelper, com.ybsdk.feature.autotopup.internal.domain.b bVar, iz3 iz3Var, com.ybsdk.feature.autotopup.internal.domain.c cVar, iw3 iw3Var, uk11 uk11Var, f42 f42Var, py3 py3Var) {
        super(new p73(16), py3Var);
        this.B = autoTopupRegularParams;
        this.C = tfl0Var;
        this.D = context;
        this.E = w530Var;
        this.F = autoTopupRegularSettingsValidationHelper;
        this.G = bVar;
        this.H = iz3Var;
        this.I = cVar;
        this.J = iw3Var;
        this.K = uk11Var;
        this.L = f42Var;
        n0 c = ffx.c(0, 1, BufferOverflow.DROP_OLDEST, 1);
        this.P = c;
        int i = 23;
        ((sv3) iw3Var).b(new eo1(i, this));
        this.M = tje.N(ds31.a(this), null, null, new AutoTopupRegularViewModel$loadData$1(this, null), 3);
        com.ybsdk.core.utils.ext.c.a(e.p(c, 150L), ds31.a(this), new x5(i, this));
    }

    public static void M0(a aVar, Text text) {
        Text.Empty empty = Text.Empty.INSTANCE;
        aVar.getClass();
        aVar.Z(new cy3(new n0t0(text, empty)));
    }

    public static rgq0 P0(giq0 giq0Var) {
        FrequencyType frequencyType = giq0Var.a;
        ek11 ek11Var = giq0Var.d;
        w170 w170Var = giq0Var.b;
        v170 v170Var = new v170(w170Var != null ? w170Var.a : null, w170Var != null ? w170Var.b : null);
        u170 u170Var = giq0Var.c;
        return new rgq0(frequencyType, v170Var, new t170(u170Var != null ? u170Var.a : null, u170Var != null ? u170Var.b : null, u170Var != null ? u170Var.c : false), new dk11(new z630(ek11Var != null ? Integer.valueOf(ek11Var.a.a) : null, ek11Var != null ? ek11Var.a.b : null), new z630(ek11Var != null ? Integer.valueOf(ek11Var.b.a) : null, ek11Var != null ? ek11Var.b.b : null)));
    }

    public static void R0(a aVar, Integer num, MoneyEntity moneyEntity, Boolean bool, Integer num2, MoneyEntity moneyEntity2, int i) {
        qx3 a;
        z630 z630Var;
        z630 z630Var2;
        Integer num3 = (i & 1) != 0 ? null : num;
        MoneyEntity moneyEntity3 = (i & 2) != 0 ? null : moneyEntity;
        Boolean bool2 = (i & 4) != 0 ? null : bool;
        Integer num4 = (i & 8) != 0 ? null : num2;
        MoneyEntity moneyEntity4 = (i & 16) != 0 ? null : moneyEntity2;
        if (aVar.Q) {
            FrequencyType frequencyType = ((qx3) aVar.X()).c.a;
            rgq0 rgq0Var = ((qx3) aVar.X()).c;
            int i2 = gy3.a[frequencyType.ordinal()];
            if (i2 == 1) {
                v170 v170Var = rgq0Var.b;
                DayOfWeek dayOfWeek = num3 == null ? v170Var.a : num3.intValue() < 0 ? null : (DayOfWeek) DayOfWeek.getEntries().get(num3.intValue() - 1);
                if (moneyEntity3 == null) {
                    moneyEntity3 = v170Var.b;
                } else if (moneyEntity3.getAmount().compareTo(BigDecimal.ZERO) < 0) {
                    moneyEntity3 = null;
                }
                a = qx3.a((qx3) aVar.X(), null, null, rgq0.a(rgq0Var, null, new v170(dayOfWeek, moneyEntity3), null, null, 13), null, null, null, null, false, 251);
            } else if (i2 == 2) {
                t170 t170Var = rgq0Var.c;
                if (num3 == null) {
                    num3 = t170Var.a;
                } else if (num3.intValue() < 0) {
                    num3 = null;
                }
                if (moneyEntity3 == null) {
                    moneyEntity3 = t170Var.b;
                } else if (moneyEntity3.getAmount().compareTo(BigDecimal.ZERO) < 0) {
                    moneyEntity3 = null;
                }
                a = qx3.a((qx3) aVar.X(), null, null, rgq0.a(rgq0Var, null, null, new t170(num3, moneyEntity3, bool2 != null ? bool2.booleanValue() : t170Var.c), null, 11), null, null, null, null, false, 251);
            } else {
                if (i2 != 3) {
                    w511.b();
                    return;
                }
                dk11 dk11Var = rgq0Var.d;
                z630 z630Var3 = dk11Var.a;
                z630 z630Var4 = dk11Var.b;
                if (z630Var3 != null) {
                    if (num3 == null) {
                        num3 = z630Var3.a;
                    } else if (num3.intValue() < 0) {
                        num3 = null;
                    }
                    if (moneyEntity3 == null) {
                        moneyEntity3 = z630Var3.b;
                    } else if (moneyEntity3.getAmount().compareTo(BigDecimal.ZERO) < 0) {
                        moneyEntity3 = null;
                    }
                    z630Var = new z630(num3, moneyEntity3);
                } else {
                    z630Var = null;
                }
                if (z630Var4 != null) {
                    if (num4 == null) {
                        num4 = z630Var4.a;
                    } else if (num4.intValue() < 0) {
                        num4 = null;
                    }
                    if (moneyEntity4 == null) {
                        moneyEntity4 = z630Var4.b;
                    } else if (moneyEntity4.getAmount().compareTo(BigDecimal.ZERO) < 0) {
                        moneyEntity4 = null;
                    }
                    z630Var2 = new z630(num4, moneyEntity4);
                } else {
                    z630Var2 = null;
                }
                a = qx3.a((qx3) aVar.X(), null, null, rgq0.a(rgq0Var, null, null, null, new dk11(z630Var, z630Var2), 7), null, null, null, null, false, 251);
            }
            asi0 asi0Var = (asi0) ((qx3) aVar.X()).e.a();
            csi0 csi0Var = asi0Var != null ? asi0Var.a : null;
            aVar.a0(new rx3(a, aVar, jl40.l(csi0Var != null ? P0(csi0Var.e) : null, ((qx3) aVar.X()).c) && !jl40.l(a.c, ((qx3) aVar.X()).c), 0));
        }
    }

    public static final void b0(a aVar, Throwable th) {
        String X;
        r0 r0Var;
        Object value;
        String agreementId = aVar.B.getAgreementId();
        List singletonList = Collections.singletonList(lrp0.c);
        boolean isEmpty = singletonList.isEmpty();
        if (isEmpty) {
            X = null;
        } else {
            if (isEmpty) {
                w511.b();
                return;
            }
            X = kotlin.collections.a.X(singletonList, "", null, null, new dsg(16), 30);
        }
        trp0 trp0Var = trp0.a;
        trp0.e(new jqp0(th, "Failed to load data", agreementId, X));
        aVar.L.b.c0.i(aVar.B.getAgreementId(), RegularAutotopupEvents$RegularAutotopupSettingsLoadedResult.ERROR, null, null);
        pz40 Y = aVar.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, qx3.a((qx3) value, null, null, null, null, new s8j0(th), null, null, false, 239)));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c0(a aVar, ty3 ty3Var, ContinuationImpl continuationImpl) {
        AutoTopupRegularViewModel$loadSetupRequestResult$1 autoTopupRegularViewModel$loadSetupRequestResult$1;
        int i;
        Object a;
        Throwable a2;
        aVar.getClass();
        if (continuationImpl instanceof AutoTopupRegularViewModel$loadSetupRequestResult$1) {
            autoTopupRegularViewModel$loadSetupRequestResult$1 = (AutoTopupRegularViewModel$loadSetupRequestResult$1) continuationImpl;
            int i2 = autoTopupRegularViewModel$loadSetupRequestResult$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoTopupRegularViewModel$loadSetupRequestResult$1.label = i2 - Integer.MIN_VALUE;
                Object obj = autoTopupRegularViewModel$loadSetupRequestResult$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoTopupRegularViewModel$loadSetupRequestResult$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.ybsdk.feature.autotopup.internal.domain.c cVar = aVar.I;
                    String str = ty3Var.a;
                    boolean z = ty3Var.e;
                    AutoTopupRequestStatusPollingOption autoTopupRequestStatusPollingOption = AutoTopupRequestStatusPollingOption.SHORT;
                    autoTopupRegularViewModel$loadSetupRequestResult$1.label = 1;
                    a = cVar.a(str, z, autoTopupRequestStatusPollingOption, autoTopupRegularViewModel$loadSetupRequestResult$1);
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
                if (!(a instanceof Result.Failure)) {
                    Object obj2 = (dqg) a;
                    if (obj2 instanceof cqg) {
                        e24 e24Var = (e24) ((cqg) obj2).a;
                        if (e24Var instanceof c24) {
                            i0(aVar, new IllegalStateException("Regular autotopup doesn't support 3ds"));
                        } else {
                            if (!(e24Var instanceof d24)) {
                                w511.b();
                                return null;
                            }
                            iz3 iz3Var = aVar.H;
                            d24 d24Var = (d24) e24Var;
                            AutoTopupResultParams.NoPolling noPolling = new AutoTopupResultParams.NoPolling(d24Var.e, d24Var.f, d24Var.b, d24Var.c, d24Var.d, true, Collections.singletonList(AutoTopupSettingsResultTypeAutotopup.REGULAR_AUTOTOPUP));
                            iz3Var.getClass();
                            aVar.C.l(iz3.a(noPolling));
                        }
                    } else {
                        if (!(obj2 instanceof bqg)) {
                            w511.b();
                            return null;
                        }
                        i0(aVar, new FailDataException((ct11) obj2));
                    }
                }
                a2 = Result.a(a);
                if (a2 != null) {
                    i0(aVar, a2);
                }
                return zy11.a;
            }
        }
        autoTopupRegularViewModel$loadSetupRequestResult$1 = new AutoTopupRegularViewModel$loadSetupRequestResult$1(aVar, continuationImpl);
        Object obj3 = autoTopupRegularViewModel$loadSetupRequestResult$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoTopupRegularViewModel$loadSetupRequestResult$1.label;
        if (i != 0) {
        }
        if (!(a instanceof Result.Failure)) {
        }
        a2 = Result.a(a);
        if (a2 != null) {
        }
        return zy11.a;
    }

    public static final void d0(a aVar, Throwable th) {
        r0 r0Var;
        Object value;
        x4c.g("Failed to save regular auto topup settings", th, null, Collections.singletonList(lrp0.c), 4);
        n0t0 e = gao.e(null, null, th, 3);
        aVar.getClass();
        aVar.Z(new cy3(e));
        pz40 Y = aVar.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, qx3.a((qx3) value, null, null, null, null, null, null, null, false, 254)));
    }

    public static Integer h0(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        return bvu0.l(10, sb.toString());
    }

    public static final void i0(a aVar, Throwable th) {
        r0 r0Var;
        Object value;
        x4c.g("Failed to get saving request status for regular autotopup", th, null, Collections.singletonList(lrp0.c), 4);
        n0t0 e = gao.e(null, null, th, 3);
        aVar.getClass();
        aVar.Z(new cy3(e));
        pz40 Y = aVar.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, qx3.a((qx3) value, null, null, null, null, null, null, null, false, 254)));
    }

    public final void A0() {
        Q0();
        this.Q = true;
    }

    public final void B0() {
        zri0 g0 = g0(null);
        if (g0 == null) {
            return;
        }
        K0(g0);
    }

    public final void C0(String str) {
        f0();
        e0(h0(str), AutoTopupRegularViewModel$AutoTopupRegularSideEffect$Tooltip$Target.AMOUNT_SECOND);
        R0(this, null, null, null, null, O0(str), 15);
        this.P.g(zy11.a);
    }

    public final void D0(int i) {
        r0 r0Var;
        Object value;
        f0();
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, qx3.a((qx3) value, null, null, null, null, null, null, null, false, HProv.PP_VERSION_TIMESTAMP)));
        R0(this, null, null, null, Integer.valueOf(i), null, 23);
    }

    public final void E0() {
        if (((qx3) X()).c.a != FrequencyType.TWICE_PER_MONTH) {
            x4c.g("Attempt to update second date in unsupported type " + ((qx3) X()).c.a, null, null, Collections.singletonList(lrp0.c), 6);
            return;
        }
        z630 z630Var = ((qx3) X()).c.d.b;
        Integer num = z630Var != null ? z630Var.a : null;
        MonthDayChooserView$State$Mode monthDayChooserView$State$Mode = MonthDayChooserView$State$Mode.TWO_DATES;
        AutoTopupRegularViewModel$AutoTopupRegularSideEffect$ShowDayOfMonthSelector$DateType autoTopupRegularViewModel$AutoTopupRegularSideEffect$ShowDayOfMonthSelector$DateType = AutoTopupRegularViewModel$AutoTopupRegularSideEffect$ShowDayOfMonthSelector$DateType.SECOND;
        z630 z630Var2 = ((qx3) X()).c.d.a;
        Z(new yx3(num, monthDayChooserView$State$Mode, autoTopupRegularViewModel$AutoTopupRegularSideEffect$ShowDayOfMonthSelector$DateType, scc.h(z630Var2 != null ? z630Var2.a : null), false));
    }

    public final void F0() {
        this.L.I(RegularAutotopupEvents$RegularAutotopupSaveChangesButtonClickButton.REFUSE_BUTTON, this.B, (qx3) X());
        this.C.e();
    }

    public final void G0(boolean z) {
        r0 r0Var;
        Object value;
        if (z) {
            this.O = null;
        }
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, qx3.a((qx3) value, null, null, null, null, null, null, null, false, 191)));
    }

    public final void H0() {
        qx3 qx3Var = (qx3) X();
        l0p l0pVar = this.L.b.c0;
        String agreementId = this.B.getAgreementId();
        RegularAutotopupEvents$RegularAutotopupSettingsSourceCardButtonClickButton regularAutotopupEvents$RegularAutotopupSettingsSourceCardButtonClickButton = RegularAutotopupEvents$RegularAutotopupSettingsSourceCardButtonClickButton.CHOICE_BUTTON;
        List x = f42.x(qx3Var);
        h5a0 h5a0Var = qx3Var.f;
        e5a0 e5a0Var = h5a0Var instanceof e5a0 ? (e5a0) h5a0Var : null;
        String str = e5a0Var != null ? e5a0Var.f : null;
        g5a0 g5a0Var = h5a0Var instanceof g5a0 ? (g5a0) h5a0Var : null;
        String str2 = g5a0Var != null ? g5a0Var.h : null;
        LinkedHashMap w = g8e.w(5, "agreement_id", agreementId);
        w.put("button", regularAutotopupEvents$RegularAutotopupSettingsSourceCardButtonClickButton.getOriginalValue());
        w.put("payment_method_types", x);
        if (str2 != null) {
            w.put("source_agreement_id", str2);
        }
        if (str != null) {
            byte[] bArr = y5e.W;
            byte[] bArr2 = new byte[7];
            for (int i = 0; i < 7; i++) {
                bArr2[i] = (byte) (bArr[i] ^ y5e.c[i % 8]);
            }
            w.put(new String(bArr2, uza.a), str);
        }
        l0pVar.a.a("regular_autotopup.settings.source_card.button.click", w);
        f0();
        N0();
    }

    public final void I0() {
        dsi0 dsi0Var;
        csi0 b = ((qx3) X()).b();
        String str = (b == null || (dsi0Var = b.a) == null) ? null : dsi0Var.b;
        if (str == null || evu0.J(str)) {
            return;
        }
        ((sv3) this.J).c(str);
    }

    public final void J0(Lifecycle lifecycle) {
        by3 by3Var = this.O;
        if (by3Var != null) {
            Z(by3Var);
        }
        ((sv3) this.J).a(lifecycle);
    }

    public final void K0(zri0 zri0Var) {
        tje.N(ds31.a(this), null, null, new AutoTopupRegularViewModel$saveSettings$1(this, zri0Var, null), 3);
    }

    public final void L0(h5a0 h5a0Var) {
        pz40 Y = Y();
        while (true) {
            r0 r0Var = (r0) Y;
            Object value = r0Var.getValue();
            h5a0 h5a0Var2 = h5a0Var;
            if (r0Var.k(value, qx3.a((qx3) value, null, null, null, null, null, h5a0Var2, null, false, 31))) {
                Z(sx3.a);
                return;
            }
            h5a0Var = h5a0Var2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.ybsdk.feature.autotopup.internal.presentation.saver.a, uc5] */
    public final void N0() {
        ?? r4;
        asi0 asi0Var = (asi0) ((qx3) X()).e.a();
        if (asi0Var != null) {
            uda0 uda0Var = asi0Var.d;
            Text.Resource resource = new Text.Resource(dzh0.ybsdk_auto_topup_regular_bottom_sheet_source_selection_button_primary);
            h5a0 h5a0Var = ((qx3) X()).g;
            String id = h5a0Var != null ? h5a0Var.getId() : null;
            h5a0 h5a0Var2 = ((qx3) X()).f;
            by3 by3Var = new by3(resource, odq0.c(this.D, id, h5a0Var2 != null ? h5a0Var2.getId() : null, uda0Var, null, 48));
            this.O = by3Var;
            Z(by3Var);
            qx3 qx3Var = (qx3) X();
            l0p l0pVar = this.L.b.c0;
            String agreementId = this.B.getAgreementId();
            csi0 b = qx3Var.b();
            RegularAutotopupEvents$RegularAutotopupSettingsSourceOpenStateAutotopup regularAutotopupEvents$RegularAutotopupSettingsSourceOpenStateAutotopup = (b != null ? b.b : null) == RegularAutotopupStatusEntity.DISABLED ? RegularAutotopupEvents$RegularAutotopupSettingsSourceOpenStateAutotopup.NEW : RegularAutotopupEvents$RegularAutotopupSettingsSourceOpenStateAutotopup.CHANGE;
            List x = f42.x(qx3Var);
            asi0 asi0Var2 = (asi0) qx3Var.e.a();
            if (asi0Var2 != null) {
                List<h5a0> list = asi0Var2.d.a;
                r4 = new ArrayList();
                for (h5a0 h5a0Var3 : list) {
                    e5a0 e5a0Var = h5a0Var3 instanceof e5a0 ? (e5a0) h5a0Var3 : null;
                    String str = e5a0Var != null ? e5a0Var.f : null;
                    if (str != null) {
                        r4.add(str);
                    }
                }
            } else {
                r4 = EmptyList.a;
            }
            LinkedHashMap w = g8e.w(4, "agreement_id", agreementId);
            if (regularAutotopupEvents$RegularAutotopupSettingsSourceOpenStateAutotopup != null) {
                w.put("state_autotopup", regularAutotopupEvents$RegularAutotopupSettingsSourceOpenStateAutotopup.getOriginalValue());
            }
            w.put("payment_method_types", x);
            byte[] bArr = y5e.Z;
            byte[] bArr2 = new byte[8];
            for (int i = 0; i < 8; i++) {
                bArr2[i] = (byte) (bArr[i] ^ y5e.c[i % 8]);
            }
            w.put(new String(bArr2, uza.a), r4);
            l0pVar.a.a("regular_autotopup.settings.source.open", w);
        }
    }

    public final MoneyEntity O0(String str) {
        Integer h0 = h0(str);
        if (h0 == null) {
            return new MoneyEntity(new BigDecimal(-1), NumberFormatUtils$Currencies.RUB.getIso(), "");
        }
        int intValue = h0.intValue();
        return new MoneyEntity(BigDecimal.valueOf(intValue), NumberFormatUtils$Currencies.RUB.getIso(), w530.a(this.E, Integer.valueOf(intValue), null, false, null, false, 62));
    }

    public final void Q0() {
        pzt0 pzt0Var = this.M;
        if (pzt0Var == null || !pzt0Var.isActive()) {
            tje.N(ds31.a(this), null, null, new AutoTopupRegularViewModel$updatePaymentMethods$1(this, null), 3);
        }
    }

    public final void e0(Integer num, AutoTopupRegularViewModel$AutoTopupRegularSideEffect$Tooltip$Target autoTopupRegularViewModel$AutoTopupRegularSideEffect$Tooltip$Target) {
        csi0 b = ((qx3) X()).b();
        if (b != null) {
            esi0 esi0Var = b.d;
            if (num == null) {
                return;
            }
            String str = num.intValue() < esi0Var.b ? esi0Var.d : num.intValue() > esi0Var.a ? esi0Var.c : null;
            if (str != null) {
                Z(new dy3(g8e.i(Text.Companion, str), autoTopupRegularViewModel$AutoTopupRegularSideEffect$Tooltip$Target));
            } else {
                Z(vx3.a);
            }
        }
    }

    public final void f0() {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, qx3.a((qx3) value, null, null, null, EmptyList.a, null, null, null, false, 247)));
    }

    public final zri0 g0(String str) {
        MoneyEntity moneyEntity;
        u170 u170Var;
        MoneyEntity moneyEntity2;
        RegularAutotopupStatusEntity regularAutotopupStatusEntity = RegularAutotopupStatusEntity.ENABLED;
        FrequencyType frequencyType = ((qx3) X()).c.a;
        v170 v170Var = ((qx3) X()).c.b;
        DayOfWeek dayOfWeek = v170Var.a;
        w170 w170Var = (dayOfWeek == null || (moneyEntity2 = v170Var.b) == null) ? null : new w170(dayOfWeek, moneyEntity2);
        t170 t170Var = ((qx3) X()).c.c;
        boolean z = t170Var.c;
        Integer num = t170Var.a;
        if ((num != null || z) && (moneyEntity = t170Var.b) != null) {
            if (z) {
                num = null;
            }
            u170Var = new u170(num, moneyEntity, z);
        } else {
            u170Var = null;
        }
        giq0 giq0Var = new giq0(frequencyType, w170Var, u170Var, r7b1.c(((qx3) X()).c.d));
        String agreementId = this.B.getAgreementId();
        String str2 = this.N;
        h5a0 h5a0Var = ((qx3) X()).f;
        if (h5a0Var == null) {
            return null;
        }
        return new zri0(regularAutotopupStatusEntity, agreementId, str2, h5a0Var, giq0Var, str);
    }

    public final void j0() {
        this.L.F(RegularAutotopupEvents$RegularAutotopupSettingsButtonClickButton.PERIOD_BUTTON, this.B, (qx3) X());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k0() {
        csi0 csi0Var;
        RegularAutotopupEvents$RegularAutotopupSettingsButtonClickButton regularAutotopupEvents$RegularAutotopupSettingsButtonClickButton = RegularAutotopupEvents$RegularAutotopupSettingsButtonClickButton.BACK_BUTTON;
        qx3 qx3Var = (qx3) X();
        f42 f42Var = this.L;
        AutoTopupRegularParams autoTopupRegularParams = this.B;
        f42Var.F(regularAutotopupEvents$RegularAutotopupSettingsButtonClickButton, autoTopupRegularParams, qx3Var);
        ColorModel colorModel = null;
        ColorModel colorModel2 = null;
        ColorModel colorModel3 = null;
        boolean z = false;
        BottomSheetDialogView.State state = new BottomSheetDialogView.State(new BottomSheetDialogView.State.a(unr0.h(Text.Companion, dzh0.ybsdk_auto_topup_exit_confirmation_title), new Text.Resource(dzh0.ybsdk_auto_topup_exit_confirmation_subtitle), null, null, null, null, HProv.PP_SAME_MEDIA), new YbButtonView.a(new Text.Resource(dzh0.ybsdk_auto_topup_exit_confirmation_save_button_title), null, null, null, colorModel, colorModel2, colorModel3, false, z, null, 4094), new YbButtonView.a(new Text.Resource(dzh0.ybsdk_auto_topup_exit_confirmation_cancel_button_title), 0 == true ? 1 : 0, 0 == true ? 1 : 0, colorModel, colorModel2, colorModel3, null, z, false, null, 4094), null, null, null, null, null, null, 131064);
        asi0 asi0Var = (asi0) ((qx3) X()).e.a();
        if (((asi0Var == null || (csi0Var = asi0Var.a) == null) ? null : csi0Var.b) != RegularAutotopupStatusEntity.ENABLED || (((qx3) X()).c.a == asi0Var.a.e.a && jl40.l(((qx3) X()).f, asi0Var.h))) {
            this.C.e();
            return;
        }
        qx3 qx3Var2 = (qx3) X();
        l0p l0pVar = f42Var.b.c0;
        String agreementId = autoTopupRegularParams.getAgreementId();
        csi0 b = qx3Var2.b();
        RegularAutotopupEvents$RegularAutotopupSaveChangesOpenStateAutotopup regularAutotopupEvents$RegularAutotopupSaveChangesOpenStateAutotopup = (b != null ? b.b : null) == RegularAutotopupStatusEntity.DISABLED ? RegularAutotopupEvents$RegularAutotopupSaveChangesOpenStateAutotopup.NEW : RegularAutotopupEvents$RegularAutotopupSaveChangesOpenStateAutotopup.CHANGE;
        LinkedHashMap w = g8e.w(2, "agreement_id", agreementId);
        if (regularAutotopupEvents$RegularAutotopupSaveChangesOpenStateAutotopup != null) {
            w.put("state_autotopup", regularAutotopupEvents$RegularAutotopupSaveChangesOpenStateAutotopup.getOriginalValue());
        }
        l0pVar.a.a("regular_autotopup.save_changes.open", w);
        Z(new tx3(state));
    }

    public final void l0() {
        Object obj;
        asi0 asi0Var = (asi0) ((qx3) X()).e.a();
        List list = asi0Var != null ? asi0Var.d.a : null;
        h5a0 h5a0Var = ((qx3) X()).g;
        if (h5a0Var == null) {
            h5a0 h5a0Var2 = ((qx3) X()).f;
            if (h5a0Var2 == null || list == null) {
                h5a0Var = null;
            } else {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (jl40.l(((h5a0) obj).getId(), h5a0Var2.getId())) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                h5a0Var = (h5a0) obj;
            }
        }
        if (h5a0Var == null) {
            com.ybsdk.core.utils.text.b bVar = Text.Companion;
            int i = dzh0.ybsdk_auto_topup_regular_snackbar_select_source_for_save;
            bVar.getClass();
            M0(this, new Text.Resource(i));
            return;
        }
        if (!h5a0Var.equals(((qx3) X()).f)) {
            L0(h5a0Var);
        }
        Z(sx3.a);
        G0(true);
        qx3 qx3Var = (qx3) X();
        l0p l0pVar = this.L.b.c0;
        String agreementId = this.B.getAgreementId();
        List x = f42.x(qx3Var);
        h5a0 h5a0Var3 = qx3Var.f;
        e5a0 e5a0Var = h5a0Var3 instanceof e5a0 ? (e5a0) h5a0Var3 : null;
        String str = e5a0Var != null ? e5a0Var.f : null;
        g5a0 g5a0Var = h5a0Var3 instanceof g5a0 ? (g5a0) h5a0Var3 : null;
        String str2 = g5a0Var != null ? g5a0Var.h : null;
        RegularAutotopupEvents$RegularAutotopupSettingsSourceButtonClickButton regularAutotopupEvents$RegularAutotopupSettingsSourceButtonClickButton = RegularAutotopupEvents$RegularAutotopupSettingsSourceButtonClickButton.READY_BUTTON;
        csi0 b = qx3Var.b();
        RegularAutotopupEvents$RegularAutotopupSettingsSourceButtonClickStateAutotopup regularAutotopupEvents$RegularAutotopupSettingsSourceButtonClickStateAutotopup = (b != null ? b.b : null) == RegularAutotopupStatusEntity.DISABLED ? RegularAutotopupEvents$RegularAutotopupSettingsSourceButtonClickStateAutotopup.NEW : RegularAutotopupEvents$RegularAutotopupSettingsSourceButtonClickStateAutotopup.CHANGE;
        LinkedHashMap linkedHashMap = new LinkedHashMap(6);
        linkedHashMap.put("agreement_id", agreementId);
        linkedHashMap.put("payment_method_types", x);
        if (str2 != null) {
            linkedHashMap.put("source_agreement_id", str2);
        }
        if (str != null) {
            byte[] bArr = y5e.W;
            byte[] bArr2 = new byte[7];
            for (int i2 = 0; i2 < 7; i2++) {
                bArr2[i2] = (byte) (bArr[i2] ^ y5e.c[i2 % 8]);
            }
            linkedHashMap.put(new String(bArr2, uza.a), str);
        }
        linkedHashMap.put("button", regularAutotopupEvents$RegularAutotopupSettingsSourceButtonClickButton.getOriginalValue());
        if (regularAutotopupEvents$RegularAutotopupSettingsSourceButtonClickStateAutotopup != null) {
            linkedHashMap.put("state_autotopup", regularAutotopupEvents$RegularAutotopupSettingsSourceButtonClickStateAutotopup.getOriginalValue());
        }
        l0pVar.a.a("regular_autotopup.settings.source.button.click", linkedHashMap);
    }

    public final void m0() {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, qx3.a((qx3) value, null, null, null, null, null, null, null, false, 253)));
    }

    public final void n0() {
        this.L.G(RegularAutotopupEvents$RegularAutotopupDeactivateButtonClickButton.REFUSE_BUTTON, this.B);
    }

    public final void o0() {
        Q0();
        this.Q = false;
    }

    public final void p0() {
        csi0 csi0Var;
        h5a0 h5a0Var = ((qx3) X()).f;
        RegularAutotopupEvents$RegularAutotopupDeactivateButtonClickButton regularAutotopupEvents$RegularAutotopupDeactivateButtonClickButton = RegularAutotopupEvents$RegularAutotopupDeactivateButtonClickButton.SELECT_BUTTON;
        f42 f42Var = this.L;
        AutoTopupRegularParams autoTopupRegularParams = this.B;
        f42Var.G(regularAutotopupEvents$RegularAutotopupDeactivateButtonClickButton, autoTopupRegularParams);
        zri0 zri0Var = null;
        if (h5a0Var == null) {
            x4c.g("Can't disable regular auto topup without selected payment method", null, null, Collections.singletonList(lrp0.c), 6);
            com.ybsdk.core.utils.text.b bVar = Text.Companion;
            int i = dzh0.ybsdk_common_default_error;
            bVar.getClass();
            M0(this, new Text.Resource(i));
            return;
        }
        RegularAutotopupStatusEntity regularAutotopupStatusEntity = RegularAutotopupStatusEntity.DISABLED;
        asi0 asi0Var = (asi0) ((qx3) X()).e.a();
        if (asi0Var != null && (csi0Var = asi0Var.a) != null) {
            giq0 giq0Var = csi0Var.e;
            String agreementId = autoTopupRegularParams.getAgreementId();
            String str = this.N;
            h5a0 h5a0Var2 = ((qx3) X()).f;
            if (h5a0Var2 != null) {
                zri0Var = new zri0(regularAutotopupStatusEntity, agreementId, str, h5a0Var2, giq0Var, null);
            }
        }
        if (zri0Var == null) {
            return;
        }
        K0(zri0Var);
    }

    public final void q0() {
        this.M = tje.N(ds31.a(this), null, null, new AutoTopupRegularViewModel$loadData$1(this, null), 3);
    }

    public final void r0() {
        String supportUrl;
        u8j0 u8j0Var = ((qx3) X()).e;
        s8j0 s8j0Var = u8j0Var instanceof s8j0 ? (s8j0) u8j0Var : null;
        Throwable th = s8j0Var != null ? s8j0Var.a : null;
        FailDataException failDataException = th instanceof FailDataException ? (FailDataException) th : null;
        if (failDataException == null || (supportUrl = failDataException.getSupportUrl()) == null) {
            return;
        }
        sv3 sv3Var = (sv3) this.J;
        if (sv3Var.a.c(supportUrl).a instanceof x0h) {
            sv3Var.d.h(com.ybsdk.feature.webview.api.a.b(sv3Var.c, supportUrl, null, null, 6));
        }
    }

    public final void s0(String str) {
        f0();
        e0(h0(str), AutoTopupRegularViewModel$AutoTopupRegularSideEffect$Tooltip$Target.AMOUNT_FIRST);
        R0(this, null, O0(str), null, null, null, 29);
        this.P.g(zy11.a);
    }

    public final void t0(Integer num, boolean z) {
        r0 r0Var;
        Object value;
        f0();
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, qx3.a((qx3) value, null, null, null, null, null, null, null, false, HProv.PP_VERSION_TIMESTAMP)));
        if (z) {
            num = null;
        }
        R0(this, Integer.valueOf(num != null ? num.intValue() : -1), null, Boolean.valueOf(z), null, null, 26);
    }

    public final void v0() {
        RegularAutotopupEvents$RegularAutotopupSettingsButtonClickButton regularAutotopupEvents$RegularAutotopupSettingsButtonClickButton = RegularAutotopupEvents$RegularAutotopupSettingsButtonClickButton.WHEN_BUTTON;
        qx3 qx3Var = (qx3) X();
        f42 f42Var = this.L;
        AutoTopupRegularParams autoTopupRegularParams = this.B;
        f42Var.F(regularAutotopupEvents$RegularAutotopupSettingsButtonClickButton, autoTopupRegularParams, qx3Var);
        int i = gy3.a[((qx3) X()).c.a.ordinal()];
        if (i == 1) {
            DayOfWeek dayOfWeek = ((qx3) X()).c.b.a;
            WeekDayChooserView$State$WeekDay weekDayChooserView$State$WeekDay = dayOfWeek != null ? (WeekDayChooserView$State$WeekDay) WeekDayChooserView$State$WeekDay.getEntries().get(dayOfWeek.ordinal()) : null;
            f42Var.J(RegularAutotopupEvents$RegularAutotopupSettingsWhenOpenBottomsheetType.WEEK, autoTopupRegularParams, (qx3) X());
            Z(new zx3(weekDayChooserView$State$WeekDay));
            return;
        }
        if (i == 2) {
            f42Var.J(RegularAutotopupEvents$RegularAutotopupSettingsWhenOpenBottomsheetType.MONTH, autoTopupRegularParams, (qx3) X());
            Z(new yx3(((qx3) X()).c.c.a, MonthDayChooserView$State$Mode.ONE_DATE, AutoTopupRegularViewModel$AutoTopupRegularSideEffect$ShowDayOfMonthSelector$DateType.FIRST, EmptyList.a, ((qx3) X()).c.c.c));
        } else {
            if (i != 3) {
                w511.b();
                return;
            }
            f42Var.J(RegularAutotopupEvents$RegularAutotopupSettingsWhenOpenBottomsheetType.MONTH, autoTopupRegularParams, (qx3) X());
            z630 z630Var = ((qx3) X()).c.d.a;
            Integer num = z630Var != null ? z630Var.a : null;
            MonthDayChooserView$State$Mode monthDayChooserView$State$Mode = MonthDayChooserView$State$Mode.TWO_DATES;
            AutoTopupRegularViewModel$AutoTopupRegularSideEffect$ShowDayOfMonthSelector$DateType autoTopupRegularViewModel$AutoTopupRegularSideEffect$ShowDayOfMonthSelector$DateType = AutoTopupRegularViewModel$AutoTopupRegularSideEffect$ShowDayOfMonthSelector$DateType.FIRST;
            z630 z630Var2 = ((qx3) X()).c.d.b;
            Z(new yx3(num, monthDayChooserView$State$Mode, autoTopupRegularViewModel$AutoTopupRegularSideEffect$ShowDayOfMonthSelector$DateType, scc.h(z630Var2 != null ? z630Var2.a : null), false));
        }
    }

    public final void w0(int i) {
        FrequencyType frequencyType;
        r0 r0Var;
        Object value;
        qx3 qx3Var;
        csi0 csi0Var;
        Set keySet;
        asi0 asi0Var = (asi0) ((qx3) X()).e.a();
        List J0 = (asi0Var == null || (csi0Var = asi0Var.a) == null || (keySet = csi0Var.f.keySet()) == null) ? null : kotlin.collections.a.J0(keySet);
        if (J0 == null || (frequencyType = (FrequencyType) kotlin.collections.a.S(i, J0)) == null) {
            return;
        }
        f0();
        Z(vx3.a);
        Z(ey3.a);
        Z(new xx3(i));
        qx3 qx3Var2 = (qx3) X();
        l0p l0pVar = this.L.b.c0;
        String agreementId = this.B.getAgreementId();
        csi0 b = qx3Var2.b();
        RegularAutotopupEvents$RegularAutotopupSettingsPeriodButtonClickStateAutotopup regularAutotopupEvents$RegularAutotopupSettingsPeriodButtonClickStateAutotopup = (b != null ? b.b : null) == RegularAutotopupStatusEntity.DISABLED ? RegularAutotopupEvents$RegularAutotopupSettingsPeriodButtonClickStateAutotopup.NEW : RegularAutotopupEvents$RegularAutotopupSettingsPeriodButtonClickStateAutotopup.CHANGE;
        String name = frequencyType.name();
        LinkedHashMap w = g8e.w(3, "agreement_id", agreementId);
        if (regularAutotopupEvents$RegularAutotopupSettingsPeriodButtonClickStateAutotopup != null) {
            w.put("state_autotopup", regularAutotopupEvents$RegularAutotopupSettingsPeriodButtonClickStateAutotopup.getOriginalValue());
        }
        w.put("button", name);
        l0pVar.a.a("regular_autotopup.settings.period.button.click", w);
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
            qx3Var = (qx3) value;
        } while (!r0Var.k(value, qx3.a(qx3Var, null, null, rgq0.a(qx3Var.c, frequencyType, null, null, null, 14), null, null, null, null, false, 251)));
        this.P.g(zy11.a);
    }

    public final void x0() {
        asi0 asi0Var = (asi0) ((qx3) X()).e.a();
        String str = asi0Var != null ? asi0Var.c.b : null;
        qx3 qx3Var = (qx3) X();
        l0p l0pVar = this.L.b.c0;
        String agreementId = this.B.getAgreementId();
        RegularAutotopupEvents$RegularAutotopupSettingsButtonClickButton regularAutotopupEvents$RegularAutotopupSettingsButtonClickButton = RegularAutotopupEvents$RegularAutotopupSettingsButtonClickButton.INFORMATION;
        csi0 b = qx3Var.b();
        l0pVar.h(agreementId, null, null, null, (b != null ? b.b : null) == RegularAutotopupStatusEntity.DISABLED ? RegularAutotopupEvents$RegularAutotopupSettingsButtonClickStateAutotopup.NEW : RegularAutotopupEvents$RegularAutotopupSettingsButtonClickStateAutotopup.CHANGE, null, null, null, null, regularAutotopupEvents$RegularAutotopupSettingsButtonClickButton);
        if (str == null || evu0.J(str)) {
            return;
        }
        ((sv3) this.J).c(str);
    }

    public final void y0() {
        this.L.I(RegularAutotopupEvents$RegularAutotopupSaveChangesButtonClickButton.SELECT_BUTTON, this.B, (qx3) X());
        zri0 g0 = g0(null);
        if (g0 == null) {
            return;
        }
        K0(g0);
    }

    public final void z0(TwoFactorAuthResult twoFactorAuthResult) {
        r0 r0Var;
        Object value;
        if (twoFactorAuthResult.equals(TwoFactorAuthResult.Cancel.INSTANCE)) {
            this.N = null;
            pz40 Y = Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, qx3.a((qx3) value, null, null, null, null, null, null, null, false, 254)));
            return;
        }
        if (!(twoFactorAuthResult instanceof TwoFactorAuthResult.Success)) {
            w511.b();
            return;
        }
        u8j0 u8j0Var = ((qx3) X()).a;
        if ((u8j0Var != null ? (RegularAutotopupStatusEntity) u8j0Var.a() : null) == null) {
            x4c.g("Can't find pending status, to proceed after 2fa", null, null, Collections.singletonList(lrp0.c), 6);
            return;
        }
        zri0 g0 = g0(((TwoFactorAuthResult.Success) twoFactorAuthResult).getVerificationToken());
        if (g0 == null) {
            return;
        }
        K0(g0);
    }
}
