package xsna;

import android.content.Context;

/* loaded from: classes12.dex */
public class awv implements ray0 {
    public bwy0 a;
    public xfy0 b;

    public awv(lnv lnvVar, may0 may0Var) {
        vay0.c.b = lnvVar;
        ofy0.d.c = may0Var;
    }

    public void authenticate() {
        uiy0.a.execute(new way0(this, 0));
    }

    public void destroy() {
        this.b = null;
        this.a.destroy();
    }

    public String getOdt() {
        xfy0 xfy0Var = this.b;
        return xfy0Var != null ? xfy0Var.a : "";
    }

    public boolean isAuthenticated() {
        return this.a.h();
    }

    public boolean isConnected() {
        return this.a.a();
    }

    @Override // xsna.ray0
    public void onCredentialsRequestFailed(String str) {
        this.a.onCredentialsRequestFailed(str);
    }

    @Override // xsna.ray0
    public void onCredentialsRequestSuccess(String str, String str2) {
        this.a.onCredentialsRequestSuccess(str, str2);
    }

    public awv(Context context, lnv lnvVar, boolean z, z65 z65Var) {
        this(lnvVar, null);
        this.a = new yyy0(new fuy0(context), false, z, z65Var, this);
    }
}
