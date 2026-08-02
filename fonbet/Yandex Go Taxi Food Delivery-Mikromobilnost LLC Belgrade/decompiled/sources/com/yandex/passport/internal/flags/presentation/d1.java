package com.yandex.passport.internal.flags.presentation;

import com.yandex.passport.internal.ui.bouncer.model.t1;
import defpackage.fid;
import defpackage.sls;
import defpackage.tls;
import defpackage.vng;
import defpackage.wls;
import defpackage.zy11;

/* loaded from: classes2.dex */
public final /* synthetic */ class d1 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ d1(com.yandex.passport.sloth.ui.dependencies.c cVar, String str, int i, int i2) {
        this.a = 2;
        this.c = cVar;
        this.w = str;
        this.b = i2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.b;
        Object obj3 = this.w;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(i2 | 1);
                c1.n(O, (fid) obj, (sls) obj4, (tls) obj3);
                break;
            case 1:
                ((Integer) obj2).intValue();
                com.yandex.passport.internal.ui.bouncer.r.a((com.yandex.passport.internal.ui.bouncer.v) obj4, (t1) obj3, (fid) obj, vng.O(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                com.yandex.passport.sloth.ui.w.b((com.yandex.passport.sloth.ui.dependencies.c) obj4, (String) obj3, (fid) obj, vng.O(1), i2);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ d1(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.w = obj2;
        this.b = i;
    }
}
