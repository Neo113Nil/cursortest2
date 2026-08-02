package com.yandex.go.tariffcard.interactor;

import com.yandex.go.zone.dto.objects.ServiceLevel;
import defpackage.evu0;
import defpackage.fn40;
import defpackage.gn40;
import defpackage.hn40;
import defpackage.jst;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.qze0;
import defpackage.rz0;
import defpackage.v0f0;
import defpackage.wlq0;
import java.util.Collections;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes14.dex */
public final class f {
    public final rz0 a;
    public final ru.yandex.taxi.widget.c b;

    public f(rz0 rz0Var, ru.yandex.taxi.widget.c cVar) {
        this.a = rz0Var;
        this.b = cVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(10:5|6|7|8|(1:(2:11|12)(2:24|25))(3:26|27|(1:29))|13|14|(1:16)|17|(1:22)(2:19|20)))|36|6|7|8|(0)(0)|13|14|(0)|17|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0068, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006a, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x002e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004f, code lost:
    
        r10 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(FormattedText formattedText, ContinuationImpl continuationImpl) {
        MulticlassTariffAdditionalPriceInfoStateInteractor$convertFormattedPrice$1 multiclassTariffAdditionalPriceInfoStateInteractor$convertFormattedPrice$1;
        int i;
        Object failure;
        Throwable a;
        if (continuationImpl instanceof MulticlassTariffAdditionalPriceInfoStateInteractor$convertFormattedPrice$1) {
            multiclassTariffAdditionalPriceInfoStateInteractor$convertFormattedPrice$1 = (MulticlassTariffAdditionalPriceInfoStateInteractor$convertFormattedPrice$1) continuationImpl;
            int i2 = multiclassTariffAdditionalPriceInfoStateInteractor$convertFormattedPrice$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                multiclassTariffAdditionalPriceInfoStateInteractor$convertFormattedPrice$1.label = i2 - Integer.MIN_VALUE;
                MulticlassTariffAdditionalPriceInfoStateInteractor$convertFormattedPrice$1 multiclassTariffAdditionalPriceInfoStateInteractor$convertFormattedPrice$12 = multiclassTariffAdditionalPriceInfoStateInteractor$convertFormattedPrice$1;
                Object obj = multiclassTariffAdditionalPriceInfoStateInteractor$convertFormattedPrice$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = multiclassTariffAdditionalPriceInfoStateInteractor$convertFormattedPrice$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ru.yandex.taxi.widget.c cVar = this.b;
                    multiclassTariffAdditionalPriceInfoStateInteractor$convertFormattedPrice$12.L$0 = null;
                    multiclassTariffAdditionalPriceInfoStateInteractor$convertFormattedPrice$12.label = 1;
                    obj = ru.yandex.taxi.widget.c.e(cVar, formattedText, null, false, multiclassTariffAdditionalPriceInfoStateInteractor$convertFormattedPrice$12, 30);
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
                failure = (CharSequence) obj;
                a = Result.a(failure);
                if (a != null) {
                    jst.e.k(a, "MutliclassTariffAdditionalPriceInfoStateInteractor");
                }
                if (failure instanceof Result.Failure) {
                    return failure;
                }
                return null;
            }
        }
        multiclassTariffAdditionalPriceInfoStateInteractor$convertFormattedPrice$1 = new MulticlassTariffAdditionalPriceInfoStateInteractor$convertFormattedPrice$1(this, continuationImpl);
        MulticlassTariffAdditionalPriceInfoStateInteractor$convertFormattedPrice$1 multiclassTariffAdditionalPriceInfoStateInteractor$convertFormattedPrice$122 = multiclassTariffAdditionalPriceInfoStateInteractor$convertFormattedPrice$1;
        Object obj2 = multiclassTariffAdditionalPriceInfoStateInteractor$convertFormattedPrice$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = multiclassTariffAdditionalPriceInfoStateInteractor$convertFormattedPrice$122.label;
        if (i != 0) {
        }
        failure = (CharSequence) obj2;
        a = Result.a(failure);
        if (a != null) {
        }
        if (failure instanceof Result.Failure) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|(2:3|(12:5|6|7|8|(1:(2:11|12)(2:27|28))(4:29|(1:31)(1:42)|(3:33|(1:35)(1:40)|(2:37|(1:39)))|41)|13|14|(1:16)|17|(1:19)|20|(2:22|23)(1:25)))|47|6|7|8|(0)(0)|13|14|(0)|17|(0)|20|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b2, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0036, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0090, code lost:
    
        r1 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(pex0 pex0Var, ContinuationImpl continuationImpl) {
        MulticlassTariffAdditionalPriceInfoStateInteractor$getOriginalPrice$1 multiclassTariffAdditionalPriceInfoStateInteractor$getOriginalPrice$1;
        int i;
        Object failure;
        Throwable a;
        CharSequence charSequence;
        if (continuationImpl instanceof MulticlassTariffAdditionalPriceInfoStateInteractor$getOriginalPrice$1) {
            multiclassTariffAdditionalPriceInfoStateInteractor$getOriginalPrice$1 = (MulticlassTariffAdditionalPriceInfoStateInteractor$getOriginalPrice$1) continuationImpl;
            int i2 = multiclassTariffAdditionalPriceInfoStateInteractor$getOriginalPrice$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                multiclassTariffAdditionalPriceInfoStateInteractor$getOriginalPrice$1.label = i2 - Integer.MIN_VALUE;
                MulticlassTariffAdditionalPriceInfoStateInteractor$getOriginalPrice$1 multiclassTariffAdditionalPriceInfoStateInteractor$getOriginalPrice$12 = multiclassTariffAdditionalPriceInfoStateInteractor$getOriginalPrice$1;
                Object obj = multiclassTariffAdditionalPriceInfoStateInteractor$getOriginalPrice$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = multiclassTariffAdditionalPriceInfoStateInteractor$getOriginalPrice$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    qze0 qze0Var = pex0Var.m;
                    String str = qze0Var != null ? qze0Var.d : null;
                    if (str != null) {
                        String str2 = !evu0.J(str) ? str : null;
                        if (str2 != null) {
                            ru.yandex.taxi.widget.c cVar = this.b;
                            FormattedText formattedText = new FormattedText(Collections.singletonList(new FormattedText.h(str2, null, null, null, Collections.singletonList(new FormattedText.f(FormattedText.LineThroughStyle.DEFAULT, 2)), null, 2014)));
                            multiclassTariffAdditionalPriceInfoStateInteractor$getOriginalPrice$12.L$0 = null;
                            multiclassTariffAdditionalPriceInfoStateInteractor$getOriginalPrice$12.L$1 = null;
                            multiclassTariffAdditionalPriceInfoStateInteractor$getOriginalPrice$12.label = 1;
                            obj = ru.yandex.taxi.widget.c.e(cVar, formattedText, null, false, multiclassTariffAdditionalPriceInfoStateInteractor$getOriginalPrice$12, 30);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                failure = (CharSequence) obj;
                a = Result.a(failure);
                if (a != null) {
                    jst.e.k(a, "MutliclassTariffAdditionalPriceInfoStateInteractor");
                }
                if (failure instanceof Result.Failure) {
                    failure = null;
                }
                charSequence = (CharSequence) failure;
                if (charSequence == null) {
                    return new gn40(charSequence);
                }
                return null;
            }
        }
        multiclassTariffAdditionalPriceInfoStateInteractor$getOriginalPrice$1 = new MulticlassTariffAdditionalPriceInfoStateInteractor$getOriginalPrice$1(this, continuationImpl);
        MulticlassTariffAdditionalPriceInfoStateInteractor$getOriginalPrice$1 multiclassTariffAdditionalPriceInfoStateInteractor$getOriginalPrice$122 = multiclassTariffAdditionalPriceInfoStateInteractor$getOriginalPrice$1;
        Object obj2 = multiclassTariffAdditionalPriceInfoStateInteractor$getOriginalPrice$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = multiclassTariffAdditionalPriceInfoStateInteractor$getOriginalPrice$122.label;
        if (i != 0) {
        }
        failure = (CharSequence) obj2;
        a = Result.a(failure);
        if (a != null) {
        }
        if (failure instanceof Result.Failure) {
        }
        charSequence = (CharSequence) failure;
        if (charSequence == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0071, code lost:
    
        if (r2 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(pex0 pex0Var, ContinuationImpl continuationImpl) {
        MulticlassTariffAdditionalPriceInfoStateInteractor$getPriceInfo$1 multiclassTariffAdditionalPriceInfoStateInteractor$getPriceInfo$1;
        int i;
        v0f0 v0f0Var;
        CharSequence charSequence;
        Object a;
        v0f0 v0f0Var2;
        pex0 pex0Var2;
        String str;
        Pair pair;
        Object obj;
        String str2;
        fn40 fn40Var;
        qze0 qze0Var;
        wlq0 wlq0Var;
        String str3;
        if (continuationImpl instanceof MulticlassTariffAdditionalPriceInfoStateInteractor$getPriceInfo$1) {
            multiclassTariffAdditionalPriceInfoStateInteractor$getPriceInfo$1 = (MulticlassTariffAdditionalPriceInfoStateInteractor$getPriceInfo$1) continuationImpl;
            int i2 = multiclassTariffAdditionalPriceInfoStateInteractor$getPriceInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                multiclassTariffAdditionalPriceInfoStateInteractor$getPriceInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = multiclassTariffAdditionalPriceInfoStateInteractor$getPriceInfo$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = multiclassTariffAdditionalPriceInfoStateInteractor$getPriceInfo$1.label;
                String str4 = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    qze0 qze0Var2 = pex0Var.m;
                    v0f0Var = qze0Var2 != null ? qze0Var2.p : null;
                    if (v0f0Var == null) {
                        charSequence = null;
                        if (charSequence != null) {
                            pair = new Pair(charSequence, null);
                            CharSequence charSequence2 = (CharSequence) pair.getFirst();
                            gn40 gn40Var = (gn40) pair.getSecond();
                            if (this.a.b.isEnabled()) {
                            }
                            fn40Var = null;
                            if (v0f0Var != null) {
                            }
                            qze0Var = pex0Var.m;
                            if (qze0Var != null) {
                            }
                            return new hn40(charSequence2, fn40Var, gn40Var, str4);
                        }
                        String e = pex0Var.e();
                        multiclassTariffAdditionalPriceInfoStateInteractor$getPriceInfo$1.L$0 = pex0Var;
                        multiclassTariffAdditionalPriceInfoStateInteractor$getPriceInfo$1.L$1 = v0f0Var;
                        multiclassTariffAdditionalPriceInfoStateInteractor$getPriceInfo$1.L$2 = null;
                        multiclassTariffAdditionalPriceInfoStateInteractor$getPriceInfo$1.L$3 = e;
                        multiclassTariffAdditionalPriceInfoStateInteractor$getPriceInfo$1.label = 2;
                        Object b = b(pex0Var, multiclassTariffAdditionalPriceInfoStateInteractor$getPriceInfo$1);
                        if (b != obj3) {
                            v0f0Var2 = v0f0Var;
                            obj2 = b;
                            pex0Var2 = pex0Var;
                            str = e;
                            Pair pair2 = new Pair(str, obj2);
                            pex0Var = pex0Var2;
                            v0f0Var = v0f0Var2;
                            pair = pair2;
                            CharSequence charSequence22 = (CharSequence) pair.getFirst();
                            gn40 gn40Var2 = (gn40) pair.getSecond();
                            if (this.a.b.isEnabled()) {
                            }
                            fn40Var = null;
                            if (v0f0Var != null) {
                            }
                            qze0Var = pex0Var.m;
                            if (qze0Var != null) {
                            }
                            return new hn40(charSequence22, fn40Var, gn40Var2, str4);
                        }
                        return obj3;
                    }
                    FormattedText formattedText = v0f0Var.a;
                    multiclassTariffAdditionalPriceInfoStateInteractor$getPriceInfo$1.L$0 = pex0Var;
                    multiclassTariffAdditionalPriceInfoStateInteractor$getPriceInfo$1.L$1 = v0f0Var;
                    multiclassTariffAdditionalPriceInfoStateInteractor$getPriceInfo$1.L$2 = null;
                    multiclassTariffAdditionalPriceInfoStateInteractor$getPriceInfo$1.label = 1;
                    a = a(formattedText, multiclassTariffAdditionalPriceInfoStateInteractor$getPriceInfo$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str = (String) multiclassTariffAdditionalPriceInfoStateInteractor$getPriceInfo$1.L$3;
                        v0f0Var2 = (v0f0) multiclassTariffAdditionalPriceInfoStateInteractor$getPriceInfo$1.L$1;
                        pex0Var2 = (pex0) multiclassTariffAdditionalPriceInfoStateInteractor$getPriceInfo$1.L$0;
                        kotlin.b.b(obj2);
                        Pair pair22 = new Pair(str, obj2);
                        pex0Var = pex0Var2;
                        v0f0Var = v0f0Var2;
                        pair = pair22;
                        CharSequence charSequence222 = (CharSequence) pair.getFirst();
                        gn40 gn40Var22 = (gn40) pair.getSecond();
                        if (this.a.b.isEnabled()) {
                            Iterator it = pex0Var.S.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it.next();
                                if (((ServiceLevel.Branding) obj).c == ServiceLevel.Branding.Type.CASH_BACK) {
                                    break;
                                }
                            }
                            ServiceLevel.Branding branding = (ServiceLevel.Branding) obj;
                            if (branding != null && (str2 = branding.i) != null) {
                                fn40Var = new fn40(str2);
                                if (v0f0Var != null || (str3 = v0f0Var.b) == null) {
                                    qze0Var = pex0Var.m;
                                    if (qze0Var != null && (wlq0Var = qze0Var.l) != null) {
                                        str4 = wlq0Var.b.b;
                                    }
                                } else {
                                    str4 = str3;
                                }
                                return new hn40(charSequence222, fn40Var, gn40Var22, str4);
                            }
                        }
                        fn40Var = null;
                        if (v0f0Var != null) {
                        }
                        qze0Var = pex0Var.m;
                        if (qze0Var != null) {
                            str4 = wlq0Var.b.b;
                        }
                        return new hn40(charSequence222, fn40Var, gn40Var22, str4);
                    }
                    v0f0 v0f0Var3 = (v0f0) multiclassTariffAdditionalPriceInfoStateInteractor$getPriceInfo$1.L$1;
                    pex0 pex0Var3 = (pex0) multiclassTariffAdditionalPriceInfoStateInteractor$getPriceInfo$1.L$0;
                    kotlin.b.b(obj2);
                    v0f0Var = v0f0Var3;
                    pex0Var = pex0Var3;
                    a = obj2;
                }
                charSequence = (CharSequence) a;
                if (charSequence != null) {
                }
            }
        }
        multiclassTariffAdditionalPriceInfoStateInteractor$getPriceInfo$1 = new MulticlassTariffAdditionalPriceInfoStateInteractor$getPriceInfo$1(this, continuationImpl);
        Object obj22 = multiclassTariffAdditionalPriceInfoStateInteractor$getPriceInfo$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = multiclassTariffAdditionalPriceInfoStateInteractor$getPriceInfo$1.label;
        String str42 = null;
        if (i != 0) {
        }
        charSequence = (CharSequence) a;
        if (charSequence != null) {
        }
    }
}
