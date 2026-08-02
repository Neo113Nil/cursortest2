package com.yandex.messaging.internal.entities;

import com.squareup.moshi.Json;
import com.yandex.messaging.internal.entities.MediaMessageData;
import java.util.Map;

/* loaded from: classes15.dex */
public class DivMessageData extends MediaMessageData {

    @Json(name = "card")
    public Map card;

    public DivMessageData(String str) {
        super(7, str);
    }

    @Override // com.yandex.messaging.internal.entities.MediaMessageData
    public final Object a(MediaMessageData.MessageHandler messageHandler) {
        return messageHandler.d(this);
    }

    public DivMessageData() {
    }
}
