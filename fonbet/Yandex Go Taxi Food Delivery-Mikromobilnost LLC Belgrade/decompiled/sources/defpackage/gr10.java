package defpackage;

import com.ybsdk.core.utils.text.Text;

/* loaded from: classes3.dex */
public final class gr10 implements ev31 {
    @Override // defpackage.ev31
    public final Object q(Object obj) {
        u8j0 u8j0Var = ((er10) obj).a;
        boolean z = u8j0Var instanceof r8j0;
        qtz0 qtz0Var = qtz0.a;
        if (z) {
            return new fr10(new stz0(new Text.Resource(dzh0.ybsdk_common_shops_title), null, null, null, null, qtz0Var, false, null, null, null, null, null, 32734), ((cr10) ((r8j0) u8j0Var).a).a, null, 12);
        }
        if (u8j0Var instanceof s8j0) {
            return new fr10(new stz0(Text.Empty.INSTANCE, null, null, null, null, qtz0Var, false, null, null, null, null, null, 32734), null, r501.a(((s8j0) u8j0Var).a, null, null, null, null, null, null, null, null, null, null, null, null, 65534), 10);
        }
        if (u8j0Var instanceof t8j0) {
            return new fr10(new stz0(new Text.Resource(dzh0.ybsdk_common_shops_title), null, null, null, null, qtz0Var, false, null, null, null, null, null, 32734), null, null, 6);
        }
        w511.b();
        return null;
    }
}
