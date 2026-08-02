package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.yandex.messaging.core.net.entities.StateSyncDiff;
import defpackage.cex;

/* loaded from: classes15.dex */
public class PrivacyBucket extends Bucket {

    @cex
    @Json(name = "bucket_value")
    public Value value;

    public static class CallsPrivacyData extends PrivacyData {
        @Override // com.yandex.messaging.core.net.entities.PrivacyBucket.PrivacyData
        public final Object a(PrivacyHandler privacyHandler) {
            return privacyHandler.d();
        }
    }

    public static class InvitesPrivacyData extends PrivacyData {
        @Override // com.yandex.messaging.core.net.entities.PrivacyBucket.PrivacyData
        public final Object a(PrivacyHandler privacyHandler) {
            return privacyHandler.b();
        }
    }

    public static class OnlineStatusPrivacyData extends PrivacyData {
        @Override // com.yandex.messaging.core.net.entities.PrivacyBucket.PrivacyData
        public final Object a(PrivacyHandler privacyHandler) {
            return privacyHandler.e();
        }
    }

    public static abstract class PrivacyData {
        public final Integer a;

        public PrivacyData(Integer num) {
            this.a = num;
        }

        public abstract Object a(PrivacyHandler privacyHandler);
    }

    public interface PrivacyHandler<T> {
        Object a();

        Object b();

        Object c();

        Object d();

        Object e();
    }

    public static class PrivateChatsPrivacyData extends PrivacyData {
        @Override // com.yandex.messaging.core.net.entities.PrivacyBucket.PrivacyData
        public final Object a(PrivacyHandler privacyHandler) {
            return privacyHandler.a();
        }
    }

    public static class SearchPrivacyData extends PrivacyData {
        @Override // com.yandex.messaging.core.net.entities.PrivacyBucket.PrivacyData
        public final Object a(PrivacyHandler privacyHandler) {
            return privacyHandler.c();
        }
    }

    public static final class Value {

        @Json(name = "calls")
        public Integer calls;

        @Json(name = "invites")
        public Integer invites;

        @Json(name = "online_status")
        public Integer onlineStatus;

        @Json(name = "private_chats")
        public Integer privateChats;

        @Json(name = "search")
        public Integer search;
    }

    public PrivacyBucket() {
        this.bucketName = "privacy";
    }

    @Override // com.yandex.messaging.core.net.entities.Bucket
    public final String a() {
        return "privacy";
    }

    @Override // com.yandex.messaging.core.net.entities.StateSyncDiff
    public final void sync(StateSyncDiff.Handler handler) {
        handler.i(this);
    }
}
