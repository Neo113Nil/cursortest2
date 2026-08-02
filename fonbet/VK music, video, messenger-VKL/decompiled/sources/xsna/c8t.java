package xsna;

import java.util.ArrayList;

/* compiled from: GameUserStack.kt */
/* loaded from: classes17.dex */
public final class c8t {
    public final String a;
    public final ArrayList b;

    /* compiled from: GameUserStack.kt */
    public static final class a {
        public final String a;
        public final String b;
        public final String c;

        public a(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GameUserProfileItem(name=");
            sb.append(this.a);
            sb.append(", photoUrl=");
            sb.append(this.b);
            sb.append(", profileUrl=");
            return ho8.a(sb, this.c, ')');
        }
    }

    public c8t(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8t)) {
            return false;
        }
        c8t c8tVar = (c8t) obj;
        return this.a.equals(c8tVar.a) && this.b.equals(c8tVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GameUserStack(text=");
        sb.append(this.a);
        sb.append(", profiles=");
        return bo.c(')', sb, this.b);
    }
}
