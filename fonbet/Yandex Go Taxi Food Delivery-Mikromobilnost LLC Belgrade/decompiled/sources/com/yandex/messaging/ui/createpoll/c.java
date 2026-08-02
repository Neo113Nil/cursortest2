package com.yandex.messaging.ui.createpoll;

import defpackage.ccg;
import defpackage.cto;
import defpackage.i5m;
import defpackage.k0n;
import defpackage.k7f;
import defpackage.kk;
import defpackage.kt11;
import defpackage.l7f;
import defpackage.m7f;
import defpackage.n3w;
import defpackage.ns11;
import defpackage.ny61;
import defpackage.qrb;
import defpackage.srb;
import defpackage.t7f;
import defpackage.vpr;
import defpackage.wrh;
import defpackage.xvf0;
import defpackage.ybg;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ CreatePollActivity b;

    public c(vpr vprVar, CreatePollActivity createPollActivity) {
        this.a = vprVar;
        this.b = createPollActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CreatePollActivity$onCreate$$inlined$map$1$2$1 createPollActivity$onCreate$$inlined$map$1$2$1;
        int i;
        l7f arguments;
        ns11 ui;
        if (continuation instanceof CreatePollActivity$onCreate$$inlined$map$1$2$1) {
            createPollActivity$onCreate$$inlined$map$1$2$1 = (CreatePollActivity$onCreate$$inlined$map$1$2$1) continuation;
            int i2 = createPollActivity$onCreate$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                createPollActivity$onCreate$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = createPollActivity$onCreate$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = createPollActivity$onCreate$$inlined$map$1$2$1.label;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj2);
                        return zy11Var;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj2);
                ccg ccgVar = ((ccg) ((kt11) obj)).b;
                CreatePollActivity createPollActivity = this.b;
                arguments = createPollActivity.getArguments();
                arguments.getClass();
                kk kkVar = new kk(n3w.a(createPollActivity), 15);
                xvf0 b = i5m.b(new srb(kkVar, 21));
                kk kkVar2 = new kk(n3w.a(arguments), 16);
                ybg ybgVar = ccgVar.D;
                ybg ybgVar2 = ccgVar.j;
                int i3 = 24;
                xvf0 b2 = i5m.b(new qrb((xvf0) kkVar, (xvf0) kkVar2, i5m.b(new cto(new k0n(ybgVar, ybgVar2, i3), new wrh(ccgVar.P, ccgVar.O, ybgVar2, 22), ybgVar2, i3)), (xvf0) ccgVar.d0, (xvf0) ccgVar.B, 7, (byte) 0));
                ui = createPollActivity.getUi();
                ui.c.a(new b(createPollActivity, (m7f) b.get(), new k7f((t7f) b2.get()), (t7f) b2.get()));
                createPollActivity$onCreate$$inlined$map$1$2$1.label = 1;
                return this.a.emit(zy11Var, createPollActivity$onCreate$$inlined$map$1$2$1) == coroutineSingletons ? coroutineSingletons : zy11Var;
            }
        }
        createPollActivity$onCreate$$inlined$map$1$2$1 = new CreatePollActivity$onCreate$$inlined$map$1$2$1(this, continuation);
        Object obj22 = createPollActivity$onCreate$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = createPollActivity$onCreate$$inlined$map$1$2$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
    }
}
