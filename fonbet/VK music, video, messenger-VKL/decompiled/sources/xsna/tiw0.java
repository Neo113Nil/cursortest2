package xsna;

import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.yiw0;

/* compiled from: VoipCallServiceReducer.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class tiw0 extends FunctionReferenceImpl implements izs<yiw0.f, List<Object>> {
    @Override // xsna.izs
    public final List<Object> invoke(yiw0.f fVar) {
        yiw0.f fVar2 = fVar;
        ((viw0) this.receiver).getClass();
        if (epx.f(fVar2, yiw0.f.a.b)) {
            return Collections.singletonList(awh0.b);
        }
        if (!(fVar2 instanceof yiw0.f.b)) {
            throw new NoWhenBranchMatchedException();
        }
        ((yiw0.f.b) fVar2).getClass();
        throw null;
    }
}
