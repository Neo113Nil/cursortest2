package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.ui.components.msg_search.analytics.ImSearchItemLoggingInfo;
import com.vk.im.ui.components.msg_search.analytics.ImSearchLocalItemLoggingInfo;
import com.vk.im.ui.components.msg_search.analytics.ImSearchLocalRequestLoggingInfo;
import com.vk.im.ui.components.msg_search.domain.model.PeersSearchBlock;
import com.vk.im.ui.components.msg_search.domain.model.a;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.gcw;

/* compiled from: RecentSearchBlockBuilder.kt */
/* loaded from: classes2.dex */
public final class p9f0 extends inh0<PeersSearchBlock.c> {
    public final ArrayList c;
    public ProfilesSimpleInfo d;

    public p9f0() {
        super(2);
        this.c = new ArrayList();
        this.d = new ProfilesSimpleInfo();
    }

    @Override // xsna.inh0
    public final void a(gcw gcwVar) {
        if (gcwVar instanceof gcw.f) {
            ImSearchLocalRequestLoggingInfo imSearchLocalRequestLoggingInfo = gcwVar.a;
            if (imSearchLocalRequestLoggingInfo != null) {
                this.b.add(imSearchLocalRequestLoggingInfo);
            }
            gcw.f fVar = (gcw.f) gcwVar;
            this.d = this.d.Ib(fVar.d);
            ArrayList<Dialog> arrayList = fVar.b;
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            for (Dialog dialog : arrayList) {
                gyh0 gyh0Var = new gyh0(dialog, null);
                Boolean bool = (Boolean) fVar.c.get(dialog.Sb());
                arrayList2.add(new a.b.C1154b(gyh0Var, bool != null ? bool.booleanValue() : false));
            }
            this.c.addAll(arrayList2);
        }
    }

    @Override // xsna.inh0
    public final lnh0 c() {
        ArrayList arrayList = this.c;
        ImSearchLocalRequestLoggingInfo imSearchLocalRequestLoggingInfo = (ImSearchLocalRequestLoggingInfo) j5g.a0(this.b);
        int i = 0;
        ImSearchLocalRequestLoggingInfo b = imSearchLocalRequestLoggingInfo != null ? imSearchLocalRequestLoggingInfo.i : false ? b(arrayList.size(), ImSearchLocalRequestLoggingInfo.SearchBlock.CACHE_RECOMMENDATIONS_RECENT) : e(arrayList.size(), ImSearchLocalRequestLoggingInfo.SearchBlock.CACHE_RECOMMENDATIONS_RECENT);
        if (b != null) {
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                a.b.C1154b c1154b = (a.b.C1154b) next;
                Dialog dialog = c1154b.a.a;
                long j = dialog.Zb().d;
                gzs<s3q0> gzsVar = fkq0.a;
                UserId userId = new UserId(j);
                ImSearchItemLoggingInfo.ClickDocType.a aVar = ImSearchItemLoggingInfo.ClickDocType.Companion;
                Peer.Type bc = dialog.bc();
                aVar.getClass();
                arrayList2.add(a.b.C1154b.a(c1154b, new gyh0(dialog, new ImSearchLocalItemLoggingInfo(b, i2, userId, ImSearchItemLoggingInfo.ClickDocType.a.a(bc)))));
                i = i2;
            }
            arrayList = arrayList2;
        }
        return new lnh0(new PeersSearchBlock.c(arrayList), this.d);
    }

    @Override // xsna.inh0
    public final boolean d(gcw gcwVar) {
        return gcwVar instanceof gcw.f;
    }
}
