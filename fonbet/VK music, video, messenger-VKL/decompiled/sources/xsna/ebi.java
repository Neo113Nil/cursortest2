package xsna;

import androidx.compose.runtime.a;
import xsna.fbi;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class ebi implements zzs {
    public final /* synthetic */ int b;

    public /* synthetic */ ebi(int i) {
        this.b = i;
    }

    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        switch (this.b) {
            case 0:
                z37 z37Var = (z37) obj;
                idh0 idh0Var = (idh0) obj2;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                int intValue = ((Integer) obj4).intValue();
                if ((intValue & 6) == 0) {
                    i = (aVar.J(z37Var) ? 4 : 2) | intValue;
                } else {
                    i = intValue;
                }
                if ((intValue & 48) == 0) {
                    i |= aVar.J(idh0Var) ? 32 : 16;
                }
                if (aVar.t(i & 1, (i & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1522909916, i, -1, "com.vk.video.ui.upload.impl.attachedclips.presentation.compose.ComposableSingletons$AttachedClipsComposeComponentKt.lambda$-1522909916.<anonymous> (AttachedClipsComposeComponent.kt:32)");
                    }
                    boolean z = (i & 14) == 4;
                    Object x = aVar.x();
                    if (z || x == a.C0011a.a) {
                        fbi.a aVar2 = new fbi.a(1, z37Var, z37.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
                        aVar.R(aVar2);
                        x = aVar2;
                    }
                    ich0.j(idh0Var, (izs) ((fcy) x), null, aVar, (i >> 3) & 14);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                int i2 = d9m0.n1;
                break;
        }
        return s3q0.a;
    }
}
