package xsna;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class hh60 implements Callable {
    public final /* synthetic */ int b;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.b;
        JSONObject b = zeq0.b();
        if ((i & 1) != 0) {
            e1j0.a.getClass();
            b.put("volume", e1j0.d);
        }
        return b.toString();
    }
}
