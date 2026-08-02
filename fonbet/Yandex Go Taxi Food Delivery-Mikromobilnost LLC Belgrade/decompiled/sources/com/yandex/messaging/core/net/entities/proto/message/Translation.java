package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.x4e;
import defpackage.xuf0;
import java.util.Arrays;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0016\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0013JL\u0010\u001a\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR \u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006\""}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/Translation;", "", ACSPConstants.STATUS, "", "text", "", "languageCode", "detectedLanguageCode", "suggests", "", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V", "getStatus", "()J", "getText", "()Ljava/lang/String;", "getLanguageCode", "getDetectedLanguageCode", "getSuggests", "()[Ljava/lang/String;", "[Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/yandex/messaging/core/net/entities/proto/message/Translation;", "equals", "", "other", "hashCode", "", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class Translation {

    @xuf0(tag = 4)
    private final String detectedLanguageCode;

    @xuf0(tag = 3)
    private final String languageCode;

    @xuf0(tag = 1)
    private final long status;

    @xuf0(tag = 5)
    private final String[] suggests;

    @xuf0(tag = 2)
    private final String text;

    public Translation(@Json(name = "Status") long j, @Json(name = "Text") String str, @Json(name = "LanguageCode") String str2, @Json(name = "DetectedLanguageCode") String str3, @Json(name = "InlineButtonsText") String[] strArr) {
        this.status = j;
        this.text = str;
        this.languageCode = str2;
        this.detectedLanguageCode = str3;
        this.suggests = strArr;
    }

    public static /* synthetic */ Translation copy$default(Translation translation, long j, String str, String str2, String str3, String[] strArr, int i, Object obj) {
        if ((i & 1) != 0) {
            j = translation.status;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = translation.text;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = translation.languageCode;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = translation.detectedLanguageCode;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            strArr = translation.suggests;
        }
        return translation.copy(j2, str4, str5, str6, strArr);
    }

    /* renamed from: component1, reason: from getter */
    public final long getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLanguageCode() {
        return this.languageCode;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDetectedLanguageCode() {
        return this.detectedLanguageCode;
    }

    /* renamed from: component5, reason: from getter */
    public final String[] getSuggests() {
        return this.suggests;
    }

    public final Translation copy(@Json(name = "Status") long status, @Json(name = "Text") String text, @Json(name = "LanguageCode") String languageCode, @Json(name = "DetectedLanguageCode") String detectedLanguageCode, @Json(name = "InlineButtonsText") String[] suggests) {
        return new Translation(status, text, languageCode, detectedLanguageCode, suggests);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Translation)) {
            return false;
        }
        Translation translation = (Translation) other;
        return this.status == translation.status && jl40.l(this.text, translation.text) && jl40.l(this.languageCode, translation.languageCode) && jl40.l(this.detectedLanguageCode, translation.detectedLanguageCode) && jl40.l(this.suggests, translation.suggests);
    }

    public final String getDetectedLanguageCode() {
        return this.detectedLanguageCode;
    }

    public final String getLanguageCode() {
        return this.languageCode;
    }

    public final long getStatus() {
        return this.status;
    }

    public final String[] getSuggests() {
        return this.suggests;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.status) * 31;
        String str = this.text;
        int b = unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.languageCode);
        String str2 = this.detectedLanguageCode;
        int hashCode2 = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String[] strArr = this.suggests;
        return hashCode2 + (strArr != null ? Arrays.hashCode(strArr) : 0);
    }

    public String toString() {
        long j = this.status;
        String str = this.text;
        String str2 = this.languageCode;
        String str3 = this.detectedLanguageCode;
        String arrays = Arrays.toString(this.suggests);
        StringBuilder k = x4e.k("Translation(status=", j, ", text=", str);
        g8e.D(k, ", languageCode=", str2, ", detectedLanguageCode=", str3);
        return unr0.r(k, ", suggests=", arrays, Extension.C_BRAKE);
    }
}
