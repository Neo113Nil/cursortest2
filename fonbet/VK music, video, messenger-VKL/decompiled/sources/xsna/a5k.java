package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a5k implements Runnable {
    public final /* synthetic */ d5k b;
    public final /* synthetic */ long c;
    public final /* synthetic */ String d;

    public /* synthetic */ a5k(d5k d5kVar, long j, String str) {
        this.b = d5kVar;
        this.c = j;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final d5k d5kVar = this.b;
        z5k z5kVar = d5kVar.p.b;
        final long j = this.c;
        final String str = this.d;
        z5kVar.a(new Runnable() { // from class: xsna.c5k
            @Override // java.lang.Runnable
            public final void run() {
                u4k u4kVar = d5k.this.h;
                y5k y5kVar = u4kVar.n;
                if (y5kVar == null || !y5kVar.d.get()) {
                    u4kVar.i.b.b(j, str);
                }
            }
        });
    }
}
