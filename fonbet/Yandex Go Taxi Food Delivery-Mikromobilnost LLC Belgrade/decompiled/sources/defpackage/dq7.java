package defpackage;

import androidx.camera.video.h;
import com.yandex.mobile.drive.scan.ui.a;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class dq7 implements e9e {
    public final /* synthetic */ Executor a;
    public final /* synthetic */ a b;
    public final /* synthetic */ iq7 c;

    public dq7(pdy pdyVar, Executor executor, a aVar) {
        this.c = pdyVar;
        this.a = executor;
        this.b = aVar;
    }

    @Override // defpackage.e9e
    public final void accept(Object obj) {
        in31 in31Var = (in31) obj;
        if (in31Var instanceof dn31) {
            if (tob1.d()) {
                iq7 iq7Var = this.c;
                h hVar = (h) iq7Var.n.remove(this);
                if (hVar != null && iq7Var.m == hVar) {
                    iq7Var.m = null;
                }
            } else {
                this.a.execute(new dn7(2, this));
            }
        }
        this.b.accept(in31Var);
    }
}
