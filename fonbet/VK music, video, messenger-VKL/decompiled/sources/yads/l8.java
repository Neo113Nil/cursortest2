package yads;

import com.monetization.ads.quality.base.result.AdQualityVerificationResult;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes10.dex */
public final class l8 {
    public static String a(AdQualityVerificationResult adQualityVerificationResult) {
        if (adQualityVerificationResult instanceof AdQualityVerificationResult.WaitingForVerification) {
            return "Verification not started";
        }
        if (adQualityVerificationResult instanceof AdQualityVerificationResult.NotVerified) {
            ((AdQualityVerificationResult.NotVerified) adQualityVerificationResult).getReason();
            throw null;
        }
        if (!(adQualityVerificationResult instanceof AdQualityVerificationResult.Verified)) {
            throw new NoWhenBranchMatchedException();
        }
        ((AdQualityVerificationResult.Verified) adQualityVerificationResult).getVerifiedAd();
        throw null;
    }
}
