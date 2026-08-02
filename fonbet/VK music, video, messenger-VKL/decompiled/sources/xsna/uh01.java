package xsna;

import android.content.ComponentName;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class uh01 implements Runnable {
    public final /* synthetic */ ComponentName b;
    public final /* synthetic */ xh01 c;

    public uh01(xh01 xh01Var, ComponentName componentName) {
        this.c = xh01Var;
        this.b = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yh01.y(this.c.d, this.b);
    }
}
