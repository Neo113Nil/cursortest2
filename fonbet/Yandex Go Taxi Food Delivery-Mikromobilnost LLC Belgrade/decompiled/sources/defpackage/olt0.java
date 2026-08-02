package defpackage;

import com.yandex.paymentsdk.opentelemetry.sender.a;
import io.opentelemetry.proto.common.v1.InstrumentationScope;
import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public final class olt0 {
    public final a a;
    public final InstrumentationScope b = (InstrumentationScope) InstrumentationScope.newBuilder().setName("payment-sdk").build();
    public final i3y c;

    public olt0(LinkedHashMap linkedHashMap, String str, wls wlsVar) {
        this.a = new a(str, wlsVar);
        this.c = kotlin.a.a(new nlt0(linkedHashMap, 0));
    }
}
