package com.yandex.go.taxi.order.details.v2.state.elements.feedback.question;

import com.yandex.go.taxi.order.feedback.domain.model.FeedbackQuestionSource;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.TaxiOrderFeedbackQuestion;
import com.yandex.go.taxi.order.models.api.TaxiOrderFeedbackQuestionAnswer;
import com.yandex.go.taxi.order.models.api.TaxiOrderLocalData;
import com.yandex.go.taxi.order.models.api.feedback.TaxiOrderFeedbackQuestionInfoState;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$FeedbackQuestion;
import defpackage.g92;
import defpackage.ijk0;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.qrq;
import defpackage.tcc;
import defpackage.tik0;
import defpackage.tpr;
import defpackage.uik0;
import defpackage.xtq;
import defpackage.yjk0;
import defpackage.zjk0;
import java.util.ArrayList;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;

/* loaded from: classes14.dex */
public final class a {
    public final o2y0 a;
    public final com.yandex.go.taxi.order.feedback.domain.a b;

    public a(o2y0 o2y0Var, com.yandex.go.taxi.order.feedback.domain.a aVar) {
        this.a = o2y0Var;
        this.b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x011f A[LOOP:0: B:11:0x0119->B:13:0x011f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0143 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, RideCardItemDto$FeedbackQuestion rideCardItemDto$FeedbackQuestion, ContinuationImpl continuationImpl) {
        RideCardFeedbackQuestionItemDataSource$feedbackQuestionFlow$1 rideCardFeedbackQuestionItemDataSource$feedbackQuestionFlow$1;
        int i;
        TaxiOrderFeedbackQuestionInfoState taxiOrderFeedbackQuestionInfoState;
        TaxiOrder b;
        RideCardItemDto$FeedbackQuestion rideCardItemDto$FeedbackQuestion2 = rideCardItemDto$FeedbackQuestion;
        aVar.getClass();
        if (continuationImpl instanceof RideCardFeedbackQuestionItemDataSource$feedbackQuestionFlow$1) {
            rideCardFeedbackQuestionItemDataSource$feedbackQuestionFlow$1 = (RideCardFeedbackQuestionItemDataSource$feedbackQuestionFlow$1) continuationImpl;
            int i2 = rideCardFeedbackQuestionItemDataSource$feedbackQuestionFlow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardFeedbackQuestionItemDataSource$feedbackQuestionFlow$1.label = i2 - Integer.MIN_VALUE;
                Object obj = rideCardFeedbackQuestionItemDataSource$feedbackQuestionFlow$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardFeedbackQuestionItemDataSource$feedbackQuestionFlow$1.label;
                String str = null;
                if (i != 0) {
                    b.b(obj);
                    boolean z = aVar.a.b().l.S;
                    List list = aVar.a.b().l.W.h;
                    if (list != null && (taxiOrderFeedbackQuestionInfoState = (TaxiOrderFeedbackQuestionInfoState) kotlin.collections.a.R(list)) != null) {
                        str = taxiOrderFeedbackQuestionInfoState.b;
                    }
                    o2y0 o2y0Var = aVar.a;
                    if (z) {
                        TaxiOrderFeedbackQuestion taxiOrderFeedbackQuestion = o2y0Var.b().l.T;
                        return (taxiOrderFeedbackQuestion == null || taxiOrderFeedbackQuestion.b.length() <= 0 || taxiOrderFeedbackQuestion.c.isEmpty()) ? new yjk0(rideCardItemDto$FeedbackQuestion2.a) : b(rideCardItemDto$FeedbackQuestion2, taxiOrderFeedbackQuestion, str);
                    }
                    TaxiOrder b2 = o2y0Var.b();
                    b2.getClass();
                    synchronized (b2) {
                        TaxiOrderLocalData taxiOrderLocalData = b2.l;
                        taxiOrderLocalData.getClass();
                        b2.l = TaxiOrderLocalData.b(taxiOrderLocalData, false, 0, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, -1, 16773119);
                    }
                    com.yandex.go.taxi.order.feedback.domain.a aVar2 = aVar.b;
                    String str2 = aVar.a.b().a;
                    FeedbackQuestionSource feedbackQuestionSource = FeedbackQuestionSource.TAXI;
                    boolean z2 = !rideCardItemDto$FeedbackQuestion2.c;
                    rideCardFeedbackQuestionItemDataSource$feedbackQuestionFlow$1.L$0 = rideCardItemDto$FeedbackQuestion2;
                    rideCardFeedbackQuestionItemDataSource$feedbackQuestionFlow$1.L$1 = str;
                    rideCardFeedbackQuestionItemDataSource$feedbackQuestionFlow$1.Z$0 = z;
                    rideCardFeedbackQuestionItemDataSource$feedbackQuestionFlow$1.label = 1;
                    obj = aVar2.b(str2, feedbackQuestionSource, z2, rideCardFeedbackQuestionItemDataSource$feedbackQuestionFlow$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str3 = (String) rideCardFeedbackQuestionItemDataSource$feedbackQuestionFlow$1.L$1;
                    RideCardItemDto$FeedbackQuestion rideCardItemDto$FeedbackQuestion3 = (RideCardItemDto$FeedbackQuestion) rideCardFeedbackQuestionItemDataSource$feedbackQuestionFlow$1.L$0;
                    b.b(obj);
                    str = str3;
                    rideCardItemDto$FeedbackQuestion2 = rideCardItemDto$FeedbackQuestion3;
                }
                xtq xtqVar = (xtq) obj;
                String str4 = xtqVar.a;
                String str5 = xtqVar.b;
                List<qrq> list2 = xtqVar.c;
                ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                for (qrq qrqVar : list2) {
                    arrayList.add(new TaxiOrderFeedbackQuestionAnswer(qrqVar.a, qrqVar.b));
                }
                TaxiOrderFeedbackQuestion taxiOrderFeedbackQuestion2 = new TaxiOrderFeedbackQuestion(str4, str5, arrayList, xtqVar.e);
                b = aVar.a.b();
                b.getClass();
                synchronized (b) {
                    TaxiOrderLocalData taxiOrderLocalData2 = b.l;
                    taxiOrderLocalData2.getClass();
                    b.l = TaxiOrderLocalData.b(taxiOrderLocalData2, false, 0, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, taxiOrderFeedbackQuestion2, null, null, null, false, null, false, null, null, null, -1, 16769023);
                }
                return b(rideCardItemDto$FeedbackQuestion2, taxiOrderFeedbackQuestion2, str);
            }
        }
        rideCardFeedbackQuestionItemDataSource$feedbackQuestionFlow$1 = new RideCardFeedbackQuestionItemDataSource$feedbackQuestionFlow$1(aVar, continuationImpl);
        Object obj2 = rideCardFeedbackQuestionItemDataSource$feedbackQuestionFlow$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardFeedbackQuestionItemDataSource$feedbackQuestionFlow$1.label;
        String str6 = null;
        if (i != 0) {
        }
        xtq xtqVar2 = (xtq) obj2;
        String str42 = xtqVar2.a;
        String str52 = xtqVar2.b;
        List<qrq> list22 = xtqVar2.c;
        ArrayList arrayList2 = new ArrayList(tcc.n(list22, 10));
        while (r5.hasNext()) {
        }
        TaxiOrderFeedbackQuestion taxiOrderFeedbackQuestion22 = new TaxiOrderFeedbackQuestion(str42, str52, arrayList2, xtqVar2.e);
        b = aVar.a.b();
        b.getClass();
        synchronized (b) {
        }
    }

    public static zjk0 b(RideCardItemDto$FeedbackQuestion rideCardItemDto$FeedbackQuestion, TaxiOrderFeedbackQuestion taxiOrderFeedbackQuestion, String str) {
        List list = taxiOrderFeedbackQuestion.c;
        if (list.isEmpty() || taxiOrderFeedbackQuestion.a.length() == 0 || taxiOrderFeedbackQuestion.b.length() == 0) {
            return new yjk0(rideCardItemDto$FeedbackQuestion.a);
        }
        if (taxiOrderFeedbackQuestion.d) {
            String str2 = rideCardItemDto$FeedbackQuestion.a;
            String str3 = rideCardItemDto$FeedbackQuestion.b;
            String str4 = taxiOrderFeedbackQuestion.a;
            String str5 = taxiOrderFeedbackQuestion.b;
            List<TaxiOrderFeedbackQuestionAnswer> list2 = list;
            ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
            for (TaxiOrderFeedbackQuestionAnswer taxiOrderFeedbackQuestionAnswer : list2) {
                arrayList.add(new qrq(taxiOrderFeedbackQuestionAnswer.a, taxiOrderFeedbackQuestionAnswer.b));
            }
            return new tik0(str2, str3, new xtq(arrayList, str4, str5, str, taxiOrderFeedbackQuestion.d));
        }
        String str6 = rideCardItemDto$FeedbackQuestion.a;
        String str7 = rideCardItemDto$FeedbackQuestion.b;
        String str8 = taxiOrderFeedbackQuestion.a;
        String str9 = taxiOrderFeedbackQuestion.b;
        List<TaxiOrderFeedbackQuestionAnswer> list3 = list;
        ArrayList arrayList2 = new ArrayList(tcc.n(list3, 10));
        for (TaxiOrderFeedbackQuestionAnswer taxiOrderFeedbackQuestionAnswer2 : list3) {
            arrayList2.add(new qrq(taxiOrderFeedbackQuestionAnswer2.a, taxiOrderFeedbackQuestionAnswer2.b));
        }
        return new uik0(str6, str7, new xtq(arrayList2, str8, str9, str, taxiOrderFeedbackQuestion.d));
    }

    public final tpr c(RideCardItemDto$FeedbackQuestion rideCardItemDto$FeedbackQuestion) {
        return !ijk0.b(rideCardItemDto$FeedbackQuestion) ? new g92(2, new yjk0(rideCardItemDto$FeedbackQuestion.a)) : e.I(e.t(e.I(this.a.a(), new RideCardFeedbackQuestionItemDataSource$stateFlow$1(2, null))), new RideCardFeedbackQuestionItemDataSource$stateFlow$2(rideCardItemDto$FeedbackQuestion, this, null));
    }
}
