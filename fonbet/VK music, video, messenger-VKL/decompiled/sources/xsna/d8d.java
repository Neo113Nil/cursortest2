package xsna;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.vk.clips.tool.view.component.user.ClipUserHorizontalScrollView;
import com.vk.core.view.components.cell.slot.Slot;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;

/* compiled from: ClipMiddleSlot.kt */
/* loaded from: classes16.dex */
public final class d8d implements Slot<Object> {
    public final VkText b;
    public final VkImage c;
    public final VkImage d;
    public final com.vk.clips.design.view.author.b e;
    public final LinearLayout f;

    public d8d(Context context) {
        VkText vkText = new VkText(context, null, 6, 0);
        vkText.setTextAppearance(e3m.g(R.attr.vk_ui_typography_text_semi_bold, context));
        vkText.setTextColor(e3m.f(R.attr.vk_ui_text_contrast, context));
        vkText.setSingleLine(true);
        vkText.setClickable(false);
        vkText.setFocusable(false);
        this.b = vkText;
        VkImage vkImage = new VkImage(context, null, 6, 0);
        vkImage.setImageResource(R.drawable.vk_icon_verified_16);
        gpo0.f(vkImage, Integer.valueOf(R.attr.vk_ui_icon_contrast));
        vkImage.setVisibility(8);
        vkImage.setClickable(false);
        vkImage.setFocusable(false);
        this.c = vkImage;
        VkImage vkImage2 = new VkImage(context, null, 6, 0);
        vkImage2.setVisibility(8);
        vkImage2.setClickable(false);
        vkImage2.setFocusable(false);
        this.d = vkImage2;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.addView(vkText);
        int a = e3m.a(R.dimen.clips_author_cell_icon_size, context);
        int a2 = e3m.a(R.dimen.clips_author_cell_icon_spacing, context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a, a);
        layoutParams.setMarginStart(a2);
        s3q0 s3q0Var = s3q0.a;
        linearLayout.addView(vkImage2, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(a, a);
        layoutParams2.setMarginStart(a2);
        linearLayout.addView(vkImage, layoutParams2);
        ClipUserHorizontalScrollView clipUserHorizontalScrollView = new ClipUserHorizontalScrollView(context, null, 6);
        clipUserHorizontalScrollView.setHorizontalScrollBarEnabled(false);
        clipUserHorizontalScrollView.setHorizontalFadingEdgeEnabled(true);
        clipUserHorizontalScrollView.setFadingEdgeLength(e3m.a(R.dimen.clips_author_cell_fading_edge_length, context));
        clipUserHorizontalScrollView.addView(linearLayout);
        com.vk.clips.design.view.author.b bVar = new com.vk.clips.design.view.author.b(context);
        bVar.setVisibility(8);
        this.e = bVar;
        LinearLayout a3 = io.reactivex.rxjava3.internal.operators.observable.q1.a(1, context);
        a3.addView(clipUserHorizontalScrollView, new LinearLayout.LayoutParams(-1, -2));
        a3.addView(bVar, new LinearLayout.LayoutParams(-1, -2));
        this.f = a3;
    }

    @Override // com.vk.core.view.components.cell.slot.Slot
    public final View getView() {
        return this.f;
    }

    @Override // xsna.too0
    public final void Ng() {
    }

    @Override // com.vk.core.view.components.cell.slot.Slot
    public final void Ad(Slot.Size size) {
    }
}
