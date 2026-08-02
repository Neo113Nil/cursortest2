package com.yandex.passport.common.util;

import com.yandex.passport.internal.ui.challenge.changecurrent.r;
import com.yandex.passport.internal.ui.challenge.changecurrent.s;
import defpackage.nci0;
import defpackage.tls;
import defpackage.zy11;

/* loaded from: classes8.dex */
public final class d implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                try {
                    ((nci0) obj2).cancel();
                    break;
                } catch (Throwable unused) {
                    break;
                }
            default:
                ((s) obj2).b.a(new r(((com.yandex.passport.common.url.b) obj).a));
                break;
        }
        return zy11Var;
        return zy11Var;
    }
}
