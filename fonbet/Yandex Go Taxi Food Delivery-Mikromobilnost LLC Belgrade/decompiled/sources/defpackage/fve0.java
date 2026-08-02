package defpackage;

import android.os.Handler;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.payment.sdk.model.data.ResultScreenClosing;
import com.yandex.xplat.payment.sdk.NewCard;

/* loaded from: classes2.dex */
public final class fve0 implements hs31 {
    public final Object A;
    public final /* synthetic */ int a = 1;
    public final vv90 b;
    public final boolean c;
    public final Object w;
    public final Object x;
    public final Object y;
    public final Object z;

    public fve0(vv90 vv90Var, px90 px90Var, gve0 gve0Var, boolean z, Handler handler, tls tlsVar, ResultScreenClosing resultScreenClosing) {
        this.b = vv90Var;
        this.w = px90Var;
        this.x = gve0Var;
        this.c = z;
        this.y = handler;
        this.z = tlsVar;
        this.A = resultScreenClosing;
    }

    @Override // defpackage.hs31
    public final yr31 create(Class cls) {
        int i = this.a;
        Object obj = this.A;
        Object obj2 = this.z;
        Object obj3 = this.y;
        Object obj4 = this.x;
        Object obj5 = this.w;
        switch (i) {
            case 0:
                if (!cls.equals(wve0.class)) {
                    ny61.r("Unknown view model");
                    break;
                } else {
                    break;
                }
            default:
                if (!cls.equals(afq0.class)) {
                    ny61.r("Unknown view model");
                    break;
                } else {
                    break;
                }
        }
        return null;
    }

    public fve0(oy90 oy90Var, vv90 vv90Var, PaymentMethod paymentMethod, NewCard newCard, String str, boolean z, rwo rwoVar) {
        this.w = oy90Var;
        this.b = vv90Var;
        this.x = paymentMethod;
        this.y = newCard;
        this.z = str;
        this.c = z;
        this.A = rwoVar;
    }
}
