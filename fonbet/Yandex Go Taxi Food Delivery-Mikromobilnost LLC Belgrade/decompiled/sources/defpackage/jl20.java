package defpackage;

import android.content.Context;
import com.yandex.mob.api.model.MobEnvironment;
import com.yandex.mob.d;
import com.yandex.mob.datastore.c;
import com.yandex.mob.domain.l;
import com.yandex.mob.n;

/* loaded from: classes8.dex */
public final class jl20 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ jl20(d dVar, int i) {
        this.a = i;
        this.b = dVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        tpg tpgVar;
        int i = this.a;
        d dVar = this.b;
        switch (i) {
            case 0:
                return new l(dVar.b, (c) dVar.w.getValue(), dVar.h);
            case 1:
                return new n((l) dVar.x.getValue());
            default:
                Context context = dVar.a;
                MobEnvironment mobEnvironment = dVar.b;
                jse jseVar = dVar.n;
                kgx[] kgxVarArr = xn20.a;
                xn20.b.set(jseVar);
                int i2 = wn20.a[mobEnvironment.ordinal()];
                if (i2 == 1) {
                    tpgVar = (tpg) xn20.d.getValue(context, kgxVarArr[1]);
                } else {
                    if (i2 != 2) {
                        w511.b();
                        return null;
                    }
                    tpgVar = (tpg) xn20.c.getValue(context, kgxVarArr[0]);
                }
                return tpgVar.getData();
        }
    }
}
