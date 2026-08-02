package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ChapterTocFrame;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class wt extends x21 {
    public static final Parcelable.Creator<wt> CREATOR = new vt();
    public final String c;
    public final boolean d;
    public final boolean e;
    public final String[] f;
    public final x21[] g;

    public wt(Parcel parcel) {
        super(ChapterTocFrame.ID);
        this.c = (String) mc3.a((Object) parcel.readString());
        this.d = parcel.readByte() != 0;
        this.e = parcel.readByte() != 0;
        this.f = (String[]) mc3.a(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.g = new x21[readInt];
        for (int i = 0; i < readInt; i++) {
            this.g[i] = (x21) parcel.readParcelable(x21.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wt.class == obj.getClass()) {
            wt wtVar = (wt) obj;
            if (this.d == wtVar.d && this.e == wtVar.e && mc3.a(this.c, wtVar.c) && Arrays.equals(this.f, wtVar.f) && Arrays.equals(this.g, wtVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((((this.d ? 1 : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + (this.e ? 1 : 0)) * 31;
        String str = this.c;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f);
        parcel.writeInt(this.g.length);
        for (x21 x21Var : this.g) {
            parcel.writeParcelable(x21Var, 0);
        }
    }

    public wt(String str, boolean z, boolean z2, String[] strArr, x21[] x21VarArr) {
        super(ChapterTocFrame.ID);
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = strArr;
        this.g = x21VarArr;
    }
}
