package xsna;

import com.huawei.hms.api.ConnectionResult;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class e7z0 {
    public static final e7z0 e = new e7z0(giy0.d, 999);
    public final udz0 a;
    public final giy0 b;
    public final int c;
    public final String d;

    public e7z0(giy0 giy0Var, int i) {
        this(giy0Var.a, giy0Var, i, "");
    }

    public final void a(String str) {
        int i = this.c;
        giy0 giy0Var = this.b;
        if (giy0Var != null) {
            giy0Var.c(i, ConnectionResult.NETWORK_ERROR, str);
        } else {
            this.a.b(i, ConnectionResult.NETWORK_ERROR, str);
        }
    }

    public final void b(int i, String str, String str2) {
        giy0 giy0Var = this.b;
        if (giy0Var != null) {
            giy0Var.b(this.c, 3, i, str, str2);
        } else {
            this.a.a(this.c, 3, i, str, str2);
        }
    }

    public e7z0(udz0 udz0Var, giy0 giy0Var, int i, String str) {
        this.a = udz0Var;
        this.b = giy0Var;
        this.c = i;
        this.d = str;
    }
}
