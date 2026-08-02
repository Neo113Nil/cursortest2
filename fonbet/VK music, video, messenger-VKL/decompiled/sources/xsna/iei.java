package xsna;

import androidx.compose.runtime.a;
import xsna.jdh0;
import xsna.jei;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class iei implements zzs {
    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        z37 z37Var = (z37) obj;
        jdh0 jdh0Var = (jdh0) obj2;
        androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
        int intValue = ((Integer) obj4).intValue();
        if ((intValue & 6) == 0) {
            i = (aVar.J(z37Var) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= aVar.J(jdh0Var) ? 32 : 16;
        }
        if (aVar.t(i & 1, (i & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1430203881, i, -1, "com.vk.video.ui.upload.impl.coverchoose.presentation.compose.ComposableSingletons$CoverChooseComposeComponentKt.lambda$-1430203881.<anonymous> (CoverChooseComposeComponent.kt:34)");
            }
            boolean z2 = jdh0Var instanceof jdh0.b;
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2) {
                aVar.K(-36391945);
                jdh0.b bVar = (jdh0.b) jdh0Var;
                z = (i & 14) == 4;
                Object x = aVar.x();
                if (z || x == c0012a) {
                    jei.a aVar2 = new jei.a(1, z37Var, z37.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
                    aVar.R(aVar2);
                    x = aVar2;
                }
                jch0.c(bVar, (izs) ((fcy) x), null, aVar, 0);
                aVar.j();
            } else {
                if (jdh0Var instanceof jdh0.a) {
                    aVar.K(-36389322);
                    jdh0.a aVar3 = (jdh0.a) jdh0Var;
                    z = (i & 14) == 4;
                    Object x2 = aVar.x();
                    if (z || x2 == c0012a) {
                        jei.b bVar2 = new jei.b(1, z37Var, z37.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
                        aVar.R(bVar2);
                        x2 = bVar2;
                    }
                    jch0.b(aVar3, (izs) ((fcy) x2), null, aVar, 0);
                } else {
                    aVar.K(-1129745429);
                }
                aVar.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar.h();
        }
        return s3q0.a;
    }
}
