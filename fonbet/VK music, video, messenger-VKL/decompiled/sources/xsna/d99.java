package xsna;

import com.vk.voip.api.id.CallId;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.prodstat.analytics.base.screen.VoipAnalyticsEventScreen;

/* compiled from: CallSettingsEvent.kt */
/* loaded from: classes7.dex */
public abstract class d99 {

    /* compiled from: CallSettingsEvent.kt */
    public static final class a extends d99 {
        public static final a a = new a();
    }

    /* compiled from: CallSettingsEvent.kt */
    public static final class b extends d99 {
        public final boolean a;

        public b(boolean z) {
            this.a = z;
        }
    }

    /* compiled from: CallSettingsEvent.kt */
    public static final class c extends d99 {
        public static final c a = new c();
    }

    /* compiled from: CallSettingsEvent.kt */
    public static final class d extends d99 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1983754210;
        }

        public final String toString() {
            return "OpenConfirmAddUsersToCallDialog";
        }
    }

    /* compiled from: CallSettingsEvent.kt */
    public static final class e extends d99 {
        public final String a = "participants_manager";

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
            return "OpenFinishCallForAllModalDialog(screen=" + ((Object) VoipAnalyticsEventScreen.d(this.a)) + ')';
        }
    }

    /* compiled from: CallSettingsEvent.kt */
    public static final class f extends d99 {
        public final CallMemberId a;

        public f(CallMemberId callMemberId) {
            this.a = callMemberId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OpenParticipantActionMenu(id=" + this.a + ')';
        }
    }

    /* compiled from: CallSettingsEvent.kt */
    public static final class g extends d99 {
        public static final g a = new g();
    }

    /* compiled from: CallSettingsEvent.kt */
    public static final class h extends d99 {
        public final String a = "participants_manager";

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.a, ((h) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OpenRequestMediaAttention(screen=" + ((Object) VoipAnalyticsEventScreen.d(this.a)) + ')';
        }
    }

    /* compiled from: CallSettingsEvent.kt */
    public static final class i extends d99 {
        public static final i a = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -1404435297;
        }

        public final String toString() {
            return "OpenSettingsShareLinkPagerDialog";
        }
    }

    /* compiled from: CallSettingsEvent.kt */
    public static final class j extends d99 {
        public final CallId a;

        public j(CallId callId) {
            this.a = callId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && epx.f(this.a, ((j) obj).a);
        }

        public final int hashCode() {
            return this.a.b.hashCode();
        }

        public final String toString() {
            return "OpenShareLinkPagerDialog(callId=" + this.a + ')';
        }
    }

    /* compiled from: CallSettingsEvent.kt */
    public static final class k extends d99 {
        public static final k a = new k();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return 522444611;
        }

        public final String toString() {
            return "ShowLowerHandsForAllNotification";
        }
    }

    /* compiled from: CallSettingsEvent.kt */
    public static final class l extends d99 {
        public final boolean a;

        public l(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && this.a == ((l) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("ShowMuteMicrophonesForAllNotification(isExceptedAdmins="), this.a, ')');
        }
    }

    /* compiled from: CallSettingsEvent.kt */
    public static final class m extends d99 {
        public final boolean a;

        public m(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && this.a == ((m) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("ShowTurnOffCamerasForAllNotification(isExceptedAdmins="), this.a, ')');
        }
    }
}
