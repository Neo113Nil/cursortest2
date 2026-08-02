package com.yandex.quark.webchat;

import defpackage.cya0;
import defpackage.dvw;
import defpackage.eya0;
import defpackage.g8e;
import defpackage.kol0;
import defpackage.mya0;
import defpackage.ny61;
import defpackage.oza0;
import defpackage.te41;
import defpackage.zwf0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class g {
    public final eya0 a;
    public final oza0 b;
    public final zwf0 c;

    public g(eya0 eya0Var, oza0 oza0Var, zwf0 zwf0Var) {
        this.a = eya0Var;
        this.b = oza0Var;
        this.c = zwf0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list, ContinuationImpl continuationImpl) {
        WebChatViewPermissionRequestListener$onPermissionRequest$1 webChatViewPermissionRequestListener$onPermissionRequest$1;
        int i;
        if (continuationImpl instanceof WebChatViewPermissionRequestListener$onPermissionRequest$1) {
            webChatViewPermissionRequestListener$onPermissionRequest$1 = (WebChatViewPermissionRequestListener$onPermissionRequest$1) continuationImpl;
            int i2 = webChatViewPermissionRequestListener$onPermissionRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webChatViewPermissionRequestListener$onPermissionRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = webChatViewPermissionRequestListener$onPermissionRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webChatViewPermissionRequestListener$onPermissionRequest$1.label;
                zwf0 zwf0Var = this.c;
                if (i != 0) {
                    ArrayList t = g8e.t(obj);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        cya0 cya0Var = (cya0) it.next();
                        mya0 a = this.a.a(cya0Var);
                        if (a.b()) {
                            arrayList.add(a);
                        } else {
                            t.add(cya0Var);
                        }
                    }
                    if (t.isEmpty()) {
                        zwf0Var.c("WebChatPermissionRequestListener", "All permissions are already granted");
                        return arrayList;
                    }
                    zwf0Var.c("WebChatPermissionRequestListener", "Request permissions: " + t);
                    webChatViewPermissionRequestListener$onPermissionRequest$1.L$0 = t;
                    webChatViewPermissionRequestListener$onPermissionRequest$1.label = 1;
                    kol0 kol0Var = new kol0(dvw.b(webChatViewPermissionRequestListener$onPermissionRequest$1));
                    this.b.d(t, new te41(kol0Var));
                    obj = kol0Var.a();
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                List list2 = (List) obj;
                zwf0Var.c("WebChatPermissionRequestListener", "Permissions request get result: " + list2);
                return list2;
            }
        }
        webChatViewPermissionRequestListener$onPermissionRequest$1 = new WebChatViewPermissionRequestListener$onPermissionRequest$1(this, continuationImpl);
        Object obj2 = webChatViewPermissionRequestListener$onPermissionRequest$1.result;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webChatViewPermissionRequestListener$onPermissionRequest$1.label;
        zwf0 zwf0Var2 = this.c;
        if (i != 0) {
        }
        List list22 = (List) obj2;
        zwf0Var2.c("WebChatPermissionRequestListener", "Permissions request get result: " + list22);
        return list22;
    }
}
