package com.ybsdk.core.stories.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003JA\u0010\u001d\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, d2 = {"Lcom/ybsdk/core/stories/dto/StoryItem;", "", "id", "", "maxProgressValueMs", "", "storyItemMode", "Lcom/ybsdk/core/stories/dto/StoryItemMode;", "divkitData", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "fullScreen", "Lcom/ybsdk/core/stories/dto/FullScreenDto;", "<init>", "(Ljava/lang/String;ILcom/ybsdk/core/stories/dto/StoryItemMode;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Lcom/ybsdk/core/stories/dto/FullScreenDto;)V", "getId", "()Ljava/lang/String;", "getMaxProgressValueMs", "()I", "getStoryItemMode", "()Lcom/ybsdk/core/stories/dto/StoryItemMode;", "getDivkitData", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "getFullScreen", "()Lcom/ybsdk/core/stories/dto/FullScreenDto;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "core-stories_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class StoryItem {
    private final DivDataDto divkitData;
    private final FullScreenDto fullScreen;
    private final String id;
    private final int maxProgressValueMs;
    private final StoryItemMode storyItemMode;

    public StoryItem(@Json(name = "id") String str, @Json(name = "duration_ms") int i, @Json(name = "mode") StoryItemMode storyItemMode, @Json(name = "divkit_data") DivDataDto divDataDto, @Json(name = "full_screen") FullScreenDto fullScreenDto) {
        this.id = str;
        this.maxProgressValueMs = i;
        this.storyItemMode = storyItemMode;
        this.divkitData = divDataDto;
        this.fullScreen = fullScreenDto;
    }

    public static /* synthetic */ StoryItem copy$default(StoryItem storyItem, String str, int i, StoryItemMode storyItemMode, DivDataDto divDataDto, FullScreenDto fullScreenDto, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = storyItem.id;
        }
        if ((i2 & 2) != 0) {
            i = storyItem.maxProgressValueMs;
        }
        if ((i2 & 4) != 0) {
            storyItemMode = storyItem.storyItemMode;
        }
        if ((i2 & 8) != 0) {
            divDataDto = storyItem.divkitData;
        }
        if ((i2 & 16) != 0) {
            fullScreenDto = storyItem.fullScreen;
        }
        FullScreenDto fullScreenDto2 = fullScreenDto;
        StoryItemMode storyItemMode2 = storyItemMode;
        return storyItem.copy(str, i, storyItemMode2, divDataDto, fullScreenDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMaxProgressValueMs() {
        return this.maxProgressValueMs;
    }

    /* renamed from: component3, reason: from getter */
    public final StoryItemMode getStoryItemMode() {
        return this.storyItemMode;
    }

    /* renamed from: component4, reason: from getter */
    public final DivDataDto getDivkitData() {
        return this.divkitData;
    }

    /* renamed from: component5, reason: from getter */
    public final FullScreenDto getFullScreen() {
        return this.fullScreen;
    }

    public final StoryItem copy(@Json(name = "id") String id, @Json(name = "duration_ms") int maxProgressValueMs, @Json(name = "mode") StoryItemMode storyItemMode, @Json(name = "divkit_data") DivDataDto divkitData, @Json(name = "full_screen") FullScreenDto fullScreen) {
        return new StoryItem(id, maxProgressValueMs, storyItemMode, divkitData, fullScreen);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoryItem)) {
            return false;
        }
        StoryItem storyItem = (StoryItem) other;
        return jl40.l(this.id, storyItem.id) && this.maxProgressValueMs == storyItem.maxProgressValueMs && this.storyItemMode == storyItem.storyItemMode && jl40.l(this.divkitData, storyItem.divkitData) && jl40.l(this.fullScreen, storyItem.fullScreen);
    }

    public final DivDataDto getDivkitData() {
        return this.divkitData;
    }

    public final FullScreenDto getFullScreen() {
        return this.fullScreen;
    }

    public final String getId() {
        return this.id;
    }

    public final int getMaxProgressValueMs() {
        return this.maxProgressValueMs;
    }

    public final StoryItemMode getStoryItemMode() {
        return this.storyItemMode;
    }

    public int hashCode() {
        int b = oyr.b(this.maxProgressValueMs, this.id.hashCode() * 31, 31);
        StoryItemMode storyItemMode = this.storyItemMode;
        int hashCode = (b + (storyItemMode == null ? 0 : storyItemMode.hashCode())) * 31;
        DivDataDto divDataDto = this.divkitData;
        int hashCode2 = (hashCode + (divDataDto == null ? 0 : divDataDto.hashCode())) * 31;
        FullScreenDto fullScreenDto = this.fullScreen;
        return hashCode2 + (fullScreenDto != null ? fullScreenDto.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        int i = this.maxProgressValueMs;
        StoryItemMode storyItemMode = this.storyItemMode;
        DivDataDto divDataDto = this.divkitData;
        FullScreenDto fullScreenDto = this.fullScreen;
        StringBuilder u = b64.u(i, "StoryItem(id=", str, ", maxProgressValueMs=", ", storyItemMode=");
        u.append(storyItemMode);
        u.append(", divkitData=");
        u.append(divDataDto);
        u.append(", fullScreen=");
        u.append(fullScreenDto);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
