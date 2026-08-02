package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.Editable;
import android.view.View;
import androidx.camera.view.PreviewView;
import androidx.compose.ui.graphics.Path$Direction;
import androidx.compose.ui.unit.LayoutDirection;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.overlay.BottomSheetFlexOverlayController;
import com.yandex.go.blockeduser.BlockedUserModalView;
import com.yandex.go.order.bundle.map.impl.ui.e;
import com.yandex.go.zone.dto.objects.Notification;
import com.yandex.payment.common.result.ResultType;
import com.yandex.payment.sdk.ui.payment.sbp.BindSbpActivity;
import com.yandex.plus.core.data.pay.PlusSelectPaymentMethodState;
import com.yandex.plus.log.api.LogPriority;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.a;
import com.yandex.xplat.common.PollingStep;
import com.yandex.xplat.payment.sdk.BindingServiceError;
import com.yandex.xplat.payment.sdk.CardVerificationError;
import com.yandex.xplat.payment.sdk.ExternalErrorKind;
import com.yandex.xplat.payment.sdk.ExternalErrorTrigger;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.transfer.version2.internal.screens.budget.presentation.input.BudgetChargesUinInputFragment;
import com.ybsdk.widgets.common.LoadableInput;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.g;
import defpackage.qu7;
import defpackage.tje;
import defpackage.uu7;
import defpackage.zy11;
import flex.feature.flexoverlaycontroller.decorviewprovider.DecorViewLifecycle;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.rt.ebs.cryptosdk.presentation.info.biometry.BiometryInfoFragment;
import ru.yandex.taxi.map.overlay.b;
import ru.yandex.taxi.map_common.map.TaxiMapView;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.preorder.summary.selector.verticals.bold.BoldVerticalsView;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes11.dex */
public final /* synthetic */ class kv5 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kv5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x0544, code lost:
    
        if (r12 != false) goto L169;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0562  */
    /* JADX WARN: Type inference failed for: r18v7, types: [T, u92] */
    @Override // defpackage.tls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        String str;
        zy11 onCreate$lambda$1;
        anh anhVar;
        anh anhVar2;
        zy11 initView$lambda$3$lambda$1;
        zy11 description$lambda$0;
        zy11 badgeShownDelegate$lambda$0;
        int i;
        c36 c36Var;
        boolean z;
        ml6 ml6Var;
        jb2 jb2Var;
        k28 k28Var;
        nfh nfhVar;
        float f;
        float f2;
        long v;
        zy11 decorViewLifecycleListener$lambda$0;
        r0 r0Var;
        Object value;
        g render$lambda$8$lambda$7$lambda$6;
        zy11 viewBinding$lambda$5$lambda$2$lambda$1;
        j880 j880Var;
        int i2 = 5;
        int i3 = 20;
        str = "null";
        int i4 = 4;
        boolean z2 = false;
        switch (this.a) {
            case 0:
                pgz pgzVar = ((a) this.b).c;
                PlusSelectPaymentMethodState.NonTerminal nonTerminal = (PlusSelectPaymentMethodState.NonTerminal) obj;
                if (nonTerminal instanceof PlusSelectPaymentMethodState.Started) {
                    LogPriority logPriority = LogPriority.INFO;
                    if (pgzVar.e(logPriority)) {
                        pgzVar.a(logPriority, "BindPaymentMethodInteractor", "PlusSelectPaymentMethodState.Started");
                    }
                } else {
                    if (!(nonTerminal instanceof PlusSelectPaymentMethodState.NonTerminalError)) {
                        w511.b();
                        return null;
                    }
                    LogPriority logPriority2 = LogPriority.WARNING;
                    if (pgzVar.e(logPriority2)) {
                        pgzVar.a(logPriority2, "BindPaymentMethodInteractor", "PlusSelectPaymentMethodState.NonTerminalError - " + ((PlusSelectPaymentMethodState.NonTerminalError) nonTerminal).getKind());
                    }
                }
                return zy11.a;
            case 1:
                onCreate$lambda$1 = BindSbpActivity.onCreate$lambda$1((BindSbpActivity) this.b, (mx60) obj);
                return onCreate$lambda$1;
            case 2:
                y3x y3xVar = (y3x) this.b;
                wj00 b = ((y3x) obj).b();
                q95 q95Var = (q95) mbb1.d(y3xVar, new l75(i2)).d();
                return new uv5(q95Var.a, q95Var.b, q95Var.c, b.p("purchase_token"));
            case 3:
                yeb yebVar = (yeb) this.b;
                cib cibVar = (cib) obj;
                String str2 = cibVar.e;
                String str3 = cibVar.a;
                switch (str3.hashCode()) {
                    case -1867169789:
                        if (str3.equals("success")) {
                            return coa1.i(PollingStep.done);
                        }
                        break;
                    case -1086574198:
                        if (str3.equals(ResultType.RESULT_TYPE_FAILURE)) {
                            return coa1.h(new CardVerificationError(hgb1.a(str2), ExternalErrorTrigger.mobile_backend, null, str3, oyr.p("Card verification failed with rc: ", str2, "}")));
                        }
                        break;
                    case -753541113:
                        if (str3.equals("in_progress")) {
                            return yebVar.a(cibVar);
                        }
                        break;
                    case -465110703:
                        if (str3.equals("3ds_status_received")) {
                            if (!yebVar.d) {
                                yebVar.d = true;
                                yebVar.a.c();
                            }
                            return coa1.i(PollingStep.retry);
                        }
                        break;
                    case 1028554472:
                        if (str3.equals("created")) {
                            return yebVar.a(cibVar);
                        }
                        break;
                    case 1554903868:
                        if (str3.equals("3ds_required")) {
                            return yebVar.a(cibVar);
                        }
                        break;
                }
                ExternalErrorKind a = hgb1.a(str2);
                ExternalErrorTrigger externalErrorTrigger = ExternalErrorTrigger.mobile_backend;
                StringBuilder v2 = b64.v("<VerificationResponse: status - ", str3, ", status code - ", cibVar.b, ", rc - ");
                v2.append(str2);
                v2.append(">");
                return coa1.h(new CardVerificationError(a, externalErrorTrigger, null, str3, "Undefined binding verification status: ".concat(v2.toString())));
            case 4:
                wvb1 wvb1Var = (wvb1) this.b;
                zeb zebVar = (zeb) obj;
                String str4 = zebVar.k;
                String str5 = zebVar.j;
                String str6 = zebVar.a;
                if (str6.equals("success")) {
                    return coa1.i(PollingStep.done);
                }
                if (!str6.equals("wait_for_notification")) {
                    ExternalErrorKind c = tia1.c(zebVar);
                    ExternalErrorTrigger externalErrorTrigger2 = ExternalErrorTrigger.diehard;
                    String str7 = zebVar.c;
                    return coa1.h(new BindingServiceError(c, externalErrorTrigger2, null, str6, "Undefined binding payment status: ".concat(unr0.p("<DiehardResponse: status - ", str6, ", desc - ", str7 != null ? str7 : "null", ">"))));
                }
                if (str5 != null && str4 != null) {
                    try {
                        if (!wvb1Var.a) {
                            wvb1Var.a = true;
                            try {
                                anhVar = new anh(Uri.parse(new URI(str5).toString()));
                            } catch (Throwable unused) {
                                anhVar = null;
                            }
                            if (anhVar == null) {
                                ExternalErrorKind externalErrorKind = ExternalErrorKind.fail_3ds;
                                ExternalErrorTrigger externalErrorTrigger3 = ExternalErrorTrigger.diehard;
                                String str8 = zebVar.a;
                                String str9 = zebVar.c;
                                if (str9 != null) {
                                    str = str9;
                                }
                                return coa1.h(new BindingServiceError(externalErrorKind, externalErrorTrigger3, null, str8, b64.l("Invalid url \"", str5, "\" for property \"payment_form_url\" in response: ", unr0.p("<DiehardResponse: status - ", str8, ", desc - ", str, ">"))));
                            }
                            n891.n(new sb0(7, ((mu5) wvb1Var.b).a, anhVar, str4));
                        }
                    } catch (RuntimeException e) {
                        return coa1.h(f7b1.b(zebVar, e));
                    }
                }
                return coa1.i(PollingStep.retry);
            case 5:
                yeb yebVar2 = (yeb) this.b;
                zeb zebVar2 = (zeb) obj;
                hh5 hh5Var = yebVar2.a;
                rwo rwoVar = yebVar2.b;
                String str10 = zebVar2.d;
                String str11 = zebVar2.a;
                if (str11.equals("success")) {
                    return coa1.i(PollingStep.done);
                }
                if (!str11.equals("wait_for_notification")) {
                    ExternalErrorKind c2 = tia1.c(zebVar2);
                    ExternalErrorTrigger externalErrorTrigger4 = ExternalErrorTrigger.diehard;
                    String str12 = zebVar2.c;
                    return coa1.h(new BindingServiceError(c2, externalErrorTrigger4, null, str11, "Undefined binding payment status: ".concat(unr0.p("<DiehardResponse: status - ", str11, ", desc - ", str12 != null ? str12 : "null", ">"))));
                }
                try {
                    String str13 = zebVar2.g;
                    if (str13 != null && !yebVar2.c) {
                        yebVar2.c = true;
                        try {
                            anhVar2 = new anh(Uri.parse(new URI(str13).toString()));
                        } catch (Throwable unused2) {
                            anhVar2 = null;
                        }
                        if (anhVar2 == null) {
                            return coa1.h(f7b1.c(zebVar2));
                        }
                        qv90.a.getClass();
                        ((y22) rwoVar).a(sv90.k());
                        hh5Var.s(anhVar2);
                    }
                    if (!yebVar2.d && (jl40.l(str10, "success") || jl40.l(str10, "failed"))) {
                        yebVar2.d = true;
                        qv90.a.getClass();
                        ((y22) rwoVar).a(sv90.Z(str10));
                        hh5Var.c();
                    }
                    return coa1.i(PollingStep.retry);
                } catch (RuntimeException e2) {
                    return coa1.h(f7b1.b(zebVar2, e2));
                }
            case 6:
                return new sb8(((ny21) this.b).b, null);
            case 7:
                bx5 bx5Var = (bx5) this.b;
                sc8 sc8Var = (sc8) obj;
                m560 m560Var = new m560(bx5Var.a.b, bx5Var.h == null ? Integer.valueOf(bx5Var.j) : null, bx5Var.b.b, sc8Var.b, sc8Var.a);
                rwo rwoVar2 = bx5Var.l;
                iho f3 = vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Запрос на привязку: запрос в DieHard на получение cardID", "bind_new_card_binding");
                nhj nhjVar = bx5Var.g;
                md51 a2 = hg91.a("new_card_binding", nhjVar.b, new bmh(22, nhjVar, m560Var));
                ((y22) rwoVar2).b(f3, a2);
                return a2;
            case 8:
                f931 f931Var = (f931) this.b;
                String str14 = (String) obj;
                if (jl40.l(f931Var, d931.a)) {
                    return hia1.b(str14 + "_declined");
                }
                if (f931Var instanceof e931) {
                    return b64.j(((e931) f931Var).a, "_confirmed");
                }
                w511.b();
                return null;
            case 9:
                com.yandex.go.superapp.biometrics.data.a aVar = (com.yandex.go.superapp.biometrics.data.a) this.b;
                int i5 = aVar.e;
                aVar.e = i5 + 1;
                return String.valueOf(i5);
            case 10:
                initView$lambda$3$lambda$1 = BiometryInfoFragment.initView$lambda$3$lambda$1((BiometryInfoFragment) this.b, (View) obj);
                return initView$lambda$3$lambda$1;
            case 11:
                description$lambda$0 = BlockedUserModalView.setDescription$lambda$0((BlockedUserModalView) this.b, (String) obj);
                return description$lambda$0;
            case 12:
                a46 a46Var = (a46) this.b;
                if (!(((Result) obj).getValue() instanceof Result.Failure)) {
                    a46Var.r(new ar5(i3));
                }
                return zy11.a;
            case 13:
                ((b) this.b).z.l(((TaxiMapView) obj).getMapWindow().getMap().addMapObjectLayer("blocked_zones"));
                return zy11.a;
            case 14:
                badgeShownDelegate$lambda$0 = BoldVerticalsView.badgeShownDelegate$lambda$0((BoldVerticalsView) this.b, (String) obj);
                return badgeShownDelegate$lambda$0;
            case 15:
                ta6 ta6Var = (ta6) this.b;
                androidx.compose.ui.draw.b bVar = (androidx.compose.ui.draw.b) obj;
                if (bVar.getDensity() * ta6Var.w < 0.0f || cjs0.c(bVar.a.c()) <= 0.0f) {
                    return bVar.b(new ar5(21));
                }
                final float min = Math.min(y7m.b(ta6Var.w, 0.0f) ? 1.0f : (float) Math.ceil(bVar.getDensity() * ta6Var.w), (float) Math.ceil(cjs0.c(bVar.a.c()) / 2.0f));
                final float f4 = min / 2.0f;
                final long floatToRawIntBits = (Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f4) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                final long floatToRawIntBits2 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (bVar.a.c() >> 32)) - min) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (bVar.a.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - min) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                float f5 = min * 2.0f;
                boolean z3 = f5 > cjs0.c(bVar.a.c());
                ix80 a3 = ta6Var.y.a(bVar.a.c(), bVar.a.getLayoutDirection(), bVar);
                if (!(a3 instanceof fx80)) {
                    if (!(a3 instanceof hx80)) {
                        boolean z4 = z3;
                        if (!(a3 instanceof gx80)) {
                            w511.b();
                            return null;
                        }
                        ml6 ml6Var2 = ta6Var.x;
                        if (z4) {
                            floatToRawIntBits = 0;
                        }
                        long j = floatToRawIntBits;
                        if (z4) {
                            floatToRawIntBits2 = bVar.a.c();
                        }
                        return bVar.b(new pa6(ml6Var2, j, floatToRawIntBits2, z4 ? i3r.a : new jvu0(0, 0, 30, min, 0.0f), 0));
                    }
                    final ml6 ml6Var3 = ta6Var.x;
                    sxk0 sxk0Var = ((hx80) a3).a;
                    if (ora1.d(sxk0Var)) {
                        final long j2 = sxk0Var.e;
                        final jvu0 jvu0Var = new jvu0(0, 0, 30, min, 0.0f);
                        final boolean z5 = z3;
                        return bVar.b(new tls() { // from class: ra6
                            @Override // defpackage.tls
                            public final Object invoke(Object obj2) {
                                long j3;
                                c1y c1yVar = (c1y) obj2;
                                c1yVar.a();
                                k28 k28Var2 = c1yVar.a;
                                boolean z6 = z5;
                                ml6 ml6Var4 = ml6Var3;
                                long j4 = j2;
                                if (z6) {
                                    qam.j0(c1yVar, ml6Var4, 0L, 0L, j4, null, 246);
                                } else {
                                    float intBitsToFloat = Float.intBitsToFloat((int) (j4 >> 32));
                                    float f6 = f4;
                                    if (intBitsToFloat < f6) {
                                        float intBitsToFloat2 = Float.intBitsToFloat((int) (k28Var2.c() >> 32));
                                        float f7 = min;
                                        float f8 = intBitsToFloat2 - f7;
                                        float intBitsToFloat3 = Float.intBitsToFloat((int) (k28Var2.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - f7;
                                        nfh nfhVar2 = k28Var2.b;
                                        long v3 = nfhVar2.v();
                                        nfhVar2.q().save();
                                        try {
                                            ((cot) nfhVar2.a).f(f7, f7, f8, intBitsToFloat3, 0);
                                            j3 = v3;
                                            try {
                                                qam.j0(c1yVar, ml6Var4, 0L, 0L, j4, null, 246);
                                                b64.C(nfhVar2, j3);
                                            } catch (Throwable th) {
                                                th = th;
                                                b64.C(nfhVar2, j3);
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            j3 = v3;
                                        }
                                    } else {
                                        qam.j0(c1yVar, ml6Var4, floatToRawIntBits, floatToRawIntBits2, aab1.f(f6, j4), jvu0Var, 208);
                                    }
                                }
                                return zy11.a;
                            }
                        });
                    }
                    boolean z6 = z3;
                    if (ta6Var.c == null) {
                        ta6Var.c = new na6(0);
                    }
                    na6 na6Var = ta6Var.c;
                    jb2 jb2Var2 = na6Var.d;
                    jb2 jb2Var3 = jb2Var2;
                    if (jb2Var2 == null) {
                        jb2 a4 = nb2.a();
                        na6Var.d = a4;
                        jb2Var3 = a4;
                    }
                    jb2Var3.o();
                    jb2Var3.f(sxk0Var, Path$Direction.CounterClockwise);
                    if (!z6) {
                        rq90 a5 = nb2.a();
                        ((jb2) a5).f(new sxk0(min, min, sxk0Var.h() - min, sxk0Var.c() - min, aab1.f(min, sxk0Var.e), aab1.f(min, sxk0Var.f), aab1.f(min, sxk0Var.g), aab1.f(min, sxk0Var.h)), Path$Direction.CounterClockwise);
                        jb2Var3.n(jb2Var3, a5, 0);
                    }
                    return bVar.b(new w04(16, jb2Var3, ml6Var3));
                }
                ml6 ml6Var4 = ta6Var.x;
                fx80 fx80Var = (fx80) a3;
                rq90 rq90Var = fx80Var.a;
                if (z3) {
                    return bVar.b(new w04(17, fx80Var, ml6Var4));
                }
                if (ml6Var4 instanceof a6t0) {
                    c36Var = new c36(ldc.b(((a6t0) ml6Var4).a, 1.0f, 0.0f, 0.0f, 0.0f, 14), 5);
                    i = 1;
                } else {
                    i = 0;
                    c36Var = null;
                }
                zii0 i6 = ((jb2) rq90Var).i();
                float f6 = i6.b;
                float f7 = i6.a;
                if (ta6Var.c == null) {
                    ta6Var.c = new na6(0);
                }
                na6 na6Var2 = ta6Var.c;
                jb2 jb2Var4 = na6Var2.d;
                jb2 jb2Var5 = jb2Var4;
                if (jb2Var4 == null) {
                    jb2 a6 = nb2.a();
                    na6Var2.d = a6;
                    jb2Var5 = a6;
                }
                jb2Var5.o();
                jb2Var5.e(i6, Path$Direction.CounterClockwise);
                jb2Var5.n(jb2Var5, rq90Var, 0);
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                long ceil = (((int) Math.ceil(i6.c - f7)) << 32) | (((int) Math.ceil(i6.d - f6)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                na6 na6Var3 = ta6Var.c;
                u92 u92Var = na6Var3.a;
                s72 s72Var = na6Var3.b;
                m8v m8vVar = u92Var != null ? new m8v(u92Var.a()) : null;
                try {
                    try {
                        if (m8vVar == null || m8vVar.a != 0) {
                            m8v m8vVar2 = u92Var != null ? new m8v(u92Var.a()) : null;
                            if (m8vVar2 == null || i != m8vVar2.a) {
                                z = false;
                                if (u92Var != null || s72Var == null) {
                                    ml6Var = ml6Var4;
                                    jb2Var = jb2Var5;
                                } else {
                                    ml6Var = ml6Var4;
                                    jb2Var = jb2Var5;
                                    float intBitsToFloat = Float.intBitsToFloat((int) (bVar.a.c() >> 32));
                                    Bitmap bitmap = u92Var.a;
                                    if (intBitsToFloat <= bitmap.getWidth()) {
                                        if (Float.intBitsToFloat((int) (bVar.a.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) <= bitmap.getHeight()) {
                                        }
                                    }
                                }
                                u92Var = f4b1.b((int) (ceil >> 32), (int) (ceil & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), i, 24);
                                na6Var3.a = u92Var;
                                s72Var = peb1.a(u92Var);
                                na6Var3.b = s72Var;
                                k28Var = na6Var3.c;
                                if (k28Var == null) {
                                    k28Var = new k28();
                                    na6Var3.c = k28Var;
                                }
                                nfhVar = k28Var.b;
                                j28 j28Var = k28Var.a;
                                long a0 = rzo.a0(ceil);
                                LayoutDirection layoutDirection = bVar.a.getLayoutDirection();
                                fwi fwiVar = j28Var.a;
                                k28 k28Var2 = k28Var;
                                LayoutDirection layoutDirection2 = j28Var.b;
                                jb2 jb2Var6 = jb2Var;
                                i28 i28Var = j28Var.c;
                                long j3 = j28Var.d;
                                j28Var.a = bVar;
                                j28Var.b = layoutDirection;
                                j28Var.c = s72Var;
                                j28Var.d = a0;
                                s72Var.save();
                                qam.t0(k28Var2, ldc.b, 0L, a0, 0.0f, null, 58);
                                f = -f7;
                                f2 = -f6;
                                ((cot) nfhVar.a).n(f, f2);
                                qam.p(k28Var2, fx80Var.a, ml6Var, 0.0f, new jvu0(0, 0, 30, f5, 0.0f), 52);
                                float intBitsToFloat2 = (Float.intBitsToFloat((int) (k28Var2.c() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (k28Var2.c() >> 32));
                                float intBitsToFloat3 = (Float.intBitsToFloat((int) (k28Var2.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + 1.0f) / Float.intBitsToFloat((int) (k28Var2.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                                long P = k28Var2.P();
                                ?? r18 = u92Var;
                                s72 s72Var2 = s72Var;
                                v = nfhVar.v();
                                nfhVar.q().save();
                                ((cot) nfhVar.a).m(intBitsToFloat2, intBitsToFloat3, P);
                                qam.p(k28Var2, jb2Var6, ml6Var, 0.0f, null, 28);
                                ((cot) nfhVar.a).n(-f, -f2);
                                s72Var2.n();
                                j28Var.a = fwiVar;
                                j28Var.b = layoutDirection2;
                                j28Var.c = i28Var;
                                j28Var.d = j3;
                                r18.a.prepareToDraw();
                                ref$ObjectRef.element = r18;
                                return bVar.b(new sa6(i6, ref$ObjectRef, ceil, c36Var, 0));
                            }
                        }
                        ((cot) nfhVar.a).m(intBitsToFloat2, intBitsToFloat3, P);
                        qam.p(k28Var2, jb2Var6, ml6Var, 0.0f, null, 28);
                        ((cot) nfhVar.a).n(-f, -f2);
                        s72Var2.n();
                        j28Var.a = fwiVar;
                        j28Var.b = layoutDirection2;
                        j28Var.c = i28Var;
                        j28Var.d = j3;
                        r18.a.prepareToDraw();
                        ref$ObjectRef.element = r18;
                        return bVar.b(new sa6(i6, ref$ObjectRef, ceil, c36Var, 0));
                    } finally {
                        nfhVar.q().n();
                        nfhVar.E(v);
                    }
                    qam.p(k28Var2, fx80Var.a, ml6Var, 0.0f, new jvu0(0, 0, 30, f5, 0.0f), 52);
                    float intBitsToFloat22 = (Float.intBitsToFloat((int) (k28Var2.c() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (k28Var2.c() >> 32));
                    float intBitsToFloat32 = (Float.intBitsToFloat((int) (k28Var2.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + 1.0f) / Float.intBitsToFloat((int) (k28Var2.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                    long P2 = k28Var2.P();
                    ?? r182 = u92Var;
                    s72 s72Var22 = s72Var;
                    v = nfhVar.v();
                    nfhVar.q().save();
                } catch (Throwable th) {
                    ((cot) nfhVar.a).n(-f, -f2);
                    throw th;
                }
                z = true;
                if (u92Var != null) {
                }
                ml6Var = ml6Var4;
                jb2Var = jb2Var5;
                u92Var = f4b1.b((int) (ceil >> 32), (int) (ceil & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), i, 24);
                na6Var3.a = u92Var;
                s72Var = peb1.a(u92Var);
                na6Var3.b = s72Var;
                k28Var = na6Var3.c;
                if (k28Var == null) {
                }
                nfhVar = k28Var.b;
                j28 j28Var2 = k28Var.a;
                long a02 = rzo.a0(ceil);
                LayoutDirection layoutDirection3 = bVar.a.getLayoutDirection();
                fwi fwiVar2 = j28Var2.a;
                k28 k28Var22 = k28Var;
                LayoutDirection layoutDirection22 = j28Var2.b;
                jb2 jb2Var62 = jb2Var;
                i28 i28Var2 = j28Var2.c;
                long j32 = j28Var2.d;
                j28Var2.a = bVar;
                j28Var2.b = layoutDirection3;
                j28Var2.c = s72Var;
                j28Var2.d = a02;
                s72Var.save();
                qam.t0(k28Var22, ldc.b, 0L, a02, 0.0f, null, 58);
                f = -f7;
                f2 = -f6;
                ((cot) nfhVar.a).n(f, f2);
                break;
            case 16:
                decorViewLifecycleListener$lambda$0 = BottomSheetFlexOverlayController.decorViewLifecycleListener$lambda$0((BottomSheetFlexOverlayController) this.b, (DecorViewLifecycle) obj);
                return decorViewLifecycleListener$lambda$0;
            case 17:
                ((ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.bubble_toggle.b) this.b).b.a((b151) obj);
                return zy11.a;
            case 18:
                lur0 lur0Var = (lur0) obj;
                pz40 Y = ((com.ybsdk.feature.transfer.version2.internal.screens.budget.presentation.requisites.a) this.b).Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, uo6.b((uo6) value, null, null, lur0Var, 11)));
                return zy11.a;
            case 19:
                render$lambda$8$lambda$7$lambda$6 = BudgetChargesUinInputFragment.render$lambda$8$lambda$7$lambda$6((lp6) this.b, (g) obj);
                return render$lambda$8$lambda$7$lambda$6;
            case 20:
                viewBinding$lambda$5$lambda$2$lambda$1 = BudgetChargesUinInputFragment.getViewBinding$lambda$5$lambda$2$lambda$1((BudgetChargesUinInputFragment) this.b, (Editable) obj);
                return viewBinding$lambda$5$lambda$2$lambda$1;
            case 21:
                mp6 mp6Var = (mp6) this.b;
                kp6 kp6Var = (kp6) obj;
                vp6 vp6Var = kp6Var.a;
                String str15 = vp6Var.d.b;
                boolean z7 = kp6Var.c;
                if (z7) {
                    str15 = null;
                }
                String str16 = z7 ? vp6Var.b : str15;
                g gVar = new g(kp6Var.b, eyy.b, LoadableInput.LoadingState.DEFAULT, g8e.i(Text.Companion, vp6Var.c), null, str16 != null ? rtu.a(new jiu(6), str16) : null, !z7, str15 != null ? new Text.Constant(str15) : null, null, null, false, vng.t(nyg0.ybsdk_background_loadable_input_edit_text, mp6Var.a), null, 16635392);
                YbButtonView.a aVar2 = new YbButtonView.a(vp6Var.e.getText(), null, null, null, null, null, null, false, false, null, 4094);
                sp6 sp6Var = vp6Var.a;
                Text.Constant constant = new Text.Constant(sp6Var.a);
                rp6 rp6Var = sp6Var.b;
                rbv f8 = job1.f(rp6Var.b, new wk6(i4));
                return new lp6(gVar, aVar2, new stz0(constant, null, null, null, null, f8 != null ? new ptz0(f8) : qtz0.a, false, null, null, null, null, new Text.Constant(rp6Var.c), 24542));
            case 22:
                return new mt6((yss0) ((View) obj), (ur70) this.b);
            case 23:
                String str17 = (String) obj;
                Iterator it = ((e) this.b).h.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (jl40.l(((w201) next).getId(), str17)) {
                            r14 = next;
                        }
                    }
                }
                return (w201) r14;
            case 24:
                uv6 uv6Var = (uv6) this.b;
                yfd yfdVar = (yfd) obj;
                ((agd) yfdVar).e = new w04(i3, uv6Var, new pm5(9, uv6Var));
                r3d.a.getClass();
                ((agd) yfdVar).g = r3d.b;
                return zy11.a;
            case 25:
                com.yandex.messaging.ui.calls.feedback.a aVar3 = (com.yandex.messaging.ui.calls.feedback.a) this.b;
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                aVar3.M = num;
                ArrayList arrayList = aVar3.F;
                ArrayList arrayList2 = aVar3.G;
                tje.e();
                aVar3.B.setVisibility(0);
                aVar3.E.setVisibility(0);
                aVar3.D.setVisibility(0);
                aVar3.C.setVisibility(8);
                euq euqVar = aVar3.w;
                boolean z8 = (kotlin.collections.a.N0(euqVar.y).isEmpty() || kotlin.collections.a.N0(euqVar.z).isEmpty()) ? false : true;
                if (intValue >= 4 || !z8) {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((View) it2.next()).setVisibility(0);
                    }
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        ((View) it3.next()).setVisibility(8);
                    }
                } else {
                    Iterator it4 = arrayList2.iterator();
                    while (it4.hasNext()) {
                        ((View) it4.next()).setVisibility(8);
                    }
                    Iterator it5 = arrayList.iterator();
                    while (it5.hasNext()) {
                        ((View) it5.next()).setVisibility(0);
                    }
                }
                return zy11.a;
            case 26:
                return Boolean.valueOf(((zis0) obj).compareTo((zis0) this.b) >= 0);
            case 27:
                ((dr7) this.b).r(new cr7(z2 ? 1 : 0, (Uri) obj));
                return zy11.a;
            case 28:
                return (PreviewView) this.b;
            default:
                final qu7 qu7Var = (qu7) this.b;
                final yfd yfdVar2 = (yfd) obj;
                c06 c06Var = qu7Var.H;
                pu7 pu7Var = (pu7) ((agd) yfdVar2).a;
                k880 k880Var = (k880) c06Var.a;
                o2y0 o2y0Var = pu7Var.a;
                k880Var.getClass();
                if (o2y0Var.b().h.b == DriveState.EXPIRED) {
                    xh60 b2 = o2y0Var.b().V().P.b("order_status_alert");
                    if (b2 == null) {
                        j880Var = k880Var.a(o2y0Var);
                    } else {
                        Map map = ((Notification) b2.b).d;
                        String str18 = (String) map.get("title");
                        String str19 = (String) map.get("text");
                        String str20 = (String) map.get("change_params_button_text");
                        if (str18 == null || evu0.J(str18) || str20 == null || evu0.J(str20)) {
                            a3y0.d((a3y0) k880Var.b.getValue(), "getExpiredNotification", new IllegalStateException("inconsistent dialog text data: " + map), null, 4);
                            j880Var = k880Var.a(o2y0Var);
                        } else {
                            j880Var = new j880(str18, str19, str20);
                        }
                    }
                } else {
                    avj0 avj0Var = (avj0) k880Var.a;
                    j880Var = new j880(avj0Var.h(kyh0.taxicanceled_title), avj0Var.h(kyh0.taxiexpired_subtitle), avj0Var.h(kyh0.taxiexpired_search_in_other_tariff));
                }
                String str21 = j880Var.a;
                String str22 = pu7Var.a.b().V().U;
                Pair pair = str22 != null ? new Pair(str22, str21) : new Pair(str21, null);
                String str23 = (String) pair.getFirst();
                String str24 = (String) pair.getSecond();
                if (str23 == null) {
                    str23 = "";
                }
                String h = ((avj0) ((zuj0) c06Var.b)).h(kyh0.common_retry);
                String str25 = j880Var.c;
                g92 g92Var = new g92(2, new vu7(str23, str24, h, str25 != null ? str25 : ""));
                agd agdVar = (agd) yfdVar2;
                agdVar.c = g92Var;
                agdVar.e = new tls() { // from class: com.yandex.go.taxi.order.cancel.by_driver.navigation.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj2) {
                        qu7 qu7Var2 = qu7.this;
                        tje.N(qu7Var2.o(), null, null, new CancelByDriverModalRouter$content$1$1$1(qu7Var2, (uu7) obj2, yfdVar2, null), 3);
                        return zy11.a;
                    }
                };
                agdVar.f = new ne4(new sls() { // from class: com.yandex.go.taxi.order.cancel.by_driver.navigation.b
                    @Override // defpackage.sls
                    public final Object invoke() {
                        qu7 qu7Var2 = qu7.this;
                        tje.N(qu7Var2.o(), null, null, new CancelByDriverModalRouter$content$1$2$1(qu7Var2, yfdVar2, null), 3);
                        return zy11.a;
                    }
                });
                y3d.a.getClass();
                agdVar.g = y3d.b;
                return zy11.a;
        }
    }
}
