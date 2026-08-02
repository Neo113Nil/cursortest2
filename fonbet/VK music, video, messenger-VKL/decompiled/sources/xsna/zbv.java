package xsna;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.view.components.counter.VkCounter;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.core.view.interop.model.ContentScale;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import kotlin.LazyThreadSafetyMode;
import xsna.inv;
import xsna.o7p0;
import xsna.snx;

/* compiled from: HomeFragmentComposeTopBar.kt */
/* loaded from: classes2.dex */
public final class zbv implements inv, q7k {
    public final VkTopBar a;
    public int b;
    public inv.a c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public gzs<Boolean> h;

    public zbv(View view) {
        view.getContext();
        this.a = (VkTopBar) view.findViewById(R.id.feed_home_top_bar);
        this.c = new inv.a(0);
        l9 l9Var = new l9(12);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.d = msy.a(lazyThreadSafetyMode, l9Var);
        this.e = msy.a(lazyThreadSafetyMode, new te0(20));
        this.f = msy.a(lazyThreadSafetyMode, new c6(12));
        this.g = msy.a(lazyThreadSafetyMode, new z34(15));
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.inv
    public final void a(FragmentActivity fragmentActivity, f5z f5zVar, inv.a aVar) {
        VkTopBar vkTopBar;
        this.c = aVar;
        if (((Boolean) this.g.getValue()).booleanValue() && (vkTopBar = this.a) != null) {
            gzs<Boolean> gzsVar = aVar.k;
            this.h = gzsVar;
            r7k r7kVar = new r7k(new WeakReference(vkTopBar), new per(5), new WeakReference(this), new WeakReference(gzsVar));
            hl60 hl60Var = hl60.a;
            hl60.d(o7p0.a.b, r7kVar);
        }
        k();
        l();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.inv
    public final void b() {
        if (((Boolean) this.g.getValue()).booleanValue()) {
            hl60 hl60Var = hl60.a;
            hl60.d(o7p0.a.b, null);
        }
    }

    @Override // xsna.inv
    public final RectF c() {
        zhf0 leftAvatarRect;
        VkTopBar vkTopBar = this.a;
        if (vkTopBar == null || (leftAvatarRect = vkTopBar.getLeftAvatarRect()) == null) {
            return null;
        }
        return new RectF(leftAvatarRect.a, leftAvatarRect.b, leftAvatarRect.c, leftAvatarRect.d);
    }

    @Override // xsna.inv
    public final Integer d() {
        return null;
    }

    @Override // xsna.inv
    public final void e(Context context, v6j v6jVar) {
        String str = this.c.c;
        String str2 = (String) v6jVar.b;
        if (epx.f(str, str2)) {
            return;
        }
        this.c = inv.a.a(this.c, str2, false, 2043);
        k();
    }

    @Override // xsna.inv
    public final void f(boolean z) {
        inv.a aVar = this.c;
        if (aVar.g != z) {
            this.c = inv.a.a(aVar, null, z, 1983);
            l();
        }
    }

    @Override // xsna.q7k
    public final void g() {
        zhf0 rightMainRect;
        zhf0 rightExtraRect;
        int i = 0;
        VkTopBar vkTopBar = this.a;
        int i2 = (vkTopBar == null || (rightExtraRect = vkTopBar.getRightExtraRect()) == null) ? 0 : (int) rightExtraRect.a;
        if (vkTopBar != null && (rightMainRect = vkTopBar.getRightMainRect()) != null) {
            i = (int) rightMainRect.d;
        }
        wzs<Integer, Integer, s3q0> wzsVar = this.c.j;
        if (wzsVar != null) {
            wzsVar.invoke(Integer.valueOf(i2), Integer.valueOf(i));
        }
    }

    @Override // xsna.inv
    public final void h(String str, boolean z, xis xisVar) {
        VkTopBar vkTopBar = this.a;
        if (vkTopBar != null) {
            vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(oq.d(tlo0.Companion, str), xisVar, z ? new VkTopBar.Middle.Text.Title.a.C0870a(null) : null, null, com.vk.core.compose.component.semantics.b.a(SemanticsConfiguration.Mode.ClearAndSet, new viu(2), 2), 8), null, null, null, 14));
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.inv
    public final void j(int i, boolean z) {
        if (!z || i == this.b) {
            return;
        }
        this.b = i;
        VkTopBar vkTopBar = this.a;
        if (vkTopBar != null) {
            vkTopBar.setContentDescription(String.valueOf(i));
        }
        l();
        if (i > 0) {
            ?? r2 = this.f;
            ((zak0) ((gj2) r2.getValue()).b).setValue(Boolean.valueOf(!((Boolean) ((zak0) ((gj2) r2.getValue()).b).getValue()).booleanValue()));
        }
    }

    public final void k() {
        Context context;
        VkTopBar.b bVar;
        VkTopBar vkTopBar = this.a;
        if (vkTopBar == null || (context = vkTopBar.getContext()) == null) {
            return;
        }
        inv.a aVar = this.c;
        String str = aVar.c;
        VkTopBar.c.a aVar2 = null;
        if (!aVar.b || str == null || !(!drm0.N(str))) {
            inv.a aVar3 = this.c;
            if (aVar3.a) {
                gzs gzsVar = aVar3.d;
                if (gzsVar == null) {
                    gzsVar = new l35(14);
                }
                bVar = new VkTopBar.b(gzsVar, null, null, null, com.vk.core.compose.component.semantics.b.a(SemanticsConfiguration.Mode.ClearAndSet, new wbv(context, 0), 2), 14);
                vkTopBar.setBack(bVar);
                if (this.c.b && str != null && (!drm0.N(str))) {
                    aVar2 = new VkTopBar.c.a(new snx(new snx.b.c(new vlw(str, null), ContentScale.Crop, null, 10)), this.c.e, null, new enh(this, 19), com.vk.core.compose.component.semantics.b.a(SemanticsConfiguration.Mode.ClearAndSet, new xbv(context, 0), 2), 4);
                }
                vkTopBar.setBefore(aVar2);
            }
        }
        bVar = null;
        vkTopBar.setBack(bVar);
        if (this.c.b) {
            aVar2 = new VkTopBar.c.a(new snx(new snx.b.c(new vlw(str, null), ContentScale.Crop, null, 10)), this.c.e, null, new enh(this, 19), com.vk.core.compose.component.semantics.b.a(SemanticsConfiguration.Mode.ClearAndSet, new xbv(context, 0), 2), 4);
        }
        vkTopBar.setBefore(aVar2);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void l() {
        Context context;
        VkTopBar vkTopBar = this.a;
        if (vkTopBar == null || (context = vkTopBar.getContext()) == null) {
            return;
        }
        gj2 gj2Var = (gj2) this.f.getValue();
        gzs<s3q0> gzsVar = this.c.h;
        int i = this.b;
        VkTopBar.l.c cVar = i > 0 ? new VkTopBar.l.c(i, VkCounter.CounterAppearance.Appearance.AccentRed, null, 12) : null;
        SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.ClearAndSet;
        vkTopBar.setAfter(new VkTopBar.a.d(new VkTopBar.a.c.f(gj2Var, null, gzsVar, cVar, null, com.vk.core.compose.component.semantics.b.a(mode, new xzt(context, 1), 2), 18), new VkTopBar.a.b.C0877b(new gko(((gko) this.e.getValue()).a), null, new m2j(this, 17), null, null, com.vk.core.compose.component.semantics.b.a(mode, new ybv(context, 0), 2), 26), this.c.g ? new VkTopBar.a.b.C0877b(new gko(((gko) this.d.getValue()).a), null, this.c.i, null, null, com.vk.core.compose.component.semantics.b.a(mode, new yve(context, 27), 2), 26) : null));
    }

    @Override // xsna.inv
    public final void i(int i) {
    }
}
