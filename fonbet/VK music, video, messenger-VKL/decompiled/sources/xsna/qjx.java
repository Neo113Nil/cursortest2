package xsna;

import com.vk.clips.internal.nps.api.model.InternalNpsQuestion;
import com.vk.dto.common.Image;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.dqe0;
import xsna.pjx;
import xsna.rpe0;
import xsna.tlo0;
import xsna.wjx;

/* compiled from: InternalNpsMapper.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class qjx extends FunctionReferenceImpl implements izs<wjx.a, dqe0> {
    @Override // xsna.izs
    public final dqe0 invoke(wjx.a aVar) {
        tlo0.h hVar;
        wjx.a aVar2 = aVar;
        ((pjx) this.receiver).getClass();
        InternalNpsQuestion internalNpsQuestion = aVar2.g;
        boolean z = aVar2.f;
        Image image = aVar2.c;
        switch (pjx.a.$EnumSwitchMapping$0[internalNpsQuestion.b.ordinal()]) {
            case 1:
                return new dqe0.e(pjx.b(aVar2), pjx.c(aVar2), z, pjx.a(aVar2));
            case 2:
                return new dqe0.d(pjx.b(aVar2), pjx.c(aVar2), z, pjx.a(aVar2));
            case 3:
                tlo0.g b = pjx.b(aVar2);
                tlo0.h c = pjx.c(aVar2);
                boolean z2 = aVar2.f;
                rpe0 rpe0Var = aVar2.h;
                boolean z3 = rpe0Var instanceof rpe0.a;
                rpe0.a aVar3 = z3 ? (rpe0.a) rpe0Var : null;
                if (aVar3 == null) {
                    hVar = oq.d(tlo0.Companion, "");
                } else {
                    tlo0.a aVar4 = tlo0.Companion;
                    String str = aVar3.a + "/250";
                    aVar4.getClass();
                    hVar = new tlo0.h(str);
                }
                return new dqe0.g(b, c, z2, hVar, (z3 ? (rpe0.a) rpe0Var : null) == null ? Integer.MAX_VALUE : 250);
            case 4:
                return new dqe0.f(image, pjx.c(aVar2));
            case 5:
                return new dqe0.c(image, pjx.c(aVar2));
            case 6:
                return dqe0.b.a;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
