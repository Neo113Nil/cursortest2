package yads;

import io.appmetrica.analytics.AppMetricaLibraryAdapter;
import java.util.concurrent.Executor;
import kotlin.Result;
import xsna.ew4;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class ve implements dg {
    public static final Object c = new Object();
    public final te a;
    public final Executor b;

    public ve(te teVar, Executor executor) {
        this.a = teVar;
        this.b = executor;
    }

    public static void a(bg bgVar) {
        bgVar.a();
        bgVar.b();
    }

    public final void b(bg bgVar) {
        this.b.execute(new ew4(7, this, bgVar));
    }

    public static final void a(ve veVar, bg bgVar) {
        Object failure;
        veVar.getClass();
        a(bgVar);
        if (veVar.a.a.b()) {
            try {
                AppMetricaLibraryAdapter.reportEvent("ads_sdk", bgVar.a, bgVar.b);
                failure = s3q0.a;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Result.a(failure);
        }
    }
}
