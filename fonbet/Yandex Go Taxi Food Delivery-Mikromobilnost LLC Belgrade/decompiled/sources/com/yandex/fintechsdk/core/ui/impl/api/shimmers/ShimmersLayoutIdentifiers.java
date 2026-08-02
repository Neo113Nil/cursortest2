package com.yandex.fintechsdk.core.ui.impl.api.shimmers;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.tse0;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/fintechsdk/core/ui/impl/api/shimmers/ShimmersLayoutIdentifiers;", "Landroid/os/Parcelable;", "", "backbuttonId", "contentId", "bottomBarId", "<init>", "(IILjava/lang/Integer;)V", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", CA20Status.STATUS_USER_I, "getBackbuttonId", "getContentId", "Ljava/lang/Integer;", "getBottomBarId", "()Ljava/lang/Integer;", "impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ShimmersLayoutIdentifiers implements Parcelable {
    public static final Parcelable.Creator<ShimmersLayoutIdentifiers> CREATOR = new Creator();
    private final int backbuttonId;
    private final Integer bottomBarId;
    private final int contentId;

    public ShimmersLayoutIdentifiers(int i, int i2, Integer num) {
        this.backbuttonId = i;
        this.contentId = i2;
        this.bottomBarId = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int getBackbuttonId() {
        return this.backbuttonId;
    }

    public final Integer getBottomBarId() {
        return this.bottomBarId;
    }

    public final int getContentId() {
        return this.contentId;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.backbuttonId);
        dest.writeInt(this.contentId);
        Integer num = this.bottomBarId;
        if (num == null) {
            dest.writeInt(0);
        } else {
            tse0.v(dest, 1, num);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ShimmersLayoutIdentifiers> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShimmersLayoutIdentifiers createFromParcel(Parcel parcel) {
            return new ShimmersLayoutIdentifiers(parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShimmersLayoutIdentifiers[] newArray(int i) {
            return new ShimmersLayoutIdentifiers[i];
        }
    }
}
