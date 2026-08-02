package sg.bigo.ads.ai;

import android.os.Parcel;
import androidx.annotation.NonNull;
import sg.bigo.ads.an.f;
import sg.bigo.ads.common.utils.r;

/* loaded from: classes9.dex */
public final class c implements sg.bigo.ads.an.f {
    public static final c a = new c();
    public static final f.a<c> b = new f.a<c>() { // from class: sg.bigo.ads.ai.c.1
        @Override // sg.bigo.ads.an.f.a
        public final /* synthetic */ c a() {
            return new c((byte) 0);
        }
    };
    private String c;

    private c() {
    }

    @Override // sg.bigo.ads.an.f
    public final void a(@NonNull Parcel parcel) {
        parcel.writeString(this.c);
    }

    @Override // sg.bigo.ads.an.f
    public final void b(@NonNull Parcel parcel) {
        this.c = parcel.readString();
    }

    public final String toString() {
        return r.a(this.c);
    }

    public /* synthetic */ c(byte b2) {
        this();
    }

    public c(String str) {
        this.c = str;
    }
}
