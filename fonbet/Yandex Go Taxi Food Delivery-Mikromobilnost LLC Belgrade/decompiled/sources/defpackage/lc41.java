package defpackage;

import com.yandex.quark.js.QuarkJsState;
import com.yandex.quark.js.implementation.facade.PreferredDirectivePayloadFormat;
import com.yandex.quark.js.implementation.webView.internal.c;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.b;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class lc41 implements zhg0 {
    public final zwf0 a;
    public final c b;
    public final t830 c;
    public final PreferredDirectivePayloadFormat w;
    public final r0 x;
    public final d4h y;

    public lc41(zwf0 zwf0Var, c cVar, t830 t830Var, x2n x2nVar, PreferredDirectivePayloadFormat preferredDirectivePayloadFormat) {
        this.a = zwf0Var;
        this.b = cVar;
        this.c = t830Var;
        this.w = preferredDirectivePayloadFormat;
        r0 c = bvf0.c(b.f());
        this.x = c;
        this.y = new d4h(c, 3);
    }

    @Override // defpackage.zhg0
    public final synchronized void d(QuarkJsState quarkJsState) {
        try {
            int i = kc41.b[quarkJsState.ordinal()];
            if (i == 1 || i == 2) {
                r0 r0Var = this.x;
                Map f = b.f();
                r0Var.getClass();
                r0Var.m(null, f);
            } else if (i != 3 && i != 4) {
                throw new NoWhenBranchMatchedException();
            }
        } finally {
        }
    }
}
