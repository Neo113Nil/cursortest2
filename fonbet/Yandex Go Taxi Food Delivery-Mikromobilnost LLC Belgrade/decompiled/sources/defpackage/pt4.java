package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes9.dex */
public final class pt4 extends xqt {
    public static final pt4 e = new pt4();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, ut4.INSTANCE.serializer(), qoi0.a(ut4.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("copy_to_clipboard", ot4.Companion.serializer(), qoi0.a(ot4.class)), new f9("show_notification", st4.Companion.serializer(), qoi0.a(st4.class)));
    }
}
