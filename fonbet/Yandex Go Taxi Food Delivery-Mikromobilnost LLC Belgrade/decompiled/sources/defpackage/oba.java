package defpackage;

import com.yandex.go.chargers.feedback.data.ChargersOrderDetailDto$TitleValue;
import com.yandex.go.chargers.feedback.data.u;
import com.yandex.go.chargers.feedback.data.w;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public final class oba extends xqt {
    public static final oba e = new oba();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, w.INSTANCE.serializer(), qoi0.a(w.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("title_value", ChargersOrderDetailDto$TitleValue.Companion.serializer(), qoi0.a(ChargersOrderDetailDto$TitleValue.class)), new f9("divider", u.INSTANCE.serializer(), qoi0.a(u.class)));
    }
}
