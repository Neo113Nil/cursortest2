package com.yandex.passport.internal.ui.sloth.ebs;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.sloth.data.SlothParams;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.tse0;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b \u0010!JT\u0010#\u001a\u00020\"2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b%\u0010\u001dJ\u0010\u0010&\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b&\u0010\u0016J\u001a\u0010)\u001a\u00020\u000b2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b2\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u0010\u001fR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b6\u0010!¨\u00067"}, d2 = {"com/yandex/passport/internal/ui/sloth/ebs/BiometricVerificationViewModel$State", "Landroid/os/Parcelable;", "Lcom/yandex/passport/internal/ui/sloth/ebs/EbsProcessState;", "ebsProcessState", "", "countRetryingTrackIdRequests", "resultCode", "", "trackId", "Lcom/yandex/passport/sloth/data/SlothParams;", "slothParams", "", "againInitEbs", "<init>", "(Lcom/yandex/passport/internal/ui/sloth/ebs/EbsProcessState;ILjava/lang/Integer;Ljava/lang/String;Lcom/yandex/passport/sloth/data/SlothParams;Z)V", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/passport/internal/ui/sloth/ebs/EbsProcessState;", "component2", "component3", "()Ljava/lang/Integer;", "component4", "()Ljava/lang/String;", "component5", "()Lcom/yandex/passport/sloth/data/SlothParams;", "component6", "()Z", "Lcom/yandex/passport/internal/ui/sloth/ebs/BiometricVerificationViewModel$State;", "copy", "(Lcom/yandex/passport/internal/ui/sloth/ebs/EbsProcessState;ILjava/lang/Integer;Ljava/lang/String;Lcom/yandex/passport/sloth/data/SlothParams;Z)Lcom/yandex/passport/internal/ui/sloth/ebs/BiometricVerificationViewModel$State;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/passport/internal/ui/sloth/ebs/EbsProcessState;", "getEbsProcessState", CA20Status.STATUS_USER_I, "getCountRetryingTrackIdRequests", "Ljava/lang/Integer;", "getResultCode", "Ljava/lang/String;", "getTrackId", "Lcom/yandex/passport/sloth/data/SlothParams;", "getSlothParams", "Z", "getAgainInitEbs", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BiometricVerificationViewModel$State implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<BiometricVerificationViewModel$State> CREATOR = new Creator();
    private final boolean againInitEbs;
    private final int countRetryingTrackIdRequests;
    private final EbsProcessState ebsProcessState;
    private final Integer resultCode;
    private final SlothParams slothParams;
    private final String trackId;

    public /* synthetic */ BiometricVerificationViewModel$State(EbsProcessState ebsProcessState, int i, Integer num, String str, SlothParams slothParams, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : ebsProcessState, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : slothParams, (i2 & 32) != 0 ? false : z);
    }

    public static /* synthetic */ BiometricVerificationViewModel$State copy$default(BiometricVerificationViewModel$State biometricVerificationViewModel$State, EbsProcessState ebsProcessState, int i, Integer num, String str, SlothParams slothParams, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            ebsProcessState = biometricVerificationViewModel$State.ebsProcessState;
        }
        if ((i2 & 2) != 0) {
            i = biometricVerificationViewModel$State.countRetryingTrackIdRequests;
        }
        if ((i2 & 4) != 0) {
            num = biometricVerificationViewModel$State.resultCode;
        }
        if ((i2 & 8) != 0) {
            str = biometricVerificationViewModel$State.trackId;
        }
        if ((i2 & 16) != 0) {
            slothParams = biometricVerificationViewModel$State.slothParams;
        }
        if ((i2 & 32) != 0) {
            z = biometricVerificationViewModel$State.againInitEbs;
        }
        SlothParams slothParams2 = slothParams;
        boolean z2 = z;
        return biometricVerificationViewModel$State.copy(ebsProcessState, i, num, str, slothParams2, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final EbsProcessState getEbsProcessState() {
        return this.ebsProcessState;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCountRetryingTrackIdRequests() {
        return this.countRetryingTrackIdRequests;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getResultCode() {
        return this.resultCode;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTrackId() {
        return this.trackId;
    }

    /* renamed from: component5, reason: from getter */
    public final SlothParams getSlothParams() {
        return this.slothParams;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getAgainInitEbs() {
        return this.againInitEbs;
    }

    public final BiometricVerificationViewModel$State copy(EbsProcessState ebsProcessState, int countRetryingTrackIdRequests, Integer resultCode, String trackId, SlothParams slothParams, boolean againInitEbs) {
        return new BiometricVerificationViewModel$State(ebsProcessState, countRetryingTrackIdRequests, resultCode, trackId, slothParams, againInitEbs);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BiometricVerificationViewModel$State)) {
            return false;
        }
        BiometricVerificationViewModel$State biometricVerificationViewModel$State = (BiometricVerificationViewModel$State) other;
        return jl40.l(this.ebsProcessState, biometricVerificationViewModel$State.ebsProcessState) && this.countRetryingTrackIdRequests == biometricVerificationViewModel$State.countRetryingTrackIdRequests && jl40.l(this.resultCode, biometricVerificationViewModel$State.resultCode) && jl40.l(this.trackId, biometricVerificationViewModel$State.trackId) && jl40.l(this.slothParams, biometricVerificationViewModel$State.slothParams) && this.againInitEbs == biometricVerificationViewModel$State.againInitEbs;
    }

    public final boolean getAgainInitEbs() {
        return this.againInitEbs;
    }

    public final int getCountRetryingTrackIdRequests() {
        return this.countRetryingTrackIdRequests;
    }

    public final EbsProcessState getEbsProcessState() {
        return this.ebsProcessState;
    }

    public final Integer getResultCode() {
        return this.resultCode;
    }

    public final SlothParams getSlothParams() {
        return this.slothParams;
    }

    public final String getTrackId() {
        return this.trackId;
    }

    public int hashCode() {
        EbsProcessState ebsProcessState = this.ebsProcessState;
        int b = oyr.b(this.countRetryingTrackIdRequests, (ebsProcessState == null ? 0 : ebsProcessState.hashCode()) * 31, 31);
        Integer num = this.resultCode;
        int hashCode = (b + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.trackId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        SlothParams slothParams = this.slothParams;
        return Boolean.hashCode(this.againInitEbs) + ((hashCode2 + (slothParams != null ? slothParams.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("State(ebsProcessState=");
        sb.append(this.ebsProcessState);
        sb.append(", countRetryingTrackIdRequests=");
        sb.append(this.countRetryingTrackIdRequests);
        sb.append(", resultCode=");
        sb.append(this.resultCode);
        sb.append(", trackId=");
        sb.append(this.trackId);
        sb.append(", slothParams=");
        sb.append(this.slothParams);
        sb.append(", againInitEbs=");
        return unr0.u(sb, this.againInitEbs, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.ebsProcessState, flags);
        dest.writeInt(this.countRetryingTrackIdRequests);
        Integer num = this.resultCode;
        if (num == null) {
            dest.writeInt(0);
        } else {
            tse0.v(dest, 1, num);
        }
        dest.writeString(this.trackId);
        dest.writeParcelable(this.slothParams, flags);
        dest.writeInt(this.againInitEbs ? 1 : 0);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BiometricVerificationViewModel$State> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BiometricVerificationViewModel$State createFromParcel(Parcel parcel) {
            return new BiometricVerificationViewModel$State((EbsProcessState) parcel.readParcelable(BiometricVerificationViewModel$State.class.getClassLoader()), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), (SlothParams) parcel.readParcelable(BiometricVerificationViewModel$State.class.getClassLoader()), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BiometricVerificationViewModel$State[] newArray(int i) {
            return new BiometricVerificationViewModel$State[i];
        }
    }

    public BiometricVerificationViewModel$State(EbsProcessState ebsProcessState, int i, Integer num, String str, SlothParams slothParams, boolean z) {
        this.ebsProcessState = ebsProcessState;
        this.countRetryingTrackIdRequests = i;
        this.resultCode = num;
        this.trackId = str;
        this.slothParams = slothParams;
        this.againInitEbs = z;
    }

    public BiometricVerificationViewModel$State() {
        this(null, 0, null, null, null, false, 63, null);
    }
}
