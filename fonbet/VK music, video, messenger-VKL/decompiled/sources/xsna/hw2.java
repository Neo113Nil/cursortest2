package xsna;

import android.content.Context;
import java.util.Arrays;
import java.util.List;
import xsna.iw2;

/* compiled from: AntispamView.kt */
/* loaded from: classes14.dex */
public final class hw2 extends i6v0<iw2, sv2> {
    public final iw2.a.b f;

    public hw2(Context context, vv2 vv2Var, iw2.a.b bVar) {
        super(context, vv2Var);
        this.f = bVar;
        vq.b(-1, -2, this.d);
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        h((iw2) ao50Var, izsVar, aVar, 512);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(iw2 iw2Var, izs<? super sv2, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1422881878);
        int i2 = (M.J(iw2Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1422881878, i2, -1, "com.vk.antispam.view.AntispamView.ThemedContent (AntispamView.kt:30)");
            }
            iw2.a aVar2 = (iw2.a) d(this.f, (n0u0[]) Arrays.copyOf(new n0u0[]{iw2Var.a}, 1), M, ((((i2 << 3) & 7168) | 4096) >> 3) & 896).getValue();
            if (aVar2 instanceof iw2.a.C3085a) {
                M.K(-691816874);
                iw2.a.C3085a c3085a = (iw2.a.C3085a) aVar2;
                x5g0.d((yr5) jk50.c(c3085a.a, M).getValue(), (List) jk50.c(c3085a.b, M).getValue(), ((Boolean) jk50.c(c3085a.c, M).getValue()).booleanValue(), izsVar, M, (i2 << 6) & 7168, 0);
                M.j();
            } else {
                if (!(aVar2 instanceof iw2.a.b)) {
                    throw alb0.c(1501701965, M);
                }
                M.K(-691417532);
                iw2.a.b bVar = (iw2.a.b) aVar2;
                x5g0.d(bVar.a, bVar.b, false, null, M, 0, 12);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new em(this, iw2Var, izsVar, i, 1);
        }
    }
}
