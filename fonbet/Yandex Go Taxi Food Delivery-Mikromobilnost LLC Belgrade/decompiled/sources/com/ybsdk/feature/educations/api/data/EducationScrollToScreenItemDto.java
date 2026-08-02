package com.ybsdk.feature.educations.api.data;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oo31;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ.\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/educations/api/data/EducationScrollToScreenItemDto;", "", "itemId", "", "snapPreference", "Lcom/ybsdk/feature/educations/api/data/EducationScrollSnapPreference;", "offset", "", "<init>", "(Ljava/lang/String;Lcom/ybsdk/feature/educations/api/data/EducationScrollSnapPreference;Ljava/lang/Integer;)V", "getItemId", "()Ljava/lang/String;", "getSnapPreference", "()Lcom/ybsdk/feature/educations/api/data/EducationScrollSnapPreference;", "getOffset", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Lcom/ybsdk/feature/educations/api/data/EducationScrollSnapPreference;Ljava/lang/Integer;)Lcom/ybsdk/feature/educations/api/data/EducationScrollToScreenItemDto;", "equals", "", "other", "hashCode", "toString", "feature-educations-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EducationScrollToScreenItemDto {
    private final String itemId;
    private final Integer offset;
    private final EducationScrollSnapPreference snapPreference;

    public EducationScrollToScreenItemDto(@Json(name = "item_id") String str, @Json(name = "snap_preference") EducationScrollSnapPreference educationScrollSnapPreference, @Json(name = "offset") Integer num) {
        this.itemId = str;
        this.snapPreference = educationScrollSnapPreference;
        this.offset = num;
    }

    public static /* synthetic */ EducationScrollToScreenItemDto copy$default(EducationScrollToScreenItemDto educationScrollToScreenItemDto, String str, EducationScrollSnapPreference educationScrollSnapPreference, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = educationScrollToScreenItemDto.itemId;
        }
        if ((i & 2) != 0) {
            educationScrollSnapPreference = educationScrollToScreenItemDto.snapPreference;
        }
        if ((i & 4) != 0) {
            num = educationScrollToScreenItemDto.offset;
        }
        return educationScrollToScreenItemDto.copy(str, educationScrollSnapPreference, num);
    }

    /* renamed from: component1, reason: from getter */
    public final String getItemId() {
        return this.itemId;
    }

    /* renamed from: component2, reason: from getter */
    public final EducationScrollSnapPreference getSnapPreference() {
        return this.snapPreference;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getOffset() {
        return this.offset;
    }

    public final EducationScrollToScreenItemDto copy(@Json(name = "item_id") String itemId, @Json(name = "snap_preference") EducationScrollSnapPreference snapPreference, @Json(name = "offset") Integer offset) {
        return new EducationScrollToScreenItemDto(itemId, snapPreference, offset);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EducationScrollToScreenItemDto)) {
            return false;
        }
        EducationScrollToScreenItemDto educationScrollToScreenItemDto = (EducationScrollToScreenItemDto) other;
        return jl40.l(this.itemId, educationScrollToScreenItemDto.itemId) && this.snapPreference == educationScrollToScreenItemDto.snapPreference && jl40.l(this.offset, educationScrollToScreenItemDto.offset);
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final Integer getOffset() {
        return this.offset;
    }

    public final EducationScrollSnapPreference getSnapPreference() {
        return this.snapPreference;
    }

    public int hashCode() {
        int hashCode = (this.snapPreference.hashCode() + (this.itemId.hashCode() * 31)) * 31;
        Integer num = this.offset;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        String str = this.itemId;
        EducationScrollSnapPreference educationScrollSnapPreference = this.snapPreference;
        Integer num = this.offset;
        StringBuilder sb = new StringBuilder("EducationScrollToScreenItemDto(itemId=");
        sb.append(str);
        sb.append(", snapPreference=");
        sb.append(educationScrollSnapPreference);
        sb.append(", offset=");
        return oo31.j(sb, num, Extension.C_BRAKE);
    }
}
