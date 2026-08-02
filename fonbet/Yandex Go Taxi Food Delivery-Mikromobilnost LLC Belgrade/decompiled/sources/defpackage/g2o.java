package defpackage;

import java.security.Provider;
import javax.crypto.Mac;

/* loaded from: classes.dex */
public class g2o implements j2o {
    @Override // defpackage.j2o
    public final Object a(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }
}
