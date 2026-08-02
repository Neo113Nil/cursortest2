package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.messaging.core.net.entities.MessengerSupportContext;
import com.yandex.messaging.core.net.entities.directives.Button;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u00016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR&\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR&\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\nR&\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR&\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0019\u0010\u0003\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR&\u0010\u001e\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001f\u0010\u0003\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R0\u0010$\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010&\u0018\u00010%8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010,\u0012\u0004\b'\u0010\u0003\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010-\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%8\u0006@\u0006X\u0087\u000e¢\u0006\n\n\u0002\u0010,\u0012\u0004\b.\u0010\u0003R\"\u0010/\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%8\u0006@\u0006X\u0087\u000e¢\u0006\n\n\u0002\u0010,\u0012\u0004\b0\u0010\u0003R\u001a\u00101\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0000\u0012\u0004\b2\u0010\u0003R\u001a\u00103\u001a\u0004\u0018\u0001048\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0000\u0012\u0004\b5\u0010\u0003¨\u00067"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/CustomPayload;", "", "<init>", "()V", "serviceName", "", "getServiceName$annotations", "getServiceName", "()Ljava/lang/String;", "setServiceName", "(Ljava/lang/String;)V", "userAgent", "getUserAgent$annotations", "getUserAgent", "setUserAgent", "locale", "getLocale$annotations", "getLocale", "setLocale", "target", "getTarget$annotations", "getTarget", "setTarget", "context", "Lcom/yandex/messaging/core/net/entities/MessengerSupportContext;", "getContext$annotations", "getContext", "()Lcom/yandex/messaging/core/net/entities/MessengerSupportContext;", "setContext", "(Lcom/yandex/messaging/core/net/entities/MessengerSupportContext;)V", "callbackData", "getCallbackData$annotations", "getCallbackData", "()Ljava/lang/Object;", "setCallbackData", "(Ljava/lang/Object;)V", "actions", "", "Lcom/yandex/messaging/core/net/entities/directives/Button;", "getActions$annotations", "getActions", "()[Lcom/yandex/messaging/core/net/entities/directives/Button;", "setActions", "([Lcom/yandex/messaging/core/net/entities/directives/Button;)V", "[Lcom/yandex/messaging/core/net/entities/directives/Button;", "suggests", "getSuggests$annotations", "suppressedSuggests", "getSuppressedSuggests$annotations", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "getEvent$annotations", "client", "Lcom/yandex/messaging/core/net/entities/proto/message/CustomPayload$Client;", "getClient$annotations", "Client", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CustomPayload {
    private Button[] actions;
    private Object callbackData;
    public Client client;
    private MessengerSupportContext context;
    public String event;
    private String locale;
    private String serviceName;
    public Button[] suggests;
    public Button[] suppressedSuggests;
    private String target;
    private String userAgent;

    @Json(name = "actions")
    public static /* synthetic */ void getActions$annotations() {
    }

    @Json(name = "callback_data")
    public static /* synthetic */ void getCallbackData$annotations() {
    }

    @Json(name = "client")
    public static /* synthetic */ void getClient$annotations() {
    }

    @Json(name = "context")
    public static /* synthetic */ void getContext$annotations() {
    }

    @Json(name = DatabaseHelper.OttTrackingTable.COLUMN_EVENT)
    public static /* synthetic */ void getEvent$annotations() {
    }

    @Json(name = "locale")
    public static /* synthetic */ void getLocale$annotations() {
    }

    @Json(name = "serviceName")
    public static /* synthetic */ void getServiceName$annotations() {
    }

    @Json(name = "suggest")
    public static /* synthetic */ void getSuggests$annotations() {
    }

    @Json(name = "supressed_suggests")
    public static /* synthetic */ void getSuppressedSuggests$annotations() {
    }

    @Json(name = "target")
    public static /* synthetic */ void getTarget$annotations() {
    }

    @Json(name = "ua")
    public static /* synthetic */ void getUserAgent$annotations() {
    }

    public final Button[] getActions() {
        return this.actions;
    }

    public final Object getCallbackData() {
        return this.callbackData;
    }

    public final MessengerSupportContext getContext() {
        return this.context;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final String getServiceName() {
        return this.serviceName;
    }

    public final String getTarget() {
        return this.target;
    }

    public final String getUserAgent() {
        return this.userAgent;
    }

    public final void setActions(Button[] buttonArr) {
        this.actions = buttonArr;
    }

    public final void setCallbackData(Object obj) {
        this.callbackData = obj;
    }

    public final void setContext(MessengerSupportContext messengerSupportContext) {
        this.context = messengerSupportContext;
    }

    public final void setLocale(String str) {
        this.locale = str;
    }

    public final void setServiceName(String str) {
        this.serviceName = str;
    }

    public final void setTarget(String str) {
        this.target = str;
    }

    public final void setUserAgent(String str) {
        this.userAgent = str;
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/CustomPayload$Client;", "", "serviceName", "", "userAgent", "locale", "target", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getServiceName", "()Ljava/lang/String;", "getUserAgent", "getLocale", "getTarget", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Client {
        private final String locale;
        private final String serviceName;
        private final String target;
        private final String userAgent;

        public /* synthetic */ Client(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
        }

        public static /* synthetic */ Client copy$default(Client client, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = client.serviceName;
            }
            if ((i & 2) != 0) {
                str2 = client.userAgent;
            }
            if ((i & 4) != 0) {
                str3 = client.locale;
            }
            if ((i & 8) != 0) {
                str4 = client.target;
            }
            return client.copy(str, str2, str3, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getServiceName() {
            return this.serviceName;
        }

        /* renamed from: component2, reason: from getter */
        public final String getUserAgent() {
            return this.userAgent;
        }

        /* renamed from: component3, reason: from getter */
        public final String getLocale() {
            return this.locale;
        }

        /* renamed from: component4, reason: from getter */
        public final String getTarget() {
            return this.target;
        }

        public final Client copy(@Json(name = "serviceName") String serviceName, @Json(name = "ua") String userAgent, @Json(name = "locale") String locale, @Json(name = "target") String target) {
            return new Client(serviceName, userAgent, locale, target);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Client)) {
                return false;
            }
            Client client = (Client) other;
            return jl40.l(this.serviceName, client.serviceName) && jl40.l(this.userAgent, client.userAgent) && jl40.l(this.locale, client.locale) && jl40.l(this.target, client.target);
        }

        public final String getLocale() {
            return this.locale;
        }

        public final String getServiceName() {
            return this.serviceName;
        }

        public final String getTarget() {
            return this.target;
        }

        public final String getUserAgent() {
            return this.userAgent;
        }

        public int hashCode() {
            String str = this.serviceName;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.userAgent;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.locale;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.target;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            String str = this.serviceName;
            String str2 = this.userAgent;
            return g8e.r(b64.v("Client(serviceName=", str, ", userAgent=", str2, ", locale="), this.locale, ", target=", this.target, Extension.C_BRAKE);
        }

        public Client(@Json(name = "serviceName") String str, @Json(name = "ua") String str2, @Json(name = "locale") String str3, @Json(name = "target") String str4) {
            this.serviceName = str;
            this.userAgent = str2;
            this.locale = str3;
            this.target = str4;
        }

        public Client() {
            this(null, null, null, null, 15, null);
        }
    }
}
