package defpackage;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public final class ia7 extends xqt {
    public static final ia7 e = new ia7();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, ga7.INSTANCE.serializer(), qoi0.a(ga7.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9(AuthSdkActivity.RESPONSE_TYPE_CODE, ea7.Companion.serializer(), qoi0.a(ea7.class)));
    }
}
