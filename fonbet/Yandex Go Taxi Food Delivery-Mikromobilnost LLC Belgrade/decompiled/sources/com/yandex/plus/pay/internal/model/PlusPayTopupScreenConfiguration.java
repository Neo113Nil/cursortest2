package com.yandex.plus.pay.internal.model;

import com.yandex.plus.core.data.common.PlusThemedUrl;
import defpackage.jl40;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayTopupScreenConfiguration;", "", "actionScenario", "", "widgetUrl", "Lcom/yandex/plus/core/data/common/PlusThemedUrl;", "timeoutParams", "Lcom/yandex/plus/pay/internal/model/PlusPayWebPaymentWidgetTimeoutParams;", "<init>", "(Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedUrl;Lcom/yandex/plus/pay/internal/model/PlusPayWebPaymentWidgetTimeoutParams;)V", "getActionScenario", "()Ljava/lang/String;", "getWidgetUrl", "()Lcom/yandex/plus/core/data/common/PlusThemedUrl;", "getTimeoutParams", "()Lcom/yandex/plus/pay/internal/model/PlusPayWebPaymentWidgetTimeoutParams;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PlusPayTopupScreenConfiguration {
    private final String actionScenario;
    private final PlusPayWebPaymentWidgetTimeoutParams timeoutParams;
    private final PlusThemedUrl widgetUrl;

    public PlusPayTopupScreenConfiguration(String str, PlusThemedUrl plusThemedUrl, PlusPayWebPaymentWidgetTimeoutParams plusPayWebPaymentWidgetTimeoutParams) {
        this.actionScenario = str;
        this.widgetUrl = plusThemedUrl;
        this.timeoutParams = plusPayWebPaymentWidgetTimeoutParams;
    }

    public static /* synthetic */ PlusPayTopupScreenConfiguration copy$default(PlusPayTopupScreenConfiguration plusPayTopupScreenConfiguration, String str, PlusThemedUrl plusThemedUrl, PlusPayWebPaymentWidgetTimeoutParams plusPayWebPaymentWidgetTimeoutParams, int i, Object obj) {
        if ((i & 1) != 0) {
            str = plusPayTopupScreenConfiguration.actionScenario;
        }
        if ((i & 2) != 0) {
            plusThemedUrl = plusPayTopupScreenConfiguration.widgetUrl;
        }
        if ((i & 4) != 0) {
            plusPayWebPaymentWidgetTimeoutParams = plusPayTopupScreenConfiguration.timeoutParams;
        }
        return plusPayTopupScreenConfiguration.copy(str, plusThemedUrl, plusPayWebPaymentWidgetTimeoutParams);
    }

    /* renamed from: component1, reason: from getter */
    public final String getActionScenario() {
        return this.actionScenario;
    }

    /* renamed from: component2, reason: from getter */
    public final PlusThemedUrl getWidgetUrl() {
        return this.widgetUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final PlusPayWebPaymentWidgetTimeoutParams getTimeoutParams() {
        return this.timeoutParams;
    }

    public final PlusPayTopupScreenConfiguration copy(String actionScenario, PlusThemedUrl widgetUrl, PlusPayWebPaymentWidgetTimeoutParams timeoutParams) {
        return new PlusPayTopupScreenConfiguration(actionScenario, widgetUrl, timeoutParams);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlusPayTopupScreenConfiguration)) {
            return false;
        }
        PlusPayTopupScreenConfiguration plusPayTopupScreenConfiguration = (PlusPayTopupScreenConfiguration) other;
        return jl40.l(this.actionScenario, plusPayTopupScreenConfiguration.actionScenario) && jl40.l(this.widgetUrl, plusPayTopupScreenConfiguration.widgetUrl) && jl40.l(this.timeoutParams, plusPayTopupScreenConfiguration.timeoutParams);
    }

    public final String getActionScenario() {
        return this.actionScenario;
    }

    public final PlusPayWebPaymentWidgetTimeoutParams getTimeoutParams() {
        return this.timeoutParams;
    }

    public final PlusThemedUrl getWidgetUrl() {
        return this.widgetUrl;
    }

    public int hashCode() {
        int hashCode = this.actionScenario.hashCode() * 31;
        PlusThemedUrl plusThemedUrl = this.widgetUrl;
        return this.timeoutParams.hashCode() + ((hashCode + (plusThemedUrl == null ? 0 : plusThemedUrl.hashCode())) * 31);
    }

    public String toString() {
        return "PlusPayTopupScreenConfiguration(actionScenario=" + this.actionScenario + ", widgetUrl=" + this.widgetUrl + ", timeoutParams=" + this.timeoutParams + ')';
    }
}
