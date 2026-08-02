package xsna;

import android.net.Uri;
import kotlin.LazyThreadSafetyMode;

/* compiled from: HttpUri.kt */
/* loaded from: classes2.dex */
public final class skv {
    public final Uri a;
    public final Object b;
    public final Object c;

    /* compiled from: HttpUri.kt */
    public static final class a {
        public static skv a(String str) {
            return new skv(Uri.parse(str));
        }
    }

    public skv(Uri uri) {
        this.a = uri;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = msy.a(lazyThreadSafetyMode, new h1j(this, 18));
        this.c = msy.a(lazyThreadSafetyMode, new wzh(this, 15));
    }

    public final skv a(izs<? super Uri.Builder, Uri.Builder> izsVar) {
        return new skv(izsVar.invoke(this.a.buildUpon()).build());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final String b() {
        return (String) this.b.getValue();
    }

    public final Uri c() {
        return this.a.buildUpon().build();
    }

    public final String toString() {
        return this.a.toString();
    }
}
