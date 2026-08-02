package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import androidx.compose.foundation.text.contextmenu.internal.b;

/* loaded from: classes10.dex */
public final /* synthetic */ class oc2 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ oc2(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        b bVar = this.b;
        switch (i) {
            case 0:
                sls slsVar = (sls) obj;
                View view = bVar.a;
                Handler handler = view.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    slsVar.invoke();
                } else {
                    Handler handler2 = view.getHandler();
                    if (handler2 != null) {
                        handler2.post(new h60(7, slsVar));
                    }
                }
                return zy11Var;
            case 1:
                ActionMode actionMode = bVar.h;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return zy11Var;
            case 2:
                ActionMode actionMode2 = bVar.h;
                if (actionMode2 != null) {
                    actionMode2.invalidateContentRect();
                }
                return zy11Var;
            default:
                bVar.e.d();
                return new w50(3, bVar);
        }
    }
}
