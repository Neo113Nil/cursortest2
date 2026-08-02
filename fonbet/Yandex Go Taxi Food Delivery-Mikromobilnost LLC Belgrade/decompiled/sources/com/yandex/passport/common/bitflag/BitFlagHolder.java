package com.yandex.passport.common.bitflag;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ \u0010\u0010\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0012J\r\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\u001cR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\"¨\u0006#"}, d2 = {"Lcom/yandex/passport/common/bitflag/BitFlagHolder;", "Landroid/os/Parcelable;", "Ltq11;", "flags", "<init>", "(ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "flag", "", "get-OMiyNp0", "(I)Z", "get", "value", "Lzy11;", "set-qs9_MiY", "(IZ)V", "set", "set-OMiyNp0", "(I)V", "remove-OMiyNp0", "remove", "reset", "()V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", CA20Status.STATUS_USER_I, "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public class BitFlagHolder implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<BitFlagHolder> CREATOR = new Creator();
    private int flags;

    public /* synthetic */ BitFlagHolder(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        return (other instanceof BitFlagHolder) && ((BitFlagHolder) other).flags == this.flags;
    }

    /* renamed from: get-OMiyNp0, reason: not valid java name */
    public final boolean m245getOMiyNp0(int flag) {
        return (this.flags & (1 << flag)) != 0;
    }

    /* renamed from: hashCode, reason: from getter */
    public int getFlags() {
        return this.flags;
    }

    /* renamed from: remove-OMiyNp0, reason: not valid java name */
    public final void m246removeOMiyNp0(int flag) {
        this.flags = (~(1 << flag)) & this.flags;
    }

    public final void reset() {
        this.flags = 0;
    }

    /* renamed from: set-OMiyNp0, reason: not valid java name */
    public final void m247setOMiyNp0(int flag) {
        this.flags = (1 << flag) | this.flags;
    }

    /* renamed from: set-qs9_MiY, reason: not valid java name */
    public final void m248setqs9_MiY(int flag, boolean value) {
        if (value) {
            m247setOMiyNp0(flag);
        } else {
            m246removeOMiyNp0(flag);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.flags);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BitFlagHolder> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BitFlagHolder createFromParcel(Parcel parcel) {
            return new BitFlagHolder(parcel.readInt(), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BitFlagHolder[] newArray(int i) {
            return new BitFlagHolder[i];
        }
    }

    private BitFlagHolder(int i) {
        this.flags = i;
    }

    public /* synthetic */ BitFlagHolder(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }
}
