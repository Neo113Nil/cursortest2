package yads;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public final class qj0 implements Parcelable {
    public static final Parcelable.Creator<qj0> CREATOR = new pj0();
    public final String b;
    public final Uri c;
    public final String d;
    public final List e;
    public final byte[] f;
    public final String g;
    public final byte[] h;

    public qj0(Parcel parcel) {
        this.b = (String) mc3.a((Object) parcel.readString());
        this.c = Uri.parse((String) mc3.a((Object) parcel.readString()));
        this.d = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add((z43) parcel.readParcelable(z43.class.getClassLoader()));
        }
        this.e = Collections.unmodifiableList(arrayList);
        this.f = parcel.createByteArray();
        this.g = parcel.readString();
        this.h = (byte[]) mc3.a((Object) parcel.createByteArray());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qj0)) {
            return false;
        }
        qj0 qj0Var = (qj0) obj;
        return this.b.equals(qj0Var.b) && this.c.equals(qj0Var.c) && mc3.a(this.d, qj0Var.d) && this.e.equals(qj0Var.e) && Arrays.equals(this.f, qj0Var.f) && mc3.a(this.g, qj0Var.g) && Arrays.equals(this.h, qj0Var.h);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + (this.b.hashCode() * 961)) * 31;
        String str = this.d;
        int hashCode2 = (Arrays.hashCode(this.f) + ((this.e.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        String str2 = this.g;
        return Arrays.hashCode(this.h) + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return this.d + StringUtils.PROCESS_POSTFIX_DELIMITER + this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c.toString());
        parcel.writeString(this.d);
        parcel.writeInt(this.e.size());
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            parcel.writeParcelable((Parcelable) this.e.get(i2), 0);
        }
        parcel.writeByteArray(this.f);
        parcel.writeString(this.g);
        parcel.writeByteArray(this.h);
    }

    public qj0(String str, Uri uri, String str2, List list, byte[] bArr, String str3, byte[] bArr2) {
        int a = mc3.a(uri, str2);
        if (a == 0 || a == 2 || a == 1) {
            ni.a("customCacheKey must be null for type: " + a, str3 == null);
        }
        this.b = str;
        this.c = uri;
        this.d = str2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.e = Collections.unmodifiableList(arrayList);
        this.f = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.g = str3;
        this.h = bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : mc3.f;
    }
}
