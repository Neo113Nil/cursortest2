package xsna;

import android.app.Activity;
import android.content.Context;
import com.vk.core.view.components.text.VkFadeText;
import com.vk.navigation.NavigationDelegateActivity;
import com.vk.toggle.anonymous.SakFeatures;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class flo0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ flo0(boolean z, int i) {
        this.b = i;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object v;
        int i = this.b;
        Object obj2 = null;
        boolean z = this.c;
        switch (i) {
            case 0:
                VkFadeText vkFadeText = new VkFadeText((Context) obj, null, 6, 0);
                vkFadeText.setTextColor(dhr0.t.c(R.attr.vk_ui_text_primary));
                vkFadeText.setTextAppearance(R.style.VkUiTypography_Subhead);
                vkFadeText.setMaxTextLines(1);
                vkFadeText.setTextAlignment(2);
                vkFadeText.setBackgroundColor(0);
                vkFadeText.setFade(z);
                return vkFadeText;
            default:
                if (SakFeatures.Type.GET_USER_INFO_CUT_OFF_FROM_AUTH.h() && z) {
                    c63 c63Var = c63.a;
                    Activity b = c63.b();
                    if (b == null || (v = s200.v(b)) == null) {
                        NavigationDelegateActivity a = x93.a();
                        if (a != null) {
                            obj2 = a.Y();
                        }
                    } else {
                        obj2 = v;
                    }
                    if (obj2 != null) {
                        i0q0.f(new h8n0(obj2, 3));
                        s3q0 s3q0Var = s3q0.a;
                    }
                }
                return s3q0.a;
        }
    }
}
