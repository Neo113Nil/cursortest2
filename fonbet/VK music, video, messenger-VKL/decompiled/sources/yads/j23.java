package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public final class j23 implements tt1 {
    public static final Parcelable.Creator<j23> CREATOR = new g23();
    public final List b;

    public j23(ArrayList arrayList) {
        this.b = arrayList;
        ni.a(!a(arrayList));
    }

    public static boolean a(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return false;
        }
        long j = ((i23) arrayList.get(0)).c;
        for (int i = 1; i < arrayList.size(); i++) {
            if (((i23) arrayList.get(i)).b < j) {
                return true;
            }
            j = ((i23) arrayList.get(i)).c;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j23.class != obj.getClass()) {
            return false;
        }
        return this.b.equals(((j23) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.b);
    }
}
