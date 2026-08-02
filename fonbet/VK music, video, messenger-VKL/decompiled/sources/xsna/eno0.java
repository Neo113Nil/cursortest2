package xsna;

import java.util.List;

/* compiled from: TextUiDto.kt */
/* loaded from: classes4.dex */
public interface eno0 {

    /* compiled from: TextUiDto.kt */
    public static final class a implements eno0 {
        public final int a;
        public final List<Object> b;

        public a(int i, List<? extends Object> list) {
            this.a = i;
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Resource(resId=");
            sb.append(this.a);
            sb.append(", args=");
            return ms9.a(')', sb, this.b);
        }
    }

    /* compiled from: TextUiDto.kt */
    public static final class b implements eno0 {
        public final String a;

        public b(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Text(text="), this.a, ')');
        }
    }
}
