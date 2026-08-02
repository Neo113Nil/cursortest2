package okhttp3;

import java.io.File;
import java.io.FileInputStream;
import java.util.logging.Logger;
import xsna.an8;
import xsna.ez70;
import xsna.i3x;
import xsna.mxo0;

/* compiled from: RequestBody.kt */
/* loaded from: classes8.dex */
public final class q extends t {
    public final /* synthetic */ m c;
    public final /* synthetic */ File d;

    public q(m mVar, File file) {
        this.c = mVar;
        this.d = file;
    }

    @Override // okhttp3.t
    public final long contentLength() {
        return this.d.length();
    }

    @Override // okhttp3.t
    public final m contentType() {
        return this.c;
    }

    @Override // okhttp3.t
    public final void writeTo(an8 an8Var) {
        Logger logger = ez70.a;
        i3x i3xVar = new i3x(new FileInputStream(this.d), mxo0.d);
        try {
            an8Var.L2(i3xVar);
            i3xVar.close();
        } finally {
        }
    }
}
