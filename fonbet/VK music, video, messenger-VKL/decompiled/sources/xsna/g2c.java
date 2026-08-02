package xsna;

import androidx.compose.ui.state.ToggleableState;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class g2c implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ wh50 c;

    public /* synthetic */ g2c(int i, wh50 wh50Var) {
        this.b = i;
        this.c = wh50Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                wh50 wh50Var = this.c;
                wh50Var.setValue(jgz.d(((ToggleableState) wh50Var.getValue()) != ToggleableState.On));
                break;
            case 1:
                this.c.setValue(1);
                break;
            default:
                this.c.setValue(Boolean.FALSE);
                break;
        }
        return s3q0.a;
    }
}
