package xsna;

import com.vk.device.store.AppStore;
import com.vk.video.growth.api.data.VideoGrowthAppStore;
import java.util.EnumMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VideoGrowthLinksMapper.kt */
/* loaded from: classes3.dex */
public final class los0 {

    /* compiled from: VideoGrowthLinksMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

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
        }
    }

    public static EnumMap a(EnumMap enumMap) {
        VideoGrowthAppStore videoGrowthAppStore;
        EnumMap enumMap2 = new EnumMap(VideoGrowthAppStore.class);
        for (Map.Entry entry : enumMap.entrySet()) {
            int i = a.$EnumSwitchMapping$0[((AppStore) entry.getKey()).ordinal()];
            if (i == 1) {
                videoGrowthAppStore = VideoGrowthAppStore.GOOGLE;
            } else if (i == 2) {
                videoGrowthAppStore = VideoGrowthAppStore.SAMSUNG;
            } else if (i == 3) {
                videoGrowthAppStore = VideoGrowthAppStore.HUAWEI;
            } else if (i == 4) {
                videoGrowthAppStore = VideoGrowthAppStore.RUSTORE;
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                videoGrowthAppStore = VideoGrowthAppStore.XIAOMI;
            }
            enumMap2.put((EnumMap) videoGrowthAppStore, (VideoGrowthAppStore) entry.getValue());
        }
        return enumMap2;
    }
}
