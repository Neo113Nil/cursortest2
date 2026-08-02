package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.internal.merge.channels.ChannelsInfoMergeTask;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.instantjobs.InstantJob;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.mdb;
import xsna.u6x;

/* compiled from: ChannelUnarchiveJob.kt */
/* loaded from: classes.dex */
public final class pdb extends u4w {
    public final ArrayList c;

    /* compiled from: ChannelUnarchiveJob.kt */
    public static final class a implements s7x<pdb> {
        @Override // xsna.s7x
        public final pdb a(ny90 ny90Var) {
            List c0 = drm0.c0(ny90Var.f("channel_id"), new String[]{StringUtils.COMMA}, 0, 6);
            ArrayList arrayList = new ArrayList(c5g.u(c0, 10));
            Iterator it = c0.iterator();
            while (it.hasNext()) {
                arrayList.add(com.vk.dto.common.b.e(Long.parseLong((String) it.next())));
            }
            return new pdb(arrayList);
        }

        @Override // xsna.s7x
        public final void b(pdb pdbVar, ny90 ny90Var) {
            String B;
            ArrayList arrayList = pdbVar.c;
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
            return "ChannelUnarchiveJob";
        }
    }

    public pdb(ArrayList arrayList) {
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
        mdb.b bVar = (mdb.b) fo50.v(new mdb(this.c), w2wVar, "ChannelUnarchiveJob.ChannelUnarchiveApiCmd", 2);
        List<cjq> a2 = bVar.a();
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
        if (!arrayList2.isEmpty()) {
            new h6o0(w2wVar).a(arrayList2);
            w2wVar.S0().a(arrayList2);
        }
        List<eeb> e = bVar.e();
        ProfilesSimpleInfo d = bVar.d();
        if (e.isEmpty()) {
            return;
        }
        new ChannelsInfoMergeTask(e, null, false, null, null, 30).n(w2wVar);
        if (d.Gb()) {
            w2wVar.f1();
        }
        bzp S0 = w2wVar.S0();
        List<eeb> list = e;
        ArrayList arrayList3 = new ArrayList(c5g.u(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList3.add(Long.valueOf(((eeb) it2.next()).a().a()));
        }
        S0.a(arrayList3);
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
        new h6o0(w2wVar).a(arrayList2);
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
        return "ChannelUnarchiveJob";
    }
}
