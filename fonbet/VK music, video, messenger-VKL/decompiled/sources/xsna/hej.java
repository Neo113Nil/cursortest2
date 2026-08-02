package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class hej implements Runnable {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;

    public /* synthetic */ hej(boolean z, long j) {
        this.b = z;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.vk.contacts.c cVar = com.vk.contacts.e.k;
        if (cVar == null) {
            cVar = null;
        }
        cVar.T0(this.c, this.b);
    }
}
