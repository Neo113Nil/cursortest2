package xsna;

/* compiled from: AbstractDataSource.java */
/* loaded from: classes12.dex */
public final class zd implements Runnable {
    public final /* synthetic */ vvk b;
    public final /* synthetic */ ae c;

    public zd(ae aeVar, vvk vvkVar) {
        this.c = aeVar;
        this.b = vvkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b(this.c);
    }
}
