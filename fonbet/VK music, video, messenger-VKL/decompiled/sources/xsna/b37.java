package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class b37 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;

    public /* synthetic */ b37(long j, int i) {
        this.b = i;
        this.c = j;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return Long.valueOf(this.c - ((Long) obj).longValue());
            default:
                return Boolean.valueOf(((wpp) obj).c.get(Long.valueOf(this.c)) != null);
        }
    }
}
