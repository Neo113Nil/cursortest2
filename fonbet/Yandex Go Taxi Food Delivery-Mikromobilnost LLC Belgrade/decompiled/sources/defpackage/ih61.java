package defpackage;

import android.util.Base64;
import com.google.android.gms.tasks.zzw;
import com.google.android.play.core.integrity.IntegrityServiceException;
import com.google.android.play.core.integrity.a;
import com.google.android.play.integrity.internal.e;

/* loaded from: classes.dex */
public final class ih61 {
    public final ji61 a;

    public ih61(ji61 ji61Var) {
        this.a = ji61Var;
    }

    public final zzw a(r7w r7wVar) {
        ji61 ji61Var = this.a;
        e eVar = ji61Var.d;
        if (eVar == null) {
            return udq0.o(new IntegrityServiceException(-2, null));
        }
        try {
            byte[] decode = Base64.decode(r7wVar.c(), 10);
            Long b = r7wVar.b();
            ji61Var.a.a("requestIntegrityToken(%s)", r7wVar);
            atx0 atx0Var = new atx0();
            a aVar = new a(ji61Var, atx0Var, decode, b, atx0Var, r7wVar);
            eVar.a().post(new jo81(eVar, aVar.c(), atx0Var, aVar));
            return atx0Var.a;
        } catch (IllegalArgumentException e) {
            return udq0.o(new IntegrityServiceException(-13, e));
        }
    }
}
