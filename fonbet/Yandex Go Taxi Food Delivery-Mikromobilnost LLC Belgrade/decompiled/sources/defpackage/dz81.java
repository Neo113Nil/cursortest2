package defpackage;

import com.google.android.gms.common.api.Scope;

/* loaded from: classes11.dex */
public abstract class dz81 {
    public static final esw a;
    public static final zm2 b;

    static {
        pm2 pm2Var = new pm2();
        new pm2();
        esw eswVar = new esw(1);
        a = eswVar;
        new esw(3);
        new Scope("profile");
        new Scope("email");
        b = new zm2("SignIn.API", eswVar, pm2Var);
    }
}
