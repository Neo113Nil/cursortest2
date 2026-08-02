package com.yandex.messaging.mediaviewer;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0014¨\u0006$"}, d2 = {"Lcom/yandex/messaging/mediaviewer/VideoViewerArgs;", "Lcom/yandex/messaging/mediaviewer/MediaViewerArgs;", "Lcom/yandex/messaging/mediaviewer/MediaViewerInfo;", "mediaViewerInfo", "Lcom/yandex/messaging/mediaviewer/MediaViewerMessageActions;", "mediaViewerMessageActions", "<init>", "(Lcom/yandex/messaging/mediaviewer/MediaViewerInfo;Lcom/yandex/messaging/mediaviewer/MediaViewerMessageActions;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/messaging/mediaviewer/MediaViewerInfo;", "component2", "()Lcom/yandex/messaging/mediaviewer/MediaViewerMessageActions;", "copy", "(Lcom/yandex/messaging/mediaviewer/MediaViewerInfo;Lcom/yandex/messaging/mediaviewer/MediaViewerMessageActions;)Lcom/yandex/messaging/mediaviewer/VideoViewerArgs;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/messaging/mediaviewer/MediaViewerInfo;", "getMediaViewerInfo", "Lcom/yandex/messaging/mediaviewer/MediaViewerMessageActions;", "getMediaViewerMessageActions", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class VideoViewerArgs extends MediaViewerArgs {
    public static final int $stable = 0;
    public static final Parcelable.Creator<VideoViewerArgs> CREATOR = new Creator();
    private final MediaViewerInfo mediaViewerInfo;
    private final MediaViewerMessageActions mediaViewerMessageActions;

    public VideoViewerArgs(MediaViewerInfo mediaViewerInfo, MediaViewerMessageActions mediaViewerMessageActions) {
        super(mediaViewerInfo, mediaViewerMessageActions, null);
        this.mediaViewerInfo = mediaViewerInfo;
        this.mediaViewerMessageActions = mediaViewerMessageActions;
    }

    public static /* synthetic */ VideoViewerArgs copy$default(VideoViewerArgs videoViewerArgs, MediaViewerInfo mediaViewerInfo, MediaViewerMessageActions mediaViewerMessageActions, int i, Object obj) {
        if ((i & 1) != 0) {
            mediaViewerInfo = videoViewerArgs.mediaViewerInfo;
        }
        if ((i & 2) != 0) {
            mediaViewerMessageActions = videoViewerArgs.mediaViewerMessageActions;
        }
        return videoViewerArgs.copy(mediaViewerInfo, mediaViewerMessageActions);
    }

    /* renamed from: component1, reason: from getter */
    public final MediaViewerInfo getMediaViewerInfo() {
        return this.mediaViewerInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final MediaViewerMessageActions getMediaViewerMessageActions() {
        return this.mediaViewerMessageActions;
    }

    public final VideoViewerArgs copy(MediaViewerInfo mediaViewerInfo, MediaViewerMessageActions mediaViewerMessageActions) {
        return new VideoViewerArgs(mediaViewerInfo, mediaViewerMessageActions);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoViewerArgs)) {
            return false;
        }
        VideoViewerArgs videoViewerArgs = (VideoViewerArgs) other;
        return jl40.l(this.mediaViewerInfo, videoViewerArgs.mediaViewerInfo) && jl40.l(this.mediaViewerMessageActions, videoViewerArgs.mediaViewerMessageActions);
    }

    @Override // com.yandex.messaging.mediaviewer.MediaViewerArgs
    public MediaViewerInfo getMediaViewerInfo() {
        return this.mediaViewerInfo;
    }

    @Override // com.yandex.messaging.mediaviewer.MediaViewerArgs
    public MediaViewerMessageActions getMediaViewerMessageActions() {
        return this.mediaViewerMessageActions;
    }

    public int hashCode() {
        return this.mediaViewerMessageActions.hashCode() + (this.mediaViewerInfo.hashCode() * 31);
    }

    public String toString() {
        return "VideoViewerArgs(mediaViewerInfo=" + this.mediaViewerInfo + ", mediaViewerMessageActions=" + this.mediaViewerMessageActions + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        this.mediaViewerInfo.writeToParcel(dest, flags);
        this.mediaViewerMessageActions.writeToParcel(dest, flags);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<VideoViewerArgs> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VideoViewerArgs createFromParcel(Parcel parcel) {
            return new VideoViewerArgs(MediaViewerInfo.CREATOR.createFromParcel(parcel), MediaViewerMessageActions.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VideoViewerArgs[] newArray(int i) {
            return new VideoViewerArgs[i];
        }
    }
}
