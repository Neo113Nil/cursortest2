package defpackage;

import com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_otp.uicomponents.a;

/* loaded from: classes12.dex */
public final /* synthetic */ class kau implements wls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;

    public /* synthetic */ kau(String str, int i) {
        this.b = str;
        this.c = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.c;
        String str = this.b;
        fid fidVar = (fid) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                b0b1.a(str, i2, fidVar, vng.O(7));
                break;
            default:
                num.intValue();
                a.c(str, fidVar, vng.O(i2 | 1));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ kau(String str, int i, int i2) {
        this.b = str;
        this.c = i;
    }
}
