package xsna;

import kotlin.KotlinNothingValueException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class l030 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ wh50 c;

    public /* synthetic */ l030(int i, wh50 wh50Var) {
        this.b = i;
        this.c = wh50Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                this.c.setValue(Boolean.FALSE);
                return s3q0.a;
            default:
                tny tnyVar = (tny) this.c.getValue();
                if (tnyVar != null) {
                    return tnyVar;
                }
                xzw.d("Required value was null.");
                throw new KotlinNothingValueException();
        }
    }
}
