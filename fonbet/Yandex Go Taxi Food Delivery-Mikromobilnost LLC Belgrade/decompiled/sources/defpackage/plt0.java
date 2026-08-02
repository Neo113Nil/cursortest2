package defpackage;

import com.yandex.fintechsdk.core.telemetry.impl.sender.a;
import io.opentelemetry.proto2.common.v1.InstrumentationScope;
import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public final class plt0 {
    public final a a;
    public final InstrumentationScope b = (InstrumentationScope) InstrumentationScope.newBuilder().setName("fintech-sdk").build();
    public final i3y c;

    public plt0(LinkedHashMap linkedHashMap, String str, wls wlsVar) {
        this.a = new a(str, wlsVar);
        this.c = kotlin.a.a(new nlt0(linkedHashMap, 1));
    }
}
