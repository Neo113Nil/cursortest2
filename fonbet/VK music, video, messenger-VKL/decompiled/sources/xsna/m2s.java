package xsna;

/* compiled from: FoldersShowNavigationEvent.kt */
/* loaded from: classes18.dex */
public abstract class m2s implements vl50 {

    /* compiled from: FoldersShowNavigationEvent.kt */
    public static final class a extends m2s {
        public static final a a = new a();
    }

    /* compiled from: FoldersShowNavigationEvent.kt */
    public static final class b extends m2s {
        public static final b a = new b();
    }

    /* compiled from: FoldersShowNavigationEvent.kt */
    public static final class c extends m2s {
        public final yyr a;

        public c(yyr yyrVar) {
            this.a = yyrVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "FolderConfigureAction(folder=" + this.a + ')';
        }
    }
}
