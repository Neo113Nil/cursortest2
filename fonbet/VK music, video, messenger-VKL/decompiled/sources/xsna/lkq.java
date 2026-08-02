package xsna;

import com.vk.ads.easypromote.impl.domain.model.FaqSource;
import kotlin.NoWhenBranchMatchedException;
import xsna.kkq;
import xsna.nkq;

/* compiled from: FaqReducer.kt */
/* loaded from: classes14.dex */
public final class lkq extends dm50<skq, kkq, nkq> {

    /* compiled from: FaqReducer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FaqSource.values().length];
            try {
                iArr[FaqSource.BUDGET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FaqSource.DURATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.dm50
    public final nkq c(nkq nkqVar, kkq kkqVar) {
        kkq kkqVar2 = kkqVar;
        if (!(kkqVar2 instanceof kkq.a)) {
            throw new NoWhenBranchMatchedException();
        }
        kkq.a aVar = (kkq.a) kkqVar2;
        return new nkq.a(aVar.b, aVar.c);
    }

    @Override // xsna.dm50
    public final skq d() {
        return new skq(e(new wr0(15)));
    }

    @Override // xsna.dm50
    public final void h(nkq nkqVar, skq skqVar) {
        nkq nkqVar2 = nkqVar;
        skq skqVar2 = skqVar;
        if (!(nkqVar2 instanceof nkq.a)) {
            throw new NoWhenBranchMatchedException();
        }
        f(skqVar2.a, nkqVar2);
    }
}
