package xsna;

import android.app.Activity;

/* compiled from: FullscreenAdvertisement.kt */
/* loaded from: classes6.dex */
public interface cxs {

    /* compiled from: FullscreenAdvertisement.kt */
    public interface a {
        void a();

        void b(b bVar);

        void c(j11 j11Var);

        void d(j11 j11Var);

        void e(cxs cxsVar);

        void onClick();

        void onCompleted();

        void onDismiss();
    }

    /* compiled from: FullscreenAdvertisement.kt */
    public static final class b {
        public final String a;
        public final String b;

        public b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ImpressionData(adNetwork=");
            sb.append(this.a);
            sb.append(", revenue=");
            return ho8.a(sb, this.b, ')');
        }
    }

    void a();

    void b(gzs<s3q0> gzsVar);

    void c(a aVar);

    boolean isValid();

    void load();

    void show(Activity activity);
}
