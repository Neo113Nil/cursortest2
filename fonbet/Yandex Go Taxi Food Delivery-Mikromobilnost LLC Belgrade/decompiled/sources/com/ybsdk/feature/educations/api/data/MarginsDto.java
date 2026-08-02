package com.ybsdk.feature.educations.api.data;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ>\u0010\u0013\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/educations/api/data/MarginsDto;", "", "left", "", "top", "right", "bottom", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getLeft", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTop", "getRight", "getBottom", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/ybsdk/feature/educations/api/data/MarginsDto;", "equals", "", "other", "hashCode", "toString", "", "feature-educations-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MarginsDto {
    private final Integer bottom;
    private final Integer left;
    private final Integer right;
    private final Integer top;

    public MarginsDto(@Json(name = "left") Integer num, @Json(name = "top") Integer num2, @Json(name = "right") Integer num3, @Json(name = "bottom") Integer num4) {
        this.left = num;
        this.top = num2;
        this.right = num3;
        this.bottom = num4;
    }

    public static /* synthetic */ MarginsDto copy$default(MarginsDto marginsDto, Integer num, Integer num2, Integer num3, Integer num4, int i, Object obj) {
        if ((i & 1) != 0) {
            num = marginsDto.left;
        }
        if ((i & 2) != 0) {
            num2 = marginsDto.top;
        }
        if ((i & 4) != 0) {
            num3 = marginsDto.right;
        }
        if ((i & 8) != 0) {
            num4 = marginsDto.bottom;
        }
        return marginsDto.copy(num, num2, num3, num4);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getLeft() {
        return this.left;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getTop() {
        return this.top;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getRight() {
        return this.right;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getBottom() {
        return this.bottom;
    }

    public final MarginsDto copy(@Json(name = "left") Integer left, @Json(name = "top") Integer top, @Json(name = "right") Integer right, @Json(name = "bottom") Integer bottom) {
        return new MarginsDto(left, top, right, bottom);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarginsDto)) {
            return false;
        }
        MarginsDto marginsDto = (MarginsDto) other;
        return jl40.l(this.left, marginsDto.left) && jl40.l(this.top, marginsDto.top) && jl40.l(this.right, marginsDto.right) && jl40.l(this.bottom, marginsDto.bottom);
    }

    public final Integer getBottom() {
        return this.bottom;
    }

    public final Integer getLeft() {
        return this.left;
    }

    public final Integer getRight() {
        return this.right;
    }

    public final Integer getTop() {
        return this.top;
    }

    public int hashCode() {
        Integer num = this.left;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.top;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.right;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.bottom;
        return hashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public String toString() {
        return "MarginsDto(left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + Extension.C_BRAKE;
    }
}
