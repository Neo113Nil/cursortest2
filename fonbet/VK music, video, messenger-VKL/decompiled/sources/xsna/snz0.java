package xsna;

import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.huawei.hms.support.api.entity.common.CommonConstant;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes.dex */
public final class snz0 {
    public static final pkz0 a;
    public static final com.google.android.gms.common.api.a b;

    static {
        a.g gVar = new a.g();
        new a.g();
        pkz0 pkz0Var = new pkz0();
        a = pkz0Var;
        new ulz0();
        new Scope(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
        new Scope("email");
        b = new com.google.android.gms.common.api.a("SignIn.API", pkz0Var, gVar);
    }
}
