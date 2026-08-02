package defpackage;

import android.content.Context;
import androidx.appcompat.view.ContextThemeWrapper;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.runtime.image.ImageProvider;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import ru.yandex.taxi.map.overlay.diagnostic.a;

/* loaded from: classes6.dex */
public final class f8z extends r8 implements i8z {
    public final xqx A;
    public final w53 B;
    public final r58 C;
    public final a c;
    public final hdu w;
    public final xm00 x;
    public final i130 y;
    public final f9v z;

    public f8z(ah00 ah00Var, a aVar, hdu hduVar, xm00 xm00Var, i130 i130Var, Context context, uqx uqxVar) {
        super(5, ah00Var);
        this.c = aVar;
        this.w = hduVar;
        this.x = xm00Var;
        this.y = i130Var;
        this.z = new f9v(new ContextThemeWrapper(context, a2i0.IconRedToxicNormal), f1h0.ic_point_24);
        nqx nqxVar = new nqx(context.getDrawable(i2h0.pickup_label_bg), -1, 0.5f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 3, 4, Integer.MAX_VALUE, Integer.MAX_VALUE);
        uqxVar.getClass();
        this.A = new xqx(context, nqxVar);
        this.B = new w53();
        this.C = new r58(3, this);
    }

    @Override // defpackage.i8z
    public final void ff(LinkedHashMap linkedHashMap) {
        w53 w53Var = new w53();
        w53 w53Var2 = this.B;
        w53Var.putAll(w53Var2);
        ((s53) w53Var2.keySet()).retainAll(linkedHashMap.keySet());
        Set keySet = w53Var.keySet();
        ((s53) keySet).a.l(w53Var2.keySet());
        Iterator it = ((u53) w53Var.values()).iterator();
        while (true) {
            yqv yqvVar = (yqv) it;
            if (!yqvVar.hasNext()) {
                break;
            }
            rud0 rud0Var = (rud0) yqvVar.next();
            rud0Var.a.d();
            f4c0 f4c0Var = rud0Var.b;
            f4c0Var.g(null);
            f4c0Var.d();
        }
        for (Map.Entry entry : w53Var2.entrySet()) {
            Object obj = (String) entry.getKey();
            rud0 rud0Var2 = (rud0) entry.getValue();
            zzs zzsVar = (zzs) linkedHashMap.get(obj);
            if (zzsVar != null) {
                rud0Var2.getClass();
                Polyline polyline = ru.yandex.taxi.map.utils.a.b;
                Point point = new Point(zzsVar.a, zzsVar.b);
                rud0Var2.a.o(point);
                rud0Var2.b.o(point);
            }
        }
        j63 j63Var = new j63(linkedHashMap.keySet());
        j63Var.removeAll(w53Var2.keySet());
        r53 r53Var = new r53(j63Var);
        while (r53Var.hasNext()) {
            String str = (String) r53Var.next();
            zzs zzsVar2 = (zzs) linkedHashMap.get(str);
            if (zzsVar2 != null) {
                Polyline polyline2 = ru.yandex.taxi.map.utils.a.b;
                Point point2 = new Point(zzsVar2.a, zzsVar2.b);
                f4c0 f4c0Var2 = new f4c0(point2, null, 6);
                f4c0Var2.k(3.0f);
                xm00 xm00Var = this.x;
                xm00Var.getClass();
                f4c0Var2.b(xm00Var);
                f4c0Var2.y(this.z);
                f4c0 f4c0Var3 = new f4c0(point2, null, 6);
                f4c0Var3.k(13.0f);
                f4c0Var3.b(xm00Var);
                xqx xqxVar = this.A;
                xqxVar.d(str);
                f4c0Var3.y(ImageProvider.fromBitmap(xqxVar.b()));
                f4c0Var3.D(new IconStyle().setAnchor(xqxVar.a()));
                rud0 rud0Var3 = new rud0(f4c0Var2, f4c0Var3);
                f4c0Var3.g(this.C);
                w53Var2.put(str, rud0Var3);
            }
        }
    }
}
