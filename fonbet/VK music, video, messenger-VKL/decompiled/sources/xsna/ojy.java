package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.wjy;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class ojy implements izs {
    public final /* synthetic */ wjy.a b;

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str = (String) obj;
        this.b.j.invoke();
        boolean booleanValue = Boolean.TRUE.booleanValue();
        if (booleanValue) {
            return p2i0.c.a(str);
        }
        if (booleanValue) {
            throw new NoWhenBranchMatchedException();
        }
        return str;
    }
}
