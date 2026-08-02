package xsna;

import com.vk.libvideo.design.compose.base.preview.PreviewViewState;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class qiz implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ q630 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ qiz(Object obj, q630 q630Var, int i, int i2) {
        this.b = i2;
        this.e = obj;
        this.c = q630Var;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                int I = ne7.I(this.d | 1);
                ((riz) this.e).a(this.c, (androidx.compose.runtime.a) obj, I);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int I2 = ne7.I(this.d | 1);
                com.vk.libvideo.design.compose.base.preview.c.z((PreviewViewState.y) this.e, this.c, (androidx.compose.runtime.a) obj, I2);
                break;
            default:
                ((Integer) obj2).intValue();
                int I3 = ne7.I(this.d | 1);
                ((b7i0) this.e).a(this.c, (androidx.compose.runtime.a) obj, I3);
                break;
        }
        return s3q0.a;
    }
}
