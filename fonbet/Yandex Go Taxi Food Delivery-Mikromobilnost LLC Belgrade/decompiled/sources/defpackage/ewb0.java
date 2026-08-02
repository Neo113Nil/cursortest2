package defpackage;

import com.yandex.go.pin.api.v1.PinV1Component;
import com.yandex.go.pin.api.v2.PinV2Component;

/* loaded from: classes8.dex */
public final class ewb0 {
    public final PinV1Component a;
    public final PinV2Component b;

    static {
        int i = PinV2Component.$stable;
        int i2 = PinV1Component.$stable;
    }

    public ewb0(PinV1Component pinV1Component, PinV2Component pinV2Component) {
        this.a = pinV1Component;
        this.b = pinV2Component;
    }

    public ewb0() {
        this(null, null);
    }
}
