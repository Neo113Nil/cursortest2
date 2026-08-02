package com.yandex.go.chargers.passes.data;

import defpackage.aka;
import defpackage.bia;
import defpackage.bka;
import defpackage.cka;
import defpackage.cmt;
import defpackage.cy9;
import defpackage.dka;
import defpackage.eia;
import defpackage.eka;
import defpackage.fia;
import defpackage.fmt;
import defpackage.h3y;
import defpackage.k6a;
import defpackage.lia;
import defpackage.mia;
import defpackage.nia;
import defpackage.nka;
import defpackage.ny61;
import defpackage.oia;
import defpackage.oka;
import defpackage.rga;
import defpackage.rol0;
import defpackage.sga;
import defpackage.tga;
import defpackage.uga;
import defpackage.uja;
import defpackage.vfa;
import defpackage.vja;
import defpackage.w511;
import defpackage.wfa;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class r0 {
    public final h3y a;
    public final com.yandex.go.chargers.error.data.a b;
    public final m0 c;
    public final com.yandex.go.chargers.payments.data.a d;

    public r0(h3y h3yVar, com.yandex.go.chargers.error.data.a aVar, m0 m0Var, com.yandex.go.chargers.payments.data.a aVar2) {
        this.a = h3yVar;
        this.b = aVar;
        this.c = m0Var;
        this.d = aVar2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(1:(3:11|12|13)(2:15|16))(2:17|18))(3:26|27|(2:29|30))|19|(1:21)(1:25)|22|23))|36|6|7|(0)(0)|19|(0)(0)|22|23|(2:(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00aa, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ab, code lost:
    
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0056, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008d, code lost:
    
        r0.L$0 = null;
        r0.L$1 = null;
        r0.L$2 = null;
        r0.L$3 = null;
        r0.L$4 = null;
        r0.label = 2;
        r10 = r6.b.a(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009f, code lost:
    
        if (r10 != r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, List list, ContinuationImpl continuationImpl) {
        ChargersPassesRepository$buyPass$1 chargersPassesRepository$buyPass$1;
        int i;
        String str3;
        if (continuationImpl instanceof ChargersPassesRepository$buyPass$1) {
            chargersPassesRepository$buyPass$1 = (ChargersPassesRepository$buyPass$1) continuationImpl;
            int i2 = chargersPassesRepository$buyPass$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersPassesRepository$buyPass$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersPassesRepository$buyPass$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersPassesRepository$buyPass$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    cmt<ChargersPassesBuyResponseDto> f = ((ChargersPassesApi) this.a.get()).f(new ChargersPassesBuyRequestDto(str, str2, list));
                    chargersPassesRepository$buyPass$1.L$0 = null;
                    chargersPassesRepository$buyPass$1.L$1 = str2;
                    chargersPassesRepository$buyPass$1.L$2 = null;
                    chargersPassesRepository$buyPass$1.label = 1;
                    obj = ru.yandex.taxi.network.api.a.a(f, null, chargersPassesRepository$buyPass$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return new eia((cy9) obj);
                    }
                    str2 = (String) chargersPassesRepository$buyPass$1.L$1;
                    kotlin.b.b(obj);
                }
                str3 = ((ChargersPassesBuyResponseDto) obj).a;
                if (str3.length() == 0) {
                    str2 = str3;
                }
                return new fia(str2);
            }
        }
        chargersPassesRepository$buyPass$1 = new ChargersPassesRepository$buyPass$1(this, continuationImpl);
        Object obj2 = chargersPassesRepository$buyPass$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersPassesRepository$buyPass$1.label;
        if (i != 0) {
        }
        str3 = ((ChargersPassesBuyResponseDto) obj2).a;
        if (str3.length() == 0) {
        }
        return new fia(str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        ChargersPassesRepository$getBuyStatus$1 chargersPassesRepository$getBuyStatus$1;
        int i;
        wfa wfaVar;
        if (continuationImpl instanceof ChargersPassesRepository$getBuyStatus$1) {
            chargersPassesRepository$getBuyStatus$1 = (ChargersPassesRepository$getBuyStatus$1) continuationImpl;
            int i2 = chargersPassesRepository$getBuyStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersPassesRepository$getBuyStatus$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersPassesRepository$getBuyStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersPassesRepository$getBuyStatus$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    cmt<wfa> c = ((ChargersPassesApi) this.a.get()).c(new ChargersPassesBuyStatusRequestDto(str));
                    chargersPassesRepository$getBuyStatus$1.L$0 = null;
                    chargersPassesRepository$getBuyStatus$1.label = 1;
                    obj = ru.yandex.taxi.network.api.a.b(c, null, chargersPassesRepository$getBuyStatus$1);
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
                wfaVar = (wfa) ((fmt) obj).a;
                if (!(wfaVar instanceof ChargersPassesBuyStatusResponseDto$Success)) {
                    ChargersPassesBuyStatusResponseDto$Success chargersPassesBuyStatusResponseDto$Success = (ChargersPassesBuyStatusResponseDto$Success) wfaVar;
                    String str2 = chargersPassesBuyStatusResponseDto$Success.b;
                    ChargersPassesBuyStatusScreenDto chargersPassesBuyStatusScreenDto = chargersPassesBuyStatusResponseDto$Success.c;
                    return new oia(str2, new bia(chargersPassesBuyStatusScreenDto.b, chargersPassesBuyStatusScreenDto.c, chargersPassesBuyStatusScreenDto.d.a));
                }
                if (wfaVar instanceof ChargersPassesBuyStatusResponseDto$Pending) {
                    return new nia(((ChargersPassesBuyStatusResponseDto$Pending) wfaVar).b.a);
                }
                if (wfaVar instanceof ChargersPassesBuyStatusResponseDto$Failed) {
                    ChargersPassesBuyStatusScreenDto chargersPassesBuyStatusScreenDto2 = ((ChargersPassesBuyStatusResponseDto$Failed) wfaVar).b;
                    return new mia(new bia(chargersPassesBuyStatusScreenDto2.b, chargersPassesBuyStatusScreenDto2.c, chargersPassesBuyStatusScreenDto2.d.a));
                }
                if (wfaVar instanceof vfa) {
                    return new lia(cy9.e);
                }
                w511.b();
                return null;
            }
        }
        chargersPassesRepository$getBuyStatus$1 = new ChargersPassesRepository$getBuyStatus$1(this, continuationImpl);
        Object obj2 = chargersPassesRepository$getBuyStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersPassesRepository$getBuyStatus$1.label;
        if (i != 0) {
        }
        wfaVar = (wfa) ((fmt) obj2).a;
        if (!(wfaVar instanceof ChargersPassesBuyStatusResponseDto$Success)) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(3:11|12|13)(2:15|16))(2:17|18))(3:29|30|(2:32|33))|19|(2:21|22)(2:23|(2:25|26)(2:27|28))))|39|6|7|(0)(0)|19|(0)(0)|(2:(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a7, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a8, code lost:
    
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0045, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008e, code lost:
    
        r0.L$0 = null;
        r0.L$1 = null;
        r0.L$2 = null;
        r0.label = 2;
        r8 = r6.b.a(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009c, code lost:
    
        if (r8 != r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e A[Catch: all -> 0x0045, CancellationException -> 0x00a7, TryCatch #2 {CancellationException -> 0x00a7, all -> 0x0045, blocks: (B:18:0x0041, B:19:0x0066, B:21:0x006e, B:23:0x007c, B:25:0x0080, B:27:0x0088, B:28:0x008d, B:30:0x004a), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c A[Catch: all -> 0x0045, CancellationException -> 0x00a7, TryCatch #2 {CancellationException -> 0x00a7, all -> 0x0045, blocks: (B:18:0x0041, B:19:0x0066, B:21:0x006e, B:23:0x007c, B:25:0x0080, B:27:0x0088, B:28:0x008d, B:30:0x004a), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        ChargersPassesRepository$getOffer$1 chargersPassesRepository$getOffer$1;
        int i;
        sga sgaVar;
        if (continuationImpl instanceof ChargersPassesRepository$getOffer$1) {
            chargersPassesRepository$getOffer$1 = (ChargersPassesRepository$getOffer$1) continuationImpl;
            int i2 = chargersPassesRepository$getOffer$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersPassesRepository$getOffer$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersPassesRepository$getOffer$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersPassesRepository$getOffer$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    cmt<ChargersPassesOfferResponseDto> e = ((ChargersPassesApi) this.a.get()).e(new ChargersPassesOfferRequestDto(str));
                    chargersPassesRepository$getOffer$1.L$0 = null;
                    chargersPassesRepository$getOffer$1.label = 1;
                    obj = ru.yandex.taxi.network.api.a.a(e, null, chargersPassesRepository$getOffer$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return new tga((cy9) obj);
                    }
                    kotlin.b.b(obj);
                }
                sgaVar = ((ChargersPassesOfferResponseDto) obj).a;
                if (!(sgaVar instanceof ChargersPassesOfferResponseScreenDto$Offer)) {
                    return new uga((ChargersPassesOfferResponseScreenDto$Offer) sgaVar, this.d.c());
                }
                if (sgaVar instanceof rga) {
                    return new tga(cy9.e);
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        chargersPassesRepository$getOffer$1 = new ChargersPassesRepository$getOffer$1(this, continuationImpl);
        Object obj2 = chargersPassesRepository$getOffer$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersPassesRepository$getOffer$1.label;
        if (i != 0) {
        }
        sgaVar = ((ChargersPassesOfferResponseDto) obj2).a;
        if (!(sgaVar instanceof ChargersPassesOfferResponseScreenDto$Offer)) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(3:11|12|13)(2:15|16))(1:17))(3:32|33|(2:35|36))|18|(2:20|21)(2:22|(2:24|25)(2:26|(2:28|29)(2:30|31)))))|42|6|7|(0)(0)|18|(0)(0)|(2:(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ac, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ad, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x003d, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0095, code lost:
    
        r0.L$0 = null;
        r0.L$1 = null;
        r0.label = 2;
        r8 = r7.b.a(r8, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a1, code lost:
    
        if (r8 != r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d A[Catch: all -> 0x003d, CancellationException -> 0x00ac, TryCatch #2 {CancellationException -> 0x00ac, all -> 0x003d, blocks: (B:17:0x0039, B:18:0x0057, B:20:0x005d, B:22:0x0071, B:24:0x0075, B:26:0x0083, B:28:0x0087, B:30:0x008f, B:31:0x0094, B:33:0x0042), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071 A[Catch: all -> 0x003d, CancellationException -> 0x00ac, TryCatch #2 {CancellationException -> 0x00ac, all -> 0x003d, blocks: (B:17:0x0039, B:18:0x0057, B:20:0x005d, B:22:0x0071, B:24:0x0075, B:26:0x0083, B:28:0x0087, B:30:0x008f, B:31:0x0094, B:33:0x0042), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        ChargersPassesRepository$getPassesContent$1 chargersPassesRepository$getPassesContent$1;
        int i;
        bka bkaVar;
        if (continuationImpl instanceof ChargersPassesRepository$getPassesContent$1) {
            chargersPassesRepository$getPassesContent$1 = (ChargersPassesRepository$getPassesContent$1) continuationImpl;
            int i2 = chargersPassesRepository$getPassesContent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersPassesRepository$getPassesContent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersPassesRepository$getPassesContent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersPassesRepository$getPassesContent$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    cmt<bka> d = ((ChargersPassesApi) this.a.get()).d();
                    chargersPassesRepository$getPassesContent$1.label = 1;
                    obj = ru.yandex.taxi.network.api.a.a(d, null, chargersPassesRepository$getPassesContent$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return new cka((cy9) obj);
                    }
                    kotlin.b.b(obj);
                }
                bkaVar = (bka) obj;
                if (!(bkaVar instanceof ChargersPassesResponseDto$PassesListScreen)) {
                    return new eka(((ChargersPassesResponseDto$PassesListScreen) bkaVar).b, ((ChargersPassesResponseDto$PassesListScreen) bkaVar).c, ((ChargersPassesResponseDto$PassesListScreen) bkaVar).d);
                }
                if (bkaVar instanceof ChargersPassesOfferResponseScreenDto$Offer) {
                    return new dka((ChargersPassesOfferResponseScreenDto$Offer) bkaVar, this.d.c());
                }
                if (bkaVar instanceof aka) {
                    return new cka(cy9.e);
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        chargersPassesRepository$getPassesContent$1 = new ChargersPassesRepository$getPassesContent$1(this, continuationImpl);
        Object obj2 = chargersPassesRepository$getPassesContent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersPassesRepository$getPassesContent$1.label;
        if (i != 0) {
        }
        bkaVar = (bka) obj2;
        if (!(bkaVar instanceof ChargersPassesResponseDto$PassesListScreen)) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(3:11|12|13)(2:15|16))(2:17|18))(3:22|23|(2:25|26))|19|20))|32|6|7|(0)(0)|19|20|(2:(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0083, code lost:
    
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0045, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0069, code lost:
    
        r0.L$0 = null;
        r0.L$1 = null;
        r0.L$2 = null;
        r0.label = 2;
        r8 = r6.b.a(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
    
        if (r8 != r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, ContinuationImpl continuationImpl) {
        ChargersPassesRepository$getPaymentSettings$1 chargersPassesRepository$getPaymentSettings$1;
        int i;
        if (continuationImpl instanceof ChargersPassesRepository$getPaymentSettings$1) {
            chargersPassesRepository$getPaymentSettings$1 = (ChargersPassesRepository$getPaymentSettings$1) continuationImpl;
            int i2 = chargersPassesRepository$getPaymentSettings$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersPassesRepository$getPaymentSettings$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersPassesRepository$getPaymentSettings$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersPassesRepository$getPaymentSettings$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    cmt<ChargersPassesPaymentSettingsResponseDto> b = ((ChargersPassesApi) this.a.get()).b(str);
                    chargersPassesRepository$getPaymentSettings$1.L$0 = null;
                    chargersPassesRepository$getPaymentSettings$1.label = 1;
                    obj = ru.yandex.taxi.network.api.a.a(b, null, chargersPassesRepository$getPaymentSettings$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return new nka((cy9) obj);
                    }
                    kotlin.b.b(obj);
                }
                return new oka((ChargersPassesPaymentSettingsResponseDto) obj);
            }
        }
        chargersPassesRepository$getPaymentSettings$1 = new ChargersPassesRepository$getPaymentSettings$1(this, continuationImpl);
        Object obj2 = chargersPassesRepository$getPaymentSettings$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersPassesRepository$getPaymentSettings$1.label;
        if (i != 0) {
        }
        return new oka((ChargersPassesPaymentSettingsResponseDto) obj2);
    }

    public final rol0 f(String str) {
        return new rol0(new ChargersPassesRepository$pollBuyStatus$1(this, str, null));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(1:(3:12|13|14)(2:16|17))(5:18|19|20|21|22))(2:24|25))(3:33|34|(2:36|31))|26|(5:28|(2:30|31)|20|21|22)(3:32|21|22)))|42|6|7|(0)(0)|26|(0)(0)|(2:(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c2, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c3, code lost:
    
        throw r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0053, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a7, code lost:
    
        r0.L$0 = null;
        r0.L$1 = null;
        r0.L$2 = null;
        r0.Z$0 = r11;
        r0.label = 3;
        r10 = r8.b.a(r9, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b7, code lost:
    
        if (r10 != r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008a A[Catch: all -> 0x0053, CancellationException -> 0x00c2, TryCatch #2 {CancellationException -> 0x00c2, all -> 0x0053, blocks: (B:19:0x004f, B:20:0x009d, B:21:0x00a1, B:25:0x005b, B:26:0x0084, B:28:0x008a, B:34:0x0062), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, ContinuationImpl continuationImpl, boolean z) {
        ChargersPassesRepository$updatePass$1 chargersPassesRepository$updatePass$1;
        int i;
        ChargersPassNotificationDto chargersPassNotificationDto;
        k6a k6aVar;
        if (continuationImpl instanceof ChargersPassesRepository$updatePass$1) {
            chargersPassesRepository$updatePass$1 = (ChargersPassesRepository$updatePass$1) continuationImpl;
            int i2 = chargersPassesRepository$updatePass$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersPassesRepository$updatePass$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersPassesRepository$updatePass$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersPassesRepository$updatePass$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    cmt<ChargersPassesCancelResumeResponseDto> a = ((ChargersPassesApi) this.a.get()).a(str, new ChargersPassesUpdateRequestDto(Boolean.valueOf(z), 2));
                    chargersPassesRepository$updatePass$1.L$0 = null;
                    chargersPassesRepository$updatePass$1.Z$0 = z;
                    chargersPassesRepository$updatePass$1.label = 1;
                    obj = ru.yandex.taxi.network.api.a.a(a, null, chargersPassesRepository$updatePass$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            z = chargersPassesRepository$updatePass$1.Z$0;
                            kotlin.b.b(obj);
                            k6aVar = (k6a) obj;
                            return new vja(k6aVar);
                        }
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return new uja((cy9) obj);
                    }
                    z = chargersPassesRepository$updatePass$1.Z$0;
                    kotlin.b.b(obj);
                }
                chargersPassNotificationDto = ((ChargersPassesCancelResumeResponseDto) obj).b;
                if (chargersPassNotificationDto != null) {
                    k6aVar = null;
                    return new vja(k6aVar);
                }
                m0 m0Var = this.c;
                chargersPassesRepository$updatePass$1.L$0 = null;
                chargersPassesRepository$updatePass$1.L$1 = null;
                chargersPassesRepository$updatePass$1.L$2 = null;
                chargersPassesRepository$updatePass$1.Z$0 = z;
                chargersPassesRepository$updatePass$1.label = 2;
                obj = m0Var.a(chargersPassNotificationDto, chargersPassesRepository$updatePass$1);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                k6aVar = (k6a) obj;
                return new vja(k6aVar);
            }
        }
        chargersPassesRepository$updatePass$1 = new ChargersPassesRepository$updatePass$1(this, continuationImpl);
        Object obj2 = chargersPassesRepository$updatePass$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersPassesRepository$updatePass$1.label;
        if (i != 0) {
        }
        chargersPassNotificationDto = ((ChargersPassesCancelResumeResponseDto) obj2).b;
        if (chargersPassNotificationDto != null) {
        }
    }
}
