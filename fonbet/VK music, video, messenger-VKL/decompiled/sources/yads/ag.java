package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ApicFrame;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class ag extends x21 {
    public static final Parcelable.Creator<ag> CREATOR = new zf();
    public final String c;
    public final String d;
    public final int e;
    public final byte[] f;

    public ag(Parcel parcel) {
        super(ApicFrame.ID);
        this.c = (String) mc3.a((Object) parcel.readString());
        this.d = parcel.readString();
        this.e = parcel.readInt();
        this.f = (byte[]) mc3.a((Object) parcel.createByteArray());
    }

    @Override // yads.tt1
    public final void a(jn1 jn1Var) {
        byte[] bArr = this.f;
        int i = this.e;
        if (jn1Var.j == null || mc3.a((Object) Integer.valueOf(i), (Object) 3) || !mc3.a((Object) jn1Var.k, (Object) 3)) {
            jn1Var.j = (byte[]) bArr.clone();
            jn1Var.k = Integer.valueOf(i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ag.class == obj.getClass()) {
            ag agVar = (ag) obj;
            if (this.e == agVar.e && mc3.a(this.c, agVar.c) && mc3.a(this.d, agVar.d) && Arrays.equals(this.f, agVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.e + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.c;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.d;
        return Arrays.hashCode(this.f) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // yads.x21
    public final String toString() {
        return this.b + ": mimeType=" + this.c + ", description=" + this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeByteArray(this.f);
    }

    public ag(String str, String str2, int i, byte[] bArr) {
        super(ApicFrame.ID);
        this.c = str;
        this.d = str2;
        this.e = i;
        this.f = bArr;
    }
}
