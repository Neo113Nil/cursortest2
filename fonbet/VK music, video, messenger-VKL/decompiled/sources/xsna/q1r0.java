package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.search.SearchEntrypoint;
import com.vk.im.engine.models.users.User;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.o1r0;

/* compiled from: UsersSearchCmd.kt */
/* loaded from: classes2.dex */
public final class q1r0 extends le6<a> {
    public final String b;
    public final int c;
    public final int d;
    public final Peer e;
    public final String f;
    public final String g;
    public final SearchEntrypoint h;

    /* compiled from: UsersSearchCmd.kt */
    public static final class a {
        public final int a;
        public final ArrayList b;

        public a(int i, ArrayList arrayList) {
            this.a = i;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Result(totalCount=");
            sb.append(this.a);
            sb.append(", items=");
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.b);
        }
    }

    public q1r0(String str, int i, int i2, Peer peer, String str2, String str3, SearchEntrypoint searchEntrypoint) {
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = peer;
        this.f = str2;
        this.g = str3;
        this.h = searchEntrypoint;
        if (!peer.Ab(Peer.Type.GROUP) && !peer.Ab(Peer.Type.UNKNOWN)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.le6
    public final a e(w2w w2wVar) {
        o1r0.a aVar = (o1r0.a) bz2.c(new o1r0(this.b, this.c, this.d, this.e, this.f, this.g, this.h), "UsersGetByIdCmd");
        ArrayList arrayList = aVar.b;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((User) ((zpp) it.next()).a);
        }
        new i1r0(w2wVar.f1(), arrayList2).o(w2wVar);
        return new a(aVar.a, aVar.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1r0)) {
            return false;
        }
        q1r0 q1r0Var = (q1r0) obj;
        return epx.f(this.b, q1r0Var.b) && this.c == q1r0Var.c && this.d == q1r0Var.d && epx.f(this.e, q1r0Var.e) && epx.f(this.f, q1r0Var.f) && epx.f(this.g, q1r0Var.g) && this.h == q1r0Var.h;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int a2 = bh10.a(shy.a(this.d, shy.a(this.c, this.b.hashCode() * 31, 31), 31), 31, this.e.b);
        String str = this.f;
        return this.h.hashCode() + urd0.a((a2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.g);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "UsersSearchCmd(q=" + this.b + ", offset=" + this.c + ", count=" + this.d + ", group=" + this.e + ", fromList=" + this.f + ", searchQuid=" + this.g + ", searchScreenRef=" + this.h + ')';
    }
}
