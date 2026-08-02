package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.messages.Msg;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: MessagesHistoryProcessingLogic.kt */
/* loaded from: classes2.dex */
public interface lf20 {
    ArrayList a(Peer peer, Collection collection, int i, boolean z);

    List<Msg> b(Peer peer, List<? extends Msg> list, Boolean bool, Boolean bool2, boolean z, boolean z2);

    ArrayList c(Peer peer, List list);

    List<Msg> d(List<? extends Msg> list);
}
