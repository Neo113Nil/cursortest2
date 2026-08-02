package com.ybsdk.core.stories.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.xvz;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/ybsdk/core/stories/dto/VerticalStory;", "", "id", "", "storyItems", "", "Lcom/ybsdk/core/stories/dto/StoryItem;", "progressStyle", "Lcom/ybsdk/core/stories/dto/ProgressStyle;", "closeIconColor", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/ybsdk/core/stories/dto/ProgressStyle;Lcom/ybsdk/core/common/data/network/dto/Themes;)V", "getId", "()Ljava/lang/String;", "getStoryItems", "()Ljava/util/List;", "getProgressStyle", "()Lcom/ybsdk/core/stories/dto/ProgressStyle;", "getCloseIconColor", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "core-stories_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class VerticalStory {
    private final Themes<String> closeIconColor;
    private final String id;
    private final ProgressStyle progressStyle;
    private final List<StoryItem> storyItems;

    public VerticalStory(@Json(name = "id") String str, @Json(name = "story_items") List<StoryItem> list, @Json(name = "progress_bar_style") ProgressStyle progressStyle, @Json(name = "close_icon_color") Themes<String> themes) {
        this.id = str;
        this.storyItems = list;
        this.progressStyle = progressStyle;
        this.closeIconColor = themes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VerticalStory copy$default(VerticalStory verticalStory, String str, List list, ProgressStyle progressStyle, Themes themes, int i, Object obj) {
        if ((i & 1) != 0) {
            str = verticalStory.id;
        }
        if ((i & 2) != 0) {
            list = verticalStory.storyItems;
        }
        if ((i & 4) != 0) {
            progressStyle = verticalStory.progressStyle;
        }
        if ((i & 8) != 0) {
            themes = verticalStory.closeIconColor;
        }
        return verticalStory.copy(str, list, progressStyle, themes);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final List<StoryItem> component2() {
        return this.storyItems;
    }

    /* renamed from: component3, reason: from getter */
    public final ProgressStyle getProgressStyle() {
        return this.progressStyle;
    }

    public final Themes<String> component4() {
        return this.closeIconColor;
    }

    public final VerticalStory copy(@Json(name = "id") String id, @Json(name = "story_items") List<StoryItem> storyItems, @Json(name = "progress_bar_style") ProgressStyle progressStyle, @Json(name = "close_icon_color") Themes<String> closeIconColor) {
        return new VerticalStory(id, storyItems, progressStyle, closeIconColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerticalStory)) {
            return false;
        }
        VerticalStory verticalStory = (VerticalStory) other;
        return jl40.l(this.id, verticalStory.id) && jl40.l(this.storyItems, verticalStory.storyItems) && jl40.l(this.progressStyle, verticalStory.progressStyle) && jl40.l(this.closeIconColor, verticalStory.closeIconColor);
    }

    public final Themes<String> getCloseIconColor() {
        return this.closeIconColor;
    }

    public final String getId() {
        return this.id;
    }

    public final ProgressStyle getProgressStyle() {
        return this.progressStyle;
    }

    public final List<StoryItem> getStoryItems() {
        return this.storyItems;
    }

    public int hashCode() {
        int c = unr0.c(this.id.hashCode() * 31, 31, this.storyItems);
        ProgressStyle progressStyle = this.progressStyle;
        int hashCode = (c + (progressStyle == null ? 0 : progressStyle.hashCode())) * 31;
        Themes<String> themes = this.closeIconColor;
        return hashCode + (themes != null ? themes.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        List<StoryItem> list = this.storyItems;
        ProgressStyle progressStyle = this.progressStyle;
        Themes<String> themes = this.closeIconColor;
        StringBuilder r = xvz.r("VerticalStory(id=", str, ", storyItems=", list, ", progressStyle=");
        r.append(progressStyle);
        r.append(", closeIconColor=");
        r.append(themes);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
