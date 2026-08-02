package yads;

import android.content.Context;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Lambda;
import xsna.bdn;
import xsna.gzs;
import xsna.myc0;
import xsna.s3q0;
import xsna.vhn0;
import xsna.wgl;
import xsna.whn0;
import xsna.zvj;

/* loaded from: classes10.dex */
public final class sv1 extends Lambda implements gzs {
    public final /* synthetic */ Context b;
    public final /* synthetic */ ov2 c;
    public final /* synthetic */ l00 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv1(Context context, ov2 ov2Var, l00 l00Var) {
        super(0);
        this.b = context;
        this.c = ov2Var;
        this.d = l00Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        Context context = this.b;
        ov2 ov2Var = this.c;
        l00 l00Var = this.d;
        x10 x10Var = new x10();
        vhn0 a = whn0.a();
        bdn bdnVar = bdn.a;
        myc0.h(zvj.a(d.a.a(a, wgl.c).plus(x10Var)), null, null, new tv1(context, ov2Var, null), 3);
        l00Var.onInitializationCompleted();
        return s3q0.a;
    }
}
