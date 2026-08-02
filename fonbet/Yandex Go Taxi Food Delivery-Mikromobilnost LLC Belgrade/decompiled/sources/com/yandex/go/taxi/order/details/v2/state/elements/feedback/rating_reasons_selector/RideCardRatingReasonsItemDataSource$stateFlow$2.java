package com.yandex.go.taxi.order.details.v2.state.elements.feedback.rating_reasons_selector;

import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$AchievementRatingReasonsSelector;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$TagRatingReasonsSelector;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$TextRatingReasonsSelector;
import com.yandex.go.taxi.order.models.api.response.a7;
import com.yandex.go.taxi.order.models.api.response.rating_reasons.RatingReasonBadgeDto$Achievement;
import com.yandex.go.taxi.order.models.api.response.rating_reasons.RatingReasonBadgeDto$Tag;
import com.yandex.go.taxi.order.models.api.response.rating_reasons.RatingReasonBadgeDto$Text;
import defpackage.hmk0;
import defpackage.imk0;
import defpackage.jmk0;
import defpackage.kmk0;
import defpackage.mmk0;
import defpackage.mvg;
import defpackage.nmk0;
import defpackage.ny61;
import defpackage.pjk0;
import defpackage.ppa1;
import defpackage.w511;
import defpackage.wls;
import defpackage.yjk0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\"\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00040\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/Pair;", "", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "<destruct>", "Lzjk0;", "<anonymous>", "(Lkotlin/Pair;)Lzjk0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.feedback.rating_reasons_selector.RideCardRatingReasonsItemDataSource$stateFlow$2", f = "RideCardRatingReasonsItemDataSource.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardRatingReasonsItemDataSource$stateFlow$2 extends SuspendLambda implements wls {
    final /* synthetic */ pjk0 $itemResponse;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardRatingReasonsItemDataSource$stateFlow$2(pjk0 pjk0Var, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$itemResponse = pjk0Var;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RideCardRatingReasonsItemDataSource$stateFlow$2 rideCardRatingReasonsItemDataSource$stateFlow$2 = new RideCardRatingReasonsItemDataSource$stateFlow$2(this.$itemResponse, this.this$0, continuation);
        rideCardRatingReasonsItemDataSource$stateFlow$2.L$0 = obj;
        return rideCardRatingReasonsItemDataSource$stateFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardRatingReasonsItemDataSource$stateFlow$2) create((Pair) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01c1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0193 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01f0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0109 A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object nmk0Var;
        kmk0 kmk0Var;
        jmk0 jmk0Var;
        imk0 imk0Var;
        String str;
        String str2;
        Pair pair = (Pair) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        Object obj2 = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        int intValue = ((Number) pair.getFirst()).intValue();
        HashSet hashSet = (HashSet) pair.getSecond();
        boolean c = ppa1.c(intValue, this.$itemResponse.getC());
        pjk0 pjk0Var = this.$itemResponse;
        if (!c) {
            return new yjk0(pjk0Var.getId());
        }
        if (pjk0Var instanceof RideCardItemDto$AchievementRatingReasonsSelector) {
            a aVar = this.this$0;
            RideCardItemDto$AchievementRatingReasonsSelector rideCardItemDto$AchievementRatingReasonsSelector = (RideCardItemDto$AchievementRatingReasonsSelector) pjk0Var;
            aVar.getClass();
            List list = rideCardItemDto$AchievementRatingReasonsSelector.d;
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : list) {
                if (ppa1.c(intValue, ((RatingReasonBadgeDto$Achievement) obj3).c)) {
                    arrayList.add(obj3);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                RatingReasonBadgeDto$Achievement ratingReasonBadgeDto$Achievement = (RatingReasonBadgeDto$Achievement) it.next();
                String str3 = ratingReasonBadgeDto$Achievement.a;
                if (str3.length() != 0) {
                    boolean contains = hashSet.contains(str3);
                    String str4 = ratingReasonBadgeDto$Achievement.b;
                    if (str4 != null && str4.length() != 0) {
                        String str5 = ratingReasonBadgeDto$Achievement.a;
                        RatingReasonBadgeDto$Achievement.Images images = ratingReasonBadgeDto$Achievement.d;
                        if (images != null && (str = images.a) != null && (str2 = images.b) != null) {
                            imk0Var = new imk0(str5, str4, str, str2, contains);
                            if (imk0Var == null) {
                                arrayList2.add(imk0Var);
                            }
                        }
                    }
                }
                imk0Var = null;
                if (imk0Var == null) {
                }
            }
            if (!arrayList2.isEmpty()) {
                aVar.c(hashSet, arrayList2);
                nmk0Var = new hmk0(rideCardItemDto$AchievementRatingReasonsSelector.a, rideCardItemDto$AchievementRatingReasonsSelector.b, a.a(intValue, rideCardItemDto$AchievementRatingReasonsSelector.e), arrayList2);
                obj2 = nmk0Var;
            }
            return obj2 == null ? new yjk0(((a7) this.$itemResponse).getA()) : obj2;
        }
        if (pjk0Var instanceof RideCardItemDto$TagRatingReasonsSelector) {
            a aVar2 = this.this$0;
            RideCardItemDto$TagRatingReasonsSelector rideCardItemDto$TagRatingReasonsSelector = (RideCardItemDto$TagRatingReasonsSelector) pjk0Var;
            aVar2.getClass();
            List list2 = rideCardItemDto$TagRatingReasonsSelector.d;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj4 : list2) {
                if (ppa1.c(intValue, ((RatingReasonBadgeDto$Tag) obj4).c)) {
                    arrayList3.add(obj4);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                RatingReasonBadgeDto$Tag ratingReasonBadgeDto$Tag = (RatingReasonBadgeDto$Tag) it2.next();
                String str6 = ratingReasonBadgeDto$Tag.a;
                if (str6.length() != 0) {
                    boolean contains2 = hashSet.contains(str6);
                    String str7 = ratingReasonBadgeDto$Tag.b;
                    if (str7 != null && str7.length() != 0) {
                        jmk0Var = new jmk0(ratingReasonBadgeDto$Tag.a, contains2, str7, ratingReasonBadgeDto$Tag.d);
                        if (jmk0Var == null) {
                            arrayList4.add(jmk0Var);
                        }
                    }
                }
                jmk0Var = null;
                if (jmk0Var == null) {
                }
            }
            if (!arrayList4.isEmpty()) {
                aVar2.c(hashSet, arrayList4);
                nmk0Var = new mmk0(rideCardItemDto$TagRatingReasonsSelector.a, rideCardItemDto$TagRatingReasonsSelector.b, a.a(intValue, rideCardItemDto$TagRatingReasonsSelector.e), arrayList4);
                obj2 = nmk0Var;
            }
            if (obj2 == null) {
            }
        } else {
            if (!(pjk0Var instanceof RideCardItemDto$TextRatingReasonsSelector)) {
                w511.b();
                return null;
            }
            a aVar3 = this.this$0;
            RideCardItemDto$TextRatingReasonsSelector rideCardItemDto$TextRatingReasonsSelector = (RideCardItemDto$TextRatingReasonsSelector) pjk0Var;
            aVar3.getClass();
            List list3 = rideCardItemDto$TextRatingReasonsSelector.d;
            ArrayList arrayList5 = new ArrayList();
            for (Object obj5 : list3) {
                if (ppa1.c(intValue, ((RatingReasonBadgeDto$Text) obj5).c)) {
                    arrayList5.add(obj5);
                }
            }
            ArrayList arrayList6 = new ArrayList();
            Iterator it3 = arrayList5.iterator();
            while (it3.hasNext()) {
                RatingReasonBadgeDto$Text ratingReasonBadgeDto$Text = (RatingReasonBadgeDto$Text) it3.next();
                String str8 = ratingReasonBadgeDto$Text.a;
                if (str8.length() != 0) {
                    boolean contains3 = hashSet.contains(str8);
                    String str9 = ratingReasonBadgeDto$Text.b;
                    if (str9 != null && str9.length() != 0) {
                        kmk0Var = new kmk0(ratingReasonBadgeDto$Text.a, contains3, str9);
                        if (kmk0Var == null) {
                            arrayList6.add(kmk0Var);
                        }
                    }
                }
                kmk0Var = null;
                if (kmk0Var == null) {
                }
            }
            if (!arrayList6.isEmpty()) {
                aVar3.c(hashSet, arrayList6);
                nmk0Var = new nmk0(rideCardItemDto$TextRatingReasonsSelector.a, rideCardItemDto$TextRatingReasonsSelector.b, a.a(intValue, rideCardItemDto$TextRatingReasonsSelector.e), arrayList6);
                obj2 = nmk0Var;
            }
            if (obj2 == null) {
            }
        }
    }
}
