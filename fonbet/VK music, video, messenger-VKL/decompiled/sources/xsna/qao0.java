package xsna;

import android.annotation.TargetApi;
import android.os.Handler;
import ru.ok.gl.objects.GLComputerProgram;
import ru.ok.gl.objects.GLSSBO;

/* compiled from: TestGPUHelper.kt */
@TargetApi(21)
/* loaded from: classes3.dex */
public final class qao0 {
    public GLComputerProgram a;
    public GLSSBO b;
    public GLSSBO c;
    public int d;

    public final void a(Handler handler, rfx rfxVar) {
        int i = this.d;
        if (i >= 2) {
            return;
        }
        if (i == 0) {
            handler.post(new nu4(this, 11));
            this.d = 1;
        } else if (i == 1) {
            handler.post(new nek(4, this, rfxVar));
            this.d = 2;
        }
    }

    public final void b() {
        GLComputerProgram gLComputerProgram = this.a;
        if (gLComputerProgram != null) {
            gLComputerProgram.release();
        }
        GLSSBO glssbo = this.b;
        if (glssbo != null) {
            glssbo.release();
        }
        GLSSBO glssbo2 = this.c;
        if (glssbo2 != null) {
            glssbo2.release();
        }
        this.a = null;
        this.b = null;
        this.c = null;
    }
}
