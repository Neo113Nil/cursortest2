package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import defpackage.cex;
import java.util.Objects;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes15.dex */
public class StickerPacksData {

    public static class PackData {

        @Json(name = "cover")
        public String coverId;

        @Json(name = DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION)
        public String description;

        @cex
        @Json(name = "id")
        public String packId;

        @Json(name = "stickers")
        public StickerData[] stickers;

        @cex
        @Json(name = "title")
        public String title;
    }

    public static class StickerData {

        @cex
        @Json(name = "id")
        public String stickerId;

        @Json(name = "text")
        public String text;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                StickerData stickerData = (StickerData) obj;
                if (Objects.equals(this.stickerId, stickerData.stickerId) && Objects.equals(this.text, stickerData.text)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(this.stickerId, this.text);
        }
    }
}
