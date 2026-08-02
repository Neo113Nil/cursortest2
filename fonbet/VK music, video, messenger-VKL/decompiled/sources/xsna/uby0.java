package xsna;

import java.util.Objects;
import java.util.function.Consumer;
import one.video.calls.sdk_private.aF;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class uby0 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uby0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                wby0 wby0Var = (wby0) this.b;
                ihy0 ihy0Var = (ihy0) obj;
                aF aFVar = wby0Var.b;
                Objects.toString(ihy0Var);
                Objects.toString(aFVar);
                wby0Var.e.f(ihy0Var, wby0Var.b, new uby0(wby0Var, 0));
                break;
            default:
                fky0 fky0Var = (fky0) this.b;
                ihy0 ihy0Var2 = (ihy0) obj;
                aky0 aky0Var = fky0Var.f;
                if (aky0Var.e < 0 || aky0Var.c != aky0Var.e) {
                    fky0Var.b.c.j(ihy0Var2, new uby0(fky0Var, 1), false);
                    break;
                }
                break;
        }
    }
}
