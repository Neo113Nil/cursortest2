package com.yandex.passport.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b64;
import defpackage.gsq0;
import defpackage.psq0;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001c¨\u0006-"}, d2 = {"Lcom/yandex/passport/api/PassportLocation;", "Landroid/os/Parcelable;", "", "value", "<init>", "(J)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(IJLpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$passport_release", "(Lcom/yandex/passport/api/PassportLocation;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()J", "copy", "(J)Lcom/yandex/passport/api/PassportLocation;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getValue", "Companion", "com/yandex/passport/api/a1", "com/yandex/passport/api/b1", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PassportLocation implements Parcelable {
    public static final int $stable = 0;
    private final long value;
    public static final b1 Companion = new b1();
    public static final Parcelable.Creator<PassportLocation> CREATOR = new Creator();

    public /* synthetic */ PassportLocation(int i, long j, psq0 psq0Var) {
        if (1 == (i & 1)) {
            this.value = j;
        } else {
            qje.Z(i, 1, a1.a.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ PassportLocation copy$default(PassportLocation passportLocation, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = passportLocation.value;
        }
        return passportLocation.copy(j);
    }

    /* renamed from: component1, reason: from getter */
    public final long getValue() {
        return this.value;
    }

    public final PassportLocation copy(long value) {
        return new PassportLocation(value);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PassportLocation) && this.value == ((PassportLocation) other).value;
    }

    public final long getValue() {
        return this.value;
    }

    public int hashCode() {
        return Long.hashCode(this.value);
    }

    public String toString() {
        return b64.o(new StringBuilder("PassportLocation(value="), this.value, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(this.value);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PassportLocation> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PassportLocation createFromParcel(Parcel parcel) {
            return new PassportLocation(parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PassportLocation[] newArray(int i) {
            return new PassportLocation[i];
        }
    }

    public PassportLocation(long j) {
        this.value = j;
    }
}
