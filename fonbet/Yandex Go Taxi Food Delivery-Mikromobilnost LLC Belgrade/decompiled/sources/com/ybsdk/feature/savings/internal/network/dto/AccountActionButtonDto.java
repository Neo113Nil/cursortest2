package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001bB3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/AccountActionButtonDto;", "", "text", "", "subtitle", "action", ACSPConstants.STATUS, "Lcom/ybsdk/feature/savings/internal/network/dto/AccountActionButtonDto$Status;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/savings/internal/network/dto/AccountActionButtonDto$Status;)V", "getText", "()Ljava/lang/String;", "getSubtitle", "getAction", "getStatus", "()Lcom/ybsdk/feature/savings/internal/network/dto/AccountActionButtonDto$Status;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Status", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AccountActionButtonDto {
    private final String action;
    private final Status status;
    private final String subtitle;
    private final String text;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/AccountActionButtonDto$Status;", "", "<init>", "(Ljava/lang/String;I)V", "LOCKED", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Status {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status LOCKED = new Status("LOCKED", 0);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{LOCKED};
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

    public AccountActionButtonDto(@Json(name = "text") String str, @Json(name = "subtitle") String str2, @Json(name = "action") String str3, @Json(name = "status") Status status) {
        this.text = str;
        this.subtitle = str2;
        this.action = str3;
        this.status = status;
    }

    public static /* synthetic */ AccountActionButtonDto copy$default(AccountActionButtonDto accountActionButtonDto, String str, String str2, String str3, Status status, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accountActionButtonDto.text;
        }
        if ((i & 2) != 0) {
            str2 = accountActionButtonDto.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = accountActionButtonDto.action;
        }
        if ((i & 8) != 0) {
            status = accountActionButtonDto.status;
        }
        return accountActionButtonDto.copy(str, str2, str3, status);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* renamed from: component4, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    public final AccountActionButtonDto copy(@Json(name = "text") String text, @Json(name = "subtitle") String subtitle, @Json(name = "action") String action, @Json(name = "status") Status status) {
        return new AccountActionButtonDto(text, subtitle, action, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountActionButtonDto)) {
            return false;
        }
        AccountActionButtonDto accountActionButtonDto = (AccountActionButtonDto) other;
        return jl40.l(this.text, accountActionButtonDto.text) && jl40.l(this.subtitle, accountActionButtonDto.subtitle) && jl40.l(this.action, accountActionButtonDto.action) && this.status == accountActionButtonDto.status;
    }

    public final String getAction() {
        return this.action;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        String str = this.subtitle;
        int b = unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.action);
        Status status = this.status;
        return b + (status != null ? status.hashCode() : 0);
    }

    public String toString() {
        String str = this.text;
        String str2 = this.subtitle;
        String str3 = this.action;
        Status status = this.status;
        StringBuilder v = b64.v("AccountActionButtonDto(text=", str, ", subtitle=", str2, ", action=");
        v.append(str3);
        v.append(", status=");
        v.append(status);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
