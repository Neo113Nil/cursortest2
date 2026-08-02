package com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates;

import com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.CompositeSubscriptionInfo;
import com.yandex.plus.home.repository.api.model.webconfig.SubscriptionConfiguration;
import defpackage.bms;
import defpackage.d27;
import defpackage.e27;
import defpackage.f27;
import defpackage.z250;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class BaseButtonSectionDelegate$buttonSectionStateFlow$2$2 extends AdaptedFunctionReference implements bms {
    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        CompositeSubscriptionInfo compositeSubscriptionInfo = (CompositeSubscriptionInfo) obj3;
        z250 z250Var = ((c) this.receiver).b;
        SubscriptionConfiguration config = compositeSubscriptionInfo.getConfig();
        if (config == null || !booleanValue || !booleanValue2) {
            config = null;
        }
        if (config != null) {
            SubscriptionConfiguration.Subscription subscription = config.getSubscription();
            SubscriptionConfiguration.Subscription.AcquisitionParams acquisitionParams = subscription.getAcquisitionParams();
            if (subscription.getWidgetType() == SubscriptionConfiguration.Subscription.WidgetType.ACQUISITION_PLATFORM && acquisitionParams != null) {
                String page = acquisitionParams.getPage();
                String str = (String) kotlin.collections.a.Q(acquisitionParams.getPlaces());
                if (str == null) {
                    str = "";
                }
                return new d27(compositeSubscriptionInfo, page, str, acquisitionParams.getRestrictions(), subscription.isSilentPaymentEnabled());
            }
            if (subscription.getButtonType() == SubscriptionConfiguration.Subscription.ButtonType.NATIVE) {
                return new f27(compositeSubscriptionInfo, config, z250Var.a(compositeSubscriptionInfo, config));
            }
            if (subscription.getWidgetType() == SubscriptionConfiguration.Subscription.WidgetType.HOST) {
                return new e27(compositeSubscriptionInfo, config, z250Var.a(compositeSubscriptionInfo, config));
            }
        }
        return null;
    }
}
