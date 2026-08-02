package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public final class muw0 extends xqt {
    public static final muw0 e = new muw0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, kuw0.INSTANCE.serializer(), qoi0.a(kuw0.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("text", juw0.Companion.serializer(), qoi0.a(juw0.class)), new f9("selector", duw0.Companion.serializer(), qoi0.a(duw0.class)), new f9("icon", guw0.Companion.serializer(), qoi0.a(guw0.class)));
    }
}
