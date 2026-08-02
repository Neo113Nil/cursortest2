package com.yandex.passport.internal.push;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J.\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0012J\u001a\u0010\u001f\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b%\u0010\u0016¨\u0006&"}, d2 = {"Lcom/yandex/passport/internal/push/SilentPushProperties;", "Landroid/os/Parcelable;", "", "", "durationMs", "", "codeOnlyForeground", "codeForeground", "<init>", "(JZZ)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()J", "component2", "()Z", "component3", "copy", "(JZZ)Lcom/yandex/passport/internal/push/SilentPushProperties;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getDurationMs", "Z", "getCodeOnlyForeground", "getCodeForeground", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SilentPushProperties implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<SilentPushProperties> CREATOR = new Creator();
    private final boolean codeForeground;
    private final boolean codeOnlyForeground;
    private final long durationMs;

    public /* synthetic */ SilentPushProperties(long j, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
    }

    public static /* synthetic */ SilentPushProperties copy$default(SilentPushProperties silentPushProperties, long j, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = silentPushProperties.durationMs;
        }
        if ((i & 2) != 0) {
            z = silentPushProperties.codeOnlyForeground;
        }
        if ((i & 4) != 0) {
            z2 = silentPushProperties.codeForeground;
        }
        return silentPushProperties.copy(j, z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getDurationMs() {
        return this.durationMs;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getCodeOnlyForeground() {
        return this.codeOnlyForeground;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getCodeForeground() {
        return this.codeForeground;
    }

    public final SilentPushProperties copy(long durationMs, boolean codeOnlyForeground, boolean codeForeground) {
        return new SilentPushProperties(durationMs, codeOnlyForeground, codeForeground);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SilentPushProperties)) {
            return false;
        }
        SilentPushProperties silentPushProperties = (SilentPushProperties) other;
        return this.durationMs == silentPushProperties.durationMs && this.codeOnlyForeground == silentPushProperties.codeOnlyForeground && this.codeForeground == silentPushProperties.codeForeground;
    }

    public final boolean getCodeForeground() {
        return this.codeForeground;
    }

    public final boolean getCodeOnlyForeground() {
        return this.codeOnlyForeground;
    }

    public long getDurationMs() {
        return this.durationMs;
    }

    public int hashCode() {
        return Boolean.hashCode(this.codeForeground) + unr0.e(Long.hashCode(this.durationMs) * 31, 31, this.codeOnlyForeground);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SilentPushProperties(durationMs=");
        sb.append(this.durationMs);
        sb.append(", codeOnlyForeground=");
        sb.append(this.codeOnlyForeground);
        sb.append(", codeForeground=");
        return unr0.u(sb, this.codeForeground, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(this.durationMs);
        dest.writeInt(this.codeOnlyForeground ? 1 : 0);
        dest.writeInt(this.codeForeground ? 1 : 0);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SilentPushProperties> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SilentPushProperties createFromParcel(Parcel parcel) {
            return new SilentPushProperties(parcel.readLong(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SilentPushProperties[] newArray(int i) {
            return new SilentPushProperties[i];
        }
    }

    public SilentPushProperties(long j, boolean z, boolean z2) {
        this.durationMs = j;
        this.codeOnlyForeground = z;
        this.codeForeground = z2;
    }
}
