package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ViewFlipper;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.voip.ui.group_selector.VoipGroupSelectorConfig;
import com.vk.voip.ui.group_selector.ui.a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import xsna.dw20;
import xsna.tzp0;

/* compiled from: VoipGroupSelectorContentView.kt */
/* loaded from: classes7.dex */
public final class sow0 {
    public final Context a;
    public final VoipGroupSelectorConfig b;
    public final dpw0<com.vk.voip.ui.group_selector.ui.a> c;
    public final tzp0.c d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public dw20 o;
    public final uow0 p;
    public final tow0 q;

    /* compiled from: VoipGroupSelectorContentView.kt */
    public final class a implements DialogInterface.OnDismissListener {
        public a() {
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            sow0 sow0Var = sow0.this;
            sow0Var.a().setLayoutManager(null);
            sow0Var.a().setAdapter(null);
            ((pow0) sow0Var.i.getValue()).setItems(EmptyList.b);
            sow0Var.c.a(a.c.a);
        }
    }

    public sow0(Context context, VoipGroupSelectorConfig voipGroupSelectorConfig, dpw0 dpw0Var) {
        tzp0.c a2 = tzp0.a(null, 3);
        this.a = context;
        this.b = voipGroupSelectorConfig;
        this.c = dpw0Var;
        this.d = a2;
        h8n0 h8n0Var = new h8n0(this, 19);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.e = msy.a(lazyThreadSafetyMode, h8n0Var);
        this.f = msy.a(lazyThreadSafetyMode, new i8n0(this, 17));
        this.g = msy.a(lazyThreadSafetyMode, new prq0(this, 23));
        int i = 27;
        this.h = msy.a(lazyThreadSafetyMode, new wmd0(this, i));
        this.i = msy.a(lazyThreadSafetyMode, new j8n0(this, i));
        this.j = msy.a(lazyThreadSafetyMode, new cqr0(this, 14));
        this.k = msy.a(lazyThreadSafetyMode, new uho0(this, 19));
        this.l = msy.a(lazyThreadSafetyMode, new avj0(this, 27));
        this.m = msy.a(lazyThreadSafetyMode, new ksq0(this, 16));
        this.n = msy.a(lazyThreadSafetyMode, new cck0(this, 22));
        this.p = new uow0(this);
        this.q = new tow0(this);
        ViewFlipper d = d();
        AlphaAnimation alphaAnimation = new AlphaAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        alphaAnimation.setDuration(200L);
        d.setInAnimation(alphaAnimation);
        ViewFlipper d2 = d();
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        alphaAnimation2.setDuration(200L);
        d2.setOutAnimation(alphaAnimation2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final RecyclerView a() {
        return (RecyclerView) this.h.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final VkSearchView b() {
        return (VkSearchView) this.g.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final Toolbar c() {
        return (Toolbar) this.f.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ViewFlipper d() {
        return (ViewFlipper) this.e.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void e() {
        if (this.o == null) {
            this.o = new dw20.b(this.a, this.d).D0(d(), true).z((View) this.k.getValue()).Z(new a()).n(this.q).F0(true).x(0).c(new ts90(0.7f, 2)).I0("sow0");
        }
    }
}
