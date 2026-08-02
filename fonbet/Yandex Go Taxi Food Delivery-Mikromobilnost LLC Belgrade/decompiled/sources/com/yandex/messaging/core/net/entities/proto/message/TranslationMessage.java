package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.xuf0;
import kotlin.Metadata;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR \u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/TranslationMessage;", "", "translationWithRef", "Lcom/yandex/messaging/core/net/entities/proto/message/TranslationWithRef;", "forwardedTranslations", "", "<init>", "(Lcom/yandex/messaging/core/net/entities/proto/message/TranslationWithRef;[Lcom/yandex/messaging/core/net/entities/proto/message/TranslationWithRef;)V", "getTranslationWithRef", "()Lcom/yandex/messaging/core/net/entities/proto/message/TranslationWithRef;", "getForwardedTranslations", "()[Lcom/yandex/messaging/core/net/entities/proto/message/TranslationWithRef;", "[Lcom/yandex/messaging/core/net/entities/proto/message/TranslationWithRef;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TranslationMessage {

    @xuf0(tag = 2)
    private final TranslationWithRef[] forwardedTranslations;

    @xuf0(tag = 1)
    private final TranslationWithRef translationWithRef;

    public TranslationMessage(@Json(name = "TranslationWithRef") TranslationWithRef translationWithRef, @Json(name = "ForwardedTranslations") TranslationWithRef[] translationWithRefArr) {
        this.translationWithRef = translationWithRef;
        this.forwardedTranslations = translationWithRefArr;
    }

    public final TranslationWithRef[] getForwardedTranslations() {
        return this.forwardedTranslations;
    }

    public final TranslationWithRef getTranslationWithRef() {
        return this.translationWithRef;
    }
}
