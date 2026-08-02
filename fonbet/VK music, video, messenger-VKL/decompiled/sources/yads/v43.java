package yads;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes10.dex */
public final class v43 implements p30 {
    public final p30 a;
    public long b;
    public Uri c = Uri.EMPTY;

    public v43(p30 p30Var) {
        this.a = (p30) ni.a(p30Var);
    }

    @Override // yads.p30
    public final void a(v93 v93Var) {
        v93Var.getClass();
        this.a.a(v93Var);
    }

    @Override // yads.p30
    public final void close() {
        this.a.close();
    }

    @Override // yads.p30
    public final Map getResponseHeaders() {
        return this.a.getResponseHeaders();
    }

    @Override // yads.p30
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.a.read(bArr, i, i2);
        if (read != -1) {
            this.b += read;
        }
        return read;
    }

    @Override // yads.p30
    public final long a(u30 u30Var) {
        this.c = u30Var.a;
        long a = this.a.a(u30Var);
        Uri uri = this.a.getUri();
        uri.getClass();
        this.c = uri;
        this.a.getResponseHeaders();
        return a;
    }
}
