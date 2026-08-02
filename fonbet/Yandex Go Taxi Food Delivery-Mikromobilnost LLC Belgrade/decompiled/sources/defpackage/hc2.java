package defpackage;

import androidx.compose.ui.draw.b;
import com.yandex.messaging.internal.entities.MessageData;

/* loaded from: classes10.dex */
public final /* synthetic */ class hc2 implements tls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object w;

    public /* synthetic */ hc2(boolean z, long j, sls slsVar) {
        this.c = j;
        this.w = slsVar;
        this.b = z;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.w;
        switch (i) {
            case 0:
                b bVar = (b) obj;
                return bVar.b(new cc2((sls) obj2, this.b, pva1.e(bVar, Float.intBitsToFloat((int) (bVar.a.c() >> 32)) / 2.0f), new c36(this.c, 5), 0));
            default:
                ndz0 ndz0Var = (ndz0) obj2;
                yab yabVar = (yab) obj;
                MessageData R = yabVar.R();
                R.moderationUserChoice = Boolean.valueOf(this.b);
                String json2 = ndz0Var.p.toJson(R);
                long G = yabVar.G();
                ndz0Var.d.d(G, json2);
                az10 az10Var = ndz0Var.c;
                long j = this.c;
                ndz0Var.k.h(j, alb1.j(az10Var, j, G, json2));
                return Boolean.TRUE;
        }
    }

    public /* synthetic */ hc2(boolean z, ndz0 ndz0Var, long j) {
        this.b = z;
        this.w = ndz0Var;
        this.c = j;
    }
}
