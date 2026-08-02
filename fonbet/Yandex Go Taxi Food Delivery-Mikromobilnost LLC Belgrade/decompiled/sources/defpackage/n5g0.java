package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;

/* loaded from: classes10.dex */
public final class n5g0 implements r430 {
    public final Context a;
    public final Class b;

    public n5g0(Context context, Class cls) {
        this.a = context;
        this.b = cls;
    }

    @Override // defpackage.r430
    public final q430 a(ul40 ul40Var) {
        Class cls = this.b;
        return new p5g0(this.a, ul40Var.c(File.class, cls), ul40Var.c(Uri.class, cls), cls);
    }
}
