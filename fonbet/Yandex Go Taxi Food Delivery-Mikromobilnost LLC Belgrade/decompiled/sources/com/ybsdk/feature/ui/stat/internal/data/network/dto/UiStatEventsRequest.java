package com.ybsdk.feature.ui.stat.internal.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.nnm;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/ui/stat/internal/data/network/dto/UiStatEventsRequest;", "", "userSessionId", "", "events", "", "Lcom/ybsdk/feature/ui/stat/internal/data/network/dto/UiStatEventDto;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getUserSessionId", "()Ljava/lang/String;", "getEvents", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-ui-stat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class UiStatEventsRequest {

    @Json(name = "events")
    private final List<UiStatEventDto> events;

    @Json(name = "user_session_id")
    private final String userSessionId;

    public UiStatEventsRequest(String str, List<UiStatEventDto> list) {
        this.userSessionId = str;
        this.events = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UiStatEventsRequest copy$default(UiStatEventsRequest uiStatEventsRequest, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uiStatEventsRequest.userSessionId;
        }
        if ((i & 2) != 0) {
            list = uiStatEventsRequest.events;
        }
        return uiStatEventsRequest.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUserSessionId() {
        return this.userSessionId;
    }

    public final List<UiStatEventDto> component2() {
        return this.events;
    }

    public final UiStatEventsRequest copy(String userSessionId, List<UiStatEventDto> events) {
        return new UiStatEventsRequest(userSessionId, events);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiStatEventsRequest)) {
            return false;
        }
        UiStatEventsRequest uiStatEventsRequest = (UiStatEventsRequest) other;
        return jl40.l(this.userSessionId, uiStatEventsRequest.userSessionId) && jl40.l(this.events, uiStatEventsRequest.events);
    }

    public final List<UiStatEventDto> getEvents() {
        return this.events;
    }

    public final String getUserSessionId() {
        return this.userSessionId;
    }

    public int hashCode() {
        return this.events.hashCode() + (this.userSessionId.hashCode() * 31);
    }

    public String toString() {
        return nnm.h("UiStatEventsRequest(userSessionId=", this.userSessionId, ", events=", Extension.C_BRAKE, this.events);
    }
}
