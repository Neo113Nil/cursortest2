package xsna;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vkontakte.android.R;

/* compiled from: VkTileSelectedIcon.kt */
/* loaded from: classes17.dex */
public final class csv0 extends FrameLayout implements too0 {
    public final View b;
    public final ImageView c;

    public csv0(Context context) {
        super(context, null, 0);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, 0);
        bVar.l = 0;
        bVar.v = 0;
        setLayoutParams(bVar);
        View view = new View(context);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
        view.setClipToOutline(true);
        this.b = view;
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(hbh0.b(24, context), hbh0.b(24, context), 17));
        imageView.setBackground(context.getDrawable(R.drawable.ds_internal_horizontal_list_item_selected_check_background));
        this.c = imageView;
        Ng();
        addView(view);
        addView(imageView);
    }

    @Override // xsna.too0
    public final void Ng() {
        getContext();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.width = hbh0.b(28, getContext());
        marginLayoutParams.height = hbh0.b(28, getContext());
        marginLayoutParams.setMarginEnd(hbh0.b(-4, getContext()));
        marginLayoutParams.bottomMargin = hbh0.b(-4, getContext());
        setLayoutParams(marginLayoutParams);
        View view = this.b;
        view.setBackground(new ColorDrawable(e3m.f(R.attr.vk_ui_background_content, view.getContext())));
        view.setOutlineProvider(wcc.a);
        ImageView imageView = this.c;
        imageView.setImageDrawable(imageView.getContext().getDrawable(R.drawable.vk_icon_check_circle_on_24));
        imageView.setImageTintList(e3m.c(R.attr.vk_ui_icon_accent, imageView.getContext()));
    }

    public final ImageView getSelectedCheck() {
        return this.c;
    }

    public final View getSelectedCheckBorder() {
        return this.b;
    }
}
