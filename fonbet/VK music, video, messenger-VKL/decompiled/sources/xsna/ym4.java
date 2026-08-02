package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.Scroller;
import xsna.gp6;

/* compiled from: AudioEditingScroller.kt */
/* loaded from: classes18.dex */
public final class ym4 {
    public static final float j = dn70.a() * 16.0f;
    public static final float k = dn70.a() * 16.0f;
    public final mwo0 a;
    public final hfm0 b;
    public int d;
    public boolean e;
    public final Scroller h;
    public final fot i;
    public a c = a.IDLE;
    public final RectF f = new RectF();
    public final Rect g = new Rect();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AudioEditingScroller.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a FLING;
        public static final a IDLE;
        public static final a TOUCH_SCROLL;

        static {
            a aVar = new a("IDLE", 0);
            IDLE = aVar;
            a aVar2 = new a("TOUCH_SCROLL", 1);
            TOUCH_SCROLL = aVar2;
            a aVar3 = new a("FLING", 2);
            FLING = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public ym4(mwo0 mwo0Var, l6n0 l6n0Var, hfm0 hfm0Var) {
        this.a = mwo0Var;
        this.b = hfm0Var;
        Context context = mwo0Var.a;
        this.h = new Scroller(context, null);
        this.i = new fot(context, new zm4(this, l6n0Var), null);
    }

    public static final boolean a(ym4 ym4Var, MotionEvent motionEvent) {
        oy4 e;
        if (motionEvent == null || (e = ym4Var.a.d.e()) == null) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RectF rectF = ym4Var.f;
        rectF.set(e.v);
        rectF.inset(-k, -j);
        return rectF.contains(x, y);
    }

    public final boolean b(MotionEvent motionEvent) {
        hfm0 hfm0Var = this.b;
        Rect rect = this.g;
        hfm0Var.invoke(rect);
        return !rect.isEmpty() && rect.contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    public final boolean c(MotionEvent motionEvent) {
        mwo0 mwo0Var = this.a;
        ywo0 ywo0Var = mwo0Var.d;
        boolean onTouchEvent = this.i.a.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() == 0 && b(motionEvent) && !ywo0Var.m) {
            ywo0Var.m = true;
            mwo0Var.a();
        }
        if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            if (ywo0Var.m) {
                ywo0Var.m = false;
                mwo0Var.a();
            }
            if (this.c == a.TOUCH_SCROLL) {
                e(a.IDLE);
            }
        }
        return onTouchEvent;
    }

    public final boolean d(int i) {
        mwo0 mwo0Var = this.a;
        ywo0 ywo0Var = mwo0Var.d;
        oy4 e = ywo0Var.e();
        if (e == null) {
            return false;
        }
        if (ywo0.j(e, ywo0Var.r.c(i))) {
            mwo0Var.a();
            this.e = true;
        }
        mwo0Var.a();
        return true;
    }

    public final void e(a aVar) {
        a aVar2 = this.c;
        if (aVar2 != aVar) {
            a aVar3 = a.IDLE;
            if (aVar2 == aVar3) {
                this.e = false;
            }
            if (aVar == aVar3) {
                if (this.e) {
                    mwo0 mwo0Var = this.a;
                    oy4 e = mwo0Var.d.e();
                    if (e != null) {
                        rwo0 rwo0Var = mwo0Var.j;
                        if (rwo0Var != null) {
                            rwo0Var.i(gp6.a.a(e), e.b, e.c);
                        }
                    }
                }
                this.e = false;
            }
            this.c = aVar;
        }
    }
}
