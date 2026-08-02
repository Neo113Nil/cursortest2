package xsna;

import androidx.compose.runtime.a;
import xsna.qei;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class oei implements zzs {
    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        z37 z37Var = (z37) obj;
        zck zckVar = (zck) obj2;
        androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
        int intValue = ((Integer) obj4).intValue();
        if ((intValue & 6) == 0) {
            i = (aVar.J(z37Var) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= aVar.J(zckVar) ? 32 : 16;
        }
        if (aVar.t(i & 1, (i & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1833343299, i, -1, "com.vk.profile.community.creationonboarding.impl.tasks.presentation.compose.ComposableSingletons$CreationOnBoardingTasksScreenKt.lambda$-1833343299.<anonymous> (CreationOnBoardingTasksScreen.kt:86)");
            }
            boolean z = (i & 14) == 4;
            Object x = aVar.x();
            if (z || x == a.C0011a.a) {
                qei.a aVar2 = new qei.a(1, z37Var, z37.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
                aVar.R(aVar2);
                x = aVar2;
            }
            ubk.a(zckVar, (izs) ((fcy) x), aVar, (i >> 3) & 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar.h();
        }
        return s3q0.a;
    }
}
