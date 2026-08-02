package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.Iterator;
import xsna.b5x;

/* compiled from: Matcher.kt */
/* loaded from: classes18.dex */
public abstract class fl10 implements el10 {
    public final id3 a = new id3();

    @Override // xsna.el10
    public final uao0 a(b5x.c cVar, Context context) {
        tao0 e = e(cVar, context);
        if (e == null) {
            return null;
        }
        Iterator it = this.a.a.iterator();
        while (it.hasNext()) {
            uao0 b = ((ed3) it.next()).b(cVar, e, context);
            if (b != null) {
                return b;
            }
        }
        return null;
    }

    @Override // xsna.el10
    public final boolean b(b5x.c cVar, Context context) {
        return e(cVar, context) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.el10
    public final boolean c(b5x b5xVar, Canvas canvas) {
        if (!b(b5xVar.getDesignInspectorParams(), ((View) b5xVar).getContext())) {
            return false;
        }
        Iterator it = this.a.a.iterator();
        while (it.hasNext()) {
            ((ed3) it.next()).a(b5xVar, canvas);
        }
        return true;
    }

    @Override // xsna.el10
    public boolean d(b5x b5xVar) {
        return false;
    }

    public abstract tao0 e(b5x.c cVar, Context context);

    public final void f(izs izsVar) {
        izsVar.invoke(this.a);
    }
}
