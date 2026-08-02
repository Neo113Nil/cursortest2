package xsna;

import ru.ok.android.webrtc.media_options.MediaOptionState;

/* compiled from: PrimaryButtonsFeatureEvent.kt */
/* loaded from: classes7.dex */
public interface j9d0 {

    /* compiled from: PrimaryButtonsFeatureEvent.kt */
    public static final class a implements j9d0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1846600315;
        }

        public final String toString() {
            return "EndCall";
        }
    }

    /* compiled from: PrimaryButtonsFeatureEvent.kt */
    public static final class b implements j9d0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1289207892;
        }

        public final String toString() {
            return "LeaveRoom";
        }
    }

    /* compiled from: PrimaryButtonsFeatureEvent.kt */
    public static final class c implements j9d0 {
        public final MediaOptionState a;
        public final MediaOptionState b;
        public final boolean c;
        public final boolean d;

        public c(MediaOptionState mediaOptionState, MediaOptionState mediaOptionState2, boolean z, boolean z2) {
            this.a = mediaOptionState;
            this.b = mediaOptionState2;
            this.c = z;
            this.d = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b && this.c == cVar.c && this.d == cVar.d;
        }

        public final int hashCode() {
            MediaOptionState mediaOptionState = this.a;
            int hashCode = (mediaOptionState == null ? 0 : mediaOptionState.hashCode()) * 31;
            MediaOptionState mediaOptionState2 = this.b;
            return Boolean.hashCode(this.d) + qoy.b((hashCode + (mediaOptionState2 != null ? mediaOptionState2.hashCode() : 0)) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MediaOptionsChanged(newAudioState=");
            sb.append(this.a);
            sb.append(", newVideoState=");
            sb.append(this.b);
            sb.append(", wasAudioEnabled=");
            sb.append(this.c);
            sb.append(", wasVideoEnabled=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: PrimaryButtonsFeatureEvent.kt */
    public static final class d implements j9d0 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1556441243;
        }

        public final String toString() {
            return "OpenWhiteboard";
        }
    }

    /* compiled from: PrimaryButtonsFeatureEvent.kt */
    public static final class e implements j9d0 {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 2137221143;
        }

        public final String toString() {
            return "SelectSessionRoom";
        }
    }

    /* compiled from: PrimaryButtonsFeatureEvent.kt */
    public static final class f implements j9d0 {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1279345693;
        }

        public final String toString() {
            return "SwitchCam";
        }
    }

    /* compiled from: PrimaryButtonsFeatureEvent.kt */
    public static final class g implements j9d0 {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 570313725;
        }

        public final String toString() {
            return "ToggleCam";
        }
    }

    /* compiled from: PrimaryButtonsFeatureEvent.kt */
    public static final class h implements j9d0 {
        public static final h a = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 500005377;
        }

        public final String toString() {
            return "ToggleHand";
        }
    }

    /* compiled from: PrimaryButtonsFeatureEvent.kt */
    public static final class i implements j9d0 {
        public static final i a = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 570323573;
        }

        public final String toString() {
            return "ToggleMic";
        }
    }

    /* compiled from: PrimaryButtonsFeatureEvent.kt */
    public static final class j implements j9d0 {
        public static final j a = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -1987615443;
        }

        public final String toString() {
            return "ToggleSpeaker";
        }
    }

    /* compiled from: PrimaryButtonsFeatureEvent.kt */
    public static final class k implements j9d0 {
    }
}
