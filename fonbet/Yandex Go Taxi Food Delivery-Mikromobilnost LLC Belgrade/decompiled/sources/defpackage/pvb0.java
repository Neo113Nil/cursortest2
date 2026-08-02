package defpackage;

import android.graphics.PointF;
import com.yandex.mapkit.map.MapWindow;
import com.yandex.mapkit.maps.core.utils.SizeInt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ru.yandex.yandexmaps.multiplatform.pin.war.internal.cache.PinCacheMode;
import ru.yandex.yandexmaps.multiplatform.pin.war.internal.collider.PinCollider$PlacedLabel;

/* loaded from: classes7.dex */
public abstract class pvb0 {
    public final fcj0 a;
    public final qub0 b;
    public final int c;
    public final wub0 d;
    public final wub0 e;
    public final wub0 f;
    public final wub0 g;
    public final SizeInt h;

    public pvb0(exb0 exb0Var, fcj0 fcj0Var, qub0 qub0Var, y1c0 y1c0Var, ewi ewiVar) {
        this.a = fcj0Var;
        this.b = qub0Var;
        this.c = ua91.a(3, ewiVar);
        PinCacheMode pinCacheMode = PinCacheMode.PERMANENT;
        this.d = exb0Var.a(pinCacheMode);
        this.e = exb0Var.a(pinCacheMode);
        this.f = exb0Var.a(pinCacheMode);
        this.g = exb0Var.a(pinCacheMode);
        MapWindow mapWindow = y1c0Var.a;
        this.h = new SizeInt(mapWindow.width(), mapWindow.height());
    }

    public final jvb0 a(qzb0 qzb0Var, boolean z) {
        mwb0 mwb0Var = qzb0Var.a;
        Map map = (Map) this.d.b.get(mwb0Var);
        if (map == null) {
            map = new LinkedHashMap();
        }
        Map map2 = (Map) this.e.b.get(mwb0Var);
        if (map2 == null) {
            map2 = new LinkedHashMap();
        }
        PointF d = this.a.d(qzb0Var);
        if (d == null) {
            return null;
        }
        PinCollider$PlacedLabel pinCollider$PlacedLabel = (PinCollider$PlacedLabel) this.g.b.get(mwb0Var);
        if (pinCollider$PlacedLabel == null) {
            pinCollider$PlacedLabel = PinCollider$PlacedLabel.NONE;
        }
        return new jvb0(qzb0Var, map, map2, z, d, pinCollider$PlacedLabel, (c3c0) this.f.b.get(mwb0Var), this.b);
    }

    public void b(ArrayList arrayList, List list, Set set) {
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            jvb0 jvb0Var = null;
            if (i < 0) {
                scc.m();
                throw null;
            }
            jvb0 jvb0Var2 = (jvb0) obj;
            if (jvb0Var2.f == PinCollider$PlacedLabel.LABEL_S) {
                Iterator it = arrayList.subList(i2, arrayList.size()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        jvb0 jvb0Var3 = (jvb0) it.next();
                        if (jvb0Var3.f == PinCollider$PlacedLabel.LABEL_M && ul91.g(jvb0Var2, PinCollider$PlacedLabel.LABEL_S, jvb0Var3)) {
                            if (jvb0Var != null) {
                                jvb0Var2.f = PinCollider$PlacedLabel.NONE;
                                break;
                            }
                            jvb0Var = jvb0Var3;
                        }
                    } else if (jvb0Var != null) {
                        jvb0Var.f = PinCollider$PlacedLabel.LABEL_S;
                    }
                }
            }
            i = i2;
        }
    }

    public void c(ArrayList arrayList, List list, Set set) {
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            jvb0 jvb0Var = (jvb0) obj;
            if (jvb0Var.f == PinCollider$PlacedLabel.LABEL_M) {
                List subList = arrayList.subList(i2, arrayList.size());
                if (!(subList instanceof Collection) || !subList.isEmpty()) {
                    Iterator it = subList.iterator();
                    while (it.hasNext()) {
                        if (ul91.g(jvb0Var, PinCollider$PlacedLabel.LABEL_M, (jvb0) it.next())) {
                            break;
                        }
                    }
                }
                if (!ul91.i(jvb0Var, PinCollider$PlacedLabel.LABEL_M, jvb0Var.g, list)) {
                }
                jvb0Var.f = PinCollider$PlacedLabel.LABEL_S;
            }
            i = i2;
        }
    }

    public final void d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jvb0 jvb0Var = (jvb0) it.next();
            mwb0 mwb0Var = jvb0Var.a.a;
            this.d.b(mwb0Var, jvb0Var.b);
            this.e.b(mwb0Var, jvb0Var.c);
            this.g.b(mwb0Var, jvb0Var.f);
            c3c0 c3c0Var = jvb0Var.g;
            if (c3c0Var != null) {
                this.f.b(mwb0Var, c3c0Var);
            }
        }
    }
}
