package defpackage;

import com.yandex.plus.experiments.impl.providers.a;
import kotlin.Result;
import kotlin.jvm.internal.PropertyReference0;

/* loaded from: classes2.dex */
public final /* synthetic */ class jbd0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ hhw b;

    public /* synthetic */ jbd0(hhw hhwVar, int i) {
        this.a = i;
        this.b = hhwVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        hhw hhwVar = this.b;
        switch (i) {
            case 0:
                Object h = ((a) ((PropertyReference0) ((sls) hhwVar.c)).get()).h();
                return (k2d0) (h instanceof Result.Failure ? null : h);
            default:
                Object h2 = ((a) ((PropertyReference0) ((sls) hhwVar.c)).get()).h();
                return (k2d0) (h2 instanceof Result.Failure ? null : h2);
        }
    }
}
