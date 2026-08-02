package xsna;

import com.vk.dto.messages.MsgSyncState;
import com.vk.im.engine.models.messages.Msg;
import java.util.Map;

/* compiled from: ChannelWeightUtils.kt */
/* loaded from: classes2.dex */
public final class deb {

    /* compiled from: ChannelWeightUtils.kt */
    public static final class a {
        public final Object a;
        public final Map<Long, bdb> b;
        public final Map<Long, lj30> c;

        public a(Map<Long, aeb> map, Map<Long, bdb> map2, Map<Long, lj30> map3) {
            this.a = map;
            this.b = map2;
            this.c = map3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + v11.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CalculateResult(weights=");
            sb.append(this.a);
            sb.append(", channels=");
            sb.append(this.b);
            sb.append(", latestMsgs=");
            return cjl0.a(sb, this.c, ')');
        }
    }

    public static aeb a(eeb eebVar, boolean z) {
        yta ytaVar = eebVar.a;
        long j = ytaVar.a;
        vjm vjmVar = ytaVar.d.b;
        Msg msg = eebVar.b;
        Msg msg2 = null;
        if (msg != null && msg.H6() && !msg.r) {
            msg2 = msg;
        }
        return new aeb(new gkx0(xo9.x(xo9.x(xo9.x(xo9.x(0L, d370.d, msg != null && msg.o == MsgSyncState.SENDING ? 1L : 0L), d370.c, z ? vjmVar.j(0).b : vjmVar.b), d370.e, msg2 != null ? (int) (msg2.g / 1000) : vjmVar.c), d370.f, msg2 != null ? msg2.b : 0)), j);
    }
}
