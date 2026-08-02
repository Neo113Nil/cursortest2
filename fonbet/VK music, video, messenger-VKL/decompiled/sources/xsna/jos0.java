package xsna;

import com.vk.device.store.AppStore;
import com.vk.video.growth.api.data.VideoGrowthAppStore;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VideoGrowthConfigResolverImpl.kt */
/* loaded from: classes6.dex */
public final class jos0 {

    /* compiled from: VideoGrowthConfigResolverImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AppStore.values().length];
            try {
                iArr[AppStore.GOOGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppStore.SAMSUNG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AppStore.HUAWEI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AppStore.RUSTORE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AppStore.XIAOMI.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VideoGrowthAppStore.values().length];
            try {
                iArr2[VideoGrowthAppStore.GOOGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[VideoGrowthAppStore.RUSTORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[VideoGrowthAppStore.SAMSUNG.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[VideoGrowthAppStore.HUAWEI.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[VideoGrowthAppStore.XIAOMI.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final AppStore a(VideoGrowthAppStore videoGrowthAppStore) {
        int i = a.$EnumSwitchMapping$1[videoGrowthAppStore.ordinal()];
        if (i == 1) {
            return AppStore.GOOGLE;
        }
        if (i == 2) {
            return AppStore.RUSTORE;
        }
        if (i == 3) {
            return AppStore.SAMSUNG;
        }
        if (i == 4) {
            return AppStore.HUAWEI;
        }
        if (i == 5) {
            return AppStore.XIAOMI;
        }
        throw new NoWhenBranchMatchedException();
    }
}
