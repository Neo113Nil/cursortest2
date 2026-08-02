package xsna;

import com.vk.voip.dto.call_member.CallMemberId;
import ru.ok.android.webrtc.media_options.MediaOption;
import xsna.uav;

/* compiled from: NavigationEvent.kt */
/* loaded from: classes7.dex */
public interface gy50 {

    /* compiled from: NavigationEvent.kt */
    public static final class a implements gy50 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1457749724;
        }

        public final String toString() {
            return "AskCameraForBeautyFilter";
        }
    }

    /* compiled from: NavigationEvent.kt */
    public static final class b implements gy50 {
        public final MediaOption a;

        public b(MediaOption mediaOption) {
            this.a = mediaOption;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "CallMediaSettingDialog(mediaOption=" + this.a + ')';
        }
    }

    /* compiled from: NavigationEvent.kt */
    public static final class c implements gy50 {
        public static final c a = new c();
    }

    /* compiled from: NavigationEvent.kt */
    public static final class d implements gy50 {
        public final uav.a a;

        public d(uav.a aVar) {
            this.a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "CameraToRequestHolidayInteractionDialog(interaction=" + this.a + ')';
        }
    }

    /* compiled from: NavigationEvent.kt */
    public static final class e implements gy50 {
        public final CallMemberId a;

        public e(CallMemberId callMemberId) {
            this.a = callMemberId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "GrantAdminToParticipantDialog(id=" + this.a + ')';
        }
    }

    /* compiled from: NavigationEvent.kt */
    public static final class f implements gy50 {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1229145347;
        }

        public final String toString() {
            return "OpenBeautyFilter";
        }
    }

    /* compiled from: NavigationEvent.kt */
    public static final class g implements gy50 {
        public static final g a = new g();
    }

    /* compiled from: NavigationEvent.kt */
    public static final class h implements gy50 {
        public static final h a = new h();
    }

    /* compiled from: NavigationEvent.kt */
    public static final class i implements gy50 {
        public static final i a = new i();
    }

    /* compiled from: NavigationEvent.kt */
    public static final class j implements gy50 {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            ((j) obj).getClass();
            return epx.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return ho8.a(new StringBuilder("ShieldDialog(code="), null, ')');
        }
    }

    /* compiled from: NavigationEvent.kt */
    public static final class k implements gy50 {
        public static final k a = new k();
    }

    /* compiled from: NavigationEvent.kt */
    public static final class l implements gy50 {
        public final String a;
        public final MediaOption b;

        public l(String str, MediaOption mediaOption) {
            this.a = str;
            this.b = mediaOption;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            lVar.getClass();
            return epx.f(this.a, lVar.a) && this.b == lVar.b;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "ShowParticipantMediaSettingDialog(participantId=null, participantNameDat=" + this.a + ", mediaOption=" + this.b + ')';
        }
    }

    /* compiled from: NavigationEvent.kt */
    public static final class m implements gy50 {
        public static final m a = new m();
    }

    /* compiled from: NavigationEvent.kt */
    public static final class n implements gy50 {
        public static final n a = new n();
    }
}
