package xsna;

import com.vk.clips.upload.vk.ui.impl.fragment.data.api.UploadUserInfo;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.ClipsUploadState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import java.util.Iterator;
import xsna.oap;

/* compiled from: clipsUploadStateExt.kt */
/* loaded from: classes17.dex */
public final class hif {
    public static final oap<Group, UploadUserInfo> a(ClipsUploadState.Loaded loaded) {
        Group b = b(loaded, loaded.f);
        if (b != null) {
            return new oap.a(b);
        }
        UploadUserInfo uploadUserInfo = loaded.d;
        if (uploadUserInfo != null) {
            return new oap.b(uploadUserInfo);
        }
        throw new IllegalStateException("Something went wrong: selected id isn't present in state");
    }

    public static final Group b(ClipsUploadState.Loaded loaded, UserId userId) {
        Object obj;
        Iterator it = j5g.u0(e43.m(loaded.e), loaded.c).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((Group) obj).c, userId)) {
                break;
            }
        }
        return (Group) obj;
    }
}
