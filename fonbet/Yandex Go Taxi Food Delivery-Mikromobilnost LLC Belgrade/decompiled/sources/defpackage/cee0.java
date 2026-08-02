package defpackage;

import com.yandex.go.shortcuts.dto.response.AnchoredPosition;
import com.yandex.go.shortcuts.dto.response.c3;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes13.dex */
public final class cee0 extends xqt {
    public static final cee0 e = new cee0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, c3.INSTANCE.serializer(), qoi0.a(c3.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("anchored", AnchoredPosition.Companion.serializer(), qoi0.a(AnchoredPosition.class)));
    }
}
