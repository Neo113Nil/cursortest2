package xsna;

import com.vk.core.compose.component.input.InputSelect$State;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class f3x implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ wh50 c;

    public /* synthetic */ f3x(int i, wh50 wh50Var) {
        this.b = i;
        this.c = wh50Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                this.c.setValue(InputSelect$State.Valid);
                return s3q0.a;
            default:
                return (agw) this.c.getValue();
        }
    }
}
