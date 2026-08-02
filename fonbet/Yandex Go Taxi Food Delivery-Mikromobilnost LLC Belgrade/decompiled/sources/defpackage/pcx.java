package defpackage;

import com.google.gson.Strictness;
import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class pcx {
    @Deprecated
    public pcx() {
    }

    public final String toString() {
        try {
            StringBuilder sb = new StringBuilder();
            afx afxVar = new afx(chb1.h(sb));
            afxVar.G(Strictness.LENIENT);
            ucx.a.getClass();
            ucx.c(this, afxVar);
            return sb.toString();
        } catch (IOException e) {
            ny61.f(e);
            return null;
        }
    }
}
