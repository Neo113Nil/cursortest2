package xsna;

import com.vk.dto.video.VideoNotificationsStatus;

/* compiled from: AuthorVideoItemsLoader.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class kd5 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[VideoNotificationsStatus.values().length];
        try {
            iArr[VideoNotificationsStatus.ALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[VideoNotificationsStatus.PREFERRED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[VideoNotificationsStatus.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
