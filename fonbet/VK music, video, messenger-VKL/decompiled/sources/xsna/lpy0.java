package xsna;

import android.content.ComponentName;
import android.os.IBinder;

/* loaded from: classes12.dex */
public final class lpy0 implements Runnable {
    public final /* synthetic */ ComponentName b;
    public final /* synthetic */ IBinder c;
    public final /* synthetic */ fuy0 d;

    public lpy0(fuy0 fuy0Var, ComponentName componentName, IBinder iBinder) {
        this.d = fuy0Var;
        this.b = componentName;
        this.c = iBinder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.b(this.b, this.c);
    }
}
