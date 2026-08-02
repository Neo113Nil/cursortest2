package com.yandex.mob;

import com.yandex.mob.domain.q;
import com.yandex.mob.domain.u;
import com.yandex.mob.reporting.MobTrigger;
import defpackage.jl40;
import defpackage.jn20;
import defpackage.kn20;
import defpackage.ln20;
import defpackage.mn20;
import defpackage.ny61;
import defpackage.oo20;
import defpackage.rot;
import defpackage.vpr;
import defpackage.w511;
import defpackage.xo20;
import defpackage.zy11;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class g implements vpr {
    public final /* synthetic */ oo20 a;

    public g(oo20 oo20Var) {
        this.a = oo20Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x012c, code lost:
    
        if (r10.c(r11, r0) == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0111, code lost:
    
        if (r10.q(r11, r0) == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00be, code lost:
    
        if (r11 == r1) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(mn20 mn20Var, Continuation continuation) {
        MobMainInitializer$requestAndSaveCountryIso$3$emit$1 mobMainInitializer$requestAndSaveCountryIso$3$emit$1;
        int i;
        rot rotVar;
        String str;
        mn20 mn20Var2;
        rot rotVar2;
        ln20 ln20Var;
        if (continuation instanceof MobMainInitializer$requestAndSaveCountryIso$3$emit$1) {
            mobMainInitializer$requestAndSaveCountryIso$3$emit$1 = (MobMainInitializer$requestAndSaveCountryIso$3$emit$1) continuation;
            int i2 = mobMainInitializer$requestAndSaveCountryIso$3$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobMainInitializer$requestAndSaveCountryIso$3$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mobMainInitializer$requestAndSaveCountryIso$3$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobMainInitializer$requestAndSaveCountryIso$3$emit$1.label;
                zy11 zy11Var = zy11.a;
                oo20 oo20Var = this.a;
                switch (i) {
                    case 0:
                        kotlin.b.b(obj);
                        if (mn20Var instanceof kn20) {
                            xo20 xo20Var = (xo20) oo20Var;
                            rot c = xo20Var.c();
                            com.yandex.mob.reporting.a b = xo20Var.b();
                            kn20 kn20Var = (kn20) mn20Var;
                            String b2 = kn20Var.b();
                            String a = kn20Var.a();
                            mobMainInitializer$requestAndSaveCountryIso$3$emit$1.L$0 = null;
                            mobMainInitializer$requestAndSaveCountryIso$3$emit$1.L$1 = c;
                            mobMainInitializer$requestAndSaveCountryIso$3$emit$1.label = 1;
                            Serializable e = b.e(a, b2, mobMainInitializer$requestAndSaveCountryIso$3$emit$1);
                            if (e != coroutineSingletons) {
                                obj = e;
                                rotVar = c;
                                rotVar.b((Pair) obj);
                                return zy11Var;
                            }
                        } else {
                            if (!(mn20Var instanceof ln20)) {
                                w511.b();
                                return null;
                            }
                            com.yandex.mob.datastore.d a2 = ((xo20) oo20Var).a();
                            mobMainInitializer$requestAndSaveCountryIso$3$emit$1.L$0 = mn20Var;
                            mobMainInitializer$requestAndSaveCountryIso$3$emit$1.label = 2;
                            obj = a2.d(mobMainInitializer$requestAndSaveCountryIso$3$emit$1);
                            break;
                        }
                    case 1:
                        rotVar = (rot) mobMainInitializer$requestAndSaveCountryIso$3$emit$1.L$1;
                        kotlin.b.b(obj);
                        rotVar.b((Pair) obj);
                        return zy11Var;
                    case 2:
                        mn20Var = (mn20) mobMainInitializer$requestAndSaveCountryIso$3$emit$1.L$0;
                        kotlin.b.b(obj);
                        str = (String) obj;
                        xo20 xo20Var2 = (xo20) oo20Var;
                        rot c2 = xo20Var2.c();
                        com.yandex.mob.reporting.a b3 = xo20Var2.b();
                        jn20 jn20Var = ((ln20) mn20Var).a;
                        mobMainInitializer$requestAndSaveCountryIso$3$emit$1.L$0 = mn20Var;
                        mobMainInitializer$requestAndSaveCountryIso$3$emit$1.L$1 = str;
                        mobMainInitializer$requestAndSaveCountryIso$3$emit$1.L$2 = c2;
                        mobMainInitializer$requestAndSaveCountryIso$3$emit$1.label = 3;
                        obj = b3.f(jn20Var, mobMainInitializer$requestAndSaveCountryIso$3$emit$1);
                        if (obj != coroutineSingletons) {
                            mn20Var2 = mn20Var;
                            rotVar2 = c2;
                            rotVar2.b((Pair) obj);
                            ln20Var = (ln20) mn20Var2;
                            if (!jl40.l(str, ln20Var.a.a)) {
                                com.yandex.mob.datastore.d a3 = ((xo20) oo20Var).a();
                                String str2 = ln20Var.a.a;
                                mobMainInitializer$requestAndSaveCountryIso$3$emit$1.L$0 = null;
                                mobMainInitializer$requestAndSaveCountryIso$3$emit$1.L$1 = null;
                                mobMainInitializer$requestAndSaveCountryIso$3$emit$1.L$2 = null;
                                mobMainInitializer$requestAndSaveCountryIso$3$emit$1.label = 4;
                                break;
                            }
                        }
                    case 3:
                        rotVar2 = (rot) mobMainInitializer$requestAndSaveCountryIso$3$emit$1.L$2;
                        str = (String) mobMainInitializer$requestAndSaveCountryIso$3$emit$1.L$1;
                        mn20Var2 = (mn20) mobMainInitializer$requestAndSaveCountryIso$3$emit$1.L$0;
                        kotlin.b.b(obj);
                        rotVar2.b((Pair) obj);
                        ln20Var = (ln20) mn20Var2;
                        if (!jl40.l(str, ln20Var.a.a)) {
                        }
                    case 4:
                        kotlin.b.b(obj);
                        u uVar = (u) ((xo20) oo20Var).y.getValue();
                        MobTrigger mobTrigger = MobTrigger.CountryUpdate;
                        mobMainInitializer$requestAndSaveCountryIso$3$emit$1.L$0 = null;
                        mobMainInitializer$requestAndSaveCountryIso$3$emit$1.L$1 = null;
                        mobMainInitializer$requestAndSaveCountryIso$3$emit$1.label = 5;
                        break;
                    case 5:
                        kotlin.b.b(obj);
                        q qVar = (q) ((xo20) oo20Var).A.getValue();
                        MobTrigger mobTrigger2 = MobTrigger.CountryUpdate;
                        mobMainInitializer$requestAndSaveCountryIso$3$emit$1.L$0 = null;
                        mobMainInitializer$requestAndSaveCountryIso$3$emit$1.L$1 = null;
                        mobMainInitializer$requestAndSaveCountryIso$3$emit$1.label = 6;
                        return qVar.e(mobTrigger2, mobMainInitializer$requestAndSaveCountryIso$3$emit$1) == coroutineSingletons ? coroutineSingletons : zy11Var;
                    case 6:
                        kotlin.b.b(obj);
                        return zy11Var;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        mobMainInitializer$requestAndSaveCountryIso$3$emit$1 = new MobMainInitializer$requestAndSaveCountryIso$3$emit$1(this, continuation);
        Object obj2 = mobMainInitializer$requestAndSaveCountryIso$3$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobMainInitializer$requestAndSaveCountryIso$3$emit$1.label;
        zy11 zy11Var2 = zy11.a;
        oo20 oo20Var2 = this.a;
        switch (i) {
        }
    }
}
