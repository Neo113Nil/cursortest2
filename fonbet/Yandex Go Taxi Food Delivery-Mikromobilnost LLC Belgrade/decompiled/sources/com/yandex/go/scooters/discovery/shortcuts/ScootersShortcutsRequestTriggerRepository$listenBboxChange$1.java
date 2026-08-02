package com.yandex.go.scooters.discovery.shortcuts;

import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import defpackage.uc4;
import defpackage.xvo0;
import defpackage.zls;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class ScootersShortcutsRequestTriggerRepository$listenBboxChange$1 extends AdaptedFunctionReference implements zls {
    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        uc4 uc4Var = (uc4) obj;
        uc4 uc4Var2 = (uc4) obj2;
        ((xvo0) this.receiver).getClass();
        if (uc4Var == null) {
            return uc4Var2;
        }
        Polyline polyline = ru.yandex.taxi.map.utils.a.b;
        zzs zzsVar = uc4Var2.a;
        Point point = new Point(zzsVar.a, zzsVar.b);
        zzs zzsVar2 = uc4Var2.b;
        BoundingBox boundingBox = new BoundingBox(point, new Point(zzsVar2.a, zzsVar2.b));
        zzs zzsVar3 = uc4Var.a;
        Point point2 = new Point(zzsVar3.a, zzsVar3.b);
        zzs zzsVar4 = uc4Var.b;
        if (ru.yandex.taxi.map.utils.a.s(boundingBox, new BoundingBox(point2, new Point(zzsVar4.a, zzsVar4.b)))) {
            return null;
        }
        return uc4Var2;
    }
}
