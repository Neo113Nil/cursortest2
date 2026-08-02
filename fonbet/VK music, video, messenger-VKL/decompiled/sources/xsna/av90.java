package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.widget.FrameLayout;
import com.vk.core.view.ProgressView;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;

/* compiled from: PostingHolders.kt */
/* loaded from: classes4.dex */
public final class av90 {
    public static final int e;
    public static final int f;
    public static final int g;
    public static final int h;
    public final ProgressView a;
    public final VKImageView b;
    public boolean c;
    public boolean d;

    static {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        e = e3m.a(R.dimen.post_attach_common_icon_size, context);
        f = iah0.a(2);
        Context context2 = e43.a;
        g = e3m.a(R.dimen.post_attach_common_icon_size, context2 != null ? context2 : null);
        h = iah0.a(4);
    }

    public av90(FrameLayout frameLayout) {
        int color = frameLayout.getContext().getColor(R.color.vkim_background_dim);
        ProgressView progressView = new ProgressView(frameLayout.getContext());
        progressView.setId(R.id.posting_attachment_progress);
        progressView.setCancelIconVisible(true);
        progressView.setLayerColor(color);
        progressView.setLineColor(-1);
        progressView.setCancelIconResource(R.drawable.vk_icon_cancel_24);
        progressView.setCancelIconTintColor(-1);
        progressView.setLineWidth(f);
        bwt0.p0(progressView, false);
        this.a = progressView;
        VKImageView vKImageView = new VKImageView(frameLayout.getContext(), null, 6, 0);
        vKImageView.setId(R.id.posting_attachment_error);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        sjo.b(shapeDrawable, color, PorterDuff.Mode.SRC_IN);
        vKImageView.setBackground(shapeDrawable);
        vKImageView.setImageResource(R.drawable.vk_icon_replay_36);
        vKImageView.setImageTintList(ColorStateList.valueOf(-1));
        int i = h;
        vKImageView.setPadding(i, i, i, i);
        bwt0.p0(vKImageView, false);
        if (gz80.a(23)) {
            vKImageView.setForeground(dhr0.t.a(R.drawable.ripple_14dp));
        }
        this.b = vKImageView;
        int i2 = g;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i2);
        layoutParams.gravity = 17;
        s3q0 s3q0Var = s3q0.a;
        frameLayout.addView(vKImageView, layoutParams);
        int i3 = e;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i3, i3);
        layoutParams2.gravity = 17;
        frameLayout.addView(progressView, layoutParams2);
    }

    public final void a(boolean z) {
        j6r0.d(this.b, z ? 0 : 8, true, 300, null);
        this.d = z;
    }

    public final void b(int i, int i2) {
        if (bwt0.K(this.b)) {
            a(false);
        }
        if (!this.c) {
            c(true);
        }
        ProgressView progressView = this.a;
        progressView.setProgressValue(i);
        progressView.setProgressMax(i2);
    }

    public final void c(boolean z) {
        j6r0.d(this.a, z ? 0 : 8, true, 300, null);
        this.c = z;
    }
}
