package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import kotlin.text.Regex;
import xsna.it80;

/* compiled from: VmojiDownloaderImpl.kt */
/* loaded from: classes7.dex */
public final class n8w0 {
    public final s8w0 a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final bpn0 c = new bpn0(new xvc0(8));

    public n8w0(s8w0 s8w0Var) {
        this.a = s8w0Var;
    }

    public final io.reactivex.rxjava3.internal.operators.observable.f0 a(final UserId userId, String str, final String str2) {
        final s8w0 s8w0Var = this.a;
        return new io.reactivex.rxjava3.internal.operators.observable.s0(new Callable() { // from class: xsna.r8w0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                s8w0 s8w0Var2 = s8w0.this;
                File a = s8w0Var2.a();
                String str3 = str2;
                File file = new File(a, str3);
                Regex regex = com.vk.core.files.a.a;
                boolean g = vhk0.g(file);
                UserId userId2 = userId;
                if (g) {
                    s8w0Var2.b().a(System.currentTimeMillis(), userId2);
                    L.e("Access time of file " + str3 + " for user " + userId2 + " was updated");
                    it80.b.getClass();
                    return new it80(file);
                }
                o8w0 f = s8w0Var2.b().f(userId2);
                if (f != null) {
                    String str4 = f.b;
                    if (!epx.f(str4, str3)) {
                        vhk0.b(new File(s8w0Var2.a(), str4));
                        s8w0Var2.b().d(System.currentTimeMillis(), userId2, str3);
                        L.e("Outdated file " + str4 + " for user " + userId2 + " removed because new file " + str3 + " was requested");
                    }
                }
                it80.b.getClass();
                return it80.a.a();
            }
        }).L(new i3u(new hnq(1, str, this, str2, userId), 25), false).U(new l340(new udk0(8), 23)).U(new xw70(new xau0(userId, 2), 17)).K();
    }

    public final void b(String str) {
        io.reactivex.rxjava3.core.x.k(str).m(asu0.a.d()).subscribe(new dfr0(new l6w0(this, 1), 7), new wau0(new et0(str, 3), 6));
    }
}
