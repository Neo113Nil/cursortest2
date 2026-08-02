package xsna;

import com.vk.network.proxy.data.model.VkProxyNetwork;
import com.vk.stat.model.builders.aggregate.AggregateEventBuilder;
import com.vk.stat.model.builders.aggregate.AggregateEventKey;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class urd0 implements io.reactivex.rxjava3.functions.c {
    public static int a(int i, int i2, String str) {
        return (str.hashCode() + i) * i2;
    }

    public static void b(xw90 xw90Var) {
        String a = xw90Var.a();
        String b = xw90Var.b();
        long c = xw90Var.c();
        long d = xw90Var.d();
        long e = xw90Var.e();
        int f = xw90Var.f();
        int g = xw90Var.g();
        int h = xw90Var.h();
        float i = xw90Var.i();
        AggregateEventBuilder aggregateEventBuilder = new AggregateEventBuilder(AggregateEventKey.TECH_SCORE);
        aggregateEventBuilder.w(2, a);
        aggregateEventBuilder.w(3, b);
        aggregateEventBuilder.v(0, (int) c);
        aggregateEventBuilder.v(1, (int) d);
        aggregateEventBuilder.v(2, (int) e);
        aggregateEventBuilder.v(3, f);
        aggregateEventBuilder.v(4, g);
        aggregateEventBuilder.v(5, h);
        aggregateEventBuilder.w(4, String.valueOf(i));
        aggregateEventBuilder.q();
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (VkProxyNetwork) obj2;
    }
}
