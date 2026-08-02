package xsna;

import xsna.d4k0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ff4 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ ff4(int i, izs izsVar, boolean z) {
        this.b = i;
        this.c = izsVar;
        this.d = z;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                izs izsVar = this.c;
                if (izsVar != null) {
                    izsVar.invoke(Boolean.valueOf(!this.d));
                }
                break;
            case 1:
                this.c.invoke(Boolean.valueOf(this.d));
                break;
            default:
                this.c.invoke(new d4k0.h(!this.d));
                break;
        }
        return s3q0.a;
    }
}
