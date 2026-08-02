package xsna;

import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.users.User;
import com.vk.im.ui.components.msg_search.analytics.ImSearchItemLoggingInfo;
import com.vk.im.ui.components.msg_search.analytics.ImSearchNetworkItemLoggingInfo;
import com.vk.im.ui.components.msg_search.domain.model.PeersSearchBlock;
import com.vk.im.ui.components.msg_search.domain.model.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.gcw;

/* compiled from: GlobalUsersSearchBlockBuilder.kt */
/* loaded from: classes2.dex */
public final class o2u extends inh0<PeersSearchBlock.a> {
    public final ArrayList c;
    public ProfilesSimpleInfo d;

    public o2u() {
        super(3);
        this.c = new ArrayList();
        this.d = new ProfilesSimpleInfo();
    }

    @Override // xsna.inh0
    public final void a(gcw gcwVar) {
        if (gcwVar instanceof gcw.d) {
            gcw.d dVar = (gcw.d) gcwVar;
            this.d = this.d.Ib(dVar.c);
            List<zpp<User>> list = dVar.b;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                zpp zppVar = (zpp) it.next();
                arrayList.add(new a.c(new gyh0(zppVar.a, new ImSearchNetworkItemLoggingInfo(ImSearchItemLoggingInfo.ClickDocType.USER, zppVar.b, null, 4, null))));
            }
            this.c.addAll(arrayList);
        }
    }

    @Override // xsna.inh0
    public final lnh0 c() {
        return new lnh0(new PeersSearchBlock.a(this.c), this.d);
    }

    @Override // xsna.inh0
    public final boolean d(gcw gcwVar) {
        return gcwVar instanceof gcw.d;
    }
}
