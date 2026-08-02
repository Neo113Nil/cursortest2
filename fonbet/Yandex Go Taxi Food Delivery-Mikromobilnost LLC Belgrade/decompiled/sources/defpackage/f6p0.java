package defpackage;

import android.net.Uri;
import ru.yandex.taxi.scooters.domain.q;

/* loaded from: classes11.dex */
public final class f6p0 {
    public final h3y a;

    public f6p0(h3y h3yVar) {
        this.a = h3yVar;
    }

    public final l530 a(Uri uri) {
        h3y h3yVar = this.a;
        if (!((q) h3yVar.get()).m(uri)) {
            return msb1.L;
        }
        ((q) h3yVar.get()).getClass();
        return new k530(uri.buildUpon().appendQueryParameter("scooters_source", "qr_superapp").build());
    }
}
