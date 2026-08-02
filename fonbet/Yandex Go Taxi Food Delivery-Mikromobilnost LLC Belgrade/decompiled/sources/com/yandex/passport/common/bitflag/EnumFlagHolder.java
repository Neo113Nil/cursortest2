package com.yandex.passport.common.bitflag;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.PassportAccountType;
import defpackage.j73;
import defpackage.jl40;
import java.lang.Enum;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000*\u0012\b\u0000\u0010\u0003*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0004B\u0011\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001d\b\u0016\u0012\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\t\"\u00028\u0000¢\u0006\u0004\b\u0007\u0010\u000bB\u0017\b\u0016\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u0007\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u0010H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u001d\u0010%\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001f¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u001f¢\u0006\u0004\b'\u0010!R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/yandex/passport/common/bitflag/EnumFlagHolder;", "Lcom/yandex/passport/api/PassportAccountType;", "", "T", "Landroid/os/Parcelable;", "Lcom/yandex/passport/common/bitflag/BitFlagHolder;", "wrapped", "<init>", "(Lcom/yandex/passport/common/bitflag/BitFlagHolder;)V", "", "ts", "([Ljava/lang/Enum;)V", "", "tList", "(Ljava/lang/Iterable;)V", "t", "", "get", "(Ljava/lang/Enum;)Z", "value", "Lzy11;", "set", "(Ljava/lang/Enum;Z)V", "(Ljava/lang/Enum;)V", "remove", "reset", "()V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/yandex/passport/common/bitflag/BitFlagHolder;", "getWrapped", "()Lcom/yandex/passport/common/bitflag/BitFlagHolder;", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class EnumFlagHolder<T extends Enum<T> & PassportAccountType> implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<EnumFlagHolder<?>> CREATOR = new Creator();
    private final BitFlagHolder wrapped;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EnumFlagHolder(Iterable<? extends T> iterable) {
        this(r0);
        BitFlagHolder bitFlagHolder = new BitFlagHolder(0, 1, null);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            bitFlagHolder.m247setOMiyNp0(it.next().getValue());
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (other instanceof EnumFlagHolder) {
            return jl40.l(((EnumFlagHolder) other).wrapped, this.wrapped);
        }
        return false;
    }

    public final boolean get(T t) {
        return this.wrapped.m245getOMiyNp0(t.getValue());
    }

    public final BitFlagHolder getWrapped() {
        return this.wrapped;
    }

    public int hashCode() {
        return this.wrapped.getFlags();
    }

    public final void remove(T t) {
        this.wrapped.m246removeOMiyNp0(t.getValue());
    }

    public final void reset() {
        this.wrapped.reset();
    }

    public final void set(T t) {
        this.wrapped.m247setOMiyNp0(t.getValue());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.wrapped, flags);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EnumFlagHolder<?>> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EnumFlagHolder<?> createFromParcel(Parcel parcel) {
            return new EnumFlagHolder<>((BitFlagHolder) parcel.readParcelable(EnumFlagHolder.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EnumFlagHolder<?>[] newArray(int i) {
            return new EnumFlagHolder[i];
        }
    }

    public final void set(T t, boolean value) {
        if (value) {
            set(t);
        } else {
            remove(t);
        }
    }

    public EnumFlagHolder(BitFlagHolder bitFlagHolder) {
        this.wrapped = bitFlagHolder;
    }

    public /* synthetic */ EnumFlagHolder(BitFlagHolder bitFlagHolder, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new BitFlagHolder(0, 1, null) : bitFlagHolder);
    }

    public EnumFlagHolder(T... tArr) {
        this(j73.u(tArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EnumFlagHolder() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
