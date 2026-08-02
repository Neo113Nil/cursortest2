package xsna;

import androidx.compose.runtime.a;

/* compiled from: ContextMenuScreenContent.kt */
/* loaded from: classes18.dex */
public final class soj implements znj {
    public final /* synthetic */ int b = 1;
    public final boolean c;
    public final String d;

    public soj(String str, boolean z) {
        this.d = str;
        this.c = z;
    }

    @Override // xsna.znj
    public void g(znj znjVar, androidx.compose.runtime.a aVar, int i) {
        znj znjVar2;
        androidx.compose.runtime.a M = aVar.M(-773211238);
        int i2 = (M.J(znjVar) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-773211238, i2, -1, "com.vk.design.demo.presentation.screens.checkedMenuItem.<no name provided>.Content (ContextMenuScreenContent.kt:1422)");
            }
            qzu0.a.getClass();
            lqv B = znk0.B(qzu0.a(M), 0L, 0L, M, 196616, 30);
            lzo0 d = nzo.d(3072, 6, M, this.d, false);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new pr1(13);
                M.R(x);
            }
            znjVar2 = znjVar;
            aou0.d(znjVar2, (gzs) x, null, Boolean.valueOf(this.c), true, B, d, null, M, (i2 & 14) | 48, 66);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            znjVar2 = znjVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new r85(this, znjVar2, i, 3);
        }
    }

    public String toString() {
        switch (this.b) {
            case 1:
                return this.d;
            default:
                return super.toString();
        }
    }

    public soj(String str, String str2) {
        str.getClass();
        switch (str) {
            case "vpaidInit":
            case "close":
            case "setOrientationProperties":
            case "setResizeProperties":
            case "vpaidEvent":
            case "playheadEvent":
                this.c = false;
                this.d = str;
                break;
            case "playVideo":
            case "expand":
                this.c = "inline".equals(str2);
                this.d = str;
                break;
            case "resize":
            case "createCalendarEvent":
            case "open":
            case "storePicture":
                this.c = true;
                this.d = str;
                break;
            default:
                this.c = false;
                this.d = "";
                break;
        }
    }
}
