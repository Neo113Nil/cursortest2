package defpackage;

import com.yandex.go.captcha.api.AuthChallengeResult;
import com.yandex.go.captcha.c;
import com.yandex.go.captcha.g;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.a;

/* loaded from: classes.dex */
public final class i38 {
    public final hb20 a;
    public g b;
    public c c;
    public final ConcurrentHashMap.KeySetView d = ConcurrentHashMap.newKeySet();
    public final ConcurrentHashMap.KeySetView e = ConcurrentHashMap.newKeySet();

    public i38(hb20 hb20Var) {
        this.a = hb20Var;
    }

    public final void a(AuthChallengeResult authChallengeResult) {
        ConcurrentHashMap.KeySetView keySetView = this.e;
        List J0 = a.J0(keySetView);
        keySetView.clear();
        Iterator it = J0.iterator();
        while (it.hasNext()) {
            ((tls) it.next()).invoke(authChallengeResult);
        }
    }

    public final void b(boolean z) {
        ConcurrentHashMap.KeySetView keySetView = this.d;
        List J0 = a.J0(keySetView);
        keySetView.clear();
        Iterator it = J0.iterator();
        while (it.hasNext()) {
            ((tls) it.next()).invoke(Boolean.valueOf(z));
        }
    }
}
