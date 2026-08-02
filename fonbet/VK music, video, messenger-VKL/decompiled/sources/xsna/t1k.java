package xsna;

import com.vk.profile.user.impl.ui.edit.cover.crop.CoverCropActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class t1k implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ wh50 c;

    public /* synthetic */ t1k(int i, wh50 wh50Var) {
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
                Boolean bool = (Boolean) wh50Var.getValue();
                bool.booleanValue();
                return bool;
            default:
                wh50Var.setValue(Boolean.valueOf(!((Boolean) wh50Var.getValue()).booleanValue()));
                return s3q0.a;
        }
    }
}
