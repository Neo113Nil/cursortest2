package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.requirements.comment.summary.ui.v3.ui.a;

/* loaded from: classes12.dex */
public final /* synthetic */ class e0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ tls w;

    public /* synthetic */ e0(String str, String str2, tls tlsVar) {
        this.a = 1;
        this.b = str;
        this.c = str2;
        this.w = tlsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        String str = this.c;
        zy11 zy11Var = zy11.a;
        tls tlsVar = this.w;
        String str2 = this.b;
        fid fidVar = (fid) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                a.c(str2, str, tlsVar, fidVar, vng.O(1));
                break;
            case 1:
                int intValue = num.intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    pvi0 b = mja1.b(str2, new jfv(AppColor$Palette.Text), 4);
                    boolean k = btsVar.k(tlsVar);
                    Object Q = btsVar.Q();
                    if (k || Q == did.a) {
                        Q = new ukb0(1, tlsVar);
                        btsVar.o0(Q);
                    }
                    com.yandex.go.address.address_map_picker.ui.a.d(null, b, this.c, (sls) Q, btsVar, 0);
                    break;
                }
            default:
                num.getClass();
                com.yandex.go.address.address_map_picker.ui.a.e(str2, str, tlsVar, fidVar, vng.O(1));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ e0(String str, String str2, tls tlsVar, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = str2;
        this.w = tlsVar;
    }
}
