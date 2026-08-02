package xsna;

import android.net.Uri;
import com.ironsource.X3;
import xsna.xbr0;
import xsna.xjv;

/* compiled from: HttpPostCall.kt */
/* loaded from: classes15.dex */
public final class akv extends xbr0 {
    public Long g;

    /* compiled from: HttpPostCall.kt */
    public static final class a extends xbr0.a {
        @Override // xsna.xbr0.a
        public final xbr0.a a(String str, String str2) {
            throw null;
        }

        public final void b(Uri uri) {
            xjv.a aVar = new xjv.a();
            aVar.a = uri;
            aVar.b = uri.getLastPathSegment();
            this.c.put(X3.i.b, aVar);
        }

        public final void c(Uri uri, String str, String str2) {
            xjv.a aVar = new xjv.a();
            aVar.a = uri;
            aVar.b = str2;
            this.c.put(str, aVar);
        }

        public final void d(String str, String str2) {
            super.a(str, str2);
        }
    }

    public final Long d() {
        return this.g;
    }

    public final void e(Long l) {
        this.g = l;
    }
}
