package xsna;

import android.content.Context;
import xsna.bx8;

/* compiled from: VideoDiskCacheManagerMessages.kt */
/* loaded from: classes8.dex */
public final class h8o {
    public final Context a;
    public final dbn b;
    public final bx8.a c;

    public h8o(Context context, dbn dbnVar, bx8.a aVar) {
        this.a = context;
        this.b = dbnVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8o)) {
            return false;
        }
        h8o h8oVar = (h8o) obj;
        return epx.f(this.a, h8oVar.a) && epx.f(this.b, h8oVar.b) && this.c.equals(h8oVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DownloadArgs(context=" + this.a + ", videoSource=" + this.b + ", cacheLoadParams=" + this.c + ")";
    }
}
