package com.ybsdk.feature.split.deposit.internal.ui.autotopup.status;

import android.net.Uri;
import com.ybsdk.core.utils.poller.PollerTimeoutException;
import com.ybsdk.feature.autotopup.api.domain.model.AutoTopupRequestStatusPollingOption;
import com.ybsdk.feature.autotopup.api.domain.model.PaymentMethodType;
import com.ybsdk.feature.autotopup.internal.domain.c;
import com.ybsdk.feature.autotopup.internal.domain.d;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import com.ybsdk.feature.deeplink.api.DeeplinkHandleResult$DeeplinkType;
import com.ybsdk.feature.divkit.api.domain.LocalVariableName;
import defpackage.b3z;
import defpackage.bqg;
import defpackage.c24;
import defpackage.c5z;
import defpackage.cqg;
import defpackage.d24;
import defpackage.dqg;
import defpackage.ds31;
import defpackage.e24;
import defpackage.f24;
import defpackage.gtt0;
import defpackage.h24;
import defpackage.h791;
import defpackage.itt0;
import defpackage.j3h;
import defpackage.m04;
import defpackage.ny61;
import defpackage.ozl0;
import defpackage.ppr0;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.rst0;
import defpackage.rtt0;
import defpackage.scs0;
import defpackage.sd90;
import defpackage.sst0;
import defpackage.sut0;
import defpackage.te91;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.ttt0;
import defpackage.uc5;
import defpackage.ust0;
import defpackage.uza;
import defpackage.v0h;
import defpackage.vst0;
import defpackage.w511;
import defpackage.yjh;
import defpackage.zst0;
import defpackage.zy11;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public static final String O;
    public final SplitDepositAutoTopupStatusScreenParams B;
    public final tfl0 C;
    public final sut0 D;
    public final d E;
    public final c F;
    public final b3z G;
    public final j3h H;
    public final m04 I;
    public final gtt0 J;
    public final yjh K;
    public final itt0 L;
    public final pzt0 M;
    public final rtt0 N;

    static {
        byte[] bArr = te91.b;
        byte[] bArr2 = new byte[bArr.length];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ te91.a[i % 8]);
        }
        O = new String(bArr2, uza.a);
    }

    public a(SplitDepositAutoTopupStatusScreenParams splitDepositAutoTopupStatusScreenParams, tfl0 tfl0Var, sut0 sut0Var, d dVar, c cVar, b3z b3zVar, j3h j3hVar, m04 m04Var, gtt0 gtt0Var, yjh yjhVar, itt0 itt0Var, zst0 zst0Var) {
        super(new ppr0(28, itt0Var, splitDepositAutoTopupStatusScreenParams), zst0Var);
        this.B = splitDepositAutoTopupStatusScreenParams;
        this.C = tfl0Var;
        this.D = sut0Var;
        this.E = dVar;
        this.F = cVar;
        this.G = b3zVar;
        this.H = j3hVar;
        this.I = m04Var;
        this.J = gtt0Var;
        this.K = yjhVar;
        this.L = itt0Var;
        ttt0 ttt0Var = itt0Var.a.a;
        this.N = ttt0Var != null ? ttt0Var.b : null;
        DeeplinkHandleResult$DeeplinkType deeplinkHandleResult$DeeplinkType = DeeplinkHandleResult$DeeplinkType.SCREEN_OPEN;
        b3zVar.a(new vst0(deeplinkHandleResult$DeeplinkType, this, 0));
        b3zVar.a(new vst0(deeplinkHandleResult$DeeplinkType, this, 1));
        b3zVar.a(new vst0(deeplinkHandleResult$DeeplinkType, this, 2));
        pzt0 pzt0Var = this.M;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.M = tje.N(ds31.a(this), null, null, new SplitDepositAutoTopupStatusViewModel$saveAutoTopup$1(this, null), 3);
    }

    public final void b0() {
        this.C.e();
    }

    public final void c0() {
        k0();
    }

    public final void d0() {
        String str;
        int i = ust0.a[((sst0) X()).a.ordinal()];
        if (i == 1) {
            rst0 rst0Var = ((sst0) X()).b;
            if (rst0Var != null) {
                str = rst0Var.a.d;
            }
            str = null;
        } else if (i == 2) {
            rst0 rst0Var2 = ((sst0) X()).b;
            if (rst0Var2 != null) {
                str = rst0Var2.c.d;
            }
            str = null;
        } else if (i == 3) {
            rst0 rst0Var3 = ((sst0) X()).b;
            if (rst0Var3 != null) {
                str = rst0Var3.d.d;
            }
            str = null;
        } else {
            if (i != 4) {
                w511.b();
                return;
            }
            rst0 rst0Var4 = ((sst0) X()).b;
            if (rst0Var4 != null) {
                str = rst0Var4.b.d;
            }
            str = null;
        }
        if (str == null || this.G.c(str) == null) {
            tfl0.b(this.C, this.K.a(), null, false, 6);
        }
    }

    public final void e0() {
        d0();
    }

    public final void f0() {
        this.I.a.k0.a.a("split_deposit.auto_topup_status.close_button.click", null);
        d0();
    }

    public final void g0() {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, sst0.a((sst0) value, PartnerSelectionSavingState.Fail, null, 30)));
    }

    public final void h0() {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, sst0.a((sst0) value, null, null, 15)));
    }

    public final boolean i0() {
        String str;
        rtt0 rtt0Var = this.N;
        Uri parse = (rtt0Var == null || (str = rtt0Var.d) == null) ? null : Uri.parse(str);
        Uri h = parse != null ? sd90.h(parse, O, this.B.getPaymentMethodId()) : null;
        boolean z = this.G.c(h != null ? h.toString() : null).a instanceof v0h;
        if (!z) {
            k0();
        }
        return z;
    }

    public final void j0(BaseDeeplinkAction baseDeeplinkAction) {
        h791.e(this.H, baseDeeplinkAction.getDeeplinkUri().toString(), false, null, 14);
    }

    public final void k0() {
        ttt0 ttt0Var = this.L.a.a;
        rtt0 rtt0Var = ttt0Var != null ? ttt0Var.b : null;
        String varName = LocalVariableName.AUTO_TOPUP_PAYMENT_METHOD_ID.getVarName();
        SplitDepositAutoTopupStatusScreenParams splitDepositAutoTopupStatusScreenParams = this.B;
        a0(new scs0(this, new c5z(varName, splitDepositAutoTopupStatusScreenParams.getPaymentMethodId()), rtt0Var != null ? new c5z(LocalVariableName.TRUST_ID.getVarName(), rtt0Var.e.a) : null));
        Z(new f24(splitDepositAutoTopupStatusScreenParams.getPaymentMethodId()));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l0(ozl0 ozl0Var, ContinuationImpl continuationImpl) {
        SplitDepositAutoTopupStatusViewModel$startPollingForStatus$1 splitDepositAutoTopupStatusViewModel$startPollingForStatus$1;
        int i;
        Object a;
        Throwable a2;
        r0 r0Var;
        Object value;
        if (continuationImpl instanceof SplitDepositAutoTopupStatusViewModel$startPollingForStatus$1) {
            splitDepositAutoTopupStatusViewModel$startPollingForStatus$1 = (SplitDepositAutoTopupStatusViewModel$startPollingForStatus$1) continuationImpl;
            int i2 = splitDepositAutoTopupStatusViewModel$startPollingForStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                splitDepositAutoTopupStatusViewModel$startPollingForStatus$1.label = i2 - Integer.MIN_VALUE;
                Object obj = splitDepositAutoTopupStatusViewModel$startPollingForStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = splitDepositAutoTopupStatusViewModel$startPollingForStatus$1.label;
                if (i != 0) {
                    b.b(obj);
                    String str = ozl0Var.a;
                    AutoTopupRequestStatusPollingOption autoTopupRequestStatusPollingOption = AutoTopupRequestStatusPollingOption.SHORT;
                    splitDepositAutoTopupStatusViewModel$startPollingForStatus$1.label = 1;
                    a = this.F.a(str, true, autoTopupRequestStatusPollingOption, splitDepositAutoTopupStatusViewModel$startPollingForStatus$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    a = ((Result) obj).getValue();
                }
                if (!(a instanceof Result.Failure)) {
                    dqg dqgVar = (dqg) a;
                    if (dqgVar instanceof cqg) {
                        e24 e24Var = (e24) ((cqg) dqgVar).a;
                        if (e24Var instanceof c24) {
                            g0();
                        } else {
                            if (!(e24Var instanceof d24)) {
                                w511.b();
                                return null;
                            }
                            if (this.B.getPaymentMethodType() != PaymentMethodType.Me2Me) {
                                k0();
                            } else {
                                Z(h24.a);
                            }
                        }
                    } else {
                        if (!(dqgVar instanceof bqg)) {
                            w511.b();
                            return null;
                        }
                        g0();
                    }
                }
                a2 = Result.a(a);
                if (a2 != null) {
                    if (a2 instanceof PollerTimeoutException) {
                        pz40 Y = Y();
                        do {
                            r0Var = (r0) Y;
                            value = r0Var.getValue();
                        } while (!r0Var.k(value, sst0.a((sst0) value, PartnerSelectionSavingState.Timeout, null, 30)));
                    } else {
                        g0();
                    }
                }
                return zy11.a;
            }
        }
        splitDepositAutoTopupStatusViewModel$startPollingForStatus$1 = new SplitDepositAutoTopupStatusViewModel$startPollingForStatus$1(this, continuationImpl);
        Object obj2 = splitDepositAutoTopupStatusViewModel$startPollingForStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = splitDepositAutoTopupStatusViewModel$startPollingForStatus$1.label;
        if (i != 0) {
        }
        if (!(a instanceof Result.Failure)) {
        }
        a2 = Result.a(a);
        if (a2 != null) {
        }
        return zy11.a;
    }
}
