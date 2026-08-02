package com.yandex.messaging.miniapps.js.messages;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.gbb1;
import defpackage.jl40;
import defpackage.unr0;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ&\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u000bJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/yandex/messaging/miniapps/js/messages/MiniAppMessageError;", "", "", Constants.KEY_MESSAGE, "serializeId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Lorg/json/JSONObject;", "obj", "(Lorg/json/JSONObject;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/messaging/miniapps/js/messages/MiniAppMessageError;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "getSerializeId", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class MiniAppMessageError {
    public static final int $stable = 0;
    private final String message;
    private final String serializeId;

    public MiniAppMessageError(JSONObject jSONObject) {
        this(jSONObject.getString(Constants.KEY_MESSAGE), gbb1.a("serializeId", jSONObject));
    }

    public static /* synthetic */ MiniAppMessageError copy$default(MiniAppMessageError miniAppMessageError, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = miniAppMessageError.message;
        }
        if ((i & 2) != 0) {
            str2 = miniAppMessageError.serializeId;
        }
        return miniAppMessageError.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSerializeId() {
        return this.serializeId;
    }

    public final MiniAppMessageError copy(@Json(name = "message") String message, @Json(name = "serializeId") String serializeId) {
        return new MiniAppMessageError(message, serializeId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MiniAppMessageError)) {
            return false;
        }
        MiniAppMessageError miniAppMessageError = (MiniAppMessageError) other;
        return jl40.l(this.message, miniAppMessageError.message) && jl40.l(this.serializeId, miniAppMessageError.serializeId);
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getSerializeId() {
        return this.serializeId;
    }

    public int hashCode() {
        int hashCode = this.message.hashCode() * 31;
        String str = this.serializeId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return unr0.p("MiniAppMessageError(message=", this.message, ", serializeId=", this.serializeId, Extension.C_BRAKE);
    }

    public /* synthetic */ MiniAppMessageError(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }

    public MiniAppMessageError(@Json(name = "message") String str, @Json(name = "serializeId") String str2) {
        this.message = str;
        this.serializeId = str2;
    }
}
