package com.yandex.go.scooters.promotions.data.mapper;

import com.yandex.go.scooters.promotions.api.domain.model.ScootersPromotions$TopBannerCommunication$TopBannerCommunicationPriority;
import com.yandex.go.scooters.promotions.api.domain.model.ScootersPromotions$TopBannerCommunication$TopBannerCommunicationStyle;
import com.yandex.go.scooters.promotions.data.model.ScootersPromoblockResponse;
import defpackage.coo0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.xno0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lxno0;", "<anonymous>", "(Ltse;)Lxno0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.promotions.data.mapper.ScootersPromotionsMapper$mapTopBannerCommunication$2", f = "ScootersPromotionsMapper.kt", l = {60, 61}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPromotionsMapper$mapTopBannerCommunication$2 extends SuspendLambda implements wls {
    final /* synthetic */ ScootersPromoblockResponse.ScootersTopBanner $topBanner;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPromotionsMapper$mapTopBannerCommunication$2(a aVar, ScootersPromoblockResponse.ScootersTopBanner scootersTopBanner, Continuation continuation) {
        super(2, continuation);
        this.$topBanner = scootersTopBanner;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersPromotionsMapper$mapTopBannerCommunication$2 scootersPromotionsMapper$mapTopBannerCommunication$2 = new ScootersPromotionsMapper$mapTopBannerCommunication$2(this.this$0, this.$topBanner, continuation);
        scootersPromotionsMapper$mapTopBannerCommunication$2.L$0 = obj;
        return scootersPromotionsMapper$mapTopBannerCommunication$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPromotionsMapper$mapTopBannerCommunication$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a0  */
    /* JADX WARN: Type inference failed for: r3v8, types: [noh] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object s;
        qoh qohVar;
        String str;
        Object k;
        String str2;
        CharSequence charSequence;
        int i;
        ScootersPromotions$TopBannerCommunication$TopBannerCommunicationStyle scootersPromotions$TopBannerCommunication$TopBannerCommunicationStyle;
        ScootersPromoblockResponse.ScootersTopBanner.TopBannerCommunication.TopBannerCommunicationPriority topBannerCommunicationPriority;
        ScootersPromotions$TopBannerCommunication$TopBannerCommunicationPriority scootersPromotions$TopBannerCommunication$TopBannerCommunicationPriority;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        ScootersPromotions$TopBannerCommunication$TopBannerCommunicationPriority scootersPromotions$TopBannerCommunication$TopBannerCommunicationPriority2 = null;
        if (i2 == 0) {
            b.b(obj);
            qoh h = tje.h(tseVar, null, null, new ScootersPromotionsMapper$mapTopBannerCommunication$2$titleAsync$1(this.this$0, this.$topBanner, null), 3);
            qoh h2 = tje.h(tseVar, null, null, new ScootersPromotionsMapper$mapTopBannerCommunication$2$subtitleAsync$1(this.this$0, this.$topBanner, null), 3);
            String str3 = this.$topBanner.a;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h2;
            this.L$3 = str3;
            this.label = 1;
            s = h.s(this);
            if (s != coroutineSingletons) {
                qohVar = h2;
                str = str3;
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            CharSequence charSequence2 = (CharSequence) this.L$4;
            String str4 = (String) this.L$3;
            b.b(obj);
            k = obj;
            charSequence = charSequence2;
            str2 = str4;
            CharSequence charSequence3 = (CharSequence) k;
            ScootersPromoblockResponse.ScootersTopBanner.TopBannerCommunication topBannerCommunication = this.$topBanner.b;
            String str5 = topBannerCommunication.c;
            ScootersPromoblockResponse.ScootersTopBanner.TopBannerCommunication.TopBannerCommunicationIcon topBannerCommunicationIcon = topBannerCommunication.d;
            String str6 = topBannerCommunicationIcon == null ? topBannerCommunicationIcon.a : null;
            a aVar = this.this$0;
            ScootersPromoblockResponse.ScootersTopBanner.TopBannerCommunication.TopBannerCommunicationStyle topBannerCommunicationStyle = topBannerCommunication.e;
            aVar.getClass();
            i = coo0.a[topBannerCommunicationStyle.ordinal()];
            if (i != 1) {
                scootersPromotions$TopBannerCommunication$TopBannerCommunicationStyle = ScootersPromotions$TopBannerCommunication$TopBannerCommunicationStyle.INFO;
            } else if (i == 2) {
                scootersPromotions$TopBannerCommunication$TopBannerCommunicationStyle = ScootersPromotions$TopBannerCommunication$TopBannerCommunicationStyle.WARNING;
            } else {
                if (i != 3) {
                    w511.b();
                    return null;
                }
                scootersPromotions$TopBannerCommunication$TopBannerCommunicationStyle = ScootersPromotions$TopBannerCommunication$TopBannerCommunicationStyle.ERROR;
            }
            ScootersPromotions$TopBannerCommunication$TopBannerCommunicationStyle scootersPromotions$TopBannerCommunication$TopBannerCommunicationStyle2 = scootersPromotions$TopBannerCommunication$TopBannerCommunicationStyle;
            ScootersPromoblockResponse.ScootersTopBanner.TopBannerCommunication topBannerCommunication2 = this.$topBanner.b;
            Boolean bool = topBannerCommunication2.f;
            Integer num = topBannerCommunication2.g;
            topBannerCommunicationPriority = topBannerCommunication2.h;
            if (topBannerCommunicationPriority != null) {
                this.this$0.getClass();
                int i3 = coo0.b[topBannerCommunicationPriority.ordinal()];
                if (i3 == 1) {
                    scootersPromotions$TopBannerCommunication$TopBannerCommunicationPriority = ScootersPromotions$TopBannerCommunication$TopBannerCommunicationPriority.HIGH;
                } else if (i3 == 2) {
                    scootersPromotions$TopBannerCommunication$TopBannerCommunicationPriority = ScootersPromotions$TopBannerCommunication$TopBannerCommunicationPriority.DEFAULT;
                } else {
                    if (i3 != 3) {
                        w511.b();
                        return null;
                    }
                    scootersPromotions$TopBannerCommunication$TopBannerCommunicationPriority = ScootersPromotions$TopBannerCommunication$TopBannerCommunicationPriority.LOW;
                }
                scootersPromotions$TopBannerCommunication$TopBannerCommunicationPriority2 = scootersPromotions$TopBannerCommunication$TopBannerCommunicationPriority;
            }
            return new xno0(str2, charSequence, charSequence3, str5, str6, scootersPromotions$TopBannerCommunication$TopBannerCommunicationStyle2, bool, num, scootersPromotions$TopBannerCommunication$TopBannerCommunicationPriority2);
        }
        str = (String) this.L$3;
        ?? r3 = (noh) this.L$2;
        b.b(obj);
        qohVar = r3;
        s = obj;
        CharSequence charSequence4 = (CharSequence) s;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = str;
        this.L$4 = charSequence4;
        this.label = 2;
        k = qohVar.k(this);
        if (k != coroutineSingletons) {
            str2 = str;
            charSequence = charSequence4;
            CharSequence charSequence32 = (CharSequence) k;
            ScootersPromoblockResponse.ScootersTopBanner.TopBannerCommunication topBannerCommunication3 = this.$topBanner.b;
            String str52 = topBannerCommunication3.c;
            ScootersPromoblockResponse.ScootersTopBanner.TopBannerCommunication.TopBannerCommunicationIcon topBannerCommunicationIcon2 = topBannerCommunication3.d;
            if (topBannerCommunicationIcon2 == null) {
            }
            a aVar2 = this.this$0;
            ScootersPromoblockResponse.ScootersTopBanner.TopBannerCommunication.TopBannerCommunicationStyle topBannerCommunicationStyle2 = topBannerCommunication3.e;
            aVar2.getClass();
            i = coo0.a[topBannerCommunicationStyle2.ordinal()];
            if (i != 1) {
            }
            ScootersPromotions$TopBannerCommunication$TopBannerCommunicationStyle scootersPromotions$TopBannerCommunication$TopBannerCommunicationStyle22 = scootersPromotions$TopBannerCommunication$TopBannerCommunicationStyle;
            ScootersPromoblockResponse.ScootersTopBanner.TopBannerCommunication topBannerCommunication22 = this.$topBanner.b;
            Boolean bool2 = topBannerCommunication22.f;
            Integer num2 = topBannerCommunication22.g;
            topBannerCommunicationPriority = topBannerCommunication22.h;
            if (topBannerCommunicationPriority != null) {
            }
            return new xno0(str2, charSequence, charSequence32, str52, str6, scootersPromotions$TopBannerCommunication$TopBannerCommunicationStyle22, bool2, num2, scootersPromotions$TopBannerCommunication$TopBannerCommunicationPriority2);
        }
        return coroutineSingletons;
    }
}
