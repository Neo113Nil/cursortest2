package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class fk4 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ wh50 c;

    public /* synthetic */ fk4(int i, wh50 wh50Var) {
        this.b = i;
        this.c = wh50Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.c.setValue(bool);
                break;
            case 1:
                tho0 tho0Var = (tho0) obj;
                us2 us2Var = tho0Var.a;
                if (us2Var.c.length() > 700) {
                    tho0Var = tho0.a(tho0Var, us2Var.c.substring(0, IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED));
                }
                this.c.setValue(tho0Var);
                break;
            case 2:
                this.c.setValue((tho0) obj);
                break;
            default:
                this.c.setValue((ljo0) obj);
                break;
        }
        return s3q0.a;
    }
}
