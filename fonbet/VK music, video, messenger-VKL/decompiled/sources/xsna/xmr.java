package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.components.tabs.Tab$Mode;
import com.vkontakte.android.R;

/* compiled from: FixedIconView.kt */
/* loaded from: classes17.dex */
public final class xmr extends ConstraintLayout {
    public wmr t;
    public final ImageView u;
    public final FrameLayout v;
    public final tmr w;

    public xmr(Context context) {
        super(context, null, 0);
        ImageView imageView = new ImageView(context);
        int b = hbh0.b(24, context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(b, b);
        layoutParams.gravity = 17;
        imageView.setLayoutParams(layoutParams);
        this.u = imageView;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(e3m.e(R.attr.selectableItemBackground, context));
        frameLayout.setOutlineProvider(new avj(hbh0.a(context, 10.0f)));
        frameLayout.setClipToOutline(true);
        int a = e3m.a(R.dimen.vk_ui_spacing_size_s, context);
        frameLayout.setPadding(a, a, a, a);
        frameLayout.addView(imageView);
        this.v = frameLayout;
        tmr tmrVar = new tmr(context);
        f4m.r(hbh0.b(6, context), tmrVar);
        this.w = tmrVar;
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.i = 0;
        bVar.l = 0;
        bVar.t = 0;
        s3q0 s3q0Var = s3q0.a;
        addView(tmrVar, bVar);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(-2, -2);
        bVar2.t = 0;
        bVar2.v = 0;
        bVar2.i = 0;
        bVar2.l = 0;
        addView(frameLayout, bVar2);
        setVisibility(8);
    }

    public final wmr getIcon() {
        return this.t;
    }

    public final void setDividerVisible(boolean z) {
        this.w.setVisibility(z ? 0 : 8);
    }

    public final void setIcon(wmr wmrVar) {
        this.t = wmrVar;
        if (wmrVar != null) {
            Drawable drawable = wmrVar.a;
            ImageView imageView = this.u;
            imageView.setImageDrawable(drawable);
            getContext();
            gpo0.f(imageView, Integer.valueOf(R.attr.vk_ui_icon_primary));
            String str = wmrVar.b;
            FrameLayout frameLayout = this.v;
            frameLayout.setContentDescription(str);
            frameLayout.setOnClickListener(new rg0(wmrVar, 2));
        }
        setVisibility(this.t != null ? 0 : 8);
    }

    public final void setMode(Tab$Mode tab$Mode) {
        int a = e3m.a(R.dimen.vk_ui_spacing_size_xl, getContext());
        Context context = getContext();
        f4m.u(this, a, 0, byn0.$EnumSwitchMapping$0[tab$Mode.ordinal()] == 1 ? hbh0.b(8, context) : hbh0.b(4, context), 0);
        this.w.setTranslationX(-a);
    }
}
