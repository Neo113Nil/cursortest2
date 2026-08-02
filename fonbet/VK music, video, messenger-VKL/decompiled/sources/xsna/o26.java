package xsna;

import xsna.dt1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class o26 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ wh50 c;

    public /* synthetic */ o26(int i, wh50 wh50Var) {
        this.b = i;
        this.c = wh50Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                this.c.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                break;
            case 1:
                this.c.setValue(Boolean.TRUE);
                break;
            case 2:
                this.c.setValue(Boolean.TRUE);
                break;
            case 3:
                this.c.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                break;
            default:
                dt1.a.getClass();
                this.c.setValue(dt1.a.f);
                break;
        }
        return s3q0.a;
    }
}
