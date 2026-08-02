package defpackage;

import android.content.Context;
import com.yandex.plus.pay.api.model.SimOperatorInfo;
import com.yandex.plus.pay.internal.network.SimOperator;
import kotlin.a;

/* loaded from: classes.dex */
public final class p5h {
    public final i3y a;

    public p5h(Context context) {
        this.a = a.a(new ku2(context, 3));
    }

    public SimOperatorInfo a() {
        i3y i3yVar = this.a;
        SimOperator simOperator = (SimOperator) i3yVar.getValue();
        String mcc = simOperator != null ? simOperator.getMcc() : null;
        if (mcc == null) {
            mcc = "";
        }
        SimOperator simOperator2 = (SimOperator) i3yVar.getValue();
        String mnc = simOperator2 != null ? simOperator2.getMnc() : null;
        return new SimOperatorInfo(mcc, mnc != null ? mnc : "");
    }

    public p5h() {
        this.a = a.a(new n5h(this));
    }
}
