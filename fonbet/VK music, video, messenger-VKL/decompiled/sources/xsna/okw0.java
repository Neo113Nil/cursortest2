package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.a;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.e3m;

/* compiled from: VoipCallViewTopLayerBackgroundDelegate.kt */
/* loaded from: classes7.dex */
public final class okw0 {
    public final View a;

    /* compiled from: VoipCallViewTopLayerBackgroundDelegate.kt */
    public static final class a extends wuj {
        @Override // xsna.wuj
        public final void f(com.google.android.material.shape.d dVar, float f, float f2) {
            float f3 = f2 * f;
            dVar.e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, 180.0f, 90.0f);
            dVar.a((-2) * f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2 * f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -90.0f);
        }
    }

    /* compiled from: VoipCallViewTopLayerBackgroundDelegate.kt */
    public static final class b extends wuj {
        @Override // xsna.wuj
        public final void f(com.google.android.material.shape.d dVar, float f, float f2) {
            float f3 = f2 * f;
            dVar.e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -f3, 180.0f, 90.0f);
            dVar.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (-2) * f3, 2 * f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 180.0f, -90.0f);
        }
    }

    /* compiled from: VoipCallViewTopLayerBackgroundDelegate.kt */
    public static final class c extends ryo {
        public final float b;

        public c(float f) {
            this.b = f;
        }

        @Override // xsna.ryo
        public final void b(float f, float f2, float f3, com.google.android.material.shape.d dVar) {
            dVar.e(-(this.b * f3), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 270.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            dVar.d(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    /* compiled from: VoipCallViewTopLayerBackgroundDelegate.kt */
    public static final class d extends MaterialShapeDrawable {
        public nkw0 b;

        @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            nkw0 nkw0Var = this.b;
            if (nkw0Var != null) {
                okw0 okw0Var = nkw0Var.a;
                float f = nkw0Var.b;
                setInterpolation(Math.min(okw0Var.a.getHeight(), f) / f);
            }
            super.draw(canvas);
        }
    }

    /* compiled from: VoipCallViewTopLayerBackgroundDelegate.kt */
    public static final class e extends ryo {
        public final float b;

        public e(float f) {
            this.b = f;
        }

        @Override // xsna.ryo
        public final void b(float f, float f2, float f3, com.google.android.material.shape.d dVar) {
            float f4 = this.b * f3;
            dVar.e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 270.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            dVar.d(f4 + f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    public okw0(ViewGroup viewGroup) {
        View findViewById = viewGroup.findViewById(R.id.top_layers_background);
        this.a = findViewById;
        Resources resources = findViewById.getResources();
        float dimension = resources.getDimension(R.dimen.voip_top_layers_background_corner_radius);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.voip_top_layers_background_corner_radius);
        a.C0123a c0123a = new a.C0123a();
        c0123a.g(dimension);
        c0123a.f(new a());
        c0123a.k(dimension);
        c0123a.j(new b());
        c0123a.l = new c(dimension);
        c0123a.j = new e(dimension);
        d dVar = new d(c0123a.a());
        dVar.b = new nkw0(this, dimensionPixelSize);
        Context context = viewGroup.getContext();
        e3m.a aVar = e3m.a;
        dVar.setFillColor(ColorStateList.valueOf(context.getColor(R.color.vk_black)));
        viewGroup.setClipChildren(false);
        findViewById.setBackground(dVar);
    }
}
