package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes14.dex */
public final class lz7 extends xqt {
    public static final lz7 e = new lz7();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, mz7.INSTANCE.serializer(), qoi0.a(mz7.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("cancel_orders", iz7.INSTANCE.serializer(), qoi0.a(iz7.class)), new f9("do_nothing", kz7.INSTANCE.serializer(), qoi0.a(kz7.class)));
    }
}
