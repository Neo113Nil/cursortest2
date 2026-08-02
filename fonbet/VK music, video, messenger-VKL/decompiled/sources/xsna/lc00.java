package xsna;

import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;
import com.vk.editor.timeline.api.YIndexShift;
import com.vk.editor.timeline.state.magnet.MagnetType;
import java.util.Iterator;
import java.util.List;

/* compiled from: MagnetSearchEngineMove.kt */
/* loaded from: classes18.dex */
public final class lc00 extends jc00 {
    public lc00() {
        throw null;
    }

    @Override // xsna.jc00
    public final ic00 b(gp6 gp6Var, YIndexShift yIndexShift) {
        float signum;
        int t = gp6Var.t() - yIndexShift.a;
        ywo0 d = d();
        int abs = Math.abs(t);
        d.getClass();
        float g = ywo0.g(abs);
        float f = gip0.n / 2;
        RectF rectF = new RectF();
        if (Integer.signum(t) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            signum = ((g * Integer.signum(t)) + (gp6Var.u().bottom - gp6Var.p())) - f;
        } else {
            signum = (g * Integer.signum(t)) + (gp6Var.u().top - gp6Var.p()) + f;
        }
        rectF.set(gp6Var.u().left, signum, gp6Var.u().right, signum);
        return new ic00(gp6Var.m(), MagnetType.VerticalInsert, rectF, gp6Var.t(), yIndexShift, swe0.i(f(rectF.left), 0L, d().e - gp6Var.getDuration()));
    }

    @Override // xsna.jc00
    public final ic00 c(gp6 gp6Var, YIndexShift yIndexShift) {
        this.b = MagnetType.None;
        this.c = Float.MAX_VALUE;
        this.d = gp6Var.u().left;
        this.e = gp6Var.u().right;
        MagnetType magnetType = MagnetType.LeftEdgeToCursor;
        int i = yIndexShift.a;
        g(d().o.centerX(), i, magnetType, gp6Var);
        i(d().o.centerX(), i, MagnetType.RightEdgeToCursor, gp6Var);
        Iterator<? extends List<? extends gp6>> it = d().g.iterator();
        while (it.hasNext()) {
            for (gp6 gp6Var2 : it.next()) {
                if (!epx.f(gp6Var.m(), gp6Var2.m())) {
                    g(gp6Var2.u().right, i, MagnetType.LeftEdgeToNeighbourItem, gp6Var);
                    i(gp6Var2.u().left, i, MagnetType.RightEdgeToNeighbourItem, gp6Var);
                }
            }
        }
        for (ckt0 ckt0Var : d().f) {
            g(ckt0Var.l.left, i, MagnetType.LeftEdgeToLeftVideoItem, gp6Var);
            i(ckt0Var.l.right, i, MagnetType.RightEdgeToRightVideoItem, gp6Var);
        }
        int t = gp6Var.t() - i;
        ywo0 d = d();
        int abs = Math.abs(t);
        d.getClass();
        float g = ywo0.g(abs) + gip0.n;
        float signum = (Integer.signum(t) * g) + (gp6Var.u().top - gp6Var.p());
        float signum2 = (g * Integer.signum(t)) + (gp6Var.u().bottom - gp6Var.p());
        RectF rectF = new RectF();
        float f = this.d;
        rectF.left = f;
        rectF.top = signum;
        rectF.right = this.e;
        rectF.bottom = signum2;
        long i2 = swe0.i(f(f), 0L, d().e - gp6Var.getDuration());
        if (this.b == MagnetType.LeftEdgeToNeighbourItem) {
            rectF.left += jfp0.y;
        }
        return new ic00(gp6Var.m(), this.b, rectF, gp6Var.t(), yIndexShift, i2);
    }

    public final long f(float f) {
        return d().r.c(f - d().d());
    }

    public final void g(float f, int i, MagnetType magnetType, gp6 gp6Var) {
        if (f > gp6Var.u().left || gp6Var.u().width() + f > d().t || e(i, f(f), gp6Var) || !h(magnetType, f, gp6Var.u().left)) {
            return;
        }
        this.d = f;
        this.e = gp6Var.u().width() + f;
    }

    public final boolean h(MagnetType magnetType, float f, float f2) {
        MagnetType magnetType2 = this.b;
        float f3 = this.c;
        float f4 = f2 - f;
        if (f4 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f4 < dn70.b(18) && (magnetType2 == MagnetType.None || f3 > f4)) {
            this.b = magnetType;
            this.c = f4;
        }
        return magnetType2 != this.b;
    }

    public final void i(float f, int i, MagnetType magnetType, gp6 gp6Var) {
        if (gp6Var.u().right > f || d().d() > f - gp6Var.u().width()) {
            return;
        }
        float width = f - gp6Var.u().width();
        if (!e(i, f(width), gp6Var) && h(magnetType, gp6Var.u().right, f)) {
            this.e = f;
            this.d = width;
        }
    }
}
