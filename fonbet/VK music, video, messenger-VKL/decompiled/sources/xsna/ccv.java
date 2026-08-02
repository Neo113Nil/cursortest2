package xsna;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.imageloader.view.VKImageView;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import xsna.b68;
import xsna.inv;
import xsna.o7p0;

/* compiled from: HomeFragmentTopBar.kt */
/* loaded from: classes2.dex */
public final class ccv implements inv, q7k {
    public final TextView a;
    public final View b;
    public final View c;
    public final View d;
    public final View e;
    public final VKImageView f;
    public final yi70 g;
    public nbv h;
    public final Object i = msy.a(LazyThreadSafetyMode.NONE, new qe3(26));
    public gzs<Boolean> j;

    public ccv(View view, zb70 zb70Var) {
        this.a = (TextView) view.findViewById(R.id.title);
        this.b = view.findViewById(R.id.search_button);
        this.c = view.findViewById(R.id.posting_button);
        this.d = view.findViewById(R.id.posting_button_container);
        this.e = view.findViewById(R.id.navigation_icon);
        this.f = (VKImageView) view.findViewById(R.id.user_photo);
        this.g = new yi70(view, zb70Var);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.inv
    public final void a(FragmentActivity fragmentActivity, f5z f5zVar, inv.a aVar) {
        View view;
        View view2 = this.e;
        if (view2 != null) {
            bwt0.i0(view2, new ekh(aVar, 8));
        }
        VKImageView vKImageView = this.f;
        if (vKImageView != null) {
            bwt0.i0(vKImageView, new eqq(aVar, 9));
            bwt0.k0(vKImageView, new t9e(aVar, 28));
        }
        boolean z = aVar.b;
        View view3 = this.b;
        View view4 = this.d;
        if (z) {
            if (view2 != null) {
                bwt0.p0(view2, false);
            }
            if (vKImageView != null) {
                bwt0.p0(vKImageView, true);
                vKImageView.setPaintFilterBitmap(true);
                String str = o25.a().o().c;
                if (str == null) {
                    str = "";
                }
                ndq.a(vKImageView, str);
            }
            TextView textView = this.a;
            if (textView != null) {
                f4m.s(iah0.a(11), textView);
                textView.setTextAppearance(R.style.VkUiTypography_DisplayTitle2);
            }
            if (view3 != null) {
                bwt0.r0(iah0.a(54), view3);
                f4m.r(iah0.a(1), view3);
            }
            if (view4 != null) {
                bwt0.r0(iah0.a(50), view4);
            }
        } else if (view2 != null) {
            bwt0.p0(view2, aVar.a);
        }
        f(aVar.g);
        if (view3 != null) {
            view3.setOnClickListener(new l44(aVar, 5));
        }
        nbv nbvVar = new nbv(fragmentActivity);
        if (view4 != null && (view = this.c) != null) {
            bwt0.p0(view4, true);
            bwt0.g0(view4, new qt5(11, nbvVar, view));
        }
        nbvVar.c = new ggc0(f5zVar, fragmentActivity, new pvn(f5zVar, false), (fhc0) nbvVar.f.getValue(), (b25) nbvVar.g.getValue(), new f2i(nbvVar), ((NewsFeedComponent) ((k7m) m7m.f(nbvVar)).a(fpf0.a(NewsFeedComponent.class))).N0());
        this.h = nbvVar;
        if (((Boolean) this.i.getValue()).booleanValue() && view4 != null) {
            gzs<Boolean> gzsVar = aVar.k;
            this.j = gzsVar;
            r7k r7kVar = new r7k(new WeakReference(view4), new nk(24), new WeakReference(this), new WeakReference(gzsVar));
            hl60 hl60Var = hl60.a;
            hl60.d(o7p0.a.b, r7kVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.inv
    public final void b() {
        if (((Boolean) this.i.getValue()).booleanValue()) {
            hl60 hl60Var = hl60.a;
            hl60.d(o7p0.a.b, null);
            this.h = null;
        }
        yi70 yi70Var = this.g;
        yi70Var.getClass();
        b68 b68Var = b68.b;
        Iterator<WeakReference<b68.a>> it = b68.e().g.iterator();
        while (it.hasNext()) {
            if (it.next().get() == yi70Var) {
                it.remove();
            }
        }
    }

    @Override // xsna.inv
    public final RectF c() {
        VKImageView vKImageView = this.f;
        if (vKImageView != null) {
            return bwt0.G(vKImageView);
        }
        return null;
    }

    @Override // xsna.inv
    public final Integer d() {
        return null;
    }

    @Override // xsna.inv
    public final void e(Context context, v6j v6jVar) {
        VKImageView vKImageView;
        if (context == null || (vKImageView = this.f) == null) {
            return;
        }
        String str = (String) v6jVar.b;
        if (str == null) {
            str = "";
        }
        ndq.a(vKImageView, str);
    }

    @Override // xsna.inv
    public final void f(boolean z) {
        View view = this.b;
        if (view != null) {
            bwt0.p0(view, z);
        }
    }

    @Override // xsna.q7k
    public final void g() {
        View view = this.d;
        if (view != null) {
            view.callOnClick();
        }
    }

    @Override // xsna.inv
    public final void h(String str, boolean z, xis xisVar) {
        Context context;
        TextView textView = this.a;
        if (z) {
            if (textView == null || (context = textView.getContext()) == null) {
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) str);
            spannableStringBuilder.append((CharSequence) " ");
            ylw ylwVar = new ylw(R.drawable.vk_icon_dropdown_16);
            ylwVar.e = -1.0f;
            ylwVar.d = true;
            int b = cn70.b(16);
            ylwVar.a = b;
            ylwVar.b = b;
            ylwVar.f = cn70.b(2);
            spannableStringBuilder.append((CharSequence) ylwVar.b(context));
            textView.setText(new SpannedString(spannableStringBuilder));
        } else if (textView != null) {
            textView.setText(str);
        }
        if (textView != null) {
            bwt0.i0(textView, new qpj(xisVar, 19));
        }
    }

    @Override // xsna.inv
    public final void i(int i) {
        ggc0 ggc0Var;
        nbv nbvVar = this.h;
        if (nbvVar == null || (ggc0Var = nbvVar.c) == null) {
            return;
        }
        ggc0Var.g.o7(i);
    }

    @Override // xsna.inv
    public final void j(int i, boolean z) {
        yi70 yi70Var = this.g;
        TextView textView = yi70Var.c;
        if (z) {
            if (i > 0 && i != yi70Var.f) {
                Object drawable = yi70Var.b.getDrawable();
                Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
                if (animatable != null) {
                    animatable.start();
                }
            }
            int i2 = yi70Var.f;
            if (i2 <= 0 && i > 0) {
                bwt0.W(textView, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, new wi70(yi70Var, i));
            } else if (i2 <= 0 || i > 0) {
                bwt0.p0(textView, i > 0);
                textView.setText(cn70.g(i));
            } else {
                bwt0.W(textView, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new xi70(yi70Var, i));
            }
            yi70Var.f = i;
            bwt0.p0(yi70Var.e, false);
        }
    }
}
