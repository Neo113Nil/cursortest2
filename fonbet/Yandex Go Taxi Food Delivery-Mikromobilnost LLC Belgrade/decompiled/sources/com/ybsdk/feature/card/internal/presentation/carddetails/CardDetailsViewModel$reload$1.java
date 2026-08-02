package com.ybsdk.feature.card.internal.presentation.carddetails;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.CardMainScreenEvents$CardMainScreenLoadedResult;
import com.ybsdk.feature.card.api.entities.CardCarouselProductType;
import com.ybsdk.feature.card.internal.interactors.d;
import defpackage.ae8;
import defpackage.bq8;
import defpackage.df8;
import defpackage.ds31;
import defpackage.gq51;
import defpackage.gw00;
import defpackage.h73;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.l8x;
import defpackage.mfb1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ov3;
import defpackage.pz40;
import defpackage.qq7;
import defpackage.s8j0;
import defpackage.sd8;
import defpackage.t8j0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.u50;
import defpackage.w511;
import defpackage.wls;
import defpackage.x4c;
import defpackage.yd8;
import defpackage.yw01;
import defpackage.zd8;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.card.internal.presentation.carddetails.CardDetailsViewModel$reload$1", f = "CardDetailsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CardDetailsViewModel$reload$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $withLoader;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.ybsdk.feature.card.internal.presentation.carddetails.CardDetailsViewModel$reload$1$2", f = "CardDetailsViewModel.kt", l = {141}, m = "invokeSuspend")
    /* renamed from: com.ybsdk.feature.card.internal.presentation.carddetails.CardDetailsViewModel$reload$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(b bVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:62:0x024f  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            r0 r0Var;
            Object value;
            int i;
            CardCarouselProductType cardCarouselProductType;
            int i2;
            r0 r0Var2;
            Object value2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.label;
            Integer num = null;
            if (i3 == 0) {
                kotlin.b.b(obj);
                b bVar = this.this$0;
                d dVar = bVar.R;
                String agreementId = bVar.B.getAgreementId();
                this.label = 1;
                Object b = dVar.b(agreementId, this);
                if (b == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj2 = b;
            } else {
                if (i3 != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                obj2 = ((Result) obj).getValue();
            }
            AppAnalyticsReporter appAnalyticsReporter = this.this$0.J.a;
            if (!(obj2 instanceof Result.Failure)) {
                Object R = kotlin.collections.a.R((List) obj2);
                yd8 yd8Var = R instanceof yd8 ? (yd8) R : null;
                if ((yd8Var != null ? yd8Var.a : null) == null) {
                    qq7.d(appAnalyticsReporter.l, CardMainScreenEvents$CardMainScreenLoadedResult.ERROR, "User has no cards", null, null, null, 28);
                } else {
                    qq7.d(appAnalyticsReporter.l, CardMainScreenEvents$CardMainScreenLoadedResult.OK, null, null, null, null, 30);
                }
            }
            Throwable a = Result.a(obj2);
            if (a != null) {
                qq7.d(appAnalyticsReporter.l, CardMainScreenEvents$CardMainScreenLoadedResult.ERROR, a.getMessage(), null, null, null, 28);
            }
            final b bVar2 = this.this$0;
            Throwable a2 = Result.a(obj2);
            if (a2 == null) {
                List<ae8> list = (List) obj2;
                if (list.isEmpty()) {
                    bVar2.C.m(((df8) bVar2.F).b());
                    pz40 Y = bVar2.Y();
                    do {
                        r0Var2 = (r0) Y;
                        value2 = r0Var2.getValue();
                    } while (!r0Var2.k(value2, bq8.a((bq8) value2, new t8j0(), null, false, null, null, null, null, null, null, 16382)));
                } else {
                    ArrayList arrayList = bVar2.U;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((l8x) it.next()).a(null);
                    }
                    arrayList.clear();
                    List list2 = list;
                    kotlin.sequences.b.s(new yw01(kotlin.sequences.b.g(kotlin.sequences.a.c(new yw01(kotlin.sequences.b.o(new h73(1, list2), new sd8(4)), new sd8(5))), new sd8(6)), new tls() { // from class: com.ybsdk.feature.card.internal.presentation.carddetails.a
                        @Override // defpackage.tls
                        public final Object invoke(Object obj3) {
                            String str = ((gq51) obj3).k;
                            if (str == null) {
                                str = "";
                            }
                            b bVar3 = b.this;
                            bVar3.c0(str);
                            bVar3.U.add(tje.N(ds31.a(bVar3), null, null, new CardDetailsViewModel$observePromosActivationStatuses$5$1(bVar3, str, null), 3));
                            return zy11.a;
                        }
                    }));
                    arrayList.add(e.H(ds31.a(bVar2), new jqr(bVar2.D.d, new CardDetailsViewModel$observePromosActivationStatuses$6(bVar2, null), 3)));
                    Iterator it2 = list.iterator();
                    int i4 = 0;
                    while (true) {
                        i = -1;
                        if (!it2.hasNext()) {
                            i4 = -1;
                            break;
                        }
                        ae8 ae8Var = (ae8) it2.next();
                        if ((ae8Var instanceof yd8) && jl40.l(((yd8) ae8Var).a.d, bVar2.V)) {
                            break;
                        }
                        i4++;
                    }
                    Integer num2 = new Integer(i4);
                    Integer num3 = num2.intValue() != -1 ? num2 : null;
                    bVar2.V = null;
                    InitialPosition initialPosition = ((bq8) bVar2.X()).f;
                    if (initialPosition != null) {
                        if (initialPosition.getCardId() != null) {
                            i2 = 0;
                            for (ae8 ae8Var2 : list) {
                                if ((ae8Var2 instanceof yd8) && jl40.l(mfb1.a(ae8Var2), initialPosition.getCardId())) {
                                    i = i2;
                                    break;
                                }
                                i2++;
                            }
                            if (i < 0) {
                                i = 0;
                            }
                            num = new Integer(i);
                        } else {
                            if (initialPosition.getPromoId() != null) {
                                i2 = 0;
                                loop4: for (ae8 ae8Var3 : list) {
                                    if (ae8Var3 instanceof zd8) {
                                        ArrayList arrayList2 = ((zd8) ae8Var3).b;
                                        if (!arrayList2.isEmpty()) {
                                            Iterator it3 = arrayList2.iterator();
                                            while (it3.hasNext()) {
                                                if (jl40.l(((gq51) it3.next()).a, initialPosition.getPromoId())) {
                                                    i = i2;
                                                    break;
                                                }
                                            }
                                        } else {
                                            continue;
                                        }
                                    }
                                    i2++;
                                }
                            } else if (initialPosition.getScrollToProductType() != null) {
                                Iterator it4 = list.iterator();
                                int i5 = 0;
                                while (true) {
                                    if (!it4.hasNext()) {
                                        break;
                                    }
                                    ae8 ae8Var4 = (ae8) it4.next();
                                    if (ae8Var4 instanceof yd8) {
                                        cardCarouselProductType = ((yd8) ae8Var4).a.p;
                                    } else {
                                        if (!(ae8Var4 instanceof zd8)) {
                                            w511.b();
                                            return null;
                                        }
                                        cardCarouselProductType = null;
                                    }
                                    if (cardCarouselProductType == initialPosition.getScrollToProductType()) {
                                        i = i5;
                                        break;
                                    }
                                    i5++;
                                }
                            } else if (initialPosition.getScrollToFirstPromo()) {
                                Iterator it5 = list.iterator();
                                int i6 = 0;
                                while (true) {
                                    if (!it5.hasNext()) {
                                        break;
                                    }
                                    if (((ae8) it5.next()) instanceof zd8) {
                                        i = i6;
                                        break;
                                    }
                                    i6++;
                                }
                            } else {
                                i = 0;
                            }
                            if (i < 0) {
                            }
                            num = new Integer(i);
                        }
                    }
                    Integer num4 = num;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : list2) {
                        if (obj3 instanceof yd8) {
                            arrayList3.add(obj3);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
                    Iterator it6 = arrayList3.iterator();
                    while (it6.hasNext()) {
                        arrayList4.add(((yd8) it6.next()).a.d);
                    }
                    ov3 ov3Var = bVar2.N;
                    int d = gw00.d(tcc.n(arrayList4, 10));
                    if (d < 16) {
                        d = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                    Iterator it7 = arrayList4.iterator();
                    while (it7.hasNext()) {
                        Object next = it7.next();
                        linkedHashMap.put(next, Boolean.valueOf(ov3Var.a.a.getBoolean("card_added_to_samsung_pay_".concat((String) next), false)));
                    }
                    bVar2.a0(new u50(list, num3, num4, bVar2, linkedHashMap, 7));
                    bVar2.u0();
                }
            } else {
                x4c.g("Exception during reload() in CardDetailsViewModel", a2, null, null, 12);
                pz40 Y2 = bVar2.Y();
                do {
                    r0Var = (r0) Y2;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, bq8.a((bq8) value, new s8j0(a2), null, false, null, null, null, null, null, null, 16382)));
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardDetailsViewModel$reload$1(b bVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$withLoader = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CardDetailsViewModel$reload$1(this.this$0, this.$withLoader, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        CardDetailsViewModel$reload$1 cardDetailsViewModel$reload$1 = (CardDetailsViewModel$reload$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        cardDetailsViewModel$reload$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.J.a.l.a.a("card.main_screen.initiated", null);
        if (this.$withLoader) {
            pz40 Y = this.this$0.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, bq8.a((bq8) value, new t8j0(), null, false, null, null, null, null, null, null, 16382)));
        }
        tje.N(ds31.a(this.this$0), null, null, new AnonymousClass2(this.this$0, null), 3);
        return zy11.a;
    }
}
