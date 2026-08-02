package com.yandex.messaging.ui.imageviewer;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/messaging/ui/imageviewer/ImageViewerArgs$Sender", "", "Lcom/yandex/messaging/ui/imageviewer/ImageViewerArgs$Sender;", "Chat", "MediaBrowser", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ImageViewerArgs$Sender {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ImageViewerArgs$Sender[] $VALUES;
    public static final ImageViewerArgs$Sender Chat;
    public static final ImageViewerArgs$Sender MediaBrowser;

    static {
        ImageViewerArgs$Sender imageViewerArgs$Sender = new ImageViewerArgs$Sender("Chat", 0);
        Chat = imageViewerArgs$Sender;
        ImageViewerArgs$Sender imageViewerArgs$Sender2 = new ImageViewerArgs$Sender("MediaBrowser", 1);
        MediaBrowser = imageViewerArgs$Sender2;
        ImageViewerArgs$Sender[] imageViewerArgs$SenderArr = {imageViewerArgs$Sender, imageViewerArgs$Sender2};
        $VALUES = imageViewerArgs$SenderArr;
        $ENTRIES = kotlin.enums.a.a(imageViewerArgs$SenderArr);
    }

    public static ImageViewerArgs$Sender valueOf(String str) {
        return (ImageViewerArgs$Sender) Enum.valueOf(ImageViewerArgs$Sender.class, str);
    }

    public static ImageViewerArgs$Sender[] values() {
        return (ImageViewerArgs$Sender[]) $VALUES.clone();
    }
}
