package xsna;

import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledAudioMuteOption;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledVideoMuteOption;

/* compiled from: VoipScheduledCallSettingsAction.kt */
/* loaded from: classes7.dex */
public interface zxw0 extends kj50 {

    /* compiled from: VoipScheduledCallSettingsAction.kt */
    public static final class a implements zxw0 {
        public static final a b = new a();
    }

    /* compiled from: VoipScheduledCallSettingsAction.kt */
    public static final class b implements zxw0 {
        public static final b b = new b();
    }

    /* compiled from: VoipScheduledCallSettingsAction.kt */
    public static final class c implements zxw0 {
        public static final c b = new c();
    }

    /* compiled from: VoipScheduledCallSettingsAction.kt */
    public static final class d implements zxw0 {
        public static final d b = new d();
    }

    /* compiled from: VoipScheduledCallSettingsAction.kt */
    public static final class e implements zxw0 {
        public static final e b = new e();
    }

    /* compiled from: VoipScheduledCallSettingsAction.kt */
    public static final class f implements zxw0 {
        public static final f b = new f();
    }

    /* compiled from: VoipScheduledCallSettingsAction.kt */
    public static final class g implements zxw0 {
        public static final g b = new g();
    }

    /* compiled from: VoipScheduledCallSettingsAction.kt */
    public static final class h implements zxw0 {
        public static final h b = new h();
    }

    /* compiled from: VoipScheduledCallSettingsAction.kt */
    public static final class i implements zxw0 {
        public static final i b = new i();
    }

    /* compiled from: VoipScheduledCallSettingsAction.kt */
    public static final class j implements zxw0 {
        public static final j b = new j();
    }

    /* compiled from: VoipScheduledCallSettingsAction.kt */
    public static final class k implements zxw0 {
        public static final k b = new k();
    }

    /* compiled from: VoipScheduledCallSettingsAction.kt */
    public static final class l implements zxw0 {
        public final ScheduledVideoMuteOption b;

        public l(ScheduledVideoMuteOption scheduledVideoMuteOption) {
            this.b = scheduledVideoMuteOption;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && this.b == ((l) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "UpdateCamerasOption(muteOption=" + this.b + ')';
        }
    }

    /* compiled from: VoipScheduledCallSettingsAction.kt */
    public static final class m implements zxw0 {
        public final ScheduledAudioMuteOption b;

        public m(ScheduledAudioMuteOption scheduledAudioMuteOption) {
            this.b = scheduledAudioMuteOption;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && this.b == ((m) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "UpdateMicrophonesOption(muteOption=" + this.b + ')';
        }
    }
}
