package sg.bigo.ads.ci;

import android.os.Parcel;
import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public final class d implements sg.bigo.ads.ai.h {
    private final int d = 1;
    private final int e = 0;
    int a = 0;
    int b = 0;
    int c = 0;

    @Override // sg.bigo.ads.an.f
    public final void a(@NonNull Parcel parcel) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }

    @Override // sg.bigo.ads.an.f
    public final void b(@NonNull Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
    }

    @Override // sg.bigo.ads.ai.h
    public final boolean c() {
        return this.c == 1;
    }

    @Override // sg.bigo.ads.ai.h
    public final boolean a() {
        return this.a == 1;
    }

    @Override // sg.bigo.ads.ai.h
    public final boolean b() {
        return this.b == 1;
    }
}
