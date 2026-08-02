package xsna;

import com.vk.video.ui.share.api.ShareItemType;
import com.vk.video.ui.share.api.ShareSource;

/* compiled from: ShareStatsTracker.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class w7j0 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

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
        int[] iArr2 = new int[ShareSource.values().length];
        try {
            iArr2[ShareSource.ACTION_MENU.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[ShareSource.BUTTON.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
