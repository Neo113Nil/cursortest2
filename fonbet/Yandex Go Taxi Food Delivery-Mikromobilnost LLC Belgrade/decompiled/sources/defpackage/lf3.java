package defpackage;

import android.util.Range;
import androidx.camera.core.impl.Timebase;

/* loaded from: classes10.dex */
public final class lf3 implements vhw0 {
    public final String a;
    public final int b;
    public final n34 c;
    public final m34 w;
    public final Timebase x;

    public lf3(String str, int i, Timebase timebase, n34 n34Var, m34 m34Var) {
        this.a = str;
        this.b = i;
        this.x = timebase;
        this.c = n34Var;
        this.w = m34Var;
    }

    @Override // defpackage.vhw0
    public final Object get() {
        Range range = this.c.a;
        sgb1.g(3, "AudioEncCfgDefaultRslvr");
        m34 m34Var = this.w;
        int b = bf3.b(156000, m34Var.d, 2, m34Var.c, 48000, range);
        j4n j4nVar = new j4n();
        j4nVar.b = -1;
        String str = this.a;
        if (str == null) {
            ny61.t("Null mimeType");
            return null;
        }
        j4nVar.a = str;
        j4nVar.b = Integer.valueOf(this.b);
        Timebase timebase = this.x;
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
