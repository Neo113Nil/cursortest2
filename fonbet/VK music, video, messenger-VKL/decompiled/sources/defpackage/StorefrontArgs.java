package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.api.analytics.MarketAnalyticsParams;
import xsna.epx;

/* compiled from: StorefrontArgs.kt */
/* loaded from: classes8.dex */
public final class StorefrontArgs implements Parcelable {
    public static final Parcelable.Creator<StorefrontArgs> CREATOR = new a();
    public final UserId b;
    public final MarketAnalyticsParams c;
    public final boolean d;

    /* compiled from: StorefrontArgs.kt */
    public static final class a implements Parcelable.Creator<StorefrontArgs> {
        @Override // android.os.Parcelable.Creator
        public final StorefrontArgs createFromParcel(Parcel parcel) {
            return new StorefrontArgs((UserId) parcel.readParcelable(StorefrontArgs.class.getClassLoader()), (MarketAnalyticsParams) parcel.readParcelable(StorefrontArgs.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final StorefrontArgs[] newArray(int i) {
            return new StorefrontArgs[i];
        }
    }

    public StorefrontArgs(UserId userId, MarketAnalyticsParams marketAnalyticsParams, boolean z) {
        this.b = userId;
        this.c = marketAnalyticsParams;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StorefrontArgs)) {
            return false;
        }
        StorefrontArgs storefrontArgs = (StorefrontArgs) obj;
        return epx.f(this.b, storefrontArgs.b) && epx.f(this.c, storefrontArgs.c) && this.d == storefrontArgs.d;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.b.b) * 31;
        MarketAnalyticsParams marketAnalyticsParams = this.c;
        return Boolean.hashCode(this.d) + ((hashCode + (marketAnalyticsParams == null ? 0 : marketAnalyticsParams.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StorefrontArgs(userId=");
        sb.append(this.b);
        sb.append(", analyticsParams=");
        sb.append(this.c);
        sb.append(", isTrackTransitionToMarket=");
        return q0.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
