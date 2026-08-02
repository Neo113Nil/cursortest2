package xsna;

import com.vk.profile.user.impl.ui.edit.cover.crop.CoverCropActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class b2k implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ wh50 c;

    public /* synthetic */ b2k(int i, wh50 wh50Var) {
        this.b = i;
        this.c = wh50Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        wh50 wh50Var = this.c;
        switch (i) {
            case 0:
                int i2 = CoverCropActivity.w;
                wh50Var.setValue(Boolean.FALSE);
                break;
            case 1:
                wh50Var.setValue(Boolean.valueOf(!((Boolean) wh50Var.getValue()).booleanValue()));
                break;
            case 2:
                wh50Var.setValue(Boolean.TRUE);
                break;
            default:
                wh50Var.setValue(new tho0("", 0L, 6));
                break;
        }
        return s3q0.a;
    }
}
