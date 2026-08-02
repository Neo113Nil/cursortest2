package xsna;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.FrameLayout;
import com.vk.core.view.components.button.VkButton;
import com.vkontakte.android.R;
import xsna.rwl0;
import xsna.uwl0;

/* compiled from: StoryMyTargetHtml5CloseVH.kt */
/* loaded from: classes6.dex */
public final class p7m0 extends cc<uwl0.a.b.d> {
    public final FrameLayout p;
    public final VkButton q;

    public p7m0(View view, rwl0.a aVar) {
        super(view, aVar);
        this.p = (FrameLayout) view.findViewById(R.id.fl_html5_close_container);
        this.q = (VkButton) view.findViewById(R.id.html5_close_button);
    }

    @Override // xsna.cc
    public final void b6(uwl0.a.b.d dVar) {
        uwl0.a.b.d dVar2 = dVar;
        String string = this.itemView.getContext().getString(R.string.story_my_target_html5_close);
        VkButton vkButton = this.q;
        vkButton.setText(string);
        vkButton.setOutlineProvider(new t0w0(6, cn70.a() * 20.0f, false, false));
        Drawable background = vkButton.getBackground();
        if (background instanceof RippleDrawable) {
            Drawable drawable = ((RippleDrawable) background).getDrawable(0);
            if (drawable instanceof GradientDrawable) {
                ((GradientDrawable) drawable).setCornerRadius(cn70.a() * 20.0f);
                vkButton.invalidate();
            }
        }
        cc.j6(this.p, dVar2.c);
    }

    @Override // xsna.cc
    public final void i6() {
        if (jjc.b()) {
            return;
        }
        super.i6();
    }
}
