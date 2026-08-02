package defpackage;

import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.mlkit_vision_face.n;
import com.google.android.gms.internal.mlkit_vision_face.zzkr;
import com.google.android.gms.internal.mlkit_vision_face.zzkt;
import com.google.mlkit.common.sdkinternal.a;
import java.util.concurrent.Executor;

/* loaded from: classes11.dex */
public final class p7p extends hv20 implements o7p {
    public final boolean y;

    static {
        new q7p();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p7p(j3a1 j3a1Var, alo aloVar, r7p r7pVar) {
        super(j3a1Var, r9);
        Executor executor = (Executor) aloVar.a.get();
        n e = y9b1.e(aga1.b());
        boolean c = aga1.c();
        this.y = c;
        rqa1 rqa1Var = new rqa1();
        rqa1Var.c = c ? zzkr.TYPE_THICK : zzkr.TYPE_THIN;
        dua1 dua1Var = new dua1();
        dua1Var.c = aga1.a(r7pVar);
        rqa1Var.d = new nua1(dua1Var);
        a.c().execute(new kz(e, new o3(rqa1Var, 1), zzkt.ON_DEVICE_FACE_CREATE, e.c(), 14));
    }

    @Override // defpackage.t9j
    public final int Q2() {
        return 2;
    }

    @Override // defpackage.ag70
    public final Feature[] a() {
        return this.y ? bg70.a : new Feature[]{bg70.c};
    }
}
