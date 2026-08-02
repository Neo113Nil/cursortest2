package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.messages.PinnedMsg;
import java.util.Collection;
import java.util.Map;

/* compiled from: DialogsEntryStorageManager.kt */
/* loaded from: classes2.dex */
public interface lnm {
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ ohm a(lnm lnmVar, long j, Collection collection, Integer num, int i) {
        if ((i & 2) != 0) {
            collection = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        return lnmVar.d(j, collection, num);
    }

    void b(Map<Long, PinnedMsg> map);

    com.vk.im.engine.models.dialogs.b c(long j);

    ohm d(long j, Collection<? extends Peer> collection, Integer num);

    int e();

    void f(int i, long j);
}
