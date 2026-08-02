package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.nvr0;
import java.util.Map;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0001(B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ&\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\tR\u001a\u0010\u0016\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u001a\u0010\u0019\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u000fR\u001a\u0010\u001b\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u000fR\u001a\u0010\u001d\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u000fR\u001a\u0010\u001f\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010\u000fR\u001a\u0010!\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010\u000fR\u001a\u0010#\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b#\u0010\u0017\u001a\u0004\b$\u0010\u000fR\u001a\u0010%\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b%\u0010\u0017\u001a\u0004\b&\u0010\u000f¨\u0006)"}, d2 = {"Lcom/ybsdk/rconfig/configs/ShimmersConfigImpl;", "", "", "", "", "jsonValues", "<init>", "(Ljava/util/Map;)V", "component1", "()Ljava/util/Map;", "copy", "(Ljava/util/Map;)Lcom/ybsdk/rconfig/configs/ShimmersConfigImpl;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getJsonValues", "shimmerMinimumVisibleTimeMs", CA20Status.STATUS_USER_I, "getShimmerMinimumVisibleTimeMs", "delayBeforeShowShimmerMs", "getDelayBeforeShowShimmerMs", "shimmerSlideAnimationOffset", "getShimmerSlideAnimationOffset", "shimmerSlideAnimationDurationMs", "getShimmerSlideAnimationDurationMs", "contentFadeInAnimationDelayMs", "getContentFadeInAnimationDelayMs", "contentFadeInAnimationDurationMs", "getContentFadeInAnimationDurationMs", "hideShimmerAnimationDurationMs", "getHideShimmerAnimationDurationMs", "showShimmerVisibilityAnimationMs", "getShowShimmerVisibilityAnimationMs", "Companion", "nvr0", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ShimmersConfigImpl {

    @Deprecated
    public static final String CONTENT_FADE_IN_ANIMATION_DELAY = "content_fade_in_animation_delay_ms";

    @Deprecated
    public static final String CONTENT_FADE_IN_ANIMATION_DURATION = "content_fade_in_animation_dutarion_ms";
    private static final nvr0 Companion = new nvr0();

    @Deprecated
    public static final String DELAY_BEFORE_SHOW_SHIMMER = "delay_before_show_shimmer_ms";

    @Deprecated
    public static final String HIDE_SHIMMER_ANIMATION_DURATION = "hide_shimmer_animation_duration_ms";

    @Deprecated
    public static final String MIN_VISIBLE_TIME = "min_shimmer_visible_time_ms";

    @Deprecated
    public static final String SHIMMER_SLIDE_ANIMATION_DURATION = "shimmer_slide_animation_duration";

    @Deprecated
    public static final String SHIMMER_SLIDE_ANIMATION_OFFSET = "shimmer_slide_animation_offset";

    @Deprecated
    public static final String SHOW_SHIMMER_VISIBILITY_ANIMATION = "show_shimmer_visibility_animation_ms";

    @Json(name = CONTENT_FADE_IN_ANIMATION_DELAY)
    private final int contentFadeInAnimationDelayMs;

    @Json(name = CONTENT_FADE_IN_ANIMATION_DURATION)
    private final int contentFadeInAnimationDurationMs;

    @Json(name = DELAY_BEFORE_SHOW_SHIMMER)
    private final int delayBeforeShowShimmerMs;

    @Json(name = HIDE_SHIMMER_ANIMATION_DURATION)
    private final int hideShimmerAnimationDurationMs;
    private final Map<String, Integer> jsonValues;

    @Json(name = MIN_VISIBLE_TIME)
    private final int shimmerMinimumVisibleTimeMs;

    @Json(name = SHIMMER_SLIDE_ANIMATION_DURATION)
    private final int shimmerSlideAnimationDurationMs;

    @Json(name = SHIMMER_SLIDE_ANIMATION_OFFSET)
    private final int shimmerSlideAnimationOffset;

    @Json(name = SHOW_SHIMMER_VISIBILITY_ANIMATION)
    private final int showShimmerVisibilityAnimationMs;

    public ShimmersConfigImpl(Map<String, Integer> map) {
        this.jsonValues = map;
        Integer num = map.get(MIN_VISIBLE_TIME);
        this.shimmerMinimumVisibleTimeMs = num != null ? num.intValue() : 1000;
        Integer num2 = map.get(DELAY_BEFORE_SHOW_SHIMMER);
        this.delayBeforeShowShimmerMs = num2 != null ? num2.intValue() : 300;
        Integer num3 = map.get(SHIMMER_SLIDE_ANIMATION_OFFSET);
        this.shimmerSlideAnimationOffset = num3 != null ? num3.intValue() : 20;
        Integer num4 = map.get(SHIMMER_SLIDE_ANIMATION_DURATION);
        this.shimmerSlideAnimationDurationMs = num4 != null ? num4.intValue() : 500;
        Integer num5 = map.get(CONTENT_FADE_IN_ANIMATION_DELAY);
        this.contentFadeInAnimationDelayMs = num5 != null ? num5.intValue() : 200;
        Integer num6 = map.get(CONTENT_FADE_IN_ANIMATION_DURATION);
        this.contentFadeInAnimationDurationMs = num6 != null ? num6.intValue() : 300;
        Integer num7 = map.get(HIDE_SHIMMER_ANIMATION_DURATION);
        this.hideShimmerAnimationDurationMs = num7 != null ? num7.intValue() : 300;
        Integer num8 = map.get(SHOW_SHIMMER_VISIBILITY_ANIMATION);
        this.showShimmerVisibilityAnimationMs = num8 != null ? num8.intValue() : 500;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShimmersConfigImpl copy$default(ShimmersConfigImpl shimmersConfigImpl, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = shimmersConfigImpl.jsonValues;
        }
        return shimmersConfigImpl.copy(map);
    }

    public final Map<String, Integer> component1() {
        return this.jsonValues;
    }

    public final ShimmersConfigImpl copy(Map<String, Integer> jsonValues) {
        return new ShimmersConfigImpl(jsonValues);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ShimmersConfigImpl) && jl40.l(this.jsonValues, ((ShimmersConfigImpl) other).jsonValues);
    }

    public int getContentFadeInAnimationDelayMs() {
        return this.contentFadeInAnimationDelayMs;
    }

    public int getContentFadeInAnimationDurationMs() {
        return this.contentFadeInAnimationDurationMs;
    }

    public int getDelayBeforeShowShimmerMs() {
        return this.delayBeforeShowShimmerMs;
    }

    public int getHideShimmerAnimationDurationMs() {
        return this.hideShimmerAnimationDurationMs;
    }

    public final Map<String, Integer> getJsonValues() {
        return this.jsonValues;
    }

    public int getShimmerMinimumVisibleTimeMs() {
        return this.shimmerMinimumVisibleTimeMs;
    }

    public int getShimmerSlideAnimationDurationMs() {
        return this.shimmerSlideAnimationDurationMs;
    }

    public int getShimmerSlideAnimationOffset() {
        return this.shimmerSlideAnimationOffset;
    }

    public int getShowShimmerVisibilityAnimationMs() {
        return this.showShimmerVisibilityAnimationMs;
    }

    public int hashCode() {
        return this.jsonValues.hashCode();
    }

    public String toString() {
        return nnm.j("ShimmersConfigImpl(jsonValues=", Extension.C_BRAKE, this.jsonValues);
    }
}
