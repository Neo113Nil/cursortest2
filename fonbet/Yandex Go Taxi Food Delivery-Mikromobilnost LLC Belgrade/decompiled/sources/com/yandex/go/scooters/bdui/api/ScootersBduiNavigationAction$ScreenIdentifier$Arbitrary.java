package com.yandex.go.scooters.bdui.api;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.n0n0;
import defpackage.qje;
import defpackage.vnm0;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/scooters/bdui/api/ScootersBduiNavigationAction$ScreenIdentifier$Arbitrary", "Ln0n0;", "Companion", "$serializer", "com/yandex/go/scooters/bdui/api/b", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersBduiNavigationAction$ScreenIdentifier$Arbitrary implements n0n0 {
    public static final b Companion = new b();
    public static final i3y[] c;
    public final Map a;
    public final Map b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new vnm0(26)), kotlin.a.b(lazyThreadSafetyMode, new vnm0(27))};
    }

    public /* synthetic */ ScootersBduiNavigationAction$ScreenIdentifier$Arbitrary(int i, Map map, Map map2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, ScootersBduiNavigationAction$ScreenIdentifier$Arbitrary$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = map;
        this.b = map2;
    }
}
