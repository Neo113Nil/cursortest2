package com.yandex.messaging.core.net.entities;

import androidx.core.provider.FontsContractCompat$Columns;
import com.squareup.moshi.Json;
import defpackage.cex;

/* loaded from: classes15.dex */
public class FileUploadResponseData {

    @cex
    @Json(name = FontsContractCompat$Columns.FILE_ID)
    public String id;

    public FileUploadResponseData(String str) {
        this.id = str;
    }
}
