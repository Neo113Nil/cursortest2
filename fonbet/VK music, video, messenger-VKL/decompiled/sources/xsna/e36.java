package xsna;

import com.vk.core.compose.component.banner.Banner$BackgroundMode;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class e36 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ wh50 c;

    public /* synthetic */ e36(int i, wh50 wh50Var) {
        this.b = i;
        this.c = wh50Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.setValue((Banner$BackgroundMode) obj);
                break;
            default:
                this.c.setValue(Boolean.TRUE);
                break;
        }
        return s3q0.a;
    }
}
