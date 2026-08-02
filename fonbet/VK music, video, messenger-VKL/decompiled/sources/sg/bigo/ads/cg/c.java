package sg.bigo.ads.cg;

import android.os.Parcel;
import androidx.annotation.NonNull;
import org.json.JSONObject;
import sg.bigo.ads.an.n;
import sg.bigo.ads.common.utils.s;

/* loaded from: classes9.dex */
public final class c extends b {
    public static final long d = s.c.a(1);
    public static final long e = s.b.a(5);
    public static final long f = s.a.a(30);
    public long g;
    public long h;
    private long i;

    public c(@NonNull String str) {
        super(str, "");
        this.i = d;
    }

    @Override // sg.bigo.ads.cg.b, sg.bigo.ads.an.f
    public final void a(@NonNull Parcel parcel) {
        super.a(parcel);
        parcel.writeLong(this.i);
        parcel.writeLong(this.g);
        parcel.writeLong(this.h);
    }

    @Override // sg.bigo.ads.cg.b, sg.bigo.ads.an.f
    public final void b(@NonNull Parcel parcel) {
        super.b(parcel);
        this.i = n.a(parcel, d);
        this.g = n.a(parcel, 0L);
        this.h = n.a(parcel, 0L);
    }

    @Override // sg.bigo.ads.cg.b
    public final void a(@NonNull JSONObject jSONObject, boolean z, String str, int i) {
        super.a(jSONObject, z, str, i);
        this.i = Math.max(jSONObject.optLong("interval", d / 1000) * 1000, f);
    }

    public final boolean b() {
        long j = this.g;
        long j2 = this.h;
        if (j == j2) {
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        return j > j2 ? Math.abs(currentTimeMillis - this.g) > e : Math.abs(currentTimeMillis - this.h) > this.i;
    }
}
