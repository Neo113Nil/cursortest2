package xsna;

/* compiled from: AbstractDataSource.java */
/* loaded from: classes12.dex */
public final class yd implements Runnable {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ vvk c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ae e;

    public yd(ae aeVar, boolean z, vvk vvkVar, boolean z2) {
        this.e = aeVar;
        this.b = z;
        this.c = vvkVar;
        this.d = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.b;
        ae aeVar = this.e;
        vvk vvkVar = this.c;
        if (z) {
            vvkVar.c(aeVar);
        } else if (this.d) {
            vvkVar.a();
        } else {
            vvkVar.d(aeVar);
        }
    }
}
