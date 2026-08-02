package xsna;

import com.vk.api.generated.messages.dto.MessagesScheduledCallItemDto;

/* compiled from: VoipInviteToScheduledCallViewState.kt */
/* loaded from: classes7.dex */
public final class erw0 implements ao50 {
    public final fi50 a;

    /* compiled from: VoipInviteToScheduledCallViewState.kt */
    public static final class a {
        public final String a;
        public final String b;
        public final String c;
        public final MessagesScheduledCallItemDto d;

        public a(String str, String str2, String str3, MessagesScheduledCallItemDto messagesScheduledCallItemDto) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = messagesScheduledCallItemDto;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            int a = urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
            MessagesScheduledCallItemDto messagesScheduledCallItemDto = this.d;
            return a + (messagesScheduledCallItemDto == null ? 0 : messagesScheduledCallItemDto.hashCode());
        }

        public final String toString() {
            return "Content(link=" + this.a + ", title=" + this.b + ", scheduledTimeSubtitle=" + this.c + ", dto=" + this.d + ')';
        }
    }

    /* compiled from: VoipInviteToScheduledCallViewState.kt */
    public static final class b implements fm50<arw0> {
        public final yzt0<c> a;
        public final yzt0<a> b;
        public final yzt0<d> c;

        public b(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
        }
    }

    /* compiled from: VoipInviteToScheduledCallViewState.kt */
    public static final class c {
        public final boolean a;

        public c(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("Loading(isVisible="), this.a, ')');
        }
    }

    /* compiled from: VoipInviteToScheduledCallViewState.kt */
    public static final class d {
        public final boolean a;

        public d(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a == ((d) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("ViewState(isVisibleQRBtn="), this.a, ')');
        }
    }

    public erw0(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
