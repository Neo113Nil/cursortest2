package xsna;

import com.vk.video.ui.share.api.ShareItemType;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ShareBottomSheet.kt */
/* loaded from: classes7.dex */
public final class e7j0 {

    /* compiled from: ShareBottomSheet.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShareItemType.values().length];
            try {
                iArr[ShareItemType.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShareItemType.EPISODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ShareItemType.CLIP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ShareItemType.VIDEO_PLAYLIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ShareItemType.LINK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int a(ShareItemType shareItemType) {
        int i = a.$EnumSwitchMapping$0[shareItemType.ordinal()];
        if (i == 1 || i == 2) {
            return 30;
        }
        if (i == 3) {
            return 7;
        }
        if (i == 4) {
            return 50;
        }
        if (i == 5) {
            return 11;
        }
        throw new NoWhenBranchMatchedException();
    }
}
