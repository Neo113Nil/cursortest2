package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.photoviewer.PhotoViewer;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import xsna.nlg;
import xsna.q4a0;

/* compiled from: GifViewerPage.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public final class fzt extends ggs {
    public static final int j = iah0.a(100);
    public final PhotoViewer.e d;
    public final q4a0.b e;
    public final fir0 f;
    public final vqt0 g;
    public final View h;
    public final ImageView i;

    /* compiled from: GifViewerPage.kt */
    public interface a {
    }

    public fzt(Context context, int i, PhotoViewer.e eVar, q4a0.b bVar) {
        super(context, i, eVar);
        this.d = eVar;
        this.e = bVar;
        fir0 fir0Var = new fir0(context);
        this.f = fir0Var;
        bpn0 bpn0Var = y6l.b;
        nlg.a a2 = ((cea0) (bpn0Var == null ? null : bpn0Var).getValue()).a(context);
        this.g = a2;
        View view = a2.a;
        this.h = view;
        ImageView imageView = new ImageView(context);
        this.i = imageView;
        if (eVar.b().length() > 0) {
            view.setOnClickListener(new yb(this, 5));
            addView(view, new FrameLayout.LayoutParams(-1, -1));
            e();
            a2.c(eVar.b(), (r22 & 4) == 0, (r22 & 8) != 0, (r22 & 64) != 0 ? new qpt0(0) : new z4f(this, 28), new yqf(this, 21), new zqf(this, 26), (r22 & 512) != 0 ? new bzq0(2) : new b1j(this, 21), (r22 & 1024) != 0 ? new w5k0(8) : new bzj(this, 13), (r22 & 2048) != 0 ? new fd90(20) : null);
            return;
        }
        fir0Var.setId(R.id.pv_gif_view);
        fir0Var.setAutoPlayAnimations(true);
        fir0Var.setOnLoadCallback(new gzt(this));
        fir0Var.setOnClickListener(new x16(this, 11));
        addView(fir0Var, new FrameLayout.LayoutParams(-1, -1));
        e();
        String c = eVar.c();
        twt0.b(6, 100L, imageView);
        fir0Var.o0(c, null);
    }

    @Override // xsna.ggs
    public final void a() {
        this.g.release();
        this.f.getBackend().cancel();
        ImageView imageView = this.i;
        Drawable drawable = imageView.getDrawable();
        waa0 waa0Var = drawable instanceof waa0 ? (waa0) drawable : null;
        if (waa0Var != null) {
            waa0Var.stop();
        }
        d3m.b(imageView, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
    }

    @Override // xsna.ggs
    public final void b() {
        this.g.setPlayWhenReady(false);
        d3m.b(this.h, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
    }

    @Override // xsna.ggs
    public final void d() {
        this.g.setPlayWhenReady(true);
    }

    public final void e() {
        ImageView imageView = this.i;
        imageView.setVisibility(8);
        imageView.setImageDrawable(new waa0());
        Drawable drawable = imageView.getDrawable();
        waa0 waa0Var = drawable instanceof waa0 ? (waa0) drawable : null;
        if (waa0Var != null) {
            waa0Var.start();
        }
        int i = j;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        s3q0 s3q0Var = s3q0.a;
        addView(imageView, layoutParams);
    }

    public final a getCallback() {
        return this.e;
    }

    public final PhotoViewer.e getGif() {
        return this.d;
    }

    @Override // xsna.ggs
    public List<View> getViewsForTranslate() {
        return Collections.singletonList(this);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            d();
        } else {
            b();
        }
    }
}
