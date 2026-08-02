package yads;

import java.util.UUID;
import kotlin.jvm.internal.Lambda;
import xsna.izs;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class jw0 extends Lambda implements izs {
    public final /* synthetic */ nw0 b;
    public final /* synthetic */ UUID c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jw0(nw0 nw0Var, UUID uuid) {
        super(1);
        this.b = nw0Var;
        this.c = uuid;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        dq2 dq2Var = (dq2) this.b.b.getValue();
        UUID uuid = this.c;
        dq2Var.getClass();
        if (uuid == null) {
            throw new IllegalArgumentException("Cannot cancelAll with a null tag");
        }
        dq2Var.a(new aq2(uuid));
        return s3q0.a;
    }
}
