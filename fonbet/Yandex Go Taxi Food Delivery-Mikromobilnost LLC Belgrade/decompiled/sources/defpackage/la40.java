package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public final class la40 extends xqt {
    public static final la40 e = new la40();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, ma40.INSTANCE.serializer(), qoi0.a(ma40.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("notification", r7s0.Companion.serializer(), qoi0.a(r7s0.class)), new f9("modal", c7s0.Companion.serializer(), qoi0.a(c7s0.class)));
    }
}
