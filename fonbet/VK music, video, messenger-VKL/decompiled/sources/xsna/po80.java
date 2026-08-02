package xsna;

import com.vk.voip.VoipService;
import com.vk.voip.ui.notifications.incoming.a;
import java.util.UUID;
import xsna.ko80;

/* compiled from: OngoingCallNotifier.kt */
/* loaded from: classes7.dex */
public final class po80 {
    public final VoipService a;
    public final a b;
    public final ipq0 c;
    public final uv80 d;
    public final ax0 e;
    public final yj70 f;
    public final io80 g;
    public final ko80 h;
    public final String i;
    public final lj70 j;
    public final com.vk.voip.ui.notifications.incoming.a k;

    /* compiled from: OngoingCallNotifier.kt */
    public static final class a {
        public final CharSequence a;
        public final CharSequence b;
        public final est c;

        public a(CharSequence charSequence, CharSequence charSequence2, est estVar) {
            this.a = charSequence;
            this.b = charSequence2;
            this.c = estVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c.equals(aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + u11.c(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return "Description(titleForAudioCall=" + ((Object) this.a) + ", titleForVideoCall=" + ((Object) this.b) + ", getOpponentAvatar=" + this.c + ')';
        }
    }

    /* compiled from: OngoingCallNotifier.kt */
    public final class b implements ko80.a {
        public b() {
        }

        @Override // xsna.ko80.a
        public final void a() {
            po80.this.d.invoke();
        }

        @Override // xsna.ko80.a
        public final void onAccept() {
            po80.this.c.invoke();
        }

        @Override // xsna.ko80.a
        public final void onFinish() {
            po80.this.d.invoke();
        }
    }

    public po80(VoipService voipService, a aVar, ipq0 ipq0Var, uv80 uv80Var, ax0 ax0Var, yj70 yj70Var, io80 io80Var, ko80 ko80Var) {
        this.a = voipService;
        this.b = aVar;
        this.c = ipq0Var;
        this.d = uv80Var;
        this.e = ax0Var;
        this.f = yj70Var;
        this.g = io80Var;
        this.h = ko80Var;
        String uuid = UUID.randomUUID().toString();
        this.i = uuid;
        b bVar = new b();
        this.j = new lj70(voipService);
        this.k = new com.vk.voip.ui.notifications.incoming.a(voipService, new qo80(this), new a.b(new g880(this, 1), new m960(this, 6), new cr20(this, 16)));
        ko80Var.c(uuid, bVar);
    }
}
