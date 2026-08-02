package xsna;

import com.vk.voip.ui.whiteboard.presentation.main.ui.b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.qlx0;

/* compiled from: WhiteboardReducer.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class wlx0 extends FunctionReferenceImpl implements izs<qlx0, b.InterfaceC2093b> {
    @Override // xsna.izs
    public final b.InterfaceC2093b invoke(qlx0 qlx0Var) {
        ((xlx0) this.receiver).getClass();
        qlx0.a aVar = qlx0Var.e;
        if (epx.f(aVar, qlx0.a.C3565a.a)) {
            return b.InterfaceC2093b.a.a;
        }
        if (aVar instanceof qlx0.a.c) {
            return new b.InterfaceC2093b.c(((qlx0.a.c) aVar).a);
        }
        if (aVar instanceof qlx0.a.b) {
            return new b.InterfaceC2093b.C2094b(((qlx0.a.b) aVar).a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
