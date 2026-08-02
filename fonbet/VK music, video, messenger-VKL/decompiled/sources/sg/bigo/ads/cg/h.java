package sg.bigo.ads.cg;

import android.os.Parcel;
import androidx.annotation.NonNull;
import sg.bigo.ads.an.n;

/* loaded from: classes9.dex */
public final class h implements sg.bigo.ads.an.f {
    public long a;
    public long b;
    public long c;
    public long d;
    public long e;

    @Override // sg.bigo.ads.an.f
    public final void a(@NonNull Parcel parcel) {
        synchronized (this) {
            parcel.writeLong(this.a);
            parcel.writeLong(this.b);
            parcel.writeLong(this.c);
            parcel.writeLong(this.d);
            parcel.writeLong(this.e);
        }
    }

    @Override // sg.bigo.ads.an.f
    public final void b(@NonNull Parcel parcel) {
        synchronized (this) {
            this.a = n.a(parcel, 0L);
            this.b = n.a(parcel, 0L);
            this.c = n.a(parcel, 0L);
            this.d = n.a(parcel, 0L);
            this.e = n.a(parcel, 0L);
        }
    }

    @NonNull
    public final String toString() {
        return super.toString();
    }
}
