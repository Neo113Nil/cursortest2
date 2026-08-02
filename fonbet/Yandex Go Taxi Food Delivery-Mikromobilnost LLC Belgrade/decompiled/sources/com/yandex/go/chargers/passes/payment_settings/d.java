package com.yandex.go.chargers.passes.payment_settings;

import android.content.Context;
import com.yandex.go.chargers.notification.ChargersNotification;
import com.yandex.go.chargers.passes.data.r0;
import defpackage.cy9;
import defpackage.d6a;
import defpackage.ela;
import defpackage.f1h0;
import defpackage.fha;
import defpackage.iga;
import defpackage.iha;
import defpackage.ila;
import defpackage.j6a;
import defpackage.jl40;
import defpackage.k6a;
import defpackage.kha;
import defpackage.kyh0;
import defpackage.ly9;
import defpackage.m950;
import defpackage.nha;
import defpackage.ny61;
import defpackage.oha;
import defpackage.qka;
import defpackage.qs9;
import defpackage.qu;
import defpackage.rja;
import defpackage.sha;
import defpackage.tha;
import defpackage.tje;
import defpackage.uha;
import defpackage.uja;
import defpackage.uka;
import defpackage.vha;
import defpackage.vja;
import defpackage.vka;
import defpackage.w511;
import defpackage.wja;
import defpackage.xfa;
import defpackage.yvf0;
import defpackage.zka;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes12.dex */
public final class d {
    public final r0 a;
    public final qka b;
    public final rja c;
    public final yvf0 d;
    public final fha e;
    public final kha f;

    public d(r0 r0Var, qka qkaVar, rja rjaVar, yvf0 yvf0Var, fha fhaVar, kha khaVar) {
        this.a = r0Var;
        this.b = qkaVar;
        this.c = rjaVar;
        this.d = yvf0Var;
        this.e = fhaVar;
        this.f = khaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, iha ihaVar, ContinuationImpl continuationImpl) {
        ChargersPassesPaymentSettingsUiActionInteractor$disableAutoRenew$1 chargersPassesPaymentSettingsUiActionInteractor$disableAutoRenew$1;
        int i;
        wja wjaVar;
        if (continuationImpl instanceof ChargersPassesPaymentSettingsUiActionInteractor$disableAutoRenew$1) {
            chargersPassesPaymentSettingsUiActionInteractor$disableAutoRenew$1 = (ChargersPassesPaymentSettingsUiActionInteractor$disableAutoRenew$1) continuationImpl;
            int i2 = chargersPassesPaymentSettingsUiActionInteractor$disableAutoRenew$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersPassesPaymentSettingsUiActionInteractor$disableAutoRenew$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersPassesPaymentSettingsUiActionInteractor$disableAutoRenew$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersPassesPaymentSettingsUiActionInteractor$disableAutoRenew$1.label;
                fha fhaVar = this.e;
                if (i != 0) {
                    kotlin.b.b(obj);
                    fhaVar.a(true);
                    chargersPassesPaymentSettingsUiActionInteractor$disableAutoRenew$1.L$0 = str;
                    chargersPassesPaymentSettingsUiActionInteractor$disableAutoRenew$1.L$1 = ihaVar;
                    chargersPassesPaymentSettingsUiActionInteractor$disableAutoRenew$1.label = 1;
                    obj = this.a.g(str, chargersPassesPaymentSettingsUiActionInteractor$disableAutoRenew$1, false);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ihaVar = (iha) chargersPassesPaymentSettingsUiActionInteractor$disableAutoRenew$1.L$1;
                    str = (String) chargersPassesPaymentSettingsUiActionInteractor$disableAutoRenew$1.L$0;
                    kotlin.b.b(obj);
                }
                wjaVar = (wja) obj;
                int i3 = 3;
                if (!(wjaVar instanceof vja)) {
                    k6a k6aVar = ((vja) wjaVar).a;
                    if (k6aVar != null) {
                        j6a.b((j6a) this.d.get(), k6aVar);
                    }
                    nha nhaVar = (nha) ihaVar;
                    oha ohaVar = nhaVar.a;
                    tje.N(ohaVar.o(), null, null, new ChargersPassesPaymentSettingsRouter$InnerNavigator$refresh$1(ohaVar, str, nhaVar, null), 3);
                } else {
                    if (!(wjaVar instanceof uja)) {
                        w511.b();
                        return null;
                    }
                    cy9 cy9Var = ((uja) wjaVar).a;
                    oha ohaVar2 = ((nha) ihaVar).a;
                    ohaVar2.A((m950) ohaVar2.H.get(), new ly9(cy9Var), new qs9(ohaVar2, i3));
                }
                fhaVar.a(false);
                return zy11.a;
            }
        }
        chargersPassesPaymentSettingsUiActionInteractor$disableAutoRenew$1 = new ChargersPassesPaymentSettingsUiActionInteractor$disableAutoRenew$1(this, continuationImpl);
        Object obj2 = chargersPassesPaymentSettingsUiActionInteractor$disableAutoRenew$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersPassesPaymentSettingsUiActionInteractor$disableAutoRenew$1.label;
        fha fhaVar2 = this.e;
        if (i != 0) {
        }
        wjaVar = (wja) obj2;
        int i32 = 3;
        if (!(wjaVar instanceof vja)) {
        }
        fhaVar2.a(false);
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006b, code lost:
    
        if (r5 == r4) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, iha ihaVar, ContinuationImpl continuationImpl) {
        ChargersPassesPaymentSettingsUiActionInteractor$enableAutoRenew$1 chargersPassesPaymentSettingsUiActionInteractor$enableAutoRenew$1;
        int i;
        iha ihaVar2;
        Object g;
        boolean z;
        String str2 = str;
        if (continuationImpl instanceof ChargersPassesPaymentSettingsUiActionInteractor$enableAutoRenew$1) {
            chargersPassesPaymentSettingsUiActionInteractor$enableAutoRenew$1 = (ChargersPassesPaymentSettingsUiActionInteractor$enableAutoRenew$1) continuationImpl;
            int i2 = chargersPassesPaymentSettingsUiActionInteractor$enableAutoRenew$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersPassesPaymentSettingsUiActionInteractor$enableAutoRenew$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersPassesPaymentSettingsUiActionInteractor$enableAutoRenew$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersPassesPaymentSettingsUiActionInteractor$enableAutoRenew$1.label;
                fha fhaVar = this.e;
                if (i != 0) {
                    kotlin.b.b(obj);
                    fhaVar.a(true);
                    chargersPassesPaymentSettingsUiActionInteractor$enableAutoRenew$1.L$0 = str2;
                    ihaVar2 = ihaVar;
                    chargersPassesPaymentSettingsUiActionInteractor$enableAutoRenew$1.L$1 = ihaVar2;
                    chargersPassesPaymentSettingsUiActionInteractor$enableAutoRenew$1.label = 1;
                    g = this.a.g(str2, chargersPassesPaymentSettingsUiActionInteractor$enableAutoRenew$1, true);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    iha ihaVar3 = (iha) chargersPassesPaymentSettingsUiActionInteractor$enableAutoRenew$1.L$1;
                    String str3 = (String) chargersPassesPaymentSettingsUiActionInteractor$enableAutoRenew$1.L$0;
                    kotlin.b.b(obj);
                    ihaVar2 = ihaVar3;
                    str2 = str3;
                    g = obj;
                }
                wja wjaVar = (wja) g;
                z = wjaVar instanceof vja;
                zy11 zy11Var = zy11.a;
                yvf0 yvf0Var = this.d;
                if (z) {
                    if (!(wjaVar instanceof uja)) {
                        w511.b();
                        return null;
                    }
                    fhaVar.a(false);
                    j6a j6aVar = (j6a) yvf0Var.get();
                    j6aVar.getClass();
                    Context context = j6aVar.a;
                    j6aVar.a(new ChargersNotification(context, "ChargersNotification", context.getString(kyh0.chargers_something_wrong), null, new d6a(f1h0.ic_failed_change), j6aVar.b, 0, 64, null), null);
                    return zy11Var;
                }
                k6a k6aVar = ((vja) wjaVar).a;
                if (k6aVar != null) {
                    j6a.b((j6a) yvf0Var.get(), k6aVar);
                }
                nha nhaVar = (nha) ihaVar2;
                oha ohaVar = nhaVar.a;
                tje.N(ohaVar.o(), null, null, new ChargersPassesPaymentSettingsRouter$InnerNavigator$refresh$1(ohaVar, str2, nhaVar, null), 3);
                this.b.a(true);
                chargersPassesPaymentSettingsUiActionInteractor$enableAutoRenew$1.L$0 = null;
                chargersPassesPaymentSettingsUiActionInteractor$enableAutoRenew$1.L$1 = null;
                chargersPassesPaymentSettingsUiActionInteractor$enableAutoRenew$1.L$2 = null;
                chargersPassesPaymentSettingsUiActionInteractor$enableAutoRenew$1.label = 2;
                Object emit = this.c.a.emit(zy11Var, chargersPassesPaymentSettingsUiActionInteractor$enableAutoRenew$1);
                return emit == coroutineSingletons ? coroutineSingletons : emit;
            }
        }
        chargersPassesPaymentSettingsUiActionInteractor$enableAutoRenew$1 = new ChargersPassesPaymentSettingsUiActionInteractor$enableAutoRenew$1(this, continuationImpl);
        Object obj2 = chargersPassesPaymentSettingsUiActionInteractor$enableAutoRenew$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersPassesPaymentSettingsUiActionInteractor$enableAutoRenew$1.label;
        fha fhaVar2 = this.e;
        if (i != 0) {
        }
        wja wjaVar2 = (wja) g;
        z = wjaVar2 instanceof vja;
        zy11 zy11Var2 = zy11.a;
        yvf0 yvf0Var2 = this.d;
        if (z) {
        }
    }

    public final Object c(String str, vha vhaVar, iha ihaVar, SuspendLambda suspendLambda) {
        boolean z = vhaVar instanceof sha;
        int i = 9;
        zy11 zy11Var = zy11.a;
        if (z) {
            ((nha) ihaVar).a.r(new qu(i));
            return zy11Var;
        }
        if (!(vhaVar instanceof tha)) {
            if (jl40.l(vhaVar, uha.a)) {
                this.e.a(true);
                return this.f.a.emit(zy11Var, suspendLambda);
            }
            w511.b();
            return null;
        }
        ila ilaVar = ((tha) vhaVar).a;
        if (ilaVar instanceof vka) {
            ((nha) ihaVar).a.r(new qu(i));
            return zy11Var;
        }
        if (!(ilaVar instanceof zka)) {
            return ilaVar instanceof ela ? b(str, ihaVar, suspendLambda) : ilaVar instanceof uka ? a(str, ihaVar, suspendLambda) : zy11Var;
        }
        iga igaVar = ((zka) ilaVar).b;
        oha ohaVar = ((nha) ihaVar).a;
        ohaVar.A((m950) ohaVar.I.get(), new xfa(str, igaVar), new c(ohaVar, str, ihaVar));
        return zy11Var;
    }
}
