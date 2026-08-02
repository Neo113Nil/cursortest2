package xsna;

/* compiled from: StorefrontServicesUtils.kt */
/* loaded from: classes18.dex */
public final class xol0 implements d160 {
    public final /* synthetic */ rg50 b;
    public final /* synthetic */ rg50 c;

    public xol0(rg50 rg50Var, rg50 rg50Var2) {
        this.b = rg50Var;
        this.c = rg50Var2;
    }

    @Override // xsna.d160
    public final long R0(int i, long j) {
        return 0L;
    }

    @Override // xsna.d160
    public final long W0(int i, long j, long j2) {
        int intBitsToFloat = (int) Float.intBitsToFloat((int) (j & 4294967295L));
        rg50 rg50Var = this.b;
        rg50Var.C(swe0.g(rg50Var.getIntValue() - intBitsToFloat, 0, this.c.getIntValue()));
        return 0L;
    }
}
