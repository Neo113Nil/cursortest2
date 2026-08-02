package xsna;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.ily;

/* compiled from: ClipsIconButtonImpl.kt */
/* loaded from: classes16.dex */
public final class hge implements fge {
    public final View a;
    public final ImageView b;
    public final TextView c;
    public final Object d = msy.a(LazyThreadSafetyMode.NONE, new f5(this, 24));
    public rr8 e = new rr8(0);
    public final View f;

    public hge(View view, ImageView imageView, TextView textView) {
        this.a = view;
        this.b = imageView;
        this.c = textView;
        this.f = view;
    }

    @Override // xsna.fge
    public final void a(izs<? super View, s3q0> izsVar) {
        jjc.g(this.a, izsVar);
    }

    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.fge
    public final void b(rr8 rr8Var) {
        if (epx.f(this.e, rr8Var)) {
            return;
        }
        this.e = rr8Var;
        String str = rr8Var.c.a;
        View view = this.a;
        view.setContentDescription(str);
        view.setBackground(this.e.c.b ? (Drawable) this.d.getValue() : null);
        int i = this.e.e.a;
        ImageView imageView = this.b;
        imageView.setImageResource(i);
        TextView textView = this.c;
        if (textView != null) {
            textView.setText(this.e.d.b);
            ily.a aVar = this.e.d.c;
            if (aVar != null) {
                float f = aVar.b;
                textView.setShadowLayer(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar.a, textView.getContext().getColor(R.color.vk_black_alpha24));
                int i2 = (int) f;
                f4m.x(i2, textView);
                f4m.w(i2, textView);
            }
        }
        rr8 rr8Var2 = this.e;
        boolean z = rr8Var2.b;
        if (z && rr8Var2.a) {
            view.setVisibility(0);
            imageView.setVisibility(0);
            if (textView != null) {
                textView.setVisibility(this.e.d.a ? 0 : 8);
                return;
            }
            return;
        }
        if (z) {
            view.setVisibility(4);
            imageView.setVisibility(4);
            if (textView != null) {
                textView.setVisibility(this.e.d.a ? 4 : 8);
                return;
            }
            return;
        }
        view.setVisibility(8);
        imageView.setVisibility(8);
        if (textView != null) {
            boolean z2 = this.e.d.a;
            textView.setVisibility(8);
        }
    }

    @Override // xsna.fge
    public final void c(final i4e i4eVar) {
        this.a.setOnLongClickListener(new View.OnLongClickListener() { // from class: xsna.gge
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                izs.this.invoke(view);
                return true;
            }
        });
    }

    @Override // xsna.fge
    public final void d() {
        this.a.setOnLongClickListener(null);
    }

    @Override // xsna.fge
    public final View getView() {
        return this.f;
    }
}
