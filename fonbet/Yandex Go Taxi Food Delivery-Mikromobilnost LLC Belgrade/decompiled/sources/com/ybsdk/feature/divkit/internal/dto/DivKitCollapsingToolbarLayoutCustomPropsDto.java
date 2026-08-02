package com.ybsdk.feature.divkit.internal.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0010J<\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0004\u0010\rR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0006\u0010\rR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/ybsdk/feature/divkit/internal/dto/DivKitCollapsingToolbarLayoutCustomPropsDto;", "", "toolbarCollapsedHeightDp", "", "isAnchored", "", "isToolbarScrollEnabled", "parallaxMultiplier", "", "<init>", "(ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Float;)V", "getToolbarCollapsedHeightDp", "()I", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getParallaxMultiplier", "()Ljava/lang/Float;", "Ljava/lang/Float;", "component1", "component2", "component3", "component4", "copy", "(ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Float;)Lcom/ybsdk/feature/divkit/internal/dto/DivKitCollapsingToolbarLayoutCustomPropsDto;", "equals", "other", "hashCode", "toString", "", "feature-divkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DivKitCollapsingToolbarLayoutCustomPropsDto {

    @Json(name = "is_anchored")
    private final Boolean isAnchored;

    @Json(name = "is_toolbar_scroll_enabled")
    private final Boolean isToolbarScrollEnabled;

    @Json(name = "parallax_multiplier")
    private final Float parallaxMultiplier;

    @Json(name = "toolbar_collapsed_height")
    private final int toolbarCollapsedHeightDp;

    public DivKitCollapsingToolbarLayoutCustomPropsDto(int i, Boolean bool, Boolean bool2, Float f) {
        this.toolbarCollapsedHeightDp = i;
        this.isAnchored = bool;
        this.isToolbarScrollEnabled = bool2;
        this.parallaxMultiplier = f;
    }

    public static /* synthetic */ DivKitCollapsingToolbarLayoutCustomPropsDto copy$default(DivKitCollapsingToolbarLayoutCustomPropsDto divKitCollapsingToolbarLayoutCustomPropsDto, int i, Boolean bool, Boolean bool2, Float f, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = divKitCollapsingToolbarLayoutCustomPropsDto.toolbarCollapsedHeightDp;
        }
        if ((i2 & 2) != 0) {
            bool = divKitCollapsingToolbarLayoutCustomPropsDto.isAnchored;
        }
        if ((i2 & 4) != 0) {
            bool2 = divKitCollapsingToolbarLayoutCustomPropsDto.isToolbarScrollEnabled;
        }
        if ((i2 & 8) != 0) {
            f = divKitCollapsingToolbarLayoutCustomPropsDto.parallaxMultiplier;
        }
        return divKitCollapsingToolbarLayoutCustomPropsDto.copy(i, bool, bool2, f);
    }

    /* renamed from: component1, reason: from getter */
    public final int getToolbarCollapsedHeightDp() {
        return this.toolbarCollapsedHeightDp;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getIsAnchored() {
        return this.isAnchored;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getIsToolbarScrollEnabled() {
        return this.isToolbarScrollEnabled;
    }

    /* renamed from: component4, reason: from getter */
    public final Float getParallaxMultiplier() {
        return this.parallaxMultiplier;
    }

    public final DivKitCollapsingToolbarLayoutCustomPropsDto copy(int toolbarCollapsedHeightDp, Boolean isAnchored, Boolean isToolbarScrollEnabled, Float parallaxMultiplier) {
        return new DivKitCollapsingToolbarLayoutCustomPropsDto(toolbarCollapsedHeightDp, isAnchored, isToolbarScrollEnabled, parallaxMultiplier);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DivKitCollapsingToolbarLayoutCustomPropsDto)) {
            return false;
        }
        DivKitCollapsingToolbarLayoutCustomPropsDto divKitCollapsingToolbarLayoutCustomPropsDto = (DivKitCollapsingToolbarLayoutCustomPropsDto) other;
        return this.toolbarCollapsedHeightDp == divKitCollapsingToolbarLayoutCustomPropsDto.toolbarCollapsedHeightDp && jl40.l(this.isAnchored, divKitCollapsingToolbarLayoutCustomPropsDto.isAnchored) && jl40.l(this.isToolbarScrollEnabled, divKitCollapsingToolbarLayoutCustomPropsDto.isToolbarScrollEnabled) && jl40.l(this.parallaxMultiplier, divKitCollapsingToolbarLayoutCustomPropsDto.parallaxMultiplier);
    }

    public final Float getParallaxMultiplier() {
        return this.parallaxMultiplier;
    }

    public final int getToolbarCollapsedHeightDp() {
        return this.toolbarCollapsedHeightDp;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.toolbarCollapsedHeightDp) * 31;
        Boolean bool = this.isAnchored;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isToolbarScrollEnabled;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Float f = this.parallaxMultiplier;
        return hashCode3 + (f != null ? f.hashCode() : 0);
    }

    public final Boolean isAnchored() {
        return this.isAnchored;
    }

    public final Boolean isToolbarScrollEnabled() {
        return this.isToolbarScrollEnabled;
    }

    public String toString() {
        return "DivKitCollapsingToolbarLayoutCustomPropsDto(toolbarCollapsedHeightDp=" + this.toolbarCollapsedHeightDp + ", isAnchored=" + this.isAnchored + ", isToolbarScrollEnabled=" + this.isToolbarScrollEnabled + ", parallaxMultiplier=" + this.parallaxMultiplier + Extension.C_BRAKE;
    }
}
