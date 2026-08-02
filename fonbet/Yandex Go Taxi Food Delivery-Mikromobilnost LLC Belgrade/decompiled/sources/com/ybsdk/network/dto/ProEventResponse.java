package com.ybsdk.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.fex;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.tse0;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\n\u001a\u00020\u0002\u0012\u000e\b\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0012J\u0010\u0010\u0017\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0012J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJt\u0010\u001e\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\n\u001a\u00020\u00022\u000e\b\u0003\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0012J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b+\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b,\u0010\u0012R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b\t\u0010\u0018R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b.\u0010\u0012R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b0\u0010\u001bR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00101\u001a\u0004\b2\u0010\u001d¨\u00063"}, d2 = {"Lcom/ybsdk/network/dto/ProEventResponse;", "", "", "eventId", "eventType", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "action", "", "isClosable", "importance", "", "placement", "Lfex;", "payload", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Lfex;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Z", "component7", "component8", "()Ljava/util/List;", "component9", "()Lfex;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Lfex;)Lcom/ybsdk/network/dto/ProEventResponse;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEventId", "getEventType", "getTitle", "getDescription", "getAction", "Z", "getImportance", "Ljava/util/List;", "getPlacement", "Lfex;", "getPayload", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProEventResponse {
    private final String action;
    private final String description;
    private final String eventId;
    private final String eventType;
    private final String importance;
    private final boolean isClosable;
    private final fex payload;
    private final List<String> placement;
    private final String title;

    public ProEventResponse(@Json(name = "event_id") String str, @Json(name = "event_type") String str2, @Json(name = "title") String str3, @Json(name = "description") String str4, @Json(name = "action") String str5, @Json(name = "is_closable") boolean z, @Json(name = "importance") String str6, @Json(name = "placement") List<String> list, @Json(name = "payload") fex fexVar) {
        this.eventId = str;
        this.eventType = str2;
        this.title = str3;
        this.description = str4;
        this.action = str5;
        this.isClosable = z;
        this.importance = str6;
        this.placement = list;
        this.payload = fexVar;
    }

    public static /* synthetic */ ProEventResponse copy$default(ProEventResponse proEventResponse, String str, String str2, String str3, String str4, String str5, boolean z, String str6, List list, fex fexVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = proEventResponse.eventId;
        }
        if ((i & 2) != 0) {
            str2 = proEventResponse.eventType;
        }
        if ((i & 4) != 0) {
            str3 = proEventResponse.title;
        }
        if ((i & 8) != 0) {
            str4 = proEventResponse.description;
        }
        if ((i & 16) != 0) {
            str5 = proEventResponse.action;
        }
        if ((i & 32) != 0) {
            z = proEventResponse.isClosable;
        }
        if ((i & 64) != 0) {
            str6 = proEventResponse.importance;
        }
        if ((i & 128) != 0) {
            list = proEventResponse.placement;
        }
        if ((i & 256) != 0) {
            fexVar = proEventResponse.payload;
        }
        List list2 = list;
        fex fexVar2 = fexVar;
        boolean z2 = z;
        String str7 = str6;
        String str8 = str5;
        String str9 = str3;
        return proEventResponse.copy(str, str2, str9, str4, str8, z2, str7, list2, fexVar2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsClosable() {
        return this.isClosable;
    }

    /* renamed from: component7, reason: from getter */
    public final String getImportance() {
        return this.importance;
    }

    public final List<String> component8() {
        return this.placement;
    }

    /* renamed from: component9, reason: from getter */
    public final fex getPayload() {
        return this.payload;
    }

    public final ProEventResponse copy(@Json(name = "event_id") String eventId, @Json(name = "event_type") String eventType, @Json(name = "title") String title, @Json(name = "description") String description, @Json(name = "action") String action, @Json(name = "is_closable") boolean isClosable, @Json(name = "importance") String importance, @Json(name = "placement") List<String> placement, @Json(name = "payload") fex payload) {
        return new ProEventResponse(eventId, eventType, title, description, action, isClosable, importance, placement, payload);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProEventResponse)) {
            return false;
        }
        ProEventResponse proEventResponse = (ProEventResponse) other;
        return jl40.l(this.eventId, proEventResponse.eventId) && jl40.l(this.eventType, proEventResponse.eventType) && jl40.l(this.title, proEventResponse.title) && jl40.l(this.description, proEventResponse.description) && jl40.l(this.action, proEventResponse.action) && this.isClosable == proEventResponse.isClosable && jl40.l(this.importance, proEventResponse.importance) && jl40.l(this.placement, proEventResponse.placement) && jl40.l(this.payload, proEventResponse.payload);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getEventType() {
        return this.eventType;
    }

    public final String getImportance() {
        return this.importance;
    }

    public final fex getPayload() {
        return this.payload;
    }

    public final List<String> getPlacement() {
        return this.placement;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int b = unr0.b(unr0.b(unr0.b(this.eventId.hashCode() * 31, 31, this.eventType), 31, this.title), 31, this.description);
        String str = this.action;
        int c = unr0.c(unr0.b(unr0.e((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.isClosable), 31, this.importance), 31, this.placement);
        fex fexVar = this.payload;
        return c + (fexVar != null ? fexVar.a.hashCode() : 0);
    }

    public final boolean isClosable() {
        return this.isClosable;
    }

    public String toString() {
        String str = this.eventId;
        String str2 = this.eventType;
        String str3 = this.title;
        String str4 = this.description;
        String str5 = this.action;
        boolean z = this.isClosable;
        String str6 = this.importance;
        List<String> list = this.placement;
        fex fexVar = this.payload;
        StringBuilder v = b64.v("ProEventResponse(eventId=", str, ", eventType=", str2, ", title=");
        g8e.D(v, str3, ", description=", str4, ", action=");
        tse0.y(str5, ", isClosable=", ", importance=", v, z);
        tse0.x(str6, ", placement=", ", payload=", v, list);
        v.append(fexVar);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
