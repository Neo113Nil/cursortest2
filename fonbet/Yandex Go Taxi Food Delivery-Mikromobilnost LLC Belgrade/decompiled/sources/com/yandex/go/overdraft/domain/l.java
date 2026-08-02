package com.yandex.go.overdraft.domain;

import defpackage.aq80;
import defpackage.bvf0;
import defpackage.fvt;
import defpackage.h2t;
import defpackage.hd;
import defpackage.hia1;
import defpackage.jst;
import defpackage.m6a0;
import defpackage.noh;
import defpackage.ny61;
import defpackage.pl21;
import defpackage.sz80;
import defpackage.tcc;
import defpackage.xur;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public final class l {
    public final g a;
    public final hd b;
    public final fvt c;
    public final h2t d;
    public final aq80 e;

    public l(g gVar, hd hdVar, fvt fvtVar, h2t h2tVar, aq80 aq80Var) {
        this.a = gVar;
        this.b = hdVar;
        this.c = fvtVar;
        this.d = h2tVar;
        this.e = aq80Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cf, code lost:
    
        if (r12 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00a6 -> B:27:0x00aa). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(m6a0 m6a0Var, List list, ContinuationImpl continuationImpl) {
        OverdraftPaymentInteractor$allDebtsPaymentResult$1 overdraftPaymentInteractor$allDebtsPaymentResult$1;
        int i;
        m6a0 m6a0Var2;
        Collection collection;
        Iterator it;
        if (continuationImpl instanceof OverdraftPaymentInteractor$allDebtsPaymentResult$1) {
            overdraftPaymentInteractor$allDebtsPaymentResult$1 = (OverdraftPaymentInteractor$allDebtsPaymentResult$1) continuationImpl;
            int i2 = overdraftPaymentInteractor$allDebtsPaymentResult$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                overdraftPaymentInteractor$allDebtsPaymentResult$1.label = i2 - Integer.MIN_VALUE;
                Object obj = overdraftPaymentInteractor$allDebtsPaymentResult$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = overdraftPaymentInteractor$allDebtsPaymentResult$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                    Iterator it2 = list2.iterator();
                    m6a0Var2 = m6a0Var;
                    collection = arrayList;
                    it = it2;
                    if (it.hasNext()) {
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : (List) obj) {
                        if (((Result) obj2).getValue() instanceof Result.Failure) {
                            arrayList2.add(obj2);
                        }
                    }
                    return !arrayList2.isEmpty() ? ((Result) kotlin.collections.a.P(arrayList2)).getValue() : zy11.a;
                }
                collection = (Collection) overdraftPaymentInteractor$allDebtsPaymentResult$1.L$8;
                Iterator it3 = (Iterator) overdraftPaymentInteractor$allDebtsPaymentResult$1.L$5;
                Collection collection2 = (Collection) overdraftPaymentInteractor$allDebtsPaymentResult$1.L$4;
                m6a0 m6a0Var3 = (m6a0) overdraftPaymentInteractor$allDebtsPaymentResult$1.L$1;
                kotlin.b.b(obj);
                OverdraftPaymentInteractor$allDebtsPaymentResult$1 overdraftPaymentInteractor$allDebtsPaymentResult$12 = overdraftPaymentInteractor$allDebtsPaymentResult$1;
                Iterator it4 = it3;
                m6a0Var2 = m6a0Var3;
                OverdraftPaymentInteractor$allDebtsPaymentResult$1 overdraftPaymentInteractor$allDebtsPaymentResult$13 = overdraftPaymentInteractor$allDebtsPaymentResult$12;
                collection.add((noh) obj);
                it = it4;
                collection = collection2;
                overdraftPaymentInteractor$allDebtsPaymentResult$1 = overdraftPaymentInteractor$allDebtsPaymentResult$13;
                if (it.hasNext()) {
                    OverdraftPaymentInteractor$allDebtsPaymentResult$payDebtsResults$1$1 overdraftPaymentInteractor$allDebtsPaymentResult$payDebtsResults$1$1 = new OverdraftPaymentInteractor$allDebtsPaymentResult$payDebtsResults$1$1(this, m6a0Var2, (String) it.next(), null);
                    overdraftPaymentInteractor$allDebtsPaymentResult$1.L$0 = null;
                    overdraftPaymentInteractor$allDebtsPaymentResult$1.L$1 = m6a0Var2;
                    overdraftPaymentInteractor$allDebtsPaymentResult$1.L$2 = null;
                    overdraftPaymentInteractor$allDebtsPaymentResult$1.L$3 = null;
                    overdraftPaymentInteractor$allDebtsPaymentResult$1.L$4 = collection;
                    overdraftPaymentInteractor$allDebtsPaymentResult$1.L$5 = it;
                    overdraftPaymentInteractor$allDebtsPaymentResult$1.L$6 = null;
                    overdraftPaymentInteractor$allDebtsPaymentResult$1.L$7 = null;
                    overdraftPaymentInteractor$allDebtsPaymentResult$1.L$8 = collection;
                    overdraftPaymentInteractor$allDebtsPaymentResult$1.label = 1;
                    Object n = bvf0.n(overdraftPaymentInteractor$allDebtsPaymentResult$payDebtsResults$1$1, overdraftPaymentInteractor$allDebtsPaymentResult$1);
                    if (n != coroutineSingletons) {
                        overdraftPaymentInteractor$allDebtsPaymentResult$13 = overdraftPaymentInteractor$allDebtsPaymentResult$1;
                        it4 = it;
                        obj = n;
                        collection2 = collection;
                        collection.add((noh) obj);
                        it = it4;
                        collection = collection2;
                        overdraftPaymentInteractor$allDebtsPaymentResult$1 = overdraftPaymentInteractor$allDebtsPaymentResult$13;
                        if (it.hasNext()) {
                            overdraftPaymentInteractor$allDebtsPaymentResult$1.L$0 = null;
                            overdraftPaymentInteractor$allDebtsPaymentResult$1.L$1 = null;
                            overdraftPaymentInteractor$allDebtsPaymentResult$1.L$2 = null;
                            overdraftPaymentInteractor$allDebtsPaymentResult$1.L$3 = null;
                            overdraftPaymentInteractor$allDebtsPaymentResult$1.L$4 = null;
                            overdraftPaymentInteractor$allDebtsPaymentResult$1.L$5 = null;
                            overdraftPaymentInteractor$allDebtsPaymentResult$1.L$6 = null;
                            overdraftPaymentInteractor$allDebtsPaymentResult$1.L$7 = null;
                            overdraftPaymentInteractor$allDebtsPaymentResult$1.L$8 = null;
                            overdraftPaymentInteractor$allDebtsPaymentResult$1.label = 2;
                            obj = kotlinx.coroutines.a.b((List) collection, overdraftPaymentInteractor$allDebtsPaymentResult$1);
                        }
                    }
                }
                return coroutineSingletons;
            }
        }
        overdraftPaymentInteractor$allDebtsPaymentResult$1 = new OverdraftPaymentInteractor$allDebtsPaymentResult$1(this, continuationImpl);
        Object obj3 = overdraftPaymentInteractor$allDebtsPaymentResult$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = overdraftPaymentInteractor$allDebtsPaymentResult$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        OverdraftPaymentInteractor$fetchDebtStatuses$1 overdraftPaymentInteractor$fetchDebtStatuses$1;
        int i;
        if (continuationImpl instanceof OverdraftPaymentInteractor$fetchDebtStatuses$1) {
            overdraftPaymentInteractor$fetchDebtStatuses$1 = (OverdraftPaymentInteractor$fetchDebtStatuses$1) continuationImpl;
            int i2 = overdraftPaymentInteractor$fetchDebtStatuses$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                overdraftPaymentInteractor$fetchDebtStatuses$1.label = i2 - Integer.MIN_VALUE;
                Object obj = overdraftPaymentInteractor$fetchDebtStatuses$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = overdraftPaymentInteractor$fetchDebtStatuses$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    overdraftPaymentInteractor$fetchDebtStatuses$1.label = 1;
                    Object c = this.a.c(overdraftPaymentInteractor$fetchDebtStatuses$1);
                    return c == coroutineSingletons ? coroutineSingletons : c;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        overdraftPaymentInteractor$fetchDebtStatuses$1 = new OverdraftPaymentInteractor$fetchDebtStatuses$1(this, continuationImpl);
        Object obj2 = overdraftPaymentInteractor$fetchDebtStatuses$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = overdraftPaymentInteractor$fetchDebtStatuses$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(m6a0 m6a0Var, List list, ContinuationImpl continuationImpl) {
        OverdraftPaymentInteractor$pay$1 overdraftPaymentInteractor$pay$1;
        int i;
        try {
            if (continuationImpl instanceof OverdraftPaymentInteractor$pay$1) {
                overdraftPaymentInteractor$pay$1 = (OverdraftPaymentInteractor$pay$1) continuationImpl;
                int i2 = overdraftPaymentInteractor$pay$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    overdraftPaymentInteractor$pay$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = overdraftPaymentInteractor$pay$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = overdraftPaymentInteractor$pay$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        if (list.size() == 1) {
                            String str = (String) kotlin.collections.a.P(list);
                            g gVar = this.a;
                            overdraftPaymentInteractor$pay$1.L$0 = null;
                            overdraftPaymentInteractor$pay$1.L$1 = null;
                            overdraftPaymentInteractor$pay$1.L$2 = null;
                            overdraftPaymentInteractor$pay$1.label = 1;
                            if (gVar.e(m6a0Var, str, overdraftPaymentInteractor$pay$1) == obj2) {
                            }
                        } else {
                            overdraftPaymentInteractor$pay$1.L$0 = null;
                            overdraftPaymentInteractor$pay$1.L$1 = null;
                            overdraftPaymentInteractor$pay$1.label = 2;
                            Object a = a(m6a0Var, list, overdraftPaymentInteractor$pay$1);
                            if (a != obj2) {
                                return a;
                            }
                        }
                        return obj2;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    kotlin.b.b(obj);
                    return zy11.a;
                }
            }
            if (i != 0) {
            }
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            return new Result.Failure(e2);
        }
        overdraftPaymentInteractor$pay$1 = new OverdraftPaymentInteractor$pay$1(this, continuationImpl);
        Object obj3 = overdraftPaymentInteractor$pay$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = overdraftPaymentInteractor$pay$1.label;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0144, code lost:
    
        if (r12.invoke(r11, r13, r1) == r2) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x010a, code lost:
    
        if (r11 == r2) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(m6a0 m6a0Var, List list, zls zlsVar, Continuation continuation) {
        OverdraftPaymentInteractor$payDebts$1 overdraftPaymentInteractor$payDebts$1;
        int i;
        Object b;
        Object obj;
        zy11 zy11Var = zy11.a;
        if (continuation instanceof OverdraftPaymentInteractor$payDebts$1) {
            overdraftPaymentInteractor$payDebts$1 = (OverdraftPaymentInteractor$payDebts$1) continuation;
            int i2 = overdraftPaymentInteractor$payDebts$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                overdraftPaymentInteractor$payDebts$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = overdraftPaymentInteractor$payDebts$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = overdraftPaymentInteractor$payDebts$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (!((sz80) this.e.a).b) {
                        if (hia1.c(m6a0Var.a) && this.b.a.b != null) {
                            this.a.f();
                            return zy11Var;
                        }
                        ((sz80) this.e.a).b = true;
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list == null) {
                            list = ((sz80) this.e.a).c;
                            if (list.isEmpty()) {
                                list = null;
                            }
                        }
                        if (list != null) {
                            String str = (String) kotlin.collections.a.R(list);
                            PaymentMethod$Type paymentMethod$Type = m6a0Var.a;
                            if ((paymentMethod$Type == PaymentMethod$Type.GOOGLE_PAY || hia1.c(paymentMethod$Type)) && str != null) {
                                list = Collections.singletonList(str);
                            }
                            overdraftPaymentInteractor$payDebts$1.L$0 = null;
                            overdraftPaymentInteractor$payDebts$1.L$1 = null;
                            overdraftPaymentInteractor$payDebts$1.L$2 = null;
                            overdraftPaymentInteractor$payDebts$1.L$3 = null;
                            overdraftPaymentInteractor$payDebts$1.label = 1;
                            if (zlsVar.invoke(m6a0Var, list, overdraftPaymentInteractor$payDebts$1) == obj3) {
                            }
                        } else {
                            overdraftPaymentInteractor$payDebts$1.L$0 = m6a0Var;
                            overdraftPaymentInteractor$payDebts$1.L$1 = null;
                            overdraftPaymentInteractor$payDebts$1.L$2 = zlsVar;
                            overdraftPaymentInteractor$payDebts$1.L$3 = null;
                            overdraftPaymentInteractor$payDebts$1.label = 2;
                            b = b(overdraftPaymentInteractor$payDebts$1);
                        }
                        return obj3;
                    }
                    return zy11Var;
                }
                if (i == 1) {
                    kotlin.b.b(obj2);
                    return zy11Var;
                }
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = overdraftPaymentInteractor$payDebts$1.L$4;
                    kotlin.b.b(obj2);
                    if (Result.a(obj) != null) {
                        ((sz80) this.e.a).b = false;
                        ((sz80) this.e.a).c = EmptyList.a;
                        jst.e.getClass();
                    }
                    return zy11Var;
                }
                zlsVar = (zls) overdraftPaymentInteractor$payDebts$1.L$2;
                m6a0Var = (m6a0) overdraftPaymentInteractor$payDebts$1.L$0;
                kotlin.b.b(obj2);
                b = ((Result) obj2).getValue();
                Object obj4 = b;
                m6a0 m6a0Var2 = m6a0Var;
                obj = obj4;
                if (!(obj instanceof Result.Failure)) {
                    List list2 = ((pl21) obj).b.b;
                    String str2 = (String) kotlin.collections.a.R(list2);
                    PaymentMethod$Type paymentMethod$Type2 = m6a0Var2.a;
                    if ((paymentMethod$Type2 == PaymentMethod$Type.GOOGLE_PAY || hia1.c(paymentMethod$Type2)) && str2 != null) {
                        list2 = Collections.singletonList(str2);
                    }
                    overdraftPaymentInteractor$payDebts$1.L$0 = null;
                    overdraftPaymentInteractor$payDebts$1.L$1 = null;
                    overdraftPaymentInteractor$payDebts$1.L$2 = null;
                    overdraftPaymentInteractor$payDebts$1.L$3 = null;
                    overdraftPaymentInteractor$payDebts$1.L$4 = obj;
                    overdraftPaymentInteractor$payDebts$1.L$5 = null;
                    overdraftPaymentInteractor$payDebts$1.L$6 = null;
                    overdraftPaymentInteractor$payDebts$1.label = 3;
                }
                if (Result.a(obj) != null) {
                }
                return zy11Var;
            }
        }
        overdraftPaymentInteractor$payDebts$1 = new OverdraftPaymentInteractor$payDebts$1(this, continuation);
        Object obj22 = overdraftPaymentInteractor$payDebts$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = overdraftPaymentInteractor$payDebts$1.label;
        if (i != 0) {
        }
        Object obj42 = b;
        m6a0 m6a0Var22 = m6a0Var;
        obj = obj42;
        if (!(obj instanceof Result.Failure)) {
        }
        if (Result.a(obj) != null) {
        }
        return zy11Var;
    }

    public final Object e(m6a0 m6a0Var, zls zlsVar, Continuation continuation) {
        zy11 zy11Var = zy11.a;
        if (m6a0Var == null || PaymentMethod$Type.GOOGLE_PAY != m6a0Var.a) {
            jst.e.w(new IllegalStateException("Try to pay with google pay without selected option: " + m6a0Var));
            return zy11Var;
        }
        String str = m6a0Var.b;
        if (str == null || str.length() == 0) {
            return new kotlinx.coroutines.flow.o(((com.yandex.go.payments.googlepay.domain.e) this.c).l(), new OverdraftPaymentInteractor$payDebtsWithGooglePay$$inlined$safeCollect$1(3, null)).collect(new xur(27, this, zlsVar), continuation);
        }
        Object d = d(m6a0Var, EmptyList.a, zlsVar, continuation);
        return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : zy11Var;
    }
}
