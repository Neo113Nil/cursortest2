package okhttp3;

import java.io.IOException;
import xsna.lb9;

/* compiled from: Call.kt */
/* loaded from: classes11.dex */
public interface d extends Cloneable {

    /* compiled from: Call.kt */
    public interface a {
        d a(p pVar);
    }

    void cancel();

    u execute() throws IOException;

    void f9(lb9 lb9Var);

    boolean g3();

    p request();
}
