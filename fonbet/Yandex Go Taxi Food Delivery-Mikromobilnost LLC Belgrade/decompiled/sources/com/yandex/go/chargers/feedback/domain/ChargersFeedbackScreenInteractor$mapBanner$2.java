package com.yandex.go.chargers.feedback.domain;

import com.yandex.go.chargers.feedback.data.ChargersFeedbackScreenBannerActionDto$Deeplink;
import com.yandex.go.chargers.feedback.data.ChargersFeedbackScreenBannerDto;
import com.yandex.go.chargers.feedback.data.g;
import com.yandex.go.chargers.feedback.data.h;
import com.yandex.go.chargers.feedback.data.j;
import com.yandex.go.chargers.feedback.domain.model.ChargersFeedbackBannerAnalyticsAlias;
import defpackage.jl40;
import defpackage.mja1;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.ovi0;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tn9;
import defpackage.tse;
import defpackage.ty9;
import defpackage.uy9;
import defpackage.vy9;
import defpackage.wls;
import defpackage.wy9;
import defpackage.xy9;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lty9;", "<anonymous>", "(Ltse;)Lty9;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.feedback.domain.ChargersFeedbackScreenInteractor$mapBanner$2", f = "ChargersFeedbackScreenInteractor.kt", l = {81, 82, 83}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersFeedbackScreenInteractor$mapBanner$2 extends SuspendLambda implements wls {
    final /* synthetic */ ChargersFeedbackScreenBannerDto $bannerDto;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersFeedbackScreenInteractor$mapBanner$2(ChargersFeedbackScreenBannerDto chargersFeedbackScreenBannerDto, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$bannerDto = chargersFeedbackScreenBannerDto;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChargersFeedbackScreenInteractor$mapBanner$2 chargersFeedbackScreenInteractor$mapBanner$2 = new ChargersFeedbackScreenInteractor$mapBanner$2(this.$bannerDto, this.this$0, continuation);
        chargersFeedbackScreenInteractor$mapBanner$2.L$0 = obj;
        return chargersFeedbackScreenInteractor$mapBanner$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersFeedbackScreenInteractor$mapBanner$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x009a, code lost:
    
        if (r3 == r2) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00d7  */
    /* JADX WARN: Type inference failed for: r3v11, types: [noh] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        qoh h;
        noh h2;
        Object s;
        Object k;
        noh nohVar;
        CharSequence charSequence;
        Object k2;
        CharSequence charSequence2;
        CharSequence charSequence3;
        j jVar;
        xy9 xy9Var;
        xy9 xy9Var2;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            qoh h3 = tje.h(tseVar, null, null, new ChargersFeedbackScreenInteractor$mapBanner$2$titleAsync$1(this.$bannerDto, this.this$0, null), 3);
            h = tje.h(tseVar, null, null, new ChargersFeedbackScreenInteractor$mapBanner$2$subtitleAsync$1(this.$bannerDto, this.this$0, null), 3);
            h2 = tje.h(tseVar, null, null, new ChargersFeedbackScreenInteractor$mapBanner$2$attributeAsync$1(this.$bannerDto, this.this$0, null), 3);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h;
            this.L$3 = h2;
            this.label = 1;
            s = h3.s(this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    charSequence = (CharSequence) this.L$4;
                    nohVar = (noh) this.L$3;
                    kotlin.b.b(obj);
                    k = obj;
                    CharSequence charSequence4 = (CharSequence) k;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = charSequence;
                    this.L$5 = charSequence4;
                    this.label = 3;
                    k2 = nohVar.k(this);
                    if (k2 != coroutineSingletons) {
                        charSequence2 = charSequence;
                        charSequence3 = charSequence4;
                        tn9 tn9Var = (tn9) k2;
                        String str = this.$bannerDto.c;
                        if (str == null) {
                        }
                        a aVar = this.this$0;
                        jVar = this.$bannerDto.e;
                        aVar.getClass();
                        if (!(jVar instanceof ChargersFeedbackScreenBannerActionDto$Deeplink)) {
                        }
                        xy9Var = xy9Var2;
                        a aVar2 = this.this$0;
                        ChargersFeedbackScreenBannerDto chargersFeedbackScreenBannerDto = this.$bannerDto;
                        aVar2.getClass();
                        return new ty9(charSequence2, charSequence3, tn9Var, r12, xy9Var, jl40.l(chargersFeedbackScreenBannerDto.e, h.INSTANCE) ? ChargersFeedbackBannerAnalyticsAlias.SUBSCRIPTION : null);
                    }
                    return coroutineSingletons;
                }
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                CharSequence charSequence5 = (CharSequence) this.L$5;
                CharSequence charSequence6 = (CharSequence) this.L$4;
                kotlin.b.b(obj);
                k2 = obj;
                charSequence3 = charSequence5;
                charSequence2 = charSequence6;
                tn9 tn9Var2 = (tn9) k2;
                String str2 = this.$bannerDto.c;
                ovi0 a = str2 == null ? mja1.a(str2, null, 6) : null;
                a aVar3 = this.this$0;
                jVar = this.$bannerDto.e;
                aVar3.getClass();
                if (!(jVar instanceof ChargersFeedbackScreenBannerActionDto$Deeplink)) {
                    xy9Var2 = new uy9(((ChargersFeedbackScreenBannerActionDto$Deeplink) jVar).a);
                } else if (jl40.l(jVar, h.INSTANCE)) {
                    xy9Var2 = wy9.a;
                } else {
                    if (!jl40.l(jVar, g.INSTANCE)) {
                        xy9Var = null;
                        a aVar22 = this.this$0;
                        ChargersFeedbackScreenBannerDto chargersFeedbackScreenBannerDto2 = this.$bannerDto;
                        aVar22.getClass();
                        return new ty9(charSequence2, charSequence3, tn9Var2, a, xy9Var, jl40.l(chargersFeedbackScreenBannerDto2.e, h.INSTANCE) ? ChargersFeedbackBannerAnalyticsAlias.SUBSCRIPTION : null);
                    }
                    xy9Var2 = vy9.a;
                }
                xy9Var = xy9Var2;
                a aVar222 = this.this$0;
                ChargersFeedbackScreenBannerDto chargersFeedbackScreenBannerDto22 = this.$bannerDto;
                aVar222.getClass();
                return new ty9(charSequence2, charSequence3, tn9Var2, a, xy9Var, jl40.l(chargersFeedbackScreenBannerDto22.e, h.INSTANCE) ? ChargersFeedbackBannerAnalyticsAlias.SUBSCRIPTION : null);
            }
            h2 = (noh) this.L$3;
            ?? r3 = (noh) this.L$2;
            kotlin.b.b(obj);
            h = r3;
            s = obj;
        }
        CharSequence charSequence7 = (CharSequence) s;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = h2;
        this.L$4 = charSequence7;
        this.label = 2;
        k = h.k(this);
        if (k != coroutineSingletons) {
            nohVar = h2;
            charSequence = charSequence7;
            CharSequence charSequence42 = (CharSequence) k;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = charSequence;
            this.L$5 = charSequence42;
            this.label = 3;
            k2 = nohVar.k(this);
            if (k2 != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
