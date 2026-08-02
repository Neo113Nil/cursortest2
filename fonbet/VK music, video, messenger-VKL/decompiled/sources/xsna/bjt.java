package xsna;

import com.ironsource.O6;
import com.vk.api.generated.ecosystem.dto.EcosystemCheckOtpVerificationMethodDto;

/* compiled from: GeneratedSuperappApi.kt */
/* loaded from: classes6.dex */
public final class bjt implements vfn0 {
    @Override // xsna.vfn0
    public final io.reactivex.rxjava3.internal.operators.observable.i2 a(String str, String str2, String str3) {
        ufx ufxVar = new ufx("ecosystem.getMaxSessionStatus", new fq(12), new gq(14));
        ufx.n(ufxVar, O6.e1, str, 0, 12);
        ufx.n(ufxVar, "max_messenger_hash", str3, 0, 12);
        ufx.n(ufxVar, "device_id", str2, 0, 12);
        bx2 e = e370.e(ufxVar);
        e370.a(e);
        return rdx0.p(e);
    }

    @Override // xsna.vfn0
    public final io.reactivex.rxjava3.internal.operators.observable.i2 b(String str, String str2) {
        ufx ufxVar = new ufx("ecosystem.checkPhoneReuse", new hq(13), new iq(11));
        ufx.n(ufxVar, "login", str, 0, 12);
        if (str2 != null) {
            ufx.n(ufxVar, "super_app_token", str2, 0, 12);
        }
        bx2 e = e370.e(ufxVar);
        e370.a(e);
        return rdx0.p(e);
    }

    @Override // xsna.vfn0
    public final io.reactivex.rxjava3.internal.operators.observable.i2 c(String str, String str2) {
        ufx ufxVar = new ufx("ecosystem.sendOtpOfficialMessenger", new eq(12), new com.vk.movika.sdk.base.model.history.b(12));
        ufx.n(ufxVar, O6.e1, str, 0, 12);
        ufx.n(ufxVar, "device_id", str2, 0, 12);
        bx2 e = e370.e(ufxVar);
        e370.a(e);
        return rdx0.p(e);
    }

    @Override // xsna.vfn0
    public final io.reactivex.rxjava3.internal.operators.observable.i2 d(String str, String str2) {
        ufx ufxVar = new ufx("ecosystem.getVerificationMethods", new ct(10), new dt(11));
        ufx.n(ufxVar, O6.e1, str, 0, 12);
        ufx.n(ufxVar, "device_id", str2, 0, 12);
        bx2 e = e370.e(ufxVar);
        e370.a(e);
        return rdx0.p(e);
    }

    @Override // xsna.vfn0
    public final io.reactivex.rxjava3.internal.operators.observable.i2 e(String str, String str2) {
        ufx ufxVar = new ufx("ecosystem.sendOtpEmail", new et(14), new gp(15));
        ufx.n(ufxVar, O6.e1, str, 0, 12);
        ufx.n(ufxVar, "device_id", str2, 0, 12);
        bx2 e = e370.e(ufxVar);
        e370.a(e);
        return rdx0.p(e);
    }

    @Override // xsna.vfn0
    public final io.reactivex.rxjava3.internal.operators.observable.i2 f(String str, String str2) {
        ufx ufxVar = new ufx("ecosystem.sendOtpSms", new dq(13), new com.vk.movika.sdk.base.model.n(10));
        ufx.n(ufxVar, O6.e1, str, 0, 12);
        ufx.n(ufxVar, "device_id", str2, 0, 12);
        bx2 e = e370.e(ufxVar);
        e370.a(e);
        return rdx0.p(e);
    }

    @Override // xsna.vfn0
    public final io.reactivex.rxjava3.internal.operators.observable.i2 g(String str, String str2) {
        ufx ufxVar = new ufx("ecosystem.sendOtpMaxCode", new wp(12), new cq(13));
        ufx.n(ufxVar, O6.e1, str, 0, 12);
        ufx.n(ufxVar, "device_id", str2, 0, 12);
        bx2 e = e370.e(ufxVar);
        e370.a(e);
        return rdx0.p(e);
    }

    @Override // xsna.vfn0
    public final io.reactivex.rxjava3.internal.operators.observable.i2 h(String str, String str2) {
        ufx ufxVar = new ufx("ecosystem.sendOtpCallReset", new pm0(15), new tf3(12));
        ufx.n(ufxVar, O6.e1, str, 0, 12);
        ufx.n(ufxVar, "device_id", str2, 0, 12);
        bx2 e = e370.e(ufxVar);
        e370.a(e);
        return rdx0.p(e);
    }

    @Override // xsna.vfn0
    public final io.reactivex.rxjava3.internal.operators.observable.i2 i(String str, String str2) {
        ufx ufxVar = new ufx("ecosystem.sendOtpMax", new eq0(11), new k73(13));
        ufx.n(ufxVar, O6.e1, str, 0, 12);
        ufx.n(ufxVar, "device_id", str2, 0, 12);
        bx2 e = e370.e(ufxVar);
        e370.a(e);
        return rdx0.p(e);
    }

    @Override // xsna.vfn0
    public final io.reactivex.rxjava3.internal.operators.observable.i2 j(String str, String str2, String str3, EcosystemCheckOtpVerificationMethodDto ecosystemCheckOtpVerificationMethodDto) {
        ufx ufxVar = new ufx("ecosystem.checkOtp", new lq(15), new mq(17));
        ufx.n(ufxVar, O6.e1, str, 0, 12);
        ufx.n(ufxVar, "code", str2, 0, 12);
        ufx.n(ufxVar, "device_id", str3, 0, 12);
        if (ecosystemCheckOtpVerificationMethodDto != null) {
            ufx.n(ufxVar, "verification_method", ecosystemCheckOtpVerificationMethodDto.i(), 0, 12);
        }
        bx2 e = e370.e(ufxVar);
        e370.a(e);
        return rdx0.p(e);
    }

    @Override // xsna.vfn0
    public final io.reactivex.rxjava3.internal.operators.observable.i2 k(String str, String str2) {
        ufx ufxVar = new ufx("ecosystem.sendOtpPush", new uf3(9), new up(13));
        ufx.n(ufxVar, O6.e1, str, 0, 12);
        ufx.n(ufxVar, "device_id", str2, 0, 12);
        bx2 e = e370.e(ufxVar);
        e370.a(e);
        return rdx0.p(e);
    }

    @Override // xsna.vfn0
    public final io.reactivex.rxjava3.internal.operators.observable.i2 l(String str) {
        String e = dgn0.e();
        ufx ufxVar = new ufx("ecosystem.getValidationStatus", new bt(12), new vp(16));
        ufx.n(ufxVar, O6.e1, str, 0, 12);
        if (e != null) {
            ufx.n(ufxVar, "device_id", e, 0, 12);
        }
        bx2 e2 = e370.e(ufxVar);
        e370.a(e2);
        return rdx0.p(e2);
    }
}
