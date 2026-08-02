package defpackage;

import io.appmetrica.analytics.IReporterYandex;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Pair;
import kotlin.a;
import kotlin.collections.b;

/* loaded from: classes9.dex */
public final class a3u0 implements kgz {
    public final String a;
    public final String b;
    public final i3y c;

    public a3u0(String str, String str2, uyi uyiVar) {
        this.a = str;
        this.b = str2;
        this.c = a.a(new qhq0(13, uyiVar));
    }

    @Override // defpackage.kgz
    public final void a(String str, String str2, Throwable th) {
        String localizedMessage;
        c(str, str2.concat((th == null || (localizedMessage = th.getLocalizedMessage()) == null) ? "" : " throwable = ".concat(localizedMessage)));
    }

    @Override // defpackage.kgz
    public final void b(RuntimeException runtimeException, String str) {
        String localizedMessage = runtimeException.getLocalizedMessage();
        c("PlusWebSdkComponent", str.concat(localizedMessage != null ? " throwable = ".concat(localizedMessage) : ""));
    }

    public final void c(String str, String str2) {
        a6d0 a6d0Var = (a6d0) this.c.getValue();
        if (a6d0Var != null) {
            ((IReporterYandex) a6d0Var.a.getValue()).reportStatboxEvent(this.b, b.i(new Pair("session_id", this.a), new Pair("tag", str), new Pair(Constants.KEY_MESSAGE, str2)));
        }
    }
}
