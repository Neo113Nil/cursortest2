package com.ybsdk.feature.divkit.internal.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.ly3;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/divkit/internal/dto/DivKitSwitchCustomPropsDto;", "", "isChecked", "", "isEnabled", "<init>", "(ZZ)V", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-divkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DivKitSwitchCustomPropsDto {
    private final boolean isChecked;
    private final boolean isEnabled;

    public DivKitSwitchCustomPropsDto(@Json(name = "is_checked") boolean z, @Json(name = "is_enabled") boolean z2) {
        this.isChecked = z;
        this.isEnabled = z2;
    }

    public static /* synthetic */ DivKitSwitchCustomPropsDto copy$default(DivKitSwitchCustomPropsDto divKitSwitchCustomPropsDto, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = divKitSwitchCustomPropsDto.isChecked;
        }
        if ((i & 2) != 0) {
            z2 = divKitSwitchCustomPropsDto.isEnabled;
        }
        return divKitSwitchCustomPropsDto.copy(z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public final DivKitSwitchCustomPropsDto copy(@Json(name = "is_checked") boolean isChecked, @Json(name = "is_enabled") boolean isEnabled) {
        return new DivKitSwitchCustomPropsDto(isChecked, isEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DivKitSwitchCustomPropsDto)) {
            return false;
        }
        DivKitSwitchCustomPropsDto divKitSwitchCustomPropsDto = (DivKitSwitchCustomPropsDto) other;
        return this.isChecked == divKitSwitchCustomPropsDto.isChecked && this.isEnabled == divKitSwitchCustomPropsDto.isEnabled;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isEnabled) + (Boolean.hashCode(this.isChecked) * 31);
    }

    public final boolean isChecked() {
        return this.isChecked;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public String toString() {
        return ly3.o("DivKitSwitchCustomPropsDto(isChecked=", ", isEnabled=", Extension.C_BRAKE, this.isChecked, this.isEnabled);
    }
}
