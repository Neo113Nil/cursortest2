package xsna;

import android.content.Context;
import android.text.Editable;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class m1y0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m1y0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        boolean z = false;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                Throwable th = (Throwable) obj;
                if (!((n1y0) obj2).c.d(th, false)) {
                    j03.l(th);
                    com.vk.metrics.eventtracking.b.a.a(th);
                }
                break;
            default:
                c2h c2hVar = (c2h) obj2;
                Editable editable = (Editable) obj;
                int i2 = c2h.p1;
                String obj3 = editable != null ? editable.toString() : null;
                int length = obj3 != null ? obj3.length() : 0;
                if (length > 200) {
                    VkText vkText = c2hVar.m1;
                    if (vkText == null) {
                        vkText = null;
                    }
                    vkText.setTextColor(krv0.l(R.attr.vk_ui_accent_red));
                } else {
                    VkText vkText2 = c2hVar.m1;
                    if (vkText2 == null) {
                        vkText2 = null;
                    }
                    vkText2.setTextColor(krv0.l(R.attr.vk_ui_text_secondary));
                }
                VkText vkText3 = c2hVar.m1;
                if (vkText3 == null) {
                    vkText3 = null;
                }
                Context mo2getContext = c2hVar.mo2getContext();
                vkText3.setText(mo2getContext != null ? mo2getContext.getString(R.string.community_edit_description_counter, Integer.valueOf(length), 200) : null);
                int length2 = obj3 != null ? obj3.length() : 0;
                VkSimpleButton vkSimpleButton = c2hVar.o1;
                VkSimpleButton vkSimpleButton2 = vkSimpleButton != null ? vkSimpleButton : null;
                if (obj3 != null && obj3.length() != 0 && !obj3.equals(c2hVar.f1) && length2 <= 200) {
                    z = true;
                }
                vkSimpleButton2.setEnabled(z);
                break;
        }
        return s3q0.a;
    }
}
