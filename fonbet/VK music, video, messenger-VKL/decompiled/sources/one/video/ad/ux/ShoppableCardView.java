package one.video.ad.ux;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vkontakte.android.R;
import one.video.ad.ux.a;
import xsna.anj;
import xsna.gq9;
import xsna.ih7;
import xsna.k9q0;
import xsna.kxt0;
import xsna.mn80;
import xsna.zjw;

/* compiled from: ShoppableCardView.kt */
/* loaded from: classes8.dex */
public final class ShoppableCardView extends ConstraintLayout {
    public gq9 t;
    public final mn80 u;
    public zjw v;

    public ShoppableCardView(Context context) {
        this(context, null, 0, 14, 0);
    }

    public final void P4(one.video.ad.ux.a aVar) {
        String str = aVar.d;
        a.C2169a c2169a = aVar.e;
        mn80 mn80Var = this.u;
        AppCompatImageView appCompatImageView = mn80Var.d;
        Drawable drawable = getContext().getDrawable(R.drawable.one_video_background_rounded_6);
        if (drawable != null) {
            drawable.setTint(getContext().getColor(R.color.one_video_gray));
        }
        appCompatImageView.setBackground(drawable);
        gq9 gq9Var = this.t;
        if (gq9Var != null) {
            gq9Var.cancel();
        }
        zjw zjwVar = this.v;
        if (zjwVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.t = zjwVar.a(Uri.parse(aVar.c), new a(), new ih7[0]);
        AppCompatTextView appCompatTextView = mn80Var.e;
        appCompatTextView.setText(str);
        appCompatTextView.setVisibility(str != null ? 0 : 8);
        AppCompatTextView appCompatTextView2 = mn80Var.c;
        appCompatTextView2.setText(c2169a != null ? c2169a.a : null);
        appCompatTextView2.setVisibility(c2169a == null ? 8 : 0);
        appCompatTextView2.setBackgroundTintList(c2169a != null ? anj.b(c2169a.b, appCompatTextView2.getContext()) : null);
        mn80Var.f.setText(aVar.f);
    }

    public final zjw getImageLoader() {
        return this.v;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gq9 gq9Var = this.t;
        if (gq9Var != null) {
            gq9Var.cancel();
        }
        this.t = null;
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        kxt0 kxt0Var = new kxt0(this);
        while (kxt0Var.hasNext()) {
            kxt0Var.next().setAlpha(f);
        }
    }

    public final void setImageLoader(zjw zjwVar) {
        this.v = zjwVar;
    }

    public ShoppableCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public ShoppableCardView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ ShoppableCardView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public ShoppableCardView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        LayoutInflater.from(context).inflate(R.layout.one_video_shoppable_card_view, this);
        int i3 = R.id.background;
        View j = k9q0.j(R.id.background, this);
        if (j != null) {
            i3 = R.id.label_view;
            AppCompatTextView appCompatTextView = (AppCompatTextView) k9q0.j(R.id.label_view, this);
            if (appCompatTextView != null) {
                i3 = R.id.picture_view;
                AppCompatImageView appCompatImageView = (AppCompatImageView) k9q0.j(R.id.picture_view, this);
                if (appCompatImageView != null) {
                    i3 = R.id.price_view;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) k9q0.j(R.id.price_view, this);
                    if (appCompatTextView2 != null) {
                        i3 = R.id.title_view;
                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) k9q0.j(R.id.title_view, this);
                        if (appCompatTextView3 != null) {
                            this.u = new mn80(this, j, appCompatTextView, appCompatImageView, appCompatTextView2, appCompatTextView3);
                            setClipChildren(false);
                            return;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i3)));
    }

    /* compiled from: ShoppableCardView.kt */
    public static final class a implements zjw.a {
        public a() {
        }

        @Override // xsna.zjw.a
        public final void a(Bitmap bitmap) {
            ShoppableCardView.this.u.d.setImageBitmap(bitmap);
        }

        @Override // xsna.zjw.a
        public final void onError() {
        }
    }
}
