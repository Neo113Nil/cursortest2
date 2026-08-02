package xsna;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashSet;
import xsna.ct60;
import xsna.vs60;

/* compiled from: NewsfeedBackstageFreshPostsPlugin.kt */
/* loaded from: classes4.dex */
public final class wc60 {
    public final mbs a;
    public final bin0<Boolean> b;
    public final dui c;
    public final at60 d;
    public final ct60.a e;
    public final ts60 f;
    public boolean g;
    public vhs i;
    public a j;
    public boolean m;
    public boolean n;
    public String o;
    public int h = -1;
    public final bpn0 k = new bpn0(new hy2(20));
    public long l = 0;
    public final LinkedHashSet<vs60> p = new LinkedHashSet<>();

    /* compiled from: NewsfeedBackstageFreshPostsPlugin.kt */
    public final class a extends RecyclerView.t {
        public final long b = 100;
        public long c;

        public a() {
        }

        public final void l(RecyclerView recyclerView, int i) {
            View findViewByPosition;
            LinearLayoutManager c = wc60.c(recyclerView);
            int i2 = 0;
            int x = c != null ? c.x() : 0;
            LinearLayoutManager c2 = wc60.c(recyclerView);
            int s = c2 == null ? 0 : c2.s();
            LinearLayoutManager c3 = wc60.c(recyclerView);
            if (c3 != null && (findViewByPosition = c3.findViewByPosition(s)) != null) {
                i2 = findViewByPosition.getTop();
            }
            wc60 wc60Var = wc60.this;
            long a = ((wc60.a(wc60Var, recyclerView, x) & 65535) << 32) | ((i & 65535) << 48) | ((s & 65535) << 16) | (i2 & 65535);
            if (a == wc60Var.l) {
                return;
            }
            wc60Var.l = a;
            wc60Var.d.a(new vs60.c.C3902c(a));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i == 0) {
                l(recyclerView, wc60.a(wc60.this, recyclerView, wc60.b(recyclerView)));
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:49:0x0084, code lost:
        
            if (r1 <= r11) goto L44;
         */
        @Override // androidx.recyclerview.widget.RecyclerView.t
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            wc60 wc60Var = wc60.this;
            bpn0 bpn0Var = wc60Var.k;
            int a = wc60.a(wc60Var, recyclerView, wc60.b(recyclerView));
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.c;
            if (j == 0 || elapsedRealtime - j > this.b) {
                l(recyclerView, a);
                this.c = elapsedRealtime;
            }
            if (recyclerView.getChildCount() <= 0 || wc60Var.h == -1) {
                return;
            }
            boolean z = i2 < 0;
            if (z != wc60Var.g && z) {
                wc60Var.h = Math.max(0, a - 3);
            }
            wc60Var.g = z;
            if (wc60Var.n) {
                int i3 = wc60Var.h;
                vhs vhsVar = wc60Var.i;
                if (vhsVar != null) {
                    vhsVar.a(a <= i3 + 3);
                    return;
                }
                return;
            }
            if (((Boolean) bpn0Var.getValue()).booleanValue()) {
                int i4 = wc60Var.h;
                vhs vhsVar2 = wc60Var.i;
                if (vhsVar2 != null) {
                    vhsVar2.a(a <= i4 + 3);
                }
            } else {
                int i5 = wc60Var.h;
                vhs vhsVar3 = wc60Var.i;
                if (vhsVar3 != null) {
                    if (a == 0 || a > (r11 = i5 + 3)) {
                        r9 = false;
                    }
                    vhsVar3.a(r9);
                }
            }
            if (a != 0 || ((Boolean) bpn0Var.getValue()).booleanValue()) {
                return;
            }
            wc60Var.h = -1;
        }
    }

    public wc60(mbs mbsVar, bin0 bin0Var, dui duiVar, at60 at60Var, ct60.a aVar, ts60 ts60Var) {
        this.a = mbsVar;
        this.b = bin0Var;
        this.c = duiVar;
        this.d = at60Var;
        this.e = aVar;
        this.f = ts60Var;
        mbsVar.a(new vc60(this));
    }

    public static final int a(wc60 wc60Var, RecyclerView recyclerView, int i) {
        ol60 y0;
        u1c0 u1c0Var;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        ho60 ho60Var = adapter instanceof ho60 ? (ho60) adapter : null;
        if (ho60Var == null || (y0 = ho60Var.y0(i)) == null) {
            return 0;
        }
        z1c0 z1c0Var = y0 instanceof z1c0 ? (z1c0) y0 : null;
        if (z1c0Var == null || (u1c0Var = z1c0Var.h) == null) {
            return 0;
        }
        return u1c0Var.k;
    }

    public static int b(RecyclerView recyclerView) {
        int v;
        LinearLayoutManager c = c(recyclerView);
        if (c == null || (v = c.v()) < 0) {
            return 0;
        }
        return v;
    }

    public static LinearLayoutManager c(RecyclerView recyclerView) {
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return (LinearLayoutManager) layoutManager;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void d() {
        ViewPropertyAnimator animate;
        this.h = -1;
        vhs vhsVar = this.i;
        if (vhsVar != null) {
            ?? r1 = vhsVar.d;
            if (vhsVar.c) {
                vhsVar.c = false;
                View view = (View) r1.getValue();
                if (view != null && (animate = view.animate()) != null) {
                    animate.cancel();
                }
                View view2 = (View) r1.getValue();
                if (view2 != null) {
                    view2.setVisibility(8);
                }
            }
        }
    }
}
