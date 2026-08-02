package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;

/* loaded from: classes15.dex */
public class ContactsUploadParam {

    @Json(name = "api_version")
    public final String apiVersion = "2";

    @Json(name = "deleted")
    public final String[] deleted;

    @Json(name = "first_upload")
    public final boolean isFirstUpload;

    @Json(name = "uploaded")
    public final Record[] uploaded;

    @Json(name = "uuid")
    public final String uuid;

    public static class Record {

        @Json(name = "contact_name")
        public final String contactName;

        @Json(name = "local_id")
        public final String localId;

        @Json(name = "phone")
        public final String phone;

        public Record(String str, String str2, String str3) {
            this.localId = str;
            this.contactName = str2;
            this.phone = str3;
        }
    }

    public ContactsUploadParam(String str, boolean z, Record[] recordArr, String[] strArr) {
        this.uuid = str;
        this.isFirstUpload = z;
        this.uploaded = recordArr;
        this.deleted = strArr;
    }
}
