package yads;

import java.util.Iterator;
import kotlin.jvm.internal.Lambda;
import xsna.c9y;
import xsna.izs;
import xsna.m8y;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class r7 extends Lambda implements izs {
    public final /* synthetic */ f8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(f8 f8Var) {
        super(1);
        this.b = f8Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        m8y m8yVar = (m8y) obj;
        Iterator it = this.b.g.iterator();
        while (it.hasNext()) {
            m8yVar.a.add(c9y.b((String) it.next()));
        }
        return s3q0.a;
    }
}
