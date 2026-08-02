package xsna;

import com.vk.music.bottomsheets.MusicBottomSheetLaunchPoint;

/* compiled from: TrackMenuAction.kt */
/* loaded from: classes3.dex */
public interface tfp0 extends kj50 {

    /* compiled from: TrackMenuAction.kt */
    public static final class a implements tfp0 {
        public final MusicBottomSheetLaunchPoint b;

        public a(MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint) {
            this.b = musicBottomSheetLaunchPoint;
        }
    }

    /* compiled from: TrackMenuAction.kt */
    public interface b extends tfp0 {

        /* compiled from: TrackMenuAction.kt */
        public static final class a implements b {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 193376644;
            }

            public final String toString() {
                return "AddToKidsCollection";
            }
        }

        /* compiled from: TrackMenuAction.kt */
        /* renamed from: xsna.tfp0$b$b, reason: collision with other inner class name */
        public static final class C3742b implements b {
            public static final C3742b b = new C3742b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3742b);
            }

            public final int hashCode() {
                return -228139367;
            }

            public final String toString() {
                return "AddToKidsCollectionInKidsMode";
            }
        }

        /* compiled from: TrackMenuAction.kt */
        public static final class c implements b {
            public static final c b = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 199546208;
            }

            public final String toString() {
                return "AddToMyMusic";
            }
        }

        /* compiled from: TrackMenuAction.kt */
        public static final class d implements b {
            public static final d b = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 1958519805;
            }

            public final String toString() {
                return "AddToPlaybackQueue";
            }
        }

        /* compiled from: TrackMenuAction.kt */
        public static final class e implements b {
            public static final e b = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 452884779;
            }

            public final String toString() {
                return "AddToPlaylist";
            }
        }

        /* compiled from: TrackMenuAction.kt */
        public static final class f implements b {
            public final boolean b;

            public f(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && this.b == ((f) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("Dislike(isDisliked="), this.b, ')');
            }
        }

        /* compiled from: TrackMenuAction.kt */
        public static final class g implements b {
            public static final g b = new g();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public final int hashCode() {
                return 599055808;
            }

            public final String toString() {
                return "DownLoadTrack";
            }
        }

        /* compiled from: TrackMenuAction.kt */
        public static final class h implements b {
            public static final h b = new h();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof h);
            }

            public final int hashCode() {
                return 1751356227;
            }

            public final String toString() {
                return "FindArtist";
            }
        }

        /* compiled from: TrackMenuAction.kt */
        public static final class i implements b {
            public static final i b = new i();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof i);
            }

            public final int hashCode() {
                return 1601380713;
            }

            public final String toString() {
                return "GoToAlbum";
            }
        }

        /* compiled from: TrackMenuAction.kt */
        public static final class j implements b {
            public static final j b = new j();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof j);
            }

            public final int hashCode() {
                return -1890739315;
            }

            public final String toString() {
                return "GoToArtist";
            }
        }

        /* compiled from: TrackMenuAction.kt */
        public static final class k implements b {
            public static final k b = new k();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof k);
            }

            public final int hashCode() {
                return 1818258922;
            }

            public final String toString() {
                return "PlayNext";
            }
        }

        /* compiled from: TrackMenuAction.kt */
        public static final class l implements b {
            public static final l b = new l();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof l);
            }

            public final int hashCode() {
                return -1423858052;
            }

            public final String toString() {
                return "RemoveFromKidsCollection";
            }
        }

        /* compiled from: TrackMenuAction.kt */
        public static final class m implements b {
            public static final m b = new m();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof m);
            }

            public final int hashCode() {
                return 1909917544;
            }

            public final String toString() {
                return "RemoveFromMyMusic";
            }
        }

        /* compiled from: TrackMenuAction.kt */
        public static final class n implements b {
            public static final n b = new n();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof n);
            }

            public final int hashCode() {
                return 1934788643;
            }

            public final String toString() {
                return "RemoveFromPlaylist";
            }
        }

        /* compiled from: TrackMenuAction.kt */
        public static final class o implements b {
            public static final o b = new o();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof o);
            }

            public final int hashCode() {
                return -137037406;
            }

            public final String toString() {
                return "Separator";
            }
        }

        /* compiled from: TrackMenuAction.kt */
        public static final class p implements b {
            public static final p b = new p();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof p);
            }

            public final int hashCode() {
                return 1374312902;
            }

            public final String toString() {
                return "Settings";
            }
        }

        /* compiled from: TrackMenuAction.kt */
        public static final class q implements b {
            public static final q b = new q();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof q);
            }

            public final int hashCode() {
                return 293358876;
            }

            public final String toString() {
                return "Share";
            }
        }

        /* compiled from: TrackMenuAction.kt */
        public static final class r implements b {
            public static final r b = new r();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof r);
            }

            public final int hashCode() {
                return 849374528;
            }

            public final String toString() {
                return "Subscription";
            }
        }

        /* compiled from: TrackMenuAction.kt */
        public static final class s implements b {
            public static final s b = new s();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof s);
            }

            public final int hashCode() {
                return 1210143412;
            }

            public final String toString() {
                return "TrackMix";
            }
        }
    }
}
