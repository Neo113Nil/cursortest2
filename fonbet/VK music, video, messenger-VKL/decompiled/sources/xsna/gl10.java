package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.b5x;

/* compiled from: MatcherGroup.kt */
/* loaded from: classes18.dex */
public abstract class gl10 implements el10 {
    public final ArrayList a = new ArrayList();

    @Override // xsna.el10
    public final uao0 a(b5x.c cVar, Context context) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            uao0 a = ((el10) it.next()).a(cVar, context);
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    @Override // xsna.el10
    public boolean b(b5x.c cVar, Context context) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.el10
    public final boolean c(b5x b5xVar, Canvas canvas) {
        View view = (View) b5xVar;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            el10 el10Var = (el10) it.next();
            if (el10Var.b(b5xVar.getDesignInspectorParams(), view.getContext()) && el10Var.c(b5xVar, canvas)) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.el10
    public boolean d(b5x b5xVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (((el10) it.next()).d(b5xVar)) {
                return true;
            }
        }
        return false;
    }
}
