package com.yandex.plus.pay.adapter.api;

import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028&X§\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"com/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$Price", "Landroid/os/Parcelable;", "Ljava/math/BigDecimal;", "getAmount", "()Ljava/math/BigDecimal;", "getAmount$annotations", "()V", "amount", "", "getCurrency", "()Ljava/lang/String;", "currency", "plus-home-pay-sdk-adapter-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface PlusPaySdkAdapter$Price extends Parcelable {
    static /* synthetic */ void getAmount$annotations() {
    }

    BigDecimal getAmount();

    String getCurrency();
}
