package com.yandex.messaging.internal.entities;

import androidx.core.provider.FontsContractCompat$Columns;
import com.squareup.moshi.Json;

/* loaded from: classes15.dex */
public abstract class MediaFileMessageData extends MediaMessageData {

    @Json(name = FontsContractCompat$Columns.FILE_ID)
    public String fileId;

    @Json(name = "filename")
    public String fileName;

    @Json(name = "file_source")
    public Integer fileSource;
}
