package xsna;

import com.vk.voip.ui.call_list.scheduled.ScheduledScreenSharingMuteOption;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledAudioMuteOption;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledVideoMuteOption;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledWatchTogetherOption;

/* compiled from: VoipScheduledCallSettingsState.kt */
/* loaded from: classes7.dex */
public abstract class iyw0 implements km50 {

    /* compiled from: VoipScheduledCallSettingsState.kt */
    public static final class a extends iyw0 {
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final ScheduledAudioMuteOption e;
        public final ScheduledVideoMuteOption f;
        public final ScheduledWatchTogetherOption g;
        public final C3088a h;
        public final boolean i;
        public final boolean j;

        /* compiled from: VoipScheduledCallSettingsState.kt */
        /* renamed from: xsna.iyw0$a$a, reason: collision with other inner class name */
        public static final class C3088a {
            public final boolean a;
            public final ScheduledScreenSharingMuteOption b;

            public C3088a(boolean z, ScheduledScreenSharingMuteOption scheduledScreenSharingMuteOption) {
                this.a = z;
                this.b = scheduledScreenSharingMuteOption;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3088a)) {
                    return false;
                }
                C3088a c3088a = (C3088a) obj;
                return this.a == c3088a.a && this.b == c3088a.b;
            }

            public final int hashCode() {
                return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
            }

            public final String toString() {
                return "ScreenSharingOption(isScreenSharingEnabled=" + this.a + ", screenSharingMuteOption=" + this.b + ')';
            }
        }

        public a(boolean z, boolean z2, boolean z3, ScheduledAudioMuteOption scheduledAudioMuteOption, ScheduledVideoMuteOption scheduledVideoMuteOption, ScheduledWatchTogetherOption scheduledWatchTogetherOption, C3088a c3088a, boolean z4, boolean z5) {
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.e = scheduledAudioMuteOption;
            this.f = scheduledVideoMuteOption;
            this.g = scheduledWatchTogetherOption;
            this.h = c3088a;
            this.i = z4;
            this.j = z5;
        }

        public static a a(a aVar, boolean z, boolean z2, boolean z3, ScheduledAudioMuteOption scheduledAudioMuteOption, ScheduledVideoMuteOption scheduledVideoMuteOption, ScheduledWatchTogetherOption scheduledWatchTogetherOption, C3088a c3088a, boolean z4, boolean z5, int i) {
            if ((i & 1) != 0) {
                z = aVar.b;
            }
            boolean z6 = z;
            if ((i & 2) != 0) {
                z2 = aVar.c;
            }
            boolean z7 = z2;
            if ((i & 4) != 0) {
                z3 = aVar.d;
            }
            boolean z8 = z3;
            if ((i & 8) != 0) {
                scheduledAudioMuteOption = aVar.e;
            }
            ScheduledAudioMuteOption scheduledAudioMuteOption2 = scheduledAudioMuteOption;
            if ((i & 16) != 0) {
                scheduledVideoMuteOption = aVar.f;
            }
            ScheduledVideoMuteOption scheduledVideoMuteOption2 = scheduledVideoMuteOption;
            ScheduledWatchTogetherOption scheduledWatchTogetherOption2 = (i & 32) != 0 ? aVar.g : scheduledWatchTogetherOption;
            C3088a c3088a2 = (i & 64) != 0 ? aVar.h : c3088a;
            boolean z9 = (i & 128) != 0 ? aVar.i : z4;
            boolean z10 = (i & 256) != 0 ? aVar.j : z5;
            aVar.getClass();
            return new a(z6, z7, z8, scheduledAudioMuteOption2, scheduledVideoMuteOption2, scheduledWatchTogetherOption2, c3088a2, z9, z10);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h) && this.i == aVar.i && this.j == aVar.j;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.j) + qoy.b((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + qoy.b(qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d)) * 31)) * 31)) * 31)) * 31, 31, this.i);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(isWaitingHallEnabled=");
            sb.append(this.b);
            sb.append(", isAnonymousJoinEnabled=");
            sb.append(this.c);
            sb.append(", isFeedbackEnabled=");
            sb.append(this.d);
            sb.append(", audioMuteOption=");
            sb.append(this.e);
            sb.append(", videoMuteOption=");
            sb.append(this.f);
            sb.append(", isWatchTogetherOption=");
            sb.append(this.g);
            sb.append(", screenSharingMuteOption=");
            sb.append(this.h);
            sb.append(", onlyAdminCanRecord=");
            sb.append(this.i);
            sb.append(", shouldShowChatHistory=");
            return defpackage.q0.a(sb, this.j, ')');
        }
    }

    /* compiled from: VoipScheduledCallSettingsState.kt */
    public static final class b extends iyw0 {
        public static final b b = new b();
    }
}
