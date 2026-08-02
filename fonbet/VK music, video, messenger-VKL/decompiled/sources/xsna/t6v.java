package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: HintDialogsGetCmd.kt */
/* loaded from: classes2.dex */
public final class t6v extends le6<a> {
    public final int b;
    public final Source c;
    public final long d;
    public final boolean e;
    public final Object f;

    /* compiled from: HintDialogsGetCmd.kt */
    public static final class a {
        public final List<Dialog> a;
        public final ProfilesInfo b;
        public final long c;

        public a(List<Dialog> list, ProfilesInfo profilesInfo, long j) {
            this.a = list;
            this.b = profilesInfo;
            this.c = j;
        }
    }

    public /* synthetic */ t6v(long j, Source source, boolean z) {
        this(10, source, j, z, null);
    }

    @Override // xsna.le6
    public final a e(w2w w2wVar) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!k9q0.p(w2wVar)) {
            Source source = Source.CACHE;
            Source source2 = this.c;
            if (source2 != source || !w2wVar.I0().v().g()) {
                wmm.b.a(w2wVar, source2, this.d);
                List singletonList = Collections.singletonList(Long.valueOf(w2wVar.H0().b));
                czh0 v = w2wVar.I0().v();
                int i = this.b;
                List H0 = j5g.H0(j5g.R(j5g.u0(v.b(i).b, singletonList)), i);
                ArrayList arrayList = new ArrayList(c5g.u(H0, 10));
                Iterator it = H0.iterator();
                while (it.hasNext()) {
                    long longValue = ((Number) it.next()).longValue();
                    Serializer.c<Peer> cVar = Peer.CREATOR;
                    arrayList.add(Peer.a.b(longValue));
                }
                ipm ipmVar = (ipm) k9q0.f(w2wVar, this, new uqm(new sqm(arrayList, this.c, this.e, this.f, 0, 16)));
                long currentTimeMillis2 = System.currentTimeMillis();
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = H0.iterator();
                while (it2.hasNext()) {
                    long longValue2 = ((Number) it2.next()).longValue();
                    wpp<Long, Dialog> wppVar = ipmVar.a;
                    Dialog dialog = (Dialog) wppVar.c.get(Long.valueOf(longValue2));
                    if (dialog != null) {
                        arrayList2.add(dialog);
                    }
                }
                return new a(arrayList2, ipmVar.b, currentTimeMillis2 - currentTimeMillis);
            }
        }
        return new a(EmptyList.b, new ProfilesInfo(), 0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6v)) {
            return false;
        }
        t6v t6vVar = (t6v) obj;
        return this.b == t6vVar.b && this.c == t6vVar.c && this.d == t6vVar.d && this.e == t6vVar.e && epx.f(this.f, t6vVar.f);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int b = qoy.b(bh10.a(io.reactivex.rxjava3.internal.operators.mixed.k.c(Integer.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e);
        Object obj = this.f;
        return b + (obj == null ? 0 : obj.hashCode());
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("HintDialogsGetCmd(limit=");
        sb.append(this.b);
        sb.append(", source=");
        sb.append(this.c);
        sb.append(", hintsLifeTime=");
        sb.append(this.d);
        sb.append(", awaitNetwork=");
        sb.append(this.e);
        sb.append(", changerTag=");
        return k73.c(sb, this.f, ')');
    }

    public t6v(int i, Source source, long j, boolean z, String str) {
        this.b = i;
        this.c = source;
        this.d = j;
        this.e = z;
        this.f = str;
    }
}
