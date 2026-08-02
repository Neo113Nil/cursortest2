package defpackage;

import android.net.Uri;
import com.yandex.go.suggest.DestinationSuggest;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes6.dex */
public final class jsd {
    public final PointType a;
    public final SourcePicker b;
    public final boolean c;
    public final DestinationSuggest d;
    public final String e;
    public final u0j f;
    public final Uri g;
    public final boolean h;

    public jsd(PointType pointType, SourcePicker sourcePicker, boolean z, q501 q501Var, DestinationSuggest destinationSuggest, String str, Uri uri, int i) {
        u0j u0jVar = (i & 256) != 0 ? kzi.a : y111.a;
        uri = (i & 512) != 0 ? null : uri;
        boolean z2 = (i & 1024) == 0;
        this.a = pointType;
        this.b = sourcePicker;
        this.c = z;
        this.d = destinationSuggest;
        this.e = str;
        this.f = u0jVar;
        this.g = uri;
        this.h = z2;
    }
}
