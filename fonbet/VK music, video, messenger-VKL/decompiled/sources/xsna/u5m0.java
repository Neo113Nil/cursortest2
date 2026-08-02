package xsna;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.FrameLayout;
import com.vk.core.view.components.button.VkButton;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.rwl0;
import xsna.uwl0;

/* compiled from: StoryLinkVH.kt */
/* loaded from: classes6.dex */
public final class u5m0 extends cc<uwl0.a.b.c> {
    public final FrameLayout p;
    public final VkButton q;

    public u5m0(View view, rwl0.a aVar) {
        super(view, aVar);
        this.p = (FrameLayout) view.findViewById(R.id.fl_link_container);
        this.q = (VkButton) view.findViewById(R.id.link_button);
    }

    @Override // xsna.cc
    public final void g6(uwl0.a aVar) {
        super.g6(aVar);
        if (aVar instanceof uwl0.a.b.c) {
            this.o = aVar;
            b6((uwl0.a.b.c) aVar);
        }
    }

    @Override // xsna.cc
    public final void i6() {
        if (jjc.b()) {
            return;
        }
        super.i6();
    }

    @Override // xsna.cc
    /* renamed from: l6, reason: merged with bridge method [inline-methods] */
    public final void b6(uwl0.a.b.c cVar) {
        String e;
        if (cVar instanceof uwl0.a.b.c.e) {
            e = this.itemView.getContext().getString(R.string.share);
        } else if ((cVar instanceof uwl0.a.b.c.C3845a) || (cVar instanceof uwl0.a.b.c.d) || (cVar instanceof uwl0.a.b.c.C3846b) || (cVar instanceof uwl0.a.b.c.C3847c) || (cVar instanceof uwl0.a.b.c.g)) {
            e = cVar.e();
        } else {
            if (!(cVar instanceof uwl0.a.b.c.f)) {
                throw new NoWhenBranchMatchedException();
            }
            e = this.itemView.getContext().getString(R.string.add_to_story);
        }
        VkButton vkButton = this.q;
        vkButton.setText(e);
        vkButton.setOutlineProvider(new t0w0(6, cn70.a() * 20.0f, false, false));
        Drawable background = vkButton.getBackground();
        if (background instanceof RippleDrawable) {
            Drawable drawable = ((RippleDrawable) background).getDrawable(0);
            if (drawable instanceof GradientDrawable) {
                ((GradientDrawable) drawable).setCornerRadius(cn70.a() * 20.0f);
                vkButton.invalidate();
            }
        }
        cc.j6(this.p, cVar.f());
    }
}
