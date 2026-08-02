package xsna;

/* compiled from: BroadcastPreviewExtendedViewEvent.kt */
/* loaded from: classes7.dex */
public abstract class zh8 {

    /* compiled from: BroadcastPreviewExtendedViewEvent.kt */
    public static final class a extends zh8 {
        public static final a a = new a();
    }

    /* compiled from: BroadcastPreviewExtendedViewEvent.kt */
    public static final class b extends zh8 {
        public final boolean a;

        public b(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("OpenDetails(isRecord="), this.a, ')');
        }
    }

    /* compiled from: BroadcastPreviewExtendedViewEvent.kt */
    public static final class c extends zh8 {
        public static final c a = new c();
    }
}
