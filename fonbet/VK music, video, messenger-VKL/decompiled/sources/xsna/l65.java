package xsna;

import android.net.Uri;

/* compiled from: AuthStatus.kt */
/* loaded from: classes4.dex */
public abstract class l65 {

    /* compiled from: AuthStatus.kt */
    public static final class a extends l65 {
        public final String a;
        public final Throwable b;

        public a() {
            this((String) null, 3);
        }

        public a(String str, Throwable th) {
            this.a = str;
            this.b = th;
        }

        public /* synthetic */ a(String str, int i) {
            this((i & 1) != 0 ? null : str, (Throwable) null);
        }
    }

    /* compiled from: AuthStatus.kt */
    public static final class b extends l65 {
        public final String a;

        public b(String str) {
            this.a = str;
        }
    }

    /* compiled from: AuthStatus.kt */
    public static final class c extends l65 {
        public final Uri a;

        public c(Uri uri) {
            this.a = uri;
        }
    }

    /* compiled from: AuthStatus.kt */
    public static final class d extends l65 {
        public static final d a = new d();
    }

    /* compiled from: AuthStatus.kt */
    public static final class e extends l65 {
        public final aru0 a;

        public e(aru0 aru0Var) {
            this.a = aru0Var;
        }
    }

    /* compiled from: AuthStatus.kt */
    public static final class f extends l65 {
        public static final f a = new f();
    }

    /* compiled from: AuthStatus.kt */
    public static final class g extends l65 {
        public static final g a = new g();
    }

    /* compiled from: AuthStatus.kt */
    public static final class h extends l65 {
        public final Uri a;

        public h(Uri uri) {
            this.a = uri;
        }
    }
}
