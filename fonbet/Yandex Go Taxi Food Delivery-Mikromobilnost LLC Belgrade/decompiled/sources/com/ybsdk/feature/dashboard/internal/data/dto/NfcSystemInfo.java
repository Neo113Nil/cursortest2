package com.ybsdk.feature.dashboard.internal.data.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.nnm;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.x4e;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J;\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/data/dto/NfcSystemInfo;", "", "isNfcAdapterEnabled", "", "isBiometryEnabled", "isDefaultPaymentApp", "isDrawOverlayEnabled", "isNfcShortcutAdded", "<init>", "(ZZZZZ)V", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class NfcSystemInfo {
    private final boolean isBiometryEnabled;
    private final boolean isDefaultPaymentApp;
    private final boolean isDrawOverlayEnabled;
    private final boolean isNfcAdapterEnabled;
    private final boolean isNfcShortcutAdded;

    public NfcSystemInfo(@Json(name = "is_nfc_adapter_enabled") boolean z, @Json(name = "is_biometry_enabled") boolean z2, @Json(name = "is_default_payment_app") boolean z3, @Json(name = "is_draw_overlay_enabled") boolean z4, @Json(name = "is_nfc_shortcut_added") boolean z5) {
        this.isNfcAdapterEnabled = z;
        this.isBiometryEnabled = z2;
        this.isDefaultPaymentApp = z3;
        this.isDrawOverlayEnabled = z4;
        this.isNfcShortcutAdded = z5;
    }

    public static /* synthetic */ NfcSystemInfo copy$default(NfcSystemInfo nfcSystemInfo, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, Object obj) {
        if ((i & 1) != 0) {
            z = nfcSystemInfo.isNfcAdapterEnabled;
        }
        if ((i & 2) != 0) {
            z2 = nfcSystemInfo.isBiometryEnabled;
        }
        if ((i & 4) != 0) {
            z3 = nfcSystemInfo.isDefaultPaymentApp;
        }
        if ((i & 8) != 0) {
            z4 = nfcSystemInfo.isDrawOverlayEnabled;
        }
        if ((i & 16) != 0) {
            z5 = nfcSystemInfo.isNfcShortcutAdded;
        }
        boolean z6 = z5;
        boolean z7 = z3;
        return nfcSystemInfo.copy(z, z2, z7, z4, z6);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsNfcAdapterEnabled() {
        return this.isNfcAdapterEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsBiometryEnabled() {
        return this.isBiometryEnabled;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsDefaultPaymentApp() {
        return this.isDefaultPaymentApp;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsDrawOverlayEnabled() {
        return this.isDrawOverlayEnabled;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsNfcShortcutAdded() {
        return this.isNfcShortcutAdded;
    }

    public final NfcSystemInfo copy(@Json(name = "is_nfc_adapter_enabled") boolean isNfcAdapterEnabled, @Json(name = "is_biometry_enabled") boolean isBiometryEnabled, @Json(name = "is_default_payment_app") boolean isDefaultPaymentApp, @Json(name = "is_draw_overlay_enabled") boolean isDrawOverlayEnabled, @Json(name = "is_nfc_shortcut_added") boolean isNfcShortcutAdded) {
        return new NfcSystemInfo(isNfcAdapterEnabled, isBiometryEnabled, isDefaultPaymentApp, isDrawOverlayEnabled, isNfcShortcutAdded);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NfcSystemInfo)) {
            return false;
        }
        NfcSystemInfo nfcSystemInfo = (NfcSystemInfo) other;
        return this.isNfcAdapterEnabled == nfcSystemInfo.isNfcAdapterEnabled && this.isBiometryEnabled == nfcSystemInfo.isBiometryEnabled && this.isDefaultPaymentApp == nfcSystemInfo.isDefaultPaymentApp && this.isDrawOverlayEnabled == nfcSystemInfo.isDrawOverlayEnabled && this.isNfcShortcutAdded == nfcSystemInfo.isNfcShortcutAdded;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isNfcShortcutAdded) + unr0.e(unr0.e(unr0.e(Boolean.hashCode(this.isNfcAdapterEnabled) * 31, 31, this.isBiometryEnabled), 31, this.isDefaultPaymentApp), 31, this.isDrawOverlayEnabled);
    }

    public final boolean isBiometryEnabled() {
        return this.isBiometryEnabled;
    }

    public final boolean isDefaultPaymentApp() {
        return this.isDefaultPaymentApp;
    }

    public final boolean isDrawOverlayEnabled() {
        return this.isDrawOverlayEnabled;
    }

    public final boolean isNfcAdapterEnabled() {
        return this.isNfcAdapterEnabled;
    }

    public final boolean isNfcShortcutAdded() {
        return this.isNfcShortcutAdded;
    }

    public String toString() {
        boolean z = this.isNfcAdapterEnabled;
        boolean z2 = this.isBiometryEnabled;
        boolean z3 = this.isDefaultPaymentApp;
        boolean z4 = this.isDrawOverlayEnabled;
        boolean z5 = this.isNfcShortcutAdded;
        StringBuilder u = qv10.u("NfcSystemInfo(isNfcAdapterEnabled=", ", isBiometryEnabled=", ", isDefaultPaymentApp=", z, z2);
        nnm.v(", isDrawOverlayEnabled=", ", isNfcShortcutAdded=", u, z3, z4);
        return x4e.i(u, z5, Extension.C_BRAKE);
    }
}
