package xsna;

import com.vk.auth.smartflow.api.data.VerificationMethodTypes;
import kotlin.NoWhenBranchMatchedException;
import xsna.yj20;

/* compiled from: VerificationTypeMapper.kt */
/* loaded from: classes3.dex */
public final class snr0 {
    public static final VerificationMethodTypes a(yj20.c cVar) {
        if (cVar instanceof yj20.c.a) {
            return VerificationMethodTypes.CODEGEN;
        }
        if (cVar instanceof yj20.c.b) {
            return VerificationMethodTypes.CALLRESET;
        }
        if (cVar instanceof yj20.c.C4105c) {
            return VerificationMethodTypes.EMAIL;
        }
        if (cVar instanceof yj20.c.g) {
            return VerificationMethodTypes.PASSKEY;
        }
        if (cVar instanceof yj20.c.h) {
            return VerificationMethodTypes.PASSWORD;
        }
        if (cVar instanceof yj20.c.i) {
            return VerificationMethodTypes.PUSH;
        }
        if (cVar instanceof yj20.c.j) {
            return VerificationMethodTypes.RESERVE_CODE;
        }
        if (cVar instanceof yj20.c.k) {
            return VerificationMethodTypes.SMS;
        }
        if (cVar instanceof yj20.c.d) {
            return VerificationMethodTypes.MAX_MESSENGER;
        }
        if (cVar instanceof yj20.c.f) {
            return VerificationMethodTypes.OFFICIAL_MESSENGER;
        }
        if (cVar instanceof yj20.c.e) {
            return VerificationMethodTypes.MAX_OTP_CODE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
