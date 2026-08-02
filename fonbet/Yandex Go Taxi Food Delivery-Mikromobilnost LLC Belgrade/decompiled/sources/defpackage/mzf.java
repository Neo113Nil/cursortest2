package defpackage;

import ru.yandex.taxi.logistics.sdk.tracking.domain.impl.b;
import ru.yandex.taxi.logistics.sdk.tracking.domain.impl.c;
import ru.yandex.taxi.logistics.sdk.tracking.domain.impl.data.LocalFeedbackRepository;
import ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e;

/* loaded from: classes5.dex */
public final class mzf implements xvf0 {
    public final /* synthetic */ int a;
    public final kbg b;

    public /* synthetic */ mzf(kbg kbgVar, int i) {
        this.a = i;
        this.b = kbgVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        kbg kbgVar = this.b;
        switch (i) {
            case 0:
                e b = kbgVar.b();
                q5z.h(b);
                return b;
            case 1:
                x201 x201Var = (x201) kbgVar.s.get();
                q5z.h(x201Var);
                return x201Var;
            case 2:
                d301 d301Var = (d301) kbgVar.u.get();
                q5z.h(d301Var);
                return d301Var;
            case 3:
                e b2 = kbgVar.b();
                q5z.h(b2);
                return b2;
            case 4:
                x201 x201Var2 = (x201) kbgVar.s.get();
                q5z.h(x201Var2);
                return x201Var2;
            case 5:
                guq guqVar = (guq) kbgVar.p.get();
                q5z.h(guqVar);
                return guqVar;
            case 6:
                LocalFeedbackRepository localFeedbackRepository = (LocalFeedbackRepository) kbgVar.r.get();
                q5z.h(localFeedbackRepository);
                return localFeedbackRepository;
            case 7:
                b bVar = (b) kbgVar.q.get();
                q5z.h(bVar);
                return bVar;
            case 8:
                c cVar = (c) kbgVar.t.get();
                q5z.h(cVar);
                return cVar;
            case 9:
                d301 d301Var2 = (d301) kbgVar.u.get();
                q5z.h(d301Var2);
                return d301Var2;
            default:
                e b3 = kbgVar.b();
                q5z.h(b3);
                return b3;
        }
    }
}
