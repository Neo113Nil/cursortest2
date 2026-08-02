package com.yandex.passport.internal.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import defpackage.jl40;
import defpackage.unr0;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0014¨\u0006\""}, d2 = {"Lcom/yandex/passport/internal/ui/EventError;", "Landroid/os/Parcelable;", "", ErrorResponseData.JSON_ERROR_CODE, "", Constants.KEY_EXCEPTION, "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/yandex/passport/internal/ui/EventError;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getErrorCode", "Ljava/lang/Throwable;", "getException", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class EventError implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<EventError> CREATOR = new Creator();
    private final String errorCode;
    private final Throwable exception;

    public /* synthetic */ EventError(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? new Throwable(str) : th);
    }

    public static /* synthetic */ EventError copy$default(EventError eventError, String str, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventError.errorCode;
        }
        if ((i & 2) != 0) {
            th = eventError.exception;
        }
        return eventError.copy(str, th);
    }

    /* renamed from: component1, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    /* renamed from: component2, reason: from getter */
    public final Throwable getException() {
        return this.exception;
    }

    public final EventError copy(String errorCode, Throwable exception) {
        return new EventError(errorCode, exception);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventError)) {
            return false;
        }
        EventError eventError = (EventError) other;
        return jl40.l(this.errorCode, eventError.errorCode) && jl40.l(this.exception, eventError.exception);
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final Throwable getException() {
        return this.exception;
    }

    public int hashCode() {
        return this.exception.hashCode() + (this.errorCode.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EventError(errorCode=");
        sb.append(this.errorCode);
        sb.append(", exception=");
        return unr0.s(sb, this.exception, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.errorCode);
        dest.writeSerializable(this.exception);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EventError> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EventError createFromParcel(Parcel parcel) {
            return new EventError(parcel.readString(), (Throwable) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EventError[] newArray(int i) {
            return new EventError[i];
        }
    }

    public EventError(String str, Throwable th) {
        this.errorCode = str;
        this.exception = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EventError(String str) {
        this(str, null, 2, 0 == true ? 1 : 0);
    }
}
