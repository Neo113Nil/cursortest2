package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.kxi0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class jxi0 implements a0t {
    @Override // xsna.a0t
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        kxi0.a aVar = (kxi0.a) obj;
        com.vk.voip.ui.sessionrooms.f fVar = (com.vk.voip.ui.sessionrooms.f) obj2;
        com.vk.voip.ui.sessionrooms.f fVar2 = (com.vk.voip.ui.sessionrooms.f) obj3;
        com.vk.voip.ui.sessionrooms.f fVar3 = (com.vk.voip.ui.sessionrooms.f) obj4;
        com.vk.voip.ui.sessionrooms.f fVar4 = (com.vk.voip.ui.sessionrooms.f) obj5;
        switch (aVar == null ? -1 : kxi0.b.$EnumSwitchMapping$0[aVar.ordinal()]) {
            case 1:
                return fVar;
            case 2:
                return fVar2;
            case 3:
                return fVar3;
            case 4:
                return fVar4;
            case 5:
                return new com.vk.voip.ui.sessionrooms.f(null, true, false, null, false, true, false, 377);
            case 6:
                return new com.vk.voip.ui.sessionrooms.f(null, false, false, null, false, false, false, 383);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
