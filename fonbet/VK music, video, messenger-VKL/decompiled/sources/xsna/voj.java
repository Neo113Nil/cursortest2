package xsna;

import androidx.compose.runtime.a;

/* compiled from: ContextMenuScreenContent.kt */
/* loaded from: classes18.dex */
public final class voj implements znj {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;

    public voj(boolean z, String str) {
        this.b = z;
        this.c = str;
    }

    @Override // xsna.znj
    public final void g(znj znjVar, androidx.compose.runtime.a aVar, int i) {
        znj znjVar2;
        androidx.compose.runtime.a M = aVar.M(-514162451);
        int i2 = (M.J(znjVar) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-514162451, i2, -1, "com.vk.design.demo.presentation.screens.simpleMenuItem.<no name provided>.Content (ContextMenuScreenContent.kt:1394)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new a44(11);
                M.R(x);
            }
            znjVar2 = znjVar;
            aou0.d(znjVar2, (gzs) x, null, null, this.b, null, nzo.d(3072, 6, M, this.c, false), null, M, (i2 & 14) | 48, 86);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            znjVar2 = znjVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new o9d(this, znjVar2, i, 3);
        }
    }
}
