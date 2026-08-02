package xsna;

import com.vk.core.compose.component.input.InputSelect$State;
import xsna.dt1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class e3x implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ wh50 c;

    public /* synthetic */ e3x(int i, wh50 wh50Var) {
        this.b = i;
        this.c = wh50Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                this.c.setValue(InputSelect$State.Error);
                break;
            default:
                dt1.a.getClass();
                this.c.setValue(dt1.a.c);
                break;
        }
        return s3q0.a;
    }
}
