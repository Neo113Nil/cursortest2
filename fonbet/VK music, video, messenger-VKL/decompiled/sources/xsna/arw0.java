package xsna;

import com.vk.api.generated.messages.dto.MessagesScheduledCallItemDto;

/* compiled from: VoipInviteToScheduledCallState.kt */
/* loaded from: classes7.dex */
public final class arw0 implements km50 {
    public final b b;
    public final a c;
    public final c d;

    /* compiled from: VoipInviteToScheduledCallState.kt */
    public static final class a {
        public final String a;
        public final String b;
        public final String c;
        public final MessagesScheduledCallItemDto d;

        public a() {
            this(0);
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

        public /* synthetic */ a(int i) {
            this("", "", "", null);
        }

        public a(String str, String str2, String str3, MessagesScheduledCallItemDto messagesScheduledCallItemDto) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = messagesScheduledCallItemDto;
        }
    }

    /* compiled from: VoipInviteToScheduledCallState.kt */
    public static final class b {
        public final boolean a;

        public b() {
            this(true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("Loading(isVisible="), this.a, ')');
        }

        public b(boolean z) {
            this.a = z;
        }
    }

    /* compiled from: VoipInviteToScheduledCallState.kt */
    public static final class c {
        public final boolean a;

        public c() {
            this(false);
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
            return defpackage.q0.a(new StringBuilder("ViewState(isVisibleQRBtn="), this.a, ')');
        }

        public c(boolean z) {
            this.a = z;
        }
    }

    public arw0() {
        this(0);
    }

    public static arw0 a(arw0 arw0Var, b bVar, a aVar, c cVar, int i) {
        if ((i & 1) != 0) {
            bVar = arw0Var.b;
        }
        if ((i & 2) != 0) {
            aVar = arw0Var.c;
        }
        if ((i & 4) != 0) {
            cVar = arw0Var.d;
        }
        arw0Var.getClass();
        return new arw0(bVar, aVar, cVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof arw0)) {
            return false;
        }
        arw0 arw0Var = (arw0) obj;
        return epx.f(this.b, arw0Var.b) && epx.f(this.c, arw0Var.c) && epx.f(this.d, arw0Var.d);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d.a) + ((this.c.hashCode() + (Boolean.hashCode(this.b.a) * 31)) * 31);
    }

    public final String toString() {
        return "VoipInviteToScheduledCallState(loading=" + this.b + ", content=" + this.c + ", viewState=" + this.d + ')';
    }

    public arw0(b bVar, a aVar, c cVar) {
        this.b = bVar;
        this.c = aVar;
        this.d = cVar;
    }

    public /* synthetic */ arw0(int i) {
        this(new b(true), new a(0), new c(false));
    }
}
