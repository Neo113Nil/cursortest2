package com.yandex.plus.home.feature.webviews.internal.purchase.subscription.common;

import com.yandex.plus.home.repository.api.model.webconfig.SubscriptionConfiguration;
import defpackage.jl40;
import defpackage.unr0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\r\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0002\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/yandex/plus/home/feature/webviews/internal/purchase/subscription/common/SubscriptionProductException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", Constants.KEY_MESSAGE, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "", "cause", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "InvalidPaymentMethod", "NoOffersByVendor", "Lcom/yandex/plus/home/feature/webviews/internal/purchase/subscription/common/SubscriptionProductException$InvalidPaymentMethod;", "Lcom/yandex/plus/home/feature/webviews/internal/purchase/subscription/common/SubscriptionProductException$NoOffersByVendor;", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class SubscriptionProductException extends Exception {
    private final Throwable cause;
    private final String message;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/home/feature/webviews/internal/purchase/subscription/common/SubscriptionProductException$InvalidPaymentMethod;", "Lcom/yandex/plus/home/feature/webviews/internal/purchase/subscription/common/SubscriptionProductException;", "Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$Subscription$PaymentMethod;", "paymentMethod", "Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$Subscription$PaymentMethod;", "getPaymentMethod", "()Lcom/yandex/plus/home/repository/api/model/webconfig/SubscriptionConfiguration$Subscription$PaymentMethod;", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InvalidPaymentMethod extends SubscriptionProductException {
        private final SubscriptionConfiguration.Subscription.PaymentMethod paymentMethod;

        public InvalidPaymentMethod(SubscriptionConfiguration.Subscription.PaymentMethod paymentMethod) {
            this.paymentMethod = paymentMethod;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InvalidPaymentMethod) && this.paymentMethod == ((InvalidPaymentMethod) obj).paymentMethod;
        }

        public final int hashCode() {
            return this.paymentMethod.hashCode();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "InvalidPaymentMethod(paymentMethod=" + this.paymentMethod + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/plus/home/feature/webviews/internal/purchase/subscription/common/SubscriptionProductException$NoOffersByVendor;", "Lcom/yandex/plus/home/feature/webviews/internal/purchase/subscription/common/SubscriptionProductException;", "", "vendorType", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "", "offersIds", "Ljava/util/List;", "a", "()Ljava/util/List;", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NoOffersByVendor extends SubscriptionProductException {
        private final List<String> offersIds;
        private final String vendorType;

        public NoOffersByVendor(String str, ArrayList arrayList) {
            this.vendorType = str;
            this.offersIds = arrayList;
        }

        /* renamed from: a, reason: from getter */
        public final List getOffersIds() {
            return this.offersIds;
        }

        /* renamed from: b, reason: from getter */
        public final String getVendorType() {
            return this.vendorType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NoOffersByVendor)) {
                return false;
            }
            NoOffersByVendor noOffersByVendor = (NoOffersByVendor) obj;
            return jl40.l(this.vendorType, noOffersByVendor.vendorType) && jl40.l(this.offersIds, noOffersByVendor.offersIds);
        }

        public final int hashCode() {
            return this.offersIds.hashCode() + (this.vendorType.hashCode() * 31);
        }

        @Override // java.lang.Throwable
        public final String toString() {
            StringBuilder sb = new StringBuilder("NoOffersByVendor(vendorType=");
            sb.append(this.vendorType);
            sb.append(", offersIds=");
            return unr0.t(sb, this.offersIds, ')');
        }
    }

    public SubscriptionProductException() {
        super(null, null);
        this.message = null;
        this.cause = null;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }
}
