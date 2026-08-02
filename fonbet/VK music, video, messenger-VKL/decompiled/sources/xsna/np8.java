package xsna;

import androidx.compose.material3.tokens.ColorSchemeKeyTokens;

/* compiled from: Button.kt */
/* loaded from: classes11.dex */
public final class np8 {
    public static final u890 a;
    public static final float b;
    public static final float c;
    public static final float d;

    static {
        float f = ct6.a;
        float f2 = ct6.b;
        float f3 = 16;
        float f4 = pr8.a;
        float f5 = 8;
        new u890(f, f5, f2, f5);
        new u890(f3, f5, f2, f5);
        float f6 = 12;
        a = new u890(f6, f5, f6, f5);
        new u890(f6, f5, f3, f5);
        b = 58;
        c = pr8.a;
        d = pr8.c;
    }

    public static gp8 a(t7g t7gVar) {
        gp8 gp8Var = t7gVar.W;
        if (gp8Var != null) {
            return gp8Var;
        }
        long j = l5g.j;
        gp8 gp8Var2 = new gp8(j, u7g.b(t7gVar, ColorSchemeKeyTokens.Primary), j, l5g.c(14, u7g.b(t7gVar, gco0.a), gco0.b));
        t7gVar.W = gp8Var2;
        return gp8Var2;
    }

    public static gp8 b(long j, long j2, androidx.compose.runtime.a aVar, int i) {
        long j3 = (i & 1) != 0 ? l5g.k : j;
        long j4 = l5g.k;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1402274782, 24576, -1, "androidx.compose.material3.ButtonDefaults.textButtonColors (Button.kt:770)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-561618718, 6, -1, "androidx.compose.material3.MaterialTheme.<get-colorScheme> (MaterialTheme.kt:121)");
        }
        t7g t7gVar = (t7g) aVar.r(u7g.a);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        gp8 a2 = a(t7gVar);
        if (j3 == 16) {
            j3 = a2.a;
        }
        long j5 = j3;
        long j6 = j2 != 16 ? j2 : a2.b;
        long j7 = j4 != 16 ? j4 : a2.c;
        if (j4 == 16) {
            j4 = a2.d;
        }
        gp8 gp8Var = new gp8(j5, j6, j7, j4);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return gp8Var;
    }
}
