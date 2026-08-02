package xsna;

import com.vk.core.compose.component.defaults.SegmentSize;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: MilkshakeSegmentedControlDefaults.kt */
/* loaded from: classes17.dex */
public final class xn20 extends m5i0 {
    public static final xn20 b = new xn20();

    /* compiled from: MilkshakeSegmentedControlDefaults.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SegmentSize.values().length];
            try {
                iArr[SegmentSize.Medium.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SegmentSize.Large.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.m5i0
    public final float b(androidx.compose.runtime.a aVar) {
        aVar.K(-2007060927);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-2007060927, 0, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeSegmentedControlDefaults.indicatorBorderSize (MilkshakeSegmentedControlDefaults.kt:30)");
        }
        float f = (float) 0.5d;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return f;
    }

    @Override // xsna.m5i0
    public final long c(androidx.compose.runtime.a aVar) {
        aVar.K(-11723396);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-11723396, 0, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeSegmentedControlDefaults.indicatorColor (MilkshakeSegmentedControlDefaults.kt:37)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
        }
        ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        long j = ylu0Var.a().a;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return j;
    }

    @Override // xsna.m5i0
    public final float d(androidx.compose.runtime.a aVar) {
        aVar.K(-1955220013);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1955220013, 0, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeSegmentedControlDefaults.indicatorElevation (MilkshakeSegmentedControlDefaults.kt:33)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1412929589, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-elevation> (VkTheme.kt:170)");
        }
        squ0 squ0Var = (squ0) aVar.r(rrv0.b);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        squ0Var.getClass();
        float f = tqu0.c;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return f;
    }

    @Override // xsna.m5i0
    public final float e(SegmentSize segmentSize) {
        int i;
        int i2 = a.$EnumSwitchMapping$0[segmentSize.ordinal()];
        if (i2 == 1) {
            i = 32;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = 40;
        }
        return i;
    }

    @Override // xsna.m5i0
    public final uog0 f(androidx.compose.runtime.a aVar) {
        aVar.K(445032216);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(445032216, 0, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeSegmentedControlDefaults.segmentShape (MilkshakeSegmentedControlDefaults.kt:26)");
        }
        uog0 b2 = vog0.b(10);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return b2;
    }

    @Override // xsna.m5i0
    public final uog0 g(androidx.compose.runtime.a aVar) {
        aVar.K(840185604);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(840185604, 0, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeSegmentedControlDefaults.segmentedControlShape (MilkshakeSegmentedControlDefaults.kt:18)");
        }
        uog0 b2 = vog0.b(10);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return b2;
    }
}
