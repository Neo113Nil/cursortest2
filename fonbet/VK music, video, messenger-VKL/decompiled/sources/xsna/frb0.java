package xsna;

import com.vk.dto.uxpolls.PollAnswer;
import com.vk.dto.uxpolls.PollQuestion;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.trb0;
import xsna.xrb0;
import xsna.zqb0;

/* compiled from: PollReducer.kt */
/* loaded from: classes6.dex */
public final class frb0 extends dm50<ctb0, zqb0, trb0> {
    public final dtb0 d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public frb0(dtb0 dtb0Var) {
        super(new trb0.a(r2, 0, false, false));
        List<PollQuestion> list = dtb0Var.a.d;
        HashMap hashMap = new HashMap();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Integer valueOf = Integer.valueOf(((PollQuestion) it.next()).getId());
            if (hashMap.get(valueOf) == null) {
                hashMap.put(valueOf, new PollAnswer(null, null, 3, null));
            }
        }
        this.d = dtb0Var;
    }

    @Override // xsna.dm50
    public final trb0 c(trb0 trb0Var, zqb0 zqb0Var) {
        trb0 trb0Var2 = trb0Var;
        zqb0 zqb0Var2 = zqb0Var;
        if (!(trb0Var2 instanceof trb0.a)) {
            return trb0Var2;
        }
        if (zqb0Var2 instanceof zqb0.e) {
            trb0.a aVar = (trb0.a) trb0Var2;
            LinkedHashMap linkedHashMap = new LinkedHashMap(aVar.b);
            linkedHashMap.putAll(((zqb0.e) zqb0Var2).b.b);
            return trb0.a.a(aVar, linkedHashMap, 0, 14);
        }
        if (zqb0Var2.equals(zqb0.d.b)) {
            trb0.a aVar2 = (trb0.a) trb0Var2;
            return trb0.a.a(aVar2, null, aVar2.c + 1, 13);
        }
        if (zqb0Var2.equals(zqb0.c.b)) {
            return trb0.a.a((trb0.a) trb0Var2, null, 0, 7);
        }
        if (zqb0Var2.equals(zqb0.b.b)) {
            return trb0.a.a((trb0.a) trb0Var2, null, 0, 11);
        }
        if (zqb0Var2 instanceof yqb0) {
            trb0.a aVar3 = (trb0.a) trb0Var2;
            yqb0 yqb0Var = (yqb0) zqb0Var2;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(aVar3.b);
            PollAnswer pollAnswer = (PollAnswer) linkedHashMap2.get(Integer.valueOf(yqb0Var.h().n0()));
            if (pollAnswer != null) {
                linkedHashMap2.put(Integer.valueOf(yqb0Var.h().n0()), PollAnswer.a(pollAnswer, Collections.singletonList(Integer.valueOf(yqb0Var.b.c)), null, 2));
            }
            return trb0.a.a(aVar3, linkedHashMap2, 0, 14);
        }
        if (zqb0Var2 instanceof vqb0) {
            trb0.a aVar4 = (trb0.a) trb0Var2;
            vqb0 vqb0Var = (vqb0) zqb0Var2;
            el30 el30Var = new el30(vqb0Var, 17);
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(aVar4.b);
            PollAnswer pollAnswer2 = (PollAnswer) linkedHashMap3.get(Integer.valueOf(vqb0Var.h().n0()));
            if (pollAnswer2 != null) {
                linkedHashMap3.put(Integer.valueOf(vqb0Var.h().n0()), el30Var.invoke(pollAnswer2));
            }
            return trb0.a.a(aVar4, linkedHashMap3, 0, 14);
        }
        if (zqb0Var2 instanceof xqb0) {
            trb0.a aVar5 = (trb0.a) trb0Var2;
            xrb0.a.c.C4041a c4041a = ((xqb0) zqb0Var2).b;
            LinkedHashMap linkedHashMap4 = new LinkedHashMap(aVar5.b);
            PollAnswer pollAnswer3 = (PollAnswer) linkedHashMap4.get(Integer.valueOf(c4041a.b));
            if (pollAnswer3 != null) {
                linkedHashMap4.put(Integer.valueOf(c4041a.b), PollAnswer.a(pollAnswer3, null, c4041a.c, 1));
            }
            return trb0.a.a(aVar5, linkedHashMap4, 0, 14);
        }
        if (!(zqb0Var2 instanceof wqb0)) {
            throw new NoWhenBranchMatchedException();
        }
        trb0.a aVar6 = (trb0.a) trb0Var2;
        wqb0 wqb0Var = (wqb0) zqb0Var2;
        LinkedHashMap linkedHashMap5 = new LinkedHashMap(aVar6.b);
        PollAnswer pollAnswer4 = (PollAnswer) linkedHashMap5.get(Integer.valueOf(wqb0Var.h().n0()));
        if (pollAnswer4 != null) {
            linkedHashMap5.put(Integer.valueOf(wqb0Var.h().n0()), PollAnswer.a(pollAnswer4, Collections.singletonList(Integer.valueOf(wqb0Var.b.c)), null, 2));
        }
        return trb0.a.a(aVar6, linkedHashMap5, 0, 14);
    }

    @Override // xsna.dm50
    public final ctb0 d() {
        return new ctb0(e(new m360(this, 9)));
    }

    @Override // xsna.dm50
    public final void h(trb0 trb0Var, ctb0 ctb0Var) {
        f(ctb0Var.a, trb0Var);
    }
}
