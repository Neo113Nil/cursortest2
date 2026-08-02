package defpackage;

import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.b;

/* loaded from: classes10.dex */
public final /* synthetic */ class fm7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;
    public final /* synthetic */ androidx.concurrent.futures.b c;

    public /* synthetic */ fm7(b bVar, androidx.concurrent.futures.b bVar2, int i) {
        this.a = i;
        this.b = bVar;
        this.c = bVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        androidx.concurrent.futures.b bVar = this.c;
        b bVar2 = this.b;
        switch (i) {
            case 0:
                final long F = bVar2.F();
                final androidx.concurrent.futures.b bVar3 = new androidx.concurrent.futures.b();
                bVar3.c = new hsj0();
                gl7 gl7Var = new gl7(bVar3);
                bVar3.b = gl7Var;
                bVar3.a = x4e.class;
                try {
                    bVar2.r(new im7() { // from class: gm7
                        @Override // defpackage.im7
                        public final boolean b(TotalCaptureResult totalCaptureResult) {
                            if (!b.A(totalCaptureResult, F)) {
                                return false;
                            }
                            bVar3.b(null);
                            return true;
                        }
                    });
                    bVar3.a = "waitForSessionUpdateId:" + F;
                } catch (Exception e) {
                    gl7Var.a(e);
                }
                ni91.h(gl7Var, bVar);
                break;
            default:
                bVar.b(Boolean.valueOf(bVar2.w));
                break;
        }
    }
}
