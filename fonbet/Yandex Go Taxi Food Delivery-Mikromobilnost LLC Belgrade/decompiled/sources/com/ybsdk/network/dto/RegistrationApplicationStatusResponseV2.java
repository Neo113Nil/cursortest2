package com.ybsdk.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.n;
import defpackage.tse0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001&BW\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003JY\u0010\u001f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00052\u000e\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006'"}, d2 = {"Lcom/ybsdk/network/dto/RegistrationApplicationStatusResponseV2;", "", ACSPConstants.STATUS, "Lcom/ybsdk/network/dto/RegistrationApplicationStatusResponseV2$Status;", "title", "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "image", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "action", "buttons", "", "Lcom/ybsdk/network/dto/RegistrationApplicationButtons;", "<init>", "(Lcom/ybsdk/network/dto/RegistrationApplicationStatusResponseV2$Status;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/lang/String;Ljava/util/List;)V", "getStatus", "()Lcom/ybsdk/network/dto/RegistrationApplicationStatusResponseV2$Status;", "getTitle", "()Ljava/lang/String;", "getDescription", "getImage", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getAction", "getButtons", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "Status", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RegistrationApplicationStatusResponseV2 {
    private final String action;
    private final List<RegistrationApplicationButtons> buttons;
    private final String description;
    private final Themes<String> image;
    private final Status status;
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/ybsdk/network/dto/RegistrationApplicationStatusResponseV2$Status;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "UNKNOWN", "PROCESSING", "FAILED", "SUCCESS", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Status {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        private final String value;
        public static final Status UNKNOWN = new Status("UNKNOWN", 0, "UNKNOWN");
        public static final Status PROCESSING = new Status("PROCESSING", 1, "PROCESSING");
        public static final Status FAILED = new Status("FAILED", 2, "FAILED");
        public static final Status SUCCESS = new Status("SUCCESS", 3, "SUCCESS");

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{UNKNOWN, PROCESSING, FAILED, SUCCESS};
        }

        static {
            Status[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private Status(String str, int i, String str2) {
            this.value = str2;
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

        public final String getValue() {
            return this.value;
        }
    }

    public RegistrationApplicationStatusResponseV2(@Json(name = "status") Status status, @Json(name = "title") String str, @Json(name = "description") String str2, @Json(name = "image") Themes<String> themes, @Json(name = "action") String str3, @Json(name = "buttons") List<RegistrationApplicationButtons> list) {
        this.status = status;
        this.title = str;
        this.description = str2;
        this.image = themes;
        this.action = str3;
        this.buttons = list;
    }

    public static /* synthetic */ RegistrationApplicationStatusResponseV2 copy$default(RegistrationApplicationStatusResponseV2 registrationApplicationStatusResponseV2, Status status, String str, String str2, Themes themes, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            status = registrationApplicationStatusResponseV2.status;
        }
        if ((i & 2) != 0) {
            str = registrationApplicationStatusResponseV2.title;
        }
        if ((i & 4) != 0) {
            str2 = registrationApplicationStatusResponseV2.description;
        }
        if ((i & 8) != 0) {
            themes = registrationApplicationStatusResponseV2.image;
        }
        if ((i & 16) != 0) {
            str3 = registrationApplicationStatusResponseV2.action;
        }
        if ((i & 32) != 0) {
            list = registrationApplicationStatusResponseV2.buttons;
        }
        String str4 = str3;
        List list2 = list;
        return registrationApplicationStatusResponseV2.copy(status, str, str2, themes, str4, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final Themes<String> component4() {
        return this.image;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    public final List<RegistrationApplicationButtons> component6() {
        return this.buttons;
    }

    public final RegistrationApplicationStatusResponseV2 copy(@Json(name = "status") Status status, @Json(name = "title") String title, @Json(name = "description") String description, @Json(name = "image") Themes<String> image, @Json(name = "action") String action, @Json(name = "buttons") List<RegistrationApplicationButtons> buttons) {
        return new RegistrationApplicationStatusResponseV2(status, title, description, image, action, buttons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RegistrationApplicationStatusResponseV2)) {
            return false;
        }
        RegistrationApplicationStatusResponseV2 registrationApplicationStatusResponseV2 = (RegistrationApplicationStatusResponseV2) other;
        return this.status == registrationApplicationStatusResponseV2.status && jl40.l(this.title, registrationApplicationStatusResponseV2.title) && jl40.l(this.description, registrationApplicationStatusResponseV2.description) && jl40.l(this.image, registrationApplicationStatusResponseV2.image) && jl40.l(this.action, registrationApplicationStatusResponseV2.action) && jl40.l(this.buttons, registrationApplicationStatusResponseV2.buttons);
    }

    public final String getAction() {
        return this.action;
    }

    public final List<RegistrationApplicationButtons> getButtons() {
        return this.buttons;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Themes<String> getImage() {
        return this.image;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Themes<String> themes = this.image;
        int hashCode4 = (hashCode3 + (themes == null ? 0 : themes.hashCode())) * 31;
        String str3 = this.action;
        return this.buttons.hashCode() + ((hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public String toString() {
        Status status = this.status;
        String str = this.title;
        String str2 = this.description;
        Themes<String> themes = this.image;
        String str3 = this.action;
        List<RegistrationApplicationButtons> list = this.buttons;
        StringBuilder sb = new StringBuilder("RegistrationApplicationStatusResponseV2(status=");
        sb.append(status);
        sb.append(", title=");
        sb.append(str);
        sb.append(", description=");
        n.B(sb, str2, ", image=", themes, ", action=");
        return tse0.j(str3, ", buttons=", Extension.C_BRAKE, sb, list);
    }
}
