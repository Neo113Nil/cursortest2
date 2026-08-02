package com.yandex.passport.internal.provider.communication;

import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.b64;
import defpackage.jl40;
import defpackage.wwg;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00072\u00020\u0001:\u0003\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lcom/yandex/passport/internal/provider/communication/HostResponse;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Message;", "toMessage", "()Landroid/os/Message;", "Companion", "Ok", "PushTokenResponse", "com/yandex/passport/internal/provider/communication/g", "Lcom/yandex/passport/internal/provider/communication/HostResponse$Ok;", "Lcom/yandex/passport/internal/provider/communication/HostResponse$PushTokenResponse;", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class HostResponse implements Parcelable {
    public static final int $stable = 0;
    public static final g Companion = new g();
    private static final String IPC_RESPONSE = "HostResponse";
    private static final int WHAT = 110;

    public /* synthetic */ HostResponse(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final Message toMessage() {
        return Message.obtain(null, 110, wwg.g(new Pair(IPC_RESPONSE, this)));
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/passport/internal/provider/communication/HostResponse$Ok;", "Lcom/yandex/passport/internal/provider/communication/HostResponse;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Ok extends HostResponse {
        public static final int $stable = 0;
        public static final Ok INSTANCE = new Ok();
        public static final Parcelable.Creator<Ok> CREATOR = new Creator();

        private Ok() {
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
        public static final class Creator implements Parcelable.Creator<Ok> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Ok createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Ok.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Ok[] newArray(int i) {
                return new Ok[i];
            }
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/yandex/passport/internal/provider/communication/HostResponse$PushTokenResponse;", "Lcom/yandex/passport/internal/provider/communication/HostResponse;", "", AuthSdkActivity.RESPONSE_TYPE_TOKEN, "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/yandex/passport/internal/provider/communication/HostResponse$PushTokenResponse;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getToken", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final /* data */ class PushTokenResponse extends HostResponse {
        public static final int $stable = 0;
        public static final Parcelable.Creator<PushTokenResponse> CREATOR = new Creator();
        private final String token;

        public PushTokenResponse(String str) {
            super(null);
            this.token = str;
        }

        public static /* synthetic */ PushTokenResponse copy$default(PushTokenResponse pushTokenResponse, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = pushTokenResponse.token;
            }
            return pushTokenResponse.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getToken() {
            return this.token;
        }

        public final PushTokenResponse copy(String token) {
            return new PushTokenResponse(token);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PushTokenResponse) && jl40.l(this.token, ((PushTokenResponse) other).token);
        }

        public final String getToken() {
            return this.token;
        }

        public int hashCode() {
            String str = this.token;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return b64.p(new StringBuilder("PushTokenResponse(token="), this.token, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.token);
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PushTokenResponse> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PushTokenResponse createFromParcel(Parcel parcel) {
                return new PushTokenResponse(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PushTokenResponse[] newArray(int i) {
                return new PushTokenResponse[i];
            }
        }
    }

    private HostResponse() {
    }
}
