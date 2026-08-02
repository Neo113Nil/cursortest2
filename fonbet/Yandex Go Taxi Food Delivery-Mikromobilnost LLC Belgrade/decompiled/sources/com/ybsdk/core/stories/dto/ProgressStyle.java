package com.ybsdk.core.stories.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0001\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\r\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/core/stories/dto/ProgressStyle;", "", "trackColor", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "", "indicatorColor", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;)V", "getTrackColor", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getIndicatorColor", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "core-stories_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ProgressStyle {
    private final Themes<String> indicatorColor;
    private final Themes<String> trackColor;

    public ProgressStyle(@Json(name = "track_color") Themes<String> themes, @Json(name = "indicator_color") Themes<String> themes2) {
        this.trackColor = themes;
        this.indicatorColor = themes2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProgressStyle copy$default(ProgressStyle progressStyle, Themes themes, Themes themes2, int i, Object obj) {
        if ((i & 1) != 0) {
            themes = progressStyle.trackColor;
        }
        if ((i & 2) != 0) {
            themes2 = progressStyle.indicatorColor;
        }
        return progressStyle.copy(themes, themes2);
    }

    public final Themes<String> component1() {
        return this.trackColor;
    }

    public final Themes<String> component2() {
        return this.indicatorColor;
    }

    public final ProgressStyle copy(@Json(name = "track_color") Themes<String> trackColor, @Json(name = "indicator_color") Themes<String> indicatorColor) {
        return new ProgressStyle(trackColor, indicatorColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProgressStyle)) {
            return false;
        }
        ProgressStyle progressStyle = (ProgressStyle) other;
        return jl40.l(this.trackColor, progressStyle.trackColor) && jl40.l(this.indicatorColor, progressStyle.indicatorColor);
    }

    public final Themes<String> getIndicatorColor() {
        return this.indicatorColor;
    }

    public final Themes<String> getTrackColor() {
        return this.trackColor;
    }

    public int hashCode() {
        Themes<String> themes = this.trackColor;
        int hashCode = (themes == null ? 0 : themes.hashCode()) * 31;
        Themes<String> themes2 = this.indicatorColor;
        return hashCode + (themes2 != null ? themes2.hashCode() : 0);
    }

    public String toString() {
        return "ProgressStyle(trackColor=" + this.trackColor + ", indicatorColor=" + this.indicatorColor + Extension.C_BRAKE;
    }
}
