package xsna;

import androidx.compose.material3.tokens.TypographyKeyTokens;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: Typography.kt */
/* loaded from: classes11.dex */
public final class evp0 {
    public static final iyk0 a = new iyk0(new pkd0(8));

    /* compiled from: Typography.kt */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TypographyKeyTokens.values().length];
            try {
                iArr[TypographyKeyTokens.DisplayLarge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TypographyKeyTokens.DisplayMedium.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TypographyKeyTokens.DisplaySmall.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TypographyKeyTokens.HeadlineLarge.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TypographyKeyTokens.HeadlineMedium.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TypographyKeyTokens.HeadlineSmall.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TypographyKeyTokens.TitleLarge.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[TypographyKeyTokens.TitleMedium.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[TypographyKeyTokens.TitleSmall.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[TypographyKeyTokens.BodyLarge.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[TypographyKeyTokens.BodyMedium.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[TypographyKeyTokens.BodySmall.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[TypographyKeyTokens.LabelLarge.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[TypographyKeyTokens.LabelMedium.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[TypographyKeyTokens.LabelSmall.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[TypographyKeyTokens.DisplayLargeEmphasized.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[TypographyKeyTokens.DisplayMediumEmphasized.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[TypographyKeyTokens.DisplaySmallEmphasized.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[TypographyKeyTokens.HeadlineLargeEmphasized.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[TypographyKeyTokens.HeadlineMediumEmphasized.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[TypographyKeyTokens.HeadlineSmallEmphasized.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[TypographyKeyTokens.TitleLargeEmphasized.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[TypographyKeyTokens.TitleMediumEmphasized.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[TypographyKeyTokens.TitleSmallEmphasized.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[TypographyKeyTokens.BodyLargeEmphasized.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[TypographyKeyTokens.BodyMediumEmphasized.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[TypographyKeyTokens.BodySmallEmphasized.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[TypographyKeyTokens.LabelLargeEmphasized.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[TypographyKeyTokens.LabelMediumEmphasized.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[TypographyKeyTokens.LabelSmallEmphasized.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final nmo0 a(TypographyKeyTokens typographyKeyTokens, androidx.compose.runtime.a aVar) {
        nmo0 nmo0Var;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1049072145, 6, -1, "androidx.compose.material3.<get-value> (Typography.kt:524)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-942794935, 6, -1, "androidx.compose.material3.MaterialTheme.<get-typography> (MaterialTheme.kt:129)");
        }
        xup0 xup0Var = (xup0) aVar.r(a);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        switch (a.$EnumSwitchMapping$0[typographyKeyTokens.ordinal()]) {
            case 1:
                nmo0Var = xup0Var.a;
                break;
            case 2:
                nmo0Var = xup0Var.b;
                break;
            case 3:
                nmo0Var = xup0Var.c;
                break;
            case 4:
                nmo0Var = xup0Var.d;
                break;
            case 5:
                nmo0Var = xup0Var.e;
                break;
            case 6:
                nmo0Var = xup0Var.f;
                break;
            case 7:
                nmo0Var = xup0Var.g;
                break;
            case 8:
                nmo0Var = xup0Var.h;
                break;
            case 9:
                nmo0Var = xup0Var.i;
                break;
            case 10:
                nmo0Var = xup0Var.j;
                break;
            case 11:
                nmo0Var = xup0Var.k;
                break;
            case 12:
                nmo0Var = xup0Var.l;
                break;
            case 13:
                nmo0Var = xup0Var.m;
                break;
            case 14:
                nmo0Var = xup0Var.n;
                break;
            case 15:
                nmo0Var = xup0Var.o;
                break;
            case 16:
                nmo0Var = xup0Var.p;
                break;
            case 17:
                nmo0Var = xup0Var.q;
                break;
            case 18:
                nmo0Var = xup0Var.r;
                break;
            case 19:
                nmo0Var = xup0Var.s;
                break;
            case 20:
                nmo0Var = xup0Var.t;
                break;
            case 21:
                nmo0Var = xup0Var.u;
                break;
            case 22:
                nmo0Var = xup0Var.v;
                break;
            case 23:
                nmo0Var = xup0Var.w;
                break;
            case 24:
                nmo0Var = xup0Var.x;
                break;
            case 25:
                nmo0Var = xup0Var.y;
                break;
            case 26:
                nmo0Var = xup0Var.z;
                break;
            case 27:
                nmo0Var = xup0Var.A;
                break;
            case 28:
                nmo0Var = xup0Var.B;
                break;
            case 29:
                nmo0Var = xup0Var.C;
                break;
            case 30:
                nmo0Var = xup0Var.D;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return nmo0Var;
    }
}
