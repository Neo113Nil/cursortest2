package com.yandex.plus.acquisition.sdk.button.section.ui.impl.view;

import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.text.SpannedString;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.jse;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.pzc0;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lpzc0;", "<anonymous>", "(Ltse;)Lpzc0;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.ButtonSectionStateFactory$createButtonSectionOfferForComposite$2", f = "ButtonSectionStateFactory.kt", l = {193}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ButtonSectionStateFactory$createButtonSectionOfferForComposite$2 extends SuspendLambda implements wls {
    final /* synthetic */ PlusAcquisitionSmartOffer $smartOffer;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lpzc0;", "<anonymous>", "(Ltse;)Lpzc0;"}, k = 3, mv = {2, 2, 0})
    @mvg(c = "com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.ButtonSectionStateFactory$createButtonSectionOfferForComposite$2$1", f = "ButtonSectionStateFactory.kt", l = {202, 203}, m = "invokeSuspend")
    /* renamed from: com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.ButtonSectionStateFactory$createButtonSectionOfferForComposite$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ PlusAcquisitionSmartOffer $smartOffer;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, PlusAcquisitionSmartOffer plusAcquisitionSmartOffer, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
            this.$smartOffer = plusAcquisitionSmartOffer;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$smartOffer, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v6, types: [android.text.Spanned] */
        /* JADX WARN: Type inference failed for: r14v0 */
        /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r14v2 */
        /* JADX WARN: Type inference failed for: r3v7, types: [noh] */
        /* JADX WARN: Type inference failed for: r7v7, types: [android.text.Spanned] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SpannedString a;
            PlusAcquisitionSmartOffer copy$default;
            Object s;
            qoh qohVar;
            int i;
            Object k;
            Drawable drawable;
            PlusAcquisitionSmartOffer plusAcquisitionSmartOffer;
            tse tseVar = (tse) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                b.b(obj);
                a = this.this$0.b.a(this.$smartOffer);
                ?? r14 = (a == null || !this.$smartOffer.isOneClickEnabled()) ? 0 : 1;
                copy$default = PlusAcquisitionSmartOffer.copy$default(this.$smartOffer, 0, null, null, null, null, r14, null, null, null, null, null, 2015, null);
                PlusAcquisitionSmartOffer.Texts texts = copy$default.getTexts();
                qoh h = tje.h(tseVar, null, null, new ButtonSectionStateFactory$createButtonSectionOfferForComposite$2$1$tariffIconDeferred$1(this.this$0, texts, null), 3);
                qoh h2 = tje.h(tseVar, null, null, new ButtonSectionStateFactory$createButtonSectionOfferForComposite$2$1$optionIconDeferred$1(this.this$0, texts, null), 3);
                this.L$0 = null;
                this.L$1 = a;
                this.L$2 = copy$default;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = h2;
                this.I$0 = r14;
                this.label = 1;
                s = h.s(this);
                if (s != coroutineSingletons) {
                    qohVar = h2;
                    i = r14;
                }
                return coroutineSingletons;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                drawable = (Drawable) this.L$6;
                plusAcquisitionSmartOffer = (PlusAcquisitionSmartOffer) this.L$2;
                ?? r0 = (Spanned) this.L$1;
                b.b(obj);
                a = r0;
                k = obj;
                return new pzc0(plusAcquisitionSmartOffer, a, drawable, (Drawable) k);
            }
            i = this.I$0;
            ?? r3 = (noh) this.L$5;
            PlusAcquisitionSmartOffer plusAcquisitionSmartOffer2 = (PlusAcquisitionSmartOffer) this.L$2;
            ?? r7 = (Spanned) this.L$1;
            b.b(obj);
            qohVar = r3;
            a = r7;
            copy$default = plusAcquisitionSmartOffer2;
            s = obj;
            Drawable drawable2 = (Drawable) s;
            this.L$0 = null;
            this.L$1 = a;
            this.L$2 = copy$default;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = drawable2;
            this.I$0 = i;
            this.label = 2;
            k = qohVar.k(this);
            if (k != coroutineSingletons) {
                drawable = drawable2;
                plusAcquisitionSmartOffer = copy$default;
                return new pzc0(plusAcquisitionSmartOffer, a, drawable, (Drawable) k);
            }
            return coroutineSingletons;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonSectionStateFactory$createButtonSectionOfferForComposite$2(a aVar, PlusAcquisitionSmartOffer plusAcquisitionSmartOffer, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$smartOffer = plusAcquisitionSmartOffer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ButtonSectionStateFactory$createButtonSectionOfferForComposite$2(this.this$0, this.$smartOffer, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ButtonSectionStateFactory$createButtonSectionOfferForComposite$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        jse jseVar = aVar.d;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(aVar, this.$smartOffer, null);
        this.label = 1;
        Object k0 = tje.k0(jseVar, anonymousClass1, this);
        return k0 == coroutineSingletons ? coroutineSingletons : k0;
    }
}
