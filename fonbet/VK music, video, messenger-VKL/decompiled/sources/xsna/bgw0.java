package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.view.animation.AlphaAnimation;
import android.widget.ViewFlipper;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.voip.ui.call_by_link.ui.a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import xsna.dw20;
import xsna.tzp0;

/* compiled from: VoipCallByLinkContentView.kt */
/* loaded from: classes7.dex */
public final class bgw0 {
    public final Context a;
    public final kgw0<a.AbstractC2032a> b;
    public final tzp0.c c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public dw20 h;

    /* compiled from: VoipCallByLinkContentView.kt */
    public final class a implements DialogInterface.OnDismissListener {
        public a() {
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            bgw0 bgw0Var = bgw0.this;
            bgw0Var.a().setLayoutManager(null);
            bgw0Var.a().setAdapter(null);
            ((vfw0) bgw0Var.f.getValue()).setItems(EmptyList.b);
            bgw0Var.b.a(a.AbstractC2032a.b.a);
        }
    }

    public bgw0(Context context, kgw0 kgw0Var) {
        tzp0.c a2 = tzp0.a(null, 1);
        this.a = context;
        this.b = kgw0Var;
        this.c = a2;
        mll0 mll0Var = new mll0(this, 20);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.d = msy.a(lazyThreadSafetyMode, mll0Var);
        this.e = msy.a(lazyThreadSafetyMode, new fem0(this, 16));
        this.f = msy.a(lazyThreadSafetyMode, new m0t0(this, 6));
        this.g = msy.a(lazyThreadSafetyMode, new wrl0(this, 28));
        ViewFlipper b = b();
        AlphaAnimation alphaAnimation = new AlphaAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        alphaAnimation.setDuration(200L);
        b.setInAnimation(alphaAnimation);
        ViewFlipper b2 = b();
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        alphaAnimation2.setDuration(200L);
        b2.setOutAnimation(alphaAnimation2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final RecyclerView a() {
        return (RecyclerView) this.e.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ViewFlipper b() {
        return (ViewFlipper) this.d.getValue();
    }

    public final void c() {
        if (this.h == null) {
            this.h = new dw20.b(this.a, this.c).D0(b(), false).Z(new a()).x(0).u(0).c(new jgj(b(), 0, 0, 14)).I0("bgw0");
        }
    }
}
