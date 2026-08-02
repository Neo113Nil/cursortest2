package com.yandex.messaging.mediaviewer;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.nnm;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.x4e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014JB\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0012J\u001a\u0010!\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b'\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b(\u0010\u0014¨\u0006)"}, d2 = {"Lcom/yandex/messaging/mediaviewer/MediaViewerMessageActions;", "Landroid/os/Parcelable;", "", "pin", "forward", "reply", "delete", "jumpToMsg", "<init>", "(ZZZZZ)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Z", "component2", "component3", "component4", "component5", "copy", "(ZZZZZ)Lcom/yandex/messaging/mediaviewer/MediaViewerMessageActions;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getPin", "getForward", "getReply", "getDelete", "getJumpToMsg", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class MediaViewerMessageActions implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<MediaViewerMessageActions> CREATOR = new Creator();
    private final boolean delete;
    private final boolean forward;
    private final boolean jumpToMsg;
    private final boolean pin;
    private final boolean reply;

    public /* synthetic */ MediaViewerMessageActions(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3, (i & 8) != 0 ? true : z4, (i & 16) != 0 ? false : z5);
    }

    public static /* synthetic */ MediaViewerMessageActions copy$default(MediaViewerMessageActions mediaViewerMessageActions, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, Object obj) {
        if ((i & 1) != 0) {
            z = mediaViewerMessageActions.pin;
        }
        if ((i & 2) != 0) {
            z2 = mediaViewerMessageActions.forward;
        }
        if ((i & 4) != 0) {
            z3 = mediaViewerMessageActions.reply;
        }
        if ((i & 8) != 0) {
            z4 = mediaViewerMessageActions.delete;
        }
        if ((i & 16) != 0) {
            z5 = mediaViewerMessageActions.jumpToMsg;
        }
        boolean z6 = z5;
        boolean z7 = z3;
        return mediaViewerMessageActions.copy(z, z2, z7, z4, z6);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getPin() {
        return this.pin;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getForward() {
        return this.forward;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getReply() {
        return this.reply;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getDelete() {
        return this.delete;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getJumpToMsg() {
        return this.jumpToMsg;
    }

    public final MediaViewerMessageActions copy(boolean pin, boolean forward, boolean reply, boolean delete, boolean jumpToMsg) {
        return new MediaViewerMessageActions(pin, forward, reply, delete, jumpToMsg);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaViewerMessageActions)) {
            return false;
        }
        MediaViewerMessageActions mediaViewerMessageActions = (MediaViewerMessageActions) other;
        return this.pin == mediaViewerMessageActions.pin && this.forward == mediaViewerMessageActions.forward && this.reply == mediaViewerMessageActions.reply && this.delete == mediaViewerMessageActions.delete && this.jumpToMsg == mediaViewerMessageActions.jumpToMsg;
    }

    public final boolean getDelete() {
        return this.delete;
    }

    public final boolean getForward() {
        return this.forward;
    }

    public final boolean getJumpToMsg() {
        return this.jumpToMsg;
    }

    public final boolean getPin() {
        return this.pin;
    }

    public final boolean getReply() {
        return this.reply;
    }

    public int hashCode() {
        return Boolean.hashCode(this.jumpToMsg) + unr0.e(unr0.e(unr0.e(Boolean.hashCode(this.pin) * 31, 31, this.forward), 31, this.reply), 31, this.delete);
    }

    public String toString() {
        boolean z = this.pin;
        boolean z2 = this.forward;
        boolean z3 = this.reply;
        boolean z4 = this.delete;
        boolean z5 = this.jumpToMsg;
        StringBuilder u = qv10.u("MediaViewerMessageActions(pin=", ", forward=", ", reply=", z, z2);
        nnm.v(", delete=", ", jumpToMsg=", u, z3, z4);
        return x4e.i(u, z5, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.pin ? 1 : 0);
        dest.writeInt(this.forward ? 1 : 0);
        dest.writeInt(this.reply ? 1 : 0);
        dest.writeInt(this.delete ? 1 : 0);
        dest.writeInt(this.jumpToMsg ? 1 : 0);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MediaViewerMessageActions> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MediaViewerMessageActions createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5 = false;
            boolean z6 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z5 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z6 = z;
            }
            if (parcel.readInt() != 0) {
                z3 = z2;
            } else {
                z3 = z2;
                z2 = z;
            }
            if (parcel.readInt() != 0) {
                z4 = z3;
            } else {
                z4 = z3;
                z3 = z;
            }
            if (parcel.readInt() == 0) {
                z4 = z;
            }
            return new MediaViewerMessageActions(z5, z6, z2, z3, z4);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MediaViewerMessageActions[] newArray(int i) {
            return new MediaViewerMessageActions[i];
        }
    }

    public MediaViewerMessageActions(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.pin = z;
        this.forward = z2;
        this.reply = z3;
        this.delete = z4;
        this.jumpToMsg = z5;
    }

    public MediaViewerMessageActions() {
        this(false, false, false, false, false, 31, null);
    }
}
