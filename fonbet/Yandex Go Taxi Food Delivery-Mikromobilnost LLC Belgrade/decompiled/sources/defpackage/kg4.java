package defpackage;

import com.yandex.go.shortcuts.dto.response.BackgroundAnimation$PulseCirclesAnimation;
import com.yandex.go.shortcuts.dto.response.k;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes13.dex */
public final class kg4 extends xqt {
    public static final kg4 e = new kg4();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, k.INSTANCE.serializer(), qoi0.a(k.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("pulse_circles", BackgroundAnimation$PulseCirclesAnimation.Companion.serializer(), qoi0.a(BackgroundAnimation$PulseCirclesAnimation.class)));
    }
}
