package xsna;

import androidx.compose.runtime.a;
import com.ironsource.mediationsdk.logger.IronSourceError;
import ru.ok.gl.tf.Tensorflow;
import xsna.psn0;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class ce1 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ce1(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                izs izsVar = (izs) this.c;
                xe1 xe1Var = (xe1) this.d;
                s890 s890Var = (s890) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar.J(s890Var) ? 4 : 2;
                }
                if (aVar.t(intValue & 1, (intValue & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(936536459, intValue, -1, "com.vk.video.ui.upload.impl.publish.presentation.albumchoose.compose.screen.AlbumChooseView.<anonymous> (AlbumChooseView.kt:54)");
                    }
                    xvy a = zvy.a(0, 3, aVar);
                    boolean J = aVar.J(izsVar);
                    Object x = aVar.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (J || x == c0012a) {
                        x = new fe1(izsVar, 0);
                        aVar.R(x);
                    }
                    ke1.b(0, 0, aVar, (gzs) x, a, xe1Var.b);
                    q630 E = ahn.E(q630.a.a, "AlbumChooseTags.ALBUMS");
                    boolean J2 = aVar.J(xe1Var) | aVar.J(izsVar);
                    Object x2 = aVar.x();
                    if (J2 || x2 == c0012a) {
                        x2 = new defpackage.b0(2, xe1Var, izsVar);
                        aVar.R(x2);
                    }
                    x1v0.a(E, null, s890Var, null, null, null, false, null, (izs) x2, aVar, ((intValue << 6) & 896) | 6, IronSourceError.ERROR_CODE_INVALID_KEY_VALUE);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                rg50 rg50Var = (rg50) this.c;
                wh50 wh50Var = (wh50) this.d;
                jj jjVar = (jj) obj;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= aVar2.J(jjVar) ? 4 : 2;
                }
                boolean z = false;
                if (aVar2.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-696691085, intValue2, -1, "com.vk.design.demo.presentation.screens.AccentTabsContent.<anonymous>.<anonymous>.<anonymous> (TabsScreenContent.kt:486)");
                    }
                    q630 C = txj0.C(q630.a.a, null, 3);
                    if (rg50Var.getIntValue() == 0 && ((Boolean) wh50Var.getValue()).booleanValue()) {
                        z = true;
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1591975853, 54, -1, "com.vk.core.compose.component.tabs.TabItem.Middle.Text.Companion.invoke (VkTabItem.kt:181)");
                    }
                    Object x3 = aVar2.x();
                    Object obj4 = a.C0011a.a;
                    if (x3 == obj4) {
                        x3 = new psn0.a("Fixed");
                        aVar2.R(x3);
                    }
                    psn0.a aVar3 = (psn0.a) x3;
                    ((zak0) aVar3.b).setValue("Fixed");
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    Object x4 = aVar2.x();
                    if (x4 == obj4) {
                        x4 = new cg1(26, rg50Var, wh50Var);
                        aVar2.R(x4);
                    }
                    jjVar.c(z, (gzs) x4, C, aVar3, null, null, null, aVar2, ((intValue2 << 21) & 29360128) | Tensorflow.FRAME_WIDTH, 112);
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
