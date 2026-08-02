package xsna;

import com.google.android.material.appbar.AppBarLayout;
import com.vk.core.view.components.check.VkCheckCircle;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class g0c implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ g0c(boolean z, boolean z2, int i) {
        this.b = i;
        this.c = z;
        this.d = z2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                VkCheckCircle vkCheckCircle = (VkCheckCircle) obj;
                vkCheckCircle.setChecked(this.c);
                vkCheckCircle.setEnabled(this.d);
                break;
            default:
                ((AppBarLayout) obj).g(this.c, this.d, true);
                break;
        }
        return s3q0.a;
    }
}
