package xsna;

import com.vk.dto.common.VideoUrl;
import com.vk.libvideo.live.impl.activity.LivePlayerActivity;
import java.util.function.Predicate;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class kkz implements Predicate {
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i = LivePlayerActivity.M;
        return !fxc0.B().i().c().contains((VideoUrl) obj);
    }
}
