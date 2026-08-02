package defpackage;

import android.app.Activity;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes10.dex */
public final /* synthetic */ class ot7 implements e9e {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ot7(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.e9e
    public final void accept(Object obj) {
        List list;
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Surface) obj3).release();
                ((SurfaceTexture) obj2).release();
                break;
            case 1:
                ((DefaultSurfaceProcessor) obj3).lambda$onOutputSurface$3((qnw0) obj2, (pnw0) obj);
                break;
            case 2:
                q0k.a((q0k) ((qnh) obj3).a, (zog) obj2, (x4b0) obj);
                break;
            case 3:
                ((DualSurfaceProcessor) obj3).lambda$onOutputSurface$2((qnw0) obj2, (pnw0) obj);
                break;
            case 4:
                kwt kwtVar = (kwt) obj3;
                sv4 sv4Var = (sv4) obj2;
                ok20 ok20Var = (ok20) obj;
                if (kwtVar.f) {
                    if (ok20Var != null) {
                        HashMap hashMap = ok20Var.a;
                        cvw.d("The detector does not exist", hashMap.containsKey(sv4Var) || ok20Var.b.containsKey(sv4Var));
                        list = (List) hashMap.get(sv4Var);
                    } else {
                        list = null;
                    }
                    ArrayList g = kwt.g(list);
                    kwtVar.h.g(g);
                    xlm0 xlm0Var = (xlm0) a.R(g);
                    if (xlm0Var != null) {
                        tls tlsVar = kwtVar.g;
                        if (tlsVar != null) {
                            tlsVar.invoke(xlm0Var.a);
                        }
                        kwtVar.g = null;
                        break;
                    }
                }
                break;
            case 5:
                dbs0 dbs0Var = (dbs0) obj3;
                Activity activity = (Activity) obj2;
                amp0 amp0Var = dbs0Var.e;
                if (amp0Var != null) {
                    amp0Var.K(activity, dbs0Var.a(activity));
                    break;
                }
                break;
            default:
                ((HashMap) ((u2c0) obj3).c).put((String) obj2, (in21) obj);
                break;
        }
    }
}
