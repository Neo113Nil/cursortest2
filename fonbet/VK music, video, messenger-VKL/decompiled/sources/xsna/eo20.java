package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.core.compose.component.defaults.VkTooltipAppearance;

/* compiled from: MilkshakeTooltipDefaults.kt */
/* loaded from: classes17.dex */
public final class eo20 extends de {
    public static final float c;
    public static final float f;
    public static final float g;
    public static final long h;
    public static final float i;
    public static final eo20 b = new eo20();
    public static final float d = 48;
    public static final float e = PsExtractor.VIDEO_STREAM_MASK;
    public static final float j = 3;
    public static final int k = Integer.MAX_VALUE;

    /* compiled from: MilkshakeTooltipDefaults.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkTooltipAppearance.values().length];
            try {
                iArr[VkTooltipAppearance.Accent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkTooltipAppearance.Neutral.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VkTooltipAppearance.Inversion.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VkTooltipAppearance.InvariablyWhite.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VkTooltipAppearance.InvariableBlack.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VkTooltipAppearance.Transparent.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        float f2 = 10;
        c = f2;
        float f3 = 8;
        f = f3;
        g = f3;
        h = byc0.b(24, f3);
        i = f2;
    }
}
