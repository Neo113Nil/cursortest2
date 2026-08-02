package com.yandex.go.messenger_native.interactors;

import android.content.Context;
import com.yandex.messaging.auth.AuthEnvironment;
import defpackage.fl3;
import defpackage.g6u;
import defpackage.gl3;
import defpackage.hl3;
import defpackage.jb7;
import defpackage.mth;
import defpackage.ny61;
import defpackage.o400;
import defpackage.rol0;
import defpackage.sjh;
import defpackage.t350;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.u02;
import defpackage.uw60;
import defpackage.uyj;
import defpackage.w511;
import defpackage.wl3;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.am.k;
import ru.yandex.taxi.am.m;
import ru.yandex.taxi.experiments.d;

/* loaded from: classes8.dex */
public final class a implements uw60 {
    public final u02 a;
    public final Context b;
    public final tt2 c;
    public final com.yandex.go.messenger_native.marketplace.repositories.a d;
    public final t350 e;
    public final m f;
    public final k g;

    public a(u02 u02Var, Context context, tt2 tt2Var, com.yandex.go.messenger_native.marketplace.repositories.a aVar, t350 t350Var, m mVar, k kVar) {
        this.a = u02Var;
        this.b = context;
        this.c = tt2Var;
        this.d = aVar;
        this.e = t350Var;
        this.f = mVar;
        this.g = kVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0061, code lost:
    
        if (r13 == r1) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // defpackage.uw60
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        MessengerAuthInteractorImpl$onAccountReset$1 messengerAuthInteractorImpl$onAccountReset$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Boolean bool;
        boolean booleanValue;
        Object A;
        boolean z;
        Boolean bool2;
        boolean booleanValue2;
        Object y;
        boolean z2;
        boolean z3;
        hl3 hl3Var;
        wl3 wl3Var;
        if (continuation instanceof MessengerAuthInteractorImpl$onAccountReset$1) {
            messengerAuthInteractorImpl$onAccountReset$1 = (MessengerAuthInteractorImpl$onAccountReset$1) continuation;
            int i2 = messengerAuthInteractorImpl$onAccountReset$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                messengerAuthInteractorImpl$onAccountReset$1.label = i2 - Integer.MIN_VALUE;
                Object obj = messengerAuthInteractorImpl$onAccountReset$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = messengerAuthInteractorImpl$onAccountReset$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    b.b(obj);
                    tpr b = d.b(this.e);
                    messengerAuthInteractorImpl$onAccountReset$1.label = 1;
                    obj = e.A(b, messengerAuthInteractorImpl$onAccountReset$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            z = messengerAuthInteractorImpl$onAccountReset$1.Z$0;
                            b.b(obj);
                            bool2 = (Boolean) obj;
                            if (bool2 != null && (booleanValue2 = bool2.booleanValue())) {
                                mth mthVar = this.f.f;
                                messengerAuthInteractorImpl$onAccountReset$1.Z$0 = z;
                                messengerAuthInteractorImpl$onAccountReset$1.Z$1 = booleanValue2;
                                messengerAuthInteractorImpl$onAccountReset$1.label = 3;
                                y = e.y(mthVar, messengerAuthInteractorImpl$onAccountReset$1);
                                if (y != coroutineSingletons) {
                                    boolean z4 = z;
                                    z2 = booleanValue2;
                                    obj = y;
                                    z3 = z4;
                                    hl3Var = (hl3) obj;
                                    if (!(hl3Var instanceof fl3)) {
                                    }
                                    this.c.getClass();
                                    sjh sjhVar = uyj.a;
                                    g6u g6uVar = o400.a;
                                    MessengerAuthInteractorImpl$onAccountReset$2 messengerAuthInteractorImpl$onAccountReset$2 = new MessengerAuthInteractorImpl$onAccountReset$2(this, wl3Var, null);
                                    messengerAuthInteractorImpl$onAccountReset$1.L$0 = null;
                                    messengerAuthInteractorImpl$onAccountReset$1.Z$0 = z3;
                                    messengerAuthInteractorImpl$onAccountReset$1.Z$1 = z2;
                                    messengerAuthInteractorImpl$onAccountReset$1.label = 4;
                                    if (tje.k0(g6uVar, messengerAuthInteractorImpl$onAccountReset$2, messengerAuthInteractorImpl$onAccountReset$1) != coroutineSingletons) {
                                    }
                                }
                            }
                        }
                        if (i != 3) {
                            if (i != 4) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            b.b(obj);
                            return zy11Var;
                        }
                        z2 = messengerAuthInteractorImpl$onAccountReset$1.Z$1;
                        z3 = messengerAuthInteractorImpl$onAccountReset$1.Z$0;
                        b.b(obj);
                        hl3Var = (hl3) obj;
                        if (!(hl3Var instanceof fl3)) {
                            this.a.getClass();
                            wl3Var = new wl3(AuthEnvironment.Production, ((fl3) hl3Var).a);
                        } else {
                            if (!(hl3Var instanceof gl3)) {
                                w511.b();
                                return null;
                            }
                            wl3Var = null;
                        }
                        this.c.getClass();
                        sjh sjhVar2 = uyj.a;
                        g6u g6uVar2 = o400.a;
                        MessengerAuthInteractorImpl$onAccountReset$2 messengerAuthInteractorImpl$onAccountReset$22 = new MessengerAuthInteractorImpl$onAccountReset$2(this, wl3Var, null);
                        messengerAuthInteractorImpl$onAccountReset$1.L$0 = null;
                        messengerAuthInteractorImpl$onAccountReset$1.Z$0 = z3;
                        messengerAuthInteractorImpl$onAccountReset$1.Z$1 = z2;
                        messengerAuthInteractorImpl$onAccountReset$1.label = 4;
                        return tje.k0(g6uVar2, messengerAuthInteractorImpl$onAccountReset$22, messengerAuthInteractorImpl$onAccountReset$1) != coroutineSingletons ? coroutineSingletons : zy11Var;
                    }
                    b.b(obj);
                }
                bool = (Boolean) obj;
                if (bool != null && (booleanValue = bool.booleanValue())) {
                    rol0 a = this.d.a();
                    messengerAuthInteractorImpl$onAccountReset$1.Z$0 = booleanValue;
                    messengerAuthInteractorImpl$onAccountReset$1.label = 2;
                    A = e.A(a, messengerAuthInteractorImpl$onAccountReset$1);
                    if (A != coroutineSingletons) {
                        z = booleanValue;
                        obj = A;
                        bool2 = (Boolean) obj;
                        if (bool2 != null) {
                            mth mthVar2 = this.f.f;
                            messengerAuthInteractorImpl$onAccountReset$1.Z$0 = z;
                            messengerAuthInteractorImpl$onAccountReset$1.Z$1 = booleanValue2;
                            messengerAuthInteractorImpl$onAccountReset$1.label = 3;
                            y = e.y(mthVar2, messengerAuthInteractorImpl$onAccountReset$1);
                            if (y != coroutineSingletons) {
                            }
                        }
                    }
                }
            }
        }
        messengerAuthInteractorImpl$onAccountReset$1 = new MessengerAuthInteractorImpl$onAccountReset$1(this, (ContinuationImpl) continuation);
        Object obj2 = messengerAuthInteractorImpl$onAccountReset$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = messengerAuthInteractorImpl$onAccountReset$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        bool = (Boolean) obj2;
        if (bool != null) {
            rol0 a2 = this.d.a();
            messengerAuthInteractorImpl$onAccountReset$1.Z$0 = booleanValue;
            messengerAuthInteractorImpl$onAccountReset$1.label = 2;
            A = e.A(a2, messengerAuthInteractorImpl$onAccountReset$1);
            if (A != coroutineSingletons) {
            }
        }
    }

    public final void b() {
        wl3 wl3Var;
        long Lg = this.g.Lg();
        if (Lg == 0) {
            wl3Var = null;
        } else {
            this.a.getClass();
            wl3Var = new wl3(AuthEnvironment.Production, Lg);
        }
        new jb7(this.b).r(wl3Var);
    }
}
