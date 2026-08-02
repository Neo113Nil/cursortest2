package xsna;

import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledAudioMuteOption;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledVideoMuteOption;

/* compiled from: VoipScheduledCallSettingsNavigationEvent.kt */
/* loaded from: classes7.dex */
public interface fyw0 {

    /* compiled from: VoipScheduledCallSettingsNavigationEvent.kt */
    public static final class a implements fyw0 {
        public static final a a = new a();
    }

    /* compiled from: VoipScheduledCallSettingsNavigationEvent.kt */
    public static final class b implements fyw0 {
        public static final b a = new b();
    }

    /* compiled from: VoipScheduledCallSettingsNavigationEvent.kt */
    public static final class c implements fyw0 {
        public final ScheduledAudioMuteOption a;

        public c(ScheduledAudioMuteOption scheduledAudioMuteOption) {
            this.a = scheduledAudioMuteOption;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OpenAudioSelectionDialog(initialOption=" + this.a + ')';
        }
    }

    /* compiled from: VoipScheduledCallSettingsNavigationEvent.kt */
    public static final class d implements fyw0 {
        public final ScheduledVideoMuteOption a;

        public d(ScheduledVideoMuteOption scheduledVideoMuteOption) {
            this.a = scheduledVideoMuteOption;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a == ((d) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OpenVideoSelectionDialog(initialOption=" + this.a + ')';
        }
    }
}
