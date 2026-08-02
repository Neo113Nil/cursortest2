package xsna;

import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.donut.design.compose.banner.DonutBannerSkeletonContent;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class dyn implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ q630 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ dyn(Object obj, q630 q630Var, int i, int i2, int i3) {
        this.b = i3;
        this.f = obj;
        this.c = q630Var;
        this.d = i;
        this.e = i2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                int I = ne7.I(this.d | 1);
                com.vk.donut.design.compose.banner.b.g((DonutBannerSkeletonContent) this.f, this.c, (androidx.compose.runtime.a) obj, I, this.e);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int I2 = ne7.I(this.d | 1);
                com.vk.libvideo.design.compose.base.preview.c.l((PreviewViewState.j) this.f, this.c, (androidx.compose.runtime.a) obj, I2, this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                int I3 = ne7.I(this.d | 1);
                com.vk.core.compose.component.topbar.e.a((TopBar$Before) this.f, this.c, (androidx.compose.runtime.a) obj, I3, this.e);
                break;
        }
        return s3q0.a;
    }
}
