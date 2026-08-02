package xsna;

/* compiled from: FragmentStateAdapter.java */
/* loaded from: classes12.dex */
public final class ucs implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ucs(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                scs scsVar = (scs) this.c;
                scsVar.j = false;
                scsVar.A0();
                break;
            default:
                vm30 vm30Var = (vm30) this.c;
                vm30Var.u.addOnScrollListener(vm30Var.O);
                break;
        }
    }
}
