package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class mp extends x21 {
    public static final Parcelable.Creator<mp> CREATOR = new lp();
    public final byte[] c;

    public mp(Parcel parcel) {
        super((String) mc3.a((Object) parcel.readString()));
        this.c = (byte[]) mc3.a((Object) parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && mp.class == obj.getClass()) {
            mp mpVar = (mp) obj;
            if (this.b.equals(mpVar.b) && Arrays.equals(this.c, mpVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + k4.a(this.b, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeByteArray(this.c);
    }

    public mp(String str, byte[] bArr) {
        super(str);
        this.c = bArr;
    }
}
