package com.yandex.payment.sdk.model.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.d0k0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB\u001d\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\tJ\u000f\u0010\f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0006\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\r\u0010\u000bJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017¨\u0006\u001e"}, d2 = {"Lcom/yandex/payment/sdk/model/data/ResultScreenClosing;", "Landroid/os/Parcelable;", "", "showButton", "", "delayToAutoHide", "hideSuccessState", "<init>", "(ZJZ)V", "(ZJ)V", "hideFinalState$paymentsdk_release", "()Z", "hideFinalState", "hideSuccessState$paymentsdk_release", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "getShowButton", "J", "getDelayToAutoHide", "()J", "Companion", "d0k0", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ResultScreenClosing implements Parcelable {
    public static final long AUTO_HIDE_DISABLED = -1;
    public static final long HIDE_FINAL_STATE = 0;
    private final long delayToAutoHide;
    private final boolean hideSuccessState;
    private final boolean showButton;
    public static final d0k0 Companion = new d0k0();
    public static final Parcelable.Creator<ResultScreenClosing> CREATOR = new Creator();

    public /* synthetic */ ResultScreenClosing(boolean z, long j, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? -1L : j, (i & 4) != 0 ? false : z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long getDelayToAutoHide() {
        return this.delayToAutoHide;
    }

    public final boolean getShowButton() {
        return this.showButton;
    }

    public final boolean hideFinalState$paymentsdk_release() {
        return this.delayToAutoHide == 0;
    }

    public final boolean hideSuccessState$paymentsdk_release() {
        return this.hideSuccessState || hideFinalState$paymentsdk_release();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.showButton ? 1 : 0);
        dest.writeLong(this.delayToAutoHide);
        dest.writeInt(this.hideSuccessState ? 1 : 0);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ResultScreenClosing> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ResultScreenClosing createFromParcel(Parcel parcel) {
            return new ResultScreenClosing(parcel.readInt() != 0, parcel.readLong(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ResultScreenClosing[] newArray(int i) {
            return new ResultScreenClosing[i];
        }
    }

    public ResultScreenClosing(boolean z, long j, boolean z2) {
        this.showButton = z;
        this.delayToAutoHide = j;
        this.hideSuccessState = z2;
    }

    public ResultScreenClosing() {
        this(false, 0L, false, 7, null);
    }

    public /* synthetic */ ResultScreenClosing(boolean z, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? -1L : j);
    }

    public ResultScreenClosing(boolean z, long j) {
        this(z, j, false);
    }
}
