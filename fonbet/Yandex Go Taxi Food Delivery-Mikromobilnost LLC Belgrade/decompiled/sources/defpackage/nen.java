package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.json.b;
import ru.yandex.taxi.eatskit.dto.ServicePromo;

@gsq0
/* loaded from: classes5.dex */
public final class nen implements s250 {
    public static final men Companion = new men();
    public static final i3y[] f;
    public final List a;
    public final ServicePromo b;
    public final boolean c;
    public final boolean d;
    public final b e;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new i3y[]{a.b(lazyThreadSafetyMode, new ktm(18)), a.b(lazyThreadSafetyMode, new ktm(19)), null, null, null};
    }

    public /* synthetic */ nen(int i, List list, ServicePromo servicePromo, boolean z, boolean z2, b bVar) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, len.a.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = servicePromo;
        this.c = z;
        this.d = z2;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = bVar;
        }
    }

    @Override // defpackage.s250
    public final List a() {
        return this.a;
    }

    public nen(List list, ServicePromo servicePromo, boolean z) {
        this.a = list;
        this.b = servicePromo;
        this.c = true;
        this.d = z;
        this.e = null;
    }
}
