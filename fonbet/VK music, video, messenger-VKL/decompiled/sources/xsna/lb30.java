package xsna;

import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: MotionScheme.kt */
/* loaded from: classes11.dex */
public final class lb30 {

    /* compiled from: MotionScheme.kt */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MotionSchemeKeyTokens.values().length];
            try {
                iArr[MotionSchemeKeyTokens.DefaultSpatial.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MotionSchemeKeyTokens.FastSpatial.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MotionSchemeKeyTokens.SlowSpatial.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MotionSchemeKeyTokens.DefaultEffects.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MotionSchemeKeyTokens.FastEffects.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MotionSchemeKeyTokens.SlowEffects.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final phr a(MotionSchemeKeyTokens motionSchemeKeyTokens, androidx.compose.runtime.a aVar) {
        xmk0 c;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-19828261, 6, -1, "androidx.compose.material3.value (MotionScheme.kt:288)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-506613891, 6, -1, "androidx.compose.material3.MaterialTheme.<get-motionScheme> (MaterialTheme.kt:141)");
        }
        kb30 kb30Var = (kb30) aVar.r(ym10.a);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        switch (a.$EnumSwitchMapping$0[motionSchemeKeyTokens.ordinal()]) {
            case 1:
                c = kb30Var.c();
                break;
            case 2:
                c = kb30Var.d();
                break;
            case 3:
                c = kb30Var.a();
                break;
            case 4:
                c = kb30Var.f();
                break;
            case 5:
                c = kb30Var.b();
                break;
            case 6:
                c = kb30Var.e();
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return c;
    }
}
