package com.yandex.go.masstransit.sdk.order.impl.tickets;

import android.content.Context;
import android.util.Base64;
import com.yandex.go.masstransit.sdk.core.design.slot.dto.MasstransitSlotItemDto;
import com.yandex.go.masstransit.sdk.core.dto.CurrencyRulesDto;
import com.yandex.go.masstransit.sdk.core.dto.PaymentMethodDto;
import com.yandex.go.masstransit.sdk.order.impl.orders.AnimationGradientDto;
import com.yandex.go.masstransit.sdk.order.impl.orders.HeaderDto;
import com.yandex.go.masstransit.sdk.order.impl.orders.MasstransitOrderDto;
import com.yandex.go.masstransit.sdk.order.impl.orders.MasstransitTicketDto;
import com.yandex.go.masstransit.sdk.order.impl.orders.NeedActivationDescriptionDto;
import com.yandex.go.masstransit.sdk.order.impl.orders.NeedActivationStateDto;
import com.yandex.go.masstransit.sdk.order.impl.orders.PaymentDto;
import com.yandex.go.masstransit.sdk.order.impl.orders.TransportPassDto$CppkSuburbanActivationDto;
import com.yandex.go.masstransit.sdk.order.impl.orders.TransportPassDto$DefaultPassDto;
import com.yandex.go.masstransit.sdk.order.impl.orders.TransportPassDto$QrCodePassDto;
import com.yandex.go.masstransit.sdk.order.impl.orders.w;
import com.yandex.go.masstransit.sdk.order.impl.orders.x;
import defpackage.a411;
import defpackage.avj0;
import defpackage.b411;
import defpackage.cq2;
import defpackage.cyh0;
import defpackage.d3v0;
import defpackage.e3v0;
import defpackage.g940;
import defpackage.j940;
import defpackage.jl40;
import defpackage.l8v;
import defpackage.lja0;
import defpackage.ly3;
import defpackage.mja1;
import defpackage.ny61;
import defpackage.o740;
import defpackage.ovi0;
import defpackage.p740;
import defpackage.q740;
import defpackage.r740;
import defpackage.s740;
import defpackage.t510;
import defpackage.t740;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tt2;
import defpackage.u510;
import defpackage.uyj;
import defpackage.uza;
import defpackage.v8u;
import defpackage.w1z0;
import defpackage.w511;
import defpackage.wp2;
import defpackage.y311;
import defpackage.yp2;
import defpackage.yte0;
import defpackage.z311;
import defpackage.zp2;
import defpackage.zuj0;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes12.dex */
public final class m {
    public final Context a;
    public final zuj0 b;
    public final ru.yandex.taxi.widget.c c;
    public final yp2 d;
    public final com.yandex.go.masstransit.sdk.core.design.slot.mapper.a e;
    public final ru.yandex.taxi.masstransit.tickets.c f;
    public final int g;

    public m(Context context, zuj0 zuj0Var, ru.yandex.taxi.widget.c cVar, yp2 yp2Var, tt2 tt2Var, w1z0 w1z0Var, com.yandex.go.masstransit.sdk.core.design.slot.mapper.a aVar, ru.yandex.taxi.masstransit.tickets.c cVar2, int i) {
        this.a = context;
        this.b = zuj0Var;
        this.c = cVar;
        this.d = yp2Var;
        this.e = aVar;
        this.f = cVar2;
        this.g = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(TransportPassDto$CppkSuburbanActivationDto transportPassDto$CppkSuburbanActivationDto, String str, String str2, String str3, String str4, ContinuationImpl continuationImpl) {
        MtTicketsUiStateMapper$mapNotActivatedTicketState$1 mtTicketsUiStateMapper$mapNotActivatedTicketState$1;
        int i;
        String str5;
        String str6;
        String str7;
        TransportPassDto$CppkSuburbanActivationDto transportPassDto$CppkSuburbanActivationDto2;
        String str8;
        CharSequence charSequence;
        NeedActivationDescriptionDto needActivationDescriptionDto;
        FormattedText formattedText;
        String str9;
        String str10;
        if (continuationImpl instanceof MtTicketsUiStateMapper$mapNotActivatedTicketState$1) {
            mtTicketsUiStateMapper$mapNotActivatedTicketState$1 = (MtTicketsUiStateMapper$mapNotActivatedTicketState$1) continuationImpl;
            int i2 = mtTicketsUiStateMapper$mapNotActivatedTicketState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtTicketsUiStateMapper$mapNotActivatedTicketState$1.label = i2 - Integer.MIN_VALUE;
                MtTicketsUiStateMapper$mapNotActivatedTicketState$1 mtTicketsUiStateMapper$mapNotActivatedTicketState$12 = mtTicketsUiStateMapper$mapNotActivatedTicketState$1;
                Object obj = mtTicketsUiStateMapper$mapNotActivatedTicketState$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtTicketsUiStateMapper$mapNotActivatedTicketState$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    NeedActivationStateDto needActivationStateDto = transportPassDto$CppkSuburbanActivationDto.e;
                    if (needActivationStateDto == null || (needActivationDescriptionDto = needActivationStateDto.c) == null || (formattedText = needActivationDescriptionDto.a) == null) {
                        str5 = str2;
                        str6 = str3;
                        str7 = str4;
                        transportPassDto$CppkSuburbanActivationDto2 = transportPassDto$CppkSuburbanActivationDto;
                        str8 = str;
                        charSequence = null;
                        String str11 = str6;
                        String str12 = str7;
                        String h = ((avj0) this.b).h(cyh0.mt_sdk_ticket_success_activated_message);
                        NeedActivationStateDto needActivationStateDto2 = transportPassDto$CppkSuburbanActivationDto2.e;
                        ovi0 a = (needActivationStateDto2 != null || (str10 = needActivationStateDto2.a) == null) ? null : mja1.a(str10, null, 6);
                        NeedActivationStateDto needActivationStateDto3 = transportPassDto$CppkSuburbanActivationDto2.e;
                        String str13 = needActivationStateDto3 != null ? needActivationStateDto3.b : null;
                        String str14 = transportPassDto$CppkSuburbanActivationDto2.a;
                        Boolean bool = transportPassDto$CppkSuburbanActivationDto2.d;
                        return new q740(str13, charSequence, a, new g940(str11, str12, str14, str8, bool, null, h), new g940(str11, str12, str14, str8, bool, str5, h));
                    }
                    mtTicketsUiStateMapper$mapNotActivatedTicketState$12.L$0 = transportPassDto$CppkSuburbanActivationDto;
                    str9 = str;
                    mtTicketsUiStateMapper$mapNotActivatedTicketState$12.L$1 = str9;
                    str5 = str2;
                    mtTicketsUiStateMapper$mapNotActivatedTicketState$12.L$2 = str5;
                    str6 = str3;
                    mtTicketsUiStateMapper$mapNotActivatedTicketState$12.L$3 = str6;
                    str7 = str4;
                    mtTicketsUiStateMapper$mapNotActivatedTicketState$12.L$4 = str7;
                    mtTicketsUiStateMapper$mapNotActivatedTicketState$12.L$5 = null;
                    mtTicketsUiStateMapper$mapNotActivatedTicketState$12.label = 1;
                    obj = ru.yandex.taxi.widget.c.e(this.c, formattedText, null, false, mtTicketsUiStateMapper$mapNotActivatedTicketState$12, 30);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    transportPassDto$CppkSuburbanActivationDto2 = transportPassDto$CppkSuburbanActivationDto;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str15 = (String) mtTicketsUiStateMapper$mapNotActivatedTicketState$12.L$4;
                    String str16 = (String) mtTicketsUiStateMapper$mapNotActivatedTicketState$12.L$3;
                    String str17 = (String) mtTicketsUiStateMapper$mapNotActivatedTicketState$12.L$2;
                    String str18 = (String) mtTicketsUiStateMapper$mapNotActivatedTicketState$12.L$1;
                    TransportPassDto$CppkSuburbanActivationDto transportPassDto$CppkSuburbanActivationDto3 = (TransportPassDto$CppkSuburbanActivationDto) mtTicketsUiStateMapper$mapNotActivatedTicketState$12.L$0;
                    kotlin.b.b(obj);
                    str7 = str15;
                    str6 = str16;
                    str5 = str17;
                    str9 = str18;
                    transportPassDto$CppkSuburbanActivationDto2 = transportPassDto$CppkSuburbanActivationDto3;
                }
                str8 = str9;
                charSequence = (CharSequence) obj;
                String str112 = str6;
                String str122 = str7;
                String h2 = ((avj0) this.b).h(cyh0.mt_sdk_ticket_success_activated_message);
                NeedActivationStateDto needActivationStateDto22 = transportPassDto$CppkSuburbanActivationDto2.e;
                if (needActivationStateDto22 != null) {
                }
                NeedActivationStateDto needActivationStateDto32 = transportPassDto$CppkSuburbanActivationDto2.e;
                if (needActivationStateDto32 != null) {
                }
                String str142 = transportPassDto$CppkSuburbanActivationDto2.a;
                Boolean bool2 = transportPassDto$CppkSuburbanActivationDto2.d;
                return new q740(str13, charSequence, a, new g940(str112, str122, str142, str8, bool2, null, h2), new g940(str112, str122, str142, str8, bool2, str5, h2));
            }
        }
        mtTicketsUiStateMapper$mapNotActivatedTicketState$1 = new MtTicketsUiStateMapper$mapNotActivatedTicketState$1(this, continuationImpl);
        MtTicketsUiStateMapper$mapNotActivatedTicketState$1 mtTicketsUiStateMapper$mapNotActivatedTicketState$122 = mtTicketsUiStateMapper$mapNotActivatedTicketState$1;
        Object obj2 = mtTicketsUiStateMapper$mapNotActivatedTicketState$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtTicketsUiStateMapper$mapNotActivatedTicketState$122.label;
        if (i != 0) {
        }
        str8 = str9;
        charSequence = (CharSequence) obj2;
        String str1122 = str6;
        String str1222 = str7;
        String h22 = ((avj0) this.b).h(cyh0.mt_sdk_ticket_success_activated_message);
        NeedActivationStateDto needActivationStateDto222 = transportPassDto$CppkSuburbanActivationDto2.e;
        if (needActivationStateDto222 != null) {
        }
        NeedActivationStateDto needActivationStateDto322 = transportPassDto$CppkSuburbanActivationDto2.e;
        if (needActivationStateDto322 != null) {
        }
        String str1422 = transportPassDto$CppkSuburbanActivationDto2.a;
        Boolean bool22 = transportPassDto$CppkSuburbanActivationDto2.d;
        return new q740(str13, charSequence, a, new g940(str1122, str1222, str1422, str8, bool22, null, h22), new g940(str1122, str1222, str1422, str8, bool22, str5, h22));
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        if (r14 == r0) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(PaymentDto paymentDto, CurrencyRulesDto currencyRulesDto, ContinuationImpl continuationImpl) {
        MtTicketsUiStateMapper$mapPaymentSection$1 mtTicketsUiStateMapper$mapPaymentSection$1;
        int i;
        MasstransitSlotItemDto masstransitSlotItemDto;
        CharSequence charSequence;
        t510 t510Var;
        PaymentDto paymentDto2;
        CharSequence charSequence2;
        PaymentMethodDto paymentMethodDto;
        t510 t510Var2;
        CharSequence charSequence3;
        if (continuationImpl instanceof MtTicketsUiStateMapper$mapPaymentSection$1) {
            mtTicketsUiStateMapper$mapPaymentSection$1 = (MtTicketsUiStateMapper$mapPaymentSection$1) continuationImpl;
            int i2 = mtTicketsUiStateMapper$mapPaymentSection$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtTicketsUiStateMapper$mapPaymentSection$1.label = i2 - Integer.MIN_VALUE;
                MtTicketsUiStateMapper$mapPaymentSection$1 mtTicketsUiStateMapper$mapPaymentSection$12 = mtTicketsUiStateMapper$mapPaymentSection$1;
                Object obj = mtTicketsUiStateMapper$mapPaymentSection$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtTicketsUiStateMapper$mapPaymentSection$12.label;
                yte0 yte0Var = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    FormattedText formattedText = paymentDto.a;
                    mtTicketsUiStateMapper$mapPaymentSection$12.L$0 = paymentDto;
                    mtTicketsUiStateMapper$mapPaymentSection$12.L$1 = currencyRulesDto;
                    mtTicketsUiStateMapper$mapPaymentSection$12.label = 1;
                    obj = ru.yandex.taxi.widget.c.e(this.c, formattedText, null, false, mtTicketsUiStateMapper$mapPaymentSection$12, 30);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            t510Var2 = (t510) mtTicketsUiStateMapper$mapPaymentSection$12.L$4;
                            charSequence3 = (CharSequence) mtTicketsUiStateMapper$mapPaymentSection$12.L$3;
                            kotlin.b.b(obj);
                            yte0Var = (yte0) obj;
                            t510Var = t510Var2;
                            charSequence = charSequence3;
                            return new lja0(charSequence, t510Var, yte0Var);
                        }
                        charSequence2 = (CharSequence) mtTicketsUiStateMapper$mapPaymentSection$12.L$3;
                        paymentDto2 = (PaymentDto) mtTicketsUiStateMapper$mapPaymentSection$12.L$0;
                        kotlin.b.b(obj);
                        t510Var = (t510) obj;
                        PaymentDto paymentDto3 = paymentDto2;
                        charSequence = charSequence2;
                        paymentDto = paymentDto3;
                        paymentMethodDto = paymentDto.c;
                        if (paymentMethodDto != null) {
                            mtTicketsUiStateMapper$mapPaymentSection$12.L$0 = null;
                            mtTicketsUiStateMapper$mapPaymentSection$12.L$1 = null;
                            mtTicketsUiStateMapper$mapPaymentSection$12.L$2 = null;
                            mtTicketsUiStateMapper$mapPaymentSection$12.L$3 = charSequence;
                            mtTicketsUiStateMapper$mapPaymentSection$12.L$4 = t510Var;
                            mtTicketsUiStateMapper$mapPaymentSection$12.label = 3;
                            Object b = this.f.b(paymentMethodDto, mtTicketsUiStateMapper$mapPaymentSection$12);
                            if (b != coroutineSingletons) {
                                t510 t510Var3 = t510Var;
                                obj = b;
                                t510Var2 = t510Var3;
                                charSequence3 = charSequence;
                                yte0Var = (yte0) obj;
                                t510Var = t510Var2;
                                charSequence = charSequence3;
                            }
                            return coroutineSingletons;
                        }
                        return new lja0(charSequence, t510Var, yte0Var);
                    }
                    currencyRulesDto = (CurrencyRulesDto) mtTicketsUiStateMapper$mapPaymentSection$12.L$1;
                    paymentDto = (PaymentDto) mtTicketsUiStateMapper$mapPaymentSection$12.L$0;
                    kotlin.b.b(obj);
                }
                CharSequence charSequence4 = (CharSequence) obj;
                masstransitSlotItemDto = paymentDto.b;
                if (masstransitSlotItemDto != null) {
                    charSequence = charSequence4;
                    t510Var = null;
                    paymentMethodDto = paymentDto.c;
                    if (paymentMethodDto != null) {
                    }
                    return new lja0(charSequence, t510Var, yte0Var);
                }
                mtTicketsUiStateMapper$mapPaymentSection$12.L$0 = paymentDto;
                mtTicketsUiStateMapper$mapPaymentSection$12.L$1 = null;
                mtTicketsUiStateMapper$mapPaymentSection$12.L$2 = null;
                mtTicketsUiStateMapper$mapPaymentSection$12.L$3 = charSequence4;
                mtTicketsUiStateMapper$mapPaymentSection$12.label = 2;
                Object d = this.e.d(masstransitSlotItemDto, currencyRulesDto, mtTicketsUiStateMapper$mapPaymentSection$12);
                if (d != coroutineSingletons) {
                    paymentDto2 = paymentDto;
                    charSequence2 = charSequence4;
                    obj = d;
                    t510Var = (t510) obj;
                    PaymentDto paymentDto32 = paymentDto2;
                    charSequence = charSequence2;
                    paymentDto = paymentDto32;
                    paymentMethodDto = paymentDto.c;
                    if (paymentMethodDto != null) {
                    }
                    return new lja0(charSequence, t510Var, yte0Var);
                }
                return coroutineSingletons;
            }
        }
        mtTicketsUiStateMapper$mapPaymentSection$1 = new MtTicketsUiStateMapper$mapPaymentSection$1(this, continuationImpl);
        MtTicketsUiStateMapper$mapPaymentSection$1 mtTicketsUiStateMapper$mapPaymentSection$122 = mtTicketsUiStateMapper$mapPaymentSection$1;
        Object obj2 = mtTicketsUiStateMapper$mapPaymentSection$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtTicketsUiStateMapper$mapPaymentSection$122.label;
        yte0 yte0Var2 = null;
        if (i != 0) {
        }
        CharSequence charSequence42 = (CharSequence) obj2;
        masstransitSlotItemDto = paymentDto.b;
        if (masstransitSlotItemDto != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r13v4, types: [b411] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(TransportPassDto$QrCodePassDto transportPassDto$QrCodePassDto, String str, ContinuationImpl continuationImpl) {
        MtTicketsUiStateMapper$mapQRActiveState$1 mtTicketsUiStateMapper$mapQRActiveState$1;
        int i;
        a411 a411Var;
        if (continuationImpl instanceof MtTicketsUiStateMapper$mapQRActiveState$1) {
            mtTicketsUiStateMapper$mapQRActiveState$1 = (MtTicketsUiStateMapper$mapQRActiveState$1) continuationImpl;
            int i2 = mtTicketsUiStateMapper$mapQRActiveState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtTicketsUiStateMapper$mapQRActiveState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtTicketsUiStateMapper$mapQRActiveState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtTicketsUiStateMapper$mapQRActiveState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str2 = transportPassDto$QrCodePassDto.a;
                    a411 a411Var2 = a411.a;
                    if (str2 == null) {
                        return new s740(a411Var2);
                    }
                    mtTicketsUiStateMapper$mapQRActiveState$1.L$0 = transportPassDto$QrCodePassDto;
                    mtTicketsUiStateMapper$mapQRActiveState$1.L$1 = str;
                    mtTicketsUiStateMapper$mapQRActiveState$1.L$2 = null;
                    mtTicketsUiStateMapper$mapQRActiveState$1.L$3 = a411Var2;
                    mtTicketsUiStateMapper$mapQRActiveState$1.label = 1;
                    obj = tje.k0(uyj.a, new MtTicketsUiStateMapper$generateQRCode$2(this, str2, null), mtTicketsUiStateMapper$mapQRActiveState$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    a411Var = a411Var2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ?? r13 = (b411) mtTicketsUiStateMapper$mapQRActiveState$1.L$3;
                    str = (String) mtTicketsUiStateMapper$mapQRActiveState$1.L$1;
                    TransportPassDto$QrCodePassDto transportPassDto$QrCodePassDto2 = (TransportPassDto$QrCodePassDto) mtTicketsUiStateMapper$mapQRActiveState$1.L$0;
                    kotlin.b.b(obj);
                    a411Var = r13;
                    transportPassDto$QrCodePassDto = transportPassDto$QrCodePassDto2;
                }
                String str3 = str;
                l8v l8vVar = (l8v) obj;
                String str4 = transportPassDto$QrCodePassDto.c;
                AnimationGradientDto animationGradientDto = transportPassDto$QrCodePassDto.d;
                String str5 = animationGradientDto == null ? animationGradientDto.a : null;
                long j = cq2.d;
                yp2 yp2Var = this.d;
                return new o740(a411Var, l8vVar, str4, ly3.g(j, yp2Var, str5), ly3.g(j, yp2Var, animationGradientDto != null ? animationGradientDto.b : null), str3);
            }
        }
        mtTicketsUiStateMapper$mapQRActiveState$1 = new MtTicketsUiStateMapper$mapQRActiveState$1(this, continuationImpl);
        Object obj2 = mtTicketsUiStateMapper$mapQRActiveState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtTicketsUiStateMapper$mapQRActiveState$1.label;
        if (i != 0) {
        }
        String str32 = str;
        l8v l8vVar2 = (l8v) obj2;
        String str42 = transportPassDto$QrCodePassDto.c;
        AnimationGradientDto animationGradientDto2 = transportPassDto$QrCodePassDto.d;
        if (animationGradientDto2 == null) {
        }
        long j2 = cq2.d;
        yp2 yp2Var2 = this.d;
        return new o740(a411Var, l8vVar2, str42, ly3.g(j2, yp2Var2, str5), ly3.g(j2, yp2Var2, animationGradientDto2 != null ? animationGradientDto2.b : null), str32);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0163, code lost:
    
        if (r2 == r7) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01c3, code lost:
    
        if (r2 == r7) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(TransportPassDto$CppkSuburbanActivationDto transportPassDto$CppkSuburbanActivationDto, String str, String str2, String str3, String str4, String str5, ContinuationImpl continuationImpl) {
        MtTicketsUiStateMapper$mapSuburbanTicketState$1 mtTicketsUiStateMapper$mapSuburbanTicketState$1;
        int i;
        Object obj;
        String str6;
        String str7;
        String str8;
        String str9;
        TransportPassDto$CppkSuburbanActivationDto transportPassDto$CppkSuburbanActivationDto2;
        String str10;
        l8v l8vVar;
        if (continuationImpl instanceof MtTicketsUiStateMapper$mapSuburbanTicketState$1) {
            mtTicketsUiStateMapper$mapSuburbanTicketState$1 = (MtTicketsUiStateMapper$mapSuburbanTicketState$1) continuationImpl;
            int i2 = mtTicketsUiStateMapper$mapSuburbanTicketState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtTicketsUiStateMapper$mapSuburbanTicketState$1.label = i2 - Integer.MIN_VALUE;
                MtTicketsUiStateMapper$mapSuburbanTicketState$1 mtTicketsUiStateMapper$mapSuburbanTicketState$12 = mtTicketsUiStateMapper$mapSuburbanTicketState$1;
                Object obj2 = mtTicketsUiStateMapper$mapSuburbanTicketState$12.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtTicketsUiStateMapper$mapSuburbanTicketState$12.label;
                y311 y311Var = y311.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    String str11 = transportPassDto$CppkSuburbanActivationDto.a;
                    String str12 = transportPassDto$CppkSuburbanActivationDto.b;
                    if (str12 == null) {
                        str12 = str;
                    }
                    if (str11 == null) {
                        return new s740(y311Var);
                    }
                    e3v0 e3v0Var = e3v0.a;
                    if (str12 != null) {
                        byte[] bytes = str12.getBytes(StandardCharsets.UTF_8);
                        byte[] decode = Base64.decode(str11, 0);
                        ByteBuffer wrap = ByteBuffer.wrap(new byte[decode.length + bytes.length]);
                        wrap.put(bytes);
                        wrap.put(decode);
                        obj = new d3v0(new String(wrap.array(), uza.e));
                    } else {
                        obj = e3v0Var;
                    }
                    if (obj instanceof d3v0) {
                        String str13 = ((d3v0) obj).a;
                        mtTicketsUiStateMapper$mapSuburbanTicketState$12.L$0 = transportPassDto$CppkSuburbanActivationDto;
                        mtTicketsUiStateMapper$mapSuburbanTicketState$12.L$1 = str;
                        mtTicketsUiStateMapper$mapSuburbanTicketState$12.L$2 = str2;
                        str6 = str3;
                        mtTicketsUiStateMapper$mapSuburbanTicketState$12.L$3 = str6;
                        str7 = str4;
                        mtTicketsUiStateMapper$mapSuburbanTicketState$12.L$4 = str7;
                        mtTicketsUiStateMapper$mapSuburbanTicketState$12.L$5 = str5;
                        mtTicketsUiStateMapper$mapSuburbanTicketState$12.L$6 = null;
                        mtTicketsUiStateMapper$mapSuburbanTicketState$12.L$7 = null;
                        mtTicketsUiStateMapper$mapSuburbanTicketState$12.L$8 = null;
                        mtTicketsUiStateMapper$mapSuburbanTicketState$12.label = 1;
                        obj2 = tje.k0(uyj.a, new MtTicketsUiStateMapper$generateBarCodeFromValue$2(this, str13, null), mtTicketsUiStateMapper$mapSuburbanTicketState$12);
                        if (obj2 != obj3) {
                            str8 = str;
                            str9 = str2;
                            transportPassDto$CppkSuburbanActivationDto2 = transportPassDto$CppkSuburbanActivationDto;
                            str10 = str5;
                            l8vVar = (l8v) obj2;
                            if (l8vVar == null) {
                            }
                        }
                    } else {
                        if (!obj.equals(e3v0Var)) {
                            w511.b();
                            return null;
                        }
                        mtTicketsUiStateMapper$mapSuburbanTicketState$12.L$0 = null;
                        mtTicketsUiStateMapper$mapSuburbanTicketState$12.L$1 = null;
                        mtTicketsUiStateMapper$mapSuburbanTicketState$12.L$2 = null;
                        mtTicketsUiStateMapper$mapSuburbanTicketState$12.L$3 = null;
                        mtTicketsUiStateMapper$mapSuburbanTicketState$12.L$4 = null;
                        mtTicketsUiStateMapper$mapSuburbanTicketState$12.L$5 = null;
                        mtTicketsUiStateMapper$mapSuburbanTicketState$12.L$6 = null;
                        mtTicketsUiStateMapper$mapSuburbanTicketState$12.L$7 = null;
                        mtTicketsUiStateMapper$mapSuburbanTicketState$12.L$8 = null;
                        mtTicketsUiStateMapper$mapSuburbanTicketState$12.label = 3;
                        obj2 = a(transportPassDto$CppkSuburbanActivationDto, str, str2, str3, str4, mtTicketsUiStateMapper$mapSuburbanTicketState$12);
                    }
                    return obj3;
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.b.b(obj2);
                        return (t740) obj2;
                    }
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return (t740) obj2;
                }
                str10 = (String) mtTicketsUiStateMapper$mapSuburbanTicketState$12.L$5;
                String str14 = (String) mtTicketsUiStateMapper$mapSuburbanTicketState$12.L$4;
                String str15 = (String) mtTicketsUiStateMapper$mapSuburbanTicketState$12.L$3;
                str9 = (String) mtTicketsUiStateMapper$mapSuburbanTicketState$12.L$2;
                str8 = (String) mtTicketsUiStateMapper$mapSuburbanTicketState$12.L$1;
                transportPassDto$CppkSuburbanActivationDto2 = (TransportPassDto$CppkSuburbanActivationDto) mtTicketsUiStateMapper$mapSuburbanTicketState$12.L$0;
                kotlin.b.b(obj2);
                str7 = str14;
                str6 = str15;
                l8vVar = (l8v) obj2;
                if (l8vVar == null) {
                    String str16 = transportPassDto$CppkSuburbanActivationDto2.c;
                    AnimationGradientDto animationGradientDto = transportPassDto$CppkSuburbanActivationDto2.f;
                    String str17 = animationGradientDto != null ? animationGradientDto.a : null;
                    long j = cq2.d;
                    yp2 yp2Var = this.d;
                    return new o740(y311Var, l8vVar, str16, ly3.g(j, yp2Var, str17), ly3.g(j, yp2Var, animationGradientDto != null ? animationGradientDto.b : null), str10);
                }
                mtTicketsUiStateMapper$mapSuburbanTicketState$12.L$0 = null;
                mtTicketsUiStateMapper$mapSuburbanTicketState$12.L$1 = null;
                mtTicketsUiStateMapper$mapSuburbanTicketState$12.L$2 = null;
                mtTicketsUiStateMapper$mapSuburbanTicketState$12.L$3 = null;
                mtTicketsUiStateMapper$mapSuburbanTicketState$12.L$4 = null;
                mtTicketsUiStateMapper$mapSuburbanTicketState$12.L$5 = null;
                mtTicketsUiStateMapper$mapSuburbanTicketState$12.L$6 = null;
                mtTicketsUiStateMapper$mapSuburbanTicketState$12.L$7 = null;
                mtTicketsUiStateMapper$mapSuburbanTicketState$12.L$8 = null;
                mtTicketsUiStateMapper$mapSuburbanTicketState$12.L$9 = null;
                mtTicketsUiStateMapper$mapSuburbanTicketState$12.label = 2;
                obj2 = a(transportPassDto$CppkSuburbanActivationDto2, str8, str9, str6, str7, mtTicketsUiStateMapper$mapSuburbanTicketState$12);
            }
        }
        mtTicketsUiStateMapper$mapSuburbanTicketState$1 = new MtTicketsUiStateMapper$mapSuburbanTicketState$1(this, continuationImpl);
        MtTicketsUiStateMapper$mapSuburbanTicketState$1 mtTicketsUiStateMapper$mapSuburbanTicketState$122 = mtTicketsUiStateMapper$mapSuburbanTicketState$1;
        Object obj22 = mtTicketsUiStateMapper$mapSuburbanTicketState$122.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtTicketsUiStateMapper$mapSuburbanTicketState$122.label;
        y311 y311Var2 = y311.a;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0297 -> B:12:0x029b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x01d9 -> B:27:0x01e2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(MasstransitOrderDto masstransitOrderDto, boolean z, Map map, Map map2, Continuation continuation) {
        MtTicketsUiStateMapper$mapSuccessState$1 mtTicketsUiStateMapper$mapSuccessState$1;
        int i;
        Object obj;
        String str;
        wp2 g;
        Map map3;
        String str2;
        String str3;
        Collection arrayList;
        int i2;
        boolean z2;
        Map map4;
        MtTicketsUiStateMapper$mapSuccessState$1 mtTicketsUiStateMapper$mapSuccessState$12;
        Iterator it;
        MasstransitOrderDto masstransitOrderDto2;
        wp2 wp2Var;
        wp2 wp2Var2;
        CoroutineSingletons coroutineSingletons;
        List list;
        String str4;
        boolean z3;
        String str5;
        String str6;
        lja0 lja0Var;
        MasstransitOrderDto masstransitOrderDto3;
        List list2;
        Collection arrayList2;
        wp2 wp2Var3;
        String str7;
        Iterator it2;
        String str8;
        String str9;
        m mVar = this;
        if (continuation instanceof MtTicketsUiStateMapper$mapSuccessState$1) {
            mtTicketsUiStateMapper$mapSuccessState$1 = (MtTicketsUiStateMapper$mapSuccessState$1) continuation;
            int i3 = mtTicketsUiStateMapper$mapSuccessState$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mtTicketsUiStateMapper$mapSuccessState$1.label = i3 - Integer.MIN_VALUE;
                Object obj2 = mtTicketsUiStateMapper$mapSuccessState$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtTicketsUiStateMapper$mapSuccessState$1.label;
                if (i != 0) {
                    obj = null;
                    kotlin.b.b(obj2);
                    str = masstransitOrderDto.a;
                    String str10 = masstransitOrderDto.c.a.b.a;
                    if (z) {
                        g = null;
                    } else {
                        g = ly3.g(cq2.d, mVar.d, str10);
                    }
                    int i4 = cyh0.mt_sdk_tickets_title;
                    avj0 avj0Var = (avj0) mVar.b;
                    String h = avj0Var.h(i4);
                    String h2 = avj0Var.h(cyh0.mt_sdk_tickets_subtitle);
                    List list3 = masstransitOrderDto.b;
                    map3 = map2;
                    str2 = h;
                    str3 = h2;
                    arrayList = new ArrayList(tcc.n(list3, 10));
                    i2 = 0;
                    z2 = z;
                    map4 = map;
                    mtTicketsUiStateMapper$mapSuccessState$12 = mtTicketsUiStateMapper$mapSuccessState$1;
                    it = list3.iterator();
                    masstransitOrderDto2 = masstransitOrderDto;
                    wp2Var = g;
                    if (it.hasNext()) {
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    int i5 = mtTicketsUiStateMapper$mapSuccessState$1.I$0;
                    boolean z4 = mtTicketsUiStateMapper$mapSuccessState$1.Z$0;
                    Collection collection = (Collection) mtTicketsUiStateMapper$mapSuccessState$1.L$14;
                    String str11 = (String) mtTicketsUiStateMapper$mapSuccessState$1.L$13;
                    String str12 = (String) mtTicketsUiStateMapper$mapSuccessState$1.L$12;
                    wp2 wp2Var4 = (wp2) mtTicketsUiStateMapper$mapSuccessState$1.L$11;
                    String str13 = (String) mtTicketsUiStateMapper$mapSuccessState$1.L$10;
                    Iterator it3 = (Iterator) mtTicketsUiStateMapper$mapSuccessState$1.L$6;
                    Collection collection2 = (Collection) mtTicketsUiStateMapper$mapSuccessState$1.L$5;
                    Map map5 = (Map) mtTicketsUiStateMapper$mapSuccessState$1.L$2;
                    Map map6 = (Map) mtTicketsUiStateMapper$mapSuccessState$1.L$1;
                    masstransitOrderDto2 = (MasstransitOrderDto) mtTicketsUiStateMapper$mapSuccessState$1.L$0;
                    kotlin.b.b(obj2);
                    i2 = i5;
                    coroutineSingletons = coroutineSingletons2;
                    String str14 = str12;
                    z2 = z4;
                    Map map7 = map5;
                    wp2 wp2Var5 = wp2Var4;
                    mtTicketsUiStateMapper$mapSuccessState$12 = mtTicketsUiStateMapper$mapSuccessState$1;
                    it = it3;
                    str3 = str11;
                    Collection collection3 = collection2;
                    collection.add((u510) obj2);
                    str = str13;
                    arrayList = collection3;
                    obj = null;
                    str2 = str14;
                    coroutineSingletons2 = coroutineSingletons;
                    wp2Var = wp2Var5;
                    map4 = map6;
                    map3 = map7;
                    if (it.hasNext()) {
                        MasstransitTicketDto masstransitTicketDto = (MasstransitTicketDto) it.next();
                        CoroutineSingletons coroutineSingletons3 = coroutineSingletons2;
                        String str15 = (String) map4.get(masstransitOrderDto2.a + "_" + masstransitTicketDto.a);
                        String str16 = masstransitOrderDto2.a;
                        if (str15 == null) {
                            str15 = (String) map3.get(masstransitTicketDto.a);
                        }
                        String str17 = masstransitOrderDto2.e;
                        CurrencyRulesDto currencyRulesDto = masstransitOrderDto2.d;
                        mtTicketsUiStateMapper$mapSuccessState$12.L$0 = masstransitOrderDto2;
                        mtTicketsUiStateMapper$mapSuccessState$12.L$1 = map4;
                        mtTicketsUiStateMapper$mapSuccessState$12.L$2 = map3;
                        String str18 = str15;
                        Object obj3 = obj;
                        mtTicketsUiStateMapper$mapSuccessState$12.L$3 = obj3;
                        mtTicketsUiStateMapper$mapSuccessState$12.L$4 = obj3;
                        mtTicketsUiStateMapper$mapSuccessState$12.L$5 = arrayList;
                        mtTicketsUiStateMapper$mapSuccessState$12.L$6 = it;
                        mtTicketsUiStateMapper$mapSuccessState$12.L$7 = obj3;
                        mtTicketsUiStateMapper$mapSuccessState$12.L$8 = obj3;
                        mtTicketsUiStateMapper$mapSuccessState$12.L$9 = obj3;
                        mtTicketsUiStateMapper$mapSuccessState$12.L$10 = str;
                        mtTicketsUiStateMapper$mapSuccessState$12.L$11 = wp2Var;
                        mtTicketsUiStateMapper$mapSuccessState$12.L$12 = str2;
                        mtTicketsUiStateMapper$mapSuccessState$12.L$13 = str3;
                        mtTicketsUiStateMapper$mapSuccessState$12.L$14 = arrayList;
                        mtTicketsUiStateMapper$mapSuccessState$12.Z$0 = z2;
                        mtTicketsUiStateMapper$mapSuccessState$12.I$0 = i2;
                        mtTicketsUiStateMapper$mapSuccessState$12.label = 1;
                        Iterator it4 = it;
                        String str19 = str;
                        Map map8 = map4;
                        wp2Var5 = wp2Var;
                        mVar = this;
                        obj2 = mVar.f(str16, masstransitTicketDto, str18, str17, currencyRulesDto, mtTicketsUiStateMapper$mapSuccessState$12);
                        coroutineSingletons = coroutineSingletons3;
                        if (obj2 != coroutineSingletons) {
                            it = it4;
                            map7 = map3;
                            collection = arrayList;
                            map6 = map8;
                            str13 = str19;
                            str14 = str2;
                            collection3 = collection;
                            collection.add((u510) obj2);
                            str = str13;
                            arrayList = collection3;
                            obj = null;
                            str2 = str14;
                            coroutineSingletons2 = coroutineSingletons;
                            wp2Var = wp2Var5;
                            map4 = map6;
                            map3 = map7;
                            if (it.hasNext()) {
                                wp2Var2 = wp2Var;
                                coroutineSingletons = coroutineSingletons2;
                                String str20 = str;
                                list = (List) arrayList;
                                PaymentDto paymentDto = masstransitOrderDto2.c.a.a;
                                CurrencyRulesDto currencyRulesDto2 = masstransitOrderDto2.d;
                                mtTicketsUiStateMapper$mapSuccessState$12.L$0 = masstransitOrderDto2;
                                mtTicketsUiStateMapper$mapSuccessState$12.L$1 = null;
                                mtTicketsUiStateMapper$mapSuccessState$12.L$2 = null;
                                mtTicketsUiStateMapper$mapSuccessState$12.L$3 = str20;
                                mtTicketsUiStateMapper$mapSuccessState$12.L$4 = wp2Var2;
                                mtTicketsUiStateMapper$mapSuccessState$12.L$5 = str2;
                                mtTicketsUiStateMapper$mapSuccessState$12.L$6 = str3;
                                mtTicketsUiStateMapper$mapSuccessState$12.L$7 = list;
                                mtTicketsUiStateMapper$mapSuccessState$12.L$8 = null;
                                mtTicketsUiStateMapper$mapSuccessState$12.L$9 = null;
                                mtTicketsUiStateMapper$mapSuccessState$12.L$10 = null;
                                mtTicketsUiStateMapper$mapSuccessState$12.L$11 = null;
                                mtTicketsUiStateMapper$mapSuccessState$12.L$12 = null;
                                mtTicketsUiStateMapper$mapSuccessState$12.L$13 = null;
                                mtTicketsUiStateMapper$mapSuccessState$12.L$14 = null;
                                mtTicketsUiStateMapper$mapSuccessState$12.Z$0 = z2;
                                mtTicketsUiStateMapper$mapSuccessState$12.I$0 = i2;
                                mtTicketsUiStateMapper$mapSuccessState$12.label = 2;
                                obj2 = mVar.b(paymentDto, currencyRulesDto2, mtTicketsUiStateMapper$mapSuccessState$12);
                                if (obj2 != coroutineSingletons) {
                                    mtTicketsUiStateMapper$mapSuccessState$1 = mtTicketsUiStateMapper$mapSuccessState$12;
                                    str4 = str20;
                                    z3 = z2;
                                    str5 = str3;
                                    str6 = str2;
                                    List list4 = masstransitOrderDto2.c.a.c;
                                    String str21 = str5;
                                    lja0Var = (lja0) obj2;
                                    masstransitOrderDto3 = masstransitOrderDto2;
                                    list2 = list;
                                    arrayList2 = new ArrayList(tcc.n(list4, 10));
                                    wp2Var3 = wp2Var2;
                                    str7 = str21;
                                    it2 = list4.iterator();
                                    str8 = str4;
                                    str9 = str6;
                                    if (!it2.hasNext()) {
                                    }
                                }
                            }
                        }
                    }
                    return coroutineSingletons;
                }
                if (i == 2) {
                    int i6 = mtTicketsUiStateMapper$mapSuccessState$1.I$0;
                    z3 = mtTicketsUiStateMapper$mapSuccessState$1.Z$0;
                    list = (List) mtTicketsUiStateMapper$mapSuccessState$1.L$7;
                    str5 = (String) mtTicketsUiStateMapper$mapSuccessState$1.L$6;
                    str6 = (String) mtTicketsUiStateMapper$mapSuccessState$1.L$5;
                    wp2Var2 = (wp2) mtTicketsUiStateMapper$mapSuccessState$1.L$4;
                    str4 = (String) mtTicketsUiStateMapper$mapSuccessState$1.L$3;
                    MasstransitOrderDto masstransitOrderDto4 = (MasstransitOrderDto) mtTicketsUiStateMapper$mapSuccessState$1.L$0;
                    kotlin.b.b(obj2);
                    masstransitOrderDto2 = masstransitOrderDto4;
                    i2 = i6;
                    coroutineSingletons = coroutineSingletons2;
                    List list42 = masstransitOrderDto2.c.a.c;
                    String str212 = str5;
                    lja0Var = (lja0) obj2;
                    masstransitOrderDto3 = masstransitOrderDto2;
                    list2 = list;
                    arrayList2 = new ArrayList(tcc.n(list42, 10));
                    wp2Var3 = wp2Var2;
                    str7 = str212;
                    it2 = list42.iterator();
                    str8 = str4;
                    str9 = str6;
                    if (!it2.hasNext()) {
                    }
                } else {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i7 = mtTicketsUiStateMapper$mapSuccessState$1.I$0;
                    z3 = mtTicketsUiStateMapper$mapSuccessState$1.Z$0;
                    arrayList2 = (Collection) mtTicketsUiStateMapper$mapSuccessState$1.L$15;
                    lja0Var = (lja0) mtTicketsUiStateMapper$mapSuccessState$1.L$14;
                    list2 = (List) mtTicketsUiStateMapper$mapSuccessState$1.L$13;
                    str7 = (String) mtTicketsUiStateMapper$mapSuccessState$1.L$12;
                    str9 = (String) mtTicketsUiStateMapper$mapSuccessState$1.L$11;
                    wp2Var3 = (wp2) mtTicketsUiStateMapper$mapSuccessState$1.L$10;
                    str8 = (String) mtTicketsUiStateMapper$mapSuccessState$1.L$9;
                    it2 = (Iterator) mtTicketsUiStateMapper$mapSuccessState$1.L$6;
                    Collection collection4 = (Collection) mtTicketsUiStateMapper$mapSuccessState$1.L$5;
                    MasstransitOrderDto masstransitOrderDto5 = (MasstransitOrderDto) mtTicketsUiStateMapper$mapSuccessState$1.L$0;
                    kotlin.b.b(obj2);
                    int i8 = i7;
                    coroutineSingletons = coroutineSingletons2;
                    arrayList2.add((t510) obj2);
                    arrayList2 = collection4;
                    masstransitOrderDto3 = masstransitOrderDto5;
                    i2 = i8;
                    if (!it2.hasNext()) {
                        MasstransitSlotItemDto masstransitSlotItemDto = (MasstransitSlotItemDto) it2.next();
                        CurrencyRulesDto currencyRulesDto3 = masstransitOrderDto3.d;
                        mtTicketsUiStateMapper$mapSuccessState$1.L$0 = masstransitOrderDto3;
                        MasstransitOrderDto masstransitOrderDto6 = masstransitOrderDto3;
                        mtTicketsUiStateMapper$mapSuccessState$1.L$1 = null;
                        mtTicketsUiStateMapper$mapSuccessState$1.L$2 = null;
                        mtTicketsUiStateMapper$mapSuccessState$1.L$3 = null;
                        mtTicketsUiStateMapper$mapSuccessState$1.L$4 = null;
                        mtTicketsUiStateMapper$mapSuccessState$1.L$5 = arrayList2;
                        mtTicketsUiStateMapper$mapSuccessState$1.L$6 = it2;
                        mtTicketsUiStateMapper$mapSuccessState$1.L$7 = null;
                        mtTicketsUiStateMapper$mapSuccessState$1.L$8 = null;
                        mtTicketsUiStateMapper$mapSuccessState$1.L$9 = str8;
                        mtTicketsUiStateMapper$mapSuccessState$1.L$10 = wp2Var3;
                        mtTicketsUiStateMapper$mapSuccessState$1.L$11 = str9;
                        mtTicketsUiStateMapper$mapSuccessState$1.L$12 = str7;
                        mtTicketsUiStateMapper$mapSuccessState$1.L$13 = list2;
                        mtTicketsUiStateMapper$mapSuccessState$1.L$14 = lja0Var;
                        mtTicketsUiStateMapper$mapSuccessState$1.L$15 = arrayList2;
                        mtTicketsUiStateMapper$mapSuccessState$1.Z$0 = z3;
                        mtTicketsUiStateMapper$mapSuccessState$1.I$0 = i2;
                        mtTicketsUiStateMapper$mapSuccessState$1.label = 3;
                        obj2 = mVar.e.d(masstransitSlotItemDto, currencyRulesDto3, mtTicketsUiStateMapper$mapSuccessState$1);
                        if (obj2 != coroutineSingletons) {
                            collection4 = arrayList2;
                            i8 = i2;
                            masstransitOrderDto5 = masstransitOrderDto6;
                            arrayList2.add((t510) obj2);
                            arrayList2 = collection4;
                            masstransitOrderDto3 = masstransitOrderDto5;
                            i2 = i8;
                            if (!it2.hasNext()) {
                                MasstransitOrderDto masstransitOrderDto7 = masstransitOrderDto3;
                                return new j940(str8, wp2Var3, str9, str7, list2, lja0Var, (List) arrayList2, masstransitOrderDto7.g, masstransitOrderDto7.d, 1);
                            }
                        }
                        return coroutineSingletons;
                    }
                }
            }
        }
        mtTicketsUiStateMapper$mapSuccessState$1 = new MtTicketsUiStateMapper$mapSuccessState$1(mVar, continuation);
        Object obj22 = mtTicketsUiStateMapper$mapSuccessState$1.result;
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtTicketsUiStateMapper$mapSuccessState$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r28v0, types: [com.yandex.go.masstransit.sdk.order.impl.tickets.m] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x01a5 -> B:13:0x01ab). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, MasstransitTicketDto masstransitTicketDto, String str2, String str3, CurrencyRulesDto currencyRulesDto, ContinuationImpl continuationImpl) {
        MtTicketsUiStateMapper$mapTicket$1 mtTicketsUiStateMapper$mapTicket$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        MasstransitTicketDto masstransitTicketDto2;
        CurrencyRulesDto currencyRulesDto2;
        t740 t740Var;
        Object e;
        MtTicketsUiStateMapper$mapTicket$1 mtTicketsUiStateMapper$mapTicket$12;
        String str4;
        MasstransitTicketDto masstransitTicketDto3;
        CurrencyRulesDto currencyRulesDto3;
        v8u v8uVar;
        wp2 g;
        List list;
        CharSequence charSequence;
        v8u v8uVar2;
        String str5;
        t740 t740Var2;
        v8u v8uVar3;
        ArrayList arrayList;
        String str6;
        t740 t740Var3;
        CurrencyRulesDto currencyRulesDto4;
        Iterator it;
        MasstransitTicketDto masstransitTicketDto4;
        MtTicketsUiStateMapper$mapTicket$1 mtTicketsUiStateMapper$mapTicket$13;
        CharSequence charSequence2;
        if (continuationImpl instanceof MtTicketsUiStateMapper$mapTicket$1) {
            mtTicketsUiStateMapper$mapTicket$1 = (MtTicketsUiStateMapper$mapTicket$1) continuationImpl;
            int i2 = mtTicketsUiStateMapper$mapTicket$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtTicketsUiStateMapper$mapTicket$1.label = i2 - Integer.MIN_VALUE;
                MtTicketsUiStateMapper$mapTicket$1 mtTicketsUiStateMapper$mapTicket$14 = mtTicketsUiStateMapper$mapTicket$1;
                Object obj = mtTicketsUiStateMapper$mapTicket$14.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtTicketsUiStateMapper$mapTicket$14.label;
                yp2 yp2Var = this.d;
                ArrayList arrayList2 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mtTicketsUiStateMapper$mapTicket$14.L$0 = null;
                    mtTicketsUiStateMapper$mapTicket$14.L$1 = masstransitTicketDto;
                    mtTicketsUiStateMapper$mapTicket$14.L$2 = null;
                    mtTicketsUiStateMapper$mapTicket$14.L$3 = null;
                    mtTicketsUiStateMapper$mapTicket$14.L$4 = currencyRulesDto;
                    mtTicketsUiStateMapper$mapTicket$14.label = 1;
                    obj = g(str, masstransitTicketDto, str2, str3, mtTicketsUiStateMapper$mapTicket$14);
                    if (obj != coroutineSingletons) {
                        masstransitTicketDto2 = masstransitTicketDto;
                        currencyRulesDto2 = currencyRulesDto;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    currencyRulesDto2 = (CurrencyRulesDto) mtTicketsUiStateMapper$mapTicket$14.L$4;
                    masstransitTicketDto2 = (MasstransitTicketDto) mtTicketsUiStateMapper$mapTicket$14.L$1;
                    kotlin.b.b(obj);
                } else if (i == 2) {
                    v8uVar = (v8u) mtTicketsUiStateMapper$mapTicket$14.L$7;
                    str4 = (String) mtTicketsUiStateMapper$mapTicket$14.L$6;
                    t740Var = (t740) mtTicketsUiStateMapper$mapTicket$14.L$5;
                    currencyRulesDto3 = (CurrencyRulesDto) mtTicketsUiStateMapper$mapTicket$14.L$4;
                    MasstransitTicketDto masstransitTicketDto5 = (MasstransitTicketDto) mtTicketsUiStateMapper$mapTicket$14.L$1;
                    kotlin.b.b(obj);
                    mtTicketsUiStateMapper$mapTicket$12 = mtTicketsUiStateMapper$mapTicket$14;
                    masstransitTicketDto3 = masstransitTicketDto5;
                    CharSequence charSequence3 = (CharSequence) obj;
                    g = ly3.g(cq2.d, yp2Var, masstransitTicketDto3.b.c);
                    list = masstransitTicketDto3.e;
                    if (list != null) {
                        charSequence = charSequence3;
                        v8uVar2 = v8uVar;
                        str5 = str4;
                        t740Var2 = t740Var;
                        wp2 wp2Var = g;
                        List list2 = arrayList2;
                        String str7 = masstransitTicketDto3.f;
                        String str8 = masstransitTicketDto3.g;
                        Boolean bool = masstransitTicketDto3.i;
                        return new u510(t740Var2, str5, v8uVar2, charSequence, list2, wp2Var, str7, str8, bool == null ? bool.booleanValue() : true, HProv.ALG_TYPE_BLOCK);
                    }
                    List list3 = list;
                    v8uVar3 = v8uVar;
                    arrayList = new ArrayList(tcc.n(list3, 10));
                    str6 = str4;
                    t740Var3 = t740Var;
                    currencyRulesDto4 = currencyRulesDto3;
                    it = list3.iterator();
                    masstransitTicketDto4 = masstransitTicketDto3;
                    mtTicketsUiStateMapper$mapTicket$13 = mtTicketsUiStateMapper$mapTicket$12;
                    charSequence2 = charSequence3;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ?? r2 = (Collection) mtTicketsUiStateMapper$mapTicket$14.L$16;
                    Iterator it2 = (Iterator) mtTicketsUiStateMapper$mapTicket$14.L$13;
                    ?? r4 = (Collection) mtTicketsUiStateMapper$mapTicket$14.L$12;
                    wp2 wp2Var2 = (wp2) mtTicketsUiStateMapper$mapTicket$14.L$9;
                    CharSequence charSequence4 = (CharSequence) mtTicketsUiStateMapper$mapTicket$14.L$8;
                    v8uVar3 = (v8u) mtTicketsUiStateMapper$mapTicket$14.L$7;
                    str6 = (String) mtTicketsUiStateMapper$mapTicket$14.L$6;
                    t740Var3 = (t740) mtTicketsUiStateMapper$mapTicket$14.L$5;
                    currencyRulesDto4 = (CurrencyRulesDto) mtTicketsUiStateMapper$mapTicket$14.L$4;
                    MasstransitTicketDto masstransitTicketDto6 = (MasstransitTicketDto) mtTicketsUiStateMapper$mapTicket$14.L$1;
                    kotlin.b.b(obj);
                    CharSequence charSequence5 = charSequence4;
                    MasstransitTicketDto masstransitTicketDto7 = masstransitTicketDto6;
                    wp2 wp2Var3 = wp2Var2;
                    MtTicketsUiStateMapper$mapTicket$1 mtTicketsUiStateMapper$mapTicket$15 = mtTicketsUiStateMapper$mapTicket$14;
                    Iterator it3 = it2;
                    ArrayList arrayList3 = r4;
                    ArrayList arrayList4 = r2;
                    arrayList4.add((t510) obj);
                    arrayList = arrayList3;
                    it = it3;
                    mtTicketsUiStateMapper$mapTicket$13 = mtTicketsUiStateMapper$mapTicket$15;
                    g = wp2Var3;
                    masstransitTicketDto4 = masstransitTicketDto7;
                    charSequence2 = charSequence5;
                    if (it.hasNext()) {
                        MasstransitSlotItemDto masstransitSlotItemDto = (MasstransitSlotItemDto) it.next();
                        mtTicketsUiStateMapper$mapTicket$13.L$0 = null;
                        mtTicketsUiStateMapper$mapTicket$13.L$1 = masstransitTicketDto4;
                        mtTicketsUiStateMapper$mapTicket$13.L$2 = null;
                        mtTicketsUiStateMapper$mapTicket$13.L$3 = null;
                        mtTicketsUiStateMapper$mapTicket$13.L$4 = currencyRulesDto4;
                        mtTicketsUiStateMapper$mapTicket$13.L$5 = t740Var3;
                        mtTicketsUiStateMapper$mapTicket$13.L$6 = str6;
                        mtTicketsUiStateMapper$mapTicket$13.L$7 = v8uVar3;
                        mtTicketsUiStateMapper$mapTicket$13.L$8 = charSequence2;
                        mtTicketsUiStateMapper$mapTicket$13.L$9 = g;
                        mtTicketsUiStateMapper$mapTicket$13.L$10 = null;
                        mtTicketsUiStateMapper$mapTicket$13.L$11 = null;
                        mtTicketsUiStateMapper$mapTicket$13.L$12 = arrayList;
                        mtTicketsUiStateMapper$mapTicket$13.L$13 = it;
                        mtTicketsUiStateMapper$mapTicket$13.L$14 = null;
                        mtTicketsUiStateMapper$mapTicket$13.L$15 = null;
                        mtTicketsUiStateMapper$mapTicket$13.L$16 = arrayList;
                        mtTicketsUiStateMapper$mapTicket$13.label = 3;
                        obj = this.e.d(masstransitSlotItemDto, currencyRulesDto4, mtTicketsUiStateMapper$mapTicket$13);
                        if (obj != coroutineSingletons) {
                            charSequence5 = charSequence2;
                            masstransitTicketDto7 = masstransitTicketDto4;
                            wp2Var3 = g;
                            mtTicketsUiStateMapper$mapTicket$15 = mtTicketsUiStateMapper$mapTicket$13;
                            it3 = it;
                            arrayList3 = arrayList;
                            arrayList4 = arrayList;
                            arrayList4.add((t510) obj);
                            arrayList = arrayList3;
                            it = it3;
                            mtTicketsUiStateMapper$mapTicket$13 = mtTicketsUiStateMapper$mapTicket$15;
                            g = wp2Var3;
                            masstransitTicketDto4 = masstransitTicketDto7;
                            charSequence2 = charSequence5;
                            if (it.hasNext()) {
                                arrayList2 = arrayList;
                                masstransitTicketDto3 = masstransitTicketDto4;
                                charSequence = charSequence2;
                                v8uVar2 = v8uVar3;
                                str5 = str6;
                                t740Var2 = t740Var3;
                                wp2 wp2Var4 = g;
                                List list22 = arrayList2;
                                String str72 = masstransitTicketDto3.f;
                                String str82 = masstransitTicketDto3.g;
                                Boolean bool2 = masstransitTicketDto3.i;
                                return new u510(t740Var2, str5, v8uVar2, charSequence, list22, wp2Var4, str72, str82, bool2 == null ? bool2.booleanValue() : true, HProv.ALG_TYPE_BLOCK);
                            }
                        }
                        return coroutineSingletons;
                    }
                }
                t740Var = (t740) obj;
                String str9 = masstransitTicketDto2.a;
                HeaderDto headerDto = masstransitTicketDto2.b;
                v8u v8uVar4 = new v8u(headerDto.a, headerDto.b, ly3.g(zp2.a, yp2Var, headerDto.d));
                FormattedText formattedText = masstransitTicketDto2.d;
                mtTicketsUiStateMapper$mapTicket$14.L$0 = null;
                mtTicketsUiStateMapper$mapTicket$14.L$1 = masstransitTicketDto2;
                mtTicketsUiStateMapper$mapTicket$14.L$2 = null;
                mtTicketsUiStateMapper$mapTicket$14.L$3 = null;
                mtTicketsUiStateMapper$mapTicket$14.L$4 = currencyRulesDto2;
                mtTicketsUiStateMapper$mapTicket$14.L$5 = t740Var;
                mtTicketsUiStateMapper$mapTicket$14.L$6 = str9;
                mtTicketsUiStateMapper$mapTicket$14.L$7 = v8uVar4;
                mtTicketsUiStateMapper$mapTicket$14.label = 2;
                e = ru.yandex.taxi.widget.c.e(this.c, formattedText, null, false, mtTicketsUiStateMapper$mapTicket$14, 30);
                mtTicketsUiStateMapper$mapTicket$12 = mtTicketsUiStateMapper$mapTicket$14;
                if (e != coroutineSingletons) {
                    MasstransitTicketDto masstransitTicketDto8 = masstransitTicketDto2;
                    str4 = str9;
                    obj = e;
                    masstransitTicketDto3 = masstransitTicketDto8;
                    currencyRulesDto3 = currencyRulesDto2;
                    v8uVar = v8uVar4;
                    CharSequence charSequence32 = (CharSequence) obj;
                    g = ly3.g(cq2.d, yp2Var, masstransitTicketDto3.b.c);
                    list = masstransitTicketDto3.e;
                    if (list != null) {
                    }
                }
                return coroutineSingletons;
            }
        }
        mtTicketsUiStateMapper$mapTicket$1 = new MtTicketsUiStateMapper$mapTicket$1(this, continuationImpl);
        MtTicketsUiStateMapper$mapTicket$1 mtTicketsUiStateMapper$mapTicket$142 = mtTicketsUiStateMapper$mapTicket$1;
        Object obj2 = mtTicketsUiStateMapper$mapTicket$142.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtTicketsUiStateMapper$mapTicket$142.label;
        yp2 yp2Var2 = this.d;
        ArrayList arrayList22 = null;
        if (i != 0) {
        }
        t740Var = (t740) obj2;
        String str92 = masstransitTicketDto2.a;
        HeaderDto headerDto2 = masstransitTicketDto2.b;
        v8u v8uVar42 = new v8u(headerDto2.a, headerDto2.b, ly3.g(zp2.a, yp2Var2, headerDto2.d));
        FormattedText formattedText2 = masstransitTicketDto2.d;
        mtTicketsUiStateMapper$mapTicket$142.L$0 = null;
        mtTicketsUiStateMapper$mapTicket$142.L$1 = masstransitTicketDto2;
        mtTicketsUiStateMapper$mapTicket$142.L$2 = null;
        mtTicketsUiStateMapper$mapTicket$142.L$3 = null;
        mtTicketsUiStateMapper$mapTicket$142.L$4 = currencyRulesDto2;
        mtTicketsUiStateMapper$mapTicket$142.L$5 = t740Var;
        mtTicketsUiStateMapper$mapTicket$142.L$6 = str92;
        mtTicketsUiStateMapper$mapTicket$142.L$7 = v8uVar42;
        mtTicketsUiStateMapper$mapTicket$142.label = 2;
        e = ru.yandex.taxi.widget.c.e(this.c, formattedText2, null, false, mtTicketsUiStateMapper$mapTicket$142, 30);
        mtTicketsUiStateMapper$mapTicket$12 = mtTicketsUiStateMapper$mapTicket$142;
        if (e != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, MasstransitTicketDto masstransitTicketDto, String str2, String str3, ContinuationImpl continuationImpl) {
        MtTicketsUiStateMapper$mapTicketState$1 mtTicketsUiStateMapper$mapTicketState$1;
        int i;
        String str4;
        t740 r740Var;
        String str5;
        MasstransitTicketDto masstransitTicketDto2;
        if (continuationImpl instanceof MtTicketsUiStateMapper$mapTicketState$1) {
            mtTicketsUiStateMapper$mapTicketState$1 = (MtTicketsUiStateMapper$mapTicketState$1) continuationImpl;
            int i2 = mtTicketsUiStateMapper$mapTicketState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtTicketsUiStateMapper$mapTicketState$1.label = i2 - Integer.MIN_VALUE;
                MtTicketsUiStateMapper$mapTicketState$1 mtTicketsUiStateMapper$mapTicketState$12 = mtTicketsUiStateMapper$mapTicketState$1;
                Object obj = mtTicketsUiStateMapper$mapTicketState$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtTicketsUiStateMapper$mapTicketState$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    str4 = masstransitTicketDto.h;
                    x xVar = masstransitTicketDto.c;
                    if (!(xVar instanceof TransportPassDto$DefaultPassDto)) {
                        if (xVar instanceof TransportPassDto$QrCodePassDto) {
                            mtTicketsUiStateMapper$mapTicketState$12.L$0 = null;
                            mtTicketsUiStateMapper$mapTicketState$12.L$1 = masstransitTicketDto;
                            mtTicketsUiStateMapper$mapTicketState$12.L$2 = null;
                            mtTicketsUiStateMapper$mapTicketState$12.L$3 = null;
                            mtTicketsUiStateMapper$mapTicketState$12.L$4 = str4;
                            mtTicketsUiStateMapper$mapTicketState$12.L$5 = null;
                            mtTicketsUiStateMapper$mapTicketState$12.label = 1;
                            obj = c((TransportPassDto$QrCodePassDto) xVar, str4, mtTicketsUiStateMapper$mapTicketState$12);
                            if (obj != obj2) {
                                str5 = str4;
                                masstransitTicketDto2 = masstransitTicketDto;
                                r740Var = (t740) obj;
                            }
                        } else if (xVar instanceof TransportPassDto$CppkSuburbanActivationDto) {
                            String str6 = masstransitTicketDto.a;
                            mtTicketsUiStateMapper$mapTicketState$12.L$0 = null;
                            mtTicketsUiStateMapper$mapTicketState$12.L$1 = masstransitTicketDto;
                            mtTicketsUiStateMapper$mapTicketState$12.L$2 = null;
                            mtTicketsUiStateMapper$mapTicketState$12.L$3 = null;
                            mtTicketsUiStateMapper$mapTicketState$12.L$4 = str4;
                            mtTicketsUiStateMapper$mapTicketState$12.L$5 = null;
                            mtTicketsUiStateMapper$mapTicketState$12.label = 2;
                            obj = d((TransportPassDto$CppkSuburbanActivationDto) xVar, str2, str3, str, str6, str4, mtTicketsUiStateMapper$mapTicketState$12);
                            if (obj != obj2) {
                                str5 = str4;
                                masstransitTicketDto2 = masstransitTicketDto;
                                r740Var = (t740) obj;
                            }
                        } else {
                            if (!jl40.l(xVar, w.INSTANCE)) {
                                w511.b();
                                return null;
                            }
                            r740Var = new r740(mja1.a("delivery_form_cross_fill", null, 6), ((avj0) this.b).h(cyh0.mt_sdk_unsupported_requirement_suffix), 5);
                        }
                        return obj2;
                    }
                    r740Var = new o740(z311.a, null, ((TransportPassDto$DefaultPassDto) xVar).b, str4, 26);
                    masstransitTicketDto2 = masstransitTicketDto;
                    if (jl40.l(masstransitTicketDto2.i, Boolean.FALSE)) {
                        if (r740Var instanceof o740) {
                            o740 o740Var = (o740) r740Var;
                            return new p740(o740Var.a, o740Var.b, o740Var.c, str4);
                        }
                        if (r740Var instanceof q740) {
                            return new p740(y311.a, str4, 6);
                        }
                        if (r740Var instanceof s740) {
                            return new p740(((s740) r740Var).a, str4, 6);
                        }
                        if ((r740Var instanceof r740) || (r740Var instanceof p740)) {
                            return r740Var;
                        }
                        w511.b();
                        return null;
                    }
                    return r740Var;
                }
                if (i == 1) {
                    str5 = (String) mtTicketsUiStateMapper$mapTicketState$12.L$4;
                    masstransitTicketDto2 = (MasstransitTicketDto) mtTicketsUiStateMapper$mapTicketState$12.L$1;
                    kotlin.b.b(obj);
                    r740Var = (t740) obj;
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str5 = (String) mtTicketsUiStateMapper$mapTicketState$12.L$4;
                    masstransitTicketDto2 = (MasstransitTicketDto) mtTicketsUiStateMapper$mapTicketState$12.L$1;
                    kotlin.b.b(obj);
                    r740Var = (t740) obj;
                }
                str4 = str5;
                if (jl40.l(masstransitTicketDto2.i, Boolean.FALSE)) {
                }
                return r740Var;
            }
        }
        mtTicketsUiStateMapper$mapTicketState$1 = new MtTicketsUiStateMapper$mapTicketState$1(this, continuationImpl);
        MtTicketsUiStateMapper$mapTicketState$1 mtTicketsUiStateMapper$mapTicketState$122 = mtTicketsUiStateMapper$mapTicketState$1;
        Object obj3 = mtTicketsUiStateMapper$mapTicketState$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtTicketsUiStateMapper$mapTicketState$122.label;
        if (i != 0) {
        }
        str4 = str5;
        if (jl40.l(masstransitTicketDto2.i, Boolean.FALSE)) {
        }
        return r740Var;
    }
}
