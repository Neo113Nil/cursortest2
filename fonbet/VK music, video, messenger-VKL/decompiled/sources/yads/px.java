package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.CommentFrame;

/* loaded from: classes10.dex */
public final class px extends x21 {
    public static final Parcelable.Creator<px> CREATOR = new ox();
    public final String c;
    public final String d;
    public final String e;

    public px(Parcel parcel) {
        super(CommentFrame.ID);
        this.c = (String) mc3.a((Object) parcel.readString());
        this.d = (String) mc3.a((Object) parcel.readString());
        this.e = (String) mc3.a((Object) parcel.readString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && px.class == obj.getClass()) {
            px pxVar = (px) obj;
            if (mc3.a(this.d, pxVar.d) && mc3.a(this.c, pxVar.c) && mc3.a(this.e, pxVar.e)) {
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
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // yads.x21
    public final String toString() {
        return this.b + ": language=" + this.c + ", description=" + this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.e);
    }

    public px(String str, String str2, String str3) {
        super(CommentFrame.ID);
        this.c = str;
        this.d = str2;
        this.e = str3;
    }
}
