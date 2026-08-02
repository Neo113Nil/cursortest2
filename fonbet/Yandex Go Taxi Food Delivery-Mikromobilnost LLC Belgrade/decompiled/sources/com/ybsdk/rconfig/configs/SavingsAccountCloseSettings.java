package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.nzs;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0003\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/rconfig/configs/SavingsAccountCloseSettings;", "", "", "isV2Enabled", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/ybsdk/rconfig/configs/SavingsAccountCloseSettings;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SavingsAccountCloseSettings {

    @Json(name = "is_v2_enabled")
    private final boolean isV2Enabled;

    public SavingsAccountCloseSettings(boolean z) {
        this.isV2Enabled = z;
    }

    public static /* synthetic */ SavingsAccountCloseSettings copy$default(SavingsAccountCloseSettings savingsAccountCloseSettings, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = savingsAccountCloseSettings.isV2Enabled;
        }
        return savingsAccountCloseSettings.copy(z);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsV2Enabled() {
        return this.isV2Enabled;
    }

    public final SavingsAccountCloseSettings copy(boolean isV2Enabled) {
        return new SavingsAccountCloseSettings(isV2Enabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SavingsAccountCloseSettings) && this.isV2Enabled == ((SavingsAccountCloseSettings) other).isV2Enabled;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isV2Enabled);
    }

    public final boolean isV2Enabled() {
        return this.isV2Enabled;
    }

    public String toString() {
        return nzs.b("SavingsAccountCloseSettings(isV2Enabled=", Extension.C_BRAKE, this.isV2Enabled);
    }
}
