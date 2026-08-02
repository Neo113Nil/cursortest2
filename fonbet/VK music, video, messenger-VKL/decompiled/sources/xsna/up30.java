package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.util.measure.ScaleType;
import com.vk.core.view.fresco.VKEnhancedImageView;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.attaches.AttachWall;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.ui.views.msg.TimeAndStatusView;
import com.vkontakte.android.R;
import java.util.Collection;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* compiled from: MsgPartDonatePlaceholderRedesignHolder.kt */
/* loaded from: classes2.dex */
public final class up30 extends hr30<AttachWall, vp30> {
    public static final int u;
    public static final int w;
    public View d;
    public Context e;
    public View f;
    public VKEnhancedImageView g;
    public TimeAndStatusView h;
    public TextView i;
    public Button j;
    public FrameLayout k;
    public final Object l;
    public final Object m;
    public final Object n;
    public pk30 o;
    public vp30 p;
    public final v5t q;
    public final Object r;
    public static final int s = iah0.a(186);
    public static final int t = iah0.a(8);
    public static final int v = iah0.a(18);
    public static final float x = cn70.c(10);

    static {
        float f = 2;
        u = iah0.a(f);
        w = iah0.a(f);
    }

    public up30() {
        com.vk.movika.sdk.base.ui.v vVar = new com.vk.movika.sdk.base.ui.v(24);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.l = msy.a(lazyThreadSafetyMode, vVar);
        this.m = msy.a(lazyThreadSafetyMode, new cfl(this, 22));
        this.n = msy.a(lazyThreadSafetyMode, new ufk(this, 14));
        this.q = new v5t(R.layout.vkim_msg_part_donate_placeholder);
        this.r = msy.a(lazyThreadSafetyMode, new bih(this, 29));
    }

    @Override // xsna.hr30
    public final View n(int i) {
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.hr30
    public final void o(BubbleColors bubbleColors) {
        Pair pair;
        Pair pair2;
        vp30 vp30Var = this.p;
        boolean z = (vp30Var != null ? vp30Var.f : null) != null;
        boolean M = dhr0.M();
        vp30 vp30Var2 = this.p;
        boolean z2 = vp30Var2 != null ? vp30Var2.g : true;
        Integer valueOf = (vp30Var2 == null || !vp30Var2.j) ? Integer.valueOf(bubbleColors.r) : null;
        TextView textView = this.i;
        if (textView == null) {
            textView = null;
        }
        textView.setTextColor(z ? dhr0.t.c(R.attr.vk_ui_text_contrast) : (valueOf == null || !z2) ? (valueOf == null || z2) ? dhr0.t.c(R.attr.vk_ui_text_primary) : dhr0.t.c(R.attr.vk_ui_text_contrast) : dhr0.t.c(R.attr.vk_ui_text_primary));
        if (z) {
            abg0 abg0Var = dhr0.t;
            pair2 = new Pair(Integer.valueOf(abg0Var.c(R.attr.vk_ui_background_contrast)), Integer.valueOf(abg0Var.c(R.attr.vk_ui_text_primary_invariably)));
        } else {
            if (valueOf != null && z2) {
                pair = new Pair(valueOf, Integer.valueOf(dhr0.t.c(R.attr.vk_ui_text_contrast_themed)));
            } else if (valueOf != null && !z2) {
                abg0 abg0Var2 = dhr0.t;
                pair2 = new Pair(Integer.valueOf(abg0Var2.c(R.attr.vk_ui_background_contrast)), Integer.valueOf(abg0Var2.c(R.attr.vk_ui_text_primary_invariably)));
            } else if (M) {
                abg0 abg0Var3 = dhr0.t;
                pair = new Pair(Integer.valueOf(abg0Var3.c(R.attr.vk_ui_text_accent_themed)), Integer.valueOf(abg0Var3.c(R.attr.vk_ui_text_contrast_themed)));
            } else {
                abg0 abg0Var4 = dhr0.t;
                pair = new Pair(Integer.valueOf(abg0Var4.c(R.attr.vk_ui_text_accent_themed)), Integer.valueOf(abg0Var4.c(R.attr.vk_ui_text_contrast_themed)));
            }
            pair2 = pair;
        }
        int intValue = ((Number) pair2.d()).intValue();
        int intValue2 = ((Number) pair2.g()).intValue();
        ?? r2 = this.l;
        ((wng0) r2.getValue()).b(intValue);
        Button button = this.j;
        if (button == null) {
            button = null;
        }
        button.setBackground((wng0) r2.getValue());
        Button button2 = this.j;
        (button2 != null ? button2 : null).setTextColor(intValue2);
    }

    @Override // xsna.hr30
    public final void p(vp30 vp30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        vp30 vp30Var2 = vp30Var;
        this.o = pk30Var;
        this.p = vp30Var2;
        boolean z = vp30Var2.i;
        if (z) {
            View view = this.d;
            if (view == null) {
                view = null;
            }
            int i = w;
            view.setPaddingRelative(i, i, i, i);
        } else {
            View view2 = this.d;
            if (view2 == null) {
                view2 = null;
            }
            view2.setPaddingRelative(0, 0, 0, 0);
        }
        ImageList imageList = vp30Var2.f;
        if (imageList == null) {
            if (z) {
                View view3 = this.f;
                if (view3 == null) {
                    view3 = null;
                }
                view3.setTranslationY(-x);
            } else {
                View view4 = this.f;
                if (view4 == null) {
                    view4 = null;
                }
                view4.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
        }
        TextView textView = this.i;
        if (textView == null) {
            textView = null;
        }
        textView.setText(vp30Var2.c);
        Button button = this.j;
        if (button == null) {
            button = null;
        }
        button.setText(vp30Var2.d);
        if (imageList != null) {
            VKEnhancedImageView vKEnhancedImageView = this.g;
            if (vKEnhancedImageView == null) {
                vKEnhancedImageView = null;
            }
            vKEnhancedImageView.setVisibility(0);
            VKEnhancedImageView vKEnhancedImageView2 = this.g;
            if (vKEnhancedImageView2 == null) {
                vKEnhancedImageView2 = null;
            }
            vKEnhancedImageView2.setRemoteImage(imageList);
        } else {
            VKEnhancedImageView vKEnhancedImageView3 = this.g;
            if (vKEnhancedImageView3 == null) {
                vKEnhancedImageView3 = null;
            }
            f4m.j(vKEnhancedImageView3);
        }
        int i2 = v;
        int i3 = z ? u : i2;
        VKEnhancedImageView vKEnhancedImageView4 = this.g;
        if (vKEnhancedImageView4 == null) {
            vKEnhancedImageView4 = null;
        }
        vKEnhancedImageView4.Y0(i3, i3, i2, i2);
        jr30 jr30Var = vp30Var2.b;
        TimeAndStatusView timeAndStatusView = this.h;
        hr30.l(timeAndStatusView != null ? timeAndStatusView : null, jr30Var, true);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.e = viewGroup.getContext();
        View c = this.q.c(layoutInflater, viewGroup);
        this.d = c;
        if (c == null) {
            c = null;
        }
        this.f = c.findViewById(R.id.donate_content_container);
        View view = this.d;
        if (view == null) {
            view = null;
        }
        this.g = (VKEnhancedImageView) view.findViewById(R.id.image);
        View view2 = this.d;
        if (view2 == null) {
            view2 = null;
        }
        this.i = (TextView) view2.findViewById(R.id.donate_placeholder_title);
        View view3 = this.d;
        if (view3 == null) {
            view3 = null;
        }
        this.j = (Button) view3.findViewById(R.id.donate_placeholder_button);
        View view4 = this.d;
        if (view4 == null) {
            view4 = null;
        }
        this.h = (TimeAndStatusView) view4.findViewById(R.id.timeAndStatus);
        View view5 = this.d;
        if (view5 == null) {
            view5 = null;
        }
        this.k = (FrameLayout) view5.findViewById(R.id.container);
        Button button = this.j;
        if (button == null) {
            button = null;
        }
        jjc.f((View.OnClickListener) this.r.getValue(), button);
        Button button2 = this.j;
        if (button2 == null) {
            button2 = null;
        }
        his0.v(button2, R.drawable.vk_icon_donut_color_16, 0);
        FrameLayout frameLayout = this.k;
        if (frameLayout == null) {
            frameLayout = null;
        }
        int i = s;
        frameLayout.setMinimumWidth(i);
        frameLayout.setMinimumHeight(i);
        VKEnhancedImageView vKEnhancedImageView = this.g;
        if (vKEnhancedImageView == null) {
            vKEnhancedImageView = null;
        }
        vKEnhancedImageView.setPlaceholder((ek30) this.m.getValue());
        vKEnhancedImageView.setMaximumWidth(Integer.MAX_VALUE);
        vKEnhancedImageView.setMaximumHeight(i);
        vKEnhancedImageView.setMinimumHeight(i);
        vKEnhancedImageView.setScaleType(ScaleType.CENTER_CROP_UPSCALE);
        vKEnhancedImageView.setColorFilter(1711276032);
        View view6 = this.d;
        if (view6 == null) {
            return null;
        }
        return view6;
    }

    @Override // xsna.hr30
    public final void r() {
        this.o = null;
        this.p = null;
    }

    @Override // xsna.hr30
    public final Collection<Integer> v(String str) {
        return EmptyList.b;
    }
}
