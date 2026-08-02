package defpackage;

import com.yandex.go.overdraft.data.model.AutoAction$OpenUrlAction;
import com.yandex.go.overdraft.data.model.d;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes13.dex */
public final class dp3 extends xqt {
    public static final dp3 e = new dp3();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, d.INSTANCE.serializer(), qoi0.a(d.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("open_url", AutoAction$OpenUrlAction.Companion.serializer(), qoi0.a(AutoAction$OpenUrlAction.class)));
    }
}
