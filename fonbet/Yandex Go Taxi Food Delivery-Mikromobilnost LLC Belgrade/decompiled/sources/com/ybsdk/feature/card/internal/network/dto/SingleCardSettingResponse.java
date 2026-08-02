package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import com.ybsdk.feature.settings.api.data.SettingDto;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/SingleCardSettingResponse;", "", "image", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "", "setting", "Lcom/ybsdk/feature/settings/api/data/SettingDto;", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;Lcom/ybsdk/feature/settings/api/data/SettingDto;)V", "getImage", "()Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "getSetting", "()Lcom/ybsdk/feature/settings/api/data/SettingDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SingleCardSettingResponse {
    private final ThemedParameter<String> image;
    private final SettingDto setting;

    public SingleCardSettingResponse(@Json(name = "image") ThemedParameter<String> themedParameter, @Json(name = "setting") SettingDto settingDto) {
        this.image = themedParameter;
        this.setting = settingDto;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SingleCardSettingResponse copy$default(SingleCardSettingResponse singleCardSettingResponse, ThemedParameter themedParameter, SettingDto settingDto, int i, Object obj) {
        if ((i & 1) != 0) {
            themedParameter = singleCardSettingResponse.image;
        }
        if ((i & 2) != 0) {
            settingDto = singleCardSettingResponse.setting;
        }
        return singleCardSettingResponse.copy(themedParameter, settingDto);
    }

    public final ThemedParameter<String> component1() {
        return this.image;
    }

    /* renamed from: component2, reason: from getter */
    public final SettingDto getSetting() {
        return this.setting;
    }

    public final SingleCardSettingResponse copy(@Json(name = "image") ThemedParameter<String> image, @Json(name = "setting") SettingDto setting) {
        return new SingleCardSettingResponse(image, setting);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SingleCardSettingResponse)) {
            return false;
        }
        SingleCardSettingResponse singleCardSettingResponse = (SingleCardSettingResponse) other;
        return jl40.l(this.image, singleCardSettingResponse.image) && jl40.l(this.setting, singleCardSettingResponse.setting);
    }

    public final ThemedParameter<String> getImage() {
        return this.image;
    }

    public final SettingDto getSetting() {
        return this.setting;
    }

    public int hashCode() {
        return this.setting.hashCode() + (this.image.hashCode() * 31);
    }

    public String toString() {
        return "SingleCardSettingResponse(image=" + this.image + ", setting=" + this.setting + Extension.C_BRAKE;
    }
}
