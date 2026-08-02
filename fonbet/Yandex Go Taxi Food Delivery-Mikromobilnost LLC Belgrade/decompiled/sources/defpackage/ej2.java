package defpackage;

import com.yandex.go.shortcuts.dto.response.LocalAnimation;
import com.yandex.go.shortcuts.dto.response.RemoteAnimation;
import com.yandex.go.shortcuts.dto.response.b3;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes13.dex */
public final class ej2 extends xqt {
    public static final ej2 e = new ej2();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, b3.INSTANCE.serializer(), qoi0.a(b3.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("local", LocalAnimation.Companion.serializer(), qoi0.a(LocalAnimation.class)), new f9("remote", RemoteAnimation.Companion.serializer(), qoi0.a(RemoteAnimation.class)));
    }
}
