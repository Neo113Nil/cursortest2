package defpackage;

import android.content.Context;
import com.yandex.payment.sdk.core.data.OrderInfo;
import com.yandex.payment.sdk.core.data.Payer;
import com.yandex.payment.sdk.core.data.PaymentToken;
import com.yandex.xplat.payment.sdk.ShowSbpTokensFlag;
import java.util.List;
import ru.yandex.taxi.preorder.summary.selector.model.vertical.a;
import ru.yandex.taxi.preorder.summary.selector.ui.tariffselector.b;
import ru.yandex.taxi.preorder.summary.selector.ui.tariffselector.c;
import ru.yandex.taxi.widget.AnyTouchCatcherFrameLayout;

/* loaded from: classes2.dex */
public final class lu90 implements v7p {
    public final /* synthetic */ int a = 0;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;
    public final xvf0 h;
    public final xvf0 i;
    public final xvf0 j;
    public final n3w k;
    public final xvf0 l;
    public final xvf0 m;

    public lu90(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, xvf0 xvf0Var10, xvf0 xvf0Var11, n3w n3wVar) {
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.h = xvf0Var7;
        this.i = xvf0Var8;
        this.j = xvf0Var9;
        this.l = xvf0Var10;
        this.m = xvf0Var11;
        this.k = n3wVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        n3w n3wVar = this.k;
        xvf0 xvf0Var = this.m;
        xvf0 xvf0Var2 = this.l;
        xvf0 xvf0Var3 = this.j;
        xvf0 xvf0Var4 = this.i;
        xvf0 xvf0Var5 = this.h;
        xvf0 xvf0Var6 = this.g;
        xvf0 xvf0Var7 = this.f;
        xvf0 xvf0Var8 = this.e;
        xvf0 xvf0Var9 = this.d;
        xvf0 xvf0Var10 = this.c;
        xvf0 xvf0Var11 = this.b;
        switch (i) {
            case 0:
                Payer payer = (Payer) xvf0Var11.get();
                ShowSbpTokensFlag showSbpTokensFlag = (ShowSbpTokensFlag) xvf0Var10.get();
                PaymentToken paymentToken = (PaymentToken) xvf0Var9.get();
                OrderInfo orderInfo = (OrderInfo) n3wVar.a;
                nhj nhjVar = (nhj) xvf0Var8.get();
                qs20 qs20Var = (qs20) xvf0Var7.get();
                ps90 ps90Var = (ps90) xvf0Var6.get();
                pgb pgbVar = (pgb) xvf0Var5.get();
                return new bt5(znb1.h(payer), showSbpTokensFlag, zmx.d(new mka0(paymentToken.getToken(), orderInfo != null ? orderInfo.getOrderTag() : null)), nhjVar, qs20Var, ps90Var, (rwo) xvf0Var4.get(), (y22) xvf0Var3.get(), (knz0) xvf0Var2.get(), pgbVar, new zu5((pcy) xvf0Var.get(), 1));
            case 1:
                Context context = (Context) xvf0Var11.get();
                aia0 aia0Var = (aia0) xvf0Var10.get();
                ox90 ox90Var = (ox90) xvf0Var9.get();
                Payer payer2 = (Payer) xvf0Var8.get();
                OrderInfo orderInfo2 = (OrderInfo) xvf0Var7.get();
                xvt xvtVar = (xvt) xvf0Var6.get();
                bt5 bt5Var = (bt5) xvf0Var5.get();
                List list = (List) xvf0Var4.get();
                ((Boolean) xvf0Var3.get()).getClass();
                return new wga0(context, aia0Var, ox90Var, payer2, orderInfo2, xvtVar, bt5Var, list, (sls) n3wVar.a, (rwo) xvf0Var2.get(), (ex5) xvf0Var.get());
            default:
                return new c((isx0) xvf0Var11.get(), (b) xvf0Var10.get(), (jpe) xvf0Var9.get(), (AnyTouchCatcherFrameLayout) xvf0Var8.get(), (a) xvf0Var7.get(), (ru.yandex.taxi.preorder.summary.selector.appearance.a) xvf0Var6.get(), (pe31) xvf0Var5.get(), ((Boolean) xvf0Var4.get()).booleanValue(), (fva0) xvf0Var3.get(), (qr31) xvf0Var2.get(), (mqv0) xvf0Var.get(), (n070) n3wVar.a);
        }
    }

    public lu90(n3w n3wVar, xvf0 xvf0Var, n3w n3wVar2, n3w n3wVar3, n3w n3wVar4, xvf0 xvf0Var2, xvf0 xvf0Var3, n3w n3wVar5, n3w n3wVar6, n3w n3wVar7, n3w n3wVar8, n3w n3wVar9) {
        this.b = n3wVar;
        this.c = xvf0Var;
        this.d = n3wVar2;
        this.e = n3wVar3;
        this.f = n3wVar4;
        this.g = xvf0Var2;
        this.h = xvf0Var3;
        this.i = n3wVar5;
        this.j = n3wVar6;
        this.k = n3wVar7;
        this.l = n3wVar8;
        this.m = n3wVar9;
    }

    public lu90(ku90 ku90Var, n3w n3wVar, n3w n3wVar2, n3w n3wVar3, n3w n3wVar4, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, n3w n3wVar5, n3w n3wVar6, xvf0 xvf0Var5, xvf0 xvf0Var6) {
        this.b = n3wVar;
        this.c = n3wVar2;
        this.d = n3wVar3;
        this.k = n3wVar4;
        this.e = xvf0Var;
        this.f = xvf0Var2;
        this.g = xvf0Var3;
        this.h = xvf0Var4;
        this.i = n3wVar5;
        this.j = n3wVar6;
        this.l = xvf0Var5;
        this.m = xvf0Var6;
    }
}
