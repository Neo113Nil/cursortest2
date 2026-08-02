package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.im.ui.components.msg_search.analytics.ImSearchAnalytics;
import com.vk.im.ui.components.msg_search.analytics.ImSearchLocalRequestLoggingInfo;
import com.vk.im.ui.components.msg_search.domain.model.PeersSearchBlock;
import com.vk.stat.scheme.CommonSearchStat$TypeLocalSearchItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: SearchBlockBuilder.kt */
/* loaded from: classes2.dex */
public abstract class inh0<T extends PeersSearchBlock> {
    public final int a;
    public final ArrayList b = new ArrayList();

    public inh0(int i) {
        this.a = i;
    }

    public abstract void a(gcw gcwVar);

    public final ImSearchLocalRequestLoggingInfo b(int i, ImSearchLocalRequestLoggingInfo.SearchBlock searchBlock) {
        Object next;
        Iterator it = this.b.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                long j = ((ImSearchLocalRequestLoggingInfo) next).d;
                do {
                    Object next2 = it.next();
                    long j2 = ((ImSearchLocalRequestLoggingInfo) next2).d;
                    if (j < j2) {
                        next = next2;
                        j = j2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        ImSearchLocalRequestLoggingInfo imSearchLocalRequestLoggingInfo = (ImSearchLocalRequestLoggingInfo) next;
        if (imSearchLocalRequestLoggingInfo == null) {
            return null;
        }
        return ImSearchLocalRequestLoggingInfo.a(imSearchLocalRequestLoggingInfo, i, searchBlock, this.a, 151);
    }

    public abstract lnh0 c();

    public abstract boolean d(gcw gcwVar);

    public final ImSearchLocalRequestLoggingInfo e(int i, ImSearchLocalRequestLoggingInfo.SearchBlock searchBlock) {
        ImSearchLocalRequestLoggingInfo b = b(i, searchBlock);
        if (b == null) {
            return null;
        }
        CommonSearchStat$TypeLocalSearchItem commonSearchStat$TypeLocalSearchItem = new CommonSearchStat$TypeLocalSearchItem(b.b, b.c, b.d, b.e, ImSearchAnalytics.c(b.f), ImSearchAnalytics.a(b.g), b.h);
        UiTracker uiTracker = UiTracker.a;
        new iid0(UiTracker.c(), SchemeStat$TypeAction.a.b(null, null, commonSearchStat$TypeLocalSearchItem, 3)).q();
        return b;
    }
}
