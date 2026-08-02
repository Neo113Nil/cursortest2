package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.badges.Badgeable;
import com.vk.dto.badges.BadgesSet;
import com.vk.dto.reactions.BadgeMeta;
import com.vk.dto.reactions.ReactionAsset;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.dto.reactions.ReactionSet;
import com.vk.dto.reactions.SimpleReactionMeta;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import xsna.f2f0;

/* compiled from: ReactionsView.kt */
/* loaded from: classes5.dex */
public final class x6f0 {
    public final y6f0 a;
    public final x2f0 b;
    public final b2f0 c;
    public final xx1 d;
    public final v2f0 e;
    public final w6f0 f;
    public final dz5 g;
    public c6f0 h;
    public WeakReference<View> i;
    public WeakReference<p2f0> j;
    public final Rect k;
    public WeakReference<gzs<s3q0>> l;
    public a m;
    public final Handler n;
    public int o;

    /* compiled from: ReactionsView.kt */
    public final class a implements Runnable {
        public final ReactionSet b;
        public final Object c;

        public a(ReactionSet reactionSet, Object obj) {
            this.b = reactionSet;
            this.c = obj;
        }

        @Override // java.lang.Runnable
        public final void run() {
            f2f0 aVar;
            String str;
            BadgesSet u0;
            x6f0 x6f0Var = x6f0.this;
            y6f0 y6f0Var = x6f0Var.a;
            View b = x6f0Var.b();
            if (b == null) {
                return;
            }
            b.performHapticFeedback(0);
            ReactionSet reactionSet = this.b;
            ReactionSet reactionSet2 = new ReactionSet(reactionSet.b, p4g.q(i7o0.a(reactionSet.c)));
            boolean z = y6f0Var.u;
            ArrayList<ReactionMeta> arrayList = reactionSet2.c;
            if (z) {
                Object obj = this.c;
                boolean z2 = obj instanceof o2f0;
                if (z2) {
                    boolean z3 = obj instanceof Badgeable;
                    Badgeable badgeable = z3 ? (Badgeable) obj : null;
                    if ((badgeable != null ? badgeable.ca() : null) != null) {
                        if (!arrayList.isEmpty()) {
                            Iterator<T> it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (((ReactionMeta) it.next()) instanceof BadgeMeta) {
                                }
                            }
                        }
                        Badgeable badgeable2 = z3 ? (Badgeable) obj : null;
                        arrayList.add(new BadgeMeta(Integer.MAX_VALUE, null, Integer.valueOf(R.string.donut_send), null, 0, (badgeable2 == null || (u0 = badgeable2.u0()) == null || !u0.h) ? false : true, 26, null));
                    }
                }
                Badgeable badgeable3 = obj instanceof Badgeable ? (Badgeable) obj : null;
                if ((badgeable3 != null ? badgeable3.ca() : null) == null && z2) {
                    arrayList.removeIf(new p9c0(new fo20(14), 1));
                }
            }
            c6f0 c6f0Var = x6f0Var.h;
            if (c6f0Var != null) {
                c6f0Var.a();
            }
            Context context = b.getContext();
            int i = x6f0Var.f.a.b;
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            for (ReactionMeta reactionMeta : arrayList) {
                if (reactionMeta instanceof SimpleReactionMeta) {
                    SimpleReactionMeta simpleReactionMeta = (SimpleReactionMeta) reactionMeta;
                    int i2 = simpleReactionMeta.f;
                    String str2 = simpleReactionMeta.g;
                    ReactionAsset reactionAsset = simpleReactionMeta.h;
                    String str3 = reactionAsset != null ? reactionAsset.b : null;
                    String e = simpleReactionMeta.e(i);
                    Context context2 = e43.a;
                    if (context2 == null) {
                        context2 = null;
                    }
                    aVar = new f2f0.b(i2, str2, str3, e, context2.getResources().getString(R.string.accessibility_reaction_add, simpleReactionMeta.g));
                } else {
                    if (!(reactionMeta instanceof BadgeMeta)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    BadgeMeta badgeMeta = (BadgeMeta) reactionMeta;
                    int i3 = badgeMeta.f;
                    Integer num = badgeMeta.h;
                    String str4 = badgeMeta.g;
                    if (num != null) {
                        Context context3 = e43.a;
                        str = (context3 != null ? context3 : null).getString(num.intValue());
                    } else {
                        str = str4;
                    }
                    ReactionAsset reactionAsset2 = badgeMeta.i;
                    String str5 = reactionAsset2 != null ? reactionAsset2.b : null;
                    String e2 = badgeMeta.e(i);
                    Context context4 = e43.a;
                    if (context4 == null) {
                        context4 = null;
                    }
                    aVar = new f2f0.a(i3, str, str5, e2, context4.getResources().getString(R.string.accessibility_reaction_add, str4));
                }
                arrayList2.add(aVar);
            }
            c6f0 c6f0Var2 = new c6f0(context, arrayList2, y6f0Var, new x7d(7, reactionSet2, x6f0Var), x6f0Var, x6f0Var.b);
            boolean isShowing = c6f0Var2.isShowing();
            m3r m3rVar = c6f0Var2.c;
            if (!isShowing) {
                c6f0Var2.showAtLocation(b, 0, 0, 0);
                m3rVar.setVisibility(0);
                a6f0 a6f0Var = m3rVar.O;
                a6f0Var.b();
                y5f0 y5f0Var = a6f0Var.b;
                m3r m3rVar2 = y5f0Var.a;
                m3rVar2.setPopupScale$design_release(0.42857143f);
                m3rVar2.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                m3rVar2.setPopupHeight$design_release(0);
                m3rVar2.setPopupWidth$design_release(0);
                for (f3r f3rVar : y5f0Var.b.getReactionViews()) {
                    bwt0.p0(f3rVar, true);
                    f3rVar.setScale(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                bwt0.V(m3rVar2, new irc0(y5f0Var, 5));
                m3rVar2.requestLayout();
                m3rVar2.invalidate();
                z5f0 z5f0Var = m3rVar.P;
                z5f0Var.getClass();
                z5f0Var.i = Long.valueOf(System.currentTimeMillis() - z5f0Var.d);
                z5f0Var.f.i = true;
                z5f0Var.n = false;
            }
            m3rVar.setActivePointerId(x6f0Var.o);
            WeakReference<p2f0> weakReference = x6f0Var.j;
            p2f0 p2f0Var = weakReference != null ? weakReference.get() : null;
            if (p2f0Var != null) {
                p2f0Var.S4(true);
            }
            u5f0 u5f0Var = x6f0Var.c.c;
            if (u5f0Var != null) {
                u5f0Var.d = "reactions_popup";
            }
            x6f0Var.h = c6f0Var2;
        }
    }

    public x6f0(y6f0 y6f0Var, x2f0 x2f0Var) {
        this.a = y6f0Var;
        this.b = x2f0Var;
        b2f0 b2f0Var = new b2f0(this, x2f0Var);
        this.c = b2f0Var;
        this.d = new xx1(14);
        this.e = new v2f0(b2f0Var, this);
        this.f = new w6f0(y6f0Var);
        this.g = new dz5();
        this.k = new Rect();
        this.n = new Handler(Looper.getMainLooper());
        this.o = -1;
    }

    public final void a() {
        WeakReference<p2f0> weakReference = this.j;
        p2f0 p2f0Var = weakReference != null ? weakReference.get() : null;
        if (p2f0Var != null) {
            p2f0Var.S4(false);
        }
        a aVar = this.m;
        if (aVar != null) {
            this.n.removeCallbacks(aVar);
        }
        this.m = null;
        v2f0 v2f0Var = this.e;
        ugh0 ugh0Var = v2f0Var.d;
        ugh0Var.b = null;
        ugh0Var.c = null;
        View b = v2f0Var.b.b();
        if (b != null) {
            b.setPressed(false);
        }
        v2f0Var.e = null;
        View b2 = b();
        ViewParent parent = b2 != null ? b2.getParent() : null;
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.requestDisallowInterceptTouchEvent(false);
        }
        c6f0 c6f0Var = this.h;
        if (c6f0Var != null) {
            c6f0Var.a();
        }
        this.h = null;
        this.i = null;
        this.j = null;
        this.k.setEmpty();
        this.c.c = null;
    }

    public final View b() {
        WeakReference<View> weakReference;
        u5f0 u5f0Var = this.c.c;
        if (u5f0Var != null) {
            Object obj = u5f0Var.a;
            WeakReference<p2f0> weakReference2 = this.j;
            p2f0 p2f0Var = weakReference2 != null ? weakReference2.get() : null;
            if ((p2f0Var != null ? p2f0Var.r4(obj) : false) && (weakReference = this.i) != null) {
                return weakReference.get();
            }
        }
        return null;
    }
}
