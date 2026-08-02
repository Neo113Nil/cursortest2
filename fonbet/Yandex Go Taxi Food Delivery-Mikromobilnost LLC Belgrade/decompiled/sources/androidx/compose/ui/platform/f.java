package androidx.compose.ui.platform;

import android.os.Handler;
import android.view.Choreographer;
import defpackage.fse;
import defpackage.i3y;
import defpackage.jse;
import defpackage.wc2;
import defpackage.x43;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f extends jse {
    public static final i3y E = kotlin.a.a(AndroidUiDispatcher$Companion$Main$2.w);
    public static final wc2 F = new wc2(0);
    public boolean A;
    public boolean B;
    public final g D;
    public final Choreographer b;
    public final Handler c;
    public final Object w = new Object();
    public final x43 x = new x43();
    public ArrayList y = new ArrayList();
    public ArrayList z = new ArrayList();
    public final AndroidUiDispatcher$dispatchCallback$1 C = new AndroidUiDispatcher$dispatchCallback$1(this);

    public f(Choreographer choreographer, Handler handler) {
        this.b = choreographer;
        this.c = handler;
        this.D = new g(choreographer, this);
    }

    public static final void R(f fVar) {
        Runnable runnable;
        boolean z;
        do {
            synchronized (fVar.w) {
                runnable = (Runnable) fVar.x.m();
            }
            while (runnable != null) {
                runnable.run();
                synchronized (fVar.w) {
                    runnable = (Runnable) fVar.x.m();
                }
            }
            synchronized (fVar.w) {
                if (fVar.x.isEmpty()) {
                    z = false;
                    fVar.A = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    @Override // defpackage.jse
    public final void o(fse fseVar, Runnable runnable) {
        synchronized (this.w) {
            this.x.addLast(runnable);
            if (!this.A) {
                this.A = true;
                this.c.post(this.C);
                if (!this.B) {
                    this.B = true;
                    this.b.postFrameCallback(this.C);
                }
            }
        }
    }
}
