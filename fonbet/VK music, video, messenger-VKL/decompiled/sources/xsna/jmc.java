package xsna;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: ClipBaseFeedControlsView.kt */
/* loaded from: classes16.dex */
public abstract class jmc extends FrameLayout {
    public final LinearLayout b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public jmc(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static View a(jmc jmcVar) {
        xr8<q6f0> xr8Var = jmcVar.getRenderers().a;
        if (xr8Var != null) {
            return xr8Var.getView();
        }
        return null;
    }

    public static View b(jmc jmcVar) {
        xr8<abj0> xr8Var = jmcVar.getRenderers().d;
        if (xr8Var != null) {
            return xr8Var.getView();
        }
        return null;
    }

    public static View c(jmc jmcVar) {
        xr8<t930> xr8Var = jmcVar.getRenderers().f;
        if (xr8Var != null) {
            return xr8Var.getView();
        }
        return null;
    }

    public static View d(jmc jmcVar) {
        jmcVar.getRenderers();
        return jmcVar.findViewById(R.id.fullscreen_clip_overlay_separator);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final View getMoreView() {
        return (View) this.f.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final wyc getRenderers() {
        return (wyc) this.c.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final View getSeparatorView() {
        return (View) this.g.getValue();
    }

    public abstract n7e e();

    public final void f(n7e n7eVar) {
        t930 t930Var = n7eVar.e;
        q6f0 q6f0Var = n7eVar.a;
        if (isAttachedToWindow()) {
            xr8<q6f0> xr8Var = getRenderers().a;
            if (xr8Var != null) {
                xr8Var.a(q6f0Var);
            }
            xr8<q6f0> xr8Var2 = getRenderers().b;
            if (xr8Var2 != null) {
                xr8Var2.a(q6f0Var);
            }
            xr8<ggg> xr8Var3 = getRenderers().c;
            if (xr8Var3 != null) {
                xr8Var3.a(n7eVar.b);
            }
            xr8<abj0> xr8Var4 = getRenderers().d;
            if (xr8Var4 != null) {
                xr8Var4.a(n7eVar.c);
            }
            xr8<itq> xr8Var5 = getRenderers().e;
            if (xr8Var5 != null) {
                xr8Var5.a(n7eVar.d);
            }
            xr8<t930> xr8Var6 = getRenderers().f;
            if (xr8Var6 != null) {
                xr8Var6.a(t930Var);
            }
            n7e e = e();
            q6f0 q6f0Var2 = e.a;
            boolean z = q6f0Var2.b.b.a && (q6f0Var2.a.b.a || e.b.b.a || e.c.b.a || e.d.b.a);
            View separatorView = getSeparatorView();
            if (separatorView != null) {
                separatorView.setVisibility(z ? 0 : 8);
            }
            if (z) {
                View moreView = getMoreView();
                if (moreView != null) {
                    f4m.t(iah0.a(0), moreView);
                }
            } else {
                View moreView2 = getMoreView();
                if (moreView2 != null) {
                    f4m.t(iah0.a(4), moreView2);
                }
            }
            if (t930Var.b.a) {
                f4m.v(0, this);
            } else {
                f4m.v(iah0.a(16), this);
            }
        }
    }

    public abstract ykj0 getControlsUseCases();

    public abstract byg0 getCustomSideControlsConfig();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final View getLikeContainer() {
        return (View) this.e.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final View getShareContainer() {
        return (View) this.d.getValue();
    }

    public abstract xkj0 getSideControlsFactory();

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f(e());
    }

    public jmc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        LinearLayout linearLayout = new LinearLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 80;
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setGravity(8388613);
        linearLayout.setOrientation(1);
        this.b = linearLayout;
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        addView(linearLayout);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = msy.a(lazyThreadSafetyMode, new s1(this, 18));
        this.d = msy.a(lazyThreadSafetyMode, new u40(this, 12));
        this.e = msy.a(lazyThreadSafetyMode, new v40(this, 13));
        this.f = msy.a(lazyThreadSafetyMode, new w40(this, 19));
        this.g = msy.a(lazyThreadSafetyMode, new ca(this, 18));
    }
}
