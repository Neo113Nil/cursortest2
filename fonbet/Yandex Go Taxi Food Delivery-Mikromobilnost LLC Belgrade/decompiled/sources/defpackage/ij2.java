package defpackage;

import com.yandex.go.shortcuts.dto.response.LottieAnimation;
import com.yandex.go.shortcuts.dto.response.StaticImage;
import com.yandex.go.shortcuts.dto.response.d3;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes13.dex */
public final class ij2 extends xqt {
    public static final ij2 e = new ij2();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, d3.INSTANCE.serializer(), qoi0.a(d3.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("animation", LottieAnimation.Companion.serializer(), qoi0.a(LottieAnimation.class)), new f9("image", StaticImage.Companion.serializer(), qoi0.a(StaticImage.class)));
    }
}
