package xsna;

import com.vk.core.view.AppBarShadowView;
import com.vk.core.view.components.button.tool.VkToolButton;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class p4v implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ p4v(boolean z, int i) {
        this.b = i;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((AppBarShadowView) obj).setSeparatorAllowed(!this.c);
                break;
            default:
                ((VkToolButton) obj).setUseUnscaledFont(this.c);
                break;
        }
        return s3q0.a;
    }
}
