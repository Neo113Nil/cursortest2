package defpackage;

import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.Point;

/* loaded from: classes13.dex */
public final class fg5 {
    public static BoundingBox a(uc4 uc4Var) {
        if (uc4Var == null) {
            return null;
        }
        zzs zzsVar = uc4Var.a;
        Point point = new Point(zzsVar.a, zzsVar.b);
        zzs zzsVar2 = uc4Var.b;
        return new BoundingBox(point, new Point(zzsVar2.a, zzsVar2.b));
    }
}
