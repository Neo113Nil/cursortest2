package xsna;

import androidx.compose.runtime.a;

/* compiled from: Button.kt */
/* loaded from: classes11.dex */
public final class pp8 {
    public static final float a;
    public static final float b;
    public static final u890 c;

    static {
        float f = 16;
        float f2 = 8;
        new u890(f, f2, f, f2);
        a = 64;
        b = 36;
        c = new u890(f2, f2, f2, f2);
    }

    public static bcl a(float f, float f2, float f3, float f4, float f5, androidx.compose.runtime.a aVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            f = 2;
        }
        float f6 = f;
        if ((i2 & 2) != 0) {
            f2 = 8;
        }
        float f7 = f2;
        if ((i2 & 4) != 0) {
            f3 = 0;
        }
        float f8 = f3;
        if ((i2 & 8) != 0) {
            f4 = 4;
        }
        float f9 = f4;
        if ((i2 & 16) != 0) {
            f5 = 4;
        }
        float f10 = f5;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-737170518, i, -1, "androidx.compose.material.ButtonDefaults.elevation (Button.kt:374)");
        }
        boolean z = ((((i & 14) ^ 6) > 4 && aVar.n(f6)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && aVar.n(f7)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && aVar.n(f8)) || (i & 384) == 256) | ((((i & 7168) ^ 3072) > 2048 && aVar.n(f9)) || (i & 3072) == 2048) | ((((57344 & i) ^ 24576) > 16384 && aVar.n(f10)) || (i & 24576) == 16384);
        Object x = aVar.x();
        if (z || x == a.C0011a.a) {
            bcl bclVar = new bcl(f6, f7, f8, f9, f10);
            aVar.R(bclVar);
            x = bclVar;
        }
        bcl bclVar2 = (bcl) x;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return bclVar2;
    }
}
