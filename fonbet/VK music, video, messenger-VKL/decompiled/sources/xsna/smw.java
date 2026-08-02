package xsna;

import com.vk.dto.common.Image;
import java.util.Collections;
import java.util.List;
import xsna.rmw;

/* compiled from: ImageViewState.kt */
/* loaded from: classes2.dex */
public final class smw {
    public static final rmw.d a(int i) {
        return new rmw.d(i);
    }

    public static final rmw.f b(Image image, float f) {
        return new rmw.f(image, f);
    }

    public static final rmw.g c(com.vk.dto.common.im.Image image) {
        return new rmw.g(Collections.singletonList(image));
    }

    public static final rmw.g d(List list) {
        return new rmw.g(list);
    }

    public static final rmw.h e(String str) {
        return new rmw.h(str);
    }

    public static rmw.f f(Image image) {
        return new rmw.f(image, 1.0f);
    }
}
