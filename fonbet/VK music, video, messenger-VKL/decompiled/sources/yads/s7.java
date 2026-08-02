package yads;

import java.util.Map;
import kotlin.jvm.internal.Lambda;
import xsna.alk;
import xsna.c9y;
import xsna.izs;
import xsna.s3q0;
import xsna.y9y;

/* loaded from: classes10.dex */
public final class s7 extends Lambda implements izs {
    public final /* synthetic */ Map.Entry b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(Map.Entry entry) {
        super(1);
        this.b = entry;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        y9y y9yVar = (y9y) obj;
        y9yVar.b("usagePercent", c9y.a(Integer.valueOf(((h8) this.b.getValue()).a)));
        alk.t(y9yVar, "isDisabled", Boolean.valueOf(((h8) this.b.getValue()).b));
        return s3q0.a;
    }
}
