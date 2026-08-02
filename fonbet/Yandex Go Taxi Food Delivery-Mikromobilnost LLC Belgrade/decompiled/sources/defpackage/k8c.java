package defpackage;

import com.yandex.go.places.map.ui.b;
import com.yandex.mapkit.map.Map;
import com.yandex.mapkit.map.VisibleRegion;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class k8c {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public k8c(Map map) {
        this.a = 1;
        this.c = map;
        this.b = new LinkedHashMap();
    }

    public final q1c0 a() {
        switch (this.a) {
            case 0:
                return (l8c) this.b;
            default:
                return new yj70((Map) this.c);
        }
    }

    public final j2c0 b() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                return (j2c0) obj;
            default:
                VisibleRegion visibleRegion = ((Map) obj).getVisibleRegion();
                return new k2c0(b.b(visibleRegion.getTopLeft()), b.b(visibleRegion.getTopRight()), b.b(visibleRegion.getBottomLeft()), b.b(visibleRegion.getBottomRight()));
        }
    }

    public k8c(l8c l8cVar, j2c0 j2c0Var) {
        this.a = 0;
        this.b = l8cVar;
        this.c = j2c0Var;
    }
}
