package com.yandex.xplat.payment.sdk;

import android.os.Parcelable;
import defpackage.gfa0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/yandex/xplat/payment/sdk/PaymentOption;", "Landroid/os/Parcelable;", "Lcom/yandex/xplat/common/Parcelable;", "", "getId", "()Ljava/lang/String;", "T", "Lgfa0;", "visitor", "accept", "(Lgfa0;)Ljava/lang/Object;", "xplat-payment-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface PaymentOption extends Parcelable {
    <T> T accept(gfa0 visitor);

    String getId();
}
