package xsna;

import android.net.Uri;

/* compiled from: PostingFilesCopier.kt */
/* loaded from: classes4.dex */
public interface gfc0 {

    /* compiled from: PostingFilesCopier.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final gfc0 STUB = new C2939a();

        /* compiled from: PostingFilesCopier.kt */
        /* renamed from: xsna.gfc0$a$a, reason: collision with other inner class name */
        public static final class C2939a implements gfc0 {
            @Override // xsna.gfc0
            public final Uri a(Uri uri) {
                return Uri.EMPTY;
            }

            @Override // xsna.gfc0
            public final io.reactivex.rxjava3.core.q<s3q0> b() {
                return io.reactivex.rxjava3.internal.operators.observable.g0.b;
            }

            @Override // xsna.gfc0
            public final io.reactivex.rxjava3.core.q<b> c(String str) {
                return null;
            }
        }

        public final gfc0 getSTUB() {
            return STUB;
        }
    }

    /* compiled from: PostingFilesCopier.kt */
    public static final class b {
        public final String a;
        public final boolean b;

        public b(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CopyResult(destinationUri=");
            sb.append(this.a);
            sb.append(", isSuccessful=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    Uri a(Uri uri);

    io.reactivex.rxjava3.core.q<s3q0> b();

    io.reactivex.rxjava3.core.q<b> c(String str);
}
