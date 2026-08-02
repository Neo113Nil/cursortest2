package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.PrivFrame;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class wj2 extends x21 {
    public static final Parcelable.Creator<wj2> CREATOR = new vj2();
    public final String c;
    public final byte[] d;

    public wj2(Parcel parcel) {
        super(PrivFrame.ID);
        this.c = (String) mc3.a((Object) parcel.readString());
        this.d = (byte[]) mc3.a((Object) parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wj2.class == obj.getClass()) {
            wj2 wj2Var = (wj2) obj;
            if (mc3.a(this.c, wj2Var.c) && Arrays.equals(this.d, wj2Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.c;
        return Arrays.hashCode(this.d) + (((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    @Override // yads.x21
    public final String toString() {
        return this.b + ": owner=" + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeByteArray(this.d);
    }

    public wj2(String str, byte[] bArr) {
        super(PrivFrame.ID);
        this.c = str;
        this.d = bArr;
    }
}
