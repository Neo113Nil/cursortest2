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

/* compiled from: ImportantSearchBlockBuilder.kt */
/* loaded from: classes2.dex */
public final class tqw extends inh0<PeersSearchBlock.b> {
    public final ArrayList c;
    public ProfilesSimpleInfo d;

    public tqw() {
        super(1);
        this.c = new ArrayList();
        this.d = new ProfilesSimpleInfo();
    }

    @Override // xsna.inh0
    public final void a(gcw gcwVar) {
        if (gcwVar instanceof gcw.e) {
            ImSearchLocalRequestLoggingInfo imSearchLocalRequestLoggingInfo = gcwVar.a;
            if (imSearchLocalRequestLoggingInfo != null) {
                this.b.add(imSearchLocalRequestLoggingInfo);
            }
            gcw.e eVar = (gcw.e) gcwVar;
            this.d = this.d.Ib(eVar.d);
            ArrayList<Dialog> arrayList = eVar.b;
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            for (Dialog dialog : arrayList) {
                gyh0 gyh0Var = new gyh0(dialog, null);
                Boolean bool = (Boolean) eVar.c.get(dialog.Sb());
                arrayList2.add(new a.d(gyh0Var, bool != null ? bool.booleanValue() : false));
            }
            this.c.addAll(arrayList2);
        }
    }

    @Override // xsna.inh0
    public final lnh0 c() {
        ArrayList arrayList = this.c;
        ImSearchLocalRequestLoggingInfo imSearchLocalRequestLoggingInfo = (ImSearchLocalRequestLoggingInfo) j5g.a0(this.b);
        int i = 0;
        ImSearchLocalRequestLoggingInfo b = imSearchLocalRequestLoggingInfo != null ? imSearchLocalRequestLoggingInfo.i : false ? b(arrayList.size(), ImSearchLocalRequestLoggingInfo.SearchBlock.CACHE_RECOMMENDATIONS_IMPORTANT) : e(arrayList.size(), ImSearchLocalRequestLoggingInfo.SearchBlock.CACHE_RECOMMENDATIONS_IMPORTANT);
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
                a.d dVar = (a.d) next;
                gyh0<Dialog> gyh0Var = dVar.a;
                Dialog dialog = gyh0Var.a;
                long j = dialog.Zb().d;
                gzs<s3q0> gzsVar = fkq0.a;
                UserId userId = new UserId(j);
                ImSearchItemLoggingInfo.ClickDocType.a aVar = ImSearchItemLoggingInfo.ClickDocType.Companion;
                Peer.Type bc = dialog.bc();
                aVar.getClass();
                arrayList2.add(new a.d(gyh0.a(gyh0Var, new ImSearchLocalItemLoggingInfo(b, i2, userId, ImSearchItemLoggingInfo.ClickDocType.a.a(bc))), dVar.b));
                i = i2;
            }
            arrayList = arrayList2;
        }
        return new lnh0(new PeersSearchBlock.b(arrayList), this.d);
    }

    @Override // xsna.inh0
    public final boolean d(gcw gcwVar) {
        return gcwVar instanceof gcw.e;
    }
}
