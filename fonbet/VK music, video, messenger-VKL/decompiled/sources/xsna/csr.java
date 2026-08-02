package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.rrr;

/* compiled from: FloatingButtonLeft.kt */
/* loaded from: classes16.dex */
public final class csr extends FrameLayout {
    public fq4 b;
    public FrameLayout c;
    public FrameLayout d;
    public AppCompatImageView e;

    private final void setLeftIcon(rrr.a aVar) {
        c().setVisibility(0);
        AppCompatImageView appCompatImageView = this.e;
        if (appCompatImageView == null) {
            appCompatImageView = new AppCompatImageView(getContext());
            appCompatImageView.setId(R.id.fb_internal_left_icon);
            this.e = appCompatImageView;
            FrameLayout.LayoutParams a = cpy.a(0, 0, 0, 0, 0, 0, 63);
            a.gravity = 16;
            c().addView(appCompatImageView, a);
        }
        appCompatImageView.setVisibility(0);
        gko gkoVar = aVar.a;
        appCompatImageView.setImageDrawable(gko.b(gkoVar.a, appCompatImageView.getContext()));
        appCompatImageView.setContentDescription(null);
        gpo0.f(appCompatImageView, Integer.valueOf(R.attr.vk_ui_icon_primary_invariably));
        ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
        int a2 = e3m.a(R.dimen.left_slot_icon_size, getContext());
        layoutParams.width = a2;
        layoutParams.height = a2;
        appCompatImageView.setLayoutParams(layoutParams);
    }

    private final void setLeftPicture(rrr.b bVar) {
        c().setVisibility(0);
        b().setVisibility(0);
        fq4 fq4Var = this.b;
        if (fq4Var != null) {
            int a = e3m.a(R.dimen.left_slot_picture_size, getContext());
            View b = fq4Var.b();
            ViewGroup.LayoutParams layoutParams = fq4Var.b().getLayoutParams();
            layoutParams.width = a;
            layoutParams.height = a;
            b.setLayoutParams(layoutParams);
            ((wzs) fq4Var.b).invoke((View) fq4Var.a, bVar.a);
        }
    }

    public final void a(rrr rrrVar) {
        FrameLayout frameLayout = this.d;
        if (frameLayout != null) {
            f4m.j(frameLayout);
        }
        AppCompatImageView appCompatImageView = this.e;
        if (appCompatImageView != null) {
            f4m.j(appCompatImageView);
        }
        if (rrrVar instanceof rrr.a) {
            setLeftIcon((rrr.a) rrrVar);
        } else {
            if (!(rrrVar instanceof rrr.b)) {
                throw new NoWhenBranchMatchedException();
            }
            setLeftPicture((rrr.b) rrrVar);
        }
    }

    public final FrameLayout b() {
        FrameLayout frameLayout = this.d;
        if (frameLayout != null) {
            return frameLayout;
        }
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setId(R.id.fb_internal_left_picture_slot);
        frameLayout2.setVisibility(8);
        this.d = frameLayout2;
        c().addView(frameLayout2, cpy.a(0, 0, 0, 0, 0, 0, 63));
        return frameLayout2;
    }

    public final FrameLayout c() {
        FrameLayout frameLayout = this.c;
        if (frameLayout != null) {
            return frameLayout;
        }
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setId(R.id.fb_internal_left_wrapper);
        frameLayout2.setVisibility(8);
        this.c = frameLayout2;
        addView(frameLayout2, cpy.b(0, 0, 0, 0, 0, 0, 63));
        return frameLayout2;
    }

    public final void setLeftPictureController(urr urrVar) {
        FrameLayout b = b();
        if (urrVar == null) {
            b.removeAllViews();
            this.b = null;
            s3q0 s3q0Var = s3q0.a;
        } else {
            fq4 create = urrVar.create(b.getContext());
            this.b = create;
            s3q0 s3q0Var2 = s3q0.a;
            b.removeAllViews();
            b.addView((View) create.a);
        }
    }
}
