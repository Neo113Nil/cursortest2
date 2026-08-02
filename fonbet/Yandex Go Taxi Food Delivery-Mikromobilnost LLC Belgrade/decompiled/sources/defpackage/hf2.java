package defpackage;

import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import com.yandex.go.taxi.order.domain.repositories.n;
import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import com.yandex.go.taxi.order.provider.a;
import com.yandex.go.taxi.order.state.search.SearchState;
import com.yandex.go.taxi.order.view.l;
import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.ScreenRect;
import com.yandex.mapkit.map.LayerIds;
import com.yandex.mapkit.map.SublayerFeatureType;
import com.yandex.mapkit.map.SublayerManager;
import java.util.ArrayList;
import java.util.Iterator;
import ru.yandex.taxi.map_common.map.k;
import ru.yandex.taxi.widget.AnimatedCircularHoleFogView;

/* loaded from: classes6.dex */
public final class hf2 {
    public final ah00 a;
    public final y3u0 b;
    public final et00 c;
    public final amp0 d;
    public final int e;
    public final ArrayList f = new ArrayList();
    public final Handler g = new Handler(Looper.getMainLooper());
    public final gf2 h = new gf2(this, 2);
    public final b01 i = new b01(2, this);
    public final AnimatedCircularHoleFogView j;
    public boolean k;
    public m58 l;
    public boolean m;

    public hf2(ah00 ah00Var, y3u0 y3u0Var, h080 h080Var, ow70 ow70Var, et00 et00Var, amp0 amp0Var) {
        this.a = ah00Var;
        this.b = y3u0Var;
        this.c = et00Var;
        this.d = amp0Var;
        this.e = h080Var.a;
        ViewGroup a = ow70Var.a();
        if (a == null) {
            ny61.r("Root view group cannot be null!");
            throw null;
        }
        AnimatedCircularHoleFogView animatedCircularHoleFogView = (AnimatedCircularHoleFogView) a.findViewById(p8h0.search_animated_fog);
        if (animatedCircularHoleFogView != null) {
            this.j = animatedCircularHoleFogView;
        } else {
            ny61.r("search_animated_fog view not found in hierarchy!");
            throw null;
        }
    }

    public final ScreenPoint a(m58 m58Var) {
        ScreenPoint e = ((gh00) this.a).e.e(m58Var.c);
        return (e == null || !this.b.a()) ? e : new ScreenPoint(e.getX(), e.getY() - this.e);
    }

    public final void b(boolean z) {
        this.k = false;
        AnimatedCircularHoleFogView animatedCircularHoleFogView = this.j;
        if (z) {
            animatedCircularHoleFogView.unsetPointAnimated(2000L, new gf2(this, 0));
        } else {
            animatedCircularHoleFogView.unsetPointAnimated(2000L, new gf2(this, 1));
        }
    }

    public final boolean c(ScreenPoint screenPoint) {
        ScreenRect c = ((gh00) this.a).a.c();
        if (c != null) {
            return c.getTopLeft().getX() <= screenPoint.getX() && screenPoint.getX() <= c.getBottomRight().getX() && c.getTopLeft().getY() <= screenPoint.getY() && screenPoint.getY() <= c.getBottomRight().getY();
        }
        if (0.0f > screenPoint.getX()) {
            return false;
        }
        float x = screenPoint.getX();
        AnimatedCircularHoleFogView animatedCircularHoleFogView = this.j;
        return x <= ((float) animatedCircularHoleFogView.getWidth()) && 0.0f <= screenPoint.getY() && screenPoint.getY() <= ((float) animatedCircularHoleFogView.getHeight());
    }

    public final boolean d() {
        ScreenPoint screenPoint;
        m58 m58Var;
        if (this.k) {
            return true;
        }
        while (true) {
            ArrayList arrayList = this.f;
            screenPoint = null;
            if (!arrayList.isEmpty() && ((gh00) this.a).j() > 13.0f) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    m58Var = (m58) it.next();
                    ScreenPoint a = a(m58Var);
                    if (a == null ? false : c(a)) {
                        arrayList.remove(m58Var);
                        break;
                    }
                }
            }
            m58Var = null;
            if (m58Var == null) {
                break;
            }
            screenPoint = a(m58Var);
            if (screenPoint != null) {
                this.l = m58Var;
                break;
            }
        }
        if (screenPoint == null) {
            return false;
        }
        this.k = true;
        AnimatedCircularHoleFogView.setPointAnimated$default(this.j, new Point((int) screenPoint.getX(), (int) screenPoint.getY()), 2000L, 0.0f, null, 12, null);
        Handler handler = this.g;
        gf2 gf2Var = this.h;
        handler.removeCallbacks(gf2Var);
        handler.postDelayed(gf2Var, 4000L);
        return true;
    }

    public final void e() {
        if (this.m) {
            return;
        }
        this.m = true;
        ((gh00) this.a).e(this.i);
        this.c.c();
        if (d()) {
            return;
        }
        amp0 amp0Var = this.d;
        OrderScreen orderScreen = ((ra80) ((l) amp0Var.c).j.getValue()).a;
        OrderScreen orderScreen2 = OrderScreen.ORDER_DETAILS;
        n20 n20Var = (n20) amp0Var.b;
        o2y0 u = orderScreen == orderScreen2 ? ((a) n20Var).u() : (o2y0) kotlin.collections.a.b0(((a) n20Var).l());
        String str = u != null ? u.b().a : null;
        if (str == null) {
            str = "";
        }
        SearchState k = ((n) ((iup0) amp0Var.a)).k(str);
        if (k != null ? k.f : true) {
            this.j.showStaticFogAnimated(new gf2(this, 3));
        }
    }

    public final void f(boolean z) {
        SublayerManager a;
        Integer findFirstOf;
        Integer findFirstOf2;
        if (this.m) {
            this.m = false;
            et00 et00Var = this.c;
            et00Var.getClass();
            String s = k.s();
            if (s != null) {
                String buildingsLayerId = !el00.a ? null : LayerIds.getBuildingsLayerId();
                if (buildingsLayerId != null && (a = et00Var.a()) != null && (findFirstOf = a.findFirstOf(s, SublayerFeatureType.GROUND)) != null) {
                    int intValue = findFirstOf.intValue();
                    SublayerManager a2 = et00Var.a();
                    if (a2 != null && (findFirstOf2 = a2.findFirstOf(buildingsLayerId, SublayerFeatureType.MODELS)) != null) {
                        int intValue2 = findFirstOf2.intValue();
                        SublayerManager a3 = et00Var.a();
                        if (a3 != null) {
                            a3.moveBefore(intValue, intValue2);
                        }
                    }
                }
            }
            ((gh00) this.a).u(this.i);
            this.g.removeCallbacks(this.h);
            b(false);
            this.f.clear();
            if (z) {
                this.j.hideStaticFogAnimated();
            }
        }
    }
}
