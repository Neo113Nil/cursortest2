package xsna;

import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.vkontakte.android.R;
import kotlin.jvm.internal.MutablePropertyReference0Impl;

/* compiled from: PollBackgroundSmallViewHolders.kt */
/* loaded from: classes4.dex */
public abstract class bnb0<T> extends wif0<T> {
    public final ImageView r;
    public final ProgressBar s;

    public bnb0(ViewGroup viewGroup, MutablePropertyReference0Impl mutablePropertyReference0Impl) {
        super(R.layout.item_poll_background_small, viewGroup, mutablePropertyReference0Impl);
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.poll_background_small_image);
        this.r = imageView;
        ProgressBar progressBar = (ProgressBar) this.itemView.findViewById(R.id.poll_upload_progress);
        this.s = progressBar;
        t8m0 t8m0Var = new t8m0(0);
        t8m0Var.setBounds(new Rect(0, 0, y8g0.a(R.dimen.poll_bg_view_holder_width), y8g0.a(R.dimen.poll_bg_small_height)));
        imageView.setBackground(t8m0Var);
        pdc pdcVar = new pdc(true);
        pdcVar.e = false;
        pdcVar.b();
        progressBar.setProgressDrawable(pdcVar);
    }

    @Override // xsna.vif0
    public void i6(T t) {
        mcy<Object> mcyVar = this.n;
        q6(epx.f(mcyVar != null ? mcyVar.get() : null, t));
        this.itemView.setContentDescription(s6(t));
    }

    public String s6(T t) {
        return this.itemView.getContext().getString(R.string.poll_accessibility_background);
    }

    public final void t6(int i) {
        Drawable a = m33.a(R.drawable.poll_story_preview_content, e43.a);
        sjo.b(a, i, PorterDuff.Mode.SRC_IN);
        this.r.setImageDrawable(a);
    }
}
