package xsna;

import java.util.Map;
import java.util.concurrent.ExecutorService;

/* compiled from: StatInteractorImpl.kt */
/* loaded from: classes11.dex */
public final class gsk0 implements mxi0 {
    public final ExecutorService a;

    public gsk0(ExecutorService executorService) {
        this.a = executorService;
    }

    @Override // xsna.mxi0
    public final void a(Map<String, String> map) {
        this.a.submit(new wv4(11, "superappkit_session_management_error", map));
    }

    @Override // xsna.mxi0
    public final void b(String str, Map<String, String> map) {
        this.a.submit(new wv4(11, str, map));
    }

    @Override // xsna.mxi0
    public final void c(Map<String, String> map) {
        this.a.submit(new wv4(11, "superappkit_session_management_debug", map));
    }
}
