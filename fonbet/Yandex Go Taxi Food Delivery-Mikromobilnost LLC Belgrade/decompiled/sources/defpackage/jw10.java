package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.ItemTouchHelper$Callback;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.view.timeline.c;
import com.yandex.messaging.internal.view.timeline.h;

/* loaded from: classes15.dex */
public final class jw10 extends ItemTouchHelper$Callback {
    public static final float m = kjs0.d(56);
    public static final float n = kjs0.d(72);
    public final h d;
    public final Drawable e;
    public final Drawable f;
    public ServerMessageRef g;
    public ServerMessageRef h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;

    public jw10(Context context, h hVar) {
        Drawable drawable;
        Drawable mutate;
        this.d = hVar;
        int i = fxa1.c(jng0.messagingCommonIconsPrimaryColor, context).data;
        Drawable t = vng.t(wwg0.msg_ic_reply, context);
        Drawable drawable2 = null;
        if (t == null || (drawable = t.mutate()) == null) {
            drawable = null;
        } else {
            drawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_ATOP));
        }
        this.e = drawable;
        Drawable t2 = vng.t(wwg0.msg_ic_show_thread_swipe, context);
        if (t2 != null && (mutate = t2.mutate()) != null) {
            mutate.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_ATOP));
            drawable2 = mutate;
        }
        this.f = drawable2;
        this.l = true;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public final int c(int i, int i2) {
        if (!this.i) {
            return super.c(i, i2);
        }
        this.i = false;
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0087, code lost:
    
        if (r1 != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008a, code lost:
    
        r3 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0097, code lost:
    
        if (r1 != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a0, code lost:
    
        if (r6.g != null) goto L53;
     */
    @Override // androidx.recyclerview.widget.ItemTouchHelper$Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(x0 x0Var) {
        boolean z = x0Var instanceof c;
        ServerMessageRef serverMessageRef = null;
        c cVar = z ? (c) x0Var : null;
        this.g = cVar != null ? cVar.D0() : null;
        c cVar2 = z ? (c) x0Var : null;
        if (cVar2 != null) {
            jn3 jn3Var = cVar2.C0;
            if (cVar2.e0().b.i && cVar2.e0().b.e && jn3Var.c() && cVar2.t0.b && jn3Var.c() && cVar2.t0.b) {
                serverMessageRef = cVar2.T1;
            }
        }
        this.h = serverMessageRef;
        h hVar = this.d;
        boolean a = serverMessageRef != null ? hVar.a(serverMessageRef) : false;
        j3b j3bVar = hVar.a.U;
        boolean m2 = j3bVar == null ? false : okb1.b(j3bVar).m();
        boolean z2 = this.l;
        int i = 12;
        if (!z2 || this.g == null || this.h == null || !m2) {
            if (!z2 || this.g == null || this.h == null) {
                if (z2 && this.h != null) {
                    i = 8;
                    if (!m2) {
                    }
                } else if (z2) {
                }
                i = 0;
            }
        }
        return ItemTouchHelper$Callback.k(0, i);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public final void l(Canvas canvas, RecyclerView recyclerView, x0 x0Var, float f, float f2, int i, boolean z) {
        Drawable drawable;
        View view = x0Var.a;
        float translationX = view.getTranslationX();
        float f3 = 0.0f;
        float f4 = n;
        y9b1.d(recyclerView, view, translationX > 0.0f ? Math.min(f4, f) : view.getTranslationX() < 0.0f ? Math.max(-f4, f) : f, f2, z);
        float translationX2 = view.getTranslationX();
        float f5 = m;
        if (translationX2 > 0.0f) {
            if (view.getTranslationX() < f5) {
                this.i = false;
                this.j = false;
                this.k = false;
            }
            if (!this.k && view.getTranslationX() > f5) {
                view.performHapticFeedback(3, 2);
                this.k = true;
            }
        } else {
            float f6 = -f5;
            if (view.getTranslationX() > f6) {
                this.i = false;
                this.j = false;
                this.k = false;
            }
            if (!this.j && view.getTranslationX() < f6) {
                view.performHapticFeedback(3, 2);
                this.j = true;
            }
        }
        char c = f < 0.0f ? (char) 4 : '\b';
        if (c == 4) {
            drawable = this.e;
            if (drawable == null) {
                return;
            }
        } else if (c != '\b' || (drawable = this.f) == null) {
            return;
        }
        float f7 = c != 4 ? c != '\b' ? 0.0f : f4 - f5 : (-f4) + f5;
        if (c == 4) {
            f4 = -f4;
        }
        float f8 = f4 - f7;
        float min = Math.min(Math.max(view.getTranslationX() - f7, 0.0f), f8) / f8;
        if (c == 4) {
            f3 = n.a(f5, drawable.getIntrinsicWidth(), 2.0f, Math.max(-f5, view.getTranslationX()) + canvas.getWidth());
        } else if (c == '\b') {
            f3 = Math.min(f5, view.getTranslationX()) - ((f5 + drawable.getIntrinsicWidth()) / 2.0f);
        }
        float bottom = ((view.getBottom() + view.getTop()) - drawable.getIntrinsicHeight()) / 2.0f;
        int save = canvas.save();
        canvas.translate(f3, bottom);
        drawable.setAlpha((int) (min * 255.0f));
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public final boolean m(RecyclerView recyclerView, x0 x0Var, x0 x0Var2) {
        return false;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public final void p(x0 x0Var, int i) {
    }
}
