package xsna;

/* compiled from: BroadcastShareParamsViewEvent.kt */
/* loaded from: classes7.dex */
public abstract class sj8 {

    /* compiled from: BroadcastShareParamsViewEvent.kt */
    public static final class a extends sj8 {
        public final boolean a;
        public final boolean b;

        public a(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChangeShareParams(shareInStories=");
            sb.append(this.a);
            sb.append(", shareOnWall=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }
}
