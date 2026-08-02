package xsna;

import java.io.IOException;
import java.io.InputStream;
import java.util.function.Consumer;
import one.video.calls.sdk_private.dF;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class tpy0 implements Consumer {
    public final /* synthetic */ vpy0 a;

    public /* synthetic */ tpy0(vpy0 vpy0Var) {
        this.a = vpy0Var;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        vpy0 vpy0Var = this.a;
        dry0 dry0Var = (dry0) obj;
        try {
            InputStream b = dry0Var.b();
            if (alk.k(b) == 65) {
                vpy0Var.a(alk.k(b), dry0Var);
            }
        } catch (IOException unused) {
        } catch (dF unused2) {
            dry0Var.a(966049156L);
            dry0Var.b(966049156L);
        }
    }
}
