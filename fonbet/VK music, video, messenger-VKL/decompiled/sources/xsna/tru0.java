package xsna;

import java.util.concurrent.ThreadFactory;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class tru0 implements ThreadFactory {
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;

    public /* synthetic */ tru0(String str, boolean z, int i) {
        this.b = str;
        this.c = z;
        this.d = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        fhr0 fhr0Var = new fhr0(runnable, this.b, null);
        fhr0Var.setDaemon(this.c);
        fhr0Var.setPriority(this.d);
        fhr0Var.setUncaughtExceptionHandler(asu0.s);
        return fhr0Var;
    }
}
