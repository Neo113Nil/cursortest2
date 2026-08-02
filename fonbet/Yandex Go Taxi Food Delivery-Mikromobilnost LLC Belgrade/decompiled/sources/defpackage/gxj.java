package defpackage;

import flex.network.cache.impl.b;
import flex.network.cache.parsing.CacheMode;
import java.io.File;
import java.io.InputStream;

/* loaded from: classes9.dex */
public final class gxj implements jp50 {
    public final b a;

    public gxj(oy2 oy2Var, File file, File file2, sls slsVar, zcx zcxVar) {
        File file3 = new File(file, "Document");
        file3.mkdirs();
        File file4 = new File(file2, "Document");
        file4.mkdirs();
        yvi0 yvi0Var = new yvi0((uo11) ffx.X(file4, "matchfields.json", new k8u(auu0.a, s610.Companion.serializer(), 1)));
        File file5 = new File(file3, "Documents");
        file5.mkdirs();
        zjr zjrVar = new zjr(xfz.b(gxj.class.getSimpleName()));
        yvi0 yvi0Var2 = new yvi0(new jb7(new vg7(1, zjrVar, file5), new ou(12, file5, zjrVar), zjrVar));
        ee7 ee7Var = fe7.Companion;
        this.a = new b(yvi0Var, new cot(ffx.X(file3, "meta.json", new k8u(ee7Var.serializer(), j820.Companion.serializer(), 1))), yvi0Var2, oy2Var, new nfh(CacheMode.DISK, slsVar), ke7.a, slsVar, new qc20((uo11) ffx.X(file3, "part.json", new k8u(ee7Var.serializer(), new p53(ee7Var.serializer(), 0), 1))), zcxVar);
    }

    @Override // defpackage.jp50
    public final void delete(p7j0 p7j0Var) {
        this.a.delete(p7j0Var);
    }

    @Override // defpackage.jp50
    public final void invalidate() {
        this.a.invalidate();
    }

    @Override // defpackage.jp50
    public final kc7 load(p7j0 p7j0Var, tls tlsVar) {
        return this.a.load(p7j0Var, tlsVar);
    }

    @Override // defpackage.jp50
    public final dyg save(n8j0 n8j0Var, boolean z, InputStream inputStream, tls tlsVar) {
        return this.a.save(n8j0Var, z, inputStream, tlsVar);
    }
}
