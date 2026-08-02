package defpackage;

import com.yandex.payment.sdk.ui.DefaultTheme;
import com.yandex.xplat.payment.sdk.XTheme;

/* loaded from: classes2.dex */
public final class iwy0 implements od51 {
    @Override // defpackage.od51
    public final XTheme getTheme() {
        cvy0 cvy0Var = ckt.a;
        if (cvy0Var != DefaultTheme.LIGHT && cvy0Var == DefaultTheme.DARK) {
            return XTheme.dark;
        }
        return XTheme.light;
    }
}
