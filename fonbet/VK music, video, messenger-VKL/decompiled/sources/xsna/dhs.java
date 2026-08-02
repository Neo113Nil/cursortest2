package xsna;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.vk.pushes.notifications.im.MessageNotificationContainer;
import com.vk.sqliteext.observer.SQLiteContentObserver;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class dhs implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ dhs(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ri6 pa20Var;
        switch (this.b) {
            case 0:
                fhs fhsVar = (fhs) this.c;
                fhsVar.R((ImageRequestBuilder) this.d, (ImageRequestBuilder) this.e);
                fhsVar.D = null;
                break;
            case 1:
                u6x u6xVar = (u6x) this.c;
                w6x w6xVar = (w6x) this.d;
                StringBuilder a = t33.a("canceling by '", (String) this.e, "' job '");
                a.append(w6xVar.e);
                a.append('\'');
                u6xVar.h(a.toString());
                u6xVar.k(w6xVar, "onCancel", new pw(14, w6xVar, u6xVar));
                break;
            case 2:
                wi30 wi30Var = (wi30) this.c;
                Context context = (Context) this.d;
                uk70 uk70Var = (uk70) this.e;
                if (!wi30Var.g) {
                    qa20 qa20Var = qa20.b;
                    List e = qa20Var.a.e(Long.valueOf(uk70Var.b), Long.valueOf(uk70Var.a));
                    if (!e.isEmpty()) {
                        MessageNotificationContainer a2 = wi30Var.a(uk70Var);
                        if (uk70Var.k) {
                            pa20Var = new qtb(context, a2, uk70Var.q.b, uk70Var.i.b, e, (sfg) null, (xsw) null, 224);
                        } else {
                            pa20Var = new pa20(context, a2, uk70Var.i.b, e, (Intent) null, (gzs) null, (gzs) null, 232);
                        }
                        pa20Var.g((NotificationManager) context.getSystemService("notification"));
                        break;
                    }
                }
                break;
            case 3:
                SQLiteContentObserver.onRowsChanged$lambda$4((String) this.c, (String) this.d, (long[]) this.e);
                break;
            default:
                ((yads.cl) this.c).b((yads.nx0) this.d, (yads.va0) this.e);
                break;
        }
    }
}
