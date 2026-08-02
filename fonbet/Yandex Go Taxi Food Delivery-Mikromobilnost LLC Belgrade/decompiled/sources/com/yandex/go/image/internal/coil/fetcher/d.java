package com.yandex.go.image.internal.coil.fetcher;

import android.content.Context;
import com.yandex.go.coroutines.h;
import defpackage.csf0;
import defpackage.d9;
import defpackage.i3y;
import defpackage.kbv;
import defpackage.kl40;
import defpackage.kq2;
import defpackage.lg70;
import defpackage.nwq;
import defpackage.pwq;
import defpackage.qkj;
import defpackage.vci0;
import defpackage.w5e;

/* loaded from: classes.dex */
public final class d implements nwq {
    public final i3y a;
    public final i3y b;
    public final i3y c;
    public final qkj d;
    public final i3y e;

    public d(kq2 kq2Var, d9 d9Var, h hVar) {
        RemoteImageNetworkFetcher$Factory$1 remoteImageNetworkFetcher$Factory$1 = RemoteImageNetworkFetcher$Factory$1.b;
        this.a = kotlin.a.a(d9Var);
        this.b = kotlin.a.a(kq2Var);
        this.c = kotlin.a.a(new vci0(8));
        qkj qkjVar = new qkj();
        qkjVar.a = remoteImageNetworkFetcher$Factory$1;
        qkjVar.b = kl40.G;
        this.d = qkjVar;
        this.e = kotlin.a.a(new csf0(8, hVar));
    }

    @Override // defpackage.nwq
    public final pwq a(Object obj, lg70 lg70Var, coil3.c cVar) {
        kbv kbvVar = (kbv) obj;
        i3y i3yVar = this.b;
        i3y i3yVar2 = this.a;
        i3y a = kotlin.a.a(new csf0(9, cVar));
        i3y i3yVar3 = this.e;
        qkj qkjVar = this.d;
        Context context = lg70Var.a;
        Object obj2 = qkjVar.b;
        kl40 kl40Var = kl40.G;
        if (obj2 == kl40Var) {
            synchronized (qkjVar) {
                obj2 = qkjVar.b;
                if (obj2 == kl40Var) {
                    Object invoke = qkjVar.a.invoke(context);
                    qkjVar.b = invoke;
                    qkjVar.a = null;
                    obj2 = invoke;
                }
            }
        }
        return new e(kbvVar, lg70Var, i3yVar2, a, i3yVar, i3yVar3, (w5e) obj2, (c) this.c.getValue());
    }
}
