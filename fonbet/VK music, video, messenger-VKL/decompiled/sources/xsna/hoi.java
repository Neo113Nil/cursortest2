package xsna;

import com.vk.core.compose.component.input.InputSelect$State;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class hoi implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ wh50 c;

    public /* synthetic */ hoi(int i, wh50 wh50Var) {
        this.b = i;
        this.c = wh50Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                this.c.setValue(3);
                break;
            default:
                this.c.setValue(InputSelect$State.Hover);
                break;
        }
        return s3q0.a;
    }
}
