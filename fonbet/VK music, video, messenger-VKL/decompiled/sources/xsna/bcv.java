package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.vk.feed.design.view.newsfeed.topbar.FeedTopBar;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import kotlin.LazyThreadSafetyMode;
import xsna.inv;
import xsna.o7p0;

/* compiled from: HomeFragmentLegoTopBar.kt */
/* loaded from: classes2.dex */
public final class bcv implements inv, q7k {
    public inv.a a = new inv.a(0);
    public int b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final FeedTopBar k;
    public final Object l;
    public gzs<Boolean> m;

    public bcv(View view) {
        d14 d14Var = new d14(12);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = msy.a(lazyThreadSafetyMode, d14Var);
        this.d = msy.a(lazyThreadSafetyMode, new d2(16));
        this.e = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.ui.v(17));
        this.f = msy.a(lazyThreadSafetyMode, new cfl(view, 16));
        this.g = msy.a(lazyThreadSafetyMode, new acv(view, 0));
        this.h = msy.a(lazyThreadSafetyMode, new bih(view, 20));
        this.i = msy.a(lazyThreadSafetyMode, new hgg(view, 1));
        this.j = msy.a(lazyThreadSafetyMode, new igg(view, 1));
        this.k = (FeedTopBar) view.findViewById(R.id.feed_home_top_bar);
        this.l = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.interactor.g(19));
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.inv
    public final void a(FragmentActivity fragmentActivity, f5z f5zVar, inv.a aVar) {
        FeedTopBar feedTopBar;
        this.a = aVar;
        if (((Boolean) this.l.getValue()).booleanValue() && (feedTopBar = this.k) != null) {
            gzs<Boolean> gzsVar = aVar.k;
            this.m = gzsVar;
            r7k r7kVar = new r7k(new WeakReference(feedTopBar), new f57(29), new WeakReference(this), new WeakReference(gzsVar));
            hl60 hl60Var = hl60.a;
            hl60.d(o7p0.a.b, r7kVar);
        }
        l();
        k();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.inv
    public final void b() {
        if (((Boolean) this.l.getValue()).booleanValue()) {
            hl60 hl60Var = hl60.a;
            hl60.d(o7p0.a.b, null);
        }
    }

    @Override // xsna.inv
    public final RectF c() {
        FeedTopBar feedTopBar = this.k;
        if (feedTopBar != null) {
            return feedTopBar.getBeforeAvatarRect();
        }
        return null;
    }

    @Override // xsna.inv
    public final Integer d() {
        FeedTopBar feedTopBar = this.k;
        if (feedTopBar != null) {
            return Integer.valueOf(feedTopBar.getBottom());
        }
        return null;
    }

    @Override // xsna.inv
    public final void e(Context context, v6j v6jVar) {
        String str = this.a.c;
        String str2 = (String) v6jVar.b;
        if (epx.f(str, str2)) {
            return;
        }
        this.a = inv.a.a(this.a, str2, false, 2043);
        l();
    }

    @Override // xsna.q7k
    public final void g() {
        Rect afterMainRect;
        Rect afterExtraRect;
        int i = 0;
        FeedTopBar feedTopBar = this.k;
        int i2 = (feedTopBar == null || (afterExtraRect = feedTopBar.getAfterExtraRect()) == null) ? 0 : afterExtraRect.left;
        if (feedTopBar != null && (afterMainRect = feedTopBar.getAfterMainRect()) != null) {
            i = afterMainRect.bottom;
        }
        wzs<Integer, Integer, s3q0> wzsVar = this.a.j;
        if (wzsVar != null) {
            wzsVar.invoke(Integer.valueOf(i2), Integer.valueOf(i));
        }
    }

    @Override // xsna.inv
    public final void h(String str, boolean z, xis xisVar) {
        FeedTopBar feedTopBar = this.k;
        if (feedTopBar != null) {
            feedTopBar.setMiddle(new FeedTopBar.b.a(str, xisVar, z));
        }
    }

    @Override // xsna.inv
    public final void j(int i, boolean z) {
        if (!z || i == this.b) {
            return;
        }
        this.b = i;
        FeedTopBar feedTopBar = this.k;
        if (feedTopBar != null) {
            feedTopBar.setContentDescription(String.valueOf(i));
        }
        k();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void k() {
        FeedTopBar feedTopBar = this.k;
        if (feedTopBar != null) {
            gko gkoVar = new gko(((gko) this.e.getValue()).a);
            gzs<s3q0> gzsVar = this.a.h;
            String str = (String) this.f.getValue();
            int i = this.b;
            feedTopBar.setAfter(new u4r(new v4r(gkoVar, gzsVar, str, i > 0 ? Integer.valueOf(i) : null), new v4r(new gko(((gko) this.d.getValue()).a), new gbh(this, 25), (String) this.g.getValue(), null), this.a.g ? new v4r(new gko(((gko) this.c.getValue()).a), this.a.i, (String) this.h.getValue(), null) : null));
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void l() {
        FeedTopBar.a aVar;
        String str;
        FeedTopBar feedTopBar = this.k;
        if (feedTopBar != null) {
            inv.a aVar2 = this.a;
            if (aVar2.b && (str = aVar2.c) != null && (!drm0.N(str))) {
                inv.a aVar3 = this.a;
                aVar = new FeedTopBar.a.C1056a(aVar3.c, (String) this.j.getValue(), aVar3.e, new odm(this, 15));
            } else {
                inv.a aVar4 = this.a;
                if (aVar4.a) {
                    gzs gzsVar = aVar4.d;
                    if (gzsVar == null) {
                        gzsVar = new xs6(11);
                    }
                    aVar = new FeedTopBar.a.b(gzsVar, (String) this.i.getValue());
                } else {
                    aVar = null;
                }
            }
            feedTopBar.setBefore(aVar);
        }
    }

    @Override // xsna.inv
    public final void f(boolean z) {
    }

    @Override // xsna.inv
    public final void i(int i) {
    }
}
