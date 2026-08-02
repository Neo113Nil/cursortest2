package defpackage;

import java.io.IOException;

/* loaded from: classes8.dex */
public final class a4u implements p8w {
    @Override // defpackage.p8w
    public final kvj0 intercept(m8w m8wVar) {
        try {
            return ((zci0) m8wVar).b(((zci0) m8wVar).e);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            kbs.r(e2);
            return null;
        }
    }
}
