package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.ui.components.msg_search.analytics.ImSearchItemLoggingInfo;
import com.vk.im.ui.components.msg_search.analytics.ImSearchLocalItemLoggingInfo;
import com.vk.im.ui.components.msg_search.analytics.ImSearchLocalRequestLoggingInfo;
import com.vk.im.ui.components.msg_search.domain.model.PeersSearchBlock;
import com.vk.im.ui.components.msg_search.domain.model.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.gcw;

/* compiled from: ContactsNoVkSearchBlockBuilder.kt */
/* loaded from: classes2.dex */
public final class lcj extends inh0<PeersSearchBlock.e> {
    public final ArrayList c;

    public lcj() {
        super(2);
        this.c = new ArrayList();
    }

    @Override // xsna.inh0
    public final void a(gcw gcwVar) {
        if (gcwVar instanceof gcw.a) {
            ImSearchLocalRequestLoggingInfo imSearchLocalRequestLoggingInfo = gcwVar.a;
            if (imSearchLocalRequestLoggingInfo != null) {
                this.b.add(imSearchLocalRequestLoggingInfo);
            }
            List<q2a0> list = ((gcw.a) gcwVar).b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((q2a0) obj).t8() == Peer.Type.UNKNOWN) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new a.C1152a(new gyh0((q2a0) it.next(), null)));
            }
            this.c.addAll(arrayList2);
        }
    }

    @Override // xsna.inh0
    public final lnh0 c() {
        ArrayList arrayList = this.c;
        ImSearchLocalRequestLoggingInfo e = e(arrayList.size(), ImSearchLocalRequestLoggingInfo.SearchBlock.LOCAL_CONTACTS_NO_VK);
        if (e != null) {
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            int i = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                gyh0<q2a0> gyh0Var = ((a.C1152a) next).a;
                long id = gyh0Var.a.id();
                gzs<s3q0> gzsVar = fkq0.a;
                arrayList2.add(new a.C1152a(gyh0.a(gyh0Var, new ImSearchLocalItemLoggingInfo(e, i2, new UserId(id), ImSearchItemLoggingInfo.ClickDocType.CONTACT))));
                i = i2;
            }
            arrayList = arrayList2;
        }
        return new lnh0(new PeersSearchBlock.e(arrayList), new ProfilesSimpleInfo());
    }

    @Override // xsna.inh0
    public final boolean d(gcw gcwVar) {
        return gcwVar instanceof gcw.a;
    }
}
