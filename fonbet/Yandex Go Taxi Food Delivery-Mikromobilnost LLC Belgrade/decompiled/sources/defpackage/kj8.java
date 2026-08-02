package defpackage;

import com.yandex.go.payments.cards.navigation.a;
import com.yandex.go.transfer_requirement.mvp.e;
import java.util.Calendar;

/* loaded from: classes13.dex */
public final /* synthetic */ class kj8 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Calendar b;

    public /* synthetic */ kj8(Calendar calendar, int i) {
        this.a = i;
        this.b = calendar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Calendar calendar = this.b;
        switch (i) {
            case 0:
                ((fj8) obj).P0(calendar);
                break;
            case 1:
                ((a) obj).a.r(new kj8(calendar, 0));
                break;
            default:
                ((e) obj).n1(calendar);
                break;
        }
        return zy11Var;
    }
}
