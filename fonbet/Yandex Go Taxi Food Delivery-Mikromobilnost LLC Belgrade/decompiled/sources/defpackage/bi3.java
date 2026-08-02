package defpackage;

import com.yandex.go.captcha.api.AuthChallengeResult;
import com.yandex.go.captcha.d;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.yandex.taxi.am.g;

/* loaded from: classes12.dex */
public final class bi3 implements sls {
    public final /* synthetic */ d a;
    public final /* synthetic */ lso b;

    public bi3(d dVar, lso lsoVar) {
        this.a = dVar;
        this.b = lsoVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        d dVar = this.a;
        g gVar = dVar.d;
        AtomicBoolean atomicBoolean = dVar.j;
        boolean g = gVar.g();
        if (g) {
            AuthChallengeResult authChallengeResult = AuthChallengeResult.AlreadyDone;
            atomicBoolean.set(false);
            dVar.a.a(authChallengeResult);
        }
        if (!g && !atomicBoolean.getAndSet(true)) {
            lso lsoVar = this.b;
            d.d(dVar, new ki3(lsoVar.a, lsoVar.b, lsoVar.c));
        }
        return zy11.a;
    }
}
