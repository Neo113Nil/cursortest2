package xsna;

import xsna.tlo0;

/* compiled from: OrderListItem.kt */
/* loaded from: classes18.dex */
public final class hxu extends jv80 {
    public final y8l b;
    public final String c;
    public final tlo0 d;
    public final a e;

    /* compiled from: OrderListItem.kt */
    public static final class a {
        public final tlo0.f a;
        public final String b;

        public a(String str, tlo0.f fVar) {
            this.a = fVar;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Integer.hashCode(this.a.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RightButton(text=");
            sb.append(this.a);
            sb.append(", link=");
            return ho8.a(sb, this.b, ')');
        }
    }

    public hxu(y8l y8lVar, String str, tlo0 tlo0Var, a aVar) {
        super(str);
        this.b = y8lVar;
        this.c = str;
        this.d = tlo0Var;
        this.e = aVar;
    }

    @Override // xsna.jv80
    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hxu)) {
            return false;
        }
        hxu hxuVar = (hxu) obj;
        return epx.f(this.b, hxuVar.b) && epx.f(this.c, hxuVar.c) && epx.f(this.d, hxuVar.d) && epx.f(this.e, hxuVar.e);
    }

    public final int hashCode() {
        int a2 = com.vk.movika.sdk.base.model.history.b.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
        a aVar = this.e;
        return a2 + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return "HeaderItem(decorationType=" + this.b + ", key=" + this.c + ", text=" + this.d + ", rightButton=" + this.e + ')';
    }
}
