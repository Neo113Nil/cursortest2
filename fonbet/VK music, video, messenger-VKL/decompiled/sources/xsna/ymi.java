package xsna;

import com.vk.core.compose.component.input.InputSelect$State;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ymi implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ wh50 c;

    public /* synthetic */ ymi(int i, wh50 wh50Var) {
        this.b = i;
        this.c = wh50Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                this.c.setValue(3);
                return s3q0.a;
            case 1:
                this.c.setValue(1);
                return s3q0.a;
            case 2:
                this.c.setValue(InputSelect$State.Default);
                return s3q0.a;
            case 3:
                this.c.setValue(Boolean.TRUE);
                return s3q0.a;
            default:
                Boolean bool = (Boolean) this.c.getValue();
                bool.booleanValue();
                return bool;
        }
    }
}
