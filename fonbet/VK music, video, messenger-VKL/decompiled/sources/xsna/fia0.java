package xsna;

/* compiled from: PickerRootAction.kt */
/* loaded from: classes5.dex */
public abstract class fia0 implements kj50 {

    /* compiled from: PickerRootAction.kt */
    public static final class a extends fia0 {
        public static final a b = new a();
    }

    /* compiled from: PickerRootAction.kt */
    public static final class b extends fia0 {
        public static final b b = new b();
    }

    /* compiled from: PickerRootAction.kt */
    public static final class c extends fia0 {
        public final int b;
        public final Boolean c;

        public c(int i, Boolean bool) {
            this.b = i;
            this.c = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.b == cVar.b && epx.f(this.c, cVar.c);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.b) * 31;
            Boolean bool = this.c;
            return hashCode + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TabPageSelectedPosition(position=");
            sb.append(this.b);
            sb.append(", isUser=");
            return tn.a(sb, this.c, ')');
        }
    }
}
