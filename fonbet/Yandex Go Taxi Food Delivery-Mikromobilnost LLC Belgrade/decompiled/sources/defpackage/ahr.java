package defpackage;

import com.yandex.div.state.db.StateEntry;
import com.yandex.feedsdk.di.FeedSdkComponent;
import flex.engine.a;
import java.util.Map;
import kotlin.collections.b;

/* loaded from: classes2.dex */
public interface ahr {
    static void a(ahr ahrVar, Map map) {
        Map f = b.f();
        com.yandex.payment.sdk.flex.impl.b bVar = (com.yandex.payment.sdk.flex.impl.b) ahrVar;
        a engine = ((FeedSdkComponent) ((com.yandex.payment.sdk.flex.impl.a) bVar.a.getValue()).a.getValue()).getEngine();
        hx hxVar = new hx(f, "v2/transport/decide_next_action", map);
        bhr bhrVar = bVar.f;
        if (bhrVar == null) {
            bhrVar = null;
        }
        bhrVar.e.a(new kir("transport_fail_to_dispatch_action", g8e.z(StateEntry.COLUMN_PATH, "v2/transport/decide_next_action")));
        ((wu) s8o.W(engine, engine.G)).b(new kui0(hxVar), new pxl(new cnr0(b.f())), b.f());
    }
}
