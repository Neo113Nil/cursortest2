package com.yandex.go.benefits_center.activation.router;

import com.yandex.go.benefits_center.activation.analytics.AddBenefitAnalytics$BenefitsBannerStatus;
import com.yandex.go.benefits_center.data.model.BenefitsCenterBanner;
import defpackage.am5;
import defpackage.avj0;
import defpackage.b1;
import defpackage.bm5;
import defpackage.cm5;
import defpackage.dm5;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qm5;
import defpackage.rm5;
import defpackage.tse;
import defpackage.w04;
import defpackage.w511;
import defpackage.wls;
import defpackage.xl5;
import defpackage.yl5;
import defpackage.zl5;
import defpackage.zuj0;
import defpackage.zy11;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.benefits_center.activation.router.BenefitActivationRouter$BenefitActivationNavigatorImpl$activate$1", f = "BenefitActivationRouter.kt", l = {69}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class BenefitActivationRouter$BenefitActivationNavigatorImpl$activate$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $code;
    int label;
    final /* synthetic */ dm5 this$0;
    final /* synthetic */ cm5 this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BenefitActivationRouter$BenefitActivationNavigatorImpl$activate$1(dm5 dm5Var, String str, cm5 cm5Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dm5Var;
        this.$code = str;
        this.this$1 = cm5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BenefitActivationRouter$BenefitActivationNavigatorImpl$activate$1(this.this$0, this.$code, this.this$1, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BenefitActivationRouter$BenefitActivationNavigatorImpl$activate$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            com.yandex.go.benefits_center.activation.domain.a aVar = this.this$0.H;
            String str2 = this.$code;
            this.label = 1;
            obj = aVar.a(str2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        am5 am5Var = (am5) obj;
        if (am5Var instanceof zl5) {
            cm5 cm5Var = this.this$1;
            BenefitsCenterBanner benefitsCenterBanner = ((zl5) am5Var).a;
            dm5 dm5Var = cm5Var.b;
            b1 b1Var = dm5Var.G;
            String str3 = cm5Var.a;
            String str4 = benefitsCenterBanner.a;
            BenefitsCenterBanner.Metadata metadata = benefitsCenterBanner.d;
            String str5 = metadata.b;
            String str6 = benefitsCenterBanner.b;
            String str7 = benefitsCenterBanner.c;
            List list = metadata.c;
            String str8 = metadata.d;
            BenefitsCenterBanner.Appearance appearance = benefitsCenterBanner.f;
            int i2 = appearance == null ? -1 : bm5.a[appearance.ordinal()];
            AddBenefitAnalytics$BenefitsBannerStatus addBenefitAnalytics$BenefitsBannerStatus = i2 != 1 ? i2 != 2 ? i2 != 3 ? AddBenefitAnalytics$BenefitsBannerStatus.Normal : AddBenefitAnalytics$BenefitsBannerStatus.Unavailable : AddBenefitAnalytics$BenefitsBannerStatus.Expired : AddBenefitAnalytics$BenefitsBannerStatus.Active;
            String str9 = metadata.e;
            MapBuilder mapBuilder = new MapBuilder();
            mapBuilder.put("id", str4);
            mapBuilder.put("series_id", str5);
            mapBuilder.put("banner_position", 0);
            mapBuilder.put("title", str6);
            mapBuilder.put("subtitle", str7);
            mapBuilder.put("services", list);
            mapBuilder.put("expire_date", str8);
            mapBuilder.put(ACSPConstants.STATUS, addBenefitAnalytics$BenefitsBannerStatus.getEventValue());
            if (str9 != null) {
                mapBuilder.put("promo_source", str9);
            }
            MapBuilder j = mapBuilder.j();
            b1Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("open_reason", str3);
            hashMap.put("banner", j);
            b1Var.a.a("AddBenefit.Success", hashMap, 1, new HashMap());
            dm5Var.r(new w04(11, dm5Var, benefitsCenterBanner));
        } else if (am5Var instanceof yl5) {
            cm5 cm5Var2 = this.this$1;
            String str10 = this.$code;
            dm5 dm5Var2 = cm5Var2.b;
            rm5 rm5Var = dm5Var2.K;
            String str11 = ((yl5) am5Var).a;
            if (str11 == null) {
                str11 = ((avj0) ((zuj0) rm5Var.d)).h(kyh0.benefits_center_promo_default_error);
            }
            String str12 = str11;
            r0 r0Var = (r0) rm5Var.b;
            while (true) {
                Object value2 = r0Var.getValue();
                str = str12;
                if (r0Var.k(value2, qm5.a((qm5) value2, str12, true, null, str10, false, 10))) {
                    break;
                }
                str12 = str;
            }
            dm5Var2.G.c(cm5Var2.a, str);
        } else {
            if (!(am5Var instanceof xl5)) {
                w511.b();
                return null;
            }
            cm5 cm5Var3 = this.this$1;
            dm5 dm5Var3 = cm5Var3.b;
            rm5 rm5Var2 = dm5Var3.K;
            avj0 avj0Var = (avj0) ((zuj0) rm5Var2.d);
            String h = avj0Var.h(kyh0.strongbox_data_load_failed_notification_title);
            r0 r0Var2 = (r0) rm5Var2.b;
            do {
                value = r0Var2.getValue();
            } while (!r0Var2.k(value, qm5.a((qm5) value, h, true, avj0Var.h(kyh0.delivery_photocomment_error_dialog_retry_button_text), null, false, 18)));
            dm5Var3.G.c(cm5Var3.a, h);
        }
        return zy11.a;
    }
}
