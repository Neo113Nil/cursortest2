package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import defpackage.cex;

/* loaded from: classes15.dex */
public class ContactsUploadData {

    public static class Record {

        @cex
        @Json(name = "local_id")
        public String localId;

        @Json(name = "phone_id")
        public String phoneId;
    }
}
