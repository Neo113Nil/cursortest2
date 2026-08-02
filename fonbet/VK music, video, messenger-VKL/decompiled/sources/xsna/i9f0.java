package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogsIdList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: RecentDialogsGetCmd.kt */
/* loaded from: classes2.dex */
public final class i9f0 extends le6<a> {
    public final int b;
    public final Source c;
    public final boolean d;
    public final Object e;

    /* compiled from: RecentDialogsGetCmd.kt */
    public static final class a {
        public final ArrayList a;
        public final ProfilesInfo b;
        public final long c;

        public a(ArrayList arrayList, ProfilesInfo profilesInfo, long j) {
            this.a = arrayList;
            this.b = profilesInfo;
            this.c = j;
        }
    }

    public /* synthetic */ i9f0(Source source, boolean z) {
        this(10, source, z, null);
    }

    @Override // xsna.le6
    public final a e(w2w w2wVar) {
        long currentTimeMillis = System.currentTimeMillis();
        DialogsIdList q = w2wVar.I0().v().q();
        List<Long> list = q.b;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            long longValue = ((Number) it.next()).longValue();
            Serializer.c<Peer> cVar = Peer.CREATOR;
            arrayList.add(Peer.a.b(longValue));
        }
        ipm ipmVar = (ipm) k9q0.f(w2wVar, this, new uqm(new sqm(arrayList, this.c, this.d, this.e, 0, 16)));
        long currentTimeMillis2 = System.currentTimeMillis();
        wpp<Long, Dialog> wppVar = ipmVar.a;
        List<Long> list2 = q.b;
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            Dialog dialog = (Dialog) wppVar.c.get(Long.valueOf(((Number) it2.next()).longValue()));
            if (dialog != null) {
                arrayList2.add(dialog);
            }
        }
        return new a(arrayList2, ipmVar.b, currentTimeMillis2 - currentTimeMillis);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i9f0)) {
            return false;
        }
        i9f0 i9f0Var = (i9f0) obj;
        return this.b == i9f0Var.b && this.c == i9f0Var.c && this.d == i9f0Var.d && epx.f(this.e, i9f0Var.e);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int b = qoy.b(io.reactivex.rxjava3.internal.operators.mixed.k.c(Integer.hashCode(this.b) * 31, 31, this.c), 31, this.d);
        Object obj = this.e;
        return b + (obj == null ? 0 : obj.hashCode());
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("RecentDialogsGetCmd(limit=");
        sb.append(this.b);
        sb.append(", source=");
        sb.append(this.c);
        sb.append(", awaitNetwork=");
        sb.append(this.d);
        sb.append(", changerTag=");
        return k73.c(sb, this.e, ')');
    }

    public i9f0(int i, Source source, boolean z, String str) {
        this.b = i;
        this.c = source;
        this.d = z;
        this.e = str;
    }
}
