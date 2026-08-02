package xsna;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.util.measure.ScaleType;
import com.vk.core.view.image.VkEnhancedImageView;
import com.vk.donut.price.model.template.DonutPriceTemplate;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.d0o;
import xsna.o1o;

/* compiled from: DonutImageHolder.kt */
/* loaded from: classes4.dex */
public final class b0o extends rp6<d0o, NewsEntry> {
    public final h170 E;
    public final VkEnhancedImageView F;
    public final o1o G;
    public final Object H;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b0o(ViewGroup viewGroup, h170 h170Var) {
        super(r0, viewGroup);
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.E = h170Var;
        FrameLayout frameLayout2 = (FrameLayout) this.itemView;
        VkEnhancedImageView vkEnhancedImageView = new VkEnhancedImageView(this.itemView.getContext(), null, 6, 0);
        vkEnhancedImageView.setId(R.id.feed_donut_teaser_image_photo);
        this.F = vkEnhancedImageView;
        o1o o1oVar = new o1o(this.itemView.getContext());
        o1oVar.setId(R.id.feed_donut_teaser_image_overlay);
        this.G = o1oVar;
        this.H = msy.a(LazyThreadSafetyMode.NONE, new x0(10));
        frameLayout2.addView(vkEnhancedImageView, -1, -2);
        frameLayout2.addView(o1oVar, -1, -1);
        vkEnhancedImageView.setSimpleAspectRatio(true);
        vkEnhancedImageView.setScaleType(ScaleType.FIT_CENTER);
        vkEnhancedImageView.setContentDescription(this.itemView.getContext().getString(R.string.feed_donut_teaser_image_accessibility));
        vkEnhancedImageView.setOnClickListener(new p01(this, 5));
    }

    @Override // xsna.rp6
    public final void R6(d0o d0oVar) {
        o1o.a aVar;
        String b;
        d0o d0oVar2 = d0oVar;
        d0o.a aVar2 = d0oVar2.h;
        String str = d0oVar2.i;
        o1o o1oVar = this.G;
        o1oVar.setDescription(str);
        CharSequence charSequence = d0oVar2.j;
        if (charSequence != null) {
            DonutPriceTemplate donutPriceTemplate = d0oVar2.k;
            if (donutPriceTemplate != null) {
                charSequence = y1o.b(donutPriceTemplate, this.itemView.getContext());
            }
            aVar = new o1o.a(charSequence, new ig1(11, this, d0oVar2));
        } else {
            aVar = null;
        }
        o1oVar.setButton(aVar);
        boolean z = aVar2 instanceof d0o.a.b;
        float f = 1.8f;
        VkEnhancedImageView vkEnhancedImageView = this.F;
        if (!z) {
            if (!(aVar2 instanceof d0o.a.C2693a)) {
                throw new NoWhenBranchMatchedException();
            }
            vkEnhancedImageView.clear();
            vkEnhancedImageView.setAspectRatio(1.8f);
            String str2 = ((d0o.a.C2693a) aVar2).a;
            int argb = Color.argb(255, 207, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, 233);
            try {
                argb = Color.parseColor(str2);
            } catch (Throwable unused) {
            }
            vkEnhancedImageView.setBackgroundImage(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{argb, l8g.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, argb)}));
            return;
        }
        vkEnhancedImageView.setSimpleAspectRatio(true);
        vkEnhancedImageView.setScaleType(ScaleType.FIT_CENTER);
        h170 h170Var = this.E;
        boolean z2 = h170Var.h() && h170Var.i();
        if (z2 && (b = com.vk.toggle.d.s().b(((d0o.a.b) aVar2).b, z2)) != null) {
            vkEnhancedImageView.setThumbHash(b);
        }
        vkEnhancedImageView.setBackgroundImage(new ColorDrawable(krv0.m(R.attr.vk_ui_image_placeholder, this.itemView.getContext())));
        Float f2 = ((d0o.a.b) aVar2).c;
        if (f2 != null) {
            float floatValue = f2.floatValue();
            if (floatValue <= 1.8f) {
                f = floatValue;
            }
        } else {
            f = 1.0f;
        }
        vkEnhancedImageView.setAspectRatio(f);
        bwt0.S(vkEnhancedImageView, new nm1(9, d0oVar2, this));
    }
}
