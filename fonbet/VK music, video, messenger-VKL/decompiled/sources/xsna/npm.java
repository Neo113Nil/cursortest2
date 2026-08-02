package xsna;

/* compiled from: DialogsFabViewAction.kt */
/* loaded from: classes18.dex */
public abstract class npm implements kj50 {

    /* compiled from: DialogsFabViewAction.kt */
    public static final class a extends npm {
        public final boolean b;

        public a(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.b == ((a) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("FabClick(needShowPersChanOnboarding="), this.b, ')');
        }
    }
}
