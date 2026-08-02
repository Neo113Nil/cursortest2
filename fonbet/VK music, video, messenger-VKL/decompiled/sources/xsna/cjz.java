package xsna;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.components.text.links.VkLinkedText;
import com.vkontakte.android.R;
import xsna.e3m;

/* compiled from: LiveDescriptionDelegate.kt */
/* loaded from: classes3.dex */
public final class cjz extends p1u0<djz> {
    public static final int b = iah0.a(16);
    public static final int c = iah0.a(6);
    public static final int d = iah0.a(4);
    public final boolean a;

    public cjz(boolean z) {
        this.a = z;
    }

    @Override // xsna.p1u0
    public final vfz<? extends djz> b(ViewGroup viewGroup) {
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setLayoutParams(new RecyclerView.p(-1, -2));
        linearLayout.setOrientation(1);
        Context context = viewGroup.getContext();
        AttributeSet attributeSet = null;
        int i = 6;
        int i2 = 0;
        VkText vkText = new VkText(context, null, 6, 0);
        vkText.setLayoutParams(new RecyclerView.p(-1, -2));
        f4m.t(d, vkText);
        vkText.setId(R.id.title_text);
        vkText.setTextAppearance(R.style.VkUiTypography_Headline1Normal);
        e3m.a aVar = e3m.a;
        vkText.setTextColor(context.getColor(R.color.vk_gray_100));
        vkText.setTextSize(16.0f);
        linearLayout.addView(vkText);
        Context context2 = viewGroup.getContext();
        VkText vkText2 = new VkText(context2, null, 6, 0);
        vkText2.setLayoutParams(new RecyclerView.p(-1, -2));
        vkText2.setId(R.id.counter);
        vkText2.setTextAppearance(R.style.VkUiTypography_Footnote);
        vkText2.setTextColor(context2.getColor(R.color.vk_gray_500));
        vkText2.setTextSize(13.0f);
        if (this.a) {
            f4m.t(c, vkText2);
        }
        linearLayout.addView(vkText2);
        Context context3 = viewGroup.getContext();
        VkLinkedText vkLinkedText = new VkLinkedText(context3, attributeSet, i, i2);
        vkLinkedText.setLayoutParams(new RecyclerView.p(-1, -2));
        vkLinkedText.setId(R.id.description);
        vkLinkedText.setTextAppearance(R.style.VkUiTypography_Footnote);
        vkLinkedText.setTextColor(context3.getColor(R.color.vk_gray_400));
        vkLinkedText.setTextSize(15.0f);
        f4m.t(b, vkLinkedText);
        linearLayout.addView(vkLinkedText);
        return new ejz(linearLayout);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof djz;
    }
}
