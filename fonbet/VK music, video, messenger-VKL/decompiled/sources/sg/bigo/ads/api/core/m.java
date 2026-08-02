package sg.bigo.ads.api.core;

import android.os.Parcel;
import androidx.annotation.NonNull;
import xsna.vu5;

/* loaded from: classes9.dex */
public final class m implements sg.bigo.ads.ai.l, sg.bigo.ads.an.f {
    public long a = 0;

    @Override // sg.bigo.ads.an.f
    public final void a(@NonNull Parcel parcel) {
        parcel.writeLong(this.a);
    }

    @Override // sg.bigo.ads.an.f
    public final void b(@NonNull Parcel parcel) {
        this.a = parcel.readLong();
    }

    public final String toString() {
        return vu5.a('}', this.a, new StringBuilder("{value="));
    }

    @Override // sg.bigo.ads.ai.l
    public final boolean a(int i) {
        return (this.a & (1 << i)) != 0;
    }
}
