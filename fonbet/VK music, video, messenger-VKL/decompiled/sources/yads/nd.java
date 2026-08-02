package yads;

/* loaded from: classes10.dex */
public final class nd implements Runnable {
    public final /* synthetic */ od b;

    public nd(od odVar) {
        this.b = odVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pd pdVar = this.b.c;
        if (pdVar != null) {
            ((vc) pdVar).a.d.removeCallbacksAndMessages(null);
        }
    }
}
