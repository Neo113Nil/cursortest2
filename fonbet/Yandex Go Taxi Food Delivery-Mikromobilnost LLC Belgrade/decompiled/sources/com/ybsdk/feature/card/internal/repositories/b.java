package com.ybsdk.feature.card.internal.repositories;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.core.utils.dto.SecondAuthorizationResponse;
import com.ybsdk.core.utils.dto.TwoFactorAuthResponse;
import com.ybsdk.core.utils.dto.e;
import com.ybsdk.core.utils.dto.f;
import com.ybsdk.feature.card.api.entities.YbCardStatusEntity;
import com.ybsdk.feature.card.internal.network.CardApi;
import com.ybsdk.feature.card.internal.network.PciDssCardApi;
import com.ybsdk.feature.card.internal.network.dto.CardClaimingStaticInfoResponse;
import defpackage.ny61;
import defpackage.tyo0;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class b {
    public final CardApi a;
    public final PciDssCardApi b;

    public b(CardApi cardApi, PciDssCardApi pciDssCardApi) {
        this.a = cardApi;
        this.b = pciDssCardApi;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        if (r0 == r11) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, String str3, String str4, String str5, String str6, ContinuationImpl continuationImpl) {
        CardRepository$activateCard$1 cardRepository$activateCard$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof CardRepository$activateCard$1) {
            cardRepository$activateCard$1 = (CardRepository$activateCard$1) continuationImpl;
            int i2 = cardRepository$activateCard$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cardRepository$activateCard$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cardRepository$activateCard$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardRepository$activateCard$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    CardRepository$activateCard$2 cardRepository$activateCard$2 = new CardRepository$activateCard$2(this, str4, str5, str6, str, str2, str3, null);
                    cardRepository$activateCard$1.label = 1;
                    c = com.ybsdk.core.utils.ext.c.c(cardRepository$activateCard$2, cardRepository$activateCard$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                CardRepository$activateCard$3$1 cardRepository$activateCard$3$1 = new CardRepository$activateCard$3$1(2, null);
                cardRepository$activateCard$1.label = 2;
                Object a2 = f.a((TwoFactorAuthResponse) c, cardRepository$activateCard$3$1, cardRepository$activateCard$1);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        cardRepository$activateCard$1 = new CardRepository$activateCard$1(this, continuationImpl);
        Object obj2 = cardRepository$activateCard$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardRepository$activateCard$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, String str3, String str4, ContinuationImpl continuationImpl) {
        CardRepository$createApplication$1 cardRepository$createApplication$1;
        int i;
        if (continuationImpl instanceof CardRepository$createApplication$1) {
            cardRepository$createApplication$1 = (CardRepository$createApplication$1) continuationImpl;
            int i2 = cardRepository$createApplication$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cardRepository$createApplication$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cardRepository$createApplication$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardRepository$createApplication$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                CardRepository$createApplication$2 cardRepository$createApplication$2 = new CardRepository$createApplication$2(this, str, str4, str2, str3, null);
                cardRepository$createApplication$1.label = 1;
                Object c = com.ybsdk.core.utils.ext.c.c(cardRepository$createApplication$2, cardRepository$createApplication$1);
                return c == coroutineSingletons ? coroutineSingletons : c;
            }
        }
        cardRepository$createApplication$1 = new CardRepository$createApplication$1(this, continuationImpl);
        Object obj2 = cardRepository$createApplication$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardRepository$createApplication$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(int i, String str, ContinuationImpl continuationImpl) {
        CardRepository$getApplicationStatus$1 cardRepository$getApplicationStatus$1;
        int i2;
        if (continuationImpl instanceof CardRepository$getApplicationStatus$1) {
            cardRepository$getApplicationStatus$1 = (CardRepository$getApplicationStatus$1) continuationImpl;
            int i3 = cardRepository$getApplicationStatus$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cardRepository$getApplicationStatus$1.label = i3 - Integer.MIN_VALUE;
                Object obj = cardRepository$getApplicationStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = cardRepository$getApplicationStatus$1.label;
                if (i2 == 0) {
                    if (i2 == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                CardRepository$getApplicationStatus$2 cardRepository$getApplicationStatus$2 = new CardRepository$getApplicationStatus$2(this, str, i, null);
                cardRepository$getApplicationStatus$1.label = 1;
                Object c = com.ybsdk.core.utils.ext.c.c(cardRepository$getApplicationStatus$2, cardRepository$getApplicationStatus$1);
                return c == coroutineSingletons ? coroutineSingletons : c;
            }
        }
        cardRepository$getApplicationStatus$1 = new CardRepository$getApplicationStatus$1(this, continuationImpl);
        Object obj2 = cardRepository$getApplicationStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = cardRepository$getApplicationStatus$1.label;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, ContinuationImpl continuationImpl) {
        CardRepository$getCardActivationInfo$1 cardRepository$getCardActivationInfo$1;
        int i;
        Object c;
        if (continuationImpl instanceof CardRepository$getCardActivationInfo$1) {
            cardRepository$getCardActivationInfo$1 = (CardRepository$getCardActivationInfo$1) continuationImpl;
            int i2 = cardRepository$getCardActivationInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cardRepository$getCardActivationInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cardRepository$getCardActivationInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardRepository$getCardActivationInfo$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    CardRepository$getCardActivationInfo$2 cardRepository$getCardActivationInfo$2 = new CardRepository$getCardActivationInfo$2(this, str, null);
                    cardRepository$getCardActivationInfo$1.label = 1;
                    c = com.ybsdk.core.utils.ext.c.c(cardRepository$getCardActivationInfo$2, cardRepository$getCardActivationInfo$1);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                if (!(c instanceof Result.Failure)) {
                    return c;
                }
                try {
                    return c.a((CardClaimingStaticInfoResponse) c);
                } catch (Throwable th) {
                    return new Result.Failure(th);
                }
            }
        }
        cardRepository$getCardActivationInfo$1 = new CardRepository$getCardActivationInfo$1(this, continuationImpl);
        Object obj2 = cardRepository$getCardActivationInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardRepository$getCardActivationInfo$1.label;
        if (i != 0) {
        }
        if (!(c instanceof Result.Failure)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, ContinuationImpl continuationImpl) {
        CardRepository$getCardRenameScreen$1 cardRepository$getCardRenameScreen$1;
        int i;
        if (continuationImpl instanceof CardRepository$getCardRenameScreen$1) {
            cardRepository$getCardRenameScreen$1 = (CardRepository$getCardRenameScreen$1) continuationImpl;
            int i2 = cardRepository$getCardRenameScreen$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cardRepository$getCardRenameScreen$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cardRepository$getCardRenameScreen$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardRepository$getCardRenameScreen$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                CardRepository$getCardRenameScreen$2 cardRepository$getCardRenameScreen$2 = new CardRepository$getCardRenameScreen$2(this, str, null);
                cardRepository$getCardRenameScreen$1.label = 1;
                Object c = com.ybsdk.core.utils.ext.c.c(cardRepository$getCardRenameScreen$2, cardRepository$getCardRenameScreen$1);
                return c == coroutineSingletons ? coroutineSingletons : c;
            }
        }
        cardRepository$getCardRenameScreen$1 = new CardRepository$getCardRenameScreen$1(this, continuationImpl);
        Object obj2 = cardRepository$getCardRenameScreen$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardRepository$getCardRenameScreen$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, String str2, String str3, String str4, ContinuationImpl continuationImpl) {
        CardRepository$getCardSamsungPayData$1 cardRepository$getCardSamsungPayData$1;
        int i;
        if (continuationImpl instanceof CardRepository$getCardSamsungPayData$1) {
            cardRepository$getCardSamsungPayData$1 = (CardRepository$getCardSamsungPayData$1) continuationImpl;
            int i2 = cardRepository$getCardSamsungPayData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cardRepository$getCardSamsungPayData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cardRepository$getCardSamsungPayData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardRepository$getCardSamsungPayData$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                CardRepository$getCardSamsungPayData$2 cardRepository$getCardSamsungPayData$2 = new CardRepository$getCardSamsungPayData$2(this, str4, str, str2, str3, null);
                cardRepository$getCardSamsungPayData$1.label = 1;
                Object c = com.ybsdk.core.utils.ext.c.c(cardRepository$getCardSamsungPayData$2, cardRepository$getCardSamsungPayData$1);
                return c == coroutineSingletons ? coroutineSingletons : c;
            }
        }
        cardRepository$getCardSamsungPayData$1 = new CardRepository$getCardSamsungPayData$1(this, continuationImpl);
        Object obj2 = cardRepository$getCardSamsungPayData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardRepository$getCardSamsungPayData$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, String str2, String str3, String str4, ContinuationImpl continuationImpl) {
        CardRepository$getCorpCardDetails$1 cardRepository$getCorpCardDetails$1;
        int i;
        if (continuationImpl instanceof CardRepository$getCorpCardDetails$1) {
            cardRepository$getCorpCardDetails$1 = (CardRepository$getCorpCardDetails$1) continuationImpl;
            int i2 = cardRepository$getCorpCardDetails$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cardRepository$getCorpCardDetails$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cardRepository$getCorpCardDetails$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardRepository$getCorpCardDetails$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                CardRepository$getCorpCardDetails$2 cardRepository$getCorpCardDetails$2 = new CardRepository$getCorpCardDetails$2(this, str2, str, str3, str4, null);
                cardRepository$getCorpCardDetails$1.label = 1;
                Object c = com.ybsdk.core.utils.ext.c.c(cardRepository$getCorpCardDetails$2, cardRepository$getCorpCardDetails$1);
                return c == coroutineSingletons ? coroutineSingletons : c;
            }
        }
        cardRepository$getCorpCardDetails$1 = new CardRepository$getCorpCardDetails$1(this, continuationImpl);
        Object obj2 = cardRepository$getCorpCardDetails$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardRepository$getCorpCardDetails$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(String str, String str2, ContinuationImpl continuationImpl) {
        CardRepository$getSingleCardDetails$1 cardRepository$getSingleCardDetails$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof CardRepository$getSingleCardDetails$1) {
            cardRepository$getSingleCardDetails$1 = (CardRepository$getSingleCardDetails$1) continuationImpl;
            int i2 = cardRepository$getSingleCardDetails$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cardRepository$getSingleCardDetails$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cardRepository$getSingleCardDetails$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardRepository$getSingleCardDetails$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    CardRepository$getSingleCardDetails$2 cardRepository$getSingleCardDetails$2 = new CardRepository$getSingleCardDetails$2(this, str, str2, null);
                    cardRepository$getSingleCardDetails$1.label = 1;
                    c = com.ybsdk.core.utils.ext.c.c(cardRepository$getSingleCardDetails$2, cardRepository$getSingleCardDetails$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                CardRepository$getSingleCardDetails$3$1 cardRepository$getSingleCardDetails$3$1 = new CardRepository$getSingleCardDetails$3$1(2, null);
                cardRepository$getSingleCardDetails$1.label = 2;
                Object a2 = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) c, cardRepository$getSingleCardDetails$3$1, cardRepository$getSingleCardDetails$1);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        cardRepository$getSingleCardDetails$1 = new CardRepository$getSingleCardDetails$1(this, continuationImpl);
        Object obj2 = cardRepository$getSingleCardDetails$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardRepository$getSingleCardDetails$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(String str, String str2, String str3, String str4, ContinuationImpl continuationImpl) {
        CardRepository$getYbCardDetails$1 cardRepository$getYbCardDetails$1;
        int i;
        if (continuationImpl instanceof CardRepository$getYbCardDetails$1) {
            cardRepository$getYbCardDetails$1 = (CardRepository$getYbCardDetails$1) continuationImpl;
            int i2 = cardRepository$getYbCardDetails$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cardRepository$getYbCardDetails$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cardRepository$getYbCardDetails$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardRepository$getYbCardDetails$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                CardRepository$getYbCardDetails$2 cardRepository$getYbCardDetails$2 = new CardRepository$getYbCardDetails$2(this, str2, str, str3, str4, null);
                cardRepository$getYbCardDetails$1.label = 1;
                Object c = com.ybsdk.core.utils.ext.c.c(cardRepository$getYbCardDetails$2, cardRepository$getYbCardDetails$1);
                return c == coroutineSingletons ? coroutineSingletons : c;
            }
        }
        cardRepository$getYbCardDetails$1 = new CardRepository$getYbCardDetails$1(this, continuationImpl);
        Object obj2 = cardRepository$getYbCardDetails$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardRepository$getYbCardDetails$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(String str, String str2, String str3, String str4, String str5, ContinuationImpl continuationImpl) {
        CardRepository$setCardStatusScreen$1 cardRepository$setCardStatusScreen$1;
        int i;
        if (continuationImpl instanceof CardRepository$setCardStatusScreen$1) {
            cardRepository$setCardStatusScreen$1 = (CardRepository$setCardStatusScreen$1) continuationImpl;
            int i2 = cardRepository$setCardStatusScreen$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cardRepository$setCardStatusScreen$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cardRepository$setCardStatusScreen$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardRepository$setCardStatusScreen$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                CardRepository$setCardStatusScreen$2 cardRepository$setCardStatusScreen$2 = new CardRepository$setCardStatusScreen$2(this, str, str2, str3, str4, str5, null);
                cardRepository$setCardStatusScreen$1.label = 1;
                Object c = com.ybsdk.core.utils.ext.c.c(cardRepository$setCardStatusScreen$2, cardRepository$setCardStatusScreen$1);
                return c == coroutineSingletons ? coroutineSingletons : c;
            }
        }
        cardRepository$setCardStatusScreen$1 = new CardRepository$setCardStatusScreen$1(this, continuationImpl);
        Object obj2 = cardRepository$setCardStatusScreen$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardRepository$setCardStatusScreen$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(String str, String str2, String str3, String str4, String str5, ContinuationImpl continuationImpl) {
        CardRepository$setYbCardPin$1 cardRepository$setYbCardPin$1;
        int i;
        if (continuationImpl instanceof CardRepository$setYbCardPin$1) {
            cardRepository$setYbCardPin$1 = (CardRepository$setYbCardPin$1) continuationImpl;
            int i2 = cardRepository$setYbCardPin$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cardRepository$setYbCardPin$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cardRepository$setYbCardPin$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardRepository$setYbCardPin$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                CardRepository$setYbCardPin$2 cardRepository$setYbCardPin$2 = new CardRepository$setYbCardPin$2(this, str4, str5, str, str2, str3, null);
                cardRepository$setYbCardPin$1.label = 1;
                Object c = com.ybsdk.core.utils.ext.c.c(cardRepository$setYbCardPin$2, cardRepository$setYbCardPin$1);
                return c == coroutineSingletons ? coroutineSingletons : c;
            }
        }
        cardRepository$setYbCardPin$1 = new CardRepository$setYbCardPin$1(this, continuationImpl);
        Object obj2 = cardRepository$setYbCardPin$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardRepository$setYbCardPin$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(String str, YbCardStatusEntity ybCardStatusEntity, String str2, String str3, ContinuationImpl continuationImpl) {
        CardRepository$setYbCardStatus$1 cardRepository$setYbCardStatus$1;
        int i;
        Object c;
        if (continuationImpl instanceof CardRepository$setYbCardStatus$1) {
            cardRepository$setYbCardStatus$1 = (CardRepository$setYbCardStatus$1) continuationImpl;
            int i2 = cardRepository$setYbCardStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cardRepository$setYbCardStatus$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cardRepository$setYbCardStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardRepository$setYbCardStatus$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    CardRepository$setYbCardStatus$2 cardRepository$setYbCardStatus$2 = new CardRepository$setYbCardStatus$2(this, str, ybCardStatusEntity, str2, str3, null);
                    cardRepository$setYbCardStatus$1.label = 1;
                    c = com.ybsdk.core.utils.ext.c.c(cardRepository$setYbCardStatus$2, cardRepository$setYbCardStatus$1);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                Throwable a = Result.a(c);
                return a != null ? e.a((SecondAuthorizationResponse) c, new tyo0(14)) : new Result.Failure(a);
            }
        }
        cardRepository$setYbCardStatus$1 = new CardRepository$setYbCardStatus$1(this, continuationImpl);
        Object obj2 = cardRepository$setYbCardStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardRepository$setYbCardStatus$1.label;
        if (i != 0) {
        }
        Throwable a2 = Result.a(c);
        if (a2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        CardRepository$submitIssue$1 cardRepository$submitIssue$1;
        int i;
        if (continuationImpl instanceof CardRepository$submitIssue$1) {
            cardRepository$submitIssue$1 = (CardRepository$submitIssue$1) continuationImpl;
            int i2 = cardRepository$submitIssue$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cardRepository$submitIssue$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cardRepository$submitIssue$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardRepository$submitIssue$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                CardRepository$submitIssue$2 cardRepository$submitIssue$2 = new CardRepository$submitIssue$2(this, str, str3, str2, null);
                cardRepository$submitIssue$1.label = 1;
                Object c = com.ybsdk.core.utils.ext.c.c(cardRepository$submitIssue$2, cardRepository$submitIssue$1);
                return c == coroutineSingletons ? coroutineSingletons : c;
            }
        }
        cardRepository$submitIssue$1 = new CardRepository$submitIssue$1(this, continuationImpl);
        Object obj2 = cardRepository$submitIssue$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardRepository$submitIssue$1.label;
        if (i == 0) {
        }
    }
}
