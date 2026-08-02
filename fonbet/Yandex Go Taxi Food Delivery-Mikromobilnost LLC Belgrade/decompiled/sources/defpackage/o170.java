package defpackage;

import com.yandex.go.shortcuts.dto.response.MediaStories;
import com.yandex.go.shortcuts.dto.response.a3;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes13.dex */
public final class o170 extends xqt {
    public static final o170 e = new o170();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, a3.INSTANCE.serializer(), qoi0.a(a3.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("media-stories", MediaStories.Companion.serializer(), qoi0.a(MediaStories.class)));
    }
}
