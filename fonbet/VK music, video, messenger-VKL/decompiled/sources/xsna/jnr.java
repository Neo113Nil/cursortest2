package xsna;

import com.vk.video.ui.discovery.minimizable.motion.touches.TouchActionInfo;
import java.util.List;

/* compiled from: FixedTouchesScrollTarget.kt */
/* loaded from: classes7.dex */
public interface jnr {
    default List<TouchActionInfo.Direction> getAllowedScrollDirections() {
        return TouchActionInfo.Direction.h();
    }
}
