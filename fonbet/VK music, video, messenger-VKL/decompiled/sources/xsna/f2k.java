package xsna;

import xsna.kjw;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class f2k implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ wh50 c;

    public /* synthetic */ f2k(int i, wh50 wh50Var) {
        this.b = i;
        this.c = wh50Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                kjw.a aVar = (kjw.a) obj;
                float f = aVar.a;
                float f2 = aVar.b;
                this.c.setValue(new mxj0((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L)));
                break;
            case 1:
                this.c.setValue(jgz.j((tny) obj, true));
                break;
            default:
                this.c.setValue(jgz.j((tny) obj, true));
                break;
        }
        return s3q0.a;
    }
}
