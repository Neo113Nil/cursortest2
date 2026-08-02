package xsna;

import com.vk.clips.internal.nps.api.model.InternalNpsQuestion;
import com.vk.clips.internal.nps.api.model.InternalNpsQuestionValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bm70;
import xsna.n0x;

/* compiled from: ClipItemNpsOverlayMapper.kt */
/* loaded from: classes17.dex */
public final class u1d extends oy8<am70, bm70> {
    @Override // xsna.oy8
    public final bm70 b(am70 am70Var) {
        am70 am70Var2 = am70Var;
        String str = am70Var2.b;
        if (!am70Var2.a) {
            return new bm70.a(str);
        }
        n0x n0xVar = am70Var2.d;
        if (!(n0xVar instanceof n0x.b)) {
            return n0xVar instanceof n0x.c ? new bm70.b.C2614b(str) : new bm70.a(str);
        }
        InternalNpsQuestion internalNpsQuestion = ((n0x.b) n0xVar).b;
        List<InternalNpsQuestionValue> list = internalNpsQuestion.e;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new bm70.b.a.C2613a(((InternalNpsQuestionValue) it.next()).c));
        }
        return new bm70.b.a(str, am70Var2.c, internalNpsQuestion.d.b, arrayList);
    }
}
