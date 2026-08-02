package defpackage;

import java.io.InputStream;

/* loaded from: classes9.dex */
public final class ip50 implements jp50 {
    public static final ip50 a = new ip50();

    @Override // defpackage.jp50
    public final void delete(p7j0 p7j0Var) {
    }

    @Override // defpackage.jp50
    public final void invalidate() {
    }

    @Override // defpackage.jp50
    public final kc7 load(p7j0 p7j0Var, tls tlsVar) {
        return null;
    }

    @Override // defpackage.jp50
    public final dyg save(n8j0 n8j0Var, boolean z, InputStream inputStream, tls tlsVar) {
        return (dyg) tlsVar.invoke(inputStream);
    }
}
