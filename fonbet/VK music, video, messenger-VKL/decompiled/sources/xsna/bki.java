package xsna;

import androidx.compose.runtime.a;
import xsna.cki;
import xsna.kdh0;
import xsna.ro20;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class bki implements zzs {
    public final /* synthetic */ int b;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        switch (this.b) {
            case 0:
                z37 z37Var = (z37) obj;
                kdh0 kdh0Var = (kdh0) obj2;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                int intValue = ((Integer) obj4).intValue();
                if ((intValue & 6) == 0) {
                    i = (aVar.J(z37Var) ? 4 : 2) | intValue;
                } else {
                    i = intValue;
                }
                if ((intValue & 48) == 0) {
                    i |= aVar.J(kdh0Var) ? 32 : 16;
                }
                if (aVar.t(i & 1, (i & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(133475989, i, -1, "com.vk.video.ui.upload.impl.publish.presentation.publish.compose.ComposableSingletons$PublishComposeComponentKt.lambda$133475989.<anonymous> (PublishComposeComponent.kt:34)");
                    }
                    boolean z = kdh0Var instanceof kdh0.b;
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (z) {
                        aVar.K(-578590469);
                        boolean z2 = (i & 14) == 4;
                        Object x = aVar.x();
                        if (z2 || x == c0012a) {
                            cki.a aVar2 = new cki.a(1, z37Var, z37.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
                            aVar.R(aVar2);
                            x = aVar2;
                        }
                        img0.a(kdh0Var, (izs) ((fcy) x), null, cki.a, aVar, ((i >> 3) & 14) | 3072, 4);
                        aVar.j();
                    } else {
                        if (kdh0Var instanceof kdh0.a) {
                            aVar.K(-578587654);
                            kdh0.a aVar3 = (kdh0.a) kdh0Var;
                            boolean z3 = (i & 14) == 4;
                            Object x2 = aVar.x();
                            if (z3 || x2 == c0012a) {
                                cki.b bVar = new cki.b(1, z37Var, z37.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
                                aVar.R(bVar);
                                x2 = bVar;
                            }
                            crz.b(aVar3, (izs) ((fcy) x2), null, aVar, 0);
                        } else {
                            aVar.K(-758011827);
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
            default:
                return ((Boolean) obj).booleanValue() ? new ro20.a((uo20) ((it80) obj3).a, (zp20) obj2, (ep20) obj4) : ro20.b.a;
        }
    }
}
