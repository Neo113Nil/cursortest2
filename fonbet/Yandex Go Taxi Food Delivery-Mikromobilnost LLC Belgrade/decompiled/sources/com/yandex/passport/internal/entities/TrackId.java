package com.yandex.passport.internal.entities;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.b64;
import defpackage.jl40;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0001)B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J0\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0015J\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b'\u0010\u0017¨\u0006*"}, d2 = {"Lcom/yandex/passport/internal/entities/TrackId;", "", "Landroid/os/Parcelable;", "", "value", "Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;", WebViewActivity.KEY_ENVIRONMENT, "displayName", "<init>", "(Ljava/lang/String;Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;Ljava/lang/String;)V", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;", "component3", "copy", "(Ljava/lang/String;Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;Ljava/lang/String;)Lcom/yandex/passport/internal/entities/TrackId;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getValue", "Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;", "getEnvironment", "getDisplayName", "Companion", "com/yandex/passport/internal/entities/p", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class TrackId implements Parcelable {
    public static final int $stable = 8;
    private static final String KEY_DISPLAY_NAME = "dn";
    private final String displayName;
    private final PassportEnvironmentImpl environment;
    private final String value;
    public static final p Companion = new p();
    public static final Parcelable.Creator<TrackId> CREATOR = new Creator();

    public TrackId(String str, PassportEnvironmentImpl passportEnvironmentImpl, String str2) {
        this.value = str;
        this.environment = passportEnvironmentImpl;
        this.displayName = str2;
    }

    public static /* synthetic */ TrackId copy$default(TrackId trackId, String str, PassportEnvironmentImpl passportEnvironmentImpl, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = trackId.value;
        }
        if ((i & 2) != 0) {
            passportEnvironmentImpl = trackId.environment;
        }
        if ((i & 4) != 0) {
            str2 = trackId.displayName;
        }
        return trackId.copy(str, passportEnvironmentImpl, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* renamed from: component2, reason: from getter */
    public final PassportEnvironmentImpl getEnvironment() {
        return this.environment;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    public final TrackId copy(String value, PassportEnvironmentImpl environment, String displayName) {
        return new TrackId(value, environment, displayName);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrackId)) {
            return false;
        }
        TrackId trackId = (TrackId) other;
        return jl40.l(this.value, trackId.value) && jl40.l(this.environment, trackId.environment) && jl40.l(this.displayName, trackId.displayName);
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = (this.environment.hashCode() + (this.value.hashCode() * 31)) * 31;
        String str = this.displayName;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("track_id", this);
        return bundle;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TrackId(value=");
        sb.append(this.value);
        sb.append(", environment=");
        sb.append(this.environment);
        sb.append(", displayName=");
        return b64.p(sb, this.displayName, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.value);
        dest.writeParcelable(this.environment, flags);
        dest.writeString(this.displayName);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TrackId> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TrackId createFromParcel(Parcel parcel) {
            return new TrackId(parcel.readString(), (PassportEnvironmentImpl) parcel.readParcelable(TrackId.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TrackId[] newArray(int i) {
            return new TrackId[i];
        }
    }

    /* renamed from: getEnvironment, reason: merged with bridge method [inline-methods] */
    public PassportEnvironmentImpl m304getEnvironment() {
        return this.environment;
    }
}
