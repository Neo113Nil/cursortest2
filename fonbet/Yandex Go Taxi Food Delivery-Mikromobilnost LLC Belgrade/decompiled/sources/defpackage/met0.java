package defpackage;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import ru.yandex.taxi.preorder.CameraAnimationUpdateType;

/* loaded from: classes6.dex */
public final /* synthetic */ class met0 implements BiConsumer {
    public final /* synthetic */ net0 a;
    public final /* synthetic */ Consumer b;

    public /* synthetic */ met0(net0 net0Var, Consumer consumer) {
        this.a = net0Var;
        this.b = consumer;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        this.a.j.b((CameraAnimationUpdateType) obj2);
        this.b.accept((Boolean) obj);
    }
}
