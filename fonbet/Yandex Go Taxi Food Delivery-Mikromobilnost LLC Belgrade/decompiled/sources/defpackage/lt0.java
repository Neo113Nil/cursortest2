package defpackage;

import com.yandex.messaging.internal.entities.Suggest;
import com.yandex.messaging.internal.view.timeline.c0;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;
import ru.yandex.logistics.sdk.cargo_form.impl.address_details.domain.c;

/* loaded from: classes15.dex */
public final /* synthetic */ class lt0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ lt0(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.w = obj2;
        this.x = obj3;
        this.b = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj = this.x;
        Object obj2 = this.w;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                c cVar = (c) obj3;
                String str = (String) obj2;
                Map map = (Map) obj;
                MapBuilder mapBuilder = new MapBuilder();
                if (map != null) {
                    mapBuilder.putAll(map);
                }
                int i2 = this.b;
                if (i2 != 0) {
                    mapBuilder.put("point_b_index", Integer.valueOf(i2));
                }
                cVar.g(str, "AddFile", mapBuilder.j());
                break;
            default:
                c0 c0Var = (c0) obj3;
                c0Var.b((Suggest) obj2, false, (tu10) obj, null, this.b, (acb) c0Var.l.getValue());
                break;
        }
        return zy11Var;
    }
}
