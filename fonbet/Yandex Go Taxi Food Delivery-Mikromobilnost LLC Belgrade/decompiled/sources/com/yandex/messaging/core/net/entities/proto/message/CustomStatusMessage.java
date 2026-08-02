package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.xuf0;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0016\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J@\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR \u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/CustomStatusMessage;", "", "emoji", "", "text", "localizations", "", "Lcom/yandex/messaging/core/net/entities/proto/message/LocalizationEntry;", "iconName", "<init>", "(Ljava/lang/String;Ljava/lang/String;[Lcom/yandex/messaging/core/net/entities/proto/message/LocalizationEntry;Ljava/lang/String;)V", "getEmoji", "()Ljava/lang/String;", "getText", "getLocalizations", "()[Lcom/yandex/messaging/core/net/entities/proto/message/LocalizationEntry;", "[Lcom/yandex/messaging/core/net/entities/proto/message/LocalizationEntry;", "getIconName", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;[Lcom/yandex/messaging/core/net/entities/proto/message/LocalizationEntry;Ljava/lang/String;)Lcom/yandex/messaging/core/net/entities/proto/message/CustomStatusMessage;", "equals", "", "other", "hashCode", "", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CustomStatusMessage {

    @xuf0(tag = 1)
    private final String emoji;

    @xuf0(tag = 4)
    private final String iconName;

    @xuf0(tag = 3)
    private final LocalizationEntry[] localizations;

    @xuf0(tag = 2)
    private final String text;

    public /* synthetic */ CustomStatusMessage(String str, String str2, LocalizationEntry[] localizationEntryArr, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : localizationEntryArr, (i & 8) != 0 ? null : str3);
    }

    public static /* synthetic */ CustomStatusMessage copy$default(CustomStatusMessage customStatusMessage, String str, String str2, LocalizationEntry[] localizationEntryArr, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customStatusMessage.emoji;
        }
        if ((i & 2) != 0) {
            str2 = customStatusMessage.text;
        }
        if ((i & 4) != 0) {
            localizationEntryArr = customStatusMessage.localizations;
        }
        if ((i & 8) != 0) {
            str3 = customStatusMessage.iconName;
        }
        return customStatusMessage.copy(str, str2, localizationEntryArr, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEmoji() {
        return this.emoji;
    }

    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component3, reason: from getter */
    public final LocalizationEntry[] getLocalizations() {
        return this.localizations;
    }

    /* renamed from: component4, reason: from getter */
    public final String getIconName() {
        return this.iconName;
    }

    public final CustomStatusMessage copy(@Json(name = "Emoji") String emoji, @Json(name = "Text") String text, @Json(name = "Localizations") LocalizationEntry[] localizations, @Json(name = "IconName") String iconName) {
        return new CustomStatusMessage(emoji, text, localizations, iconName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomStatusMessage)) {
            return false;
        }
        CustomStatusMessage customStatusMessage = (CustomStatusMessage) other;
        return jl40.l(this.emoji, customStatusMessage.emoji) && jl40.l(this.text, customStatusMessage.text) && jl40.l(this.localizations, customStatusMessage.localizations) && jl40.l(this.iconName, customStatusMessage.iconName);
    }

    public final String getEmoji() {
        return this.emoji;
    }

    public final String getIconName() {
        return this.iconName;
    }

    public final LocalizationEntry[] getLocalizations() {
        return this.localizations;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int b = unr0.b(this.emoji.hashCode() * 31, 31, this.text);
        LocalizationEntry[] localizationEntryArr = this.localizations;
        int hashCode = (b + (localizationEntryArr == null ? 0 : Arrays.hashCode(localizationEntryArr))) * 31;
        String str = this.iconName;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.emoji;
        String str2 = this.text;
        return g8e.r(b64.v("CustomStatusMessage(emoji=", str, ", text=", str2, ", localizations="), Arrays.toString(this.localizations), ", iconName=", this.iconName, Extension.C_BRAKE);
    }

    public CustomStatusMessage(@Json(name = "Emoji") String str, @Json(name = "Text") String str2, @Json(name = "Localizations") LocalizationEntry[] localizationEntryArr, @Json(name = "IconName") String str3) {
        this.emoji = str;
        this.text = str2;
        this.localizations = localizationEntryArr;
        this.iconName = str3;
    }
}
