package xsna;

import android.widget.Scroller;
import xsna.swo0;

/* compiled from: TimelineScroller.kt */
/* loaded from: classes18.dex */
public final class vwo0 {
    public final mwo0 a;
    public final Scroller b;
    public a c = a.IDLE;
    public int d;
    public int e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TimelineScroller.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a FLING_X;
        public static final a FLING_Y;
        public static final a IDLE;
        public static final a TOUCH_SCROLL_X;
        public static final a TOUCH_SCROLL_Y;

        static {
            a aVar = new a("IDLE", 0);
            IDLE = aVar;
            a aVar2 = new a("TOUCH_SCROLL_X", 1);
            TOUCH_SCROLL_X = aVar2;
            a aVar3 = new a("TOUCH_SCROLL_Y", 2);
            TOUCH_SCROLL_Y = aVar3;
            a aVar4 = new a("FLING_X", 3);
            FLING_X = aVar4;
            a aVar5 = new a("FLING_Y", 4);
            FLING_Y = aVar5;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
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

    public vwo0(mwo0 mwo0Var) {
        this.a = mwo0Var;
        this.b = new Scroller(mwo0Var.a, null);
    }

    public final void a(int i, int i2) {
        mwo0 mwo0Var = this.a;
        if (mwo0Var.d.l instanceof swo0.b) {
            mwo0Var.c(i, 0);
        } else {
            mwo0Var.c(i, i2);
        }
    }

    public final void b(a aVar) {
        mwo0 mwo0Var = this.a;
        ywo0 ywo0Var = mwo0Var.d;
        a aVar2 = this.c;
        if (aVar2 != aVar) {
            a aVar3 = a.IDLE;
            if (aVar2 == aVar3) {
                mwo0Var.e(null);
                rwo0 rwo0Var = mwo0Var.j;
                if (rwo0Var != null) {
                    rwo0Var.M();
                }
            }
            if (aVar == aVar3) {
                int i = ywo0Var.a;
                int i2 = ywo0Var.c;
                ywo0Var.k(i > i2 ? i2 - i : i < 0 ? -i : 0, 0);
                rwo0 rwo0Var2 = mwo0Var.j;
                if (rwo0Var2 != null) {
                    rwo0Var2.t(ywo0Var.s);
                }
                gzs<s3q0> gzsVar = mwo0Var.h;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                if (ywo0Var.a < 0) {
                    ywo0Var.a = 0;
                }
                ywo0Var.l(false);
                rwo0 rwo0Var3 = mwo0Var.j;
                if (rwo0Var3 != null) {
                    rwo0Var3.n();
                }
                mwo0Var.a();
            }
            this.c = aVar;
        }
    }
}
