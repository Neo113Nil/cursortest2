package sg.bigo.ads.ci;

import android.os.Parcel;
import androidx.annotation.NonNull;
import xsna.i5s;

/* loaded from: classes9.dex */
final class a implements sg.bigo.ads.ai.a {
    long a;
    String b;
    String c;
    String d;
    String e;
    String f;
    String g;

    @Override // sg.bigo.ads.an.f
    public final void a(@NonNull Parcel parcel) {
        parcel.writeLong(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
    }

    @Override // sg.bigo.ads.an.f
    public final void b(@NonNull Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readString();
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("{expressId=");
        sb.append(this.a);
        sb.append(", name='");
        sb.append(this.b);
        sb.append("', url='");
        sb.append(this.c);
        sb.append("', md5='");
        sb.append(this.d);
        sb.append("', style='");
        sb.append(this.e);
        sb.append("', adTypes='");
        sb.append(this.f);
        sb.append("', fileId='");
        return i5s.a(sb, this.g, "'}");
    }
}
