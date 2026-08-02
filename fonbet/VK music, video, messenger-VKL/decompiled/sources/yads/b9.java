package yads;

import android.content.Context;
import com.monetization.ads.quality.base.AdQualityVerifierAdapter;
import com.monetization.ads.quality.base.model.configuration.AdQualityVerifierAdapterConfiguration;
import kotlin.Result;

/* loaded from: classes10.dex */
public final class b9 {
    public final p8 a;
    public final q8 b;
    public final z8 c;

    public b9(p8 p8Var, q8 q8Var, z8 z8Var) {
        this.a = p8Var;
        this.b = q8Var;
        this.c = z8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a9 a(Context context) {
        Object failure;
        Throwable a;
        f8 a2;
        try {
            qu2 a3 = gx2.a().a(context);
            a2 = a3 != null ? a3.a() : null;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (a2 != null && a2.a()) {
            this.b.getClass();
            AdQualityVerifierAdapterConfiguration a4 = q8.a(a2);
            this.a.getClass();
            AdQualityVerifierAdapter a5 = p8.a();
            if (a5 == null) {
                failure = new w7();
            } else {
                this.c.getClass();
                i8 a6 = z8.a(a2);
                failure = new b8(a5, a4, 1 + a4.getVerificationTimeoutInSec(), new y8(a6), new n8(a6));
            }
            a = Result.a(failure);
            if (a != null) {
                a.getMessage();
                failure = new w7();
            }
            return (a9) failure;
        }
        failure = new w7();
        a = Result.a(failure);
        if (a != null) {
        }
        return (a9) failure;
    }
}
