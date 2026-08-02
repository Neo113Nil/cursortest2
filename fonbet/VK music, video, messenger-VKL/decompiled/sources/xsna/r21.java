package xsna;

import androidx.compose.runtime.a;
import com.vk.ecomm.market.good.ui.j;
import com.vkontakte.android.attachments.ShitAttachment;
import one.video.player.OneVideoPlayer;
import xsna.dg70;
import xsna.g6n0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class r21 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r21(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                s21.y((String) obj, ((ShitAttachment) this.c).v, (String) this.d, (izs) obj2);
                break;
            case 1:
                ((Integer) obj2).getClass();
                l7c.e((xw80) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 2:
                e9n e9nVar = (e9n) this.c;
                rui ruiVar = (rui) obj;
                nn50 nn50Var = (nn50) obj2;
                f64 a = ruiVar.a(new h8n(e9nVar, (ca90) this.d, nn50Var));
                qn60 qn60Var = e9nVar.a;
                pn60 pn60Var = e9nVar.b;
                com.vk.channels.impl.channel_screen.send_msg.c cVar = e9nVar.j;
                mo60 mo60Var = e9nVar.f;
                ?? r8 = mo60Var.m;
                ?? r9 = mo60Var.j;
                f64 a2 = ruiVar.a(new z7n(qn60Var, pn60Var, cVar, r8, r9, mo60Var.i, nn50Var));
                hap hapVar = e9nVar.k;
                f64 a3 = ruiVar.a(new w7n(hapVar, qn60Var, pn60Var, r9, nn50Var));
                f64 a4 = ruiVar.a(new e8n(cVar, r9, r8, mo60Var.D, mo60Var.K, nn50Var));
                es60 es60Var = e9nVar.l;
                ruiVar.b = new n8n(a, a2, a4, a3, ruiVar.a(new y5o0(es60Var, hapVar, nn50Var)), ruiVar.a(new c9n(qn60Var, pn60Var, nn50Var)), ruiVar.a(new v5o0(es60Var, hapVar, nn50Var)), ruiVar.a(new s8n(qn60Var, pn60Var, nn50Var)));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((wvq) this.c).d((String) this.d, (androidx.compose.runtime.a) obj, ne7.I(7));
                break;
            case 4:
                ((Integer) obj2).getClass();
                fg70.i((dg70.h) this.c, (izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 5:
                ((ohk0) obj).c("onPlayerBuffering");
                ks80.g((ks80) this.c, (OneVideoPlayer) this.d, "STATE:BUFFERING", (String) obj2);
                break;
            case 6:
                gzs gzsVar = (gzs) this.c;
                q630 q630Var = (q630) this.d;
                ((Integer) obj2).getClass();
                vha0.a(ne7.I(1), (androidx.compose.runtime.a) obj, gzsVar, q630Var);
                break;
            case 7:
                com.vk.ecomm.market.good.ui.c cVar2 = (com.vk.ecomm.market.good.ui.c) this.c;
                com.vk.ecomm.market.good.ui.j jVar = (com.vk.ecomm.market.good.ui.j) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(547906435, intValue, -1, "com.vk.ecomm.market.good.ui.ProductButtonsBinderRefactoredImpl.bind.<anonymous>.<anonymous> (ProductButtonsBinderRefactoredImpl.kt:45)");
                    }
                    hid0 hid0Var = cVar2.m;
                    if (hid0Var == null) {
                        aVar.K(1804935435);
                    } else {
                        aVar.K(1804935436);
                        Object x = aVar.x();
                        if (x == a.C0011a.a) {
                            x = new com.vk.ecomm.market.good.ui.k(jVar);
                            aVar.R(x);
                        }
                        jVar.d(hid0Var, (j.a) x, aVar, 48);
                    }
                    aVar.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 8:
                ((Integer) obj2).getClass();
                ((y6e0) this.c).a((q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                pmh0.a((g6n0.a) this.c, (izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            default:
                ((Integer) obj2).getClass();
                but0.a((xqo) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(49));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ r21(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}
