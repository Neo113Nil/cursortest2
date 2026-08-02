package defpackage;

import com.yandex.go.superapp.tracking.models.dto.ImageDto$Tag;
import com.yandex.go.superapp.tracking.models.dto.ImageDto$Url;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes14.dex */
public final class p9v extends wqt {
    public static final p9v e = new p9v();

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("url", ImageDto$Url.Companion.serializer(), qoi0.a(ImageDto$Url.class)), new f9("tag", ImageDto$Tag.Companion.serializer(), qoi0.a(ImageDto$Tag.class)));
    }
}
