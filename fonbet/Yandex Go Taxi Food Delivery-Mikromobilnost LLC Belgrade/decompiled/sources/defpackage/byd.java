package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public final class byd extends xqt {
    public static final byd e = new byd();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, s121.INSTANCE.serializer(), qoi0.a(s121.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("to_taxi", vjz0.INSTANCE.serializer(), qoi0.a(vjz0.class)), new f9("change_to_unwhitelisted_tariff", ah9.Companion.serializer(), qoi0.a(ah9.class)), new f9("always_true", r02.INSTANCE.serializer(), qoi0.a(r02.class)), new f9("no_whitelisted_requirements", td60.Companion.serializer(), qoi0.a(td60.class)), new f9("has_whitelisted_requirements", g8u.Companion.serializer(), qoi0.a(g8u.class)));
    }
}
