package xsna;

import android.os.Bundle;

/* compiled from: PromoAction.kt */
/* loaded from: classes3.dex */
public interface o4e0 extends kj50 {

    /* compiled from: PromoAction.kt */
    public static final class a implements o4e0 {
        public final int b;
        public final boolean c;

        public a(int i, boolean z) {
            this.b = i;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CloseClick(promoId=");
            sb.append(this.b);
            sb.append(", isSwipe=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: PromoAction.kt */
    public static final class b implements o4e0 {
        public static final b b = new b();
    }

    /* compiled from: PromoAction.kt */
    public static final class c implements o4e0 {
        public final int b;
        public final String c;
        public final Bundle d;
        public final boolean e;

        public c(int i, String str, Bundle bundle, boolean z) {
            this.b = i;
            this.c = str;
            this.d = bundle;
            this.e = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.b == cVar.b && this.c.equals(cVar.c) && epx.f(this.d, cVar.d) && this.e == cVar.e;
        }

        public final int hashCode() {
            int a = urd0.a(Integer.hashCode(this.b) * 31, 31, this.c);
            Bundle bundle = this.d;
            return Boolean.hashCode(this.e) + ((a + (bundle == null ? 0 : bundle.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LinkClick(promoId=");
            sb.append(this.b);
            sb.append(", link=");
            sb.append(this.c);
            sb.append(", awayParams=");
            sb.append(this.d);
            sb.append(", isButton=");
            return defpackage.q0.a(sb, this.e, ')');
        }
    }
}
