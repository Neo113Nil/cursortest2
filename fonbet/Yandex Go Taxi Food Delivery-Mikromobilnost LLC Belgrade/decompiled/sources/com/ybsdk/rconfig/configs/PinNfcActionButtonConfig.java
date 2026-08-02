package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0003\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/rconfig/configs/PinNfcActionButtonConfig;", "", "", "isEnabled", "Lcom/ybsdk/rconfig/configs/PinNfcActionButton;", "button", "<init>", "(ZLcom/ybsdk/rconfig/configs/PinNfcActionButton;)V", "component1", "()Z", "component2", "()Lcom/ybsdk/rconfig/configs/PinNfcActionButton;", "copy", "(ZLcom/ybsdk/rconfig/configs/PinNfcActionButton;)Lcom/ybsdk/rconfig/configs/PinNfcActionButtonConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Lcom/ybsdk/rconfig/configs/PinNfcActionButton;", "getButton", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class PinNfcActionButtonConfig {

    @Json(name = "button")
    private final PinNfcActionButton button;

    @Json(name = "is_enabled")
    private final boolean isEnabled;

    public PinNfcActionButtonConfig(boolean z, PinNfcActionButton pinNfcActionButton) {
        this.isEnabled = z;
        this.button = pinNfcActionButton;
    }

    public static /* synthetic */ PinNfcActionButtonConfig copy$default(PinNfcActionButtonConfig pinNfcActionButtonConfig, boolean z, PinNfcActionButton pinNfcActionButton, int i, Object obj) {
        if ((i & 1) != 0) {
            z = pinNfcActionButtonConfig.isEnabled;
        }
        if ((i & 2) != 0) {
            pinNfcActionButton = pinNfcActionButtonConfig.button;
        }
        return pinNfcActionButtonConfig.copy(z, pinNfcActionButton);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final PinNfcActionButton getButton() {
        return this.button;
    }

    public final PinNfcActionButtonConfig copy(boolean isEnabled, PinNfcActionButton button) {
        return new PinNfcActionButtonConfig(isEnabled, button);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PinNfcActionButtonConfig)) {
            return false;
        }
        PinNfcActionButtonConfig pinNfcActionButtonConfig = (PinNfcActionButtonConfig) other;
        return this.isEnabled == pinNfcActionButtonConfig.isEnabled && jl40.l(this.button, pinNfcActionButtonConfig.button);
    }

    public final PinNfcActionButton getButton() {
        return this.button;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.isEnabled) * 31;
        PinNfcActionButton pinNfcActionButton = this.button;
        return hashCode + (pinNfcActionButton == null ? 0 : pinNfcActionButton.hashCode());
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public String toString() {
        return "PinNfcActionButtonConfig(isEnabled=" + this.isEnabled + ", button=" + this.button + Extension.C_BRAKE;
    }
}
