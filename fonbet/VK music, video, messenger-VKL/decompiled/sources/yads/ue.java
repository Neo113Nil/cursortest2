package yads;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaLibraryAdapter;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class ue {
    public static final AtomicBoolean d = new AtomicBoolean(false);
    public final bh a;
    public final zg b;
    public final te c;

    public /* synthetic */ ue(Context context) {
        this(new bh(), new zg(context), new te(context));
    }

    public final void a(Context context) {
        Object failure;
        if (this.b.b() && d.compareAndSet(false, true)) {
            boolean z = !this.a.a.b(context);
            if (this.c.a.b()) {
                try {
                    AppMetricaLibraryAdapter.activate(context, AppMetricaLibraryAdapterConfig.newConfigBuilder().withAdvIdentifiersTracking(z).build());
                    failure = s3q0.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Result.a(failure);
            }
        }
    }

    public ue(bh bhVar, zg zgVar, te teVar) {
        this.a = bhVar;
        this.b = zgVar;
        this.c = teVar;
    }
}
