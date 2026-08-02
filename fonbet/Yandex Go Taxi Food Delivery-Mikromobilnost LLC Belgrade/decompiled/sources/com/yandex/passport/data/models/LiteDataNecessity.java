package com.yandex.passport.data.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/yandex/passport/data/models/LiteDataNecessity;", "Landroid/os/Parcelable;", "Lcom/yandex/passport/data/models/LiteDataNecessityState;", "phone", "name", URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD, "<init>", "(Lcom/yandex/passport/data/models/LiteDataNecessityState;Lcom/yandex/passport/data/models/LiteDataNecessityState;Lcom/yandex/passport/data/models/LiteDataNecessityState;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lcom/yandex/passport/data/models/LiteDataNecessityState;", "getPhone", "()Lcom/yandex/passport/data/models/LiteDataNecessityState;", "getName", "getPassword", "Companion", "com/yandex/passport/data/models/i", "passport-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LiteDataNecessity implements Parcelable {
    public static final LiteDataNecessity DEFAULT;
    private final LiteDataNecessityState name;
    private final LiteDataNecessityState password;
    private final LiteDataNecessityState phone;
    public static final i Companion = new i();
    public static final Parcelable.Creator<LiteDataNecessity> CREATOR = new Creator();

    static {
        LiteDataNecessityState liteDataNecessityState = LiteDataNecessityState.NOT_USED;
        DEFAULT = new LiteDataNecessity(liteDataNecessityState, liteDataNecessityState, liteDataNecessityState);
    }

    public LiteDataNecessity(LiteDataNecessityState liteDataNecessityState, LiteDataNecessityState liteDataNecessityState2, LiteDataNecessityState liteDataNecessityState3) {
        this.phone = liteDataNecessityState;
        this.name = liteDataNecessityState2;
        this.password = liteDataNecessityState3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final LiteDataNecessityState getName() {
        return this.name;
    }

    public final LiteDataNecessityState getPassword() {
        return this.password;
    }

    public final LiteDataNecessityState getPhone() {
        return this.phone;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.phone.name());
        dest.writeString(this.name.name());
        dest.writeString(this.password.name());
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LiteDataNecessity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LiteDataNecessity createFromParcel(Parcel parcel) {
            return new LiteDataNecessity(LiteDataNecessityState.valueOf(parcel.readString()), LiteDataNecessityState.valueOf(parcel.readString()), LiteDataNecessityState.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LiteDataNecessity[] newArray(int i) {
            return new LiteDataNecessity[i];
        }
    }
}
