package defpackage;

import com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_otp.uicomponents.a;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.c;

/* loaded from: classes2.dex */
public final /* synthetic */ class d930 implements wls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ f530 x;

    public /* synthetic */ d930(f530 f530Var, String str, int i, boolean z, int i2) {
        this.x = f530Var;
        this.b = str;
        this.c = i;
        this.w = z;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(1);
                a.b(this.b, this.x, this.w, (fid) obj, this.c, O);
                break;
            default:
                ((Integer) obj2).getClass();
                int O2 = vng.O(1);
                c.a(this.b, this.x, this.w, (fid) obj, this.c, O2);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ d930(String str, int i, boolean z, f530 f530Var, int i2) {
        this.b = str;
        this.c = i;
        this.w = z;
        this.x = f530Var;
    }
}
