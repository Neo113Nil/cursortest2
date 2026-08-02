package xsna;

import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: TopBarModel.kt */
/* loaded from: classes14.dex */
public final class u7p0 {
    public final tlo0.f a;
    public final a b;

    /* compiled from: TopBarModel.kt */
    public static final class a {
        public final String a;
        public final boolean b;

        public a(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SearchFieldModel(query=");
            sb.append(this.a);
            sb.append(", isActive=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    public u7p0() {
        this(null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7p0)) {
            return false;
        }
        u7p0 u7p0Var = (u7p0) obj;
        return epx.f(this.a, u7p0Var.a) && epx.f(this.b, u7p0Var.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a.a) * 31;
        a aVar = this.b;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return "TopBarModel(title=" + this.a + ", searchFieldModel=" + this.b + ')';
    }

    public u7p0(a aVar, int i) {
        tlo0.f h = tq.h(tlo0.Companion, R.string.invite_to_community_new_flow);
        aVar = (i & 2) != 0 ? null : aVar;
        this.a = h;
        this.b = aVar;
    }
}
