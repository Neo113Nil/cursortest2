package com.yandex.messaging.internal.entities.message.calls;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.w511;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\fB\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u000b\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\rB\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\u000eB9\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u000b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\u000fB\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJJ\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010\u0018J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b/\u0010\u001aR\u0011\u00101\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b0\u0010\u0018¨\u00062"}, d2 = {"Lcom/yandex/messaging/internal/entities/message/calls/CallParams;", "Landroid/os/Parcelable;", "", "deviceId", "Lcom/yandex/messaging/internal/entities/message/calls/CallType;", "type", "deviceTitle", "deviceIconUrl", "payload", "<init>", "(Ljava/lang/String;Lcom/yandex/messaging/internal/entities/message/calls/CallType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "(I)V", "(ILjava/lang/String;)V", "(Lcom/yandex/messaging/internal/entities/message/calls/CallType;Ljava/lang/String;)V", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "(Lcom/yandex/messaging/internal/entities/message/calls/CallType;)V", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Lcom/yandex/messaging/internal/entities/message/calls/CallType;", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Lcom/yandex/messaging/internal/entities/message/calls/CallType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/messaging/internal/entities/message/calls/CallParams;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDeviceId", "Lcom/yandex/messaging/internal/entities/message/calls/CallType;", "getType", "getDeviceTitle", "getDeviceIconUrl", "getPayload", "getTypeInt", "typeInt", "messaging-core-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CallParams implements Parcelable {
    public static final Parcelable.Creator<CallParams> CREATOR = new Creator();
    private final String deviceIconUrl;
    private final String deviceId;
    private final String deviceTitle;
    private final String payload;
    private final CallType type;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[CallType.values().length];
            try {
                iArr[CallType.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CallType.AUDIO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CallParams(String str, int i, String str2, String str3, String str4) {
        this(str, r8, str2, str3, str4);
        CallType callType;
        if (i == 0) {
            callType = CallType.VIDEO;
        } else {
            if (i != 1) {
                ny61.g(String.valueOf(i));
                throw null;
            }
            callType = CallType.AUDIO;
        }
    }

    public static /* synthetic */ CallParams copy$default(CallParams callParams, String str, CallType callType, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = callParams.deviceId;
        }
        if ((i & 2) != 0) {
            callType = callParams.type;
        }
        if ((i & 4) != 0) {
            str2 = callParams.deviceTitle;
        }
        if ((i & 8) != 0) {
            str3 = callParams.deviceIconUrl;
        }
        if ((i & 16) != 0) {
            str4 = callParams.payload;
        }
        String str5 = str4;
        String str6 = str2;
        return callParams.copy(str, callType, str6, str3, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: component2, reason: from getter */
    public final CallType getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDeviceTitle() {
        return this.deviceTitle;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDeviceIconUrl() {
        return this.deviceIconUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPayload() {
        return this.payload;
    }

    public final CallParams copy(String deviceId, CallType type, String deviceTitle, String deviceIconUrl, String payload) {
        return new CallParams(deviceId, type, deviceTitle, deviceIconUrl, payload);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallParams)) {
            return false;
        }
        CallParams callParams = (CallParams) other;
        return jl40.l(this.deviceId, callParams.deviceId) && this.type == callParams.type && jl40.l(this.deviceTitle, callParams.deviceTitle) && jl40.l(this.deviceIconUrl, callParams.deviceIconUrl) && jl40.l(this.payload, callParams.payload);
    }

    public final String getDeviceIconUrl() {
        return this.deviceIconUrl;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getDeviceTitle() {
        return this.deviceTitle;
    }

    public final String getPayload() {
        return this.payload;
    }

    public final CallType getType() {
        return this.type;
    }

    public final int getTypeInt() {
        int i = WhenMappings.a[this.type.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        w511.b();
        return 0;
    }

    public int hashCode() {
        String str = this.deviceId;
        int hashCode = (this.type.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        String str2 = this.deviceTitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.deviceIconUrl;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.payload;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.deviceId;
        CallType callType = this.type;
        String str2 = this.deviceTitle;
        String str3 = this.deviceIconUrl;
        String str4 = this.payload;
        StringBuilder sb = new StringBuilder("CallParams(deviceId=");
        sb.append(str);
        sb.append(", type=");
        sb.append(callType);
        sb.append(", deviceTitle=");
        g8e.D(sb, str2, ", deviceIconUrl=", str3, ", payload=");
        return oyr.t(sb, str4, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.deviceId);
        dest.writeString(this.type.name());
        dest.writeString(this.deviceTitle);
        dest.writeString(this.deviceIconUrl);
        dest.writeString(this.payload);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CallParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CallParams createFromParcel(Parcel parcel) {
            return new CallParams(parcel.readString(), CallType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CallParams[] newArray(int i) {
            return new CallParams[i];
        }
    }

    public CallParams(int i) {
        this((String) null, i, (String) null, (String) null, (String) null);
    }

    public CallParams(int i, String str) {
        this((String) null, i, (String) null, (String) null, str);
    }

    public CallParams(CallType callType, String str) {
        this((String) null, callType, (String) null, (String) null, str);
    }

    public CallParams(String str, CallType callType, String str2, String str3, String str4) {
        this.deviceId = str;
        this.type = callType;
        this.deviceTitle = str2;
        this.deviceIconUrl = str3;
        this.payload = str4;
    }

    public CallParams(CallType callType) {
        this((String) null, callType, (String) null, (String) null, (String) null);
    }
}
