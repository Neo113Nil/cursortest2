package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;

/* loaded from: classes15.dex */
public final class hw10 {
    public final View a;
    public final boolean b;
    public final jas c;
    public final jas d;
    public final tpq0 e;
    public final we6 f;
    public final ht10 g;

    public hw10(View view, boolean z, arg argVar) {
        TypedValue c;
        this.a = view;
        this.b = z;
        this.c = new jas(view, 0);
        this.d = new jas(view, 1);
        this.e = new tpq0(view);
        this.f = new we6(view);
        this.g = new ht10(view, argVar);
        if (z) {
            c = fxa1.c(jng0.messagingOutgoingSecondaryColor, view.getContext());
        } else {
            c = fxa1.c(jng0.messagingIncomingSecondaryColor, view.getContext());
        }
        a(c.data);
    }

    public final void a(int i) {
        TextView textView = this.c.a;
        textView.setTextColor(i);
        textView.setCompoundDrawableTintList(ColorStateList.valueOf(i));
        TextView textView2 = this.d.a;
        textView2.setTextColor(i);
        textView2.setCompoundDrawableTintList(ColorStateList.valueOf(i));
        tpq0 tpq0Var = this.e;
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat = (AnimatedVectorDrawableCompat) tpq0Var.d;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        animatedVectorDrawableCompat.setColorFilter(new PorterDuffColorFilter(i, mode));
        ((AnimatedVectorDrawableCompat) tpq0Var.e).setColorFilter(new PorterDuffColorFilter(i, mode));
        ((Drawable) tpq0Var.f).setColorFilter(new PorterDuffColorFilter(i, mode));
        ((Drawable) tpq0Var.g).setColorFilter(new PorterDuffColorFilter(i, mode));
        ((ImageView) this.f.c).setImageTintList(ColorStateList.valueOf(i));
        ((TextView) this.g.c).setTextColor(i);
    }

    public final void b(boolean z, boolean z2) {
        tpq0 tpq0Var = this.e;
        Context context = tpq0Var.a;
        ImageView imageView = (ImageView) tpq0Var.c;
        boolean z3 = this.b;
        if (z) {
            if (!z3) {
                imageView.setVisibility(8);
                return;
            }
            imageView.setVisibility(0);
            if (z2) {
                imageView.setImageDrawable((Drawable) tpq0Var.f);
                imageView.setContentDescription(context.getString(oyh0.msg_message_status_delivered_content_desc));
                return;
            } else {
                imageView.setImageDrawable((Drawable) tpq0Var.g);
                imageView.setContentDescription(context.getString(oyh0.msg_message_status_sent_content_desc));
                return;
            }
        }
        imageView.setVisibility(0);
        if (z3) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = (AnimatedVectorDrawableCompat) tpq0Var.d;
            imageView.setImageDrawable(animatedVectorDrawableCompat);
            if (!animatedVectorDrawableCompat.isRunning()) {
                animatedVectorDrawableCompat.start();
            }
        } else {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat2 = (AnimatedVectorDrawableCompat) tpq0Var.e;
            imageView.setImageDrawable(animatedVectorDrawableCompat2);
            if (!animatedVectorDrawableCompat2.isRunning()) {
                animatedVectorDrawableCompat2.start();
            }
        }
        imageView.setContentDescription(context.getString(oyh0.msg_message_status_pending_content_desc));
    }

    public final void c(boolean z) {
        this.a.setVisibility(z ? 0 : 8);
    }
}
