package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.admin_change_name.VoipAdminChangeNameConfig;

/* compiled from: VoipParticipantSettingsNavigationEvent.kt */
/* loaded from: classes7.dex */
public interface utw0 {

    /* compiled from: VoipParticipantSettingsNavigationEvent.kt */
    public static final class a implements utw0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1838113944;
        }

        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: VoipParticipantSettingsNavigationEvent.kt */
    public static final class b implements utw0 {
        public final CallMemberId a;

        public b(CallMemberId callMemberId) {
            this.a = callMemberId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OpenAccessRights(callMemberId=" + this.a + ')';
        }
    }

    /* compiled from: VoipParticipantSettingsNavigationEvent.kt */
    public static final class c implements utw0 {
        public final VoipAdminChangeNameConfig a;

        public c(VoipAdminChangeNameConfig voipAdminChangeNameConfig) {
            this.a = voipAdminChangeNameConfig;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OpenChangeName(config=" + this.a + ')';
        }
    }

    /* compiled from: VoipParticipantSettingsNavigationEvent.kt */
    public static final class d implements utw0 {
        public final CallMemberId a;

        public d(CallMemberId callMemberId) {
            this.a = callMemberId;
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
            return "OpenExcludeParticipantDialog(callMemberId=" + this.a + ')';
        }
    }

    /* compiled from: VoipParticipantSettingsNavigationEvent.kt */
    public static final class e implements utw0 {
        public final UserId a;

        public e(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("OpenProfile(id="), this.a, ')');
        }
    }
}
