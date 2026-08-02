package defpackage;

import com.yandex.go.taxi.order.map_objects.a;
import com.yandex.go.taxi.order.models.api.objects.AltpinCardInfo;
import com.yandex.go.taxi.order.models.api.objects.AltpinCardItemDto$ActionButtons;
import com.yandex.go.taxi.order.models.api.objects.MapObject;
import com.yandex.go.taxi.order.models.api.objects.MapObjectAction$OpenPointAAlternative;
import com.yandex.go.taxi.order.models.api.objects.a0;
import com.yandex.go.taxi.order.models.api.objects.b0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes14.dex */
public final class b080 {
    public final tt2 a;
    public final o2y0 b;
    public final a c;
    public final zz70 d;

    public b080(tt2 tt2Var, o2y0 o2y0Var, a aVar, zz70 zz70Var) {
        this.a = tt2Var;
        this.b = o2y0Var;
        this.c = aVar;
        this.d = zz70Var;
    }

    public static final boolean a(b080 b080Var, MapObject mapObject) {
        List list;
        b080Var.getClass();
        b0 b0Var = mapObject.f;
        if (b0Var != null) {
            if (b0Var instanceof MapObjectAction$OpenPointAAlternative) {
                AltpinCardInfo altpinCardInfo = ((MapObjectAction$OpenPointAAlternative) b0Var).a;
                List list2 = altpinCardInfo.b;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list2) {
                    if (obj instanceof AltpinCardItemDto$ActionButtons) {
                        arrayList.add(obj);
                    }
                }
                AltpinCardItemDto$ActionButtons altpinCardItemDto$ActionButtons = (AltpinCardItemDto$ActionButtons) kotlin.collections.a.S(0, arrayList);
                if (altpinCardItemDto$ActionButtons == null || (list = altpinCardItemDto$ActionButtons.a) == null) {
                    list = EmptyList.a;
                }
                if (!altpinCardInfo.b.isEmpty() && list.size() == 2) {
                    return true;
                }
            } else if (!jl40.l(b0Var, a0.INSTANCE)) {
                w511.b();
            }
        }
        return false;
    }
}
