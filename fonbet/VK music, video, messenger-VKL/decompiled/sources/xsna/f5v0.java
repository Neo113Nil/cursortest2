package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.modal.Mode;

/* compiled from: VkModalDefaults.kt */
/* loaded from: classes17.dex */
public final class f5v0 {
    public static final uog0 a = vog0.b(20);
    public static final uog0 b;
    public static final uog0 c;
    public static final uog0 d;

    /* compiled from: VkModalDefaults.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Mode.values().length];
            try {
                iArr[Mode.FullScreen.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Mode.DynamicHeight.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Mode.Card.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        float f = 12;
        uog0 d2 = vog0.d(f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12);
        b = d2;
        c = d2;
        d = vog0.b(10);
    }
}
