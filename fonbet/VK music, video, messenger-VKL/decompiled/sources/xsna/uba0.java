package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoTag;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;

/* compiled from: PhotoTagListItemHolder.kt */
/* loaded from: classes4.dex */
public final class uba0 extends vif0<PhotoTag> implements View.OnClickListener, View.OnAttachStateChangeListener {
    public final VKImageView n;
    public final TextView o;
    public final TextView p;
    public final TextView q;
    public final TextView r;
    public final View s;
    public Photo t;
    public final yba0 u;
    public z980 v;

    public uba0(ViewGroup viewGroup) {
        super(viewGroup, R.layout.photo_tag_list_item, 0);
        VKImageView vKImageView = (VKImageView) this.itemView.findViewById(R.id.photo);
        this.n = vKImageView;
        this.o = (TextView) this.itemView.findViewById(R.id.name);
        this.p = (TextView) this.itemView.findViewById(R.id.description);
        TextView textView = (TextView) this.itemView.findViewById(R.id.confirm_button);
        this.q = textView;
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.cancel_button);
        this.r = textView2;
        this.s = this.itemView.findViewById(R.id.done);
        yba0 yba0Var = new yba0();
        this.u = yba0Var;
        dek0.b(vKImageView, null, null, 6);
        this.itemView.addOnAttachStateChangeListener(this);
        vKImageView.setActualScaleType(yba0Var);
        textView.setOnClickListener(this);
        textView2.setOnClickListener(this);
    }

    @Override // xsna.vif0
    public final void i6(PhotoTag photoTag) {
        PhotoTag photoTag2 = photoTag;
        this.t = null;
        this.n.clear();
        double d = photoTag2.h;
        double d2 = photoTag2.i;
        double d3 = photoTag2.j;
        double d4 = photoTag2.k;
        yba0 yba0Var = this.u;
        yba0Var.a = d;
        yba0Var.b = d2;
        yba0Var.c = d3;
        yba0Var.d = d4;
        this.o.setText(photoTag2.f);
        String str = photoTag2.g;
        TextView textView = this.p;
        textView.setText(str);
        bwt0.p0(textView, !(str == null || str.length() == 0));
        bwt0.p0(this.q, !photoTag2.l);
        bwt0.p0(this.s, photoTag2.l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TextView textView = this.q;
        if (!epx.f(view, textView)) {
            TextView textView2 = this.r;
            if (epx.f(view, textView2)) {
                Photo photo = this.t;
                if (photo == null) {
                    com.vk.metrics.eventtracking.b.a.q(new NullPointerException("photo == null"));
                    return;
                }
                bwt0.p0(textView2, false);
                bwt0.p0(textView, true);
                z980 z980Var = this.v;
                if (z980Var != null) {
                    z980Var.R5(photo, (PhotoTag) this.m);
                    return;
                }
                return;
            }
            return;
        }
        Photo photo2 = this.t;
        if (photo2 == null) {
            com.vk.metrics.eventtracking.b.a.q(new NullPointerException("photo == null"));
            return;
        }
        bwt0.p0(textView, false);
        View view2 = this.s;
        view2.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        bwt0.p0(view2, true);
        view2.animate().alpha(1.0f).setDuration(250L).start();
        z980 z980Var2 = this.v;
        if (z980Var2 != null) {
            z980Var2.w4(photo2, (PhotoTag) this.m);
        }
        oea0 oea0Var = new oea0(photo2, (PhotoTag) this.m, photo2.r, 16);
        oea0Var.k = true;
        itg0.m(rsg0.y0(oea0Var, null, null, 3));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.s.animate().cancel();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
