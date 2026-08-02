package com.yandex.xplat.payment.sdk;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.yandex.xplat.common.YSError;
import defpackage.q4g;
import kotlin.Metadata;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/xplat/payment/sdk/ExternalConvertibleError;", "Lcom/yandex/xplat/common/YSError;", "Lcom/yandex/xplat/payment/sdk/ExternalErrorKind;", "kind", "Lcom/yandex/xplat/payment/sdk/ExternalErrorKind;", "c", "()Lcom/yandex/xplat/payment/sdk/ExternalErrorKind;", "Lcom/yandex/xplat/payment/sdk/ExternalErrorTrigger;", "trigger", "Lcom/yandex/xplat/payment/sdk/ExternalErrorTrigger;", "g", "()Lcom/yandex/xplat/payment/sdk/ExternalErrorTrigger;", "", AuthSdkActivity.RESPONSE_TYPE_CODE, "Ljava/lang/Integer;", "b", "()Ljava/lang/Integer;", "", ACSPConstants.STATUS, "Ljava/lang/String;", "f", "()Ljava/lang/String;", "xplat-payment-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public class ExternalConvertibleError extends YSError {
    private final Integer code;
    private final ExternalErrorKind kind;
    private final String status;
    private final ExternalErrorTrigger trigger;

    public ExternalConvertibleError(ExternalErrorKind externalErrorKind, ExternalErrorTrigger externalErrorTrigger, Integer num, String str, String str2) {
        super(str2, null);
        this.kind = externalErrorKind;
        this.trigger = externalErrorTrigger;
        this.code = num;
        this.status = str;
    }

    public q4g a() {
        return new q4g(this.kind, this.trigger, this.code, this.status, getMessage(), 18);
    }

    /* renamed from: b, reason: from getter */
    public final Integer getCode() {
        return this.code;
    }

    /* renamed from: c, reason: from getter */
    public final ExternalErrorKind getKind() {
        return this.kind;
    }

    /* renamed from: f, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* renamed from: g, reason: from getter */
    public final ExternalErrorTrigger getTrigger() {
        return this.trigger;
    }
}
