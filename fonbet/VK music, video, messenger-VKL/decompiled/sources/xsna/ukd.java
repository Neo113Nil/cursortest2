package xsna;

import com.vk.core.files.PrivateLocation$Guaranteed;
import com.vk.toggle.data.ClipsCacheLocationConfig;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ClipsCacheLocationConfig.kt */
/* loaded from: classes.dex */
public final class ukd {

    /* compiled from: ClipsCacheLocationConfig.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipsCacheLocationConfig.Location.values().length];
            try {
                iArr[ClipsCacheLocationConfig.Location.INTERNAL_STORAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipsCacheLocationConfig.Location.SD_CARD_OR_EXTERNAL_OR_INTERNAL_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClipsCacheLocationConfig.Location.INTERNAL_CACHE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ClipsCacheLocationConfig.Location.SD_CARD_OR_EXTERNAL_OR_INTERNAL_STORAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final PrivateLocation$Guaranteed a(ClipsCacheLocationConfig.Location location) {
        int i = a.$EnumSwitchMapping$0[location.ordinal()];
        if (i == 1) {
            return PrivateLocation$Guaranteed.INTERNAL_STORAGE;
        }
        if (i == 2) {
            return PrivateLocation$Guaranteed.SD_CARD_OR_EXTERNAL_OR_INTERNAL_CACHE;
        }
        if (i == 3) {
            return PrivateLocation$Guaranteed.INTERNAL_CACHE;
        }
        if (i == 4) {
            return PrivateLocation$Guaranteed.SD_CARD_OR_EXTERNAL_OR_INTERNAL_STORAGE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
