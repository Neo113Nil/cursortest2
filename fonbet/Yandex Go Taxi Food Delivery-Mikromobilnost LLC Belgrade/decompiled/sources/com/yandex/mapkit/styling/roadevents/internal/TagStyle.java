package com.yandex.mapkit.styling.roadevents.internal;

import com.yandex.mapkit.road_events_layer.RoadEventSignificance;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import java.util.Map;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/yandex/mapkit/styling/roadevents/internal/TagStyle;", "", "priority", "", "imageId", "", "significanceToZoomMin", "", "Lcom/yandex/mapkit/road_events_layer/RoadEventSignificance;", "<init>", "(ILjava/lang/String;Ljava/util/Map;)V", "getPriority", "()I", "getImageId", "()Ljava/lang/String;", "getSignificanceToZoomMin", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "com.yandex.mapkit.styling.roadevents_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class TagStyle {
    private final String imageId;
    private final int priority;
    private final Map<RoadEventSignificance, Integer> significanceToZoomMin;

    public TagStyle(int i, String str, Map<RoadEventSignificance, Integer> map) {
        this.priority = i;
        this.imageId = str;
        this.significanceToZoomMin = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TagStyle copy$default(TagStyle tagStyle, int i, String str, Map map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = tagStyle.priority;
        }
        if ((i2 & 2) != 0) {
            str = tagStyle.imageId;
        }
        if ((i2 & 4) != 0) {
            map = tagStyle.significanceToZoomMin;
        }
        return tagStyle.copy(i, str, map);
    }

    /* renamed from: component1, reason: from getter */
    public final int getPriority() {
        return this.priority;
    }

    /* renamed from: component2, reason: from getter */
    public final String getImageId() {
        return this.imageId;
    }

    public final Map<RoadEventSignificance, Integer> component3() {
        return this.significanceToZoomMin;
    }

    public final TagStyle copy(int priority, String imageId, Map<RoadEventSignificance, Integer> significanceToZoomMin) {
        return new TagStyle(priority, imageId, significanceToZoomMin);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TagStyle)) {
            return false;
        }
        TagStyle tagStyle = (TagStyle) other;
        return this.priority == tagStyle.priority && jl40.l(this.imageId, tagStyle.imageId) && jl40.l(this.significanceToZoomMin, tagStyle.significanceToZoomMin);
    }

    public final String getImageId() {
        return this.imageId;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final Map<RoadEventSignificance, Integer> getSignificanceToZoomMin() {
        return this.significanceToZoomMin;
    }

    public int hashCode() {
        return this.significanceToZoomMin.hashCode() + unr0.b(Integer.hashCode(this.priority) * 31, 31, this.imageId);
    }

    public String toString() {
        int i = this.priority;
        String str = this.imageId;
        return b64.r(unr0.v(i, "TagStyle(priority=", ", imageId=", str, ", significanceToZoomMin="), this.significanceToZoomMin, Extension.C_BRAKE);
    }
}
