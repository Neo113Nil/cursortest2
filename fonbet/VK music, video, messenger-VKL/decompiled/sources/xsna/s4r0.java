package xsna;

import android.content.Context;
import com.vk.uxpolls.domain.exception.NotConfiguredError;
import java.util.List;
import xsna.pvj;

/* compiled from: UxPollsConfigureTask.kt */
/* loaded from: classes18.dex */
public final class s4r0 implements gzs<s3q0> {
    public final Context b;
    public final b25 c;
    public final d4e0 d;
    public final List<String> e;
    public final myc0 f;

    public s4r0(Context context, b25 b25Var, d4e0 d4e0Var, List list, myc0 myc0Var) {
        this.b = context;
        this.c = b25Var;
        this.d = d4e0Var;
        this.e = list;
        this.f = myc0Var;
    }

    public final void a() {
        blq0 blq0Var = new blq0(this.c.c().b);
        ovj b = hqu0.b();
        jyv0 jyv0Var = new jyv0(this.f);
        l4r0.a = blq0Var;
        l4r0.b = this.d;
        if (b == null) {
            bdn bdnVar = bdn.a;
            b = wgl.c;
        }
        l4r0.c = b;
        Context context = this.b;
        jgs jgsVar = new jgs(context);
        znk0.m = jgsVar;
        u6g0 u6g0Var = new u6g0(context, jgsVar, jyv0Var);
        znk0.n = u6g0Var;
        znk0.o = new hhd0(u6g0Var);
        if (!znk0.C()) {
            new NotConfiguredError("retrievePolls() was called before configure()");
            return;
        }
        myc0.h(q1u.b, l4r0.c.plus(new m4r0(pvj.a.b)), null, new n4r0(true, this.e, null), 2);
    }

    @Override // xsna.gzs
    public final /* bridge */ /* synthetic */ s3q0 invoke() {
        a();
        return s3q0.a;
    }
}
