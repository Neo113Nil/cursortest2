package defpackage;

import kotlin.Pair;
import ru.yandex.taxi.locationsdk.locationprovider.android.gms.a;

/* loaded from: classes5.dex */
public final class lut implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;
    public final /* synthetic */ Pair c;

    public /* synthetic */ lut(a aVar, Pair pair, int i) {
        this.a = i;
        this.b = aVar;
        this.c = pair;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        Pair pair = this.c;
        a aVar = this.b;
        switch (i) {
            case 0:
                ((rcz) aVar.b).b("GoogleMobileServicesClientAdapter", (Throwable) obj, pair);
                return Boolean.FALSE;
            default:
                ((rcz) aVar.b).b("GoogleMobileServicesClientAdapter", (Throwable) obj, pair);
                return zy11.a;
        }
    }
}
