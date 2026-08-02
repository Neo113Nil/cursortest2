package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes5.dex */
public final class lrk0 extends xqt {
    public static final lrk0 e = new lrk0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, drk0.INSTANCE.serializer(), qoi0.a(drk0.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("saved_ride", grk0.Companion.serializer(), qoi0.a(grk0.class)), new f9("suggested_ride", jrk0.Companion.serializer(), qoi0.a(jrk0.class)), new f9("info", crk0.Companion.serializer(), qoi0.a(crk0.class)));
    }
}
