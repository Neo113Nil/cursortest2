package xsna;

import com.vk.dto.common.restrictions.RestrictionButton;
import com.vk.dto.common.restrictions.VideoRestriction;
import xsna.gdt0;

/* compiled from: VideoRestrictionType.kt */
/* loaded from: classes16.dex */
public final class qdt0 {
    public static final gdt0 a(VideoRestriction videoRestriction) {
        RestrictionButton restrictionButton = videoRestriction.e;
        if (videoRestriction.f) {
            return gdt0.a.a;
        }
        if (restrictionButton == null) {
            return null;
        }
        VideoRestriction.SupportedAction.Companion.getClass();
        if (!VideoRestriction.SupportedAction.a.a(restrictionButton) || epx.f(restrictionButton.b, VideoRestriction.SupportedAction.PLAY.i())) {
            return null;
        }
        return gdt0.b.a;
    }
}
