package defpackage;

import android.view.View;
import androidx.camera.core.impl.UseCaseConfigFactory$CaptureType;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.yandex.div.legacy.view.DivView;
import com.yandex.div.legacy.view.tab.TabTitlesLayoutView;
import com.yandex.go.address.models.Address;
import com.yandex.go.preorder.map.a;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.masstransit.main.ui.flex.SlideableFlexModalView;
import ru.yandex.taxi.tariffs.model.b;

/* loaded from: classes6.dex */
public final class l7s0 implements jg5, i87, pgg, kos0, uni, m5x0, wi21, lir, gnw0, pi, ho3, ll51, i33, em2 {
    public final Object a;

    public l7s0(yy40 yy40Var) {
        this.a = yy40Var;
        x34 x34Var = max0.f4;
        Class cls = (Class) yy40Var.g(x34Var, null);
        if (cls != null && !cls.equals(iru0.class)) {
            w511.l("Invalid target class configuration for ", this, Extension.COLON_SPACE, cls);
            throw null;
        }
        yy40Var.w(xi21.t4, UseCaseConfigFactory$CaptureType.STREAM_SHARING);
        yy40Var.w(x34Var, iru0.class);
        x34 x34Var2 = max0.e4;
        if (yy40Var.g(x34Var2, null) == null) {
            yy40Var.w(x34Var2, iru0.class.getCanonicalName() + "-" + UUID.randomUUID());
        }
    }

    @Override // defpackage.ll51
    public void B(ml51 ml51Var) {
        f05 f05Var;
        List list;
        List list2;
        f05 f05Var2;
        TabTitlesLayoutView tabTitlesLayoutView = (TabTitlesLayoutView) this.a;
        f05Var = tabTitlesLayoutView.mHost;
        if (f05Var == null) {
            return;
        }
        int i = ml51Var.b;
        list = tabTitlesLayoutView.mDataList;
        if (list != null) {
            list2 = tabTitlesLayoutView.mDataList;
            w5x0 w5x0Var = (w5x0) list2.get(i);
            x3k x3kVar = w5x0Var == null ? null : (x3k) w5x0Var.a.b.b;
            if (x3kVar != null) {
                f05Var2 = tabTitlesLayoutView.mHost;
                r3k0 r3k0Var = ((x5x0) ((ddf) f05Var2).b).j;
                z5x0 z5x0Var = (z5x0) r3k0Var.b;
                ((DivView) r3k0Var.c).handleUri(x3kVar.b);
                z5x0Var.f.getClass();
            }
        }
    }

    @Override // defpackage.pgg
    public long C() {
        return 0L;
    }

    @Override // defpackage.go3
    public void D(Object obj) {
        ((o0x0) this.a).G = null;
    }

    @Override // defpackage.pgg
    public w6i0 G(long j) {
        return (w6i0) this.a;
    }

    @Override // defpackage.pgg
    public boolean P() {
        return true;
    }

    @Override // defpackage.pgg
    public long R(long j, long j2) {
        return 1L;
    }

    @Override // defpackage.lir
    public void a(kir kirVar) {
        rwo rwoVar = ((ozu0) this.a).w;
        String str = kirVar.a;
        Map map = kirVar.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), new ktu0((String) entry.getValue()));
        }
        ((y22) rwoVar).a(new iho(str, new lhn((Map) new LinkedHashMap(linkedHashMap))));
    }

    @Override // defpackage.i87
    public xc3 b(Map map) {
        return (xc3) this.a;
    }

    @Override // defpackage.ho3
    /* renamed from: c */
    public boolean mo103c(int i) {
        return false;
    }

    @Override // defpackage.owo
    public yy40 d() {
        return (yy40) this.a;
    }

    @Override // defpackage.wi21
    public xi21 e() {
        return new jru0(ug70.a((yy40) this.a));
    }

    @Override // defpackage.pgg
    public long f(long j) {
        return 0L;
    }

    public void g() {
        cft0 cft0Var = (cft0) this.a;
        Address address = cft0Var.g.a;
        if (address == null) {
            cft0Var.d.b();
            return;
        }
        uq40 uq40Var = cft0Var.b;
        zzs B = address.B();
        ah00 ah00Var = uq40Var.b;
        ((a) uq40Var.l).a(false);
        if (uq40Var.A.c() && ((ir40) uq40Var.o.a.b()).b) {
            uq40Var.q.c();
        }
        gh00 gh00Var = (gh00) ah00Var;
        if (gh00Var.j() >= 17.0f) {
            uq40Var.u.a(B, new rq40(uq40Var, 1));
        } else {
            gh00Var.D(ru.yandex.taxi.map.utils.a.F(B), 17.0f, 200.0f, new mx0(8, uq40Var));
        }
    }

    @Override // defpackage.pgg
    public long h(long j, long j2) {
        return j2;
    }

    @Override // defpackage.pgg
    public long i(long j, long j2) {
        return 0L;
    }

    @Override // defpackage.pgg
    public long j(long j, long j2) {
        return -9223372036854775807L;
    }

    @Override // defpackage.m5x0
    public int k(int i) {
        vcu0 vcu0Var = ((com.yandex.messaging.internal.view.stickers.panel.a) this.a).B;
        if (vcu0Var == null) {
            return -1;
        }
        vcu0 vcu0Var2 = vcu0Var.x.a;
        vcu0Var2.c.moveToPosition(i);
        return vcu0Var2.c.getInt(2);
    }

    @Override // defpackage.m5x0
    public int l(int i) {
        vcu0 vcu0Var = ((com.yandex.messaging.internal.view.stickers.panel.a) this.a).B;
        if (vcu0Var == null) {
            return -1;
        }
        vcu0 vcu0Var2 = (vcu0) vcu0Var.w.b;
        vcu0Var2.b.moveToPosition(i);
        return vcu0Var2.b.getInt(5);
    }

    public boolean m(tlx0 tlx0Var) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < 100; i++) {
            String str = tlx0Var.a;
            String str2 = tlx0Var.b;
            lmw0 lmw0Var = null;
            mi31 d = b8r.d((b8r) this.a, str, null, 6);
            if (d == null) {
                jst.e.k(new NullPointerException(), String.format("No tariff with class %s exists", Arrays.copyOf(new Object[]{str}, 1)));
            } else {
                lmw0 g = b.g(d.a, str2);
                if (g == null) {
                    jst.e.k(new NullPointerException(), String.format("No requirement '%s' in tariff '%s'", Arrays.copyOf(new Object[]{str2, str}, 2)));
                } else {
                    lmw0Var = g;
                }
            }
            if (lmw0Var == null) {
                return false;
            }
            String j = b64.j(lmw0Var.getName(), tlx0Var.a);
            if (hashSet.contains(j)) {
                g8e.A(jst.e, "Found loop in redirects");
                return false;
            }
            hashSet.add(j);
            if (!(lmw0Var instanceof kmw0)) {
                return true;
            }
            tlx0Var = ((kmw0) lmw0Var).h;
        }
        g8e.A(jst.e, "Exceeded max redirect count =100");
        return false;
    }

    @Override // defpackage.i33
    public Object n(iip0 iip0Var, Float f, Float f2, tls tlsVar, Continuation continuation) {
        float floatValue = f.floatValue();
        float floatValue2 = f2.floatValue();
        Object b = androidx.compose.foundation.gestures.snapping.b.b(iip0Var, Math.signum(floatValue2) * Math.abs(floatValue), floatValue, uh6.a(0.0f, floatValue2, 28), (jj2) this.a, tlsVar, (ContinuationImpl) continuation);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : (vi2) b;
    }

    @Override // defpackage.pi
    public boolean o(View view, hi hiVar) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.a;
        if (!swipeDismissBehavior.u(view)) {
            return false;
        }
        boolean z = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.x;
        int width = (!(i == 0 && z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth();
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        dc5 dc5Var = swipeDismissBehavior.b;
        if (dc5Var != null) {
            dc5Var.a(view);
        }
        return true;
    }

    @Override // defpackage.kos0
    public void r(int i) {
        View contentView;
        t1w currentInsets;
        int i2;
        AnchorBottomSheetBehavior bottomSheetBehavior;
        SlideableFlexModalView slideableFlexModalView = (SlideableFlexModalView) this.a;
        contentView = slideableFlexModalView.getContentView();
        int height = contentView.getHeight();
        RecyclerView flexRecyclerView = slideableFlexModalView.flexRecyclerView();
        if (flexRecyclerView == null) {
            i2 = slideableFlexModalView.getCardContentView().getHeight();
        } else {
            int height2 = flexRecyclerView.getHeight();
            currentInsets = slideableFlexModalView.getCurrentInsets();
            i2 = height2 + currentInsets.d;
        }
        bottomSheetBehavior = slideableFlexModalView.getBottomSheetBehavior();
        bottomSheetBehavior.K(slideableFlexModalView.computeExpandedMinOffset(height, i2), true);
        slideableFlexModalView.invalidateFlexVisibleBoundsAfterLayout();
    }

    @Override // defpackage.pgg
    public long t(long j, long j2) {
        return 0L;
    }

    @Override // defpackage.ll51
    public void v(ml51 ml51Var) {
        f05 f05Var;
        f05 f05Var2;
        TabTitlesLayoutView tabTitlesLayoutView = (TabTitlesLayoutView) this.a;
        f05Var = tabTitlesLayoutView.mHost;
        if (f05Var == null) {
            return;
        }
        int i = ml51Var.b;
        f05Var2 = tabTitlesLayoutView.mHost;
        ((x5x0) ((ddf) f05Var2).b).c.setCurrentItem(i);
    }

    @Override // defpackage.pgg
    public long x(long j) {
        return 1L;
    }

    @Override // defpackage.jg5
    public void y(ig5 ig5Var, jh5 jh5Var) {
        String str;
        if (ig5Var instanceof j7s0) {
            j7s0 j7s0Var = (j7s0) ig5Var;
            Map map = j7s0Var.a;
            if (!jl40.l(j7s0Var.b, "web") || (str = (String) map.get("url")) == null) {
                return;
            }
            ((z370) this.a).y(new y370(map, str), jh5Var);
        }
    }

    public l7s0(cft0 cft0Var, zlm zlmVar) {
        this.a = cft0Var;
    }

    public /* synthetic */ l7s0(Object obj) {
        this.a = obj;
    }
}
