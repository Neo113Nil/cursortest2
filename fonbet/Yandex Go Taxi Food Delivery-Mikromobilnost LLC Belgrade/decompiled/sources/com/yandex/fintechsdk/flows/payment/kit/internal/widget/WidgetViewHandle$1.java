package com.yandex.fintechsdk.flows.payment.kit.internal.widget;

import android.content.Context;
import android.os.SystemClock;
import com.yandex.fintechsdk.data.auth.api.TokenSource;
import com.yandex.fintechsdk.entities.environment.DefaultEnvironment;
import com.yandex.fintechsdk.flows.payment.kit.api.model.Payer;
import defpackage.ao90;
import defpackage.bvu0;
import defpackage.d151;
import defpackage.dn90;
import defpackage.do90;
import defpackage.ek;
import defpackage.g6u;
import defpackage.gp90;
import defpackage.hk3;
import defpackage.hn90;
import defpackage.m7b;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.qk3;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uo90;
import defpackage.uyj;
import defpackage.wls;
import defpackage.z22;
import defpackage.zn90;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.fintechsdk.flows.payment.kit.internal.widget.WidgetViewHandle$1", f = "WidgetViewHandle.kt", l = {59}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class WidgetViewHandle$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ e this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.yandex.fintechsdk.flows.payment.kit.internal.widget.WidgetViewHandle$1$1", f = "WidgetViewHandle.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.yandex.fintechsdk.flows.payment.kit.internal.widget.WidgetViewHandle$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ e this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(e eVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((tse) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            e eVar = this.this$0;
            eVar.g = true;
            tse tseVar = eVar.h;
            if (tseVar != null) {
                eVar.a(tseVar, true);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetViewHandle$1(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WidgetViewHandle$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WidgetViewHandle$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0119 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        g6u g6uVar;
        AnonymousClass1 anonymousClass1;
        Long m;
        boolean z;
        String str;
        String str2;
        Context context;
        zn90 zn90Var;
        hn90 hn90Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d151 d151Var = this.this$0.b;
            hk3 hk3Var = d151Var.b;
            z22 z22Var = d151Var.a;
            Payer payer = d151Var.g;
            String uid = payer.getUid();
            if (uid != null && (m = bvu0.m(10, uid)) != null) {
                long longValue = m.longValue();
                String oauthToken = payer.getOauthToken();
                if (oauthToken != null) {
                    hk3Var.a(new qk3(new ek(oauthToken, longValue), TokenSource.HOST_PASSPORT));
                } else {
                    dn90 dn90Var = d151Var.e;
                    if (dn90Var == null) {
                        ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(new ao90("Отсутствует паспорт адаптер, подключите зависимость в вашем gradle файле"));
                        str2 = null;
                    } else {
                        m7b m7bVar = new m7b(new uo90(z22Var, 0), new uo90(z22Var, 3));
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        try {
                            context = d151Var.c;
                            zn90Var = d151Var.f;
                            hn90Var = (hn90) dn90Var;
                            z = false;
                        } catch (Exception e) {
                            e = e;
                            z = false;
                        } catch (NoSuchMethodError unused) {
                            z = false;
                        }
                        try {
                            str = hn90Var.c(context, longValue, zn90Var.a, zn90Var.b, d151Var.d == DefaultEnvironment.TESTING, false, m7bVar);
                            ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(do90.c);
                        } catch (Exception e2) {
                            e = e2;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "Пользователь не авторизован";
                            }
                            ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(new ao90(message));
                            str = null;
                            Pair pair = new Pair(str, Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                            str2 = (String) pair.getFirst();
                            long longValue2 = ((Number) pair.getSecond()).longValue();
                            if (str2 != null) {
                            }
                            ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(new gp90(longValue2, z));
                            if (str2 != null) {
                            }
                            sjh sjhVar = uyj.a;
                            g6uVar = o400.a;
                            anonymousClass1 = new AnonymousClass1(this.this$0, null);
                            this.label = 1;
                            if (tje.k0(g6uVar, anonymousClass1, this) == coroutineSingletons) {
                            }
                            return zy11.a;
                        } catch (NoSuchMethodError unused2) {
                            ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(new ao90("Метод отсутствует в паспорт адаптере, проверьте версию адаптера"));
                            str = null;
                            Pair pair2 = new Pair(str, Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                            str2 = (String) pair2.getFirst();
                            long longValue22 = ((Number) pair2.getSecond()).longValue();
                            if (str2 != null) {
                            }
                            ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(new gp90(longValue22, z));
                            if (str2 != null) {
                            }
                            sjh sjhVar2 = uyj.a;
                            g6uVar = o400.a;
                            anonymousClass1 = new AnonymousClass1(this.this$0, null);
                            this.label = 1;
                            if (tje.k0(g6uVar, anonymousClass1, this) == coroutineSingletons) {
                            }
                            return zy11.a;
                        }
                        Pair pair22 = new Pair(str, Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                        str2 = (String) pair22.getFirst();
                        long longValue222 = ((Number) pair22.getSecond()).longValue();
                        if (str2 != null) {
                            z = true;
                        }
                        ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(new gp90(longValue222, z));
                    }
                    if (str2 != null) {
                        hk3Var.a(new qk3(new ek(str2, longValue), TokenSource.PASSPORT));
                    }
                }
            }
            sjh sjhVar22 = uyj.a;
            g6uVar = o400.a;
            anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (tje.k0(g6uVar, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
