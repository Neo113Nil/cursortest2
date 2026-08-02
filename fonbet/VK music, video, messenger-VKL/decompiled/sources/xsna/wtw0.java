package xsna;

/* compiled from: VoipParticipantSettingsNotificationEvent.kt */
/* loaded from: classes7.dex */
public interface wtw0 {

    /* compiled from: VoipParticipantSettingsNotificationEvent.kt */
    public static final class a implements wtw0 {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("MuteParticipantMicrophone(name="), this.a, ')');
        }
    }

    /* compiled from: VoipParticipantSettingsNotificationEvent.kt */
    public static final class b implements wtw0 {
        public final String a;

        public b(String str) {
            this.a = str;
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
            return ho8.a(new StringBuilder("TurnOffParticipantCamera(name="), this.a, ')');
        }
    }
}
