package defpackage;

import android.app.Activity;
import com.ybsdk.persistence.b;

/* loaded from: classes2.dex */
public final /* synthetic */ class ggp0 implements Activity.ScreenCaptureCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ggp0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.app.Activity.ScreenCaptureCallback
    public final void onScreenCaptured() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                hgp0 hgp0Var = (hgp0) obj;
                hgp0Var.c.c("ScreenshotDetection", "Screenshot detected");
                hgp0Var.b.b(new qc41());
                throw null;
            case 1:
                dy2 dy2Var = ((igp0) obj).a;
                if (dy2Var != null) {
                    b bVar = dy2Var.a;
                    a6w a6wVar = bVar.k;
                    kgx[] kgxVarArr = b.l;
                    kgx kgxVar = kgxVarArr[8];
                    int i2 = a6wVar.b.getInt(a6wVar.c, 0) + 1;
                    a6w a6wVar2 = bVar.k;
                    kgx kgxVar2 = kgxVarArr[8];
                    a6wVar2.b(Integer.valueOf(i2));
                    return;
                }
                return;
            default:
                jst.e.getClass();
                ((tls) obj).invoke(zy11.a);
                return;
        }
    }
}
