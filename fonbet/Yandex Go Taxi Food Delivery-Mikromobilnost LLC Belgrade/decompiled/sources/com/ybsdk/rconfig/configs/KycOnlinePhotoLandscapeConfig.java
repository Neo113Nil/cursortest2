package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.jl40;
import defpackage.smw0;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\nJ:\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001e\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001f\u0010\n¨\u0006 "}, d2 = {"Lcom/ybsdk/rconfig/configs/KycOnlinePhotoLandscapeConfig;", "", "", BackendConfig.Restrictions.ENABLED, "selfieFrameEnabled", "doubleFrameEnabled", "changeAnimationEnabled", "<init>", "(ZLjava/lang/Boolean;ZZ)V", "component1", "()Z", "component2", "()Ljava/lang/Boolean;", "component3", "component4", "copy", "(ZLjava/lang/Boolean;ZZ)Lcom/ybsdk/rconfig/configs/KycOnlinePhotoLandscapeConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getEnabled", "Ljava/lang/Boolean;", "getSelfieFrameEnabled", "getDoubleFrameEnabled", "getChangeAnimationEnabled", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class KycOnlinePhotoLandscapeConfig {

    @Json(name = "change_animation_enabled")
    private final boolean changeAnimationEnabled;

    @Json(name = "double_frame_enabled")
    private final boolean doubleFrameEnabled;

    @Json(name = BackendConfig.Restrictions.ENABLED)
    private final boolean enabled;

    @Json(name = "selfie_frame_enabled")
    private final Boolean selfieFrameEnabled;

    public KycOnlinePhotoLandscapeConfig(boolean z, Boolean bool, boolean z2, boolean z3) {
        this.enabled = z;
        this.selfieFrameEnabled = bool;
        this.doubleFrameEnabled = z2;
        this.changeAnimationEnabled = z3;
    }

    public static /* synthetic */ KycOnlinePhotoLandscapeConfig copy$default(KycOnlinePhotoLandscapeConfig kycOnlinePhotoLandscapeConfig, boolean z, Boolean bool, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = kycOnlinePhotoLandscapeConfig.enabled;
        }
        if ((i & 2) != 0) {
            bool = kycOnlinePhotoLandscapeConfig.selfieFrameEnabled;
        }
        if ((i & 4) != 0) {
            z2 = kycOnlinePhotoLandscapeConfig.doubleFrameEnabled;
        }
        if ((i & 8) != 0) {
            z3 = kycOnlinePhotoLandscapeConfig.changeAnimationEnabled;
        }
        return kycOnlinePhotoLandscapeConfig.copy(z, bool, z2, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getSelfieFrameEnabled() {
        return this.selfieFrameEnabled;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getDoubleFrameEnabled() {
        return this.doubleFrameEnabled;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getChangeAnimationEnabled() {
        return this.changeAnimationEnabled;
    }

    public final KycOnlinePhotoLandscapeConfig copy(boolean enabled, Boolean selfieFrameEnabled, boolean doubleFrameEnabled, boolean changeAnimationEnabled) {
        return new KycOnlinePhotoLandscapeConfig(enabled, selfieFrameEnabled, doubleFrameEnabled, changeAnimationEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KycOnlinePhotoLandscapeConfig)) {
            return false;
        }
        KycOnlinePhotoLandscapeConfig kycOnlinePhotoLandscapeConfig = (KycOnlinePhotoLandscapeConfig) other;
        return this.enabled == kycOnlinePhotoLandscapeConfig.enabled && jl40.l(this.selfieFrameEnabled, kycOnlinePhotoLandscapeConfig.selfieFrameEnabled) && this.doubleFrameEnabled == kycOnlinePhotoLandscapeConfig.doubleFrameEnabled && this.changeAnimationEnabled == kycOnlinePhotoLandscapeConfig.changeAnimationEnabled;
    }

    public final boolean getChangeAnimationEnabled() {
        return this.changeAnimationEnabled;
    }

    public final boolean getDoubleFrameEnabled() {
        return this.doubleFrameEnabled;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final Boolean getSelfieFrameEnabled() {
        return this.selfieFrameEnabled;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.enabled) * 31;
        Boolean bool = this.selfieFrameEnabled;
        return Boolean.hashCode(this.changeAnimationEnabled) + unr0.e((hashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.doubleFrameEnabled);
    }

    public String toString() {
        boolean z = this.enabled;
        Boolean bool = this.selfieFrameEnabled;
        boolean z2 = this.doubleFrameEnabled;
        boolean z3 = this.changeAnimationEnabled;
        StringBuilder sb = new StringBuilder("KycOnlinePhotoLandscapeConfig(enabled=");
        sb.append(z);
        sb.append(", selfieFrameEnabled=");
        sb.append(bool);
        sb.append(", doubleFrameEnabled=");
        return smw0.k(", changeAnimationEnabled=", Extension.C_BRAKE, sb, z2, z3);
    }
}
