package sg.bigo.ads.an;

import android.os.Parcel;
import androidx.annotation.NonNull;
import sg.bigo.ads.common.utils.s;
import xsna.vu5;

/* loaded from: classes9.dex */
public final class a implements f {
    public static final a a = new a();
    public String b;
    public boolean c;
    private long d;

    private a() {
        this.b = "";
        this.c = true;
    }

    @Override // sg.bigo.ads.an.f
    public final void a(@NonNull Parcel parcel) {
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeLong(this.d);
    }

    @Override // sg.bigo.ads.an.f
    public final void b(@NonNull Parcel parcel) {
        this.b = parcel.readString();
        this.c = parcel.readInt() != 0;
        this.d = parcel.readLong();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{advertisingId='");
        sb.append(this.b);
        sb.append("', isLimitAdTrackingEnabled=");
        sb.append(this.c);
        sb.append(", lastUpdateTime=");
        return vu5.a('}', this.d, sb);
    }

    public a(@NonNull Parcel parcel) {
        b(parcel);
    }

    public final boolean a() {
        return Math.abs(s.b() - this.d) > s.d.a(1);
    }

    public a(@NonNull String str, boolean z) {
        this.b = str;
        this.c = z;
        this.d = s.b();
    }
}
