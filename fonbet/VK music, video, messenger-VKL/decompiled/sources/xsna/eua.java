package xsna;

import com.vk.dto.common.Peer;
import com.vk.instantjobs.InstantJob;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.u6x;
import xsna.zta;

/* compiled from: ChannelArchiveJob.kt */
/* loaded from: classes.dex */
public final class eua extends u4w {
    public final ArrayList c;

    /* compiled from: ChannelArchiveJob.kt */
    public static final class a implements s7x<eua> {
        @Override // xsna.s7x
        public final eua a(ny90 ny90Var) {
            List c0 = drm0.c0(ny90Var.f("channel_id"), new String[]{StringUtils.COMMA}, 0, 6);
            ArrayList arrayList = new ArrayList(c5g.u(c0, 10));
            Iterator it = c0.iterator();
            while (it.hasNext()) {
                arrayList.add(com.vk.dto.common.b.e(Long.parseLong((String) it.next())));
            }
            return new eua(arrayList);
        }

        @Override // xsna.s7x
        public final void b(eua euaVar, ny90 ny90Var) {
            String B;
            ArrayList arrayList = euaVar.c;
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(Long.valueOf(((Peer) it.next()).b));
            }
            B = f870.B(arrayList2, StringUtils.COMMA, null);
            ny90Var.o("channel_id", B);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "ChannelArchiveJob";
        }
    }

    public eua(ArrayList arrayList) {
        this.c = arrayList;
    }

    @Override // xsna.u4w
    public final void J(w2w w2wVar) {
        Q(w2wVar);
    }

    @Override // xsna.u4w
    public final void K(w2w w2wVar, Throwable th) {
        Q(w2wVar);
    }

    @Override // xsna.u4w
    public final void L(w2w w2wVar, u6x.a aVar) {
        List<cjq> a2 = ((zta.b) bz2.c(new zta(this.c), "ChannelArchiveApiCmd")).a();
        if (a2.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : a2) {
            Integer a3 = ((cjq) obj).b().a();
            if (a3 == null || a3.intValue() != 3) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Long.valueOf(((cjq) it.next()).a()));
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        new h6o0(w2wVar).c(arrayList2);
        w2wVar.S0().a(arrayList2);
    }

    public final void Q(w2w w2wVar) {
        ArrayList arrayList = this.c;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Long.valueOf(((Peer) it.next()).b));
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        new h6o0(w2wVar).c(arrayList2);
        w2wVar.S0().a(arrayList2);
    }

    @Override // com.vk.instantjobs.InstantJob
    public final InstantJob.NotificationHideCondition o() {
        return InstantJob.NotificationHideCondition.NEVER;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final InstantJob.NotificationShowCondition p() {
        return InstantJob.NotificationShowCondition.NEVER;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String q() {
        return sa30.p(((Peer) j5g.Y(this.c)).b);
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "ChannelArchiveJob";
    }
}
