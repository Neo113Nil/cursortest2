package com.ybsdk.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.oyr;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u0002!\"B?\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0003\u0010\b\u001a\u00020\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003JA\u0010\u001b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\b\u001a\u00020\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\tHÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006#"}, d2 = {"Lcom/ybsdk/network/dto/ApplicationSendCodeResponse;", "", ACSPConstants.STATUS, "Lcom/ybsdk/network/dto/ApplicationSendCodeResponse$Status;", "hint", "", "action", "Lcom/ybsdk/network/dto/ApplicationSendCodeResponse$Action;", "seconds", "", "supportUrl", "<init>", "(Lcom/ybsdk/network/dto/ApplicationSendCodeResponse$Status;Ljava/lang/String;Lcom/ybsdk/network/dto/ApplicationSendCodeResponse$Action;ILjava/lang/String;)V", "getStatus", "()Lcom/ybsdk/network/dto/ApplicationSendCodeResponse$Status;", "getHint", "()Ljava/lang/String;", "getAction", "()Lcom/ybsdk/network/dto/ApplicationSendCodeResponse$Action;", "getSeconds", "()I", "getSupportUrl", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "Status", "Action", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ApplicationSendCodeResponse {
    private final Action action;
    private final String hint;
    private final int seconds;
    private final Status status;
    private final String supportUrl;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/network/dto/ApplicationSendCodeResponse$Action;", "", "<init>", "(Ljava/lang/String;I)V", "RETRY", "SUPPORT", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Action {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;
        public static final Action RETRY = new Action("RETRY", 0);
        public static final Action SUPPORT = new Action("SUPPORT", 1);

        private static final /* synthetic */ Action[] $values() {
            return new Action[]{RETRY, SUPPORT};
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
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/network/dto/ApplicationSendCodeResponse$Status;", "", "<init>", "(Ljava/lang/String;I)V", "OK", "FAILED", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Status {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status OK = new Status("OK", 0);
        public static final Status FAILED = new Status("FAILED", 1);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{OK, FAILED};
        }

        static {
            Status[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private Status(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    public /* synthetic */ ApplicationSendCodeResponse(Status status, String str, Action action, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(status, str, action, (i2 & 8) != 0 ? 0 : i, str2);
    }

    public static /* synthetic */ ApplicationSendCodeResponse copy$default(ApplicationSendCodeResponse applicationSendCodeResponse, Status status, String str, Action action, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            status = applicationSendCodeResponse.status;
        }
        if ((i2 & 2) != 0) {
            str = applicationSendCodeResponse.hint;
        }
        if ((i2 & 4) != 0) {
            action = applicationSendCodeResponse.action;
        }
        if ((i2 & 8) != 0) {
            i = applicationSendCodeResponse.seconds;
        }
        if ((i2 & 16) != 0) {
            str2 = applicationSendCodeResponse.supportUrl;
        }
        String str3 = str2;
        Action action2 = action;
        return applicationSendCodeResponse.copy(status, str, action2, i, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    /* renamed from: component3, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    /* renamed from: component4, reason: from getter */
    public final int getSeconds() {
        return this.seconds;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSupportUrl() {
        return this.supportUrl;
    }

    public final ApplicationSendCodeResponse copy(@Json(name = "status") Status status, @Json(name = "hint") String hint, @Json(name = "action") Action action, @Json(name = "seconds") int seconds, @Json(name = "support_url") String supportUrl) {
        return new ApplicationSendCodeResponse(status, hint, action, seconds, supportUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApplicationSendCodeResponse)) {
            return false;
        }
        ApplicationSendCodeResponse applicationSendCodeResponse = (ApplicationSendCodeResponse) other;
        return this.status == applicationSendCodeResponse.status && jl40.l(this.hint, applicationSendCodeResponse.hint) && this.action == applicationSendCodeResponse.action && this.seconds == applicationSendCodeResponse.seconds && jl40.l(this.supportUrl, applicationSendCodeResponse.supportUrl);
    }

    public final Action getAction() {
        return this.action;
    }

    public final String getHint() {
        return this.hint;
    }

    public final int getSeconds() {
        return this.seconds;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final String getSupportUrl() {
        return this.supportUrl;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        String str = this.hint;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Action action = this.action;
        int b = oyr.b(this.seconds, (hashCode2 + (action == null ? 0 : action.hashCode())) * 31, 31);
        String str2 = this.supportUrl;
        return b + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        Status status = this.status;
        String str = this.hint;
        Action action = this.action;
        int i = this.seconds;
        String str2 = this.supportUrl;
        StringBuilder sb = new StringBuilder("ApplicationSendCodeResponse(status=");
        sb.append(status);
        sb.append(", hint=");
        sb.append(str);
        sb.append(", action=");
        sb.append(action);
        sb.append(", seconds=");
        sb.append(i);
        sb.append(", supportUrl=");
        return oyr.t(sb, str2, Extension.C_BRAKE);
    }

    public ApplicationSendCodeResponse(@Json(name = "status") Status status, @Json(name = "hint") String str, @Json(name = "action") Action action, @Json(name = "seconds") int i, @Json(name = "support_url") String str2) {
        this.status = status;
        this.hint = str;
        this.action = action;
        this.seconds = i;
        this.supportUrl = str2;
    }
}
