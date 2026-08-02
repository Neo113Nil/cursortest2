package xsna;

import com.vk.core.compose.component.tile.Tile$BottomPaddingPreset;
import com.vk.core.compose.component.tile.Tile$TextAlignment;
import com.vk.core.compose.component.tile.Tile$TextSize;
import com.vk.core.compose.component.tile.Tile$VisualAndTextGap;
import com.vk.core.compose.component.tile.TileContentType;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: TileDefaults.kt */
/* loaded from: classes17.dex */
public final class cto0 {

    /* compiled from: TileDefaults.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;

        static {
            int[] iArr = new int[TileContentType.values().length];
            try {
                iArr[TileContentType.Avatar.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TileContentType.Other.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Tile$BottomPaddingPreset.values().length];
            try {
                iArr2[Tile$BottomPaddingPreset.Default.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Tile$BottomPaddingPreset.Grid3Columns.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Tile$BottomPaddingPreset.Grid2Columns.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Tile$VisualAndTextGap.values().length];
            try {
                iArr3[Tile$VisualAndTextGap.Default.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[Tile$VisualAndTextGap.Grid2Or3Columns.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[Tile$TextSize.values().length];
            try {
                iArr4[Tile$TextSize.Small.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr4[Tile$TextSize.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[Tile$TextAlignment.values().length];
            try {
                iArr5[Tile$TextAlignment.Start.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr5[Tile$TextAlignment.Center.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$4 = iArr5;
        }
    }

    public static float a(TileContentType tileContentType, int i) {
        float f;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-2145647694, i, -1, "com.vk.core.compose.component.tile.TileDefaults.horizontalPadding (TileDefaults.kt:24)");
        }
        int i2 = a.$EnumSwitchMapping$0[tileContentType.ordinal()];
        if (i2 == 1) {
            f = kqu0.r;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f = kqu0.s;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return f;
    }

    public static long b(androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1689190024, 6, -1, "com.vk.core.compose.component.tile.TileDefaults.subtitleDefaultIconTint (TileDefaults.kt:156)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
        }
        ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        long j = ylu0Var.getIcon().l;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return j;
    }

    public static frv0 c(Tile$TextAlignment tile$TextAlignment, androidx.compose.runtime.a aVar) {
        frv0 frv0Var;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(490593623, 384, -1, "com.vk.core.compose.component.tile.TileDefaults.subtitleTextStyle (TileDefaults.kt:95)");
        }
        aVar.K(-498761450);
        int i = a.$EnumSwitchMapping$4[tile$TextAlignment.ordinal()];
        if (i == 1) {
            aVar.K(-985917761);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) aVar.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0Var = wuv0Var.i0;
            aVar.j();
        } else {
            if (i != 2) {
                throw alb0.c(-985920100, aVar);
            }
            aVar.K(-985915553);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var2 = (wuv0) aVar.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0Var = wuv0Var2.C0;
            aVar.j();
        }
        aVar.j();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return frv0Var;
    }

    public static u890 d(TileContentType tileContentType, androidx.compose.runtime.a aVar, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1901954774, i, -1, "com.vk.core.compose.component.tile.TileDefaults.tilePadding (TileDefaults.kt:16)");
        }
        int i2 = i >> 3;
        int i3 = (i & 14) | (i2 & 112);
        float a2 = a(tileContentType, i3);
        int i4 = (i >> 6) & 14;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-902559852, i4, -1, "com.vk.core.compose.component.tile.TileDefaults.topPadding (TileDefaults.kt:34)");
        }
        float f = kqu0.a;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        float f2 = kqu0.r;
        float a3 = a(tileContentType, i3);
        int i5 = i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(118683819, i5, -1, "com.vk.core.compose.component.tile.TileDefaults.bottomPadding (TileDefaults.kt:41)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        u890 u890Var = new u890(a2, f2, a3, kqu0.t);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return u890Var;
    }
}
