package defpackage;

import android.net.Uri;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.scooters.domain.q;

/* loaded from: classes15.dex */
public final class h9p0 implements zu51 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ h9p0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.zu51
    public final void a(Uri uri) {
        switch (this.a) {
            case 0:
                ((n3h) ((h3y) this.b).get()).a(uri, DeeplinkSource.UNSPECIFIED);
                break;
            case 1:
                ((n3h) ((h3y) this.b).get()).a(uri, DeeplinkSource.UNSPECIFIED);
                break;
            default:
                ((n3h) this.b).a(uri, DeeplinkSource.UNSPECIFIED);
                break;
        }
    }

    @Override // defpackage.zu51
    public final q5u b(Uri uri) {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                if (!((q) ((h3y) obj).get()).m(uri)) {
                    break;
                } else {
                    break;
                }
            case 1:
                ((cb11) ((h3y) obj).get()).getClass();
                if (!"masstransit-checkout".equalsIgnoreCase(uri != null ? uri.getAuthority() : null)) {
                    break;
                } else {
                    break;
                }
            default:
                if (!((qya) obj).d(uri)) {
                    break;
                } else {
                    break;
                }
        }
        return xpb1.H;
    }
}
