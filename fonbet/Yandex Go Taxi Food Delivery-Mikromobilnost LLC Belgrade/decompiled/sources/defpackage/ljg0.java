package defpackage;

import com.yandex.go.taxi.order.queue.analytics.QueueAnalytics$Action;
import com.yandex.go.taxi.order.queue.analytics.QueueAnalytics$Screen;
import kotlin.Pair;
import kotlin.collections.b;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes14.dex */
public final class ljg0 {
    public final lx4 a;

    public /* synthetic */ ljg0(lx4 lx4Var) {
        this.a = lx4Var;
    }

    public void a(QueueAnalytics$Action queueAnalytics$Action, QueueAnalytics$Screen queueAnalytics$Screen) {
        b("QueueOverlay.ButtonTapped", new Pair("action", queueAnalytics$Action.getAction()), new Pair(MetaDataField.SCREEN_FIELD, queueAnalytics$Screen.getScreen()));
    }

    public void b(String str, Pair... pairArr) {
        i d = ((j) this.a).d(str);
        d.h(b.u(pairArr));
        d.m();
    }
}
