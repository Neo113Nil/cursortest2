package com.yandex.passport.data.network;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b64;
import defpackage.jl40;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/yandex/passport/data/network/GetTrackFromMagicRequest$State", "Landroid/os/Parcelable;", "<init>", "()V", "Ready", "NotReady", "UnknownState", "Lcom/yandex/passport/data/network/GetTrackFromMagicRequest$State$NotReady;", "Lcom/yandex/passport/data/network/GetTrackFromMagicRequest$State$Ready;", "Lcom/yandex/passport/data/network/GetTrackFromMagicRequest$State$UnknownState;", "passport-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class GetTrackFromMagicRequest$State implements Parcelable {
    public /* synthetic */ GetTrackFromMagicRequest$State(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/passport/data/network/GetTrackFromMagicRequest$State$NotReady;", "Lcom/yandex/passport/data/network/GetTrackFromMagicRequest$State;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "passport-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NotReady extends GetTrackFromMagicRequest$State {
        public static final NotReady INSTANCE = new NotReady();
        public static final Parcelable.Creator<NotReady> CREATOR = new Creator();

        private NotReady() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<NotReady> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NotReady createFromParcel(Parcel parcel) {
                parcel.readInt();
                return NotReady.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NotReady[] newArray(int i) {
                return new NotReady[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/passport/data/network/GetTrackFromMagicRequest$State$Ready;", "Lcom/yandex/passport/data/network/GetTrackFromMagicRequest$State;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "passport-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Ready extends GetTrackFromMagicRequest$State {
        public static final Ready INSTANCE = new Ready();
        public static final Parcelable.Creator<Ready> CREATOR = new Creator();

        private Ready() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Ready> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Ready createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Ready.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Ready[] newArray(int i) {
                return new Ready[i];
            }
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/yandex/passport/data/network/GetTrackFromMagicRequest$State$UnknownState;", "Lcom/yandex/passport/data/network/GetTrackFromMagicRequest$State;", "", ClidProvider.STATE, "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/yandex/passport/data/network/GetTrackFromMagicRequest$State$UnknownState;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getState", "passport-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UnknownState extends GetTrackFromMagicRequest$State {
        public static final Parcelable.Creator<UnknownState> CREATOR = new Creator();
        private final String state;

        public UnknownState(String str) {
            super(null);
            this.state = str;
        }

        public static /* synthetic */ UnknownState copy$default(UnknownState unknownState, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = unknownState.state;
            }
            return unknownState.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getState() {
            return this.state;
        }

        public final UnknownState copy(String state) {
            return new UnknownState(state);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UnknownState) && jl40.l(this.state, ((UnknownState) other).state);
        }

        public final String getState() {
            return this.state;
        }

        public int hashCode() {
            return this.state.hashCode();
        }

        public String toString() {
            return b64.p(new StringBuilder("UnknownState(state="), this.state, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.state);
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<UnknownState> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UnknownState createFromParcel(Parcel parcel) {
                return new UnknownState(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UnknownState[] newArray(int i) {
                return new UnknownState[i];
            }
        }
    }

    private GetTrackFromMagicRequest$State() {
    }
}
