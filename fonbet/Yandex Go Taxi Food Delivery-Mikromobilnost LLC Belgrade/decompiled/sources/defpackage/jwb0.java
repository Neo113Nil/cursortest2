package defpackage;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.PinIconAnnotationDto$TopLeadingAnnotation;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.j1;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes14.dex */
public final class jwb0 extends xqt {
    public static final jwb0 e = new jwb0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, j1.INSTANCE.serializer(), qoi0.a(j1.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("top_leading_annotation", PinIconAnnotationDto$TopLeadingAnnotation.Companion.serializer(), qoi0.a(PinIconAnnotationDto$TopLeadingAnnotation.class)));
    }
}
