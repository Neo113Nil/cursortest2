package xsna;

import kotlin.KotlinNothingValueException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class zc2 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ wh50 c;

    public /* synthetic */ zc2(int i, wh50 wh50Var) {
        this.b = i;
        this.c = wh50Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                tny tnyVar = (tny) this.c.getValue();
                if (tnyVar != null) {
                    return tnyVar;
                }
                xzw.d("Required value was null.");
                throw new KotlinNothingValueException();
            case 1:
                this.c.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                return s3q0.a;
            default:
                this.c.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                return s3q0.a;
        }
    }
}
