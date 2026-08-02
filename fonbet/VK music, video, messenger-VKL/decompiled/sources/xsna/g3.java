package xsna;

import com.vk.core.compose.component.input.InputSelect$State;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class g3 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ wh50 c;

    public /* synthetic */ g3(int i, wh50 wh50Var) {
        this.b = i;
        this.c = wh50Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                this.c.setValue(Boolean.TRUE);
                break;
            default:
                this.c.setValue(InputSelect$State.Active);
                break;
        }
        return s3q0.a;
    }
}
