package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.vk.dto.badges.Badgeable;
import com.vk.dto.common.id.UserId;
import com.vk.dto.reactions.ItemReactions;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.dto.reactions.ReactionSet;
import com.vk.feed.core.models.news.NewsEntry;
import java.lang.ref.WeakReference;
import xsna.x6f0;
import xsna.x6f0.a;

/* compiled from: ReactionsFacade.kt */
/* loaded from: classes5.dex */
public class g3f0 implements h3f0 {
    public final x6f0 a;
    public final dz5 b;

    public g3f0() {
        this((z2f0) null, 3);
    }

    @Override // xsna.h3f0
    public final boolean a(View view, Rect rect, p2f0 p2f0Var, c6z c6zVar, NewsEntry newsEntry, String str) {
        ReactionSet s4;
        if (!(c6zVar instanceof o2f0)) {
            return false;
        }
        o2f0 o2f0Var = (o2f0) c6zVar;
        if (!o2f0Var.T8() || (s4 = o2f0Var.s4()) == null) {
            return false;
        }
        this.b.getClass();
        u5f0 u5f0Var = new u5f0(c6zVar, newsEntry, str, "reactions_popup");
        x6f0 x6f0Var = this.a;
        b2f0 b2f0Var = x6f0Var.c;
        Handler handler = x6f0Var.n;
        b2f0Var.c = u5f0Var;
        hj60 hj60Var = new hj60(view, 20);
        x6f0Var.i = new WeakReference<>(view);
        x6f0Var.j = new WeakReference<>(p2f0Var);
        x6f0Var.k.set(rect);
        x6f0Var.l = new WeakReference<>(hj60Var);
        x6f0.a aVar = x6f0Var.m;
        if (aVar != null) {
            handler.removeCallbacks(aVar);
        }
        x6f0Var.m = null;
        ugh0 ugh0Var = x6f0Var.e.d;
        ugh0Var.b = null;
        ugh0Var.c = null;
        x6f0Var.b.getClass();
        x6f0.a aVar2 = x6f0Var.new a(s4, c6zVar);
        handler.postDelayed(aVar2, 0L);
        x6f0Var.m = aVar2;
        return true;
    }

    @Override // xsna.h3f0
    public final boolean b(View view, Rect rect, p2f0 p2f0Var, gzs<s3q0> gzsVar, MotionEvent motionEvent, Object obj, Object obj2, String str, boolean z) {
        ReactionSet s4;
        WeakReference<gzs<s3q0>> weakReference;
        gzs<s3q0> gzsVar2;
        x6f0 x6f0Var = this.a;
        c6f0 c6f0Var = x6f0Var.h;
        if (c6f0Var != null) {
            return c6f0Var.c.onTouchEvent(motionEvent);
        }
        v2f0 v2f0Var = x6f0Var.e;
        ugh0 ugh0Var = v2f0Var.d;
        x6f0 x6f0Var2 = v2f0Var.b;
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action == 1) {
                Long l = v2f0Var.e;
                if (l != null) {
                    if (System.currentTimeMillis() - l.longValue() < v2f0Var.c && (weakReference = x6f0Var2.l) != null && (gzsVar2 = weakReference.get()) != null) {
                        gzsVar2.invoke();
                    }
                }
                x6f0Var2.a();
                return true;
            }
            if (action == 2) {
                boolean a = ugh0Var.a(motionEvent);
                if (a) {
                    x6f0Var2.a();
                }
                return !a;
            }
            if (action != 3) {
                x6f0Var2.a();
                return false;
            }
            x6f0Var2.a();
            return true;
        }
        int pointerId = motionEvent.getPointerId(0);
        c6f0 c6f0Var2 = x6f0Var2.h;
        if (c6f0Var2 != null) {
            c6f0Var2.c.setActivePointerId(pointerId);
        }
        x6f0Var2.o = pointerId;
        x6f0Var2.i = new WeakReference<>(view);
        x6f0Var2.j = new WeakReference<>(p2f0Var);
        x6f0Var2.k.set(rect);
        x6f0Var2.l = new WeakReference<>(gzsVar);
        ugh0Var.getClass();
        ugh0Var.b = Float.valueOf(motionEvent.getRawX());
        ugh0Var.c = Float.valueOf(motionEvent.getRawY());
        v2f0Var.a.c = new u5f0(obj, obj2, str, "button");
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.requestDisallowInterceptTouchEvent(true);
        }
        v2f0Var.e = Long.valueOf(System.currentTimeMillis());
        if (z && (obj2 instanceof o2f0)) {
            o2f0 o2f0Var = (o2f0) obj2;
            if (o2f0Var.T8() && (s4 = o2f0Var.s4()) != null) {
                x6f0Var2.b.getClass();
                x6f0.a aVar = x6f0Var2.new a(s4, obj);
                x6f0Var2.n.postDelayed(aVar, 150L);
                x6f0Var2.m = aVar;
            }
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        View b = x6f0Var2.b();
        if (b == null) {
            return true;
        }
        b.setPressed(true);
        b.drawableHotspotChanged(x, y);
        return true;
    }

    @Override // xsna.h3f0
    public final void c(Context context, Badgeable badgeable, UserId userId, int i) {
        this.a.b.g(context, badgeable);
    }

    @Override // xsna.h3f0
    public final void d(Context context, Badgeable badgeable) {
        x6f0 x6f0Var = this.a;
        if (badgeable == null) {
            u5f0 u5f0Var = x6f0Var.c.c;
            Object obj = u5f0Var != null ? u5f0Var.a : null;
            badgeable = obj instanceof Badgeable ? (Badgeable) obj : null;
            if (badgeable == null) {
                return;
            }
        }
        x6f0Var.b.d(context, badgeable);
    }

    @Override // xsna.h3f0
    public final void e(v5f0 v5f0Var) {
        x6f0 x6f0Var = this.a;
        xx1 xx1Var = x6f0Var.d;
        c6z c6zVar = v5f0Var.c;
        ReactionMeta reactionMeta = null;
        if (c6zVar instanceof o2f0) {
            o2f0 o2f0Var = (o2f0) c6zVar;
            ItemReactions K = o2f0Var.K();
            if ((K != null ? K.e : null) == null) {
                reactionMeta = o2f0Var.R3();
            }
        }
        ReactionMeta reactionMeta2 = reactionMeta;
        dz5 dz5Var = x6f0Var.g;
        Object obj = v5f0Var.d;
        String str = v5f0Var.e;
        String str2 = v5f0Var.f;
        dz5Var.getClass();
        x6f0Var.c.a(v5f0Var.a.getContext(), v5f0Var.b, reactionMeta2, new u5f0(c6zVar, obj, str, str2), true);
    }

    public g3f0(y6f0 y6f0Var, x2f0 x2f0Var) {
        this.a = new x6f0(y6f0Var, x2f0Var);
        this.b = new dz5();
    }

    public g3f0(z2f0 z2f0Var, int i) {
        this(new y6f0(false, 16777215), (i & 2) != 0 ? new a020() : z2f0Var);
    }
}
