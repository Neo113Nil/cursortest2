package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class xm0 implements tt1 {
    public static final Parcelable.Creator<xm0> CREATOR;
    public static final nx0 h;
    public static final nx0 i;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final byte[] f;
    public int g;

    static {
        mx0 mx0Var = new mx0();
        mx0Var.k = MimeTypes.APPLICATION_ID3;
        h = new nx0(mx0Var);
        mx0 mx0Var2 = new mx0();
        mx0Var2.k = MimeTypes.APPLICATION_SCTE35;
        i = new nx0(mx0Var2);
        CREATOR = new wm0();
    }

    public xm0(Parcel parcel) {
        this.b = (String) mc3.a((Object) parcel.readString());
        this.c = (String) mc3.a((Object) parcel.readString());
        this.d = parcel.readLong();
        this.e = parcel.readLong();
        this.f = (byte[]) mc3.a((Object) parcel.createByteArray());
    }

    @Override // yads.tt1
    public final nx0 a() {
        String str = this.b;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return i;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return h;
            default:
                return null;
        }
    }

    @Override // yads.tt1
    public final byte[] b() {
        if (a() != null) {
            return this.f;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xm0.class == obj.getClass()) {
            xm0 xm0Var = (xm0) obj;
            if (this.d == xm0Var.d && this.e == xm0Var.e && mc3.a(this.b, xm0Var.b) && mc3.a(this.c, xm0Var.c) && Arrays.equals(this.f, xm0Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.g == 0) {
            String str = this.b;
            int hashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
            String str2 = this.c;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j = this.d;
            int i2 = (hashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.e;
            this.g = Arrays.hashCode(this.f) + ((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }
        return this.g;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.b + ", id=" + this.e + ", durationMs=" + this.d + ", value=" + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeLong(this.d);
        parcel.writeLong(this.e);
        parcel.writeByteArray(this.f);
    }

    public xm0(String str, String str2, long j, long j2, byte[] bArr) {
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = j2;
        this.f = bArr;
    }
}
