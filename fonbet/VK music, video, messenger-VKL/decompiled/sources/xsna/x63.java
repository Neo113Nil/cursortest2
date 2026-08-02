package xsna;

import android.content.Context;
import com.vk.navigation.NavigationDelegateActivity;
import com.vkontakte.android.R;
import io.appmetrica.analytics.idsync.impl.D;
import io.appmetrica.analytics.idsync.internal.model.RequestConfig;
import xsna.s4m;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class x63 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ x63(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                d73 d73Var = (d73) this.c;
                NavigationDelegateActivity navigationDelegateActivity = (NavigationDelegateActivity) this.d;
                mq2 mq2Var = (mq2) this.e;
                if (d73Var.i == 0) {
                    d73Var.i = 1;
                    d73Var.b.submit(new y63(d73Var, navigationDelegateActivity, mq2Var, 0));
                    break;
                }
                break;
            case 1:
                s4m.a aVar = (s4m.a) this.c;
                String str = (String) this.d;
                s4m s4mVar = (s4m) this.e;
                mhy.a(aVar.itemView.getContext(), str);
                cvk.u(R.string.link_copied, false);
                String str2 = s4mVar.m;
                if (str2 != null) {
                    g2h g2hVar = new g2h(s4mVar.n);
                    String str3 = s4mVar.o;
                    if (str3 != null) {
                        g2hVar.e = str3;
                    }
                    g2hVar.b = str2;
                    g2hVar.c = "copy";
                    g2hVar.f = str;
                    g2hVar.a();
                    break;
                }
                break;
            case 2:
                io.appmetrica.analytics.idsync.impl.n.a((D) this.c, (io.appmetrica.analytics.idsync.impl.n) this.d, (RequestConfig) this.e);
                break;
            default:
                String str4 = (String) this.c;
                nv50 nv50Var = (nv50) this.d;
                xdz0.b(xdz0.a(str4, nv50Var.a, nv50Var.b, nv50Var.g, nv50Var.h, nv50Var.n, nv50Var.l, nv50Var.j, nv50Var.k, nv50Var.i, nv50Var.c, nv50Var.d, false, (Context) this.e));
                break;
        }
    }
}
