package xsna;

/* compiled from: AlbumDetailsEmptyView.kt */
/* loaded from: classes4.dex */
public abstract class pmx {

    /* compiled from: AlbumDetailsEmptyView.kt */
    public static final class a extends pmx {
        public static final a a = new a();
    }

    /* compiled from: AlbumDetailsEmptyView.kt */
    public static final class b extends pmx {
        public final Throwable a;

        public b(Throwable th) {
            this.a = th;
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
            return oq.c(new StringBuilder("Error(throwable="), this.a, ')');
        }
    }
}
