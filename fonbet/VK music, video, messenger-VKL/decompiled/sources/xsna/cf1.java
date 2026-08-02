package xsna;

import kotlin.Pair;
import xsna.w0s0;

/* compiled from: AlbumCreationSnackbarHolder.kt */
/* loaded from: classes16.dex */
public final class cf1 {
    public String a;
    public w0s0.a b;

    public final void a(String str, w0s0.a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final void b(String str) {
        if (epx.f(this.a, str)) {
            this.a = null;
            this.b = null;
        }
    }

    public final Pair<String, dcn> c() {
        return new Pair<>(this.a, this.b);
    }
}
