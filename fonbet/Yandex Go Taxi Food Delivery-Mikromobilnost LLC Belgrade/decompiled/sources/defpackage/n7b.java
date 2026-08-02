package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.yandex.messaging.core.net.entities.GetMediaMessagesParams;
import com.yandex.messaging.core.net.entities.RequestMessageType;
import com.yandex.messaging.internal.LocalMessageRef;
import com.yandex.messaging.internal.authorized.j;
import com.yandex.messaging.internal.entities.Message;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.a;
import kotlin.collections.EmptyList;

/* loaded from: classes15.dex */
public abstract class n7b implements x790 {
    public final String a;
    public final k020 b;
    public final j c;
    public final ks10 d;
    public final boolean e;
    public final Handler f;
    public final ike g;
    public final i3y h;

    public n7b(String str, k020 k020Var, j jVar, ks10 ks10Var, boolean z) {
        this.a = str;
        this.b = k020Var;
        this.c = jVar;
        this.d = ks10Var;
        this.e = z;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f = handler;
        this.g = bvf0.a(i6u.d(handler, null));
        this.h = a.a(new l7b(0, this));
    }

    @Override // defpackage.x790
    public final void b() {
        this.f.removeCallbacksAndMessages(null);
        kotlinx.coroutines.a.g(this.g.a, null);
    }

    @Override // defpackage.x790
    public final Long c(Object obj) {
        LocalMessageRef localMessageRef = ((mhv) ((o7b) obj)).a.getLocalMessageRef();
        return Long.valueOf(localMessageRef != null ? localMessageRef.getTimestamp() : 0L);
    }

    @Override // defpackage.x790
    public final void d(Object obj, int i, aq80 aq80Var) {
        long longValue = ((Number) obj).longValue();
        EmptyList emptyList = EmptyList.a;
        boolean z = this.e;
        i3y i3yVar = this.h;
        if (z) {
            j3b j3bVar = (j3b) i3yVar.getValue();
            if (j3bVar == null || j3bVar.H) {
                aq80Var.F(new w790(emptyList, false, false));
                return;
            } else {
                g(j3bVar, longValue, i, aq80Var);
                return;
            }
        }
        j3b j3bVar2 = (j3b) i3yVar.getValue();
        if (j3bVar2 == null || j3bVar2.H) {
            aq80Var.F(new w790(emptyList, false, false));
        } else {
            h(j3bVar2, longValue, i, aq80Var);
        }
    }

    @Override // defpackage.x790
    public final void e(Object obj, int i, yj70 yj70Var) {
        long longValue = ((Number) obj).longValue();
        EmptyList emptyList = EmptyList.a;
        boolean z = this.e;
        i3y i3yVar = this.h;
        if (z) {
            j3b j3bVar = (j3b) i3yVar.getValue();
            if (j3bVar == null || j3bVar.H) {
                yj70Var.F(new w790(emptyList, false, false));
                return;
            } else {
                h(j3bVar, longValue, i, yj70Var);
                return;
            }
        }
        j3b j3bVar2 = (j3b) i3yVar.getValue();
        if (j3bVar2 == null || j3bVar2.H) {
            yj70Var.F(new w790(emptyList, false, false));
        } else {
            g(j3bVar2, longValue, i, yj70Var);
        }
    }

    public abstract ArrayList f(j3b j3bVar, long j, long j2, int i);

    public final void g(j3b j3bVar, long j, int i, v790 v790Var) {
        zs21 zs21Var = new zs21(this.c, new t26(3, new GetMediaMessagesParams(j3bVar.b, this.b.u(this.a), j, 0, i, new RequestMessageType[]{RequestMessageType.IMAGE, RequestMessageType.GALLERY}, null, 64, null), new j7b(this, j3bVar, j, i, v790Var, 1), new k7b(v790Var, 1)));
        fse fseVar = this.g.a;
        sjh sjhVar = uyj.a;
        com.yandex.messaging.internal.suspend.a.a(new cn2(zs21Var, 1), fseVar, o400.a);
    }

    public final void h(j3b j3bVar, long j, int i, v790 v790Var) {
        zs21 zs21Var = new zs21(this.c, new t26(3, new GetMediaMessagesParams(j3bVar.b, this.b.u(this.a), j, i, 0, new RequestMessageType[]{RequestMessageType.IMAGE, RequestMessageType.GALLERY}, null, 64, null), new j7b(this, j3bVar, j, i, v790Var, 0), new k7b(v790Var, 0)));
        fse fseVar = this.g.a;
        sjh sjhVar = uyj.a;
        com.yandex.messaging.internal.suspend.a.a(new cn2(zs21Var, 1), fseVar, o400.a);
    }

    public final void i(ArrayList arrayList) {
        j3b j3bVar = (j3b) this.h.getValue();
        if (j3bVar != null) {
            long j = j3bVar.a;
            String str = j3bVar.b;
            String str2 = j3bVar.e;
            boolean z = j3bVar.C;
            boolean z2 = j3bVar.G;
            boolean z3 = j3bVar.K;
            o1b0 o1b0Var = new o1b0(j, str, str2, z, z2, j3bVar.D, j3bVar.E, j3bVar.s, j3bVar.u, j3bVar.v, z3, j3bVar.t, j3bVar.H);
            if (arrayList == null) {
                return;
            }
            l020 C = this.b.C();
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C.b0(o1b0Var, (Message) it.next(), true);
                }
                C.s();
                C.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ooc.g(C, th);
                    throw th2;
                }
            }
        }
    }
}
