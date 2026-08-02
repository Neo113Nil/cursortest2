package xsna;

import android.os.Bundle;

/* compiled from: PromoNavigationEvent.kt */
/* loaded from: classes3.dex */
public interface r5e0 {

    /* compiled from: PromoNavigationEvent.kt */
    public static final class a implements r5e0 {
        public static final a a = new a();
    }

    /* compiled from: PromoNavigationEvent.kt */
    public static final class b implements r5e0 {
        public final String a;
        public final Bundle b;

        public b(String str, Bundle bundle) {
            this.a = str;
            this.b = bundle;
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
            Bundle bundle = this.b;
            return hashCode + (bundle == null ? 0 : bundle.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LinkClick(link=");
            sb.append(this.a);
            sb.append(", awayParams=");
            return uf3.c(sb, this.b, ')');
        }
    }
}
