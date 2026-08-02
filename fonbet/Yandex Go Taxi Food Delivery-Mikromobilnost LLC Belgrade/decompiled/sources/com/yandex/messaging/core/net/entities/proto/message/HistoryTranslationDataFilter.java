package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.xuf0;
import kotlin.Metadata;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR \u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/HistoryTranslationDataFilter;", "", "languageCode", "", "translationFor", "", "", "<init>", "(Ljava/lang/String;[Ljava/lang/Long;)V", "getLanguageCode", "()Ljava/lang/String;", "getTranslationFor", "()[Ljava/lang/Long;", "[Ljava/lang/Long;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class HistoryTranslationDataFilter {

    @xuf0(tag = 1)
    private final String languageCode;

    @xuf0(tag = 2)
    private final Long[] translationFor;

    public HistoryTranslationDataFilter(@Json(name = "LanguageCode") String str, @Json(name = "TranslationFor") Long[] lArr) {
        this.languageCode = str;
        this.translationFor = lArr;
    }

    public final String getLanguageCode() {
        return this.languageCode;
    }

    public final Long[] getTranslationFor() {
        return this.translationFor;
    }
}
