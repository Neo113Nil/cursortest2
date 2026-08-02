package xsna;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LightingColorFilter;
import android.os.Build;
import kotlin.NoWhenBranchMatchedException;
import xsna.z42;

/* compiled from: AndroidColorFilter.android.kt */
/* loaded from: classes11.dex */
public final class l52 {
    public static final d6g a(ColorFilter colorFilter) {
        int color;
        BlendMode mode;
        int ordinal;
        int i;
        if (29 > Build.VERSION.SDK_INT || !j52.d(colorFilter)) {
            if (!(colorFilter instanceof LightingColorFilter)) {
                return colorFilter instanceof ColorMatrixColorFilter ? new w6g(null, colorFilter) : new d6g(colorFilter);
            }
            LightingColorFilter lightingColorFilter = (LightingColorFilter) colorFilter;
            return new a6z(f870.c(lightingColorFilter.getColorMultiply()), f870.c(lightingColorFilter.getColorAdd()), colorFilter);
        }
        BlendModeColorFilter c = k52.c(colorFilter);
        color = c.getColor();
        long c2 = f870.c(color);
        mode = c.getMode();
        int[] iArr = z42.a.$EnumSwitchMapping$0;
        ordinal = mode.ordinal();
        switch (iArr[ordinal]) {
            case 1:
                i = 0;
                break;
            case 2:
                i = 1;
                break;
            case 3:
                i = 2;
                break;
            case 4:
                i = 3;
                break;
            case 5:
                i = 4;
                break;
            case 6:
                i = 5;
                break;
            case 7:
                i = 6;
                break;
            case 8:
                i = 7;
                break;
            case 9:
                i = 8;
                break;
            case 10:
                i = 9;
                break;
            case 11:
                i = 10;
                break;
            case 12:
                i = 11;
                break;
            case 13:
                i = 12;
                break;
            case 14:
                i = 13;
                break;
            case 15:
                i = 14;
                break;
            case 16:
                i = 15;
                break;
            case 17:
                i = 16;
                break;
            case 18:
                i = 17;
                break;
            case 19:
                i = 18;
                break;
            case 20:
                i = 19;
                break;
            case 21:
                i = 20;
                break;
            case 22:
                i = 21;
                break;
            case 23:
                i = 22;
                break;
            case 24:
                i = 23;
                break;
            case 25:
                i = 24;
                break;
            case 26:
                i = 25;
                break;
            case 27:
                i = 26;
                break;
            case 28:
                i = 27;
                break;
            case 29:
                i = 28;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new oe7(c2, i, c);
    }
}
