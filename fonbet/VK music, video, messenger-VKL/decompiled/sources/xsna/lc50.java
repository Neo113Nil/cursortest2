package xsna;

import com.vk.music.bottomsheets.MusicBottomSheetLaunchPoint;

/* compiled from: MusicTrackMenuAction.kt */
/* loaded from: classes3.dex */
public interface lc50 extends kj50 {

    /* compiled from: MusicTrackMenuAction.kt */
    public static final class a implements lc50 {
        public final MusicBottomSheetLaunchPoint b;

        public a(MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint) {
            this.b = musicBottomSheetLaunchPoint;
        }
    }

    /* compiled from: MusicTrackMenuAction.kt */
    public interface b extends lc50 {

        /* compiled from: MusicTrackMenuAction.kt */
        public static final class a implements b {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1379075615;
            }

            public final String toString() {
                return "Share";
            }
        }

        /* compiled from: MusicTrackMenuAction.kt */
        /* renamed from: xsna.lc50$b$b, reason: collision with other inner class name */
        public static final class C3261b implements b {
            public static final C3261b b = new C3261b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3261b);
            }

            public final int hashCode() {
                return 635417101;
            }

            public final String toString() {
                return "ToggleBroadcast";
            }
        }

        /* compiled from: MusicTrackMenuAction.kt */
        public static final class c implements b {
            public static final c b = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 2054727100;
            }

            public final String toString() {
                return "ToggleDownload";
            }
        }
    }

    /* compiled from: MusicTrackMenuAction.kt */
    public interface c extends lc50 {

        /* compiled from: MusicTrackMenuAction.kt */
        public static final class a implements c {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 251134121;
            }

            public final String toString() {
                return "AddRadio";
            }
        }

        /* compiled from: MusicTrackMenuAction.kt */
        public static final class b implements c {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 468609687;
            }

            public final String toString() {
                return "AddToMyCollection";
            }
        }

        /* compiled from: MusicTrackMenuAction.kt */
        /* renamed from: xsna.lc50$c$c, reason: collision with other inner class name */
        public static final class C3262c implements c {
            public static final C3262c b = new C3262c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3262c);
            }

            public final int hashCode() {
                return 202693260;
            }

            public final String toString() {
                return "AddToMyMusic";
            }
        }

        /* compiled from: MusicTrackMenuAction.kt */
        public static final class d implements c {
            public static final d b = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 550443391;
            }

            public final String toString() {
                return "AddToPlaylist";
            }
        }

        /* compiled from: MusicTrackMenuAction.kt */
        @vby
        public static final class e implements c {
            public final int b;

            public final boolean equals(Object obj) {
                if (obj instanceof e) {
                    return this.b == ((e) obj).b;
                }
                return false;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b);
            }

            public final String toString() {
                return uqi.a("ChangeVolume(progress=", this.b, ')');
            }
        }

        /* compiled from: MusicTrackMenuAction.kt */
        public static final class f implements c {
            public static final f b = new f();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return 1827337071;
            }

            public final String toString() {
                return "FindArtist";
            }
        }

        /* compiled from: MusicTrackMenuAction.kt */
        public static final class g implements c {
            public static final g b = new g();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public final int hashCode() {
                return -1582756931;
            }

            public final String toString() {
                return "GoToAlbum";
            }
        }

        /* compiled from: MusicTrackMenuAction.kt */
        public static final class h implements c {
            public static final h b = new h();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof h);
            }

            public final int hashCode() {
                return -1814758471;
            }

            public final String toString() {
                return "GoToArtist";
            }
        }

        /* compiled from: MusicTrackMenuAction.kt */
        public static final class i implements c {
            public static final i b = new i();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof i);
            }

            public final int hashCode() {
                return -2129885625;
            }

            public final String toString() {
                return "MixByTrack";
            }
        }

        /* compiled from: MusicTrackMenuAction.kt */
        public static final class j implements c {
            public static final j b = new j();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof j);
            }

            public final int hashCode() {
                return -1850816484;
            }

            public final String toString() {
                return "OpenPlayerSettingsMenu";
            }
        }

        /* compiled from: MusicTrackMenuAction.kt */
        public static final class k implements c {
            public static final k b = new k();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof k);
            }

            public final int hashCode() {
                return -916854506;
            }

            public final String toString() {
                return "PlayNext";
            }
        }

        /* compiled from: MusicTrackMenuAction.kt */
        public static final class l implements c {
            public static final l b = new l();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof l);
            }

            public final int hashCode() {
                return -2068864792;
            }

            public final String toString() {
                return "PlaySimilar";
            }
        }

        /* compiled from: MusicTrackMenuAction.kt */
        public static final class m implements c {
            public static final m b = new m();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof m);
            }

            public final int hashCode() {
                return 521037159;
            }

            public final String toString() {
                return "RemoveFromMyCollection";
            }
        }

        /* compiled from: MusicTrackMenuAction.kt */
        public static final class n implements c {
            public static final n b = new n();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof n);
            }

            public final int hashCode() {
                return -487105092;
            }

            public final String toString() {
                return "RemoveFromMyMusic";
            }
        }

        /* compiled from: MusicTrackMenuAction.kt */
        public static final class o implements c {
            public static final o b = new o();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof o);
            }

            public final int hashCode() {
                return 641530959;
            }

            public final String toString() {
                return "RemoveFromPlaylist";
            }
        }

        /* compiled from: MusicTrackMenuAction.kt */
        public static final class p implements c {
            public static final p b = new p();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof p);
            }

            public final int hashCode() {
                return 615380916;
            }

            public final String toString() {
                return "RemoveFromQueue";
            }
        }

        /* compiled from: MusicTrackMenuAction.kt */
        public static final class q implements c {
            public static final q b = new q();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof q);
            }

            public final int hashCode() {
                return 403103400;
            }

            public final String toString() {
                return "RemoveRadio";
            }
        }

        /* compiled from: MusicTrackMenuAction.kt */
        public static final class r implements c {
            public static final r b = new r();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof r);
            }

            public final int hashCode() {
                return 973792246;
            }

            public final String toString() {
                return "Separator";
            }
        }

        /* compiled from: MusicTrackMenuAction.kt */
        public static final class s implements c {
            public static final s b = new s();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof s);
            }

            public final int hashCode() {
                return -1390354222;
            }

            public final String toString() {
                return "SetTimer";
            }
        }

        /* compiled from: MusicTrackMenuAction.kt */
        public static final class t implements c {
            public static final t b = new t();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof t);
            }

            public final int hashCode() {
                return -1072601174;
            }

            public final String toString() {
                return "ShareToStory";
            }
        }

        /* compiled from: MusicTrackMenuAction.kt */
        public interface u extends c {

            /* compiled from: MusicTrackMenuAction.kt */
            public static final class a implements u {
                public final boolean b;
                public final ztp c;

                public a(boolean z, ztp ztpVar) {
                    this.b = z;
                    this.c = ztpVar;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return this.b == aVar.b && epx.f(this.c, aVar.c);
                }

                public final int hashCode() {
                    return this.c.hashCode() + (Boolean.hashCode(this.b) * 31);
                }

                public final String toString() {
                    return "Equalizer(isEnabled=" + this.b + ", preset=" + this.c + ')';
                }
            }
        }
    }
}
