package xsna;

import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ktw;
import xsna.qhu;

/* compiled from: GroupCallGridViewPager.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class mhu extends FunctionReferenceImpl implements izs<qhu.a, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(qhu.a aVar) {
        qhu.a aVar2 = aVar;
        ltw ltwVar = ((com.vk.voip.ui.groupcalls.grid.a) this.receiver).E;
        ltwVar.b = aVar2;
        Iterator it = ltwVar.a.iterator();
        while (it.hasNext()) {
            ((ktw.a) it.next()).I5(aVar2);
        }
        return s3q0.a;
    }
}
