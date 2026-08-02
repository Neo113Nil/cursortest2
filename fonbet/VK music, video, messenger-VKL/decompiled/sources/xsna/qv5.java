package xsna;

import android.os.Build;
import java.util.Iterator;
import xsna.q630;

/* compiled from: BackdropBlur.kt */
/* loaded from: classes17.dex */
public final class qv5 extends q630.c implements lio, o1u {
    public boolean p;
    public rv5 q;

    @Override // xsna.o1u
    public final void T1(androidx.compose.ui.node.o oVar) {
        this.q.b = oVar.D(0L);
        Iterator it = this.q.d.iterator();
        while (it.hasNext()) {
            ((gzs) it.next()).invoke();
        }
    }

    @Override // xsna.lio
    public final void v(toy toyVar) {
        if (!this.p || Build.VERSION.SDK_INT < 31) {
            toyVar.s1();
            return;
        }
        oio.G1(toyVar, this.q.a, new k9(toyVar, 6));
        qdu.a(toyVar, this.q.a);
        Iterator it = this.q.d.iterator();
        while (it.hasNext()) {
            ((gzs) it.next()).invoke();
        }
    }

    @Override // xsna.lio
    public final void i1() {
    }
}
