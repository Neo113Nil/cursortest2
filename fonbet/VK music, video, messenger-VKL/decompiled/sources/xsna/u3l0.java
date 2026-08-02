package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.util.Size;
import com.vk.stories.design.view.stickers.StickersDrawingViewGroup;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: StickerDialogProviderImpl.kt */
/* loaded from: classes16.dex */
public final class u3l0 implements xpa0 {
    public final l7s a;
    public final StickersDrawingViewGroup b;
    public final u40 c;
    public final v40 d;
    public final w40 e;

    public u3l0(l7s l7sVar, StickersDrawingViewGroup stickersDrawingViewGroup, u40 u40Var, v40 v40Var, w40 w40Var) {
        this.a = l7sVar;
        this.b = stickersDrawingViewGroup;
        this.c = u40Var;
        this.d = v40Var;
        this.e = w40Var;
    }

    @Override // xsna.xpa0
    public final void C0(String str) {
        ((u76) this.c.invoke()).C0(str);
    }

    @Override // xsna.xpa0
    public final s5l0 J() {
        return new w5l0((u76) this.c.invoke(), this.b, this.a);
    }

    @Override // xsna.xpa0
    public final int K() {
        return ((Number) this.d.invoke()).intValue();
    }

    @Override // xsna.xpa0
    public final Size L() {
        return null;
    }

    @Override // xsna.xpa0
    public final Bitmap M() {
        Bitmap d = kd7.d(((Number) this.d.invoke()).intValue(), ((Number) this.e.invoke()).intValue());
        if (d == null) {
            return null;
        }
        d.eraseColor(0);
        this.b.getStickersState().d(new Canvas(d), -1, true);
        return d;
    }

    @Override // xsna.xpa0
    public final k9l0 N() {
        return this.b.getClickableCounter();
    }

    @Override // xsna.xpa0
    public final int O() {
        return ((Number) this.e.invoke()).intValue();
    }

    @Override // xsna.xpa0
    public final boolean P() {
        nov novVar;
        StickersDrawingViewGroup stickersDrawingViewGroup = this.b;
        zcl0 stickersState = stickersDrawingViewGroup.getStickersState();
        CopyOnWriteArrayList<nov> copyOnWriteArrayList = stickersState.a;
        int i = 0;
        while (true) {
            if (i == copyOnWriteArrayList.size()) {
                novVar = null;
                break;
            }
            if (copyOnWriteArrayList.get(i) instanceof grt0) {
                novVar = copyOnWriteArrayList.get(i);
                break;
            }
            i++;
        }
        return (novVar == null && stickersState.k() == null && !stickersDrawingViewGroup.getStickersState().p()) ? false : true;
    }

    @Override // xsna.xpa0
    public final Size Q() {
        return null;
    }

    @Override // xsna.xpa0
    public final void R() {
        this.b.m.a(false);
    }

    @Override // xsna.xpa0
    public final void S(int i) {
        ((u76) this.c.invoke()).Q2().c(true);
        long j = i;
        StickersDrawingViewGroup stickersDrawingViewGroup = this.b;
        Iterator<nov> it = stickersDrawingViewGroup.q.a.iterator();
        while (it.hasNext()) {
            nov next = it.next();
            if (next instanceof grt0) {
                ((grt0) next).t(j);
                s3q0 s3q0Var = s3q0.a;
            }
            if (next instanceof r4g0) {
                ((r4g0) next).getVideo().t(j);
                s3q0 s3q0Var2 = s3q0.a;
            }
        }
        stickersDrawingViewGroup.m.a(false);
    }

    @Override // xsna.xpa0
    public final Bitmap T() {
        return kd7.i(this.b, null);
    }

    @Override // xsna.xpa0
    public final Point U() {
        CopyOnWriteArrayList<nov> copyOnWriteArrayList = this.b.getStickersState().a;
        for (int i = 0; i != copyOnWriteArrayList.size(); i++) {
            nov novVar = copyOnWriteArrayList.get(i);
            if (!(novVar instanceof yv5) && !(novVar instanceof qx5)) {
                return new Point((int) novVar.getCenterX(), (int) novVar.getCenterY());
            }
        }
        return null;
    }

    @Override // xsna.xpa0
    public final int V() {
        grt0 j = this.b.getStickersState().j();
        if (j != null) {
            return (int) j.getCurrentPosition();
        }
        return -1;
    }

    @Override // xsna.xpa0
    public final String W() {
        return ((u76) this.c.invoke()).W();
    }

    @Override // xsna.xpa0
    public final void playVideo() {
        ((u76) this.c.invoke()).Q2().c(false);
        StickersDrawingViewGroup stickersDrawingViewGroup = this.b;
        stickersDrawingViewGroup.p();
        stickersDrawingViewGroup.m.a(true);
    }
}
