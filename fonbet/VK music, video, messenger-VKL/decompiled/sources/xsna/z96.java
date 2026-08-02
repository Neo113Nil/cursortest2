package xsna;

import xsna.ea6;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class z96 implements izs {
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;

    public /* synthetic */ z96(long j, int i) {
        this.b = j;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        long j = this.b;
        int i = this.c;
        return booleanValue ? new ea6.e.d(j, i) : new ea6.e.c(j, i);
    }
}
