package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.Json;
import com.yandex.messaging.core.net.entities.StateSyncDiff;
import defpackage.cex;
import defpackage.xuf0;

/* loaded from: classes15.dex */
public class StateSync {

    @cex
    @Json(name = "Data")
    @xuf0(encoding = 1, tag = 1)
    public SyncData data;

    public static class SyncData {
        public final StateSyncDiff a;
        public final String b;

        public SyncData(StateSyncDiff stateSyncDiff, String str) {
            this.a = stateSyncDiff;
            this.b = str;
        }
    }
}
