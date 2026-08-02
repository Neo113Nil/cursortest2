package com.ybsdk.feature.autotopup.internal.presentation.saver;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.ybsdk.core.analytics.generated.AutoTopupSettingsResultTypeAutotopup;
import com.ybsdk.core.analytics.generated.delegates.RoundingEvents$RoundingSettingsActivateResultResult;
import com.ybsdk.core.analytics.generated.delegates.RoundingEvents$RoundingSettingsAmountRoundSetStateRounding;
import com.ybsdk.core.analytics.generated.delegates.RoundingEvents$RoundingSettingsButtonClickButton;
import com.ybsdk.core.analytics.generated.delegates.RoundingEvents$RoundingSettingsLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.RoundingEvents$RoundingSettingsSaveChangesOpenStateRounding;
import com.ybsdk.core.analytics.generated.delegates.RoundingEvents$RoundingSettingsSourceButtonClickButton;
import com.ybsdk.core.analytics.generated.delegates.RoundingEvents$RoundingSettingsSourceButtonClickStateRounding;
import com.ybsdk.core.analytics.generated.delegates.RoundingEvents$RoundingSettingsSourceOpenStateRounding;
import com.ybsdk.core.analytics.generated.delegates.RoundingEvents$RoundingSettingsSureDeactivateButtonClickButton;
import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.autotopup.api.TwoFactorAuthResult;
import com.ybsdk.feature.autotopup.api.domain.model.AutoTopupRequestStatusPollingOption;
import com.ybsdk.feature.autotopup.internal.domain.entities.rounding.RoundingStatusEntity;
import com.ybsdk.feature.autotopup.internal.network.dto.rounding.RoundingStatus;
import com.ybsdk.feature.autotopup.internal.presentation.result.AutoTopupResultParams;
import com.ybsdk.feature.autotopup.internal.presentation.saver.RoundingState;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import defpackage.apk0;
import defpackage.bqg;
import defpackage.c24;
import defpackage.cfj0;
import defpackage.cqg;
import defpackage.ct11;
import defpackage.cvu0;
import defpackage.czk0;
import defpackage.d24;
import defpackage.dqg;
import defpackage.ds31;
import defpackage.dsg;
import defpackage.dzh0;
import defpackage.dzk0;
import defpackage.e24;
import defpackage.ea4;
import defpackage.evu0;
import defpackage.ezk0;
import defpackage.fa4;
import defpackage.ffx;
import defpackage.g5a0;
import defpackage.g8e;
import defpackage.gao;
import defpackage.h5a0;
import defpackage.hzk0;
import defpackage.iw3;
import defpackage.iz3;
import defpackage.izk0;
import defpackage.jl40;
import defpackage.jqp0;
import defpackage.kzk0;
import defpackage.lrp0;
import defpackage.mzk0;
import defpackage.n0t0;
import defpackage.ny61;
import defpackage.nzk0;
import defpackage.odq0;
import defpackage.ohk0;
import defpackage.pz40;
import defpackage.pzk0;
import defpackage.s8j0;
import defpackage.sv3;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.trp0;
import defpackage.ty3;
import defpackage.u8j0;
import defpackage.uc5;
import defpackage.uda0;
import defpackage.uk11;
import defpackage.unr0;
import defpackage.us3;
import defpackage.w511;
import defpackage.x0h;
import defpackage.x4c;
import defpackage.x4e;
import defpackage.xyk0;
import defpackage.z94;
import defpackage.ztv;
import defpackage.zy11;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes3.dex */
public final class b extends uc5 {
    public final com.ybsdk.feature.autotopup.internal.data.b B;
    public final RoundingParams C;
    public final tfl0 D;
    public final Context E;
    public final iz3 F;
    public final com.ybsdk.feature.autotopup.internal.domain.c G;
    public final iw3 H;
    public final uk11 I;
    public final us3 J;
    public String K;
    public mzk0 L;
    public final n0 M;

    public b(com.ybsdk.feature.autotopup.internal.data.b bVar, RoundingParams roundingParams, tfl0 tfl0Var, Context context, iz3 iz3Var, com.ybsdk.feature.autotopup.internal.domain.c cVar, iw3 iw3Var, uk11 uk11Var, us3 us3Var, c cVar2) {
        super(new apk0(6), cVar2);
        this.B = bVar;
        this.C = roundingParams;
        this.D = tfl0Var;
        this.E = context;
        this.F = iz3Var;
        this.G = cVar;
        this.H = iw3Var;
        this.I = uk11Var;
        this.J = us3Var;
        n0 c = ffx.c(0, 1, BufferOverflow.DROP_OLDEST, 1);
        this.M = c;
        ((sv3) iw3Var).b(new ohk0(11, this));
        tje.N(ds31.a(this), null, null, new RoundingViewModel$loadData$1(this, null), 3);
        com.ybsdk.core.utils.ext.c.a(e.p(c, 150L), ds31.a(this), new cfj0(9, this));
    }

    public static final void b0(b bVar, Throwable th) {
        String X;
        r0 r0Var;
        Object value;
        String agreementId = bVar.C.getAgreementId();
        List singletonList = Collections.singletonList(lrp0.A);
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
        bVar.J.a.e0.v(bVar.C.getAgreementId(), RoundingEvents$RoundingSettingsLoadedResult.ERROR, null);
        pz40 Y = bVar.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, RoundingState.a((RoundingState) value, null, null, null, null, new s8j0(th), null, null, 111)));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c0(b bVar, ty3 ty3Var, ContinuationImpl continuationImpl) {
        RoundingViewModel$loadSetupRequestResult$1 roundingViewModel$loadSetupRequestResult$1;
        int i;
        Object a;
        Throwable a2;
        bVar.getClass();
        if (continuationImpl instanceof RoundingViewModel$loadSetupRequestResult$1) {
            roundingViewModel$loadSetupRequestResult$1 = (RoundingViewModel$loadSetupRequestResult$1) continuationImpl;
            int i2 = roundingViewModel$loadSetupRequestResult$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                roundingViewModel$loadSetupRequestResult$1.label = i2 - Integer.MIN_VALUE;
                Object obj = roundingViewModel$loadSetupRequestResult$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = roundingViewModel$loadSetupRequestResult$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.ybsdk.feature.autotopup.internal.domain.c cVar = bVar.G;
                    String str = ty3Var.a;
                    boolean z = ty3Var.e;
                    AutoTopupRequestStatusPollingOption autoTopupRequestStatusPollingOption = AutoTopupRequestStatusPollingOption.SHORT;
                    roundingViewModel$loadSetupRequestResult$1.label = 1;
                    a = cVar.a(str, z, autoTopupRequestStatusPollingOption, roundingViewModel$loadSetupRequestResult$1);
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
                            f0(bVar, new IllegalStateException("Rounding doesn't support 3ds"));
                        } else {
                            if (!(e24Var instanceof d24)) {
                                w511.b();
                                return null;
                            }
                            iz3 iz3Var = bVar.F;
                            d24 d24Var = (d24) e24Var;
                            AutoTopupResultParams.NoPolling noPolling = new AutoTopupResultParams.NoPolling(d24Var.e, d24Var.f, d24Var.b, d24Var.c, d24Var.d, true, Collections.singletonList(AutoTopupSettingsResultTypeAutotopup.ROUNDING));
                            iz3Var.getClass();
                            bVar.D.l(iz3.a(noPolling));
                        }
                    } else {
                        if (!(obj2 instanceof bqg)) {
                            w511.b();
                            return null;
                        }
                        f0(bVar, new FailDataException((ct11) obj2));
                    }
                }
                a2 = Result.a(a);
                if (a2 != null) {
                    f0(bVar, a2);
                }
                return zy11.a;
            }
        }
        roundingViewModel$loadSetupRequestResult$1 = new RoundingViewModel$loadSetupRequestResult$1(bVar, continuationImpl);
        Object obj3 = roundingViewModel$loadSetupRequestResult$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = roundingViewModel$loadSetupRequestResult$1.label;
        if (i != 0) {
        }
        if (!(a instanceof Result.Failure)) {
        }
        a2 = Result.a(a);
        if (a2 != null) {
        }
        return zy11.a;
    }

    public static final void d0(b bVar, czk0 czk0Var, Throwable th) {
        r0 r0Var;
        Object value;
        x4c.g("Failed to save rounding settings", th, null, Collections.singletonList(lrp0.A), 4);
        bVar.J.v(bVar.C, (RoundingState) bVar.X(), czk0Var, RoundingEvents$RoundingSettingsActivateResultResult.ERROR);
        bVar.Z(new nzk0(gao.e(null, null, th, 3)));
        pz40 Y = bVar.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, RoundingState.a((RoundingState) value, null, null, null, null, null, null, null, HProv.PP_DELETE_SAVED_PASSWD)));
    }

    public static czk0 e0(b bVar, String str, int i) {
        String str2 = (i & 1) != 0 ? null : str;
        h5a0 h5a0Var = ((RoundingState) bVar.X()).g;
        if (h5a0Var == null) {
            h5a0Var = ((RoundingState) bVar.X()).f;
        }
        bVar.getClass();
        RoundingStatusEntity roundingStatusEntity = RoundingStatusEntity.ENABLED;
        String agreementId = bVar.C.getAgreementId();
        g5a0 g5a0Var = h5a0Var instanceof g5a0 ? (g5a0) h5a0Var : null;
        String str3 = g5a0Var != null ? g5a0Var.h : null;
        xyk0 xyk0Var = ((RoundingState) bVar.X()).c;
        if (xyk0Var == null) {
            return null;
        }
        return new czk0(roundingStatusEntity, str3, agreementId, bVar.K, xyk0Var, str2);
    }

    public static final void f0(b bVar, Throwable th) {
        r0 r0Var;
        Object value;
        x4c.g("Failed to get saving request status for rounding", th, null, Collections.singletonList(lrp0.A), 4);
        n0t0 e = gao.e(null, null, th, 3);
        bVar.getClass();
        bVar.Z(new nzk0(e));
        pz40 Y = bVar.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, RoundingState.a((RoundingState) value, null, null, null, null, null, null, null, HProv.PP_DELETE_SAVED_PASSWD)));
    }

    public static void v0(b bVar, Text.Resource resource) {
        Text.Empty empty = Text.Empty.INSTANCE;
        bVar.getClass();
        bVar.Z(new nzk0(new n0t0(resource, empty)));
    }

    public final void g0() {
        dzk0 dzk0Var;
        dzk0 dzk0Var2;
        RoundingState roundingState = (RoundingState) X();
        RoundingEvents$RoundingSettingsButtonClickButton roundingEvents$RoundingSettingsButtonClickButton = RoundingEvents$RoundingSettingsButtonClickButton.BACK;
        us3 us3Var = this.J;
        RoundingParams roundingParams = this.C;
        us3Var.r(roundingParams, roundingState, roundingEvents$RoundingSettingsButtonClickButton);
        BottomSheetDialogView.State state = new BottomSheetDialogView.State(new BottomSheetDialogView.State.a(unr0.h(Text.Companion, dzh0.ybsdk_auto_topup_exit_confirmation_title), new Text.Resource(dzh0.ybsdk_auto_topup_exit_confirmation_rounding_subtitle), null, null, null, null, HProv.PP_SAME_MEDIA), new YbButtonView.a(new Text.Resource(dzh0.ybsdk_auto_topup_exit_confirmation_save_button_title), null, null, null, null, null, null, false, false, null, 4094), new YbButtonView.a(new Text.Resource(dzh0.ybsdk_auto_topup_exit_confirmation_cancel_button_title), null, null, null, null, null, null, false, false, null, 4094), null, null, null, null, null, null, 131064);
        ezk0 ezk0Var = (ezk0) ((RoundingState) X()).e.a();
        RoundingStatus roundingStatus = null;
        RoundingStatus roundingStatus2 = (ezk0Var == null || (dzk0Var2 = ezk0Var.a) == null) ? null : dzk0Var2.a;
        RoundingStatus roundingStatus3 = RoundingStatus.ENABLED;
        if (roundingStatus2 != roundingStatus3 || (jl40.l(((RoundingState) X()).c, ezk0Var.a.d) && jl40.l(((RoundingState) X()).f, ezk0Var.i))) {
            this.D.e();
            return;
        }
        RoundingState roundingState2 = (RoundingState) X();
        z94 z94Var = us3Var.a.e0;
        String agreementId = roundingParams.getAgreementId();
        ezk0 ezk0Var2 = (ezk0) roundingState2.e.a();
        if (ezk0Var2 != null && (dzk0Var = ezk0Var2.a) != null) {
            roundingStatus = dzk0Var.a;
        }
        RoundingEvents$RoundingSettingsSaveChangesOpenStateRounding roundingEvents$RoundingSettingsSaveChangesOpenStateRounding = roundingStatus == roundingStatus3 ? RoundingEvents$RoundingSettingsSaveChangesOpenStateRounding.CHANGE : RoundingEvents$RoundingSettingsSaveChangesOpenStateRounding.NEW;
        LinkedHashMap w = g8e.w(2, "agreement_id", agreementId);
        if (roundingEvents$RoundingSettingsSaveChangesOpenStateRounding != null) {
            w.put("state_rounding", roundingEvents$RoundingSettingsSaveChangesOpenStateRounding.getOriginalValue());
        }
        z94Var.a.a("rounding.settings.save_changes.open", w);
        Z(new izk0(state));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h0() {
        h5a0 h5a0Var;
        r0 r0Var;
        Object value;
        RoundingState roundingState;
        dzk0 dzk0Var;
        Object obj;
        ezk0 ezk0Var = (ezk0) ((RoundingState) X()).e.a();
        RoundingStatus roundingStatus = null;
        List list = ezk0Var != null ? ezk0Var.e.a : null;
        h5a0 h5a0Var2 = ((RoundingState) X()).g;
        if (h5a0Var2 == null) {
            h5a0 h5a0Var3 = ((RoundingState) X()).f;
            if (h5a0Var3 == null) {
                h5a0Var = null;
                if (h5a0Var != null) {
                    com.ybsdk.core.utils.text.b bVar = Text.Companion;
                    int i = dzh0.ybsdk_auto_topup_regular_snackbar_select_source_for_save;
                    bVar.getClass();
                    v0(this, new Text.Resource(i));
                    return;
                }
                RoundingState roundingState2 = (RoundingState) X();
                z94 z94Var = this.J.a.e0;
                String agreementId = this.C.getAgreementId();
                String id = h5a0Var.getId();
                ezk0 ezk0Var2 = (ezk0) roundingState2.e.a();
                if (ezk0Var2 != null && (dzk0Var = ezk0Var2.a) != null) {
                    roundingStatus = dzk0Var.a;
                }
                RoundingEvents$RoundingSettingsSourceButtonClickStateRounding roundingEvents$RoundingSettingsSourceButtonClickStateRounding = roundingStatus == RoundingStatus.ENABLED ? RoundingEvents$RoundingSettingsSourceButtonClickStateRounding.CHANGE : RoundingEvents$RoundingSettingsSourceButtonClickStateRounding.NEW;
                RoundingEvents$RoundingSettingsSourceButtonClickButton roundingEvents$RoundingSettingsSourceButtonClickButton = RoundingEvents$RoundingSettingsSourceButtonClickButton.READY_BUTTON;
                LinkedHashMap t = x4e.t(4, "agreement_id", agreementId, "source_agreement_id", id);
                t.put("state_rounding", roundingEvents$RoundingSettingsSourceButtonClickStateRounding.getOriginalValue());
                t.put("button", roundingEvents$RoundingSettingsSourceButtonClickButton.getOriginalValue());
                z94Var.a.a("rounding.settings.source.button.click", t);
                boolean equals = h5a0Var.equals(((RoundingState) X()).f);
                hzk0 hzk0Var = hzk0.a;
                if (!equals) {
                    pz40 Y = Y();
                    do {
                        r0Var = (r0) Y;
                        value = r0Var.getValue();
                        roundingState = (RoundingState) value;
                    } while (!r0Var.k(value, RoundingState.a(roundingState, null, null, null, null, null, h5a0Var, roundingState.f, 31)));
                    Z(hzk0Var);
                }
                Z(hzk0Var);
                r0(true);
                return;
            }
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (jl40.l(((h5a0) obj).getId(), h5a0Var3.getId())) {
                            break;
                        }
                    }
                }
                h5a0Var2 = (h5a0) obj;
            } else {
                h5a0Var2 = null;
            }
        }
        h5a0Var = h5a0Var2;
        if (h5a0Var != null) {
        }
    }

    public final void i0() {
        this.J.a.e0.w(this.C.getAgreementId(), RoundingEvents$RoundingSettingsSureDeactivateButtonClickButton.KEEP_BUTTON);
    }

    public final void j0() {
        dzk0 dzk0Var;
        xyk0 xyk0Var;
        h5a0 h5a0Var = ((RoundingState) X()).f;
        z94 z94Var = this.J.a.e0;
        RoundingParams roundingParams = this.C;
        z94Var.w(roundingParams.getAgreementId(), RoundingEvents$RoundingSettingsSureDeactivateButtonClickButton.DEACTIVATE_BUTTON);
        czk0 czk0Var = null;
        if (h5a0Var == null) {
            x4c.g("Can't disable rounding topup without selected payment method", null, null, Collections.singletonList(lrp0.A), 6);
            com.ybsdk.core.utils.text.b bVar = Text.Companion;
            int i = dzh0.ybsdk_common_default_error;
            bVar.getClass();
            v0(this, new Text.Resource(i));
            return;
        }
        RoundingStatusEntity roundingStatusEntity = RoundingStatusEntity.DISABLED;
        String agreementId = roundingParams.getAgreementId();
        h5a0 h5a0Var2 = ((RoundingState) X()).f;
        g5a0 g5a0Var = h5a0Var2 instanceof g5a0 ? (g5a0) h5a0Var2 : null;
        String str = g5a0Var != null ? g5a0Var.h : null;
        ezk0 ezk0Var = (ezk0) ((RoundingState) X()).e.a();
        if (ezk0Var != null && (dzk0Var = ezk0Var.a) != null && (xyk0Var = dzk0Var.d) != null) {
            czk0Var = new czk0(roundingStatusEntity, str, agreementId, this.K, xyk0Var, null);
        }
        if (czk0Var == null) {
            return;
        }
        u0(czk0Var);
    }

    public final void k0() {
        tje.N(ds31.a(this), null, null, new RoundingViewModel$loadData$1(this, null), 3);
    }

    public final void l0() {
        String supportUrl;
        u8j0 u8j0Var = ((RoundingState) X()).e;
        s8j0 s8j0Var = u8j0Var instanceof s8j0 ? (s8j0) u8j0Var : null;
        Throwable th = s8j0Var != null ? s8j0Var.a : null;
        FailDataException failDataException = th instanceof FailDataException ? (FailDataException) th : null;
        if (failDataException == null || (supportUrl = failDataException.getSupportUrl()) == null) {
            return;
        }
        sv3 sv3Var = (sv3) this.H;
        if (sv3Var.a.c(supportUrl).a instanceof x0h) {
            sv3Var.d.h(com.ybsdk.feature.webview.api.a.b(sv3Var.c, supportUrl, null, null, 6));
        }
    }

    public final void m0() {
        String str;
        ztv ztvVar;
        String str2;
        xyk0 xyk0Var = ((RoundingState) X()).c;
        String str3 = null;
        if (xyk0Var == null || (str = xyk0Var.a) == null) {
            x4c.g("onInfoButtonClick: selectedOption is null", null, null, Collections.singletonList(lrp0.A), 6);
            str = "";
        }
        ezk0 ezk0Var = (ezk0) ((RoundingState) X()).e.a();
        if (ezk0Var != null && (ztvVar = ezk0Var.d) != null && (str2 = ztvVar.b) != null) {
            str3 = cvu0.v(str2, "{{id}}", str, false);
        }
        if (str3 == null || evu0.J(str3)) {
            return;
        }
        ((sv3) this.H).c(str3);
    }

    public final void n0(int i) {
        xyk0 xyk0Var;
        r0 r0Var;
        Object value;
        String str;
        dzk0 dzk0Var;
        dzk0 dzk0Var2;
        fa4 fa4Var;
        ea4 ea4Var;
        dzk0 dzk0Var3;
        List list;
        ezk0 ezk0Var = (ezk0) ((RoundingState) X()).e.a();
        RoundingStatus roundingStatus = null;
        List J0 = (ezk0Var == null || (dzk0Var3 = ezk0Var.a) == null || (list = dzk0Var3.e) == null) ? null : kotlin.collections.a.J0(list);
        if (J0 == null || (xyk0Var = (xyk0) kotlin.collections.a.S(i, J0)) == null) {
            return;
        }
        Z(new kzk0(i));
        Z(pzk0.a);
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, RoundingState.a((RoundingState) value, null, null, xyk0Var, null, null, null, null, HProv.PP_PASSWD_TERM)));
        RoundingState roundingState = (RoundingState) X();
        u8j0 u8j0Var = roundingState.e;
        z94 z94Var = this.J.a.e0;
        String agreementId = this.C.getAgreementId();
        xyk0 xyk0Var2 = roundingState.c;
        if (xyk0Var2 == null || (str = xyk0Var2.a) == null) {
            str = "";
        }
        Double valueOf = Double.valueOf(xyk0Var.c.getAmount().doubleValue());
        ezk0 ezk0Var2 = (ezk0) u8j0Var.a();
        String str2 = (ezk0Var2 == null || (dzk0Var2 = ezk0Var2.a) == null || (fa4Var = dzk0Var2.b) == null || (ea4Var = fa4Var.b) == null) ? null : ea4Var.a;
        ezk0 ezk0Var3 = (ezk0) u8j0Var.a();
        if (ezk0Var3 != null && (dzk0Var = ezk0Var3.a) != null) {
            roundingStatus = dzk0Var.a;
        }
        RoundingEvents$RoundingSettingsAmountRoundSetStateRounding roundingEvents$RoundingSettingsAmountRoundSetStateRounding = roundingStatus == RoundingStatus.ENABLED ? RoundingEvents$RoundingSettingsAmountRoundSetStateRounding.CHANGE : RoundingEvents$RoundingSettingsAmountRoundSetStateRounding.NEW;
        LinkedHashMap t = x4e.t(5, "agreement_id", agreementId, "type_amount", str);
        t.put("amount_predict", valueOf);
        if (str2 != null) {
            t.put("amount_fact", str2);
        }
        t.put("state_rounding", roundingEvents$RoundingSettingsAmountRoundSetStateRounding.getOriginalValue());
        z94Var.a.a("rounding.settings.amount_round.set", t);
        this.M.g(zy11.a);
    }

    public final void o0() {
        this.J.t(this.C, (RoundingState) X(), true);
        czk0 e0 = e0(this, null, 3);
        if (e0 == null) {
            return;
        }
        u0(e0);
    }

    public final void p0(TwoFactorAuthResult twoFactorAuthResult) {
        r0 r0Var;
        Object value;
        if (twoFactorAuthResult.equals(TwoFactorAuthResult.Cancel.INSTANCE)) {
            this.K = null;
            pz40 Y = Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, RoundingState.a((RoundingState) value, null, null, null, null, null, null, null, HProv.PP_DELETE_SAVED_PASSWD)));
            return;
        }
        if (!(twoFactorAuthResult instanceof TwoFactorAuthResult.Success)) {
            w511.b();
            return;
        }
        u8j0 u8j0Var = ((RoundingState) X()).a;
        if ((u8j0Var != null ? (RoundingStatusEntity) u8j0Var.a() : null) == null) {
            x4c.g("Can't find pending status, to proceed after 2fa", null, null, Collections.singletonList(lrp0.A), 6);
            return;
        }
        czk0 e0 = e0(this, ((TwoFactorAuthResult.Success) twoFactorAuthResult).getVerificationToken(), 2);
        if (e0 == null) {
            return;
        }
        u0(e0);
    }

    public final void q0() {
        this.J.t(this.C, (RoundingState) X(), false);
        this.D.e();
    }

    public final void r0(boolean z) {
        r0 r0Var;
        Object value;
        RoundingState roundingState;
        if (z) {
            this.L = null;
            pz40 Y = Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
                roundingState = (RoundingState) value;
            } while (!r0Var.k(value, RoundingState.a(roundingState, null, null, null, null, null, null, roundingState.f, 55)));
        }
    }

    public final void s0() {
        w0();
    }

    public final void t0(Lifecycle lifecycle) {
        mzk0 mzk0Var = this.L;
        if (mzk0Var != null) {
            Z(mzk0Var);
        }
        ((sv3) this.H).a(lifecycle);
    }

    public final void u0(czk0 czk0Var) {
        r0 r0Var;
        Object value;
        if (czk0Var.b != null) {
            tje.N(ds31.a(this), null, null, new RoundingViewModel$saveSettings$2(this, czk0Var, null), 3);
            return;
        }
        v0(this, new Text.Resource(dzh0.ybsdk_auto_topup_rounding_all_fields_mandatory));
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, RoundingState.a((RoundingState) value, null, null, null, RoundingState.ValidationError.SOURCE_BUTTON_NOT_FILLED, null, null, null, 119)));
    }

    public final void w0() {
        dzk0 dzk0Var;
        ezk0 ezk0Var = (ezk0) ((RoundingState) X()).e.a();
        if (ezk0Var != null) {
            uda0 uda0Var = ezk0Var.e;
            if (uda0Var.a.size() <= 1) {
                return;
            }
            RoundingState roundingState = (RoundingState) X();
            z94 z94Var = this.J.a.e0;
            String agreementId = this.C.getAgreementId();
            ezk0 ezk0Var2 = (ezk0) roundingState.e.a();
            RoundingEvents$RoundingSettingsSourceOpenStateRounding roundingEvents$RoundingSettingsSourceOpenStateRounding = ((ezk0Var2 == null || (dzk0Var = ezk0Var2.a) == null) ? null : dzk0Var.a) == RoundingStatus.ENABLED ? RoundingEvents$RoundingSettingsSourceOpenStateRounding.CHANGE : RoundingEvents$RoundingSettingsSourceOpenStateRounding.NEW;
            LinkedHashMap w = g8e.w(2, "agreement_id", agreementId);
            w.put("state_rounding", roundingEvents$RoundingSettingsSourceOpenStateRounding.getOriginalValue());
            z94Var.a.a("rounding.settings.source.open", w);
            Text.Resource resource = new Text.Resource(dzh0.ybsdk_auto_topup_rounding_ready_button_text);
            h5a0 h5a0Var = ((RoundingState) X()).g;
            String id = h5a0Var != null ? h5a0Var.getId() : null;
            h5a0 h5a0Var2 = ((RoundingState) X()).f;
            mzk0 mzk0Var = new mzk0(resource, odq0.c(this.E, id, h5a0Var2 != null ? h5a0Var2.getId() : null, uda0Var, unr0.h(Text.Companion, dzh0.ybsdk_auto_topup_rounding_choose_card_title), 32));
            this.L = mzk0Var;
            Z(mzk0Var);
        }
    }
}
