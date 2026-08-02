package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.common.restrictions.RestrictionButton;
import com.vk.dto.common.restrictions.VideoRestriction;

/* compiled from: DonutVideoExtenstions.kt */
/* loaded from: classes18.dex */
public final class e5o {
    public static final boolean a(VideoFile videoFile) {
        VideoRestriction O = videoFile.O();
        return O != null && b(O);
    }

    public static final boolean b(VideoRestriction videoRestriction) {
        RestrictionButton restrictionButton = videoRestriction.e;
        return epx.f(restrictionButton != null ? restrictionButton.b : null, RestrictionButton.Action.DONAT.h());
    }
}
