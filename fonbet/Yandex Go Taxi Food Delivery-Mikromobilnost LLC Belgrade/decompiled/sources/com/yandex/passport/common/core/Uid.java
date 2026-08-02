package com.yandex.passport.common.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.b64;
import defpackage.ny61;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0014¨\u0006$"}, d2 = {"Lcom/yandex/passport/common/core/Uid;", "Landroid/os/Parcelable;", "Lcom/yandex/passport/common/core/Environment;", WebViewActivity.KEY_ENVIRONMENT, "", "value", "<init>", "(Lcom/yandex/passport/common/core/Environment;J)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/passport/common/core/Environment;", "component2", "()J", "copy", "(Lcom/yandex/passport/common/core/Environment;J)Lcom/yandex/passport/common/core/Uid;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/passport/common/core/Environment;", "getEnvironment", "J", "getValue", "passport-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Uid implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<Uid> CREATOR = new Creator();
    private final Environment environment;
    private final long value;

    public Uid(Environment environment, long j) {
        this.environment = environment;
        this.value = j;
        if (j > 0) {
            return;
        }
        ny61.g("uid value must be a positive number");
        throw null;
    }

    public static /* synthetic */ Uid copy$default(Uid uid, Environment environment, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            environment = uid.environment;
        }
        if ((i & 2) != 0) {
            j = uid.value;
        }
        return uid.copy(environment, j);
    }

    /* renamed from: component1, reason: from getter */
    public final Environment getEnvironment() {
        return this.environment;
    }

    /* renamed from: component2, reason: from getter */
    public final long getValue() {
        return this.value;
    }

    public final Uid copy(Environment environment, long value) {
        return new Uid(environment, value);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Uid)) {
            return false;
        }
        Uid uid = (Uid) other;
        return this.environment == uid.environment && this.value == uid.value;
    }

    public final Environment getEnvironment() {
        return this.environment;
    }

    public final long getValue() {
        return this.value;
    }

    public int hashCode() {
        return Long.hashCode(this.value) + (this.environment.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Uid(environment=");
        sb.append(this.environment);
        sb.append(", value=");
        return b64.o(sb, this.value, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        this.environment.writeToParcel(dest, flags);
        dest.writeLong(this.value);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Uid> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Uid createFromParcel(Parcel parcel) {
            return new Uid(Environment.CREATOR.createFromParcel(parcel), parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Uid[] newArray(int i) {
            return new Uid[i];
        }
    }
}
