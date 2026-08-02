package defpackage;

import java.io.File;

/* loaded from: classes12.dex */
public final class hzw {
    public final dz31 a;

    public hzw(dz31 dz31Var) {
        this.a = dz31Var;
    }

    public final boolean a(String str, String str2) {
        dz31 dz31Var = this.a;
        dz31Var.getClass();
        File file = new File(dz31Var.b(str, str2).concat("/navigation"));
        return file.exists() && file.length() > 0;
    }
}
