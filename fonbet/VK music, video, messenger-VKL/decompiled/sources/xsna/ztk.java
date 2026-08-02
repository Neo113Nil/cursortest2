package xsna;

import com.google.firebase.sessions.DataCollectionState;

/* compiled from: SessionEvent.kt */
/* loaded from: classes.dex */
public final class ztk {
    public final DataCollectionState a;
    public final DataCollectionState b;
    public final double c;

    public ztk(DataCollectionState dataCollectionState, DataCollectionState dataCollectionState2, double d) {
        this.a = dataCollectionState;
        this.b = dataCollectionState2;
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ztk)) {
            return false;
        }
        ztk ztkVar = (ztk) obj;
        return this.a == ztkVar.a && this.b == ztkVar.b && Double.compare(this.c, ztkVar.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataCollectionStatus(performance=");
        sb.append(this.a);
        sb.append(", crashlytics=");
        sb.append(this.b);
        sb.append(", sessionSamplingRate=");
        return ojp0.a(sb, this.c, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ztk() {
        this(r0, r0, 1.0d);
        DataCollectionState dataCollectionState = DataCollectionState.COLLECTION_SDK_NOT_INSTALLED;
    }
}
