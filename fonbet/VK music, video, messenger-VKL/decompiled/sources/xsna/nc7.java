package xsna;

import android.net.Uri;
import android.os.SystemClock;
import com.facebook.common.time.RealtimeSinceBootClock;

/* compiled from: BitmapMemoryCacheKey.kt */
/* loaded from: classes12.dex */
public final class nc7 implements ww8 {
    public final String a;
    public final x9g0 b;
    public final eng0 c;
    public final liw d;
    public final ww8 e;
    public final String f;
    public Object g;
    public final int h;

    public nc7(String str, x9g0 x9g0Var, eng0 eng0Var, liw liwVar, ww8 ww8Var, String str2) {
        this.a = str;
        this.b = x9g0Var;
        this.c = eng0Var;
        this.d = liwVar;
        this.e = ww8Var;
        this.f = str2;
        this.h = ((((liwVar.hashCode() + ((eng0Var.hashCode() + (((str.hashCode() * 31) + (x9g0Var != null ? x9g0Var.hashCode() : 0)) * 31)) * 31)) * 31) + (ww8Var != null ? ww8Var.hashCode() : 0)) * 31) + (str2 != null ? str2.hashCode() : 0);
        RealtimeSinceBootClock.get().getClass();
        SystemClock.elapsedRealtime();
    }

    @Override // xsna.ww8
    public final String a() {
        return this.a;
    }

    @Override // xsna.ww8
    public final boolean b() {
        return false;
    }

    @Override // xsna.ww8
    public final boolean c(Uri uri) {
        return drm0.D(this.a, uri.toString(), false);
    }

    public final void d(Object obj) {
        this.g = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!nc7.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        nc7 nc7Var = (nc7) obj;
        return epx.f(this.a, nc7Var.a) && epx.f(this.b, nc7Var.b) && epx.f(this.c, nc7Var.c) && epx.f(this.d, nc7Var.d) && epx.f(this.e, nc7Var.e) && epx.f(this.f, nc7Var.f);
    }

    public final int hashCode() {
        return this.h;
    }

    public final String toString() {
        return "BitmapMemoryCacheKey(sourceString=" + this.a + ", resizeOptions=" + this.b + ", rotationOptions=" + this.c + ", imageDecodeOptions=" + this.d + ", postprocessorCacheKey=" + this.e + ", postprocessorName=" + this.f + ")";
    }
}
