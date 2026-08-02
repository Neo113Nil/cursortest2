package xsna;

import java.util.ArrayList;

/* compiled from: TagsListViewState.kt */
/* loaded from: classes18.dex */
public final class j2o0 implements lm50 {
    public final ArrayList b;

    /* compiled from: TagsListViewState.kt */
    public static final class a {
        public final int a;
        public final String b;
        public final long c;
        public final boolean d;

        public a(long j, int i, String str, boolean z) {
            this.a = i;
            this.b = str;
            this.c = j;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && l5g.d(this.c, aVar.c) && this.d == aVar.d;
        }

        public final int hashCode() {
            int a = urd0.a(Integer.hashCode(this.a) * 31, 31, this.b);
            int i = l5g.l;
            return Boolean.hashCode(this.d) + bh10.a(a, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Tag(id=");
            sb.append(this.a);
            sb.append(", title=");
            sb.append(this.b);
            sb.append(", color=");
            dn.h(this.c, ", isSelected=", sb);
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    public j2o0(ArrayList arrayList) {
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j2o0) && this.b.equals(((j2o0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return bo.c(')', new StringBuilder("TagsListViewState(tags="), this.b);
    }
}
