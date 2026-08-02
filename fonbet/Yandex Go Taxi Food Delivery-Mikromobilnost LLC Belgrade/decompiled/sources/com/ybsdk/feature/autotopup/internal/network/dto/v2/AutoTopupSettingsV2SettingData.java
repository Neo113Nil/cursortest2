package com.ybsdk.feature.autotopup.internal.network.dto.v2;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.jl40;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003J9\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0003\u0010\u0007\u001a\u00020\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2SettingData;", "", BackendConfig.Restrictions.ENABLED, "", "amounts", "", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2Money;", "changeSettingBottomSheet", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2ChangeSettingBottomSheet;", "unselectedPaymentMethodAction", "", "<init>", "(ZLjava/util/List;Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2ChangeSettingBottomSheet;Ljava/lang/String;)V", "getEnabled", "()Z", "getAmounts", "()Ljava/util/List;", "getChangeSettingBottomSheet", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2ChangeSettingBottomSheet;", "getUnselectedPaymentMethodAction", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AutoTopupSettingsV2SettingData {
    private final List<AutoTopupSettingsV2Money> amounts;
    private final AutoTopupSettingsV2ChangeSettingBottomSheet changeSettingBottomSheet;
    private final boolean enabled;
    private final String unselectedPaymentMethodAction;

    public AutoTopupSettingsV2SettingData(@Json(name = "enabled") boolean z, @Json(name = "amounts") List<AutoTopupSettingsV2Money> list, @Json(name = "change_setting_bottom_sheet") AutoTopupSettingsV2ChangeSettingBottomSheet autoTopupSettingsV2ChangeSettingBottomSheet, @Json(name = "unselected_payment_method_action") String str) {
        this.enabled = z;
        this.amounts = list;
        this.changeSettingBottomSheet = autoTopupSettingsV2ChangeSettingBottomSheet;
        this.unselectedPaymentMethodAction = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AutoTopupSettingsV2SettingData copy$default(AutoTopupSettingsV2SettingData autoTopupSettingsV2SettingData, boolean z, List list, AutoTopupSettingsV2ChangeSettingBottomSheet autoTopupSettingsV2ChangeSettingBottomSheet, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = autoTopupSettingsV2SettingData.enabled;
        }
        if ((i & 2) != 0) {
            list = autoTopupSettingsV2SettingData.amounts;
        }
        if ((i & 4) != 0) {
            autoTopupSettingsV2ChangeSettingBottomSheet = autoTopupSettingsV2SettingData.changeSettingBottomSheet;
        }
        if ((i & 8) != 0) {
            str = autoTopupSettingsV2SettingData.unselectedPaymentMethodAction;
        }
        return autoTopupSettingsV2SettingData.copy(z, list, autoTopupSettingsV2ChangeSettingBottomSheet, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public final List<AutoTopupSettingsV2Money> component2() {
        return this.amounts;
    }

    /* renamed from: component3, reason: from getter */
    public final AutoTopupSettingsV2ChangeSettingBottomSheet getChangeSettingBottomSheet() {
        return this.changeSettingBottomSheet;
    }

    /* renamed from: component4, reason: from getter */
    public final String getUnselectedPaymentMethodAction() {
        return this.unselectedPaymentMethodAction;
    }

    public final AutoTopupSettingsV2SettingData copy(@Json(name = "enabled") boolean enabled, @Json(name = "amounts") List<AutoTopupSettingsV2Money> amounts, @Json(name = "change_setting_bottom_sheet") AutoTopupSettingsV2ChangeSettingBottomSheet changeSettingBottomSheet, @Json(name = "unselected_payment_method_action") String unselectedPaymentMethodAction) {
        return new AutoTopupSettingsV2SettingData(enabled, amounts, changeSettingBottomSheet, unselectedPaymentMethodAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoTopupSettingsV2SettingData)) {
            return false;
        }
        AutoTopupSettingsV2SettingData autoTopupSettingsV2SettingData = (AutoTopupSettingsV2SettingData) other;
        return this.enabled == autoTopupSettingsV2SettingData.enabled && jl40.l(this.amounts, autoTopupSettingsV2SettingData.amounts) && jl40.l(this.changeSettingBottomSheet, autoTopupSettingsV2SettingData.changeSettingBottomSheet) && jl40.l(this.unselectedPaymentMethodAction, autoTopupSettingsV2SettingData.unselectedPaymentMethodAction);
    }

    public final List<AutoTopupSettingsV2Money> getAmounts() {
        return this.amounts;
    }

    public final AutoTopupSettingsV2ChangeSettingBottomSheet getChangeSettingBottomSheet() {
        return this.changeSettingBottomSheet;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getUnselectedPaymentMethodAction() {
        return this.unselectedPaymentMethodAction;
    }

    public int hashCode() {
        int hashCode = (this.changeSettingBottomSheet.hashCode() + unr0.c(Boolean.hashCode(this.enabled) * 31, 31, this.amounts)) * 31;
        String str = this.unselectedPaymentMethodAction;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "AutoTopupSettingsV2SettingData(enabled=" + this.enabled + ", amounts=" + this.amounts + ", changeSettingBottomSheet=" + this.changeSettingBottomSheet + ", unselectedPaymentMethodAction=" + this.unselectedPaymentMethodAction + Extension.C_BRAKE;
    }

    public /* synthetic */ AutoTopupSettingsV2SettingData(boolean z, List list, AutoTopupSettingsV2ChangeSettingBottomSheet autoTopupSettingsV2ChangeSettingBottomSheet, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, list, autoTopupSettingsV2ChangeSettingBottomSheet, (i & 8) != 0 ? null : str);
    }
}
