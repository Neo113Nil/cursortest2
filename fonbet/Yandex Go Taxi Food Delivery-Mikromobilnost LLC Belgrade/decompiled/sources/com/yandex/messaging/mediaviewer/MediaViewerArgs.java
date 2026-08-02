package com.yandex.messaging.mediaviewer;

import android.os.Bundle;
import android.os.Parcelable;
import defpackage.yg10;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\u0082\u0001\u0002\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/yandex/messaging/mediaviewer/MediaViewerArgs;", "Landroid/os/Parcelable;", "Lcom/yandex/messaging/mediaviewer/MediaViewerInfo;", "mediaViewerInfo", "Lcom/yandex/messaging/mediaviewer/MediaViewerMessageActions;", "mediaViewerMessageActions", "<init>", "(Lcom/yandex/messaging/mediaviewer/MediaViewerInfo;Lcom/yandex/messaging/mediaviewer/MediaViewerMessageActions;)V", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Lcom/yandex/messaging/mediaviewer/MediaViewerInfo;", "getMediaViewerInfo", "()Lcom/yandex/messaging/mediaviewer/MediaViewerInfo;", "Lcom/yandex/messaging/mediaviewer/MediaViewerMessageActions;", "getMediaViewerMessageActions", "()Lcom/yandex/messaging/mediaviewer/MediaViewerMessageActions;", "Companion", "yg10", "Lcom/yandex/messaging/mediaviewer/DocViewerArgs;", "Lcom/yandex/messaging/mediaviewer/VideoViewerArgs;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class MediaViewerArgs implements Parcelable {
    public static final int $stable = 0;
    public static final yg10 Companion = new yg10();
    public static final String MEDIA_VIEWER_INFO = "media_viewer_info";
    private static final String PARAM = "media_viewer_args_param";
    private final MediaViewerInfo mediaViewerInfo;
    private final MediaViewerMessageActions mediaViewerMessageActions;

    private MediaViewerArgs(MediaViewerInfo mediaViewerInfo, MediaViewerMessageActions mediaViewerMessageActions) {
        this.mediaViewerInfo = mediaViewerInfo;
        this.mediaViewerMessageActions = mediaViewerMessageActions;
    }

    public MediaViewerInfo getMediaViewerInfo() {
        return this.mediaViewerInfo;
    }

    public MediaViewerMessageActions getMediaViewerMessageActions() {
        return this.mediaViewerMessageActions;
    }

    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(PARAM, this);
        return bundle;
    }

    public /* synthetic */ MediaViewerArgs(MediaViewerInfo mediaViewerInfo, MediaViewerMessageActions mediaViewerMessageActions, DefaultConstructorMarker defaultConstructorMarker) {
        this(mediaViewerInfo, mediaViewerMessageActions);
    }
}
