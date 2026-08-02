package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.measurement.internal.n;
import java.util.Map;

/* loaded from: classes.dex */
public final class dcb1 implements eeb1, uyz0 {
    public final /* synthetic */ Object a;

    public /* synthetic */ dcb1(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.eeb1
    public void a(String str, String str2, Bundle bundle) {
        boolean isEmpty = TextUtils.isEmpty(str);
        n nVar = (n) this.a;
        if (!isEmpty) {
            nVar.M1().Pg(new kz(this, str, str2, bundle));
            return;
        }
        g gVar = nVar.E;
        if (gVar != null) {
            y1a1 y1a1Var = gVar.y;
            g.g(y1a1Var);
            y1a1Var.z.b(str2, "AppId not known when logging event");
        }
    }

    @Override // defpackage.uyz0
    public void g(double d, Map map) {
        ev20 ev20Var = (ev20) this.a;
        ev20Var.a.reportTotalScore(ev20Var.r, "V2", d, map);
    }

    @Override // defpackage.uyz0
    public void h(double d, Map map) {
        ev20 ev20Var = (ev20) this.a;
        ev20Var.a.reportTotalScoreStartupSpecific(ev20Var.r, "V2", d, map, "warm");
    }

    @Override // defpackage.uyz0
    public void j(double d, Map map) {
        ev20 ev20Var = (ev20) this.a;
        ev20Var.a.reportTotalScoreStartupSpecific(ev20Var.r, "V2", d, map, "hot");
    }

    @Override // defpackage.uyz0
    public void l(double d, Map map) {
        ev20 ev20Var = (ev20) this.a;
        ev20Var.a.reportTotalScoreStartupSpecific(ev20Var.r, "V2", d, map, "cold");
    }
}
