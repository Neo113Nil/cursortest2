package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/rconfig/configs/SpoilersOnboarding;", "", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "", "image", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;)V", "component1", "()Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "copy", "(Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;)Lcom/ybsdk/rconfig/configs/SpoilersOnboarding;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "getImage", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class SpoilersOnboarding {

    @Json(name = "image")
    private final ThemedParameter<String> image;

    public SpoilersOnboarding(ThemedParameter<String> themedParameter) {
        this.image = themedParameter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SpoilersOnboarding copy$default(SpoilersOnboarding spoilersOnboarding, ThemedParameter themedParameter, int i, Object obj) {
        if ((i & 1) != 0) {
            themedParameter = spoilersOnboarding.image;
        }
        return spoilersOnboarding.copy(themedParameter);
    }

    public final ThemedParameter<String> component1() {
        return this.image;
    }

    public final SpoilersOnboarding copy(ThemedParameter<String> image) {
        return new SpoilersOnboarding(image);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SpoilersOnboarding) && jl40.l(this.image, ((SpoilersOnboarding) other).image);
    }

    public final ThemedParameter<String> getImage() {
        return this.image;
    }

    public int hashCode() {
        return this.image.hashCode();
    }

    public String toString() {
        return "SpoilersOnboarding(image=" + this.image + Extension.C_BRAKE;
    }
}
