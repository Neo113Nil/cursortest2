package xsna;

import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledAudioMuteOption;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledVideoMuteOption;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledWatchTogetherOption;
import com.vk.voip.ui.scheduled.creation.ui.settings.VoipScheduledCallSettingsConfig;
import xsna.iyw0;

/* compiled from: VoipScheduledCallSettingsPatch.kt */
/* loaded from: classes7.dex */
public interface gyw0 extends xl50 {

    /* compiled from: VoipScheduledCallSettingsPatch.kt */
    public static final class a implements gyw0 {
        public final VoipScheduledCallSettingsConfig b;

        public a(VoipScheduledCallSettingsConfig voipScheduledCallSettingsConfig) {
            this.b = voipScheduledCallSettingsConfig;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.b.hashCode();
        }

        public final String toString() {
            return "InitLoad(config=" + this.b + ')';
        }
    }

    /* compiled from: VoipScheduledCallSettingsPatch.kt */
    public static final class b implements gyw0 {
        public final boolean b;

        public b(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.b == ((b) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("UpdateAnonymousJoinEnabled(isEnabled="), this.b, ')');
        }
    }

    /* compiled from: VoipScheduledCallSettingsPatch.kt */
    public static final class c implements gyw0 {
        public final ScheduledVideoMuteOption b;

        public c(ScheduledVideoMuteOption scheduledVideoMuteOption) {
            this.b = scheduledVideoMuteOption;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.b == ((c) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "UpdateCameras(videoMuteOption=" + this.b + ')';
        }
    }

    /* compiled from: VoipScheduledCallSettingsPatch.kt */
    public static final class d implements gyw0 {
        public final boolean b;

        public d(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.b == ((d) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("UpdateChatHistory(isEnabled="), this.b, ')');
        }
    }

    /* compiled from: VoipScheduledCallSettingsPatch.kt */
    public static final class e implements gyw0 {
        public final boolean b;

        public e(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.b == ((e) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("UpdateFeedback(isEnabled="), this.b, ')');
        }
    }

    /* compiled from: VoipScheduledCallSettingsPatch.kt */
    public static final class f implements gyw0 {
        public final ScheduledAudioMuteOption b;

        public f(ScheduledAudioMuteOption scheduledAudioMuteOption) {
            this.b = scheduledAudioMuteOption;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.b == ((f) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "UpdateMicrophones(audioMuteOption=" + this.b + ')';
        }
    }

    /* compiled from: VoipScheduledCallSettingsPatch.kt */
    public static final class g implements gyw0 {
        public final boolean b;

        public g(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.b == ((g) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("UpdateRecord(isEnabled="), this.b, ')');
        }
    }

    /* compiled from: VoipScheduledCallSettingsPatch.kt */
    public static final class h implements gyw0 {
        public final iyw0.a.C3088a b;

        public h(iyw0.a.C3088a c3088a) {
            this.b = c3088a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.b, ((h) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "UpdateScreenSharing(screenSharingOption=" + this.b + ')';
        }
    }

    /* compiled from: VoipScheduledCallSettingsPatch.kt */
    public static final class i implements gyw0 {
        public final boolean b;

        public i(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.b == ((i) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("UpdateWaitingHall(isEnabled="), this.b, ')');
        }
    }

    /* compiled from: VoipScheduledCallSettingsPatch.kt */
    public static final class j implements gyw0 {
        public final ScheduledWatchTogetherOption b;

        public j(ScheduledWatchTogetherOption scheduledWatchTogetherOption) {
            this.b = scheduledWatchTogetherOption;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && epx.f(this.b, ((j) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "UpdateWatchTogether(watchTogetherOption=" + this.b + ')';
        }
    }
}
