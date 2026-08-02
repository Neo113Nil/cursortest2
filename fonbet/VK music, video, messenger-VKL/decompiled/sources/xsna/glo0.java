package xsna;

import com.vk.core.view.components.text.VkFadeText;
import com.vk.stickers.views.animation.VKAnimationView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class glo0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ glo0(Object obj, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                VkFadeText vkFadeText = (VkFadeText) obj;
                vkFadeText.setText((String) this.d);
                vkFadeText.setFade(this.c);
                break;
            default:
                VKAnimationView vKAnimationView = (VKAnimationView) this.d;
                i700 i700Var = (i700) obj;
                a780 a780Var = vKAnimationView.p;
                if (a780Var != null) {
                    a780Var.onSuccess();
                }
                vKAnimationView.setRepeatCount(-1);
                vKAnimationView.setComposition(i700Var);
                vKAnimationView.u = null;
                if (this.c) {
                    vKAnimationView.m0();
                }
                break;
        }
        return s3q0.a;
    }
}
