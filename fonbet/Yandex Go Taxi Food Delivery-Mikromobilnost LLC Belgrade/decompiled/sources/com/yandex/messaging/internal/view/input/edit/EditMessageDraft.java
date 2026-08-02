package com.yandex.messaging.internal.view.input.edit;

import com.squareup.moshi.Json;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes15.dex */
public class EditMessageDraft {

    @Json(name = ClidProvider.TIMESTAMP)
    public long messageTimestamp;

    @Json(name = "text")
    public String text;
}
