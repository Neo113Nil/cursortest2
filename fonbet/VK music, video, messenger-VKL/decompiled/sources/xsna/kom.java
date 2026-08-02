package xsna;

import android.content.Context;
import com.vk.core.view.components.text.VkFadeText;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class kom implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ kom(boolean z, int i) {
        this.b = i;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return com.vk.im.engine.models.dialogs.b.a((com.vk.im.engine.models.dialogs.b) obj, null, null, null, 0, 0, 0, 0, 0, 0, false, null, null, null, null, null, false, null, false, null, null, null, false, null, null, null, null, 0, false, this.c, null, null, 0, null, 0, -1, 2096127);
            default:
                VkFadeText vkFadeText = new VkFadeText((Context) obj, null, 6, 0);
                vkFadeText.setTextColor(dhr0.t.c(R.attr.vk_ui_text_primary));
                vkFadeText.setTextAppearance(R.style.VkUiTypography_Subhead);
                vkFadeText.setMaxTextLines(3);
                vkFadeText.setTextAlignment(2);
                vkFadeText.setFade(this.c);
                return vkFadeText;
        }
    }
}
