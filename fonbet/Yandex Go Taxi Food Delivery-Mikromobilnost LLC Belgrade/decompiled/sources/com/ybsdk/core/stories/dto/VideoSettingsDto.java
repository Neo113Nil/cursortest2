package com.ybsdk.core.stories.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/core/stories/dto/VideoSettingsDto;", "", LaunchBrowserActivity.KEY_URI, "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "", "repeatMode", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;Ljava/lang/String;)V", "getUri", "()Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "getRepeatMode", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "core-stories_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class VideoSettingsDto {
    private final String repeatMode;
    private final ThemedParameter<String> uri;

    public VideoSettingsDto(@Json(name = "uri") ThemedParameter<String> themedParameter, @Json(name = "repeat_mode") String str) {
        this.uri = themedParameter;
        this.repeatMode = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VideoSettingsDto copy$default(VideoSettingsDto videoSettingsDto, ThemedParameter themedParameter, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            themedParameter = videoSettingsDto.uri;
        }
        if ((i & 2) != 0) {
            str = videoSettingsDto.repeatMode;
        }
        return videoSettingsDto.copy(themedParameter, str);
    }

    public final ThemedParameter<String> component1() {
        return this.uri;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRepeatMode() {
        return this.repeatMode;
    }

    public final VideoSettingsDto copy(@Json(name = "uri") ThemedParameter<String> uri, @Json(name = "repeat_mode") String repeatMode) {
        return new VideoSettingsDto(uri, repeatMode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoSettingsDto)) {
            return false;
        }
        VideoSettingsDto videoSettingsDto = (VideoSettingsDto) other;
        return jl40.l(this.uri, videoSettingsDto.uri) && jl40.l(this.repeatMode, videoSettingsDto.repeatMode);
    }

    public final String getRepeatMode() {
        return this.repeatMode;
    }

    public final ThemedParameter<String> getUri() {
        return this.uri;
    }

    public int hashCode() {
        int hashCode = this.uri.hashCode() * 31;
        String str = this.repeatMode;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "VideoSettingsDto(uri=" + this.uri + ", repeatMode=" + this.repeatMode + Extension.C_BRAKE;
    }
}
