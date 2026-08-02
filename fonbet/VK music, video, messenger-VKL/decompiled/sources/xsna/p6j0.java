package xsna;

import androidx.compose.material3.tokens.ShapeKeyTokens;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: Shapes.kt */
/* loaded from: classes11.dex */
public final class p6j0 {
    public static final iyk0 a = new iyk0(new l9(28));

    /* compiled from: Shapes.kt */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShapeKeyTokens.values().length];
            try {
                iArr[ShapeKeyTokens.CornerExtraLarge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShapeKeyTokens.CornerExtraLargeIncreased.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ShapeKeyTokens.CornerExtraExtraLarge.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ShapeKeyTokens.CornerExtraLargeTop.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ShapeKeyTokens.CornerExtraSmall.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ShapeKeyTokens.CornerExtraSmallTop.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ShapeKeyTokens.CornerFull.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ShapeKeyTokens.CornerLarge.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ShapeKeyTokens.CornerLargeIncreased.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ShapeKeyTokens.CornerLargeEnd.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ShapeKeyTokens.CornerLargeTop.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ShapeKeyTokens.CornerMedium.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ShapeKeyTokens.CornerNone.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ShapeKeyTokens.CornerSmall.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ShapeKeyTokens.CornerLargeStart.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final r5j0 a(ShapeKeyTokens shapeKeyTokens, androidx.compose.runtime.a aVar) {
        r5j0 r5j0Var;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1629172543, 6, -1, "androidx.compose.material3.<get-value> (Shapes.kt:358)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(419509830, 6, -1, "androidx.compose.material3.MaterialTheme.<get-shapes> (MaterialTheme.kt:137)");
        }
        n6j0 n6j0Var = (n6j0) aVar.r(a);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        switch (a.$EnumSwitchMapping$0[shapeKeyTokens.ordinal()]) {
            case 1:
                r5j0Var = n6j0Var.e;
                break;
            case 2:
                r5j0Var = n6j0Var.g;
                break;
            case 3:
                r5j0Var = n6j0Var.h;
                break;
            case 4:
                r5j0Var = b(n6j0Var.e);
                break;
            case 5:
                r5j0Var = n6j0Var.a;
                break;
            case 6:
                r5j0Var = b(n6j0Var.a);
                break;
            case 7:
                r5j0Var = vog0.a;
                break;
            case 8:
                r5j0Var = n6j0Var.d;
                break;
            case 9:
                r5j0Var = n6j0Var.f;
                break;
            case 10:
                quj qujVar = n6j0Var.d;
                qco qcoVar = x5j0.i;
                r5j0Var = quj.c(qujVar, qcoVar, null, null, qcoVar, 6);
                break;
            case 11:
                r5j0Var = b(n6j0Var.d);
                break;
            case 12:
                r5j0Var = n6j0Var.c;
                break;
            case 13:
                r5j0Var = androidx.compose.ui.graphics.e.a;
                break;
            case 14:
                r5j0Var = n6j0Var.b;
                break;
            case 15:
                quj qujVar2 = n6j0Var.d;
                qco qcoVar2 = x5j0.i;
                r5j0Var = quj.c(qujVar2, null, qcoVar2, qcoVar2, null, 9);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return r5j0Var;
    }

    public static quj b(quj qujVar) {
        qco qcoVar = x5j0.i;
        return quj.c(qujVar, null, null, qcoVar, qcoVar, 3);
    }
}
