package xsna;

import androidx.compose.runtime.a;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.navigation.api.data.AppShareType;
import org.json.JSONObject;
import xsna.sx80;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class tvq implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tvq(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                wvq wvqVar = (wvq) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(613786956, intValue, -1, "com.vk.design.demo.presentation.screens.feed.FeedActionButtonsScreenContent.ButtonsList.<anonymous>.<anonymous>.<anonymous> (FeedActionButtonsScreenContent.kt:84)");
                    }
                    wvqVar.e(0, aVar);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                izs izsVar = (izs) this.c;
                sx80.a aVar2 = (sx80.a) obj;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= aVar3.J(aVar2) ? 4 : 2;
                }
                if (aVar3.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1173426874, intValue2, -1, "com.vk.ecomm.orders.impl.order.presentation.compose.OrderScreen.<anonymous>.<anonymous> (OrderScreen.kt:83)");
                    }
                    if (aVar2 instanceof sx80.a.d) {
                        aVar3.K(-821087971);
                        nu80.c((sx80.a.d) aVar2, izsVar, null, aVar3, 0);
                        aVar3.j();
                    } else if (aVar2 instanceof sx80.a.C3700a) {
                        aVar3.K(-820874908);
                        imy imyVar = ((sx80.a.C3700a) aVar2).a;
                        boolean J = aVar3.J(izsVar);
                        Object x = aVar3.x();
                        if (J || x == a.C0011a.a) {
                            x = new v78(izsVar, 3);
                            aVar3.R(x);
                        }
                        cy80.a(imyVar, (gzs) x, null, aVar3, 0);
                        aVar3.j();
                    } else if (aVar2 instanceof sx80.a.b) {
                        aVar3.K(-820580315);
                        fy80.a(0, 1, aVar3, null);
                        aVar3.j();
                    } else {
                        if (!(aVar2 instanceof sx80.a.c)) {
                            throw alb0.c(1913174376, aVar3);
                        }
                        aVar3.K(1913195690);
                        aVar3.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            default:
                mbj0 mbj0Var = (mbj0) this.c;
                ((Integer) obj).getClass();
                ((Integer) obj2).getClass();
                t0q t0qVar = (t0q) obj3;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", AppShareType.POST.h());
                StringBuilder sb = new StringBuilder();
                sb.append(t0qVar.b);
                sb.append('_');
                sb.append(t0qVar.a);
                jSONObject.put("post_id", sb.toString());
                mbj0Var.a.n(JsApiMethodType.SHARE, jSONObject);
                System.currentTimeMillis();
                mbj0Var.b();
                return s3q0.a;
        }
    }
}
