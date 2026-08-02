package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes5.dex */
public final class km6 extends xqt {
    public static final km6 e = new km6();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, r121.INSTANCE.serializer(), qoi0.a(r121.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("text", nm6.Companion.serializer(), qoi0.a(nm6.class)), new f9("image", jm6.Companion.serializer(), qoi0.a(jm6.class)), new f9("icon", gm6.Companion.serializer(), qoi0.a(gm6.class)), new f9("composite", dm6.Companion.serializer(), qoi0.a(dm6.class)), new f9("attributed_text", am6.Companion.serializer(), qoi0.a(am6.class)));
    }
}
