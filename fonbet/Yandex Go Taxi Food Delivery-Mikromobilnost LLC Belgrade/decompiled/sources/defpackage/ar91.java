package defpackage;

/* loaded from: classes11.dex */
public final class ar91 extends ql91 implements Runnable, il91 {
    public final Runnable A;

    public ar91(Runnable runnable) {
        runnable.getClass();
        this.A = runnable;
    }

    @Override // defpackage.ql91
    public final String a() {
        return oyr.p("task=[", this.A.toString(), "]");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.A.run();
        } catch (Throwable th) {
            e(th);
            throw th;
        }
    }
}
