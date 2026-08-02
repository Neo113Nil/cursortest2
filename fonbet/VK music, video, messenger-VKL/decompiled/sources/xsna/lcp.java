package xsna;

import android.util.ArraySet;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.emails.Email;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: EmailsGetByIdCmd.kt */
/* loaded from: classes2.dex */
public final class lcp extends le6<wpp<Long, Email>> {
    public final ArrayList b;
    public final Source c;
    public final boolean d;
    public final Object e;

    /* compiled from: EmailsGetByIdCmd.kt */
    public static final class a {
        public final wpp<Long, Email> a;
        public final wpp<Long, Email> b;

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
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Result(emails=" + this.a + ", changes=" + this.b + ')';
        }

        public a(wpp<Long, Email> wppVar, wpp<Long, Email> wppVar2) {
            this.a = wppVar;
            this.b = wppVar2;
        }

        public /* synthetic */ a(int i) {
            this(new wpp(), new wpp());
        }
    }

    /* compiled from: EmailsGetByIdCmd.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Source.values().length];
            try {
                iArr[Source.CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Source.ACTUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Source.NETWORK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public lcp(ArrayList arrayList, Source source, boolean z, Object obj) {
        this.b = arrayList;
        this.c = source;
        this.d = z;
        this.e = obj;
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Peer peer = (Peer) it.next();
            peer.getClass();
            if (!peer.Ab(Peer.Type.EMAIL)) {
                throw new IllegalArgumentException(("Only emails should be passed to command. Got " + this.b).toString());
            }
        }
    }

    public static a f(ArrayList arrayList, w2w w2wVar) {
        ncp f = w2wVar.I0().f();
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Long.valueOf(((Peer) it.next()).d));
        }
        Map<Long, Email> c = f.c(arrayList2);
        ArraySet arraySet = new ArraySet();
        ArraySet arraySet2 = new ArraySet();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Peer peer = (Peer) it2.next();
            if (c.get(Long.valueOf(peer.d)) == null) {
                arraySet.add(Long.valueOf(peer.d));
            }
        }
        wpp wppVar = new wpp(c);
        wppVar.t(arraySet);
        wppVar.s(arraySet2);
        return new a(wppVar, new wpp());
    }

    public static a g(ArrayList arrayList, w2w w2wVar) {
        if (arrayList.isEmpty()) {
            return new a(0);
        }
        Map map = (Map) bz2.c(new kcp(arrayList), null);
        new mcp((Collection<Email>) map.values()).o(w2wVar);
        ArraySet arraySet = new ArraySet();
        ArraySet arraySet2 = new ArraySet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Peer peer = (Peer) it.next();
            if (!map.containsKey(Long.valueOf(peer.d))) {
                arraySet.add(Long.valueOf(peer.d));
            }
        }
        wpp wppVar = new wpp(map);
        wppVar.t(arraySet);
        wppVar.s(arraySet2);
        return new a(wppVar, wppVar.c());
    }

    @Override // xsna.le6
    public final wpp<Long, Email> e(w2w w2wVar) {
        a f;
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            return new wpp<>();
        }
        int i = b.$EnumSwitchMapping$0[this.c.ordinal()];
        if (i == 1) {
            f = f(arrayList, w2wVar);
        } else if (i == 2) {
            wpp<Long, Email> wppVar = f(arrayList, w2wVar).a;
            Collection<Long> a2 = wppVar.a();
            ArrayList arrayList2 = new ArrayList(c5g.u(a2, 10));
            Iterator<T> it = a2.iterator();
            while (it.hasNext()) {
                long longValue = ((Number) it.next()).longValue();
                Serializer.c<Peer> cVar = Peer.CREATOR;
                arrayList2.add(Peer.a.a(longValue, Peer.Type.EMAIL));
            }
            a g = g(arrayList2, w2wVar);
            wppVar.m(g.a);
            f = new a(wppVar, g.b);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            f = g(arrayList, w2wVar);
        }
        wpp<Long, Email> wppVar2 = f.b;
        if (!wppVar2.i()) {
            w2wVar.S0().y(this.e, wppVar2);
        }
        return f.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!lcp.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        lcp lcpVar = (lcp) obj;
        return epx.f(this.b, lcpVar.b) && this.c == lcpVar.c && this.d == lcpVar.d;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(this.d) + io.reactivex.rxjava3.internal.operators.mixed.k.c(this.b.hashCode() * 31, 31, this.c);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("EmailsGetByIdCmd(peers=");
        sb.append(this.b);
        sb.append(", source=");
        sb.append(this.c);
        sb.append(", awaitNetwork=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
