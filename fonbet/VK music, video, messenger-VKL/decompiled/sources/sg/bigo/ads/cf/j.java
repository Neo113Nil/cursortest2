package sg.bigo.ads.cf;

import android.os.Parcel;
import androidx.annotation.NonNull;
import sg.bigo.ads.an.n;

/* loaded from: classes9.dex */
public class j implements sg.bigo.ads.an.f {
    String a;
    public boolean b;
    private String c;

    public j() {
    }

    @Override // sg.bigo.ads.an.f
    public void a(@NonNull Parcel parcel) {
        parcel.writeString(this.c);
        parcel.writeString(this.a);
        n.a(parcel, this.b);
    }

    @Override // sg.bigo.ads.an.f
    public void b(@NonNull Parcel parcel) {
        this.c = n.a(parcel, "");
        this.a = n.a(parcel, "");
        this.b = n.b(parcel, false);
    }

    @NonNull
    public String toString() {
        return super.toString();
    }

    public j(String str, String str2, boolean z) {
        this.c = str;
        this.a = str2;
        this.b = z;
    }
}
