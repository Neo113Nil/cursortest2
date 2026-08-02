package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.xuf0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/LocalizationEntry;", "", "locale", "", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getLocale", "()Ljava/lang/String;", "getText", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class LocalizationEntry {

    @xuf0(tag = 1)
    private final String locale;

    @xuf0(tag = 2)
    private final String text;

    public LocalizationEntry(@Json(name = "Locale") String str, @Json(name = "Text") String str2) {
        this.locale = str;
        this.text = str2;
    }

    public static /* synthetic */ LocalizationEntry copy$default(LocalizationEntry localizationEntry, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = localizationEntry.locale;
        }
        if ((i & 2) != 0) {
            str2 = localizationEntry.text;
        }
        return localizationEntry.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final LocalizationEntry copy(@Json(name = "Locale") String locale, @Json(name = "Text") String text) {
        return new LocalizationEntry(locale, text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalizationEntry)) {
            return false;
        }
        LocalizationEntry localizationEntry = (LocalizationEntry) other;
        return jl40.l(this.locale, localizationEntry.locale) && jl40.l(this.text, localizationEntry.text);
    }

    public final String getLocale() {
        return this.locale;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.text.hashCode() + (this.locale.hashCode() * 31);
    }

    public String toString() {
        return unr0.p("LocalizationEntry(locale=", this.locale, ", text=", this.text, Extension.C_BRAKE);
    }
}
