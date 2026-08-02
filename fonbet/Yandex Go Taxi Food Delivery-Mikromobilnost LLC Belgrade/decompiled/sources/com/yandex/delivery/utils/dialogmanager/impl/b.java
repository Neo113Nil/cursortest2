package com.yandex.delivery.utils.dialogmanager.impl;

import defpackage.bvf0;
import defpackage.eyc;
import defpackage.f92;
import defpackage.fyc;
import defpackage.gwk0;
import defpackage.ike;
import defpackage.jej;
import defpackage.ny61;
import defpackage.qej;
import defpackage.rol0;
import defpackage.sb2;
import defpackage.st2;
import defpackage.wsr0;
import defpackage.xsr0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;

/* loaded from: classes.dex */
public final class b {
    public final kotlinx.coroutines.channels.a a = sb2.a(Integer.MAX_VALUE, null, null, 6);
    public final f92 b;

    public b(st2 st2Var) {
        rol0 rol0Var = new rol0(new DialogManagerImpl$requestFlow$1(this, null));
        ike a = bvf0.a(st2Var.a);
        xsr0.a.getClass();
        this.b = new f92(e.O(rol0Var, a, wsr0.c, 1), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(qej qejVar, ContinuationImpl continuationImpl) {
        DialogManagerImpl$requestDialog$1 dialogManagerImpl$requestDialog$1;
        int i;
        eyc eycVar;
        if (continuationImpl instanceof DialogManagerImpl$requestDialog$1) {
            dialogManagerImpl$requestDialog$1 = (DialogManagerImpl$requestDialog$1) continuationImpl;
            int i2 = dialogManagerImpl$requestDialog$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dialogManagerImpl$requestDialog$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dialogManagerImpl$requestDialog$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dialogManagerImpl$requestDialog$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    fyc b = gwk0.b();
                    jej jejVar = new jej(qejVar, b);
                    dialogManagerImpl$requestDialog$1.L$0 = null;
                    dialogManagerImpl$requestDialog$1.L$1 = b;
                    dialogManagerImpl$requestDialog$1.label = 1;
                    if (this.a.o(jejVar, dialogManagerImpl$requestDialog$1) != coroutineSingletons) {
                        eycVar = b;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                eycVar = (eyc) dialogManagerImpl$requestDialog$1.L$1;
                kotlin.b.b(obj);
                dialogManagerImpl$requestDialog$1.L$0 = null;
                dialogManagerImpl$requestDialog$1.L$1 = null;
                dialogManagerImpl$requestDialog$1.label = 2;
                Object s = ((fyc) eycVar).s(dialogManagerImpl$requestDialog$1);
                return s != coroutineSingletons ? coroutineSingletons : s;
            }
        }
        dialogManagerImpl$requestDialog$1 = new DialogManagerImpl$requestDialog$1(this, continuationImpl);
        Object obj2 = dialogManagerImpl$requestDialog$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dialogManagerImpl$requestDialog$1.label;
        if (i != 0) {
        }
        dialogManagerImpl$requestDialog$1.L$0 = null;
        dialogManagerImpl$requestDialog$1.L$1 = null;
        dialogManagerImpl$requestDialog$1.label = 2;
        Object s2 = ((fyc) eycVar).s(dialogManagerImpl$requestDialog$1);
        if (s2 != coroutineSingletons2) {
        }
    }

    public final fyc b(qej qejVar) {
        fyc b = gwk0.b();
        this.a.d(new jej(qejVar, b));
        return b;
    }
}
