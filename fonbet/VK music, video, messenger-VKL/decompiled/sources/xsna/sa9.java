package xsna;

import androidx.compose.runtime.a;
import xsna.obi;
import xsna.va9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class sa9 implements zzs {
    public final /* synthetic */ int b;

    public /* synthetic */ sa9(int i) {
        this.b = i;
    }

    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        long j;
        switch (this.b) {
            case 0:
                va9.g gVar = (va9.g) obj2;
                break;
            case 1:
                z37 z37Var = (z37) obj;
                p230 p230Var = (p230) obj2;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                int intValue = ((Integer) obj4).intValue();
                if ((intValue & 6) == 0) {
                    i = (aVar.J(z37Var) ? 4 : 2) | intValue;
                } else {
                    i = intValue;
                }
                if ((intValue & 48) == 0) {
                    i |= aVar.J(p230Var) ? 32 : 16;
                }
                int i2 = i;
                if (aVar.t(i2 & 1, (i2 & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-757533000, i2, -1, "com.vk.video.ui.upload.impl.publish.presentation.author.fragment.ComposableSingletons$AuthorModalKt.lambda$-757533000.<anonymous> (AuthorModal.kt:65)");
                    }
                    boolean z = (i2 & 14) == 4;
                    Object x = aVar.x();
                    if (z || x == a.C0011a.a) {
                        x = new obi.a(1, z37Var, z37.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
                        aVar.R(x);
                    }
                    yz20.a(p230Var, (izs) ((fcy) x), null, aVar, (i2 >> 3) & 14);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                if ((intValue2 & 48) == 0) {
                    intValue2 |= aVar2.l(booleanValue) ? 32 : 16;
                }
                if (aVar2.t(intValue2 & 1, (intValue2 & 145) != 144)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-557020952, intValue2, -1, "com.vk.design.demo.presentation.screens.ComposableSingletons$IconsContentKt.lambda$-557020952.<anonymous> (IconsContent.kt:57)");
                    }
                    if (booleanValue) {
                        aVar2.K(1573782163);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j = ylu0Var.getText().m;
                    } else {
                        aVar2.K(1573783349);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var2 = (ylu0) aVar2.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j = ylu0Var2.getText().p;
                    }
                    aVar2.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c("Vk", null, j, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.M, aVar2, 6, 0, 8186);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
        }
        return s3q0.a;
    }
}
