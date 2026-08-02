package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vkontakte.android.R;

/* compiled from: VkTileRemoveIcon.kt */
/* loaded from: classes17.dex */
public final class bsv0 extends FrameLayout {
    public final View b;
    public final ImageView c;

    public bsv0(Context context) {
        super(context, null, 0);
        ConstraintLayout.b bVar = new ConstraintLayout.b(hbh0.b(24, context), hbh0.b(24, context));
        int b = hbh0.b(-6, context);
        int b2 = hbh0.b(-6, context);
        int marginEnd = bVar.getMarginEnd();
        int i = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        bVar.setMarginStart(b);
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = b2;
        bVar.setMarginEnd(marginEnd);
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = i;
        bVar.i = 0;
        bVar.t = 0;
        setLayoutParams(bVar);
        View view = new View(context);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
        view.setBackground(context.getDrawable(R.drawable.ds_internal_horizontal_list_item_selected_check_background));
        dhr0 dhr0Var = krv0.b;
        if (dhr0Var == null) {
            view.setBackgroundTintList(ColorStateList.valueOf(krv0.m(R.attr.vk_ui_background_content, view.getContext())));
        } else {
            dhr0Var.i0(R.attr.vk_ui_background_content, view);
        }
        this.b = view;
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(hbh0.b(20, context), hbh0.b(20, context), 17));
        imageView.setBackground(context.getDrawable(R.drawable.ds_internal_horizontal_list_item_selected_check_background));
        imageView.setImageDrawable(context.getDrawable(R.drawable.vk_icon_dismiss_substract_24));
        gpo0.f(imageView, Integer.valueOf(R.attr.vk_ui_icon_secondary));
        this.c = imageView;
        addView(view);
        addView(imageView);
    }

    public final ImageView getRemoveIcon() {
        return this.c;
    }

    public final View getRemoveIconBorder() {
        return this.b;
    }
}
