package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.ui.components.msg_search.analytics.ImSearchItemLoggingInfo;
import com.vk.im.ui.components.msg_search.analytics.ImSearchLocalItemLoggingInfo;
import com.vk.im.ui.components.msg_search.analytics.ImSearchLocalRequestLoggingInfo;
import com.vk.im.ui.components.msg_search.analytics.ImSearchNetworkItemLoggingInfo;
import com.vk.im.ui.components.msg_search.domain.model.PeersSearchBlock;
import com.vk.im.ui.components.msg_search.domain.model.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.gcw;

/* compiled from: DialogsSearchBlockBuilder.kt */
/* loaded from: classes2.dex */
public final class jvm extends inh0<PeersSearchBlock.d> {
    public final ArrayList c;
    public final ArrayList d;
    public ProfilesSimpleInfo e;
    public final iw30 f;

    public jvm() {
        super(1);
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ProfilesSimpleInfo();
        this.f = new iw30();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.inh0
    public final void a(gcw gcwVar) {
        ImSearchLocalRequestLoggingInfo imSearchLocalRequestLoggingInfo = gcwVar.a;
        if (imSearchLocalRequestLoggingInfo != null) {
            this.b.add(imSearchLocalRequestLoggingInfo);
        }
        if (gcwVar instanceof gcw.a) {
            List<q2a0> list = ((gcw.a) gcwVar).b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((q2a0) obj).t8() != Peer.Type.UNKNOWN) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new a.b.C1153a(new gyh0((q2a0) it.next(), null)));
            }
            this.d.addAll(arrayList2);
            return;
        }
        boolean z = gcwVar instanceof gcw.c;
        ArrayList arrayList3 = this.c;
        if (!z) {
            if (gcwVar instanceof gcw.b) {
                gcw.b bVar = (gcw.b) gcwVar;
                List<Dialog> list2 = bVar.b;
                ArrayList arrayList4 = new ArrayList(c5g.u(list2, 10));
                for (Dialog dialog : list2) {
                    gyh0 gyh0Var = new gyh0(dialog, null);
                    Boolean bool = (Boolean) bVar.c.get(dialog.Sb());
                    arrayList4.add(new a.b.C1154b(gyh0Var, bool != null ? bool.booleanValue() : false));
                }
                this.e = this.e.Ib(bVar.d);
                arrayList3.addAll(arrayList4);
                return;
            }
            return;
        }
        gcw.c cVar = (gcw.c) gcwVar;
        ArrayList<zpp> arrayList5 = cVar.b;
        ArrayList arrayList6 = new ArrayList(c5g.u(arrayList5, 10));
        for (zpp zppVar : arrayList5) {
            ImSearchItemLoggingInfo.ClickDocType.a aVar = ImSearchItemLoggingInfo.ClickDocType.Companion;
            T t = zppVar.a;
            Peer.Type bc = ((Dialog) t).bc();
            aVar.getClass();
            gyh0 gyh0Var2 = new gyh0(t, new ImSearchNetworkItemLoggingInfo(ImSearchItemLoggingInfo.ClickDocType.a.a(bc), zppVar.b, null, 4, null));
            Boolean bool2 = (Boolean) cVar.c.get(((Dialog) t).Sb());
            arrayList6.add(new a.b.C1154b(gyh0Var2, bool2 != null ? bool2.booleanValue() : false));
        }
        this.e = this.e.Ib(cVar.d);
        arrayList3.addAll(arrayList6);
    }

    @Override // xsna.inh0
    public final lnh0 c() {
        ImSearchItemLoggingInfo imSearchItemLoggingInfo;
        iw30 iw30Var = this.f;
        ArrayList arrayList = this.c;
        ArrayList arrayList2 = this.d;
        ProfilesSimpleInfo profilesSimpleInfo = this.e;
        iw30Var.getClass();
        ArrayList c = iw30.c(arrayList, arrayList2, profilesSimpleInfo);
        ImSearchLocalRequestLoggingInfo e = e(c.size() + arrayList.size(), ImSearchLocalRequestLoggingInfo.SearchBlock.LOCAL_DIALOGS);
        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                e43.t();
                throw null;
            }
            a.b.C1154b c1154b = (a.b.C1154b) next;
            gyh0<Dialog> gyh0Var = c1154b.a;
            Dialog dialog = gyh0Var.a;
            if (e != null) {
                long j = dialog.Zb().d;
                gzs<s3q0> gzsVar = fkq0.a;
                UserId userId = new UserId(j);
                ImSearchItemLoggingInfo.ClickDocType.a aVar = ImSearchItemLoggingInfo.ClickDocType.Companion;
                Peer.Type bc = dialog.bc();
                aVar.getClass();
                imSearchItemLoggingInfo = new ImSearchLocalItemLoggingInfo(e, i3, userId, ImSearchItemLoggingInfo.ClickDocType.a.a(bc));
            } else {
                imSearchItemLoggingInfo = gyh0Var.b;
            }
            arrayList3.add(a.b.C1154b.a(c1154b, gyh0.a(gyh0Var, imSearchItemLoggingInfo)));
            i2 = i3;
        }
        if (e != null) {
            ArrayList arrayList4 = new ArrayList(c5g.u(c, 10));
            Iterator it2 = c.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                int i4 = i + 1;
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                gyh0<q2a0> gyh0Var2 = ((a.b.C1153a) next2).a;
                q2a0 q2a0Var = gyh0Var2.a;
                int size = arrayList.size() + i4;
                long id = q2a0Var.id();
                gzs<s3q0> gzsVar2 = fkq0.a;
                arrayList4.add(new a.b.C1153a(gyh0.a(gyh0Var2, new ImSearchLocalItemLoggingInfo(e, size, new UserId(id), ImSearchItemLoggingInfo.ClickDocType.CONTACT))));
                i = i4;
            }
            c = arrayList4;
        }
        return new lnh0(new PeersSearchBlock.d(j5g.u0(c, arrayList3)), this.e);
    }

    @Override // xsna.inh0
    public final boolean d(gcw gcwVar) {
        return (gcwVar instanceof gcw.a) || (gcwVar instanceof gcw.c) || (gcwVar instanceof gcw.b);
    }
}
