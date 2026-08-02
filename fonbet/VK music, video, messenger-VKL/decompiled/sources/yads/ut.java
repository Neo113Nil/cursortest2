package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ChapterFrame;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class ut extends x21 {
    public static final Parcelable.Creator<ut> CREATOR = new tt();
    public final String c;
    public final int d;
    public final int e;
    public final long f;
    public final long g;
    public final x21[] h;

    public ut(Parcel parcel) {
        super(ChapterFrame.ID);
        this.c = (String) mc3.a((Object) parcel.readString());
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readLong();
        this.g = parcel.readLong();
        int readInt = parcel.readInt();
        this.h = new x21[readInt];
        for (int i = 0; i < readInt; i++) {
            this.h[i] = (x21) parcel.readParcelable(x21.class.getClassLoader());
        }
    }

    @Override // yads.x21, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ut.class == obj.getClass()) {
            ut utVar = (ut) obj;
            if (this.d == utVar.d && this.e == utVar.e && this.f == utVar.f && this.g == utVar.g && mc3.a(this.c, utVar.c) && Arrays.equals(this.h, utVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((((((this.d + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.e) * 31) + ((int) this.f)) * 31) + ((int) this.g)) * 31;
        String str = this.c;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeLong(this.f);
        parcel.writeLong(this.g);
        parcel.writeInt(this.h.length);
        for (x21 x21Var : this.h) {
            parcel.writeParcelable(x21Var, 0);
        }
    }

    public ut(String str, int i, int i2, long j, long j2, x21[] x21VarArr) {
        super(ChapterFrame.ID);
        this.c = str;
        this.d = i;
        this.e = i2;
        this.f = j;
        this.g = j2;
        this.h = x21VarArr;
    }
}
