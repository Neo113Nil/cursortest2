package defpackage;

import android.graphics.PointF;
import com.yandex.go.taxi.order.map_objects.f;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.map.IconStyle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.map.utils.a;

/* loaded from: classes14.dex */
public final class d080 implements e080 {
    public final /* synthetic */ f a;

    public d080(f fVar) {
        this.a = fVar;
    }

    @Override // defpackage.e080
    public final void V7(List list) {
        f4c0 f4c0Var;
        f4c0 f4c0Var2;
        f fVar = this.a;
        xm00 xm00Var = fVar.c;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = fVar.z;
        Iterator it = hashMap.keySet().iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (jl40.l(((ei70) next).a, str)) {
                    obj = next;
                    break;
                }
            }
            if (((ei70) obj) == null && (f4c0Var2 = (f4c0) hashMap.get(str)) != null) {
                arrayList.add(f4c0Var2);
                hashMap.remove(str);
            }
        }
        a.B(xm00Var, arrayList);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            ei70 ei70Var = (ei70) it3.next();
            String str2 = ei70Var.a;
            if (hashMap.containsKey(str2)) {
                f4c0Var = (f4c0) hashMap.get(ei70Var.a);
                if (f4c0Var == null) {
                    f4c0Var = new f4c0(new Point(), null, 6);
                }
                h(f4c0Var, ei70Var);
            } else {
                f4c0Var = new f4c0(new Point(), null, 6);
                h(f4c0Var, ei70Var);
                f4c0Var.b(xm00Var);
            }
            hashMap.put(str2, f4c0Var);
        }
    }

    public final void h(f4c0 f4c0Var, ei70 ei70Var) {
        zzs zzsVar = ei70Var.b;
        Polyline polyline = a.b;
        Point point = new Point(zzsVar.a, zzsVar.b);
        f fVar = this.a;
        IconStyle iconStyle = fVar.x;
        int i = c080.a[ei70Var.e.ordinal()];
        iconStyle.setAnchor(i != 1 ? i != 2 ? null : new PointF(0.5f, 1.0f) : new PointF(0.5f, -0.15f));
        f4c0Var.x(ei70Var.f);
        f4c0Var.D(iconStyle);
        f4c0Var.i(true);
        f4c0Var.o(point);
        f4c0Var.k(11.0f);
        f4c0Var.h(ei70Var.a);
        f4c0Var.g(fVar.B);
    }
}
