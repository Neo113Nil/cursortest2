package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import com.yandex.mapkit.ScreenRect;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.a;

/* loaded from: classes6.dex */
public final class erx {
    public final xam a;
    public final nqb0 b;
    public final kn1 c;
    public final uqx d;
    public final Canvas e = new Canvas();
    public final i3y f;
    public final i3y g;
    public final i3y h;
    public qqb0 i;
    public ScreenRect j;

    public erx(final Context context, xam xamVar, nqb0 nqb0Var, kn1 kn1Var, uqx uqxVar) {
        this.a = xamVar;
        this.b = nqb0Var;
        this.c = kn1Var;
        this.d = uqxVar;
        final int i = 0;
        this.f = a.a(new sls(this) { // from class: crx
            public final /* synthetic */ erx b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                Context context2 = context;
                erx erxVar = this.b;
                switch (i2) {
                    case 0:
                        uqx uqxVar2 = erxVar.d;
                        xam xamVar2 = erxVar.a;
                        Canvas canvas = erxVar.e;
                        wa60 wa60Var = new wa60(0.43f, 0.85f, 0.13f, 0.78f);
                        wa60 wa60Var2 = new wa60(0.49f, 0.55f, 0.49f, 0.55f);
                        Drawable t = vng.t(f1h0.pickup_label_white_left_top_bg, xamVar2.a);
                        int i3 = f1h0.pickup_label_white_left_bottom_bg;
                        Context context3 = xamVar2.a;
                        Drawable t2 = vng.t(i3, context3);
                        Drawable t3 = vng.t(f1h0.pickup_label_white_right_top_bg, context3);
                        Drawable t4 = vng.t(f1h0.pickup_label_white_right_bottom_bg, context3);
                        int u = tje.u(90, context2);
                        int color = context2.getColor(mqg0.component_paste_yellow_450);
                        nqx l = wbz0.l(t != null ? sb2.l(canvas, context2, t, wa60Var, wa60Var2) : null, 0.0f, 0.0f, 0.8f, 0.8f, color, Integer.valueOf(u));
                        nqx l2 = wbz0.l(t2 != null ? sb2.l(canvas, context2, t2, wa60Var, wa60Var2) : null, 0.0f, 1.0f, -0.8f, 0.8f, color, Integer.valueOf(u));
                        nqx l3 = wbz0.l(t3 != null ? sb2.l(canvas, context2, t3, wa60Var, wa60Var2) : null, 1.0f, 0.0f, 0.8f, -0.8f, color, Integer.valueOf(u));
                        nqx l4 = wbz0.l(t4 != null ? sb2.l(canvas, context2, t4, wa60Var, wa60Var2) : null, 1.0f, 1.0f, -0.8f, -0.8f, color, Integer.valueOf(u));
                        uqxVar2.getClass();
                        return scc.c(new xqx(context2, l), new xqx(context2, l2), new xqx(context2, l3), new xqx(context2, l4));
                    case 1:
                        uqx uqxVar3 = erxVar.d;
                        xam xamVar3 = erxVar.a;
                        Canvas canvas2 = erxVar.e;
                        int color2 = context2.getColor(mqg0.component_paste_yellow_450);
                        Drawable t5 = vng.t(f1h0.pickup_label_plain_bg, xamVar3.a);
                        if (t5 != null) {
                            t5 = sb2.l(canvas2, context2, t5, new wa60(0.5f, 0.5f, 0.13f, 0.81f), new wa60(0.4f, 0.6f, 0.4f, 0.6f));
                        }
                        nqx nqxVar = new nqx(t5, color2, 0.5f, 0.0f, 1.1f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 3, 2, Integer.MAX_VALUE, Integer.MAX_VALUE);
                        uqxVar3.getClass();
                        return new xqx(context2, nqxVar);
                    default:
                        uqx uqxVar4 = erxVar.d;
                        nqx nqxVar2 = new nqx(vng.t(a0h0.pickup_label_bg, erxVar.a.a), -1, 0.5f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 3, 4, Integer.MAX_VALUE, Integer.MAX_VALUE);
                        uqxVar4.getClass();
                        return new xqx(context2, nqxVar2);
                }
            }
        });
        final int i2 = 1;
        this.g = a.a(new sls(this) { // from class: crx
            public final /* synthetic */ erx b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                Context context2 = context;
                erx erxVar = this.b;
                switch (i22) {
                    case 0:
                        uqx uqxVar2 = erxVar.d;
                        xam xamVar2 = erxVar.a;
                        Canvas canvas = erxVar.e;
                        wa60 wa60Var = new wa60(0.43f, 0.85f, 0.13f, 0.78f);
                        wa60 wa60Var2 = new wa60(0.49f, 0.55f, 0.49f, 0.55f);
                        Drawable t = vng.t(f1h0.pickup_label_white_left_top_bg, xamVar2.a);
                        int i3 = f1h0.pickup_label_white_left_bottom_bg;
                        Context context3 = xamVar2.a;
                        Drawable t2 = vng.t(i3, context3);
                        Drawable t3 = vng.t(f1h0.pickup_label_white_right_top_bg, context3);
                        Drawable t4 = vng.t(f1h0.pickup_label_white_right_bottom_bg, context3);
                        int u = tje.u(90, context2);
                        int color = context2.getColor(mqg0.component_paste_yellow_450);
                        nqx l = wbz0.l(t != null ? sb2.l(canvas, context2, t, wa60Var, wa60Var2) : null, 0.0f, 0.0f, 0.8f, 0.8f, color, Integer.valueOf(u));
                        nqx l2 = wbz0.l(t2 != null ? sb2.l(canvas, context2, t2, wa60Var, wa60Var2) : null, 0.0f, 1.0f, -0.8f, 0.8f, color, Integer.valueOf(u));
                        nqx l3 = wbz0.l(t3 != null ? sb2.l(canvas, context2, t3, wa60Var, wa60Var2) : null, 1.0f, 0.0f, 0.8f, -0.8f, color, Integer.valueOf(u));
                        nqx l4 = wbz0.l(t4 != null ? sb2.l(canvas, context2, t4, wa60Var, wa60Var2) : null, 1.0f, 1.0f, -0.8f, -0.8f, color, Integer.valueOf(u));
                        uqxVar2.getClass();
                        return scc.c(new xqx(context2, l), new xqx(context2, l2), new xqx(context2, l3), new xqx(context2, l4));
                    case 1:
                        uqx uqxVar3 = erxVar.d;
                        xam xamVar3 = erxVar.a;
                        Canvas canvas2 = erxVar.e;
                        int color2 = context2.getColor(mqg0.component_paste_yellow_450);
                        Drawable t5 = vng.t(f1h0.pickup_label_plain_bg, xamVar3.a);
                        if (t5 != null) {
                            t5 = sb2.l(canvas2, context2, t5, new wa60(0.5f, 0.5f, 0.13f, 0.81f), new wa60(0.4f, 0.6f, 0.4f, 0.6f));
                        }
                        nqx nqxVar = new nqx(t5, color2, 0.5f, 0.0f, 1.1f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 3, 2, Integer.MAX_VALUE, Integer.MAX_VALUE);
                        uqxVar3.getClass();
                        return new xqx(context2, nqxVar);
                    default:
                        uqx uqxVar4 = erxVar.d;
                        nqx nqxVar2 = new nqx(vng.t(a0h0.pickup_label_bg, erxVar.a.a), -1, 0.5f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 3, 4, Integer.MAX_VALUE, Integer.MAX_VALUE);
                        uqxVar4.getClass();
                        return new xqx(context2, nqxVar2);
                }
            }
        });
        final int i3 = 2;
        this.h = a.a(new sls(this) { // from class: crx
            public final /* synthetic */ erx b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i3;
                Context context2 = context;
                erx erxVar = this.b;
                switch (i22) {
                    case 0:
                        uqx uqxVar2 = erxVar.d;
                        xam xamVar2 = erxVar.a;
                        Canvas canvas = erxVar.e;
                        wa60 wa60Var = new wa60(0.43f, 0.85f, 0.13f, 0.78f);
                        wa60 wa60Var2 = new wa60(0.49f, 0.55f, 0.49f, 0.55f);
                        Drawable t = vng.t(f1h0.pickup_label_white_left_top_bg, xamVar2.a);
                        int i32 = f1h0.pickup_label_white_left_bottom_bg;
                        Context context3 = xamVar2.a;
                        Drawable t2 = vng.t(i32, context3);
                        Drawable t3 = vng.t(f1h0.pickup_label_white_right_top_bg, context3);
                        Drawable t4 = vng.t(f1h0.pickup_label_white_right_bottom_bg, context3);
                        int u = tje.u(90, context2);
                        int color = context2.getColor(mqg0.component_paste_yellow_450);
                        nqx l = wbz0.l(t != null ? sb2.l(canvas, context2, t, wa60Var, wa60Var2) : null, 0.0f, 0.0f, 0.8f, 0.8f, color, Integer.valueOf(u));
                        nqx l2 = wbz0.l(t2 != null ? sb2.l(canvas, context2, t2, wa60Var, wa60Var2) : null, 0.0f, 1.0f, -0.8f, 0.8f, color, Integer.valueOf(u));
                        nqx l3 = wbz0.l(t3 != null ? sb2.l(canvas, context2, t3, wa60Var, wa60Var2) : null, 1.0f, 0.0f, 0.8f, -0.8f, color, Integer.valueOf(u));
                        nqx l4 = wbz0.l(t4 != null ? sb2.l(canvas, context2, t4, wa60Var, wa60Var2) : null, 1.0f, 1.0f, -0.8f, -0.8f, color, Integer.valueOf(u));
                        uqxVar2.getClass();
                        return scc.c(new xqx(context2, l), new xqx(context2, l2), new xqx(context2, l3), new xqx(context2, l4));
                    case 1:
                        uqx uqxVar3 = erxVar.d;
                        xam xamVar3 = erxVar.a;
                        Canvas canvas2 = erxVar.e;
                        int color2 = context2.getColor(mqg0.component_paste_yellow_450);
                        Drawable t5 = vng.t(f1h0.pickup_label_plain_bg, xamVar3.a);
                        if (t5 != null) {
                            t5 = sb2.l(canvas2, context2, t5, new wa60(0.5f, 0.5f, 0.13f, 0.81f), new wa60(0.4f, 0.6f, 0.4f, 0.6f));
                        }
                        nqx nqxVar = new nqx(t5, color2, 0.5f, 0.0f, 1.1f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 3, 2, Integer.MAX_VALUE, Integer.MAX_VALUE);
                        uqxVar3.getClass();
                        return new xqx(context2, nqxVar);
                    default:
                        uqx uqxVar4 = erxVar.d;
                        nqx nqxVar2 = new nqx(vng.t(a0h0.pickup_label_bg, erxVar.a.a), -1, 0.5f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 3, 4, Integer.MAX_VALUE, Integer.MAX_VALUE);
                        uqxVar4.getClass();
                        return new xqx(context2, nqxVar2);
                }
            }
        });
    }

    public final void a(Map map) {
        Object obj;
        kn1 kn1Var;
        xqx xqxVar;
        Iterator it = map.keySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((wpb0) obj).l) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        wpb0 wpb0Var = (wpb0) obj;
        if (wpb0Var == null) {
            return;
        }
        final ru.yandex.taxi.map.overlay.pickup.a aVar = (ru.yandex.taxi.map.overlay.pickup.a) map.get(wpb0Var);
        final int i = 1;
        if (aVar == null) {
            jst.e.x(new IllegalStateException("PickupPoints inconsistency detected"), String.format("Missing pickup point %s while update labels", Arrays.copyOf(new Object[]{wpb0Var}, 1)));
            return;
        }
        i3y i3yVar = this.f;
        Iterator it2 = ((List) i3yVar.getValue()).iterator();
        do {
            boolean hasNext = it2.hasNext();
            kn1Var = this.c;
            final int i2 = 0;
            if (!hasNext) {
                nqb0 nqb0Var = this.b;
                if (nqb0Var.a) {
                    xqx xqxVar2 = (xqx) kotlin.collections.a.P((List) i3yVar.getValue());
                    xqxVar2.d(wpb0Var.a());
                    aVar.a(xqxVar2.b(), xqxVar2.a(), this.i);
                    nqb0Var.a = false;
                    return;
                }
                for (final xqx xqxVar3 : (List) i3yVar.getValue()) {
                    xqxVar3.c(true);
                    if (!kn1Var.v(wpb0Var, xqxVar3, map, this.j)) {
                        aVar.a(xqxVar3.b(), xqxVar3.a(), new qqb0() { // from class: drx
                            @Override // defpackage.qqb0
                            public final void a(wpb0 wpb0Var2) {
                                int i3 = i2;
                                erx erxVar = this;
                                ru.yandex.taxi.map.overlay.pickup.a aVar2 = aVar;
                                xqx xqxVar4 = xqxVar3;
                                switch (i3) {
                                    case 0:
                                        xqxVar4.c(!xqxVar4.d);
                                        Bitmap b = xqxVar4.b();
                                        PointF a = xqxVar4.a();
                                        f4c0 f4c0Var = aVar2.l;
                                        if (f4c0Var != null) {
                                            aVar2.d(f4c0Var, aVar2.c, b, a);
                                        }
                                        qqb0 qqb0Var = erxVar.i;
                                        if (qqb0Var != null) {
                                            qqb0Var.a(wpb0Var2);
                                            break;
                                        }
                                        break;
                                    default:
                                        xqxVar4.c(!xqxVar4.d);
                                        Bitmap b2 = xqxVar4.b();
                                        PointF a2 = xqxVar4.a();
                                        f4c0 f4c0Var2 = aVar2.l;
                                        if (f4c0Var2 != null) {
                                            aVar2.d(f4c0Var2, aVar2.c, b2, a2);
                                        }
                                        qqb0 qqb0Var2 = erxVar.i;
                                        if (qqb0Var2 != null) {
                                            qqb0Var2.a(wpb0Var2);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        return;
                    }
                }
                final xqx xqxVar4 = (xqx) kotlin.collections.a.P((List) i3yVar.getValue());
                xqxVar4.c(true);
                aVar.a(xqxVar4.b(), xqxVar4.a(), new qqb0() { // from class: drx
                    @Override // defpackage.qqb0
                    public final void a(wpb0 wpb0Var2) {
                        int i3 = i;
                        erx erxVar = this;
                        ru.yandex.taxi.map.overlay.pickup.a aVar2 = aVar;
                        xqx xqxVar42 = xqxVar4;
                        switch (i3) {
                            case 0:
                                xqxVar42.c(!xqxVar42.d);
                                Bitmap b = xqxVar42.b();
                                PointF a = xqxVar42.a();
                                f4c0 f4c0Var = aVar2.l;
                                if (f4c0Var != null) {
                                    aVar2.d(f4c0Var, aVar2.c, b, a);
                                }
                                qqb0 qqb0Var = erxVar.i;
                                if (qqb0Var != null) {
                                    qqb0Var.a(wpb0Var2);
                                    break;
                                }
                                break;
                            default:
                                xqxVar42.c(!xqxVar42.d);
                                Bitmap b2 = xqxVar42.b();
                                PointF a2 = xqxVar42.a();
                                f4c0 f4c0Var2 = aVar2.l;
                                if (f4c0Var2 != null) {
                                    aVar2.d(f4c0Var2, aVar2.c, b2, a2);
                                }
                                qqb0 qqb0Var2 = erxVar.i;
                                if (qqb0Var2 != null) {
                                    qqb0Var2.a(wpb0Var2);
                                    break;
                                }
                                break;
                        }
                    }
                });
                return;
            }
            xqxVar = (xqx) it2.next();
            xqxVar.c(false);
            xqxVar.d(wpb0Var.a());
        } while (kn1Var.v(wpb0Var, xqxVar, map, this.j));
        aVar.a(xqxVar.b(), xqxVar.a(), this.i);
    }

    public final void b(HashMap hashMap) {
        String a;
        Set keySet = hashMap.keySet();
        if (!(keySet instanceof Collection) || !keySet.isEmpty()) {
            Iterator it = keySet.iterator();
            while (it.hasNext()) {
                if (((wpb0) it.next()).m) {
                    for (Map.Entry entry : hashMap.entrySet()) {
                        wpb0 wpb0Var = (wpb0) entry.getKey();
                        ru.yandex.taxi.map.overlay.pickup.a aVar = (ru.yandex.taxi.map.overlay.pickup.a) entry.getValue();
                        if (!wpb0Var.m || (a = wpb0Var.a()) == null || evu0.J(a)) {
                            aVar.b();
                        } else {
                            i3y i3yVar = this.h;
                            ((xqx) i3yVar.getValue()).d(wpb0Var.a());
                            aVar.a(((xqx) i3yVar.getValue()).b(), ((xqx) i3yVar.getValue()).a(), this.i);
                        }
                    }
                    return;
                }
            }
        }
        a(hashMap);
        for (Map.Entry entry2 : hashMap.entrySet()) {
            wpb0 wpb0Var2 = (wpb0) entry2.getKey();
            ru.yandex.taxi.map.overlay.pickup.a aVar2 = (ru.yandex.taxi.map.overlay.pickup.a) entry2.getValue();
            if (!wpb0Var2.m && !wpb0Var2.l) {
                String a2 = wpb0Var2.a();
                if (a2 == null || evu0.J(a2)) {
                    aVar2.b();
                } else {
                    i3y i3yVar2 = this.g;
                    ((xqx) i3yVar2.getValue()).d(wpb0Var2.a());
                    if (this.c.v(wpb0Var2, (xqx) i3yVar2.getValue(), hashMap, null)) {
                        aVar2.b();
                    } else {
                        aVar2.a(((xqx) i3yVar2.getValue()).b(), ((xqx) i3yVar2.getValue()).a(), this.i);
                    }
                }
            }
        }
    }
}
