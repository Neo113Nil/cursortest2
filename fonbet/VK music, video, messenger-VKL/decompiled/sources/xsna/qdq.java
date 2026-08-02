package xsna;

import com.vk.video.growth.api.data.VideoGrowthAppStore;
import com.vkontakte.android.R;

/* compiled from: Extensions.kt */
/* loaded from: classes6.dex */
public final class qdq {

    /* compiled from: Extensions.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoGrowthAppStore.values().length];
            try {
                iArr[VideoGrowthAppStore.GOOGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoGrowthAppStore.RUSTORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Integer a(VideoGrowthAppStore videoGrowthAppStore) {
        int i = a.$EnumSwitchMapping$0[videoGrowthAppStore.ordinal()];
        if (i == 1) {
            return Integer.valueOf(R.drawable.vk_icon_logo_google_play_28);
        }
        if (i != 2) {
            return null;
        }
        return Integer.valueOf(R.drawable.vk_icon_logo_rustore_28);
    }
}
