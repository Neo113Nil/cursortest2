package defpackage;

import java.util.function.Supplier;
import kotlin.jvm.internal.PropertyReference0;
import ru.yandex.taxi.banners.model.g;
import ru.yandex.taxi.banners.model.h;

/* loaded from: classes9.dex */
public final /* synthetic */ class hu4 implements Supplier {
    public final /* synthetic */ int a;
    public final /* synthetic */ hgx b;

    public /* synthetic */ hu4(hgx hgxVar, int i) {
        this.a = i;
        this.b = hgxVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        int i = this.a;
        hgx hgxVar = this.b;
        switch (i) {
            case 0:
                return (h) ((PropertyReference0) hgxVar).get();
            default:
                return (g) ((PropertyReference0) hgxVar).get();
        }
    }
}
