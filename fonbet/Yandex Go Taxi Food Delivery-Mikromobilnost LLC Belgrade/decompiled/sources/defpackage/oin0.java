package defpackage;

import com.yandex.go.scooters.discovery.j;
import com.yandex.go.scooters.misc.attention.data.e;
import com.yandex.go.shortcuts.dto.response.ProductMode$Scooters;
import com.yandex.go.shortcuts.dto.response.ProductMode$Taxi;
import com.yandex.go.shortcuts.dto.response.y0;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes13.dex */
public final class oin0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;

    public /* synthetic */ oin0(j jVar, int i) {
        this.a = i;
        this.b = jVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        Object obj2;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        j jVar = this.b;
        switch (i) {
            case 0:
                dzm0 dzm0Var = jVar.F;
                Iterator it = ((ProductMode$Scooters) obj).c.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (((y0) obj2).a() == ProductMode$Taxi.AboveCardObjectType.ATTENTION) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                ProductMode$Taxi.AttentionAboveCardObject attentionAboveCardObject = obj2 instanceof ProductMode$Taxi.AttentionAboveCardObject ? (ProductMode$Taxi.AttentionAboveCardObject) obj2 : null;
                ((e) dzm0Var).d.g(attentionAboveCardObject != null ? attentionAboveCardObject.a : null);
                break;
            default:
                ((min0) jVar.Dg()).vf(((Boolean) obj).booleanValue());
                break;
        }
        return zy11Var;
    }
}
