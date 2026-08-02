package xsna;

import androidx.compose.runtime.a;
import xsna.mai;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class lai implements zzs {
    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        z37 z37Var = (z37) obj;
        xe1 xe1Var = (xe1) obj2;
        androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
        int intValue = ((Integer) obj4).intValue();
        if ((intValue & 6) == 0) {
            i = (aVar.J(z37Var) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= aVar.J(xe1Var) ? 32 : 16;
        }
        if (aVar.t(i & 1, (i & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-253441798, i, -1, "com.vk.video.ui.upload.impl.publish.presentation.albumchoose.compose.ComposableSingletons$AlbumChooseComposeComponentKt.lambda$-253441798.<anonymous> (AlbumChooseComposeComponent.kt:33)");
            }
            boolean z2 = xe1Var.f;
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2) {
                aVar.K(267948466);
                z = (i & 14) == 4;
                Object x = aVar.x();
                if (z || x == c0012a) {
                    mai.a aVar2 = new mai.a(1, z37Var, z37.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
                    aVar.R(aVar2);
                    x = aVar2;
                }
                we1.a(xe1Var, (izs) ((fcy) x), null, aVar, (i >> 3) & 14);
                aVar.j();
            } else {
                aVar.K(268039482);
                z = (i & 14) == 4;
                Object x2 = aVar.x();
                if (z || x2 == c0012a) {
                    mai.b bVar = new mai.b(1, z37Var, z37.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
                    aVar.R(bVar);
                    x2 = bVar;
                }
                ke1.a(xe1Var, (izs) ((fcy) x2), null, aVar, (i >> 3) & 14);
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
