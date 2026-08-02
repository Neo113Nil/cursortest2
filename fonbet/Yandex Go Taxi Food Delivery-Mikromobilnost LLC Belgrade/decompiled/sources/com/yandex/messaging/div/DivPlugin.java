package com.yandex.messaging.div;

import android.content.Context;
import com.yandex.div.legacy.DivContext;
import com.yandex.messaging.MessengerEnvironment;
import defpackage.abe;
import defpackage.ba9;
import defpackage.bc;
import defpackage.bzf;
import defpackage.c8g;
import defpackage.f2b;
import defpackage.g191;
import defpackage.hkk;
import defpackage.i5m;
import defpackage.oti;
import defpackage.p4t;
import defpackage.p8g;
import defpackage.pbj;
import defpackage.pgi;
import defpackage.q5z;
import defpackage.rjk;
import defpackage.sfl0;
import defpackage.sml;
import defpackage.szk;
import defpackage.tzk;
import defpackage.w4l;
import defpackage.x22;
import defpackage.xvf0;
import defpackage.ydz;
import defpackage.z8g;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/yandex/messaging/div/DivPlugin;", "Lhkk;", "<init>", "()V", "Lw4l;", "dependencies", "Lzy11;", "init", "(Lw4l;)V", "Lrjk;", "component", "Lrjk;", "Ltzk;", "getViewController", "()Ltzk;", "viewController", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "messaging-div_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DivPlugin implements hkk {
    private rjk component;

    @Override // defpackage.hkk
    public Context getContext() {
        rjk rjkVar = this.component;
        if (rjkVar == null) {
            rjkVar = null;
        }
        return (DivContext) ((xvf0) ((bc) rjkVar).x).get();
    }

    @Override // defpackage.hkk
    public tzk getViewController() {
        rjk rjkVar = this.component;
        if (rjkVar == null) {
            rjkVar = null;
        }
        bc bcVar = (bc) rjkVar;
        szk szkVar = new szk((DivContext) ((xvf0) bcVar.x).get());
        c8g c8gVar = (c8g) ((w4l) bcVar.a);
        z8g z8gVar = c8gVar.a;
        x22 x22Var = (x22) z8gVar.y.get();
        q5z.h(x22Var);
        p8g p8gVar = c8gVar.b;
        MessengerEnvironment messengerEnvironment = (MessengerEnvironment) p8gVar.i.get();
        q5z.h(messengerEnvironment);
        sml smlVar = new sml((sfl0) c8gVar.d.w.get());
        g191 g191Var = new g191(p8gVar.p());
        p4t a = p8gVar.a();
        Context context = z8gVar.a.a;
        q5z.i(context);
        boolean z = false;
        return new c(szkVar, x22Var, new pbj(messengerEnvironment, smlVar, g191Var, a, new abe(context, z, z)), (a) ((xvf0) bcVar.w).get());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void init(w4l dependencies) {
        if (ydz.a.a()) {
            ydz.a();
        }
        bc bcVar = new bc();
        bcVar.a = dependencies;
        bcVar.b = new bzf(dependencies, 0);
        bcVar.c = i5m.b(new ba9(new bzf(dependencies, 4), 28));
        xvf0 b = i5m.b(new f2b(new bzf(dependencies, 2), new bzf(dependencies, 1), new bzf(dependencies, 5), 0 == true ? 1 : 0));
        bcVar.w = b;
        bcVar.x = i5m.b(new oti(bcVar.b, i5m.b(new pgi((xvf0) bcVar.c, b, new bzf(dependencies, 3), 13)), 8, (boolean) (0 == true ? 1 : 0)));
        this.component = bcVar;
    }

    public /* bridge */ void init(Object obj) {
        init((w4l) obj);
    }
}
