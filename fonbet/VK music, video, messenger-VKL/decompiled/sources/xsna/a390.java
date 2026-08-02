package xsna;

import com.vk.dto.common.restrictions.RestrictionButton;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;

/* compiled from: OverlayRestrictionMapper.kt */
/* loaded from: classes3.dex */
public final class a390 {

    /* compiled from: OverlayRestrictionMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoOverlayView.VideoRestrictionSize.values().length];
            try {
                iArr[VideoOverlayView.VideoRestrictionSize.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoOverlayView.VideoRestrictionSize.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoOverlayView.VideoRestrictionSize.UNDEFINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final com.vk.libvideo.design.view.overlay.b a(VideoRestriction videoRestriction) {
        String str = videoRestriction.b;
        String str2 = videoRestriction.c;
        boolean z = videoRestriction.d;
        boolean z2 = videoRestriction.f;
        RestrictionButton restrictionButton = videoRestriction.e;
        return new com.vk.libvideo.design.view.overlay.b(str, str2, z, z2, restrictionButton != null ? restrictionButton.c : null, restrictionButton != null ? restrictionButton.b : null, false, new p0r(this, videoRestriction), new do7(this, videoRestriction));
    }
}
