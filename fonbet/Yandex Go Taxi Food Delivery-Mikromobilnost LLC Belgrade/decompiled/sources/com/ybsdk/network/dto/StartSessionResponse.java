package com.ybsdk.network.dto;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.network.dto.common.Product;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.oyr;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u0002:;B\u008d\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0006HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010.\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\"J\u000b\u00101\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0094\u0001\u00103\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u00104J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u00020\u000fHÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006<"}, d2 = {"Lcom/ybsdk/network/dto/StartSessionResponse;", "", "sessionUUID", "", "yandexUid", "action", "Lcom/ybsdk/network/dto/StartSessionResponse$Action;", Constants.DEEPLINK, "startLandingUrl", "supportUrl", "applications", "", "Lcom/ybsdk/network/dto/StartSessionApplicationResponse;", "authorizationTrackId", "pinAttemptsLeft", "", "actionReason", "Lcom/ybsdk/network/dto/StartSessionResponse$ActionReason;", "productToOpen", "Lcom/ybsdk/network/dto/common/Product;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/network/dto/StartSessionResponse$Action;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Lcom/ybsdk/network/dto/StartSessionResponse$ActionReason;Lcom/ybsdk/network/dto/common/Product;)V", "getSessionUUID", "()Ljava/lang/String;", "getYandexUid", "getAction", "()Lcom/ybsdk/network/dto/StartSessionResponse$Action;", "getDeeplink", "getStartLandingUrl", "getSupportUrl", "getApplications", "()Ljava/util/List;", "getAuthorizationTrackId", "getPinAttemptsLeft", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getActionReason", "()Lcom/ybsdk/network/dto/StartSessionResponse$ActionReason;", "getProductToOpen", "()Lcom/ybsdk/network/dto/common/Product;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/network/dto/StartSessionResponse$Action;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Lcom/ybsdk/network/dto/StartSessionResponse$ActionReason;Lcom/ybsdk/network/dto/common/Product;)Lcom/ybsdk/network/dto/StartSessionResponse;", "equals", "", "other", "hashCode", "toString", "Action", "ActionReason", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class StartSessionResponse {
    private final Action action;
    private final ActionReason actionReason;
    private final List<StartSessionApplicationResponse> applications;
    private final String authorizationTrackId;
    private final String deeplink;
    private final Integer pinAttemptsLeft;
    private final Product productToOpen;
    private final String sessionUUID;
    private final String startLandingUrl;
    private final String supportUrl;
    private final String yandexUid;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/network/dto/StartSessionResponse$Action;", "", "<init>", "(Ljava/lang/String;I)V", JCP.RAW_PREFIX, "AUTHORIZATION", "PASSPORT_REGISTRATION", "OPEN_PRODUCT", "BANK_REGISTRATION", "APPLICATION_STATUS_CHECK", "SUPPORT", "AM_TOKEN_UPDATE", "APP_UPDATE", "PIN_TOKEN_CLEAR", "PIN_TOKEN_REISSUE", "PIN_TOKEN_RETRY", "OPEN_DEEPLINK", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Action {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;
        public static final Action NONE = new Action(JCP.RAW_PREFIX, 0);
        public static final Action AUTHORIZATION = new Action("AUTHORIZATION", 1);
        public static final Action PASSPORT_REGISTRATION = new Action("PASSPORT_REGISTRATION", 2);
        public static final Action OPEN_PRODUCT = new Action("OPEN_PRODUCT", 3);
        public static final Action BANK_REGISTRATION = new Action("BANK_REGISTRATION", 4);
        public static final Action APPLICATION_STATUS_CHECK = new Action("APPLICATION_STATUS_CHECK", 5);
        public static final Action SUPPORT = new Action("SUPPORT", 6);
        public static final Action AM_TOKEN_UPDATE = new Action("AM_TOKEN_UPDATE", 7);
        public static final Action APP_UPDATE = new Action("APP_UPDATE", 8);
        public static final Action PIN_TOKEN_CLEAR = new Action("PIN_TOKEN_CLEAR", 9);
        public static final Action PIN_TOKEN_REISSUE = new Action("PIN_TOKEN_REISSUE", 10);
        public static final Action PIN_TOKEN_RETRY = new Action("PIN_TOKEN_RETRY", 11);
        public static final Action OPEN_DEEPLINK = new Action("OPEN_DEEPLINK", 12);

        private static final /* synthetic */ Action[] $values() {
            return new Action[]{NONE, AUTHORIZATION, PASSPORT_REGISTRATION, OPEN_PRODUCT, BANK_REGISTRATION, APPLICATION_STATUS_CHECK, SUPPORT, AM_TOKEN_UPDATE, APP_UPDATE, PIN_TOKEN_CLEAR, PIN_TOKEN_REISSUE, PIN_TOKEN_RETRY, OPEN_DEEPLINK};
        }

        static {
            Action[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/network/dto/StartSessionResponse$ActionReason;", "", "<init>", "(Ljava/lang/String;I)V", "PIN_TOKEN_REISSUE_TOO_MANY_FAILED_ATTEMPTS", "PIN_TOKEN_REISSUE_REGISTRATION", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class ActionReason {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ActionReason[] $VALUES;
        public static final ActionReason PIN_TOKEN_REISSUE_TOO_MANY_FAILED_ATTEMPTS = new ActionReason("PIN_TOKEN_REISSUE_TOO_MANY_FAILED_ATTEMPTS", 0);
        public static final ActionReason PIN_TOKEN_REISSUE_REGISTRATION = new ActionReason("PIN_TOKEN_REISSUE_REGISTRATION", 1);

        private static final /* synthetic */ ActionReason[] $values() {
            return new ActionReason[]{PIN_TOKEN_REISSUE_TOO_MANY_FAILED_ATTEMPTS, PIN_TOKEN_REISSUE_REGISTRATION};
        }

        static {
            ActionReason[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private ActionReason(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static ActionReason valueOf(String str) {
            return (ActionReason) Enum.valueOf(ActionReason.class, str);
        }

        public static ActionReason[] values() {
            return (ActionReason[]) $VALUES.clone();
        }
    }

    public StartSessionResponse(@Json(name = "JSON_FIELD_YB_SESSION_UUID") String str, @Json(name = "yandex_uid") String str2, @Json(name = "action") Action action, @Json(name = "deeplink") String str3, @Json(name = "landing_url") String str4, @Json(name = "support_url") String str5, @Json(name = "applications") List<StartSessionApplicationResponse> list, @Json(name = "authorization_track_id") String str6, @Json(name = "pin_attempts_left") Integer num, @Json(name = "action_reason") ActionReason actionReason, @Json(name = "product_to_open") Product product) {
        this.sessionUUID = str;
        this.yandexUid = str2;
        this.action = action;
        this.deeplink = str3;
        this.startLandingUrl = str4;
        this.supportUrl = str5;
        this.applications = list;
        this.authorizationTrackId = str6;
        this.pinAttemptsLeft = num;
        this.actionReason = actionReason;
        this.productToOpen = product;
    }

    public static /* synthetic */ StartSessionResponse copy$default(StartSessionResponse startSessionResponse, String str, String str2, Action action, String str3, String str4, String str5, List list, String str6, Integer num, ActionReason actionReason, Product product, int i, Object obj) {
        if ((i & 1) != 0) {
            str = startSessionResponse.sessionUUID;
        }
        if ((i & 2) != 0) {
            str2 = startSessionResponse.yandexUid;
        }
        if ((i & 4) != 0) {
            action = startSessionResponse.action;
        }
        if ((i & 8) != 0) {
            str3 = startSessionResponse.deeplink;
        }
        if ((i & 16) != 0) {
            str4 = startSessionResponse.startLandingUrl;
        }
        if ((i & 32) != 0) {
            str5 = startSessionResponse.supportUrl;
        }
        if ((i & 64) != 0) {
            list = startSessionResponse.applications;
        }
        if ((i & 128) != 0) {
            str6 = startSessionResponse.authorizationTrackId;
        }
        if ((i & 256) != 0) {
            num = startSessionResponse.pinAttemptsLeft;
        }
        if ((i & 512) != 0) {
            actionReason = startSessionResponse.actionReason;
        }
        if ((i & 1024) != 0) {
            product = startSessionResponse.productToOpen;
        }
        ActionReason actionReason2 = actionReason;
        Product product2 = product;
        String str7 = str6;
        Integer num2 = num;
        String str8 = str5;
        List list2 = list;
        String str9 = str4;
        Action action2 = action;
        return startSessionResponse.copy(str, str2, action2, str3, str9, str8, list2, str7, num2, actionReason2, product2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSessionUUID() {
        return this.sessionUUID;
    }

    /* renamed from: component10, reason: from getter */
    public final ActionReason getActionReason() {
        return this.actionReason;
    }

    /* renamed from: component11, reason: from getter */
    public final Product getProductToOpen() {
        return this.productToOpen;
    }

    /* renamed from: component2, reason: from getter */
    public final String getYandexUid() {
        return this.yandexUid;
    }

    /* renamed from: component3, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* renamed from: component5, reason: from getter */
    public final String getStartLandingUrl() {
        return this.startLandingUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSupportUrl() {
        return this.supportUrl;
    }

    public final List<StartSessionApplicationResponse> component7() {
        return this.applications;
    }

    /* renamed from: component8, reason: from getter */
    public final String getAuthorizationTrackId() {
        return this.authorizationTrackId;
    }

    /* renamed from: component9, reason: from getter */
    public final Integer getPinAttemptsLeft() {
        return this.pinAttemptsLeft;
    }

    public final StartSessionResponse copy(@Json(name = "JSON_FIELD_YB_SESSION_UUID") String sessionUUID, @Json(name = "yandex_uid") String yandexUid, @Json(name = "action") Action action, @Json(name = "deeplink") String deeplink, @Json(name = "landing_url") String startLandingUrl, @Json(name = "support_url") String supportUrl, @Json(name = "applications") List<StartSessionApplicationResponse> applications, @Json(name = "authorization_track_id") String authorizationTrackId, @Json(name = "pin_attempts_left") Integer pinAttemptsLeft, @Json(name = "action_reason") ActionReason actionReason, @Json(name = "product_to_open") Product productToOpen) {
        return new StartSessionResponse(sessionUUID, yandexUid, action, deeplink, startLandingUrl, supportUrl, applications, authorizationTrackId, pinAttemptsLeft, actionReason, productToOpen);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StartSessionResponse)) {
            return false;
        }
        StartSessionResponse startSessionResponse = (StartSessionResponse) other;
        return jl40.l(this.sessionUUID, startSessionResponse.sessionUUID) && jl40.l(this.yandexUid, startSessionResponse.yandexUid) && this.action == startSessionResponse.action && jl40.l(this.deeplink, startSessionResponse.deeplink) && jl40.l(this.startLandingUrl, startSessionResponse.startLandingUrl) && jl40.l(this.supportUrl, startSessionResponse.supportUrl) && jl40.l(this.applications, startSessionResponse.applications) && jl40.l(this.authorizationTrackId, startSessionResponse.authorizationTrackId) && jl40.l(this.pinAttemptsLeft, startSessionResponse.pinAttemptsLeft) && this.actionReason == startSessionResponse.actionReason && this.productToOpen == startSessionResponse.productToOpen;
    }

    public final Action getAction() {
        return this.action;
    }

    public final ActionReason getActionReason() {
        return this.actionReason;
    }

    public final List<StartSessionApplicationResponse> getApplications() {
        return this.applications;
    }

    public final String getAuthorizationTrackId() {
        return this.authorizationTrackId;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final Integer getPinAttemptsLeft() {
        return this.pinAttemptsLeft;
    }

    public final Product getProductToOpen() {
        return this.productToOpen;
    }

    public final String getSessionUUID() {
        return this.sessionUUID;
    }

    public final String getStartLandingUrl() {
        return this.startLandingUrl;
    }

    public final String getSupportUrl() {
        return this.supportUrl;
    }

    public final String getYandexUid() {
        return this.yandexUid;
    }

    public int hashCode() {
        int hashCode = this.sessionUUID.hashCode() * 31;
        String str = this.yandexUid;
        int hashCode2 = (this.action.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.deeplink;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.startLandingUrl;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.supportUrl;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<StartSessionApplicationResponse> list = this.applications;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.authorizationTrackId;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.pinAttemptsLeft;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        ActionReason actionReason = this.actionReason;
        int hashCode9 = (hashCode8 + (actionReason == null ? 0 : actionReason.hashCode())) * 31;
        Product product = this.productToOpen;
        return hashCode9 + (product != null ? product.hashCode() : 0);
    }

    public String toString() {
        String str = this.sessionUUID;
        String str2 = this.yandexUid;
        Action action = this.action;
        String str3 = this.deeplink;
        String str4 = this.startLandingUrl;
        String str5 = this.supportUrl;
        List<StartSessionApplicationResponse> list = this.applications;
        String str6 = this.authorizationTrackId;
        Integer num = this.pinAttemptsLeft;
        ActionReason actionReason = this.actionReason;
        Product product = this.productToOpen;
        StringBuilder v = b64.v("StartSessionResponse(sessionUUID=", str, ", yandexUid=", str2, ", action=");
        v.append(action);
        v.append(", deeplink=");
        v.append(str3);
        v.append(", startLandingUrl=");
        g8e.D(v, str4, ", supportUrl=", str5, ", applications=");
        oyr.D(", authorizationTrackId=", str6, ", pinAttemptsLeft=", v, list);
        v.append(num);
        v.append(", actionReason=");
        v.append(actionReason);
        v.append(", productToOpen=");
        v.append(product);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
