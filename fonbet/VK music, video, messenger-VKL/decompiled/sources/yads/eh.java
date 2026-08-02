package yads;

import android.content.Context;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.ReporterConfig;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;

/* loaded from: classes10.dex */
public final class eh extends Lambda implements gzs {
    public final /* synthetic */ gr3 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ fh d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh(gr3 gr3Var, Context context, fh fhVar, String str) {
        super(0);
        this.b = gr3Var;
        this.c = context;
        this.d = fhVar;
        this.e = str;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        gr3 gr3Var = this.b;
        gr3Var.a.a(this.c);
        fh fhVar = this.d;
        Context context = this.c;
        String str = this.e;
        if (fhVar.a.a()) {
            try {
                AppMetrica.activateReporter(context, ReporterConfig.newConfigBuilder(str).build());
            } catch (Throwable unused) {
            }
        }
        return AppMetrica.getReporter(this.c, this.e);
    }
}
