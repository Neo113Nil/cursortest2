package xsna;

import com.vk.voip.api.id.CallId;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.prodstat.analytics.base.screen.VoipAnalyticsEventScreen;

/* compiled from: CallParticipantsViewAction.kt */
/* loaded from: classes7.dex */
public abstract class q89 {

    /* compiled from: CallParticipantsViewAction.kt */
    public static final class a extends q89 {
        public static final a a = new a();
    }

    /* compiled from: CallParticipantsViewAction.kt */
    public static final class b extends q89 {
        public final boolean a;

        public b(boolean z) {
            this.a = z;
        }
    }

    /* compiled from: CallParticipantsViewAction.kt */
    public static final class c extends q89 {
        public static final c a = new c();
    }

    /* compiled from: CallParticipantsViewAction.kt */
    public static final class d extends q89 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1856474406;
        }

        public final String toString() {
            return "OpenConfirmAddUsersToCallDialog";
        }
    }

    /* compiled from: CallParticipantsViewAction.kt */
    public static final class e extends q89 {
        public final String a;

        public e(String str) {
            this.a = str;
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
            return "OpenFinishCallForAllModalDialog(screen=" + ((Object) VoipAnalyticsEventScreen.d(this.a)) + ')';
        }
    }

    /* compiled from: CallParticipantsViewAction.kt */
    public static final class f extends q89 {
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
            return "OpenParticipantSettings(id=" + this.a + ')';
        }
    }

    /* compiled from: CallParticipantsViewAction.kt */
    public static final class g extends q89 {
        public static final g a = new g();
    }

    /* compiled from: CallParticipantsViewAction.kt */
    public static final class h extends q89 {
        public final String a;

        public h(String str) {
            this.a = str;
        }

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

    /* compiled from: CallParticipantsViewAction.kt */
    public static final class i extends q89 {
        public static final i a = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 1678534807;
        }

        public final String toString() {
            return "OpenSettingsShareLinkPagerDialog";
        }
    }

    /* compiled from: CallParticipantsViewAction.kt */
    public static final class j extends q89 {
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

    /* compiled from: CallParticipantsViewAction.kt */
    public static final class k extends q89 {
        public static final k a = new k();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return -689552581;
        }

        public final String toString() {
            return "ShowLowerHandsForAllNotification";
        }
    }

    /* compiled from: CallParticipantsViewAction.kt */
    public static final class l extends q89 {
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

    /* compiled from: CallParticipantsViewAction.kt */
    public static final class m extends q89 {
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
