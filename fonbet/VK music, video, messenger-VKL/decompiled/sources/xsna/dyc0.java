package xsna;

import android.content.Context;
import androidx.datastore.core.DataStoreImpl;
import java.util.Collections;
import java.util.List;

/* compiled from: PreferenceDataStoreDelegate.android.kt */
/* loaded from: classes.dex */
public final class dyc0 implements i7f0<Context, fvk<uyc0>> {
    public final String b;
    public final x0g0<uyc0> c;
    public final izs<Context, List<fuk<uyc0>>> d;
    public final yvj e;
    public final Object f = new Object();
    public volatile xxc0 g;

    /* JADX WARN: Multi-variable type inference failed */
    public dyc0(String str, x0g0<uyc0> x0g0Var, izs<? super Context, ? extends List<? extends fuk<uyc0>>> izsVar, yvj yvjVar) {
        this.b = str;
        this.c = x0g0Var;
        this.d = izsVar;
        this.e = yvjVar;
    }

    @Override // xsna.i7f0
    public final fvk<uyc0> getValue(Context context, qcy qcyVar) {
        xxc0 xxc0Var;
        Context context2 = context;
        xxc0 xxc0Var2 = this.g;
        if (xxc0Var2 != null) {
            return xxc0Var2;
        }
        synchronized (this.f) {
            try {
                if (this.g == null) {
                    Context applicationContext = context2.getApplicationContext();
                    twj twjVar = this.c;
                    List<fuk<uyc0>> invoke = this.d.invoke(applicationContext);
                    yvj yvjVar = this.e;
                    yy70 yy70Var = new yy70(tar.a, new ayc0(new cyc0(applicationContext, this)));
                    if (twjVar == null) {
                        twjVar = new po40(4);
                    }
                    this.g = new xxc0(new xxc0(new DataStoreImpl(yy70Var, Collections.singletonList(new guk(invoke, null)), twjVar, yvjVar)));
                }
                xxc0Var = this.g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return xxc0Var;
    }
}
