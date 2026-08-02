package com.yandex.go.taxi.order.feedback;

import android.graphics.Bitmap;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$CoherentRatingSelector;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.bvf0;
import defpackage.kuq;
import defpackage.mvg;
import defpackage.n7v;
import defpackage.ny61;
import defpackage.smk0;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.feedback.FeedbackSelectorDecorationUpdater$updateSelectorDecoration$2", f = "FeedbackSelectorDecorationUpdater.kt", l = {53, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class FeedbackSelectorDecorationUpdater$updateSelectorDecoration$2 extends SuspendLambda implements wls {
    final /* synthetic */ Pair<String, smk0> $pair;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ll8x;", "<anonymous>", "(Ltse;)Ll8x;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.order.feedback.FeedbackSelectorDecorationUpdater$updateSelectorDecoration$2$1", f = "FeedbackSelectorDecorationUpdater.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.order.feedback.FeedbackSelectorDecorationUpdater$updateSelectorDecoration$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ String $selectedDecorationUrl;
        final /* synthetic */ String $unselectedDecorationUrl;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ a this$0;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
        @mvg(c = "com.yandex.go.taxi.order.feedback.FeedbackSelectorDecorationUpdater$updateSelectorDecoration$2$1$1", f = "FeedbackSelectorDecorationUpdater.kt", l = {54}, m = "invokeSuspend", v = 2)
        /* renamed from: com.yandex.go.taxi.order.feedback.FeedbackSelectorDecorationUpdater$updateSelectorDecoration$2$1$1, reason: invalid class name and collision with other inner class name */
        final class C00771 extends SuspendLambda implements wls {
            final /* synthetic */ String $selectedDecorationUrl;
            int label;
            final /* synthetic */ a this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00771(a aVar, String str, Continuation continuation) {
                super(2, continuation);
                this.this$0 = aVar;
                this.$selectedDecorationUrl = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C00771(this.this$0, this.$selectedDecorationUrl, continuation);
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                return ((C00771) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    b.b(obj);
                    a aVar = this.this$0;
                    String str = this.$selectedDecorationUrl;
                    this.label = 1;
                    if (a.a(aVar, str, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return zy11.a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
        @mvg(c = "com.yandex.go.taxi.order.feedback.FeedbackSelectorDecorationUpdater$updateSelectorDecoration$2$1$2", f = "FeedbackSelectorDecorationUpdater.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE}, m = "invokeSuspend", v = 2)
        /* renamed from: com.yandex.go.taxi.order.feedback.FeedbackSelectorDecorationUpdater$updateSelectorDecoration$2$1$2, reason: invalid class name */
        final class AnonymousClass2 extends SuspendLambda implements wls {
            final /* synthetic */ String $unselectedDecorationUrl;
            int label;
            final /* synthetic */ a this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(a aVar, String str, Continuation continuation) {
                super(2, continuation);
                this.this$0 = aVar;
                this.$unselectedDecorationUrl = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass2(this.this$0, this.$unselectedDecorationUrl, continuation);
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    b.b(obj);
                    a aVar = this.this$0;
                    String str = this.$unselectedDecorationUrl;
                    this.label = 1;
                    if (a.a(aVar, str, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return zy11.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, String str, String str2, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
            this.$selectedDecorationUrl = str;
            this.$unselectedDecorationUrl = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$selectedDecorationUrl, this.$unselectedDecorationUrl, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            tse tseVar = (tse) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            tje.N(tseVar, null, null, new C00771(this.this$0, this.$selectedDecorationUrl, null), 3);
            return tje.N(tseVar, null, null, new AnonymousClass2(this.this$0, this.$unselectedDecorationUrl, null), 3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackSelectorDecorationUpdater$updateSelectorDecoration$2(Pair pair, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$pair = pair;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FeedbackSelectorDecorationUpdater$updateSelectorDecoration$2(this.$pair, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FeedbackSelectorDecorationUpdater$updateSelectorDecoration$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0160  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        String a;
        String str;
        String str2;
        Object b;
        String str3;
        String str4;
        Bitmap bitmap;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            b.b(obj);
            Pair<String, smk0> pair = this.$pair;
            String str5 = (String) pair.getFirst();
            smk0 smk0Var = (smk0) pair.getSecond();
            if (smk0Var == null) {
                kuq kuqVar = this.this$0.c;
                kuqVar.a.remove(str5);
                kuqVar.b.remove(str5);
                kuqVar.c.remove(str5);
                return zy11Var;
            }
            List list = smk0Var.c;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((RideCardItemDto$CoherentRatingSelector.RatingItemDecorationState) obj2).a == RideCardItemDto$CoherentRatingSelector.DecorationStateType.SELECTED) {
                    break;
                }
            }
            RideCardItemDto$CoherentRatingSelector.RatingItemDecorationState ratingItemDecorationState = (RideCardItemDto$CoherentRatingSelector.RatingItemDecorationState) obj2;
            n7v n7vVar = ratingItemDecorationState != null ? ratingItemDecorationState.b : null;
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it2.next();
                if (((RideCardItemDto$CoherentRatingSelector.RatingItemDecorationState) obj3).a == RideCardItemDto$CoherentRatingSelector.DecorationStateType.UNSELECTED) {
                    break;
                }
            }
            RideCardItemDto$CoherentRatingSelector.RatingItemDecorationState ratingItemDecorationState2 = (RideCardItemDto$CoherentRatingSelector.RatingItemDecorationState) obj3;
            n7v n7vVar2 = ratingItemDecorationState2 != null ? ratingItemDecorationState2.b : null;
            String a2 = this.this$0.a.a(n7vVar);
            a = this.this$0.a.a(n7vVar2);
            if (a2 == null || a == null) {
                kuq kuqVar2 = this.this$0.c;
                kuqVar2.a.remove(str5);
                kuqVar2.b.remove(str5);
                kuqVar2.c.remove(str5);
                return zy11Var;
            }
            String str6 = (String) this.this$0.c.b.get(str5);
            String str7 = (String) this.this$0.c.c.get(str5);
            if (!a2.equals(str6) || !a.equals(str7)) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, a2, a, null);
                this.L$0 = str5;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = a2;
                this.L$5 = a;
                this.L$6 = null;
                this.L$7 = null;
                this.label = 1;
                if (bvf0.n(anonymousClass1, this) != coroutineSingletons) {
                    str = str5;
                    str2 = a2;
                }
                return coroutineSingletons;
            }
            return zy11Var;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str3 = (String) this.L$5;
            str2 = (String) this.L$4;
            str4 = (String) this.L$0;
            b.b(obj);
            bitmap = (Bitmap) obj;
            if (bitmap != null) {
                kuq kuqVar3 = this.this$0.c;
                kuqVar3.a.put(str4, bitmap);
                kuqVar3.c.put(str4, str3);
                kuqVar3.b.put(str4, str2);
                return zy11Var;
            }
            return zy11Var;
        }
        String str8 = (String) this.L$5;
        String str9 = (String) this.L$4;
        str = (String) this.L$0;
        b.b(obj);
        a = str8;
        str2 = str9;
        a aVar = this.this$0;
        this.L$0 = str;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = str2;
        this.L$5 = a;
        this.L$6 = null;
        this.L$7 = null;
        this.label = 2;
        if (a == null) {
            aVar.getClass();
            b = null;
        } else {
            b = ru.yandex.taxi.utils.a.b(aVar.b.b().b(a), this);
        }
        if (b != coroutineSingletons) {
            str3 = a;
            obj = b;
            str4 = str;
            bitmap = (Bitmap) obj;
            if (bitmap != null) {
            }
            return zy11Var;
        }
        return coroutineSingletons;
    }
}
