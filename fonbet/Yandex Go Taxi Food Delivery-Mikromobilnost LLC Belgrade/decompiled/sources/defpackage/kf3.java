package defpackage;

import android.util.Range;
import androidx.camera.core.impl.Timebase;

/* loaded from: classes10.dex */
public final class kf3 implements vhw0 {
    public final String a;
    public final Timebase b;
    public final int c;
    public final n34 w;
    public final m34 x;
    public final jzn y;

    public kf3(String str, int i, Timebase timebase, n34 n34Var, m34 m34Var, jzn jznVar) {
        this.a = str;
        this.c = i;
        this.b = timebase;
        this.w = n34Var;
        this.x = m34Var;
        this.y = jznVar;
    }

    @Override // defpackage.vhw0
    public final Object get() {
        sgb1.g(3, "AudioEncAdPrflRslvr");
        Range range = this.w.a;
        jzn jznVar = this.y;
        int a = jznVar.a();
        m34 m34Var = this.x;
        int b = bf3.b(a, m34Var.d, jznVar.b(), m34Var.c, jznVar.f(), range);
        j4n j4nVar = new j4n();
        j4nVar.b = -1;
        String str = this.a;
        if (str == null) {
            ny61.t("Null mimeType");
            return null;
        }
        j4nVar.a = str;
        j4nVar.b = Integer.valueOf(this.c);
        Timebase timebase = this.b;
        if (timebase == null) {
            ny61.t("Null inputTimebase");
            return null;
        }
        j4nVar.c = timebase;
        j4nVar.w = Integer.valueOf(m34Var.d);
        j4nVar.y = Integer.valueOf(m34Var.b);
        j4nVar.z = Integer.valueOf(m34Var.c);
        j4nVar.x = Integer.valueOf(b);
        return j4nVar.j();
    }
}
