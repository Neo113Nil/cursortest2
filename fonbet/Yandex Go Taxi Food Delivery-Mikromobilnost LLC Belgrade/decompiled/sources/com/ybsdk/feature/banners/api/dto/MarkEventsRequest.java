package com.ybsdk.feature.banners.api.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.qw00;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001#B/\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J8\u0010\u0011\u001a\u00020\u00002\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0010¨\u0006$"}, d2 = {"Lcom/ybsdk/feature/banners/api/dto/MarkEventsRequest;", "", "", "", "ids", "Lcom/ybsdk/feature/banners/api/dto/WidgetType;", "type", "Lcom/ybsdk/feature/banners/api/dto/MarkType;", "mark", "<init>", "(Ljava/util/List;Lcom/ybsdk/feature/banners/api/dto/WidgetType;Lcom/ybsdk/feature/banners/api/dto/MarkType;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/ybsdk/feature/banners/api/dto/WidgetType;", "component3", "()Lcom/ybsdk/feature/banners/api/dto/MarkType;", "copy", "(Ljava/util/List;Lcom/ybsdk/feature/banners/api/dto/WidgetType;Lcom/ybsdk/feature/banners/api/dto/MarkType;)Lcom/ybsdk/feature/banners/api/dto/MarkEventsRequest;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getIds", "Lcom/ybsdk/feature/banners/api/dto/WidgetType;", "getType", "Lcom/ybsdk/feature/banners/api/dto/MarkType;", "getMark", "Companion", "qw00", "feature-banners-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MarkEventsRequest {
    public static final qw00 Companion = new qw00();
    private final List<String> ids;
    private final MarkType mark;
    private final WidgetType type;

    public MarkEventsRequest(@Json(name = "event_ids") List<String> list, @Json(name = "event_type") WidgetType widgetType, @Json(name = "mark_type") MarkType markType) {
        this.ids = list;
        this.type = widgetType;
        this.mark = markType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarkEventsRequest copy$default(MarkEventsRequest markEventsRequest, List list, WidgetType widgetType, MarkType markType, int i, Object obj) {
        if ((i & 1) != 0) {
            list = markEventsRequest.ids;
        }
        if ((i & 2) != 0) {
            widgetType = markEventsRequest.type;
        }
        if ((i & 4) != 0) {
            markType = markEventsRequest.mark;
        }
        return markEventsRequest.copy(list, widgetType, markType);
    }

    public final List<String> component1() {
        return this.ids;
    }

    /* renamed from: component2, reason: from getter */
    public final WidgetType getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final MarkType getMark() {
        return this.mark;
    }

    public final MarkEventsRequest copy(@Json(name = "event_ids") List<String> ids, @Json(name = "event_type") WidgetType type, @Json(name = "mark_type") MarkType mark) {
        return new MarkEventsRequest(ids, type, mark);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarkEventsRequest)) {
            return false;
        }
        MarkEventsRequest markEventsRequest = (MarkEventsRequest) other;
        return jl40.l(this.ids, markEventsRequest.ids) && this.type == markEventsRequest.type && this.mark == markEventsRequest.mark;
    }

    public final List<String> getIds() {
        return this.ids;
    }

    public final MarkType getMark() {
        return this.mark;
    }

    public final WidgetType getType() {
        return this.type;
    }

    public int hashCode() {
        List<String> list = this.ids;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        WidgetType widgetType = this.type;
        return this.mark.hashCode() + ((hashCode + (widgetType != null ? widgetType.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "MarkEventsRequest(ids=" + this.ids + ", type=" + this.type + ", mark=" + this.mark + Extension.C_BRAKE;
    }
}
