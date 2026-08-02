package yads;

import com.monetization.ads.quality.base.AdQualityVerifierAdapter;
import kotlin.Result;

/* loaded from: classes10.dex */
public final class p8 {
    public static AdQualityVerifierAdapter a() {
        Object failure;
        try {
            Object a = pn2.a("com.yandex.mobile.ads.quality.AdQualityVerifierAdapter", new Object[0]);
            failure = a instanceof AdQualityVerifierAdapter ? (AdQualityVerifierAdapter) a : null;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a2 = Result.a(failure);
        if (a2 != null) {
            a2.getMessage();
        }
        return (AdQualityVerifierAdapter) (failure instanceof Result.Failure ? null : failure);
    }
}
