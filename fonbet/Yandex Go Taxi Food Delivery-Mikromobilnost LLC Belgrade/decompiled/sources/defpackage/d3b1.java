package defpackage;

import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.mlkit_vision_text_common.o;
import com.google.android.gms.internal.mlkit_vision_text_common.zzot;
import com.google.android.gms.internal.mlkit_vision_text_common.zzov;
import com.google.android.gms.internal.mlkit_vision_text_common.zzsb;
import com.google.mlkit.common.sdkinternal.a;
import java.util.concurrent.Executor;

/* loaded from: classes11.dex */
public final class d3b1 extends hv20 implements dsy0 {
    public final fsy0 y;

    public d3b1(gsy0 gsy0Var, Executor executor, o oVar, fsy0 fsy0Var) {
        super(gsy0Var, executor);
        this.y = fsy0Var;
        ebb1 ebb1Var = new ebb1();
        ebb1Var.c = fsy0Var.a() ? zzot.TYPE_THICK : zzot.TYPE_THIN;
        tmb1 tmb1Var = new tmb1();
        jnb1 jnb1Var = new jnb1();
        jnb1Var.a = zzsb.LATIN;
        tmb1Var.c = new qnb1(jnb1Var);
        ebb1Var.d = new xmb1(tmb1Var);
        a.c().execute(new kz(oVar, new o3(ebb1Var, 1), zzov.ON_DEVICE_TEXT_CREATE, oVar.c(), 17));
    }

    @Override // defpackage.t9j
    public final int Q2() {
        return 4;
    }

    @Override // defpackage.ag70
    public final Feature[] a() {
        return this.y.a() ? bg70.a : new Feature[]{bg70.d};
    }
}
