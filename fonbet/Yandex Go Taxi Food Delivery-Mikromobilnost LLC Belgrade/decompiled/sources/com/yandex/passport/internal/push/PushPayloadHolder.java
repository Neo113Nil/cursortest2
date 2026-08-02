package com.yandex.passport.internal.push;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b64;
import defpackage.jl40;
import defpackage.qv10;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J0\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0011J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b&\u0010\u0015¨\u0006'"}, d2 = {"Lcom/yandex/passport/internal/push/PushPayloadHolder;", "Landroid/os/Parcelable;", "Lcom/yandex/passport/internal/push/PushPayload;", "pushPayload", "", "passportProcessStarted", "passportProcessFinished", "<init>", "(Lcom/yandex/passport/internal/push/PushPayload;JJ)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/passport/internal/push/PushPayload;", "component2", "()J", "component3", "copy", "(Lcom/yandex/passport/internal/push/PushPayload;JJ)Lcom/yandex/passport/internal/push/PushPayloadHolder;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/passport/internal/push/PushPayload;", "getPushPayload", "J", "getPassportProcessStarted", "getPassportProcessFinished", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PushPayloadHolder implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<PushPayloadHolder> CREATOR = new Creator();
    private final long passportProcessFinished;
    private final long passportProcessStarted;
    private final PushPayload pushPayload;

    public PushPayloadHolder(PushPayload pushPayload, long j, long j2) {
        this.pushPayload = pushPayload;
        this.passportProcessStarted = j;
        this.passportProcessFinished = j2;
    }

    public static /* synthetic */ PushPayloadHolder copy$default(PushPayloadHolder pushPayloadHolder, PushPayload pushPayload, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            pushPayload = pushPayloadHolder.pushPayload;
        }
        if ((i & 2) != 0) {
            j = pushPayloadHolder.passportProcessStarted;
        }
        if ((i & 4) != 0) {
            j2 = pushPayloadHolder.passportProcessFinished;
        }
        return pushPayloadHolder.copy(pushPayload, j, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final PushPayload getPushPayload() {
        return this.pushPayload;
    }

    /* renamed from: component2, reason: from getter */
    public final long getPassportProcessStarted() {
        return this.passportProcessStarted;
    }

    /* renamed from: component3, reason: from getter */
    public final long getPassportProcessFinished() {
        return this.passportProcessFinished;
    }

    public final PushPayloadHolder copy(PushPayload pushPayload, long passportProcessStarted, long passportProcessFinished) {
        return new PushPayloadHolder(pushPayload, passportProcessStarted, passportProcessFinished);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PushPayloadHolder)) {
            return false;
        }
        PushPayloadHolder pushPayloadHolder = (PushPayloadHolder) other;
        return jl40.l(this.pushPayload, pushPayloadHolder.pushPayload) && this.passportProcessStarted == pushPayloadHolder.passportProcessStarted && this.passportProcessFinished == pushPayloadHolder.passportProcessFinished;
    }

    public final long getPassportProcessFinished() {
        return this.passportProcessFinished;
    }

    public final long getPassportProcessStarted() {
        return this.passportProcessStarted;
    }

    public final PushPayload getPushPayload() {
        return this.pushPayload;
    }

    public int hashCode() {
        PushPayload pushPayload = this.pushPayload;
        return Long.hashCode(this.passportProcessFinished) + qv10.c((pushPayload == null ? 0 : pushPayload.hashCode()) * 31, 31, this.passportProcessStarted);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PushPayloadHolder(pushPayload=");
        sb.append(this.pushPayload);
        sb.append(", passportProcessStarted=");
        sb.append(this.passportProcessStarted);
        sb.append(", passportProcessFinished=");
        return b64.o(sb, this.passportProcessFinished, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        PushPayload pushPayload = this.pushPayload;
        if (pushPayload == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            pushPayload.writeToParcel(dest, flags);
        }
        dest.writeLong(this.passportProcessStarted);
        dest.writeLong(this.passportProcessFinished);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PushPayloadHolder> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PushPayloadHolder createFromParcel(Parcel parcel) {
            return new PushPayloadHolder(parcel.readInt() == 0 ? null : PushPayload.CREATOR.createFromParcel(parcel), parcel.readLong(), parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PushPayloadHolder[] newArray(int i) {
            return new PushPayloadHolder[i];
        }
    }
}
