package xsna;

import com.vk.ecomm.market.good.good2.presentation.IslandPart;
import kotlin.NoWhenBranchMatchedException;
import xsna.kjf0;

/* compiled from: ProductCardListItemExt.kt */
/* loaded from: classes18.dex */
public final class hld0 {

    /* compiled from: ProductCardListItemExt.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IslandPart.values().length];
            try {
                iArr[IslandPart.Top.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IslandPart.Middle.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IslandPart.Bottom.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IslandPart.TopBottom.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[IslandPart.None.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final kjf0.a a(gld0 gld0Var, int i) {
        IslandPart islandPart;
        if (gld0Var == null || (islandPart = gld0Var.U0()) == null) {
            islandPart = IslandPart.None;
        }
        int i2 = a.$EnumSwitchMapping$0[islandPart.ordinal()];
        if (i2 == 1) {
            return kjf0.a.b(i, gld0Var);
        }
        if (i2 == 2) {
            return kjf0.a.a(i, gld0Var);
        }
        if (i2 == 3) {
            return new kjf0.a(i, gld0Var, 4);
        }
        if (i2 == 4) {
            return kjf0.a.c(i, gld0Var);
        }
        if (i2 == 5) {
            return new kjf0.a(i, gld0Var, 0);
        }
        throw new NoWhenBranchMatchedException();
    }
}
