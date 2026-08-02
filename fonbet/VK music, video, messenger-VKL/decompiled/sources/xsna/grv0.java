package xsna;

/* compiled from: VkTextStyle.kt */
/* loaded from: classes17.dex */
public final class grv0 {
    public static final pqo a = new pqo(new ifv0(1));

    public static final void a(frv0 frv0Var, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(22380352);
        int i2 = (M.J(frv0Var) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(22380352, i2, -1, "com.vk.core.compose.theme.text.ProvideVkTextStyle (VkTextStyle.kt:56)");
            }
            pqo pqoVar = a;
            frv0 a2 = ((frv0) M.r(pqoVar)).a(frv0Var);
            rvi.b(new c9e0[]{pqoVar.b(a2), djo0.a.b(a2.a)}, jaiVar, M, 56);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new a73(frv0Var, jaiVar, i, 8);
        }
    }
}
