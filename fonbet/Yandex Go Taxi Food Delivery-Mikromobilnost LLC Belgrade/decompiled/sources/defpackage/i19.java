package defpackage;

import android.net.Uri;
import com.yandex.go.navigator.domain.a;
import com.yandex.go.navigator.notifications.cartech.CartechDeeplinkPayloadDto;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes12.dex */
public final class i19 {
    public final n3h a;
    public final i4u b;
    public final h3y c;
    public final h3y d;

    public i19(n3h n3hVar, i4u i4uVar, h3y h3yVar, h3y h3yVar2) {
        this.a = n3hVar;
        this.b = i4uVar;
        this.c = h3yVar;
        this.d = h3yVar2;
    }

    public final void a(CartechDeeplinkPayloadDto cartechDeeplinkPayloadDto) {
        if (((a) ((xvf0) ((cb50) this.b.a).c().b).get()).i) {
            ((k19) this.c.get()).b.a().w("tanker_payload");
            ((e19) this.d.get()).b.a().w("cartech_geo_point_key");
        }
        this.a.a(Uri.parse(cartechDeeplinkPayloadDto.e), DeeplinkSource.UNSPECIFIED);
    }
}
