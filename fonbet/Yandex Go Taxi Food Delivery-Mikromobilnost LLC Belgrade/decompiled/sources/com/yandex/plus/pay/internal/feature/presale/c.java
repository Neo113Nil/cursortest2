package com.yandex.plus.pay.internal.feature.presale;

import com.yandex.plus.log.api.LogPriority;
import com.yandex.plus.pay.api.analytics.PlusPayAnalyticsParams;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.common.internal.log.PayCoreLogTag;
import com.yandex.plus.pay.internal.feature.offers.PlusPayLoadOffersReason;
import com.yandex.plus.pay.internal.model.PlusPayPresale;
import com.yandex.plus.pay.internal.model.PlusPayRichText;
import defpackage.EvgenOffersAnalytics$LoadReason;
import defpackage.bvu0;
import defpackage.evu0;
import defpackage.i3y;
import defpackage.lqd;
import defpackage.mdd0;
import defpackage.ndd0;
import defpackage.nk90;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.qke;
import defpackage.qqd;
import defpackage.qqx0;
import defpackage.qv10;
import defpackage.vdd0;
import defpackage.wdd0;
import defpackage.wfd0;
import defpackage.xbt;
import defpackage.xca1;
import defpackage.xdd0;
import defpackage.yad0;
import defpackage.zio;
import defpackage.zqx0;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.TimeoutCancellationException;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class c implements xbt {
    public final com.yandex.plus.pay.graphql.offers.a a;
    public final List b;
    public final mdd0 c;
    public final qqx0 d;
    public final wfd0 e;
    public final i3y f = kotlin.a.a(new nk90(10));

    public c(com.yandex.plus.pay.graphql.offers.a aVar, List list, mdd0 mdd0Var, qqx0 qqx0Var, wfd0 wfd0Var) {
        this.a = aVar;
        this.b = list;
        this.c = mdd0Var;
        this.d = qqx0Var;
        this.e = wfd0Var;
    }

    public static PlusPayPresale.Assets b(PlusPayCompositeOffers.Offer.Tariff tariff, Map map) {
        PlusPayRichText plusPayRichText;
        PlusPayRichText plusPayRichText2;
        List list;
        String str = (String) map.get("presale_original_price_text");
        PlusPayRichText.Companion companion = PlusPayRichText.INSTANCE;
        PlusPayRichText fromString = companion.fromString(d("presale_loading_text", map));
        String str2 = (String) map.get("presale_benefit_text");
        PlusPayRichText plusPayRichText3 = null;
        r8 = null;
        String str3 = null;
        plusPayRichText3 = null;
        if (str2 != null) {
            plusPayRichText = fromString;
            plusPayRichText2 = companion.fromString(str2);
        } else {
            plusPayRichText = fromString;
            plusPayRichText2 = null;
        }
        PlusPayRichText fromString2 = companion.fromString(d("presale_period_text", map));
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            sb.append("{{original_price}} ");
        }
        sb.append(d("presale_actual_price_text", map));
        String sb2 = sb.toString();
        if (str != null) {
            list = Collections.singletonList(new PlusPayRichText.Item.Strikethrough((String) null, "original_price", str, 1, (DefaultConstructorMarker) null));
        } else {
            list = null;
        }
        if (list == null) {
            list = EmptyList.a;
        }
        PlusPayRichText plusPayRichText4 = plusPayRichText;
        PlusPayRichText plusPayRichText5 = new PlusPayRichText(sb2, list);
        PlusPayRichText fromString3 = companion.fromString(d("presale_additional_text", map));
        PlusPayRichText fromString4 = companion.fromString(d("presale_suggested_offer_button_text", map));
        PlusPayRichText fromString5 = companion.fromString(d("presale_initial_offer_button_text", map));
        String text = tariff.getText();
        if (text != null) {
            if (evu0.J(text)) {
                text = null;
            }
            if (text != null) {
                StringBuilder t = qv10.t(text);
                String additionalText = tariff.getAdditionalText();
                if (additionalText != null) {
                    if (evu0.J(additionalText)) {
                        additionalText = null;
                    }
                    if (additionalText != null) {
                        str3 = Extension.FIX_SPACE.concat(additionalText);
                    }
                }
                if (str3 == null) {
                    str3 = "";
                }
                t.append(str3);
                plusPayRichText3 = companion.fromString(t.toString());
            }
        }
        return new PlusPayPresale.Assets(plusPayRichText4, plusPayRichText2, fromString2, plusPayRichText5, fromString3, fromString4, plusPayRichText3, fromString5);
    }

    public static long c(Map map) {
        String d = d("presale_loading_delay_millis", map);
        Long m = bvu0.m(10, d);
        if (m != null) {
            return m.longValue();
        }
        throw new PayloadGetPresaleInteractor$IncorrectPayloadException(oyr.p("Payload parsing error: (presale_loading_delay_millis, ", d, ") - value must be integer number"));
    }

    public static String d(String str, Map map) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            return str2;
        }
        throw new PayloadGetPresaleInteractor$IncorrectPayloadException("Required field is missing in payload: ".concat(str));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(8:5|6|7|(1:(3:10|11|12)(2:34|35))(2:36|(2:43|44)(2:40|(1:42)))|13|(1:33)(1:17)|18|(2:20|21)(2:23|(4:25|(1:27)|28|29)(2:30|31))))|51|6|7|(0)(0)|13|(1:15)|33|18|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0048, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bc, code lost:
    
        r11 = new kotlin.Result.Failure(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b3, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bb, code lost:
    
        throw r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0046, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b5, code lost:
    
        r11 = new kotlin.Result.Failure(r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // defpackage.xbt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PlusPayCompositeOffers.Offer offer, ContinuationImpl continuationImpl) {
        PayloadGetPresaleInteractor$getPresale$1 payloadGetPresaleInteractor$getPresale$1;
        int i;
        Object failure;
        Throwable a;
        Map<String, String> payload;
        long c;
        PlusPayCompositeOffers.Offer offer2;
        PlusPayCompositeOffers.Offer.Tariff tariffOffer;
        if (continuationImpl instanceof PayloadGetPresaleInteractor$getPresale$1) {
            payloadGetPresaleInteractor$getPresale$1 = (PayloadGetPresaleInteractor$getPresale$1) continuationImpl;
            int i2 = payloadGetPresaleInteractor$getPresale$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                payloadGetPresaleInteractor$getPresale$1.label = i2 - Integer.MIN_VALUE;
                Object obj = payloadGetPresaleInteractor$getPresale$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = payloadGetPresaleInteractor$getPresale$1.label;
                mdd0 mdd0Var = this.c;
                if (i != 0) {
                    kotlin.b.b(obj);
                    PlusPayCompositeOffers.Offer.Tariff tariffOffer2 = offer.getTariffOffer();
                    if (tariffOffer2 == null || (payload = tariffOffer2.getPayload()) == null) {
                        mdd0.d(mdd0Var, PayCoreLogTag.PRESALE, "Offer does not have payload. So, presale is null");
                        return null;
                    }
                    String d = d("presale_target", payload);
                    c = c(payload);
                    String sessionId = offer.getMeta().getSessionId();
                    payloadGetPresaleInteractor$getPresale$1.L$0 = null;
                    payloadGetPresaleInteractor$getPresale$1.L$1 = payload;
                    payloadGetPresaleInteractor$getPresale$1.L$2 = null;
                    payloadGetPresaleInteractor$getPresale$1.L$3 = null;
                    payloadGetPresaleInteractor$getPresale$1.L$4 = this;
                    payloadGetPresaleInteractor$getPresale$1.L$5 = null;
                    payloadGetPresaleInteractor$getPresale$1.I$0 = 0;
                    payloadGetPresaleInteractor$getPresale$1.I$1 = 0;
                    payloadGetPresaleInteractor$getPresale$1.J$0 = c;
                    payloadGetPresaleInteractor$getPresale$1.label = 1;
                    obj = e(sessionId, d, payloadGetPresaleInteractor$getPresale$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    long j = payloadGetPresaleInteractor$getPresale$1.J$0;
                    c cVar = (c) payloadGetPresaleInteractor$getPresale$1.L$4;
                    payload = (Map) payloadGetPresaleInteractor$getPresale$1.L$1;
                    kotlin.b.b(obj);
                    c = j;
                    this = cVar;
                }
                offer2 = (PlusPayCompositeOffers.Offer) kotlin.collections.a.R(((PlusPayCompositeOffers) obj).getOffers());
                if (offer2 != null || (tariffOffer = offer2.getTariffOffer()) == null) {
                    failure = null;
                } else {
                    this.getClass();
                    failure = new PlusPayPresale(offer2, c, b(tariffOffer, payload));
                }
                a = Result.a(failure);
                if (a != null) {
                    return failure;
                }
                if (!(a instanceof PayloadGetPresaleInteractor$IncorrectPayloadException)) {
                    mdd0.g(mdd0Var, PayCoreLogTag.PRESALE, a.getMessage(), a, 8);
                    throw xca1.e(a);
                }
                PayCoreLogTag payCoreLogTag = PayCoreLogTag.PRESALE;
                String message = a.getMessage();
                mdd0Var.getClass();
                LogPriority logPriority = LogPriority.INFO;
                String a2 = qke.a(payCoreLogTag);
                if (message == null) {
                    message = "";
                }
                ((ndd0) mdd0Var).b(logPriority, a2, message, a);
                return null;
            }
        }
        payloadGetPresaleInteractor$getPresale$1 = new PayloadGetPresaleInteractor$getPresale$1(this, continuationImpl);
        Object obj2 = payloadGetPresaleInteractor$getPresale$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = payloadGetPresaleInteractor$getPresale$1.label;
        mdd0 mdd0Var2 = this.c;
        if (i != 0) {
        }
        offer2 = (PlusPayCompositeOffers.Offer) kotlin.collections.a.R(((PlusPayCompositeOffers) obj2).getOffers());
        if (offer2 != null) {
        }
        failure = null;
        a = Result.a(failure);
        if (a != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x006d  */
    /* JADX WARN: Type inference failed for: r3v17, types: [T, wdd0] */
    /* JADX WARN: Type inference failed for: r4v11, types: [T, vdd0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, String str2, ContinuationImpl continuationImpl) {
        PayloadGetPresaleInteractor$loadPresaleOffers$1 payloadGetPresaleInteractor$loadPresaleOffers$1;
        int i;
        String str3;
        Ref$ObjectRef ref$ObjectRef;
        Object failure;
        Throwable a;
        Ref$ObjectRef ref$ObjectRef2;
        xdd0 xdd0Var;
        try {
            if (continuationImpl instanceof PayloadGetPresaleInteractor$loadPresaleOffers$1) {
                payloadGetPresaleInteractor$loadPresaleOffers$1 = (PayloadGetPresaleInteractor$loadPresaleOffers$1) continuationImpl;
                int i2 = payloadGetPresaleInteractor$loadPresaleOffers$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    payloadGetPresaleInteractor$loadPresaleOffers$1.label = i2 - Integer.MIN_VALUE;
                    PayloadGetPresaleInteractor$loadPresaleOffers$1 payloadGetPresaleInteractor$loadPresaleOffers$12 = payloadGetPresaleInteractor$loadPresaleOffers$1;
                    Object obj = payloadGetPresaleInteractor$loadPresaleOffers$12.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = payloadGetPresaleInteractor$loadPresaleOffers$12.label;
                    if (i != 0) {
                        Ref$ObjectRef z = qv10.z(obj);
                        try {
                            com.yandex.plus.pay.graphql.offers.a aVar = this.a;
                            String meaning = PlusPayLoadOffersReason.PRESALE.getMeaning();
                            payloadGetPresaleInteractor$loadPresaleOffers$12.L$0 = null;
                            payloadGetPresaleInteractor$loadPresaleOffers$12.L$1 = str2;
                            payloadGetPresaleInteractor$loadPresaleOffers$12.L$2 = z;
                            payloadGetPresaleInteractor$loadPresaleOffers$12.L$3 = null;
                            payloadGetPresaleInteractor$loadPresaleOffers$12.L$4 = null;
                            payloadGetPresaleInteractor$loadPresaleOffers$12.L$5 = null;
                            payloadGetPresaleInteractor$loadPresaleOffers$12.I$0 = 0;
                            payloadGetPresaleInteractor$loadPresaleOffers$12.I$1 = 0;
                            payloadGetPresaleInteractor$loadPresaleOffers$12.label = 1;
                            obj = aVar.b(str, meaning, str2, null, null, null, true, payloadGetPresaleInteractor$loadPresaleOffers$12);
                            if (obj != obj2) {
                                str3 = str2;
                                ref$ObjectRef = z;
                            }
                        } catch (TimeoutCancellationException e) {
                            e = e;
                            str3 = str2;
                            ref$ObjectRef = z;
                            failure = new Result.Failure(e);
                            obj = failure;
                            a = Result.a(obj);
                            if (a == null) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            str3 = str2;
                            ref$ObjectRef = z;
                            failure = new Result.Failure(th);
                            obj = failure;
                            a = Result.a(obj);
                            if (a == null) {
                            }
                        }
                        return obj2;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ref$ObjectRef2 = (Ref$ObjectRef) payloadGetPresaleInteractor$loadPresaleOffers$12.L$2;
                        kotlin.b.b(obj);
                        PlusPayCompositeOffers plusPayCompositeOffers = (PlusPayCompositeOffers) obj;
                        PlusPayAnalyticsParams.Companion.getClass();
                        ((zio) this.d).d(plusPayCompositeOffers, com.yandex.plus.pay.api.analytics.a.b());
                        if (ref$ObjectRef2.element == 0 && plusPayCompositeOffers.getOffers().isEmpty()) {
                            ref$ObjectRef2.element = wdd0.b;
                        }
                        zqx0 zqx0Var = (zqx0) this.e;
                        zqx0Var.a(plusPayCompositeOffers);
                        xdd0Var = (xdd0) ref$ObjectRef2.element;
                        if (xdd0Var != null) {
                            zqx0Var.a.c(plusPayCompositeOffers.getSessionId(), EvgenOffersAnalytics$LoadReason.Default, plusPayCompositeOffers.getTarget(), xdd0Var.a);
                        }
                        return plusPayCompositeOffers;
                    }
                    ref$ObjectRef = (Ref$ObjectRef) payloadGetPresaleInteractor$loadPresaleOffers$12.L$2;
                    str3 = (String) payloadGetPresaleInteractor$loadPresaleOffers$12.L$1;
                    try {
                        kotlin.b.b(obj);
                    } catch (TimeoutCancellationException e2) {
                        e = e2;
                        failure = new Result.Failure(e);
                        obj = failure;
                        a = Result.a(obj);
                        if (a == null) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        failure = new Result.Failure(th);
                        obj = failure;
                        a = Result.a(obj);
                        if (a == null) {
                        }
                    }
                    a = Result.a(obj);
                    if (a == null) {
                        mdd0.g(this.c, PayCoreLogTag.PRESALE, "Error when receiving presale offers.", a, 8);
                        throw xca1.e(a);
                    }
                    PlusPayCompositeOffers d = ((yad0) this.f.getValue()).d(str3, ((lqd) obj).a());
                    if (d.getOffers().isEmpty()) {
                        ref$ObjectRef.element = vdd0.b;
                    }
                    payloadGetPresaleInteractor$loadPresaleOffers$12.L$0 = null;
                    payloadGetPresaleInteractor$loadPresaleOffers$12.L$1 = null;
                    payloadGetPresaleInteractor$loadPresaleOffers$12.L$2 = ref$ObjectRef;
                    payloadGetPresaleInteractor$loadPresaleOffers$12.L$3 = null;
                    payloadGetPresaleInteractor$loadPresaleOffers$12.L$4 = null;
                    payloadGetPresaleInteractor$loadPresaleOffers$12.L$5 = null;
                    payloadGetPresaleInteractor$loadPresaleOffers$12.I$0 = 0;
                    payloadGetPresaleInteractor$loadPresaleOffers$12.label = 2;
                    obj = f(d, payloadGetPresaleInteractor$loadPresaleOffers$12);
                    if (obj != obj2) {
                        ref$ObjectRef2 = ref$ObjectRef;
                        PlusPayCompositeOffers plusPayCompositeOffers2 = (PlusPayCompositeOffers) obj;
                        PlusPayAnalyticsParams.Companion.getClass();
                        ((zio) this.d).d(plusPayCompositeOffers2, com.yandex.plus.pay.api.analytics.a.b());
                        if (ref$ObjectRef2.element == 0) {
                            ref$ObjectRef2.element = wdd0.b;
                        }
                        zqx0 zqx0Var2 = (zqx0) this.e;
                        zqx0Var2.a(plusPayCompositeOffers2);
                        xdd0Var = (xdd0) ref$ObjectRef2.element;
                        if (xdd0Var != null) {
                        }
                        return plusPayCompositeOffers2;
                    }
                    return obj2;
                }
            }
            if (i != 0) {
            }
            a = Result.a(obj);
            if (a == null) {
            }
        } catch (CancellationException e3) {
            throw e3;
        }
        payloadGetPresaleInteractor$loadPresaleOffers$1 = new PayloadGetPresaleInteractor$loadPresaleOffers$1(this, continuationImpl);
        PayloadGetPresaleInteractor$loadPresaleOffers$1 payloadGetPresaleInteractor$loadPresaleOffers$122 = payloadGetPresaleInteractor$loadPresaleOffers$1;
        Object obj3 = payloadGetPresaleInteractor$loadPresaleOffers$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = payloadGetPresaleInteractor$loadPresaleOffers$122.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0081 -> B:10:0x0084). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(PlusPayCompositeOffers plusPayCompositeOffers, ContinuationImpl continuationImpl) {
        PayloadGetPresaleInteractor$processOffers$1 payloadGetPresaleInteractor$processOffers$1;
        int i;
        PlusPayCompositeOffers plusPayCompositeOffers2;
        Iterator it;
        int i2;
        if (continuationImpl instanceof PayloadGetPresaleInteractor$processOffers$1) {
            payloadGetPresaleInteractor$processOffers$1 = (PayloadGetPresaleInteractor$processOffers$1) continuationImpl;
            int i3 = payloadGetPresaleInteractor$processOffers$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                payloadGetPresaleInteractor$processOffers$1.label = i3 - Integer.MIN_VALUE;
                Object obj = payloadGetPresaleInteractor$processOffers$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = payloadGetPresaleInteractor$processOffers$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    plusPayCompositeOffers2 = plusPayCompositeOffers;
                    it = this.b.iterator();
                    i2 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = payloadGetPresaleInteractor$processOffers$1.I$0;
                    it = (Iterator) payloadGetPresaleInteractor$processOffers$1.L$4;
                    kotlin.b.b(obj);
                    plusPayCompositeOffers2 = (PlusPayCompositeOffers) obj;
                    if (it.hasNext()) {
                        qqd qqdVar = (qqd) it.next();
                        payloadGetPresaleInteractor$processOffers$1.L$0 = null;
                        payloadGetPresaleInteractor$processOffers$1.L$1 = null;
                        payloadGetPresaleInteractor$processOffers$1.L$2 = null;
                        payloadGetPresaleInteractor$processOffers$1.L$3 = null;
                        payloadGetPresaleInteractor$processOffers$1.L$4 = it;
                        payloadGetPresaleInteractor$processOffers$1.L$5 = null;
                        payloadGetPresaleInteractor$processOffers$1.L$6 = null;
                        payloadGetPresaleInteractor$processOffers$1.L$7 = null;
                        payloadGetPresaleInteractor$processOffers$1.I$0 = i2;
                        payloadGetPresaleInteractor$processOffers$1.I$1 = 0;
                        payloadGetPresaleInteractor$processOffers$1.label = 1;
                        obj = qqdVar.a(plusPayCompositeOffers2, payloadGetPresaleInteractor$processOffers$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        plusPayCompositeOffers2 = (PlusPayCompositeOffers) obj;
                        if (it.hasNext()) {
                            return plusPayCompositeOffers2;
                        }
                    }
                }
            }
        }
        payloadGetPresaleInteractor$processOffers$1 = new PayloadGetPresaleInteractor$processOffers$1(this, continuationImpl);
        Object obj2 = payloadGetPresaleInteractor$processOffers$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = payloadGetPresaleInteractor$processOffers$1.label;
        if (i != 0) {
        }
    }
}
