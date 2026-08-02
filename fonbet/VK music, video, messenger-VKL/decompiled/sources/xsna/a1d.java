package xsna;

import com.vk.clips.sdk.shared.api.feed.data.activities.SdkClipActivity;

/* compiled from: ClipItemLikesAccessibilityHelper.kt */
/* loaded from: classes17.dex */
public final class a1d {

    /* compiled from: ClipItemLikesAccessibilityHelper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SdkClipActivity.OwnerSex.values().length];
            try {
                iArr[SdkClipActivity.OwnerSex.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SdkClipActivity.OwnerSex.FEMALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SdkClipActivity.OwnerSex.MALE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
