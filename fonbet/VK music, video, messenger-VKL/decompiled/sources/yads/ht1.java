package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;
import xsna.epx;
import xsna.imi0;

@imi0
/* loaded from: classes10.dex */
public final class ht1 implements Parcelable {
    public final long b;
    public final List c;
    public static final ft1 Companion = new ft1();
    public static final Parcelable.Creator<ht1> CREATOR = new gt1();
    public static final KSerializer[] d = {null, new xsna.yk3(vs1.a)};

    public ht1(int i, long j, List list) {
        this.b = (i & 1) == 0 ? ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS : j;
        if ((i & 2) == 0) {
            this.c = EmptyList.b;
        } else {
            this.c = list;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ht1)) {
            return false;
        }
        ht1 ht1Var = (ht1) obj;
        return this.b == ht1Var.b && epx.f(this.c, ht1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "MediationPrefetchSettings(loadTimeoutMillis=" + this.b + ", mediationPrefetchAdUnits=" + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
        Iterator a = xsna.ao.a(parcel, this.c);
        while (a.hasNext()) {
            ((ys1) a.next()).writeToParcel(parcel, i);
        }
    }

    public ht1(long j, ArrayList arrayList) {
        this.b = j;
        this.c = arrayList;
    }
}
