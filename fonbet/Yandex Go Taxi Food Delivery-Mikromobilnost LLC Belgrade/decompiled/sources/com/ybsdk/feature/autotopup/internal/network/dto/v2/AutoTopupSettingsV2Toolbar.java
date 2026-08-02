package com.ybsdk.feature.autotopup.internal.network.dto.v2;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2Toolbar;", "", "divkitBlockCenter", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "divkitBlockRight", "<init>", "(Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;)V", "getDivkitBlockCenter", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "getDivkitBlockRight", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AutoTopupSettingsV2Toolbar {
    private final DivDataDto divkitBlockCenter;
    private final DivDataDto divkitBlockRight;

    public AutoTopupSettingsV2Toolbar(@Json(name = "divkit_block_center") DivDataDto divDataDto, @Json(name = "divkit_block_right") DivDataDto divDataDto2) {
        this.divkitBlockCenter = divDataDto;
        this.divkitBlockRight = divDataDto2;
    }

    public static /* synthetic */ AutoTopupSettingsV2Toolbar copy$default(AutoTopupSettingsV2Toolbar autoTopupSettingsV2Toolbar, DivDataDto divDataDto, DivDataDto divDataDto2, int i, Object obj) {
        if ((i & 1) != 0) {
            divDataDto = autoTopupSettingsV2Toolbar.divkitBlockCenter;
        }
        if ((i & 2) != 0) {
            divDataDto2 = autoTopupSettingsV2Toolbar.divkitBlockRight;
        }
        return autoTopupSettingsV2Toolbar.copy(divDataDto, divDataDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final DivDataDto getDivkitBlockCenter() {
        return this.divkitBlockCenter;
    }

    /* renamed from: component2, reason: from getter */
    public final DivDataDto getDivkitBlockRight() {
        return this.divkitBlockRight;
    }

    public final AutoTopupSettingsV2Toolbar copy(@Json(name = "divkit_block_center") DivDataDto divkitBlockCenter, @Json(name = "divkit_block_right") DivDataDto divkitBlockRight) {
        return new AutoTopupSettingsV2Toolbar(divkitBlockCenter, divkitBlockRight);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoTopupSettingsV2Toolbar)) {
            return false;
        }
        AutoTopupSettingsV2Toolbar autoTopupSettingsV2Toolbar = (AutoTopupSettingsV2Toolbar) other;
        return jl40.l(this.divkitBlockCenter, autoTopupSettingsV2Toolbar.divkitBlockCenter) && jl40.l(this.divkitBlockRight, autoTopupSettingsV2Toolbar.divkitBlockRight);
    }

    public final DivDataDto getDivkitBlockCenter() {
        return this.divkitBlockCenter;
    }

    public final DivDataDto getDivkitBlockRight() {
        return this.divkitBlockRight;
    }

    public int hashCode() {
        return this.divkitBlockRight.hashCode() + (this.divkitBlockCenter.hashCode() * 31);
    }

    public String toString() {
        return "AutoTopupSettingsV2Toolbar(divkitBlockCenter=" + this.divkitBlockCenter + ", divkitBlockRight=" + this.divkitBlockRight + Extension.C_BRAKE;
    }
}
