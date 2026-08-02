package com.yandex.messaging.internal.images;

import com.adjust.sdk.Constants;
import ru.yandex.video.m3.list_player_manager.impl.image.GlideBitmapDownloader;
import ru.yandex.video.m3.player.ui.debug.internal.providers.SessionColorProviderImpl;

/* loaded from: classes15.dex */
enum MessengerImageUriHandler$PreviewSize {
    ORIGINAL(GlideBitmapDownloader.URL_SUFFIX_PLACEHOLDER, -1),
    SMALLEST("smallest", 10),
    SMALL_48("small-48", 48),
    SMALL(Constants.SMALL, 150),
    MIDDLE("middle", 250),
    MIDDLE_400("middle-400", Constants.MINIMAL_ERROR_STATUS_CODE),
    MIDDLE_450("middle-450", SessionColorProviderImpl.SHORT_SESSION_MAX_STALLED_LENGTH_MS_YELLOW_BOUND),
    MIDDLE_800("middle-800", 800),
    MIDDLE_2048("middle-2048", 2048),
    MIDDLE_4096("middle-4096", 4096);

    private final int mMaxSize;
    public final String name;

    MessengerImageUriHandler$PreviewSize(String str, int i) {
        this.name = str;
        this.mMaxSize = i;
    }

    public static MessengerImageUriHandler$PreviewSize a(int i, int i2) {
        if (i == -1 && i2 == -1) {
            return ORIGINAL;
        }
        if (i != -1 && i2 != -1) {
            int max = Math.max(i, i2);
            for (MessengerImageUriHandler$PreviewSize messengerImageUriHandler$PreviewSize : values()) {
                if (max < messengerImageUriHandler$PreviewSize.mMaxSize) {
                    return messengerImageUriHandler$PreviewSize;
                }
            }
        }
        return null;
    }
}
