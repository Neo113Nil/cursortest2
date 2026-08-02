package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.GeobFrame;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class cz0 extends x21 {
    public static final Parcelable.Creator<cz0> CREATOR = new bz0();
    public final String c;
    public final String d;
    public final String e;
    public final byte[] f;

    public cz0(Parcel parcel) {
        super(GeobFrame.ID);
        this.c = (String) mc3.a((Object) parcel.readString());
        this.d = (String) mc3.a((Object) parcel.readString());
        this.e = (String) mc3.a((Object) parcel.readString());
        this.f = (byte[]) mc3.a((Object) parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && cz0.class == obj.getClass()) {
            cz0 cz0Var = (cz0) obj;
            if (mc3.a(this.c, cz0Var.c) && mc3.a(this.d, cz0Var.d) && mc3.a(this.e, cz0Var.e) && Arrays.equals(this.f, cz0Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.c;
        int hashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.e;
        return Arrays.hashCode(this.f) + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // yads.x21
    public final String toString() {
        return this.b + ": mimeType=" + this.c + ", filename=" + this.d + ", description=" + this.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeByteArray(this.f);
    }

    public cz0(String str, String str2, String str3, byte[] bArr) {
        super(GeobFrame.ID);
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = bArr;
    }
}
