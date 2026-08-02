package com.yandex.go.payments.paymentlist.domain;

import com.yandex.go.payments.addmethod.analytics.PaymentMethodsAnalytics$PaymentMethodsScreen;
import defpackage.a000;
import defpackage.a4v0;
import defpackage.avj0;
import defpackage.bjm0;
import defpackage.dfm0;
import defpackage.ec80;
import defpackage.ep51;
import defpackage.evz;
import defpackage.fl8;
import defpackage.g9a0;
import defpackage.h3y;
import defpackage.hxx;
import defpackage.jst;
import defpackage.kyh0;
import defpackage.lea0;
import defpackage.m950;
import defpackage.mcp;
import defpackage.mda0;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.oz01;
import defpackage.p1c;
import defpackage.pep0;
import defpackage.tls;
import defpackage.um50;
import defpackage.vbn;
import defpackage.xe91;
import defpackage.yvf0;
import defpackage.zuj0;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public final class c {
    public final zuj0 a;
    public final oz01 b;
    public final dfm0 c;
    public final g9a0 d;
    public final h3y e;
    public final com.yandex.go.loyalty.impl.common.domain.m f;
    public final h3y g;
    public final yvf0 h;
    public final h3y i;
    public final oep0 j;

    public c(zuj0 zuj0Var, oz01 oz01Var, dfm0 dfm0Var, g9a0 g9a0Var, h3y h3yVar, com.yandex.go.loyalty.impl.common.domain.m mVar, h3y h3yVar2, ec80 ec80Var, h3y h3yVar3, oep0 oep0Var) {
        this.a = zuj0Var;
        this.b = oz01Var;
        this.c = dfm0Var;
        this.d = g9a0Var;
        this.e = h3yVar;
        this.f = mVar;
        this.g = h3yVar2;
        this.h = ec80Var;
        this.i = h3yVar3;
        this.j = oep0Var;
    }

    public final Object a(lea0 lea0Var, String str, tls tlsVar, SuspendLambda suspendLambda) {
        if (lea0Var instanceof fl8) {
            return b((fl8) lea0Var, str, tlsVar, suspendLambda);
        }
        if (lea0Var instanceof bjm0) {
            return f((bjm0) lea0Var, tlsVar, suspendLambda);
        }
        if (lea0Var instanceof a000) {
            return d((a000) lea0Var, tlsVar, suspendLambda);
        }
        if (lea0Var instanceof ep51) {
            return h((ep51) lea0Var, tlsVar, suspendLambda);
        }
        if (lea0Var instanceof um50) {
            return e((um50) lea0Var, tlsVar, suspendLambda);
        }
        if (!(lea0Var instanceof p1c) && !(lea0Var instanceof vbn) && !(lea0Var instanceof mcp)) {
            jst.e.q("Unknown payment option type " + lea0Var.c());
            return zy11.a;
        }
        return g(lea0Var, tlsVar, suspendLambda);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(3:11|12|13)(2:15|16))(2:17|18))(3:24|25|(2:27|22))|19|20))|32|6|7|(0)(0)|19|20|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b3, code lost:
    
        if (r10.invoke(r0) != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b9, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ba, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0052, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0083, code lost:
    
        ((defpackage.pep0) r7.j).f((defpackage.m950) r7.h.get(), new defpackage.lda0(r11), defpackage.hxx.a);
        r7 = defpackage.xe91.i(r9);
        r8.getClass();
        r3.e(r7, "error", ru.yandex.taxi.gopayments.model.PaymentMethod$Type.CARD.getCode());
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(fl8 fl8Var, String str, tls tlsVar, ContinuationImpl continuationImpl) {
        DeletePaymentMethodsDelegate$unbindCard$1 deletePaymentMethodsDelegate$unbindCard$1;
        int i;
        if (continuationImpl instanceof DeletePaymentMethodsDelegate$unbindCard$1) {
            deletePaymentMethodsDelegate$unbindCard$1 = (DeletePaymentMethodsDelegate$unbindCard$1) continuationImpl;
            int i2 = deletePaymentMethodsDelegate$unbindCard$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deletePaymentMethodsDelegate$unbindCard$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deletePaymentMethodsDelegate$unbindCard$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deletePaymentMethodsDelegate$unbindCard$1.label;
                g9a0 g9a0Var = this.d;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.go.payments.cards.data.j jVar = (com.yandex.go.payments.cards.data.j) this.g.get();
                    String str2 = fl8Var.a;
                    deletePaymentMethodsDelegate$unbindCard$1.L$0 = fl8Var;
                    deletePaymentMethodsDelegate$unbindCard$1.L$1 = str;
                    deletePaymentMethodsDelegate$unbindCard$1.L$2 = tlsVar;
                    deletePaymentMethodsDelegate$unbindCard$1.label = 1;
                    if (jVar.a(str2, deletePaymentMethodsDelegate$unbindCard$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    tlsVar = (tls) deletePaymentMethodsDelegate$unbindCard$1.L$2;
                    str = (String) deletePaymentMethodsDelegate$unbindCard$1.L$1;
                    fl8Var = (fl8) deletePaymentMethodsDelegate$unbindCard$1.L$0;
                    kotlin.b.b(obj);
                }
                PaymentMethodsAnalytics$PaymentMethodsScreen i3 = xe91.i(str);
                fl8Var.getClass();
                g9a0Var.e(i3, "success", PaymentMethod$Type.CARD.getCode());
                deletePaymentMethodsDelegate$unbindCard$1.L$0 = null;
                deletePaymentMethodsDelegate$unbindCard$1.L$1 = null;
                deletePaymentMethodsDelegate$unbindCard$1.L$2 = null;
                deletePaymentMethodsDelegate$unbindCard$1.label = 2;
            }
        }
        deletePaymentMethodsDelegate$unbindCard$1 = new DeletePaymentMethodsDelegate$unbindCard$1(this, continuationImpl);
        Object obj2 = deletePaymentMethodsDelegate$unbindCard$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deletePaymentMethodsDelegate$unbindCard$1.label;
        g9a0 g9a0Var2 = this.d;
        if (i != 0) {
        }
        PaymentMethodsAnalytics$PaymentMethodsScreen i32 = xe91.i(str);
        fl8Var.getClass();
        g9a0Var2.e(i32, "success", PaymentMethod$Type.CARD.getCode());
        deletePaymentMethodsDelegate$unbindCard$1.L$0 = null;
        deletePaymentMethodsDelegate$unbindCard$1.L$1 = null;
        deletePaymentMethodsDelegate$unbindCard$1.L$2 = null;
        deletePaymentMethodsDelegate$unbindCard$1.label = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00af, code lost:
    
        if (r10.invoke(r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b1, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0081, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(evz evzVar, tls tlsVar, ContinuationImpl continuationImpl) {
        DeletePaymentMethodsDelegate$unbindLoyaltyProgram$1 deletePaymentMethodsDelegate$unbindLoyaltyProgram$1;
        int i;
        Object a;
        if (continuationImpl instanceof DeletePaymentMethodsDelegate$unbindLoyaltyProgram$1) {
            deletePaymentMethodsDelegate$unbindLoyaltyProgram$1 = (DeletePaymentMethodsDelegate$unbindLoyaltyProgram$1) continuationImpl;
            int i2 = deletePaymentMethodsDelegate$unbindLoyaltyProgram$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deletePaymentMethodsDelegate$unbindLoyaltyProgram$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deletePaymentMethodsDelegate$unbindLoyaltyProgram$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deletePaymentMethodsDelegate$unbindLoyaltyProgram$1.label;
                zuj0 zuj0Var = this.a;
                h3y h3yVar = this.i;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String name = evzVar.getName();
                    String id = evzVar.getId();
                    deletePaymentMethodsDelegate$unbindLoyaltyProgram$1.L$0 = null;
                    deletePaymentMethodsDelegate$unbindLoyaltyProgram$1.L$1 = tlsVar;
                    deletePaymentMethodsDelegate$unbindLoyaltyProgram$1.L$2 = null;
                    deletePaymentMethodsDelegate$unbindLoyaltyProgram$1.L$3 = null;
                    deletePaymentMethodsDelegate$unbindLoyaltyProgram$1.label = 1;
                    a = this.f.a(name, id, deletePaymentMethodsDelegate$unbindLoyaltyProgram$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        a = deletePaymentMethodsDelegate$unbindLoyaltyProgram$1.L$4;
                        kotlin.b.b(obj);
                        if (Result.a(a) != null) {
                            ((a4v0) h3yVar.get()).a(((avj0) zuj0Var).h(kyh0.unknown_error_description));
                        }
                        return zy11.a;
                    }
                    tlsVar = (tls) deletePaymentMethodsDelegate$unbindLoyaltyProgram$1.L$1;
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                }
                if (!(a instanceof Result.Failure)) {
                    ((a4v0) h3yVar.get()).a(((avj0) zuj0Var).h(kyh0.loyalty_notification_success_log_out));
                    deletePaymentMethodsDelegate$unbindLoyaltyProgram$1.L$0 = null;
                    deletePaymentMethodsDelegate$unbindLoyaltyProgram$1.L$1 = null;
                    deletePaymentMethodsDelegate$unbindLoyaltyProgram$1.L$2 = null;
                    deletePaymentMethodsDelegate$unbindLoyaltyProgram$1.L$3 = null;
                    deletePaymentMethodsDelegate$unbindLoyaltyProgram$1.L$4 = a;
                    deletePaymentMethodsDelegate$unbindLoyaltyProgram$1.L$5 = null;
                    deletePaymentMethodsDelegate$unbindLoyaltyProgram$1.label = 2;
                }
                if (Result.a(a) != null) {
                }
                return zy11.a;
            }
        }
        deletePaymentMethodsDelegate$unbindLoyaltyProgram$1 = new DeletePaymentMethodsDelegate$unbindLoyaltyProgram$1(this, continuationImpl);
        Object obj2 = deletePaymentMethodsDelegate$unbindLoyaltyProgram$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deletePaymentMethodsDelegate$unbindLoyaltyProgram$1.label;
        zuj0 zuj0Var2 = this.a;
        h3y h3yVar2 = this.i;
        if (i != 0) {
        }
        if (!(a instanceof Result.Failure)) {
        }
        if (Result.a(a) != null) {
        }
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0092, code lost:
    
        if (r8.invoke(r0) != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0094, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(a000 a000Var, tls tlsVar, ContinuationImpl continuationImpl) {
        DeletePaymentMethodsDelegate$unbindMBankAccount$1 deletePaymentMethodsDelegate$unbindMBankAccount$1;
        int i;
        Object o;
        if (continuationImpl instanceof DeletePaymentMethodsDelegate$unbindMBankAccount$1) {
            deletePaymentMethodsDelegate$unbindMBankAccount$1 = (DeletePaymentMethodsDelegate$unbindMBankAccount$1) continuationImpl;
            int i2 = deletePaymentMethodsDelegate$unbindMBankAccount$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deletePaymentMethodsDelegate$unbindMBankAccount$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deletePaymentMethodsDelegate$unbindMBankAccount$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deletePaymentMethodsDelegate$unbindMBankAccount$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    i iVar = (i) this.e.get();
                    String str = a000Var.a;
                    deletePaymentMethodsDelegate$unbindMBankAccount$1.L$0 = null;
                    deletePaymentMethodsDelegate$unbindMBankAccount$1.L$1 = tlsVar;
                    deletePaymentMethodsDelegate$unbindMBankAccount$1.label = 1;
                    o = iVar.o(str, deletePaymentMethodsDelegate$unbindMBankAccount$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    tlsVar = (tls) deletePaymentMethodsDelegate$unbindMBankAccount$1.L$1;
                    kotlin.b.b(obj);
                    o = ((Result) obj).getValue();
                }
                if (Result.a(o) != null) {
                    ((pep0) this.j).f((m950) this.h.get(), new mda0(((avj0) this.a).h(kyh0.unbind_mbank_account_error_message)), hxx.a);
                }
                deletePaymentMethodsDelegate$unbindMBankAccount$1.L$0 = null;
                deletePaymentMethodsDelegate$unbindMBankAccount$1.L$1 = null;
                deletePaymentMethodsDelegate$unbindMBankAccount$1.label = 2;
            }
        }
        deletePaymentMethodsDelegate$unbindMBankAccount$1 = new DeletePaymentMethodsDelegate$unbindMBankAccount$1(this, continuationImpl);
        Object obj2 = deletePaymentMethodsDelegate$unbindMBankAccount$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deletePaymentMethodsDelegate$unbindMBankAccount$1.label;
        if (i != 0) {
        }
        if (Result.a(o) != null) {
        }
        deletePaymentMethodsDelegate$unbindMBankAccount$1.L$0 = null;
        deletePaymentMethodsDelegate$unbindMBankAccount$1.L$1 = null;
        deletePaymentMethodsDelegate$unbindMBankAccount$1.label = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0092, code lost:
    
        if (r8.invoke(r0) != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0094, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(um50 um50Var, tls tlsVar, ContinuationImpl continuationImpl) {
        DeletePaymentMethodsDelegate$unbindNequiToken$1 deletePaymentMethodsDelegate$unbindNequiToken$1;
        int i;
        Object p;
        if (continuationImpl instanceof DeletePaymentMethodsDelegate$unbindNequiToken$1) {
            deletePaymentMethodsDelegate$unbindNequiToken$1 = (DeletePaymentMethodsDelegate$unbindNequiToken$1) continuationImpl;
            int i2 = deletePaymentMethodsDelegate$unbindNequiToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deletePaymentMethodsDelegate$unbindNequiToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deletePaymentMethodsDelegate$unbindNequiToken$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deletePaymentMethodsDelegate$unbindNequiToken$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    i iVar = (i) this.e.get();
                    String str = um50Var.a;
                    deletePaymentMethodsDelegate$unbindNequiToken$1.L$0 = null;
                    deletePaymentMethodsDelegate$unbindNequiToken$1.L$1 = tlsVar;
                    deletePaymentMethodsDelegate$unbindNequiToken$1.label = 1;
                    p = iVar.p(str, deletePaymentMethodsDelegate$unbindNequiToken$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    tlsVar = (tls) deletePaymentMethodsDelegate$unbindNequiToken$1.L$1;
                    kotlin.b.b(obj);
                    p = ((Result) obj).getValue();
                }
                if (Result.a(p) != null) {
                    ((pep0) this.j).f((m950) this.h.get(), new mda0(((avj0) this.a).h(kyh0.unbind_nequi_token_error_message)), hxx.a);
                }
                deletePaymentMethodsDelegate$unbindNequiToken$1.L$0 = null;
                deletePaymentMethodsDelegate$unbindNequiToken$1.L$1 = null;
                deletePaymentMethodsDelegate$unbindNequiToken$1.label = 2;
            }
        }
        deletePaymentMethodsDelegate$unbindNequiToken$1 = new DeletePaymentMethodsDelegate$unbindNequiToken$1(this, continuationImpl);
        Object obj2 = deletePaymentMethodsDelegate$unbindNequiToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deletePaymentMethodsDelegate$unbindNequiToken$1.label;
        if (i != 0) {
        }
        if (Result.a(p) != null) {
        }
        deletePaymentMethodsDelegate$unbindNequiToken$1.L$0 = null;
        deletePaymentMethodsDelegate$unbindNequiToken$1.L$1 = null;
        deletePaymentMethodsDelegate$unbindNequiToken$1.label = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a7, code lost:
    
        if (r9.invoke(r0) != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a9, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
    
        if (r10 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(bjm0 bjm0Var, tls tlsVar, ContinuationImpl continuationImpl) {
        DeletePaymentMethodsDelegate$unbindSbpToken$1 deletePaymentMethodsDelegate$unbindSbpToken$1;
        int i;
        Object q;
        if (continuationImpl instanceof DeletePaymentMethodsDelegate$unbindSbpToken$1) {
            deletePaymentMethodsDelegate$unbindSbpToken$1 = (DeletePaymentMethodsDelegate$unbindSbpToken$1) continuationImpl;
            int i2 = deletePaymentMethodsDelegate$unbindSbpToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deletePaymentMethodsDelegate$unbindSbpToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deletePaymentMethodsDelegate$unbindSbpToken$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deletePaymentMethodsDelegate$unbindSbpToken$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    i iVar = (i) this.e.get();
                    String str = bjm0Var.a;
                    deletePaymentMethodsDelegate$unbindSbpToken$1.L$0 = bjm0Var;
                    deletePaymentMethodsDelegate$unbindSbpToken$1.L$1 = tlsVar;
                    deletePaymentMethodsDelegate$unbindSbpToken$1.label = 1;
                    q = iVar.q(str, deletePaymentMethodsDelegate$unbindSbpToken$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    tlsVar = (tls) deletePaymentMethodsDelegate$unbindSbpToken$1.L$1;
                    bjm0Var = (bjm0) deletePaymentMethodsDelegate$unbindSbpToken$1.L$0;
                    kotlin.b.b(obj);
                    q = ((Result) obj).getValue();
                }
                if (Result.a(q) != null) {
                    ((pep0) this.j).f((m950) this.h.get(), new mda0(this.b.a(kyh0.unbind_sbp_token_error_message)), hxx.a);
                    String str2 = bjm0Var.d;
                    ru.yandex.taxi.analytics.i d = ((ru.yandex.taxi.analytics.j) this.c.a).d("FailedDeletingSBP.Modal.Shown");
                    d.d("choosen_bank", str2);
                    d.m();
                }
                deletePaymentMethodsDelegate$unbindSbpToken$1.L$0 = null;
                deletePaymentMethodsDelegate$unbindSbpToken$1.L$1 = null;
                deletePaymentMethodsDelegate$unbindSbpToken$1.label = 2;
            }
        }
        deletePaymentMethodsDelegate$unbindSbpToken$1 = new DeletePaymentMethodsDelegate$unbindSbpToken$1(this, continuationImpl);
        Object obj2 = deletePaymentMethodsDelegate$unbindSbpToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deletePaymentMethodsDelegate$unbindSbpToken$1.label;
        if (i != 0) {
        }
        if (Result.a(q) != null) {
        }
        deletePaymentMethodsDelegate$unbindSbpToken$1.L$0 = null;
        deletePaymentMethodsDelegate$unbindSbpToken$1.L$1 = null;
        deletePaymentMethodsDelegate$unbindSbpToken$1.label = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009a, code lost:
    
        if (r8.invoke(r0) != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if (r7 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(lea0 lea0Var, tls tlsVar, ContinuationImpl continuationImpl) {
        DeletePaymentMethodsDelegate$unbindWallet$1 deletePaymentMethodsDelegate$unbindWallet$1;
        int i;
        Object n;
        if (continuationImpl instanceof DeletePaymentMethodsDelegate$unbindWallet$1) {
            deletePaymentMethodsDelegate$unbindWallet$1 = (DeletePaymentMethodsDelegate$unbindWallet$1) continuationImpl;
            int i2 = deletePaymentMethodsDelegate$unbindWallet$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deletePaymentMethodsDelegate$unbindWallet$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deletePaymentMethodsDelegate$unbindWallet$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deletePaymentMethodsDelegate$unbindWallet$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    i iVar = (i) this.e.get();
                    String id = lea0Var.getId();
                    if (id == null) {
                        id = "";
                    }
                    PaymentMethod$Type c = lea0Var.c();
                    deletePaymentMethodsDelegate$unbindWallet$1.L$0 = null;
                    deletePaymentMethodsDelegate$unbindWallet$1.L$1 = tlsVar;
                    deletePaymentMethodsDelegate$unbindWallet$1.label = 1;
                    n = iVar.n(id, c, deletePaymentMethodsDelegate$unbindWallet$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    tlsVar = (tls) deletePaymentMethodsDelegate$unbindWallet$1.L$1;
                    kotlin.b.b(obj);
                    n = ((Result) obj).getValue();
                }
                if (Result.a(n) != null) {
                    ((pep0) this.j).f((m950) this.h.get(), new mda0(this.b.a(kyh0.unbind_sbp_token_error_message)), hxx.a);
                }
                deletePaymentMethodsDelegate$unbindWallet$1.L$0 = null;
                deletePaymentMethodsDelegate$unbindWallet$1.L$1 = null;
                deletePaymentMethodsDelegate$unbindWallet$1.label = 2;
            }
        }
        deletePaymentMethodsDelegate$unbindWallet$1 = new DeletePaymentMethodsDelegate$unbindWallet$1(this, continuationImpl);
        Object obj2 = deletePaymentMethodsDelegate$unbindWallet$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deletePaymentMethodsDelegate$unbindWallet$1.label;
        if (i != 0) {
        }
        if (Result.a(n) != null) {
        }
        deletePaymentMethodsDelegate$unbindWallet$1.L$0 = null;
        deletePaymentMethodsDelegate$unbindWallet$1.L$1 = null;
        deletePaymentMethodsDelegate$unbindWallet$1.label = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0092, code lost:
    
        if (r8.invoke(r0) != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0094, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(ep51 ep51Var, tls tlsVar, ContinuationImpl continuationImpl) {
        DeletePaymentMethodsDelegate$unbindYapeToken$1 deletePaymentMethodsDelegate$unbindYapeToken$1;
        int i;
        Object r;
        if (continuationImpl instanceof DeletePaymentMethodsDelegate$unbindYapeToken$1) {
            deletePaymentMethodsDelegate$unbindYapeToken$1 = (DeletePaymentMethodsDelegate$unbindYapeToken$1) continuationImpl;
            int i2 = deletePaymentMethodsDelegate$unbindYapeToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deletePaymentMethodsDelegate$unbindYapeToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deletePaymentMethodsDelegate$unbindYapeToken$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deletePaymentMethodsDelegate$unbindYapeToken$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    i iVar = (i) this.e.get();
                    String str = ep51Var.a;
                    deletePaymentMethodsDelegate$unbindYapeToken$1.L$0 = null;
                    deletePaymentMethodsDelegate$unbindYapeToken$1.L$1 = tlsVar;
                    deletePaymentMethodsDelegate$unbindYapeToken$1.label = 1;
                    r = iVar.r(str, deletePaymentMethodsDelegate$unbindYapeToken$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    tlsVar = (tls) deletePaymentMethodsDelegate$unbindYapeToken$1.L$1;
                    kotlin.b.b(obj);
                    r = ((Result) obj).getValue();
                }
                if (Result.a(r) != null) {
                    ((pep0) this.j).f((m950) this.h.get(), new mda0(((avj0) this.a).h(kyh0.unbind_yape_token_error_message)), hxx.a);
                }
                deletePaymentMethodsDelegate$unbindYapeToken$1.L$0 = null;
                deletePaymentMethodsDelegate$unbindYapeToken$1.L$1 = null;
                deletePaymentMethodsDelegate$unbindYapeToken$1.label = 2;
            }
        }
        deletePaymentMethodsDelegate$unbindYapeToken$1 = new DeletePaymentMethodsDelegate$unbindYapeToken$1(this, continuationImpl);
        Object obj2 = deletePaymentMethodsDelegate$unbindYapeToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deletePaymentMethodsDelegate$unbindYapeToken$1.label;
        if (i != 0) {
        }
        if (Result.a(r) != null) {
        }
        deletePaymentMethodsDelegate$unbindYapeToken$1.L$0 = null;
        deletePaymentMethodsDelegate$unbindYapeToken$1.L$1 = null;
        deletePaymentMethodsDelegate$unbindYapeToken$1.label = 2;
    }
}
