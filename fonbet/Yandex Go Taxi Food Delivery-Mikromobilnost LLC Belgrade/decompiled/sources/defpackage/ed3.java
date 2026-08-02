package defpackage;

import com.yandex.go.taxi.order.models.api.response.AttributedItem$AttributedImageItem;
import com.yandex.go.taxi.order.models.api.response.AttributedItem$AttributedTextItem;
import com.yandex.go.taxi.order.models.api.response.n;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes14.dex */
public final class ed3 extends xqt {
    public static final ed3 e = new ed3();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, n.INSTANCE.serializer(), qoi0.a(n.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("image", AttributedItem$AttributedImageItem.Companion.serializer(), qoi0.a(AttributedItem$AttributedImageItem.class)), new f9("text", AttributedItem$AttributedTextItem.Companion.serializer(), qoi0.a(AttributedItem$AttributedTextItem.class)));
    }
}
