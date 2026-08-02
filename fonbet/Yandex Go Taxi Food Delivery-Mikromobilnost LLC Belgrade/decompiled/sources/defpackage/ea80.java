package defpackage;

import java.util.function.IntConsumer;
import ru.yandex.taxi.order.view.OrderView;

/* loaded from: classes14.dex */
public final /* synthetic */ class ea80 implements IntConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ea80(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                OrderView.defaultUpdateArrowStrategy$lambda$0((OrderView) obj, i);
                break;
            case 1:
                OrderView.searchProgressUpdateArrowStrategy$lambda$0((OrderView) obj, i);
                break;
            case 2:
                OrderView.redesignUpdateStrategy$lambda$0((OrderView) obj, i);
                break;
            default:
                ((idl0) obj).F.g(Integer.valueOf(i));
                break;
        }
    }
}
