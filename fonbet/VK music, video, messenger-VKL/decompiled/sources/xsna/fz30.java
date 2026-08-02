package xsna;

import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachDoc;
import com.vk.dto.attaches.AttachGraffiti;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.messages.MsgSyncState;
import com.vk.im.engine.internal.merge.messages.WeightStrategy;
import com.vk.im.engine.models.attaches.AttachStory;
import com.vk.im.engine.models.attaches.AttachVideo;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* compiled from: MsgSendUtils.kt */
/* loaded from: classes2.dex */
public final class fz30 {
    public static final Set<Class<? extends Object>> a = rl3.y0(new Class[]{AttachGraffiti.class, AttachImage.class, AttachStory.class, AttachDoc.class, AttachVideo.class});

    public static void a(w2w w2wVar, int i, MsgSyncState msgSyncState, AttachSyncState attachSyncState) {
        w2wVar.I0().u(new ez30(i, msgSyncState, WeightStrategy.AUTO, w2wVar, attachSyncState));
    }

    public static boolean b(List list) {
        List<Attach> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (Attach attach : list2) {
            if ((attach instanceof ddq0) && ((ddq0) attach).M() && a.contains(attach.getClass())) {
                return true;
            }
        }
        return false;
    }
}
