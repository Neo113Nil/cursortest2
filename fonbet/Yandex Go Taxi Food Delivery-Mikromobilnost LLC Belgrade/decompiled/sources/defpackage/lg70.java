package defpackage;

import android.content.Context;
import coil3.request.CachePolicy;
import coil3.size.Precision;
import coil3.size.Scale;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class lg70 {
    public final Context a;
    public final xis0 b;
    public final Scale c;
    public final Precision d;
    public final r1r e;
    public final CachePolicy f;
    public final CachePolicy g;
    public final CachePolicy h;
    public final j5p i;

    public lg70(Context context, xis0 xis0Var, Scale scale, Precision precision, r1r r1rVar, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, j5p j5pVar) {
        this.a = context;
        this.b = xis0Var;
        this.c = scale;
        this.d = precision;
        this.e = r1rVar;
        this.f = cachePolicy;
        this.g = cachePolicy2;
        this.h = cachePolicy3;
        this.i = j5pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lg70)) {
            return false;
        }
        lg70 lg70Var = (lg70) obj;
        return jl40.l(this.a, lg70Var.a) && jl40.l(this.b, lg70Var.b) && this.c == lg70Var.c && this.d == lg70Var.d && jl40.l(this.e, lg70Var.e) && this.f == lg70Var.f && this.g == lg70Var.g && this.h == lg70Var.h && this.i.equals(lg70Var.i);
    }

    public final int hashCode() {
        return this.i.a.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 961)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Options(context=" + this.a + ", size=" + this.b + ", scale=" + this.c + ", precision=" + this.d + ", diskCacheKey=null, fileSystem=" + this.e + ", memoryCachePolicy=" + this.f + ", diskCachePolicy=" + this.g + ", networkCachePolicy=" + this.h + ", extras=" + this.i + Extension.C_BRAKE;
    }
}
