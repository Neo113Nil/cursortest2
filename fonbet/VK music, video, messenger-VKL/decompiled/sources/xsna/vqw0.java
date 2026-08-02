package xsna;

import com.vk.api.generated.messages.dto.MessagesScheduledCallItemDto;

/* compiled from: VoipInviteToScheduledCallPatch.kt */
/* loaded from: classes7.dex */
public interface vqw0 extends xl50 {

    /* compiled from: VoipInviteToScheduledCallPatch.kt */
    public static final class a implements vqw0 {
        public final boolean b;

        public a(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.b == ((a) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("Loading(isVisible="), this.b, ')');
        }
    }

    /* compiled from: VoipInviteToScheduledCallPatch.kt */
    public static final class b implements vqw0 {
        public final String b;
        public final String c;
        public final String d;
        public final MessagesScheduledCallItemDto e;

        public b(String str, String str2, String str3, MessagesScheduledCallItemDto messagesScheduledCallItemDto) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = messagesScheduledCallItemDto;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
        }

        public final String toString() {
            return "SetContent(link=" + this.b + ", title=" + this.c + ", scheduledTimeSubtitle=" + this.d + ", dto=" + this.e + ')';
        }
    }

    /* compiled from: VoipInviteToScheduledCallPatch.kt */
    public static final class c implements vqw0 {
        public final boolean b;

        public c(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.b == ((c) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("SetQRBtnViewState(isVisible="), this.b, ')');
        }
    }
}
