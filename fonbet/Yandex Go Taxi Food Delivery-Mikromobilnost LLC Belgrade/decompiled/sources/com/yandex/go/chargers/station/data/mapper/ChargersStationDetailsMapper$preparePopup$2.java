package com.yandex.go.chargers.station.data.mapper;

import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import com.yandex.go.chargers.station.data.model.ChargersStationDetailsResponse;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oma;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Loma;", "<anonymous>", "(Ltse;)Loma;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.station.data.mapper.ChargersStationDetailsMapper$preparePopup$2", f = "ChargersStationDetailsMapper.kt", l = {SubsamplingScaleImageView.ORIENTATION_180, 181}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersStationDetailsMapper$preparePopup$2 extends SuspendLambda implements wls {
    final /* synthetic */ ChargersStationDetailsResponse.Popup $popup;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/CharSequence;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.chargers.station.data.mapper.ChargersStationDetailsMapper$preparePopup$2$1", f = "ChargersStationDetailsMapper.kt", l = {SubsamplingScaleImageView.ORIENTATION_180}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.chargers.station.data.mapper.ChargersStationDetailsMapper$preparePopup$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ ChargersStationDetailsResponse.Popup $popup;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, ChargersStationDetailsResponse.Popup popup, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
            this.$popup = popup;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$popup, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    kotlin.b.b(obj);
                    return obj;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            c cVar = this.this$0.f;
            FormattedText formattedText = this.$popup.b;
            this.label = 1;
            Object i2 = c.i(cVar, formattedText, null, this, 30);
            return i2 == coroutineSingletons ? coroutineSingletons : i2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/CharSequence;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.chargers.station.data.mapper.ChargersStationDetailsMapper$preparePopup$2$2", f = "ChargersStationDetailsMapper.kt", l = {181}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.chargers.station.data.mapper.ChargersStationDetailsMapper$preparePopup$2$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ ChargersStationDetailsResponse.Popup $popup;
        Object L$0;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(a aVar, ChargersStationDetailsResponse.Popup popup, Continuation continuation) {
            super(2, continuation);
            this.$popup = popup;
            this.this$0 = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, this.$popup, continuation);
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
                kotlin.b.b(obj);
                FormattedText formattedText = this.$popup.c;
                if (formattedText == null) {
                    return null;
                }
                c cVar = this.this$0.f;
                this.L$0 = null;
                this.label = 1;
                obj = c.i(cVar, formattedText, null, this, 30);
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
            return (CharSequence) obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersStationDetailsMapper$preparePopup$2(a aVar, ChargersStationDetailsResponse.Popup popup, Continuation continuation) {
        super(2, continuation);
        this.$popup = popup;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChargersStationDetailsMapper$preparePopup$2 chargersStationDetailsMapper$preparePopup$2 = new ChargersStationDetailsMapper$preparePopup$2(this.this$0, this.$popup, continuation);
        chargersStationDetailsMapper$preparePopup$2.L$0 = obj;
        return chargersStationDetailsMapper$preparePopup$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersStationDetailsMapper$preparePopup$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
    
        if (r11 == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        CharSequence charSequence;
        String str3;
        String str4;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ChargersStationDetailsResponse.Popup popup = this.$popup;
            str = popup.d.a;
            str2 = popup.a;
            qoh h = tje.h(tseVar, null, null, new AnonymousClass1(this.this$0, popup, null), 3);
            this.L$0 = tseVar;
            this.L$1 = str;
            this.L$2 = str2;
            this.label = 1;
            obj = h.s(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                charSequence = (CharSequence) this.L$3;
                str3 = (String) this.L$2;
                str4 = (String) this.L$1;
                kotlin.b.b(obj);
                return new oma(charSequence, (CharSequence) obj, str4, str3);
            }
            String str5 = (String) this.L$2;
            String str6 = (String) this.L$1;
            kotlin.b.b(obj);
            str2 = str5;
            str = str6;
        }
        CharSequence charSequence2 = (CharSequence) obj;
        qoh h2 = tje.h(tseVar, null, null, new AnonymousClass2(this.this$0, this.$popup, null), 3);
        this.L$0 = null;
        this.L$1 = str;
        this.L$2 = str2;
        this.L$3 = charSequence2;
        this.label = 2;
        Object s = h2.s(this);
        if (s != coroutineSingletons) {
            charSequence = charSequence2;
            str3 = str2;
            obj = s;
            str4 = str;
            return new oma(charSequence, (CharSequence) obj, str4, str3);
        }
        return coroutineSingletons;
    }
}
