package com.yandex.passport.internal.ui.bouncer.chooser;

import defpackage.f530;
import defpackage.fid;
import defpackage.ibp0;
import defpackage.qcu;
import defpackage.sls;
import defpackage.tls;
import defpackage.vng;
import defpackage.wls;
import defpackage.wza1;
import defpackage.zy11;
import java.util.List;

/* loaded from: classes11.dex */
public final /* synthetic */ class g implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, tls tlsVar, int i, int i2) {
        this.a = i2;
        this.w = obj;
        this.x = obj2;
        this.y = obj3;
        this.b = tlsVar;
        this.c = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.c;
        Object obj3 = this.y;
        Object obj4 = this.x;
        Object obj5 = this.w;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                int O = vng.O(i2 | 1);
                h.b((b) obj5, (List) obj4, (sls) obj3, this.b, (fid) obj, O);
                break;
            default:
                ((Integer) obj2).getClass();
                int O2 = vng.O(i2 | 1);
                wza1.f((ibp0) obj5, (qcu) obj4, (f530) obj3, this.b, (fid) obj, O2);
                break;
        }
        return zy11Var;
    }
}
