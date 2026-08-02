package xsna;

import com.vk.core.view.components.badge.VkContentBadge;
import com.vk.photos.root.photoflow.presentation.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ve40 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ve40(Object obj, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                we40 we40Var = (we40) this.d;
                tt70 tt70Var = (tt70) obj;
                we40Var.b6(tt70Var.b);
                VkContentBadge vkContentBadge = we40Var.w;
                if (!this.c) {
                    we40Var.a6(Long.valueOf(tt70Var.a));
                }
                bwt0.p0(vkContentBadge, tt70Var.c);
                vkContentBadge.setOutlineProvider(null);
                break;
            default:
                Throwable th = (Throwable) obj;
                ((b8a0) this.d).d.invoke(new a.j(this.c, th));
                kwg0.b().accept(th);
                break;
        }
        return s3q0.a;
    }
}
