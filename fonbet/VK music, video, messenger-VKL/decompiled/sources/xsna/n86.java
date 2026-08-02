package xsna;

/* compiled from: _Sequences.kt */
/* loaded from: classes16.dex */
public final class n86 implements izs {
    public static final n86 c = new n86(0);
    public static final n86 d = new n86(1);
    public final /* synthetic */ int b;

    public /* synthetic */ n86(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(obj instanceof r4g0);
            default:
                return Boolean.valueOf(obj instanceof cwr0);
        }
    }
}
