package com.ybsdk.feature.settings.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.settings.api.data.SettingPropertyDto;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/settings/internal/network/dto/SetSettingRequest;", "", "key", "", "property", "Lcom/ybsdk/feature/settings/api/data/SettingPropertyDto;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/feature/settings/api/data/SettingPropertyDto;)V", "getKey", "()Ljava/lang/String;", "getProperty", "()Lcom/ybsdk/feature/settings/api/data/SettingPropertyDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SetSettingRequest {
    private final String key;
    private final SettingPropertyDto property;

    public SetSettingRequest(@Json(name = "key") String str, @Json(name = "property") SettingPropertyDto settingPropertyDto) {
        this.key = str;
        this.property = settingPropertyDto;
    }

    public static /* synthetic */ SetSettingRequest copy$default(SetSettingRequest setSettingRequest, String str, SettingPropertyDto settingPropertyDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = setSettingRequest.key;
        }
        if ((i & 2) != 0) {
            settingPropertyDto = setSettingRequest.property;
        }
        return setSettingRequest.copy(str, settingPropertyDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: component2, reason: from getter */
    public final SettingPropertyDto getProperty() {
        return this.property;
    }

    public final SetSettingRequest copy(@Json(name = "key") String key, @Json(name = "property") SettingPropertyDto property) {
        return new SetSettingRequest(key, property);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetSettingRequest)) {
            return false;
        }
        SetSettingRequest setSettingRequest = (SetSettingRequest) other;
        return jl40.l(this.key, setSettingRequest.key) && jl40.l(this.property, setSettingRequest.property);
    }

    public final String getKey() {
        return this.key;
    }

    public final SettingPropertyDto getProperty() {
        return this.property;
    }

    public int hashCode() {
        return this.property.hashCode() + (this.key.hashCode() * 31);
    }

    public String toString() {
        return "SetSettingRequest(key=" + this.key + ", property=" + this.property + Extension.C_BRAKE;
    }
}
