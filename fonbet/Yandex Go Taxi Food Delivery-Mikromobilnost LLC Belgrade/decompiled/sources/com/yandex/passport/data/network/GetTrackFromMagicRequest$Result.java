package com.yandex.passport.data.network;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J\u0010\u0010\u0019\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0010J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0014¨\u0006#"}, d2 = {"com/yandex/passport/data/network/GetTrackFromMagicRequest$Result", "Landroid/os/Parcelable;", "", "trackId", "Lcom/yandex/passport/data/network/GetTrackFromMagicRequest$State;", ClidProvider.STATE, "<init>", "(Ljava/lang/String;Lcom/yandex/passport/data/network/GetTrackFromMagicRequest$State;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Lcom/yandex/passport/data/network/GetTrackFromMagicRequest$State;", "Lcom/yandex/passport/data/network/GetTrackFromMagicRequest$Result;", "copy", "(Ljava/lang/String;Lcom/yandex/passport/data/network/GetTrackFromMagicRequest$State;)Lcom/yandex/passport/data/network/GetTrackFromMagicRequest$Result;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTrackId", "Lcom/yandex/passport/data/network/GetTrackFromMagicRequest$State;", "getState", "passport-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class GetTrackFromMagicRequest$Result implements Parcelable {
    public static final Parcelable.Creator<GetTrackFromMagicRequest$Result> CREATOR = new Creator();
    private final GetTrackFromMagicRequest$State state;
    private final String trackId;

    public GetTrackFromMagicRequest$Result(String str, GetTrackFromMagicRequest$State getTrackFromMagicRequest$State) {
        this.trackId = str;
        this.state = getTrackFromMagicRequest$State;
    }

    public static /* synthetic */ GetTrackFromMagicRequest$Result copy$default(GetTrackFromMagicRequest$Result getTrackFromMagicRequest$Result, String str, GetTrackFromMagicRequest$State getTrackFromMagicRequest$State, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getTrackFromMagicRequest$Result.trackId;
        }
        if ((i & 2) != 0) {
            getTrackFromMagicRequest$State = getTrackFromMagicRequest$Result.state;
        }
        return getTrackFromMagicRequest$Result.copy(str, getTrackFromMagicRequest$State);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTrackId() {
        return this.trackId;
    }

    /* renamed from: component2, reason: from getter */
    public final GetTrackFromMagicRequest$State getState() {
        return this.state;
    }

    public final GetTrackFromMagicRequest$Result copy(String trackId, GetTrackFromMagicRequest$State state) {
        return new GetTrackFromMagicRequest$Result(trackId, state);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetTrackFromMagicRequest$Result)) {
            return false;
        }
        GetTrackFromMagicRequest$Result getTrackFromMagicRequest$Result = (GetTrackFromMagicRequest$Result) other;
        return jl40.l(this.trackId, getTrackFromMagicRequest$Result.trackId) && jl40.l(this.state, getTrackFromMagicRequest$Result.state);
    }

    public final GetTrackFromMagicRequest$State getState() {
        return this.state;
    }

    public final String getTrackId() {
        return this.trackId;
    }

    public int hashCode() {
        return this.state.hashCode() + (this.trackId.hashCode() * 31);
    }

    public String toString() {
        return "Result(trackId=" + this.trackId + ", state=" + this.state + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.trackId);
        dest.writeParcelable(this.state, flags);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GetTrackFromMagicRequest$Result> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GetTrackFromMagicRequest$Result createFromParcel(Parcel parcel) {
            return new GetTrackFromMagicRequest$Result(parcel.readString(), (GetTrackFromMagicRequest$State) parcel.readParcelable(GetTrackFromMagicRequest$Result.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GetTrackFromMagicRequest$Result[] newArray(int i) {
            return new GetTrackFromMagicRequest$Result[i];
        }
    }
}
