package com.yandex.messaging.domain.organizations;

import defpackage.il21;
import defpackage.jl40;
import defpackage.lsn;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ lsn b;
    public final /* synthetic */ String c;

    public a(vpr vprVar, lsn lsnVar, String str) {
        this.a = vprVar;
        this.b = lsnVar;
        this.c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        EmailStatusInfoController$getEmailByGuidFlow$$inlined$map$1$2$1 emailStatusInfoController$getEmailByGuidFlow$$inlined$map$1$2$1;
        int i;
        Object obj2;
        if (continuation instanceof EmailStatusInfoController$getEmailByGuidFlow$$inlined$map$1$2$1) {
            emailStatusInfoController$getEmailByGuidFlow$$inlined$map$1$2$1 = (EmailStatusInfoController$getEmailByGuidFlow$$inlined$map$1$2$1) continuation;
            int i2 = emailStatusInfoController$getEmailByGuidFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                emailStatusInfoController$getEmailByGuidFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = emailStatusInfoController$getEmailByGuidFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = emailStatusInfoController$getEmailByGuidFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    Iterator it = this.b.a.b.Q().d(this.c).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (jl40.l(((il21) obj2).d, "email")) {
                            break;
                        }
                    }
                    il21 il21Var = (il21) obj2;
                    String str = il21Var != null ? il21Var.e : null;
                    emailStatusInfoController$getEmailByGuidFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(str, emailStatusInfoController$getEmailByGuidFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                }
                return zy11.a;
            }
        }
        emailStatusInfoController$getEmailByGuidFlow$$inlined$map$1$2$1 = new EmailStatusInfoController$getEmailByGuidFlow$$inlined$map$1$2$1(this, continuation);
        Object obj32 = emailStatusInfoController$getEmailByGuidFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = emailStatusInfoController$getEmailByGuidFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
