package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes9.dex */
public final class c9r extends xqt {
    public static final c9r e = new c9r();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, p9r.INSTANCE.serializer(), qoi0.a(p9r.class));
    }

    @Override // defpackage.h9
    public final String e() {
        return "name";
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("altimeter", j8r.Companion.serializer(), qoi0.a(j8r.class)), new f9("magnetometer", f9r.Companion.serializer(), qoi0.a(f9r.class)), new f9("motion", m9r.Companion.serializer(), qoi0.a(m9r.class)), new f9("activity", g8r.Companion.serializer(), qoi0.a(g8r.class)), new f9("battery", m8r.Companion.serializer(), qoi0.a(m8r.class)), new f9("gnss", z8r.Companion.serializer(), qoi0.a(z8r.class)));
    }
}
