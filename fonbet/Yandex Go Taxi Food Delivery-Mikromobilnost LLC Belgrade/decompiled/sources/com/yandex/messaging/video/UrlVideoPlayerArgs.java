package com.yandex.messaging.video;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import defpackage.mi21;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0001,B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0019J\u0010\u0010\u001f\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0015J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u001b¨\u0006-"}, d2 = {"Lcom/yandex/messaging/video/UrlVideoPlayerArgs;", "Landroid/os/Parcelable;", "Landroid/net/Uri;", "videoUri", "", "chatId", "", "messageTimeStamp", "<init>", "(Landroid/net/Uri;Ljava/lang/String;J)V", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Landroid/net/Uri;", "component2", "()Ljava/lang/String;", "component3", "()J", "copy", "(Landroid/net/Uri;Ljava/lang/String;J)Lcom/yandex/messaging/video/UrlVideoPlayerArgs;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/net/Uri;", "getVideoUri", "Ljava/lang/String;", "getChatId", "J", "getMessageTimeStamp", "Companion", "mi21", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class UrlVideoPlayerArgs implements Parcelable {
    public static final int $stable = 8;
    private static final String VIDEO_PARAM = "video_param";
    private final String chatId;
    private final long messageTimeStamp;
    private final Uri videoUri;
    public static final mi21 Companion = new mi21();
    public static final Parcelable.Creator<UrlVideoPlayerArgs> CREATOR = new Creator();

    public UrlVideoPlayerArgs(Uri uri, String str, long j) {
        this.videoUri = uri;
        this.chatId = str;
        this.messageTimeStamp = j;
    }

    public static /* synthetic */ UrlVideoPlayerArgs copy$default(UrlVideoPlayerArgs urlVideoPlayerArgs, Uri uri, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            uri = urlVideoPlayerArgs.videoUri;
        }
        if ((i & 2) != 0) {
            str = urlVideoPlayerArgs.chatId;
        }
        if ((i & 4) != 0) {
            j = urlVideoPlayerArgs.messageTimeStamp;
        }
        return urlVideoPlayerArgs.copy(uri, str, j);
    }

    /* renamed from: component1, reason: from getter */
    public final Uri getVideoUri() {
        return this.videoUri;
    }

    /* renamed from: component2, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    /* renamed from: component3, reason: from getter */
    public final long getMessageTimeStamp() {
        return this.messageTimeStamp;
    }

    public final UrlVideoPlayerArgs copy(Uri videoUri, String chatId, long messageTimeStamp) {
        return new UrlVideoPlayerArgs(videoUri, chatId, messageTimeStamp);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UrlVideoPlayerArgs)) {
            return false;
        }
        UrlVideoPlayerArgs urlVideoPlayerArgs = (UrlVideoPlayerArgs) other;
        return jl40.l(this.videoUri, urlVideoPlayerArgs.videoUri) && jl40.l(this.chatId, urlVideoPlayerArgs.chatId) && this.messageTimeStamp == urlVideoPlayerArgs.messageTimeStamp;
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final long getMessageTimeStamp() {
        return this.messageTimeStamp;
    }

    public final Uri getVideoUri() {
        return this.videoUri;
    }

    public int hashCode() {
        return Long.hashCode(this.messageTimeStamp) + unr0.b(this.videoUri.hashCode() * 31, 31, this.chatId);
    }

    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(VIDEO_PARAM, this);
        return bundle;
    }

    public String toString() {
        Uri uri = this.videoUri;
        String str = this.chatId;
        long j = this.messageTimeStamp;
        StringBuilder sb = new StringBuilder("UrlVideoPlayerArgs(videoUri=");
        sb.append(uri);
        sb.append(", chatId=");
        sb.append(str);
        sb.append(", messageTimeStamp=");
        return oyr.n(j, Extension.C_BRAKE, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.videoUri, flags);
        dest.writeString(this.chatId);
        dest.writeLong(this.messageTimeStamp);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UrlVideoPlayerArgs> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UrlVideoPlayerArgs createFromParcel(Parcel parcel) {
            return new UrlVideoPlayerArgs((Uri) parcel.readParcelable(UrlVideoPlayerArgs.class.getClassLoader()), parcel.readString(), parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UrlVideoPlayerArgs[] newArray(int i) {
            return new UrlVideoPlayerArgs[i];
        }
    }
}
