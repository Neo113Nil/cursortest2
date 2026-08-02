package defpackage;

import com.yandex.mob.j;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.ReporterConfig;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ets implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ets(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ArrayList arrayList = ((fts) obj).a;
                hz40 hz40Var = new hz40(arrayList.size());
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    jix jixVar = (jix) arrayList.get(i2);
                    Object obj2 = jixVar.b;
                    int i3 = jixVar.a;
                    do40.a(hz40Var, obj2 != null ? new s9x(Integer.valueOf(i3), jixVar.b) : Integer.valueOf(i3), jixVar);
                }
                return new do40(hz40Var);
            case 1:
                sot sotVar = (sot) ((zn20) obj);
                sotVar.getClass();
                AppMetrica.activateReporter(sotVar.a, ReporterConfig.newConfigBuilder("b1b14fd8-aad7-4d9b-9e24-975f6db5c42a").withLogs().build());
                return new rot(sotVar);
            default:
                return new xo20(((j) obj).a);
        }
    }
}
