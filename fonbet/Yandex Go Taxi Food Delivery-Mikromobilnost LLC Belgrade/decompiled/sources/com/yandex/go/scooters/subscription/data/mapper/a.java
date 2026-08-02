package com.yandex.go.scooters.subscription.data.mapper;

import com.yandex.go.scooters.subscription.data.model.ScootersSubscriptionPurchaseErrorWindowDto;
import com.yandex.go.scooters.subscription.data.model.ScootersSubscriptionPurchaseSuccessWindowDto;
import com.yandex.go.scooters.subscription.data.model.ScootersSubscriptionPurchaseWindowButtonActionDto$Deeplink;
import com.yandex.go.scooters.subscription.data.model.ScootersSubscriptionPurchaseWindowButtonDto;
import com.yandex.go.scooters.subscription.data.model.i;
import com.yandex.go.scooters.subscription.data.model.k;
import com.yandex.go.scooters.subscription.data.model.l;
import defpackage.ayo0;
import defpackage.byo0;
import defpackage.cyo0;
import defpackage.dyo0;
import defpackage.eyo0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.w511;
import defpackage.zgz;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes13.dex */
public final class a {
    public final ru.yandex.taxi.widget.c a;

    public a(ru.yandex.taxi.widget.c cVar) {
        this.a = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0057, code lost:
    
        if (r12 == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ScootersSubscriptionPurchaseWindowButtonDto scootersSubscriptionPurchaseWindowButtonDto, ContinuationImpl continuationImpl) {
        ScootersSubscriptionPurchaseInfoWindowMapper$mapButton$1 scootersSubscriptionPurchaseInfoWindowMapper$mapButton$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object e;
        CharSequence charSequence;
        l lVar;
        cyo0 cyo0Var;
        if (continuationImpl instanceof ScootersSubscriptionPurchaseInfoWindowMapper$mapButton$1) {
            scootersSubscriptionPurchaseInfoWindowMapper$mapButton$1 = (ScootersSubscriptionPurchaseInfoWindowMapper$mapButton$1) continuationImpl;
            int i2 = scootersSubscriptionPurchaseInfoWindowMapper$mapButton$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersSubscriptionPurchaseInfoWindowMapper$mapButton$1.label = i2 - Integer.MIN_VALUE;
                ScootersSubscriptionPurchaseInfoWindowMapper$mapButton$1 scootersSubscriptionPurchaseInfoWindowMapper$mapButton$12 = scootersSubscriptionPurchaseInfoWindowMapper$mapButton$1;
                Object obj = scootersSubscriptionPurchaseInfoWindowMapper$mapButton$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersSubscriptionPurchaseInfoWindowMapper$mapButton$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    FormattedText formattedText = scootersSubscriptionPurchaseWindowButtonDto.a;
                    scootersSubscriptionPurchaseInfoWindowMapper$mapButton$12.L$0 = scootersSubscriptionPurchaseWindowButtonDto;
                    scootersSubscriptionPurchaseInfoWindowMapper$mapButton$12.label = 1;
                    obj = ru.yandex.taxi.widget.c.e(this.a, formattedText, null, false, scootersSubscriptionPurchaseInfoWindowMapper$mapButton$12, 30);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        charSequence = (CharSequence) scootersSubscriptionPurchaseInfoWindowMapper$mapButton$12.L$1;
                        scootersSubscriptionPurchaseWindowButtonDto = (ScootersSubscriptionPurchaseWindowButtonDto) scootersSubscriptionPurchaseInfoWindowMapper$mapButton$12.L$0;
                        kotlin.b.b(obj);
                        CharSequence charSequence2 = (CharSequence) obj;
                        lVar = scootersSubscriptionPurchaseWindowButtonDto.c;
                        if (lVar instanceof ScootersSubscriptionPurchaseWindowButtonActionDto$Deeplink) {
                            boolean l = jl40.l(lVar, i.INSTANCE);
                            ayo0 ayo0Var = ayo0.a;
                            if (!l) {
                                if (!jl40.l(lVar, k.INSTANCE)) {
                                    w511.b();
                                    return null;
                                }
                                zgz.a(null, new IllegalArgumentException("Unknown action"));
                            }
                            cyo0Var = ayo0Var;
                        } else {
                            cyo0Var = new byo0(((ScootersSubscriptionPurchaseWindowButtonActionDto$Deeplink) lVar).a);
                        }
                        return new dyo0(charSequence, charSequence2, cyo0Var);
                    }
                    scootersSubscriptionPurchaseWindowButtonDto = (ScootersSubscriptionPurchaseWindowButtonDto) scootersSubscriptionPurchaseInfoWindowMapper$mapButton$12.L$0;
                    kotlin.b.b(obj);
                }
                CharSequence charSequence3 = (CharSequence) obj;
                FormattedText formattedText2 = scootersSubscriptionPurchaseWindowButtonDto.b;
                scootersSubscriptionPurchaseInfoWindowMapper$mapButton$12.L$0 = scootersSubscriptionPurchaseWindowButtonDto;
                scootersSubscriptionPurchaseInfoWindowMapper$mapButton$12.L$1 = charSequence3;
                scootersSubscriptionPurchaseInfoWindowMapper$mapButton$12.label = 2;
                e = ru.yandex.taxi.widget.c.e(this.a, formattedText2, null, false, scootersSubscriptionPurchaseInfoWindowMapper$mapButton$12, 30);
                if (e != coroutineSingletons) {
                    obj = e;
                    charSequence = charSequence3;
                    CharSequence charSequence22 = (CharSequence) obj;
                    lVar = scootersSubscriptionPurchaseWindowButtonDto.c;
                    if (lVar instanceof ScootersSubscriptionPurchaseWindowButtonActionDto$Deeplink) {
                    }
                    return new dyo0(charSequence, charSequence22, cyo0Var);
                }
                return coroutineSingletons;
            }
        }
        scootersSubscriptionPurchaseInfoWindowMapper$mapButton$1 = new ScootersSubscriptionPurchaseInfoWindowMapper$mapButton$1(this, continuationImpl);
        ScootersSubscriptionPurchaseInfoWindowMapper$mapButton$1 scootersSubscriptionPurchaseInfoWindowMapper$mapButton$122 = scootersSubscriptionPurchaseInfoWindowMapper$mapButton$1;
        Object obj2 = scootersSubscriptionPurchaseInfoWindowMapper$mapButton$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersSubscriptionPurchaseInfoWindowMapper$mapButton$122.label;
        if (i != 0) {
        }
        CharSequence charSequence32 = (CharSequence) obj2;
        FormattedText formattedText22 = scootersSubscriptionPurchaseWindowButtonDto.b;
        scootersSubscriptionPurchaseInfoWindowMapper$mapButton$122.L$0 = scootersSubscriptionPurchaseWindowButtonDto;
        scootersSubscriptionPurchaseInfoWindowMapper$mapButton$122.L$1 = charSequence32;
        scootersSubscriptionPurchaseInfoWindowMapper$mapButton$122.label = 2;
        e = ru.yandex.taxi.widget.c.e(this.a, formattedText22, null, false, scootersSubscriptionPurchaseInfoWindowMapper$mapButton$122, 30);
        if (e != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0090, code lost:
    
        if (r12 == r0) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ScootersSubscriptionPurchaseErrorWindowDto scootersSubscriptionPurchaseErrorWindowDto, ContinuationImpl continuationImpl) {
        ScootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$1 scootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$1;
        Object obj;
        int i;
        ScootersSubscriptionPurchaseWindowButtonDto scootersSubscriptionPurchaseWindowButtonDto;
        Object a;
        ScootersSubscriptionPurchaseErrorWindowDto scootersSubscriptionPurchaseErrorWindowDto2;
        dyo0 dyo0Var;
        Object e;
        ScootersSubscriptionPurchaseErrorWindowDto scootersSubscriptionPurchaseErrorWindowDto3;
        dyo0 dyo0Var2;
        dyo0 dyo0Var3;
        Object e2;
        CharSequence charSequence;
        dyo0 dyo0Var4;
        if (continuationImpl instanceof ScootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$1) {
            scootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$1 = (ScootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$1) continuationImpl;
            int i2 = scootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$1.label = i2 - Integer.MIN_VALUE;
                ScootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$1 scootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$12 = scootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$1;
                Object obj2 = scootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$12.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$12.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (scootersSubscriptionPurchaseErrorWindowDto.a.a.isEmpty() || (scootersSubscriptionPurchaseWindowButtonDto = scootersSubscriptionPurchaseErrorWindowDto.c) == null || scootersSubscriptionPurchaseErrorWindowDto.d == null) {
                        return null;
                    }
                    scootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$12.L$0 = scootersSubscriptionPurchaseErrorWindowDto;
                    scootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$12.label = 1;
                    obj2 = a(scootersSubscriptionPurchaseWindowButtonDto, scootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$12);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            dyo0Var = (dyo0) scootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$12.L$1;
                            ScootersSubscriptionPurchaseErrorWindowDto scootersSubscriptionPurchaseErrorWindowDto4 = (ScootersSubscriptionPurchaseErrorWindowDto) scootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$12.L$0;
                            kotlin.b.b(obj2);
                            scootersSubscriptionPurchaseErrorWindowDto2 = scootersSubscriptionPurchaseErrorWindowDto4;
                            dyo0 dyo0Var5 = (dyo0) obj2;
                            FormattedText formattedText = scootersSubscriptionPurchaseErrorWindowDto2.a;
                            scootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$12.L$0 = scootersSubscriptionPurchaseErrorWindowDto2;
                            scootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$12.L$1 = dyo0Var;
                            scootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$12.L$2 = dyo0Var5;
                            scootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$12.label = 3;
                            e = ru.yandex.taxi.widget.c.e(this.a, formattedText, null, false, scootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$12, 30);
                            if (e != obj) {
                                scootersSubscriptionPurchaseErrorWindowDto3 = scootersSubscriptionPurchaseErrorWindowDto2;
                                dyo0Var2 = dyo0Var;
                                dyo0Var3 = dyo0Var5;
                                obj2 = e;
                                CharSequence charSequence2 = (CharSequence) obj2;
                                FormattedText formattedText2 = scootersSubscriptionPurchaseErrorWindowDto3.b;
                                scootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$12.L$0 = null;
                                scootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$12.L$1 = dyo0Var2;
                                scootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$12.L$2 = dyo0Var3;
                                scootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$12.L$3 = charSequence2;
                                scootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$12.label = 4;
                                e2 = ru.yandex.taxi.widget.c.e(this.a, formattedText2, null, false, scootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$12, 30);
                                if (e2 != obj) {
                                }
                            }
                            return obj;
                        }
                        if (i != 3) {
                            if (i != 4) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            charSequence = (CharSequence) scootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$12.L$3;
                            dyo0Var3 = (dyo0) scootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$12.L$2;
                            dyo0Var4 = (dyo0) scootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$12.L$1;
                            kotlin.b.b(obj2);
                            return new eyo0(charSequence, (CharSequence) obj2, dyo0Var4, dyo0Var3);
                        }
                        dyo0Var3 = (dyo0) scootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$12.L$2;
                        dyo0 dyo0Var6 = (dyo0) scootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$12.L$1;
                        scootersSubscriptionPurchaseErrorWindowDto3 = (ScootersSubscriptionPurchaseErrorWindowDto) scootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$12.L$0;
                        kotlin.b.b(obj2);
                        dyo0Var2 = dyo0Var6;
                        CharSequence charSequence22 = (CharSequence) obj2;
                        FormattedText formattedText22 = scootersSubscriptionPurchaseErrorWindowDto3.b;
                        scootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$12.L$0 = null;
                        scootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$12.L$1 = dyo0Var2;
                        scootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$12.L$2 = dyo0Var3;
                        scootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$12.L$3 = charSequence22;
                        scootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$12.label = 4;
                        e2 = ru.yandex.taxi.widget.c.e(this.a, formattedText22, null, false, scootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$12, 30);
                        if (e2 != obj) {
                            obj2 = e2;
                            charSequence = charSequence22;
                            dyo0Var4 = dyo0Var2;
                            return new eyo0(charSequence, (CharSequence) obj2, dyo0Var4, dyo0Var3);
                        }
                        return obj;
                    }
                    scootersSubscriptionPurchaseErrorWindowDto = (ScootersSubscriptionPurchaseErrorWindowDto) scootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$12.L$0;
                    kotlin.b.b(obj2);
                }
                dyo0 dyo0Var7 = (dyo0) obj2;
                ScootersSubscriptionPurchaseWindowButtonDto scootersSubscriptionPurchaseWindowButtonDto2 = scootersSubscriptionPurchaseErrorWindowDto.d;
                scootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$12.L$0 = scootersSubscriptionPurchaseErrorWindowDto;
                scootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$12.L$1 = dyo0Var7;
                scootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$12.label = 2;
                a = a(scootersSubscriptionPurchaseWindowButtonDto2, scootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$12);
                if (a != obj) {
                    scootersSubscriptionPurchaseErrorWindowDto2 = scootersSubscriptionPurchaseErrorWindowDto;
                    dyo0Var = dyo0Var7;
                    obj2 = a;
                    dyo0 dyo0Var52 = (dyo0) obj2;
                    FormattedText formattedText3 = scootersSubscriptionPurchaseErrorWindowDto2.a;
                    scootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$12.L$0 = scootersSubscriptionPurchaseErrorWindowDto2;
                    scootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$12.L$1 = dyo0Var;
                    scootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$12.L$2 = dyo0Var52;
                    scootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$12.label = 3;
                    e = ru.yandex.taxi.widget.c.e(this.a, formattedText3, null, false, scootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$12, 30);
                    if (e != obj) {
                    }
                }
                return obj;
            }
        }
        scootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$1 = new ScootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$1(this, continuationImpl);
        ScootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$1 scootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$122 = scootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$1;
        Object obj22 = scootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$122.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$122.label;
        if (i != 0) {
        }
        dyo0 dyo0Var72 = (dyo0) obj22;
        ScootersSubscriptionPurchaseWindowButtonDto scootersSubscriptionPurchaseWindowButtonDto22 = scootersSubscriptionPurchaseErrorWindowDto.d;
        scootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$122.L$0 = scootersSubscriptionPurchaseErrorWindowDto;
        scootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$122.L$1 = dyo0Var72;
        scootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$122.label = 2;
        a = a(scootersSubscriptionPurchaseWindowButtonDto22, scootersSubscriptionPurchaseInfoWindowMapper$mapErrorWindow$122);
        if (a != obj) {
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0071, code lost:
    
        if (r12 == r0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ScootersSubscriptionPurchaseSuccessWindowDto scootersSubscriptionPurchaseSuccessWindowDto, ContinuationImpl continuationImpl) {
        ScootersSubscriptionPurchaseInfoWindowMapper$mapSuccessWindow$1 scootersSubscriptionPurchaseInfoWindowMapper$mapSuccessWindow$1;
        Object obj;
        int i;
        ScootersSubscriptionPurchaseWindowButtonDto scootersSubscriptionPurchaseWindowButtonDto;
        Object e;
        ScootersSubscriptionPurchaseSuccessWindowDto scootersSubscriptionPurchaseSuccessWindowDto2;
        dyo0 dyo0Var;
        Object e2;
        CharSequence charSequence;
        if (continuationImpl instanceof ScootersSubscriptionPurchaseInfoWindowMapper$mapSuccessWindow$1) {
            scootersSubscriptionPurchaseInfoWindowMapper$mapSuccessWindow$1 = (ScootersSubscriptionPurchaseInfoWindowMapper$mapSuccessWindow$1) continuationImpl;
            int i2 = scootersSubscriptionPurchaseInfoWindowMapper$mapSuccessWindow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersSubscriptionPurchaseInfoWindowMapper$mapSuccessWindow$1.label = i2 - Integer.MIN_VALUE;
                ScootersSubscriptionPurchaseInfoWindowMapper$mapSuccessWindow$1 scootersSubscriptionPurchaseInfoWindowMapper$mapSuccessWindow$12 = scootersSubscriptionPurchaseInfoWindowMapper$mapSuccessWindow$1;
                Object obj2 = scootersSubscriptionPurchaseInfoWindowMapper$mapSuccessWindow$12.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersSubscriptionPurchaseInfoWindowMapper$mapSuccessWindow$12.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (scootersSubscriptionPurchaseSuccessWindowDto.a.a.isEmpty() || (scootersSubscriptionPurchaseWindowButtonDto = scootersSubscriptionPurchaseSuccessWindowDto.c) == null) {
                        return null;
                    }
                    scootersSubscriptionPurchaseInfoWindowMapper$mapSuccessWindow$12.L$0 = scootersSubscriptionPurchaseSuccessWindowDto;
                    scootersSubscriptionPurchaseInfoWindowMapper$mapSuccessWindow$12.label = 1;
                    obj2 = a(scootersSubscriptionPurchaseWindowButtonDto, scootersSubscriptionPurchaseInfoWindowMapper$mapSuccessWindow$12);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            charSequence = (CharSequence) scootersSubscriptionPurchaseInfoWindowMapper$mapSuccessWindow$12.L$2;
                            dyo0Var = (dyo0) scootersSubscriptionPurchaseInfoWindowMapper$mapSuccessWindow$12.L$1;
                            kotlin.b.b(obj2);
                            return new eyo0(charSequence, (CharSequence) obj2, dyo0Var, null);
                        }
                        dyo0Var = (dyo0) scootersSubscriptionPurchaseInfoWindowMapper$mapSuccessWindow$12.L$1;
                        scootersSubscriptionPurchaseSuccessWindowDto2 = (ScootersSubscriptionPurchaseSuccessWindowDto) scootersSubscriptionPurchaseInfoWindowMapper$mapSuccessWindow$12.L$0;
                        kotlin.b.b(obj2);
                        CharSequence charSequence2 = (CharSequence) obj2;
                        FormattedText formattedText = scootersSubscriptionPurchaseSuccessWindowDto2.b;
                        scootersSubscriptionPurchaseInfoWindowMapper$mapSuccessWindow$12.L$0 = null;
                        scootersSubscriptionPurchaseInfoWindowMapper$mapSuccessWindow$12.L$1 = dyo0Var;
                        scootersSubscriptionPurchaseInfoWindowMapper$mapSuccessWindow$12.L$2 = charSequence2;
                        scootersSubscriptionPurchaseInfoWindowMapper$mapSuccessWindow$12.label = 3;
                        e2 = ru.yandex.taxi.widget.c.e(this.a, formattedText, null, false, scootersSubscriptionPurchaseInfoWindowMapper$mapSuccessWindow$12, 30);
                        if (e2 != obj) {
                            obj2 = e2;
                            charSequence = charSequence2;
                            return new eyo0(charSequence, (CharSequence) obj2, dyo0Var, null);
                        }
                        return obj;
                    }
                    scootersSubscriptionPurchaseSuccessWindowDto = (ScootersSubscriptionPurchaseSuccessWindowDto) scootersSubscriptionPurchaseInfoWindowMapper$mapSuccessWindow$12.L$0;
                    kotlin.b.b(obj2);
                }
                dyo0 dyo0Var2 = (dyo0) obj2;
                FormattedText formattedText2 = scootersSubscriptionPurchaseSuccessWindowDto.a;
                scootersSubscriptionPurchaseInfoWindowMapper$mapSuccessWindow$12.L$0 = scootersSubscriptionPurchaseSuccessWindowDto;
                scootersSubscriptionPurchaseInfoWindowMapper$mapSuccessWindow$12.L$1 = dyo0Var2;
                scootersSubscriptionPurchaseInfoWindowMapper$mapSuccessWindow$12.label = 2;
                e = ru.yandex.taxi.widget.c.e(this.a, formattedText2, null, false, scootersSubscriptionPurchaseInfoWindowMapper$mapSuccessWindow$12, 30);
                if (e != obj) {
                    scootersSubscriptionPurchaseSuccessWindowDto2 = scootersSubscriptionPurchaseSuccessWindowDto;
                    dyo0Var = dyo0Var2;
                    obj2 = e;
                    CharSequence charSequence22 = (CharSequence) obj2;
                    FormattedText formattedText3 = scootersSubscriptionPurchaseSuccessWindowDto2.b;
                    scootersSubscriptionPurchaseInfoWindowMapper$mapSuccessWindow$12.L$0 = null;
                    scootersSubscriptionPurchaseInfoWindowMapper$mapSuccessWindow$12.L$1 = dyo0Var;
                    scootersSubscriptionPurchaseInfoWindowMapper$mapSuccessWindow$12.L$2 = charSequence22;
                    scootersSubscriptionPurchaseInfoWindowMapper$mapSuccessWindow$12.label = 3;
                    e2 = ru.yandex.taxi.widget.c.e(this.a, formattedText3, null, false, scootersSubscriptionPurchaseInfoWindowMapper$mapSuccessWindow$12, 30);
                    if (e2 != obj) {
                    }
                }
                return obj;
            }
        }
        scootersSubscriptionPurchaseInfoWindowMapper$mapSuccessWindow$1 = new ScootersSubscriptionPurchaseInfoWindowMapper$mapSuccessWindow$1(this, continuationImpl);
        ScootersSubscriptionPurchaseInfoWindowMapper$mapSuccessWindow$1 scootersSubscriptionPurchaseInfoWindowMapper$mapSuccessWindow$122 = scootersSubscriptionPurchaseInfoWindowMapper$mapSuccessWindow$1;
        Object obj22 = scootersSubscriptionPurchaseInfoWindowMapper$mapSuccessWindow$122.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersSubscriptionPurchaseInfoWindowMapper$mapSuccessWindow$122.label;
        if (i != 0) {
        }
        dyo0 dyo0Var22 = (dyo0) obj22;
        FormattedText formattedText22 = scootersSubscriptionPurchaseSuccessWindowDto.a;
        scootersSubscriptionPurchaseInfoWindowMapper$mapSuccessWindow$122.L$0 = scootersSubscriptionPurchaseSuccessWindowDto;
        scootersSubscriptionPurchaseInfoWindowMapper$mapSuccessWindow$122.L$1 = dyo0Var22;
        scootersSubscriptionPurchaseInfoWindowMapper$mapSuccessWindow$122.label = 2;
        e = ru.yandex.taxi.widget.c.e(this.a, formattedText22, null, false, scootersSubscriptionPurchaseInfoWindowMapper$mapSuccessWindow$122, 30);
        if (e != obj) {
        }
        return obj;
    }
}
