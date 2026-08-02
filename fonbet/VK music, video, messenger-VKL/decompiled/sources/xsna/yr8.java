package xsna;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.vk.core.view.components.cell.button.group.VkGroupItem;
import com.vkontakte.android.R;

/* compiled from: CatalogUniversalButtonsHandler.kt */
/* loaded from: classes16.dex */
public final class yr8 {
    public final View a;

    public yr8(View view) {
        this.a = view;
        iah0.a(0);
    }

    public final void a(int i, boolean z) {
        View view = this.a;
        if (view instanceof TextView) {
            if (z) {
                his0.w((TextView) view, i, R.attr.vk_ui_icon_accent_themed);
            } else {
                TextView textView = (TextView) view;
                if (i == 0) {
                    textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                } else {
                    his0.u(textView, m33.a(i, textView.getContext()), ColorStateList.valueOf(e3m.f(R.attr.vk_ui_icon_accent_themed, textView.getContext())));
                }
            }
        }
        if (view instanceof VkGroupItem) {
            if (z) {
                VkGroupItem vkGroupItem = (VkGroupItem) view;
                VkGroupItem.a(vkGroupItem, Integer.valueOf(i));
                vkGroupItem.setLeftIconTint(R.attr.vk_ui_icon_accent_themed);
            } else {
                VkGroupItem vkGroupItem2 = (VkGroupItem) view;
                VkGroupItem.b(vkGroupItem2, Integer.valueOf(i), null, 6);
                vkGroupItem2.setRightIconTint(R.attr.vk_ui_icon_accent_themed);
            }
        }
    }
}
