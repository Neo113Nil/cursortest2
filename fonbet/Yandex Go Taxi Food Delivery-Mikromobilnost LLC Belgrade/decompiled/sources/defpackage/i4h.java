package defpackage;

import android.net.Uri;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.deeplinks.f;

/* loaded from: classes15.dex */
public final class i4h implements zu51 {
    public final f a;
    public final n3h b;
    public final q0h c;

    public i4h(f fVar, n3h n3hVar, q0h q0hVar) {
        this.a = fVar;
        this.b = n3hVar;
        this.c = q0hVar;
    }

    @Override // defpackage.zu51
    public final void a(Uri uri) {
        this.b.a(uri, DeeplinkSource.UNSPECIFIED);
    }

    @Override // defpackage.zu51
    public final q5u b(Uri uri) {
        Uri b = this.c.b(uri);
        return this.a.c(b) ? new p5u(b) : xpb1.H;
    }
}
