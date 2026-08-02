package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.search.SearchEntrypoint;
import com.vk.im.engine.models.users.User;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.q1r0;

/* compiled from: PeerGlobalSearchLoadCmd.kt */
/* loaded from: classes2.dex */
public final class tt90 extends le6<a> {
    public final String b;
    public final int c;
    public final String d;
    public final SearchEntrypoint e;

    /* compiled from: PeerGlobalSearchLoadCmd.kt */
    public static final class a {
        public final List<zpp<User>> a;
        public final boolean b;

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
            return epx.f(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Result(users=");
            sb.append(this.a);
            sb.append(", fullResult=");
            return defpackage.q0.a(sb, this.b, ')');
        }

        public a(List<zpp<User>> list, boolean z) {
            this.a = list;
            this.b = z;
        }

        public a(int i) {
            this(EmptyList.b, true);
        }
    }

    public tt90(String str, int i, String str2, SearchEntrypoint searchEntrypoint) {
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = searchEntrypoint;
    }

    @Override // xsna.le6
    public final a e(w2w w2wVar) {
        if (this.b.length() == 0) {
            return new a(0);
        }
        Serializer.c<Peer> cVar = Peer.CREATOR;
        q1r0.a aVar = (q1r0.a) w2wVar.L0(this, new q1r0(this.b, 0, this.c, Peer.Unknown.e, null, this.d, this.e));
        return new a(aVar.b, aVar.a <= 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tt90)) {
            return false;
        }
        tt90 tt90Var = (tt90) obj;
        return epx.f(this.b, tt90Var.b) && this.c == tt90Var.c && epx.f(this.d, tt90Var.d) && this.e == tt90Var.e;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.e.hashCode() + urd0.a(shy.a(0, shy.a(this.c, this.b.hashCode() * 31, 31), 31), 31, this.d);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "PeerGlobalSearchLoadCmd(query=" + this.b + ", limit=" + this.c + ", offset=0, searchQuid=" + this.d + ", searchScreenRef=" + this.e + ')';
    }
}
