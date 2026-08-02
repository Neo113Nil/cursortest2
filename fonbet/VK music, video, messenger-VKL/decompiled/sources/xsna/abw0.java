package xsna;

import java.util.ArrayList;
import xsna.waw0;

/* compiled from: VmojiRecommendationsState.kt */
/* loaded from: classes7.dex */
public final class abw0 implements ao50 {
    public final fi50 a;

    /* compiled from: VmojiRecommendationsState.kt */
    public static final class a implements fm50<waw0.a> {
        public final yzt0<b> a;

        public a(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tr.c(new StringBuilder("Content(data="), this.a, ')');
        }
    }

    /* compiled from: VmojiRecommendationsState.kt */
    public static final class b implements fm50<waw0.a> {
        public final String a;
        public final String b;
        public final ArrayList c;
        public final boolean d;

        public b(String str, String str2, ArrayList arrayList, boolean z) {
            this.a = str;
            this.b = str2;
            this.c = arrayList;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && this.c.equals(bVar.c) && this.d == bVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + qr.a(this.c, urd0.a(this.a.hashCode() * 31, 31, this.b), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RecommendationsData(id=");
            sb.append(this.a);
            sb.append(", title=");
            sb.append(this.b);
            sb.append(", items=");
            sb.append(this.c);
            sb.append(", reloadingInBackground=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    public abw0(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
