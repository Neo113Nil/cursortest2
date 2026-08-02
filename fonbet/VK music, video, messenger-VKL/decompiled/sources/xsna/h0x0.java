package xsna;

/* compiled from: VoipSelectVideoPlaylistsAction.kt */
/* loaded from: classes7.dex */
public interface h0x0 extends kj50 {

    /* compiled from: VoipSelectVideoPlaylistsAction.kt */
    public static final class a implements h0x0 {
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
            return defpackage.q0.a(new StringBuilder("InitLoad(swrLoading="), this.b, ')');
        }
    }

    /* compiled from: VoipSelectVideoPlaylistsAction.kt */
    public static final class b implements h0x0 {
        public static final b b = new b();
    }

    /* compiled from: VoipSelectVideoPlaylistsAction.kt */
    public static final class c implements h0x0 {
        public static final c b = new c();
    }
}
