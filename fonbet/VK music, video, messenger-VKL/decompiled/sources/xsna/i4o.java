package xsna;

import com.vk.community.design.compose.donut.DonutUserStackSize;

/* compiled from: DonutUserStackDefaults.kt */
/* loaded from: classes17.dex */
public final class i4o {
    public static final float a = 24;
    public static final float b = 32;
    public static final uog0 c = vog0.b(48);
    public static final long d;

    /* compiled from: DonutUserStackDefaults.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DonutUserStackSize.values().length];
            try {
                iArr[DonutUserStackSize.Medium.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DonutUserStackSize.Large.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        float f = 12;
        d = byc0.b(f, f);
    }
}
