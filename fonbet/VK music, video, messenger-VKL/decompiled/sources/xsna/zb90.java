package xsna;

import android.text.Editable;
import android.view.View;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.formitem.VkInputSelect;

/* compiled from: PagerScrollPosition.kt */
/* loaded from: classes11.dex */
public final class zb90 {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public final Object f;

    public zb90(VkInputSelect vkInputSelect, ImageView imageView, View view, ImageView imageView2, ImageView imageView3) {
        this.b = vkInputSelect;
        this.c = imageView;
        this.d = view;
        this.e = imageView2;
        this.f = imageView3;
        view.setScaleX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        view.setScaleY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public static void d(zb90 zb90Var, ImageView imageView, boolean z, float f, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        if (!z) {
            f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f2 = z ? 1.0f : 0.25f;
        imageView.animate().alpha(f).scaleX(f2).scaleY(f2).setDuration(200L).start();
    }

    public void a(boolean z) {
        View view = (View) this.d;
        if (z) {
            xo2.d(31, 0L, view);
        } else {
            xo2.e(view, 0L, null, 15);
        }
    }

    public void b(boolean z) {
        ImageView imageView = (ImageView) this.e;
        d(this, imageView, z, imageView.getAlpha(), 8);
    }

    public void c(boolean z) {
        ImageView imageView = (ImageView) this.c;
        VkInputSelect vkInputSelect = (VkInputSelect) this.b;
        if (!z) {
            j8z j8zVar = qq2.f;
            d3m.e(vkInputSelect, (r15 & 1) != 0 ? 300L : 200L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? j8zVar : null, (r15 & 16) != 0 ? false : false);
            if (this.a) {
                d3m.e(imageView, (r15 & 1) != 0 ? 300L : 200L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? j8zVar : null, (r15 & 16) != 0 ? false : false);
                a(false);
                return;
            }
            return;
        }
        hlq hlqVar = qq2.g;
        d3m.c(vkInputSelect, (r15 & 1) != 0 ? 300L : 200L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? hlqVar : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (this.a) {
            d3m.c(imageView, (r15 & 1) != 0 ? 300L : 200L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? hlqVar : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            Editable text = vkInputSelect.getText();
            a(text == null || text.length() == 0);
        }
    }

    public void e(boolean z) {
        ((ImageView) this.f).animate().setDuration(200L).alpha(z ? 1.0f : 0.4f).start();
    }

    public zb90(int i, float f, mc90 mc90Var) {
        this.b = mc90Var;
        this.c = androidx.compose.runtime.i.a(i);
        this.d = androidx.compose.runtime.d.a(f);
        this.f = new tty(i, 30, 100);
    }
}
