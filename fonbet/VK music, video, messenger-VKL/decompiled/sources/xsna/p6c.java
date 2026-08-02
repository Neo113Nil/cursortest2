package xsna;

import com.vk.core.compose.component.skeleton.SkeletonType;
import com.vk.libvideo.design.compose.base.datacontent.presets.VideoMetaViewState;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class p6c implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ q630 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ p6c(Object obj, q630 q630Var, int i, int i2) {
        this.b = i2;
        this.e = obj;
        this.c = q630Var;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                gzs gzsVar = (gzs) this.e;
                ((Integer) obj2).getClass();
                q6c.a(ne7.I(this.d | 1), (androidx.compose.runtime.a) obj, gzsVar, this.c);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int I = ne7.I(this.d | 1);
                com.vk.libvideo.design.compose.base.datacontent.presets.b.j((VideoMetaViewState.f) this.e, this.c, (androidx.compose.runtime.a) obj, I);
                break;
            default:
                ((Integer) obj2).getClass();
                int I2 = ne7.I(this.d | 1);
                akv0.a((SkeletonType) this.e, this.c, (androidx.compose.runtime.a) obj, I2);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ p6c(q630 q630Var, gzs gzsVar, int i) {
        this.b = 0;
        this.c = q630Var;
        this.e = gzsVar;
        this.d = i;
    }
}
