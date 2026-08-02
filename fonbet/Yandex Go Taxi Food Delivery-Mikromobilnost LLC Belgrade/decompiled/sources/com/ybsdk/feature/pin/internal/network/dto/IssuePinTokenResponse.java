package com.ybsdk.feature.pin.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u001a\u001bB)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/feature/pin/internal/network/dto/IssuePinTokenResponse;", "", "action", "Lcom/ybsdk/feature/pin/internal/network/dto/IssuePinTokenResponse$Action;", "authorizationTrackId", "", "pinToken", "Lcom/ybsdk/feature/pin/internal/network/dto/IssuePinTokenResponse$PinTokenResponse;", "<init>", "(Lcom/ybsdk/feature/pin/internal/network/dto/IssuePinTokenResponse$Action;Ljava/lang/String;Lcom/ybsdk/feature/pin/internal/network/dto/IssuePinTokenResponse$PinTokenResponse;)V", "getAction", "()Lcom/ybsdk/feature/pin/internal/network/dto/IssuePinTokenResponse$Action;", "getAuthorizationTrackId", "()Ljava/lang/String;", "getPinToken", "()Lcom/ybsdk/feature/pin/internal/network/dto/IssuePinTokenResponse$PinTokenResponse;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "PinTokenResponse", "Action", "feature-pin_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class IssuePinTokenResponse {
    private final Action action;
    private final String authorizationTrackId;
    private final PinTokenResponse pinToken;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/pin/internal/network/dto/IssuePinTokenResponse$Action;", "", "<init>", "(Ljava/lang/String;I)V", JCP.RAW_PREFIX, "AUTHORIZATION", "feature-pin_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Action {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;
        public static final Action NONE = new Action(JCP.RAW_PREFIX, 0);
        public static final Action AUTHORIZATION = new Action("AUTHORIZATION", 1);

        private static final /* synthetic */ Action[] $values() {
            return new Action[]{NONE, AUTHORIZATION};
        }

        static {
            Action[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private Action(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/pin/internal/network/dto/IssuePinTokenResponse$PinTokenResponse;", "", "id", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-pin_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PinTokenResponse {
        private final String id;
        private final String value;

        public PinTokenResponse(@Json(name = "id") String str, @Json(name = "value") String str2) {
            this.id = str;
            this.value = str2;
        }

        public static /* synthetic */ PinTokenResponse copy$default(PinTokenResponse pinTokenResponse, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = pinTokenResponse.id;
            }
            if ((i & 2) != 0) {
                str2 = pinTokenResponse.value;
            }
            return pinTokenResponse.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public final PinTokenResponse copy(@Json(name = "id") String id, @Json(name = "value") String value) {
            return new PinTokenResponse(id, value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PinTokenResponse)) {
                return false;
            }
            PinTokenResponse pinTokenResponse = (PinTokenResponse) other;
            return jl40.l(this.id, pinTokenResponse.id) && jl40.l(this.value, pinTokenResponse.value);
        }

        public final String getId() {
            return this.id;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode() + (this.id.hashCode() * 31);
        }

        public String toString() {
            return unr0.p("PinTokenResponse(id=", this.id, ", value=", this.value, Extension.C_BRAKE);
        }
    }

    public IssuePinTokenResponse(@Json(name = "action") Action action, @Json(name = "authorization_track_id") String str, @Json(name = "pin_token") PinTokenResponse pinTokenResponse) {
        this.action = action;
        this.authorizationTrackId = str;
        this.pinToken = pinTokenResponse;
    }

    public static /* synthetic */ IssuePinTokenResponse copy$default(IssuePinTokenResponse issuePinTokenResponse, Action action, String str, PinTokenResponse pinTokenResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            action = issuePinTokenResponse.action;
        }
        if ((i & 2) != 0) {
            str = issuePinTokenResponse.authorizationTrackId;
        }
        if ((i & 4) != 0) {
            pinTokenResponse = issuePinTokenResponse.pinToken;
        }
        return issuePinTokenResponse.copy(action, str, pinTokenResponse);
    }

    /* renamed from: component1, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAuthorizationTrackId() {
        return this.authorizationTrackId;
    }

    /* renamed from: component3, reason: from getter */
    public final PinTokenResponse getPinToken() {
        return this.pinToken;
    }

    public final IssuePinTokenResponse copy(@Json(name = "action") Action action, @Json(name = "authorization_track_id") String authorizationTrackId, @Json(name = "pin_token") PinTokenResponse pinToken) {
        return new IssuePinTokenResponse(action, authorizationTrackId, pinToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IssuePinTokenResponse)) {
            return false;
        }
        IssuePinTokenResponse issuePinTokenResponse = (IssuePinTokenResponse) other;
        return this.action == issuePinTokenResponse.action && jl40.l(this.authorizationTrackId, issuePinTokenResponse.authorizationTrackId) && jl40.l(this.pinToken, issuePinTokenResponse.pinToken);
    }

    public final Action getAction() {
        return this.action;
    }

    public final String getAuthorizationTrackId() {
        return this.authorizationTrackId;
    }

    public final PinTokenResponse getPinToken() {
        return this.pinToken;
    }

    public int hashCode() {
        int hashCode = this.action.hashCode() * 31;
        String str = this.authorizationTrackId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        PinTokenResponse pinTokenResponse = this.pinToken;
        return hashCode2 + (pinTokenResponse != null ? pinTokenResponse.hashCode() : 0);
    }

    public String toString() {
        return "IssuePinTokenResponse(action=" + this.action + ", authorizationTrackId=" + this.authorizationTrackId + ", pinToken=" + this.pinToken + Extension.C_BRAKE;
    }
}
