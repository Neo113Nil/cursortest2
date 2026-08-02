package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class r21 implements tt1 {
    public static final Parcelable.Creator<r21> CREATOR = new q21();
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final int g;

    public r21(int i, String str, String str2, String str3, boolean z, int i2) {
        ni.a(i2 == -1 || i2 > 0);
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = z;
        this.g = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static r21 a(Map map) {
        boolean z;
        int i;
        List list;
        String str;
        List list2;
        String str2;
        List list3;
        String str3;
        List list4;
        boolean z2;
        List list5;
        int i2;
        int parseInt;
        int i3;
        List list6 = (List) map.get("icy-br");
        boolean z3 = true;
        int i4 = -1;
        if (list6 != null) {
            String str4 = (String) list6.get(0);
            try {
                i3 = Integer.parseInt(str4) * 1000;
            } catch (NumberFormatException unused) {
                i3 = -1;
            }
            if (i3 > 0) {
                z = true;
                i = i3;
                list = (List) map.get("icy-genre");
                if (list != null) {
                    str = (String) list.get(0);
                    z = true;
                } else {
                    str = null;
                }
                list2 = (List) map.get("icy-name");
                if (list2 != null) {
                    str2 = (String) list2.get(0);
                    z = true;
                } else {
                    str2 = null;
                }
                list3 = (List) map.get("icy-url");
                if (list3 != null) {
                    str3 = (String) list3.get(0);
                    z = true;
                } else {
                    str3 = null;
                }
                list4 = (List) map.get("icy-pub");
                if (list4 != null) {
                    z2 = ((String) list4.get(0)).equals("1");
                    z = true;
                } else {
                    z2 = false;
                }
                list5 = (List) map.get("icy-metaint");
                if (list5 != null) {
                    String str5 = (String) list5.get(0);
                    try {
                        parseInt = Integer.parseInt(str5);
                    } catch (NumberFormatException unused2) {
                    }
                    if (parseInt > 0) {
                        i2 = parseInt;
                        if (z3) {
                            return new r21(i, str, str2, str3, z2, i2);
                        }
                        return null;
                    }
                    try {
                        ji1.d("IcyHeaders", "Invalid metadata interval: " + str5);
                    } catch (NumberFormatException unused3) {
                        i4 = parseInt;
                        ql1.a("Invalid metadata interval: ", str5, "IcyHeaders");
                        z3 = z;
                        i2 = i4;
                        if (z3) {
                        }
                    }
                }
                z3 = z;
                i2 = i4;
                if (z3) {
                }
            } else {
                try {
                    ji1.d("IcyHeaders", "Invalid bitrate: " + str4);
                } catch (NumberFormatException unused4) {
                    ql1.a("Invalid bitrate header: ", str4, "IcyHeaders");
                    z = false;
                    i = i3;
                    list = (List) map.get("icy-genre");
                    if (list != null) {
                    }
                    list2 = (List) map.get("icy-name");
                    if (list2 != null) {
                    }
                    list3 = (List) map.get("icy-url");
                    if (list3 != null) {
                    }
                    list4 = (List) map.get("icy-pub");
                    if (list4 != null) {
                    }
                    list5 = (List) map.get("icy-metaint");
                    if (list5 != null) {
                    }
                    z3 = z;
                    i2 = i4;
                    if (z3) {
                    }
                }
            }
        }
        z = false;
        i = -1;
        list = (List) map.get("icy-genre");
        if (list != null) {
        }
        list2 = (List) map.get("icy-name");
        if (list2 != null) {
        }
        list3 = (List) map.get("icy-url");
        if (list3 != null) {
        }
        list4 = (List) map.get("icy-pub");
        if (list4 != null) {
        }
        list5 = (List) map.get("icy-metaint");
        if (list5 != null) {
        }
        z3 = z;
        i2 = i4;
        if (z3) {
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r21.class == obj.getClass()) {
            r21 r21Var = (r21) obj;
            if (this.b == r21Var.b && mc3.a(this.c, r21Var.c) && mc3.a(this.d, r21Var.d) && mc3.a(this.e, r21Var.e) && this.f == r21Var.f && this.g == r21Var.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.b + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.c;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.e;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f ? 1 : 0)) * 31) + this.g;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.d + "\", genre=\"" + this.c + "\", bitrate=" + this.b + ", metadataInterval=" + this.g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        boolean z = this.f;
        int i2 = mc3.a;
        parcel.writeInt(z ? 1 : 0);
        parcel.writeInt(this.g);
    }

    public r21(Parcel parcel) {
        this.b = parcel.readInt();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = mc3.a(parcel);
        this.g = parcel.readInt();
    }

    @Override // yads.tt1
    public final void a(jn1 jn1Var) {
        String str = this.d;
        if (str != null) {
            jn1Var.D = str;
        }
        String str2 = this.c;
        if (str2 != null) {
            jn1Var.B = str2;
        }
    }
}
