package xsna;

/* compiled from: ApiThreadHolder.kt */
/* loaded from: classes.dex */
public class g03 implements io.reactivex.rxjava3.functions.e, io.reactivex.rxjava3.disposables.c {
    public boolean b;
    public boolean c;
    public Thread d;

    @Override // io.reactivex.rxjava3.functions.e
    public final void cancel() {
        if (this.c) {
            this.b = true;
            Thread thread = this.d;
            if (thread != null) {
                thread.interrupt();
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final void dispose() {
        cancel();
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final boolean h() {
        return this.b;
    }
}
