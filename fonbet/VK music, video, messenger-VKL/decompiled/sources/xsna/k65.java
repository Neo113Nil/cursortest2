package xsna;

import android.net.Uri;

/* compiled from: AuthStatus.kt */
/* loaded from: classes4.dex */
public abstract class k65 {

    /* compiled from: AuthStatus.kt */
    public static final class a extends k65 {
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
    public static final class b extends k65 {
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public b(String str, String str2, String str3, String str4) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }
    }

    /* compiled from: AuthStatus.kt */
    public static final class c extends k65 {
        public final Uri a;

        public c(Uri uri) {
            this.a = uri;
        }
    }

    /* compiled from: AuthStatus.kt */
    public static final class d extends k65 {
        public final String a;

        public d(String str) {
            this.a = str;
        }
    }

    /* compiled from: AuthStatus.kt */
    public static final class e extends k65 {
        public static final e a = new e();
    }

    /* compiled from: AuthStatus.kt */
    public static final class f extends k65 {
        public static final f a = new f();
    }

    /* compiled from: AuthStatus.kt */
    public static final class g extends k65 {
        public static final g a = new g();
    }

    /* compiled from: AuthStatus.kt */
    public static final class h extends k65 {
        public final Uri a;

        public h(Uri uri) {
            this.a = uri;
        }
    }
}
