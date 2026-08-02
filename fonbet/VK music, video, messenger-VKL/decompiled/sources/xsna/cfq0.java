package xsna;

import androidx.annotation.NonNull;
import java.io.InputStream;
import java.net.URL;
import xsna.b330;

/* compiled from: UrlLoader.java */
/* loaded from: classes12.dex */
public final class cfq0 implements b330<URL, InputStream> {
    public final b330<e1u, InputStream> a;

    /* compiled from: UrlLoader.java */
    public static class a implements c330<URL, InputStream> {
        @Override // xsna.c330
        @NonNull
        public final b330<URL, InputStream> d(j540 j540Var) {
            return new cfq0(j540Var.b(e1u.class, InputStream.class));
        }
    }

    public cfq0(b330<e1u, InputStream> b330Var) {
        this.a = b330Var;
    }

    @Override // xsna.b330
    public final b330.a<InputStream> a(@NonNull URL url, int i, int i2, @NonNull au80 au80Var) {
        return this.a.a(new e1u(url), i, i2, au80Var);
    }

    @Override // xsna.b330
    public final /* bridge */ /* synthetic */ boolean b(@NonNull URL url) {
        return true;
    }
}
