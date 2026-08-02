package defpackage;

import com.yandex.passport.internal.ui.bouncer.chooser.e;
import java.util.List;

/* loaded from: classes6.dex */
public final /* synthetic */ class l3x implements wls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ List b;
    public final /* synthetic */ tls c;
    public final /* synthetic */ f530 w;
    public final /* synthetic */ int x;

    public /* synthetic */ l3x(f530 f530Var, List list, tls tlsVar, int i) {
        this.w = f530Var;
        this.b = list;
        this.c = tlsVar;
        this.x = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.x;
        f530 f530Var = this.w;
        tls tlsVar = this.c;
        List list = this.b;
        fid fidVar = (fid) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.intValue();
                z9b1.c(vng.O(i2 | 1), fidVar, tlsVar, f530Var, list);
                break;
            default:
                num.getClass();
                e.a(vng.O(i2 | 1), fidVar, tlsVar, f530Var, list);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ l3x(List list, tls tlsVar, f530 f530Var, int i) {
        this.b = list;
        this.c = tlsVar;
        this.w = f530Var;
        this.x = i;
    }
}
