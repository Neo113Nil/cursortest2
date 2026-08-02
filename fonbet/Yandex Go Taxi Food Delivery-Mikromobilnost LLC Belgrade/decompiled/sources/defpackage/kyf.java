package defpackage;

import com.yandex.go.urbanads.b;
import ru.yandex.taxi.logistics.payment.a;

/* loaded from: classes5.dex */
public final class kyf implements xvf0 {
    public final /* synthetic */ int a;
    public final j4n b;

    public /* synthetic */ kyf(j4n j4nVar, int i) {
        this.a = i;
        this.b = j4nVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        j4n j4nVar = this.b;
        switch (i) {
            case 0:
                return (v3i) j4nVar.c;
            case 1:
                return (h4i) j4nVar.x;
            case 2:
                return (m5i) j4nVar.y;
            case 3:
                return (v8e) j4nVar.z;
            case 4:
                a aVar = (a) j4nVar.b;
                q5z.h(aVar);
                return aVar;
            case 5:
                b bVar = (b) j4nVar.w;
                q5z.h(bVar);
                return bVar;
            default:
                return (zch) j4nVar.a;
        }
    }
}
