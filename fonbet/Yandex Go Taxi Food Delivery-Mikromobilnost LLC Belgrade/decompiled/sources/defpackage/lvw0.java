package defpackage;

import com.adjust.sdk.Constants;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public final class lvw0 extends xqt {
    public static final lvw0 e = new lvw0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, jvw0.INSTANCE.serializer(), qoi0.a(jvw0.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("close", evw0.INSTANCE.serializer(), qoi0.a(evw0.class)), new f9(Constants.DEEPLINK, ivw0.Companion.serializer(), qoi0.a(ivw0.class)));
    }
}
