package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.IOException;

/* loaded from: classes11.dex */
public final class e1r {
    public final d1r a;

    public e1r(d1r d1rVar) {
        this.a = d1rVar;
    }

    public final File a(Context context, Uri uri) {
        File f;
        if (context != null) {
            au2 au2Var = new au2(uri);
            if (au2Var.c()) {
                d1r d1rVar = this.a;
                if (d1rVar.a(context, au2Var) && (f = d1rVar.f(au2Var)) != null) {
                    try {
                        return f.getCanonicalFile();
                    } catch (IOException unused) {
                        z83.i();
                    }
                }
            }
        }
        return null;
    }
}
