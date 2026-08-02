package defpackage;

import com.yandex.go.shortcuts.dto.response.ArrowSectionWidget;
import com.yandex.go.shortcuts.dto.response.g3;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes13.dex */
public final class h5q0 extends xqt {
    public static final h5q0 e = new h5q0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, ArrowSectionWidget.Companion.serializer(), qoi0.a(ArrowSectionWidget.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("UNSUPPORTED", g3.INSTANCE.serializer(), qoi0.a(g3.class)), new f9("arrow_button", ArrowSectionWidget.Companion.serializer(), qoi0.a(ArrowSectionWidget.class)));
    }
}
