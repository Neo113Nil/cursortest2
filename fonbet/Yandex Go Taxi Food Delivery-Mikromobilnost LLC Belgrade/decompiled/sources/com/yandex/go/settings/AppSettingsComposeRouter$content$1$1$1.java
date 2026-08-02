package com.yandex.go.settings;

import com.yandex.go.settings.hidephoneinfo.experiments.InAppOnlySettingsToggleExperiment;
import defpackage.aba0;
import defpackage.as21;
import defpackage.b7p0;
import defpackage.fx2;
import defpackage.gx2;
import defpackage.hx2;
import defpackage.ix2;
import defpackage.jer0;
import defpackage.jx2;
import defpackage.ker0;
import defpackage.kt00;
import defpackage.kx2;
import defpackage.mvg;
import defpackage.n8z;
import defpackage.nao0;
import defpackage.ny61;
import defpackage.o8z;
import defpackage.q6r0;
import defpackage.qqt0;
import defpackage.qv10;
import defpackage.s8r0;
import defpackage.sw2;
import defpackage.t8r0;
import defpackage.tis0;
import defpackage.tse;
import defpackage.tse0;
import defpackage.u8r0;
import defpackage.uw2;
import defpackage.v8r0;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.HashMap;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.settings.AppSettingsComposeRouter$content$1$1$1", f = "AppSettingsComposeRouter.kt", l = {67}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class AppSettingsComposeRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ kx2 $it;
    int label;
    final /* synthetic */ uw2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppSettingsComposeRouter$content$1$1$1(uw2 uw2Var, kx2 kx2Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = uw2Var;
        this.$it = kx2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AppSettingsComposeRouter$content$1$1$1(this.this$0, this.$it, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AppSettingsComposeRouter$content$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01e0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01e1 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        uw2 uw2Var = this.this$0;
        com.yandex.go.settings.domain.a aVar = uw2Var.I;
        kx2 kx2Var = this.$it;
        sw2 sw2Var = uw2Var.Q;
        this.label = 1;
        tis0 tis0Var = aVar.a;
        if (kx2Var instanceof gx2) {
            gx2 gx2Var = (gx2) kx2Var;
            if (!tis0Var.b) {
                tis0Var.b = true;
                q6r0 q6r0Var = (q6r0) tis0Var.c;
                double d = gx2Var.a;
                String str2 = gx2Var.b;
                q6r0Var.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("time_since_open_screen", Double.valueOf(d));
                hashMap.put("source", str2);
                q6r0Var.a.a("Settings.Loaded", hashMap, 1, new HashMap());
            }
        } else {
            if (!(kx2Var instanceof hx2)) {
                if (kx2Var instanceof fx2) {
                    tis0Var.Y((jx2) kx2Var);
                    b = aVar.a((fx2) kx2Var, sw2Var, this);
                } else {
                    if (!(kx2Var instanceof ix2)) {
                        w511.b();
                        return null;
                    }
                    tis0Var.Y((jx2) kx2Var);
                    ix2 ix2Var = (ix2) kx2Var;
                    qqt0 qqt0Var = aVar.e;
                    n8z n8zVar = aVar.h;
                    aba0 aba0Var = aVar.f;
                    as21 as21Var = aVar.d;
                    u8r0 u8r0Var = ix2Var.a;
                    boolean z = ix2Var.b;
                    switch (ker0.a[u8r0Var.a.ordinal()]) {
                        case 6:
                            boolean a = qqt0Var.a();
                            qqt0Var.a.e("FILED_SPLASH_HAPTIC_ENABLED", z);
                            tis0Var.X(u8r0Var, a, z);
                            break;
                        case 7:
                            boolean a2 = aba0Var.a();
                            qv10.B(z, aba0Var.b, null);
                            aba0Var.a.e("FIELD_HIDE_BALANCE", z);
                            if (!z) {
                                aba0Var.b(false);
                            }
                            tis0Var.X(u8r0Var, a2, z);
                            break;
                        case 8:
                            boolean a3 = as21Var.a("FIELD_TRAFFICS_ON", false);
                            kt00 kt00Var = aVar.g;
                            kt00Var.a.e("FIELD_TRAFFICS_ON", z);
                            kt00Var.a();
                            tis0Var.X(u8r0Var, a3, z);
                            break;
                        case 9:
                            o8z o8zVar = (o8z) n8zVar;
                            boolean a4 = o8zVar.a();
                            o8zVar.b.u("ru.yandex.taxi.map.overlay.diagnostic.IS_ENABLED", z);
                            tis0Var.X(u8r0Var, a4, z);
                            break;
                        case 10:
                            jer0 jer0Var = aVar.l;
                            boolean booleanValue = ((Boolean) jer0Var.c.getValue()).booleanValue();
                            if (z && !booleanValue) {
                                jer0Var.b(true);
                                sw2Var.f((InAppOnlySettingsToggleExperiment) aVar.n.a.b(), new nao0(29, aVar, u8r0Var), new b7p0(18, aVar));
                                break;
                            } else {
                                jer0Var.a(z);
                                tis0Var.X(u8r0Var, booleanValue, z);
                                break;
                            }
                        case 11:
                            boolean a5 = as21Var.a("FIELD_DONT_SMS", false);
                            if (aVar.b.update(z)) {
                                tis0Var.X(u8r0Var, a5, z);
                                break;
                            }
                            break;
                        case 12:
                            boolean a6 = as21Var.a("FIELD_DONT_SHOW_PROMO_PUSHES", false);
                            if (a6 != z) {
                                as21Var.e("FIELD_DONT_SHOW_PROMO_PUSHES", z);
                                tis0Var.X(u8r0Var, a6, z);
                                break;
                            }
                            break;
                        case 13:
                            b = aVar.b(u8r0Var, z, sw2Var, this);
                            break;
                        case 14:
                            boolean a7 = as21Var.a("FIELD_DONT_CALL", false);
                            if (aVar.c.update(z)) {
                                tis0Var.X(u8r0Var, a7, z);
                                break;
                            }
                            break;
                    }
                }
                return b != coroutineSingletons ? coroutineSingletons : zy11Var;
            }
            v8r0 v8r0Var = ((hx2) kx2Var).a;
            tis0Var.getClass();
            String analyticsId = v8r0Var.getId().getAnalyticsId();
            if (((LinkedHashSet) tis0Var.w).add(analyticsId)) {
                q6r0 q6r0Var2 = (q6r0) tis0Var.c;
                String U = tis0.U(v8r0Var);
                String title = v8r0Var.getTitle();
                if (v8r0Var instanceof u8r0) {
                    str = ((u8r0) v8r0Var).d ? "on" : "off";
                } else {
                    if (!(v8r0Var instanceof t8r0) && !(v8r0Var instanceof s8r0)) {
                        w511.b();
                        return null;
                    }
                    str = "subscreen";
                }
                String subtitle = v8r0Var.getSubtitle();
                String str3 = subtitle.length() > 0 ? subtitle : null;
                q6r0Var2.getClass();
                HashMap hashMap2 = new HashMap();
                hashMap2.put("item_type", U);
                hashMap2.put("item_id", analyticsId);
                hashMap2.put("title", title);
                if (str3 != null) {
                    hashMap2.put("subtitle", str3);
                }
                q6r0Var2.a.a("Settings.MenuItem.Shown", hashMap2, 1, tse0.r("current_status", hashMap2, str));
            }
        }
        b = zy11Var;
        if (b != coroutineSingletons) {
        }
    }
}
