package xsna;

import android.os.Trace;
import com.vk.api.internal.LongPollCall;
import com.vk.api.internal.LongPollMode;
import com.vk.dto.common.Peer;
import java.util.List;

/* compiled from: LongPollApiCmd.kt */
/* loaded from: classes2.dex */
public final class w300 extends pfx<a> {
    public final String b;
    public final String c;
    public final long d;
    public final Peer e;
    public final long f;
    public final String g;
    public final com.vk.im.engine.internal.api_parsers.a h;

    /* compiled from: LongPollApiCmd.kt */
    public static final class a {
        public final long a;
        public final long b;
        public final List<e900> c;

        public a(List list, long j, long j2) {
            this.a = j;
            this.b = j2;
            this.c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + bh10.a(Long.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Response(ts=");
            sb.append(this.a);
            sb.append(", pts=");
            sb.append(this.b);
            sb.append(", events=");
            return ms9.a(')', sb, this.c);
        }
    }

    public w300(String str, String str2, long j, Peer peer, long j2, String str3, com.vk.im.engine.internal.api_parsers.a aVar) {
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = peer;
        this.f = j2;
        this.g = str3;
        this.h = aVar;
        if (drm0.N(str)) {
            throw new IllegalArgumentException("Illegal serverUrl value: ".concat(str).toString());
        }
        if (drm0.N(str2)) {
            throw new IllegalArgumentException("Illegal key value: ".concat(str2).toString());
        }
        if (j < 0) {
            throw new IllegalArgumentException(defpackage.k0.a(j, "Illegal ts value: ").toString());
        }
        if (!peer.Ab(Peer.Type.USER) && !peer.Ab(Peer.Type.GROUP)) {
            throw new IllegalArgumentException(yq.b(peer, "Illegal currentUserId value: ").toString());
        }
    }

    @Override // xsna.pfx
    public final a g(wy2 wy2Var) {
        Peer peer = this.e;
        Trace.beginSection(ndp0.f("LongPollApiCmd.onExec"));
        try {
            return (a) wy2Var.n(new LongPollCall("https://" + this.b, i(), this.f, new l8g0(Long.valueOf(peer.b), Boolean.FALSE, this.g, 8), LongPollCall.Type.POST), new x300(peer, this.h));
        } finally {
            Trace.endSection();
        }
    }

    public final String i() {
        long j = this.f / 1000;
        int i = 0;
        for (LongPollMode longPollMode : LongPollMode.values()) {
            i |= longPollMode.h();
        }
        StringBuilder sb = new StringBuilder("act=a_check&key=");
        sb.append(this.c);
        sb.append("&ts=");
        sb.append(this.d);
        tj0.d(sb, "&wait=", j, "&mode=");
        return h5s.c(i, "&version=21", sb);
    }

    public final String toString() {
        return "LongPollApiCmd(serverUrl='" + this.b + "', key='" + this.c + "', ts=" + this.d + ", currentUserId=" + this.e + ", isAwaitNetwork=false)";
    }
}
