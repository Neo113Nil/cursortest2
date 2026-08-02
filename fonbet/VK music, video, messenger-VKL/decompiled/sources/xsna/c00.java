package xsna;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.concurrent.TimeUnit;
import xsna.e3m;
import xsna.k9d0;

/* compiled from: ActionDisableMic.kt */
/* loaded from: classes7.dex */
public final class c00 extends vu<k9d0.e> {
    public final int e;
    public final Integer f;
    public final io.reactivex.rxjava3.internal.operators.observable.e1 g;
    public io.reactivex.rxjava3.disposables.c h;
    public y3v0 i;
    public int j;
    public int k;

    public c00(int i, Integer num, gzs<s3q0> gzsVar) {
        super(null, gzsVar);
        this.e = i;
        this.f = num;
        this.g = io.reactivex.rxjava3.core.q.P(0L, 100L, TimeUnit.MILLISECONDS);
        this.j = -1;
        this.k = -16711936;
    }

    @Override // xsna.ku
    public final void f() {
        io.reactivex.rxjava3.disposables.c cVar = this.h;
        if (cVar != null) {
            cVar.dispose();
        }
        this.h = null;
        this.i = null;
    }

    @Override // xsna.ku
    public final void g(View view, Object obj) {
        k9d0.e eVar = (k9d0.e) obj;
        ImageView imageView = (ImageView) view;
        imageView.setVisibility(0);
        rdi.B(imageView, eVar.a);
        boolean z = eVar.b;
        if (z) {
            y3v0 y3v0Var = this.i;
            if (y3v0Var != null) {
                y3v0Var.b(this.j);
            }
            imageView.setActivated(false);
            imageView.setContentDescription(imageView.getContext().getString(R.string.voip_accessibility_mic_off));
            io.reactivex.rxjava3.disposables.c cVar = this.h;
            if (cVar != null) {
                cVar.dispose();
            }
            this.h = this.g.a0(asu0.a.d()).subscribe(new b00(new k9(this, 1), 0));
        } else {
            io.reactivex.rxjava3.disposables.c cVar2 = this.h;
            if (cVar2 != null) {
                cVar2.dispose();
            }
            this.h = null;
            y3v0 y3v0Var2 = this.i;
            if (y3v0Var2 != null) {
                y3v0Var2.k = 0;
                y3v0Var2.a.clearColorFilter();
                y3v0Var2.b.clearColorFilter();
                y3v0Var2.c.clearColorFilter();
                y3v0Var2.invalidateSelf();
                y3v0Var2.a(-1.0f, false);
            }
            imageView.setActivated(true);
            imageView.setContentDescription(imageView.getContext().getString(R.string.voip_accessibility_mic_on));
        }
        imageView.setElevation(z ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : this.e);
    }

    @Override // xsna.wu
    public final int j() {
        Integer num = this.f;
        return num != null ? num.intValue() : super.j();
    }

    @Override // xsna.wu
    public final ImageView.ScaleType l() {
        return ImageView.ScaleType.FIT_CENTER;
    }

    @Override // xsna.wu
    public final int m() {
        return 0;
    }

    @Override // xsna.wu, xsna.ku
    /* renamed from: o */
    public final ImageView e(Context context) {
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        int b = cn70.b(16);
        appCompatImageView.setPadding(b, b, b, b);
        e3m.a aVar = e3m.a;
        this.j = context.getColor(R.color.voip_mic_base_color_enabled);
        this.k = context.getColor(R.color.voip_mic_sound_color);
        y3v0 y3v0Var = new y3v0(context);
        y3v0Var.b(this.j);
        int i = this.k;
        if (y3v0Var.l != i) {
            y3v0Var.l = i;
            y3v0Var.d.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_ATOP));
            y3v0Var.invalidateSelf();
        }
        y3v0Var.i = 250L;
        this.i = y3v0Var;
        return appCompatImageView;
    }

    @Override // xsna.wu, xsna.ku
    /* renamed from: p */
    public final void h(ImageView imageView) {
        super.h(imageView);
        imageView.setImageDrawable(this.i);
        imageView.setId(R.id.btn_primary_disable_mic);
    }
}
