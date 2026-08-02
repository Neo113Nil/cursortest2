package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import me.grishka.appkit.views.UsableRecyclerView;

/* compiled from: DisplayItemsRippleEffectTouchListener.kt */
/* loaded from: classes4.dex */
public final class sen implements View.OnTouchListener {
    public final RecyclerView b;
    public final ren c;
    public final elg0 d;
    public float e;
    public float f;
    public float g;
    public float h;
    public RecyclerView.e0 i;
    public View j;
    public a k;
    public final int l;
    public final long m;

    /* compiled from: DisplayItemsRippleEffectTouchListener.kt */
    public final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            sen senVar = sen.this;
            if (senVar.i == null) {
                return;
            }
            senVar.k = null;
            ren renVar = senVar.c;
            View view = renVar.h;
            if (view != null) {
                view.setPressed(true);
            }
            Drawable drawable = renVar.e;
            if (drawable != null) {
                drawable.setState(ren.j);
            }
        }
    }

    public sen(RecyclerView recyclerView, ren renVar, elg0 elg0Var) {
        this.b = recyclerView;
        this.c = renVar;
        this.d = elg0Var;
        Context context = e43.a;
        this.l = ViewConfiguration.get(context == null ? null : context).getScaledTouchSlop();
        this.m = ViewConfiguration.getTapTimeout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        RecyclerView.e0 childViewHolder;
        int action = motionEvent.getAction();
        ren renVar = this.c;
        RecyclerView recyclerView = this.b;
        if (action == 0 && recyclerView.getScrollState() == 0) {
            this.e = motionEvent.getX();
            this.f = motionEvent.getY();
            this.g = motionEvent.getRawX();
            this.h = motionEvent.getRawY();
            this.j = null;
            elg0 elg0Var = this.d;
            elg0Var.b = null;
            renVar.h = null;
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            renVar.f = x;
            renVar.g = y;
            View a2 = hkf0.a(recyclerView, motionEvent.getX(), motionEvent.getY());
            if (a2 != null && (childViewHolder = recyclerView.getChildViewHolder(a2)) != 0 && (childViewHolder instanceof UsableRecyclerView.e)) {
                if (!(childViewHolder instanceof UsableRecyclerView.j) || ((UsableRecyclerView.j) childViewHolder).isEnabled()) {
                    this.i = childViewHolder;
                    if (!(childViewHolder instanceof UsableRecyclerView.s)) {
                        this.j = a2;
                        elg0Var.b = a2;
                        renVar.h = a2;
                    }
                    a aVar = this.k;
                    if (aVar != null) {
                        recyclerView.removeCallbacks(aVar);
                    }
                    a aVar2 = new a();
                    this.k = aVar2;
                    recyclerView.postDelayed(aVar2, this.m);
                    return true;
                }
                return true;
            }
            return false;
        }
        int action2 = motionEvent.getAction();
        int[] iArr = ren.i;
        if (action2 == 3) {
            this.i = null;
            if (this.j != null) {
                Drawable drawable = renVar.e;
                if (drawable != null) {
                    drawable.setState(iArr);
                }
                View view2 = renVar.h;
                if (view2 != null) {
                    view2.setPressed(false);
                }
                a aVar3 = this.k;
                if (aVar3 != null) {
                    recyclerView.removeCallbacks(aVar3);
                }
                this.k = null;
                return true;
            }
        } else {
            int action3 = motionEvent.getAction();
            int i = this.l;
            if (action3 != 2 || this.i == null) {
                if (motionEvent.getAction() == 1) {
                    motionEvent.getX();
                    motionEvent.getY();
                    float x2 = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    renVar.f = x2;
                    renVar.g = y2;
                    Object obj = this.i;
                    if (obj != null) {
                        float f = i;
                        if (Math.abs(motionEvent.getX() - this.e) < f || Math.abs(motionEvent.getY() - this.f) < f) {
                            if (obj instanceof UsableRecyclerView.e) {
                                ((UsableRecyclerView.e) obj).onClick();
                            }
                            a aVar4 = this.k;
                            if (aVar4 != null) {
                                recyclerView.removeCallbacks(aVar4);
                                a aVar5 = this.k;
                                if (aVar5 != null) {
                                    aVar5.run();
                                }
                                this.k = null;
                            }
                            this.i = null;
                            recyclerView.postDelayed(new sd(this, 4), 50L);
                            return true;
                        }
                    }
                }
                return false;
            }
            motionEvent.getX();
            motionEvent.getY();
            float f2 = i;
            if (Math.abs(motionEvent.getX() - this.e) <= f2 && Math.abs(motionEvent.getY() - this.f) <= f2 && Math.abs(motionEvent.getRawX() - this.g) <= f2 && Math.abs(motionEvent.getRawY() - this.h) <= f2) {
                float x3 = motionEvent.getX();
                float y3 = motionEvent.getY();
                renVar.f = x3;
                renVar.g = y3;
                return false;
            }
            this.i = null;
            if (this.j != null) {
                Drawable drawable2 = renVar.e;
                if (drawable2 != null) {
                    drawable2.setState(iArr);
                }
                View view3 = renVar.h;
                if (view3 != null) {
                    view3.setPressed(false);
                }
                a aVar6 = this.k;
                if (aVar6 != null) {
                    recyclerView.removeCallbacks(aVar6);
                }
                this.k = null;
            }
        }
        return true;
    }
}
