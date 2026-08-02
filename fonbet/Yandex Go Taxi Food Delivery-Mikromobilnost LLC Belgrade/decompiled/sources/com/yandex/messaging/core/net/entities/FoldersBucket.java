package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.yandex.messaging.core.net.entities.StateSyncDiff;
import defpackage.cex;
import java.util.List;
import java.util.Map;

/* loaded from: classes15.dex */
public class FoldersBucket extends Bucket {

    @cex
    @Json(name = "bucket_value")
    public Map<Long, OrganizationFoldersData> orgFolders;

    public static class FolderData {

        @Json(name = "excluded_chat_ids")
        public List<String> excludedChatIds;

        @Json(name = "excluded_type_ids")
        public List<String> excludedFilterIds;

        @Json(name = "icon")
        public FolderIcon icon;

        @Json(name = "id")
        public String id;

        @Json(name = "included_chat_ids")
        public List<String> includedChatIds;

        @Json(name = "included_type_ids")
        public List<String> includedFilterIds;

        @Json(name = "name")
        public String name;
    }

    public static class FolderIcon {

        @Json(name = "value")
        public int value;
    }

    public static class MainFolderConfig {

        @Json(name = "excluded_folder_ids")
        public List<String> excludedFolderIds;
    }

    public static class OrganizationFoldersData {

        @Json(name = "custom_folders")
        public List<FolderData> customFolders;

        @Json(name = "main_folder")
        public MainFolderConfig mainFolder;
    }

    public FoldersBucket() {
        this.bucketName = "folders";
    }

    @Override // com.yandex.messaging.core.net.entities.Bucket
    public final String a() {
        return "folders";
    }

    @Override // com.yandex.messaging.core.net.entities.StateSyncDiff
    public final void sync(StateSyncDiff.Handler handler) {
        handler.h(this);
    }
}
