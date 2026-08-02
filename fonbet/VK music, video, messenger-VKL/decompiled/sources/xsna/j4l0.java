package xsna;

import android.content.Context;
import com.vk.core.view.AppBarShadowView;
import com.vk.core.view.components.text.VkFadeText;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class j4l0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ j4l0(boolean z, int i) {
        this.b = i;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((AppBarShadowView) obj).setSeparatorAllowed(!this.c);
                return s3q0.a;
            default:
                VkFadeText vkFadeText = new VkFadeText((Context) obj, null, 6, 0);
                vkFadeText.setTextColor(dhr0.t.c(R.attr.vk_ui_text_primary));
                vkFadeText.setTextAppearance(R.style.VkUiTypography_Subhead);
                vkFadeText.setMaxTextLines(3);
                vkFadeText.setAlwaysFade(true);
                vkFadeText.setTextAlignment(2);
                vkFadeText.setFade(this.c);
                return vkFadeText;
        }
    }
}
