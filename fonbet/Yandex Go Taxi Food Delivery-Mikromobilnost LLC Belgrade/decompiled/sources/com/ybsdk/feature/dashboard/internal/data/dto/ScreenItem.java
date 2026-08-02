package com.ybsdk.feature.dashboard.internal.data.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/data/dto/ScreenItem;", "", "divKitData", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "itemType", "", "<init>", "(Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Ljava/lang/String;)V", "getDivKitData", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "getItemType", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ScreenItem {
    private final DivDataDto divKitData;
    private final String itemType;

    public ScreenItem(@Json(name = "divkit_data") DivDataDto divDataDto, @Json(name = "item_type") String str) {
        this.divKitData = divDataDto;
        this.itemType = str;
    }

    public static /* synthetic */ ScreenItem copy$default(ScreenItem screenItem, DivDataDto divDataDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            divDataDto = screenItem.divKitData;
        }
        if ((i & 2) != 0) {
            str = screenItem.itemType;
        }
        return screenItem.copy(divDataDto, str);
    }

    /* renamed from: component1, reason: from getter */
    public final DivDataDto getDivKitData() {
        return this.divKitData;
    }

    /* renamed from: component2, reason: from getter */
    public final String getItemType() {
        return this.itemType;
    }

    public final ScreenItem copy(@Json(name = "divkit_data") DivDataDto divKitData, @Json(name = "item_type") String itemType) {
        return new ScreenItem(divKitData, itemType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScreenItem)) {
            return false;
        }
        ScreenItem screenItem = (ScreenItem) other;
        return jl40.l(this.divKitData, screenItem.divKitData) && jl40.l(this.itemType, screenItem.itemType);
    }

    public final DivDataDto getDivKitData() {
        return this.divKitData;
    }

    public final String getItemType() {
        return this.itemType;
    }

    public int hashCode() {
        return this.itemType.hashCode() + (this.divKitData.hashCode() * 31);
    }

    public String toString() {
        return "ScreenItem(divKitData=" + this.divKitData + ", itemType=" + this.itemType + Extension.C_BRAKE;
    }
}
