package defpackage;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import com.squareup.moshi.Moshi;
import com.yandex.messaging.internal.LocalMessageRef;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.view.timeline.i;
import com.yandex.messaging.support.view.timeline.TimelineLayoutManager;
import defpackage.iaz0;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes15.dex */
public final class obb implements a9b {
    public static final /* synthetic */ kgx[] D;
    public boolean A;
    public ServerMessageRef B;
    public final /* synthetic */ pbb C;
    public i a;
    public final fv10 b;
    public final ServerMessageRef c;
    public final LocalMessageRef w;
    public boolean y;
    public final Handler x = new Handler();
    public final qp3 z = new qp3();

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl("timelineCursor", 0, "getTimelineCursor()Lcom/yandex/messaging/internal/storage/ChatTimelineCursor;", obb.class);
        qoi0.a.getClass();
        D = new kgx[]{mutablePropertyReference1Impl};
    }

    public obb(pbb pbbVar, i iVar, fv10 fv10Var, ServerMessageRef serverMessageRef, LocalMessageRef localMessageRef) {
        this.C = pbbVar;
        this.a = iVar;
        this.b = fv10Var;
        this.c = serverMessageRef;
        this.w = localMessageRef;
    }

    @Override // defpackage.a9b
    public final void B(j9b j9bVar) {
        ServerMessageRef serverMessageRef = this.c;
        if (serverMessageRef == null) {
            LocalMessageRef localMessageRef = this.w;
            if (localMessageRef != null) {
                String str = j9bVar.h().b;
                Long serverTimestamp = localMessageRef.getServerTimestamp();
                serverMessageRef = new ServerMessageRef(str, serverTimestamp != null ? serverTimestamp.longValue() : localMessageRef.getTimestamp());
            } else {
                serverMessageRef = null;
            }
        }
        this.B = serverMessageRef;
        ebb d = j9bVar.d();
        ServerMessageRef serverMessageRef2 = this.B;
        if (serverMessageRef2 == null || d.b(serverMessageRef2) == null) {
            ev10 ev10Var = fv10.a;
            fv10 fv10Var = this.b;
            if (fv10Var != ev10Var || d.c() == null) {
                if (fv10Var != fv10.b || d.d() == null) {
                    vcz0 b = j9bVar.b();
                    tje.e();
                    k020 k020Var = b.b;
                    o1b0 o1b0Var = b.a;
                    j3b k = k020Var.k(o1b0Var.a);
                    long j = o1b0Var.a;
                    at2 at2Var = k020Var.b;
                    yab yabVar = new yab(at2Var.B().L(j), (Moshi) k020Var.h.get(), at2Var.Y().g(j));
                    new iaz0().a(new iaz0.a());
                    int a = fv10Var.a(k, k020Var);
                    yab f = b.f();
                    b(yabVar, a);
                    a(yabVar, null, a, f);
                }
            }
        }
    }

    public final void a(yab yabVar, iaz0 iaz0Var, int i, yab yabVar2) {
        tje.e();
        i iVar = this.a;
        if (iVar == null) {
            yabVar.close();
            return;
        }
        yabVar.c = this.C.c;
        if (iaz0Var == null) {
            iaz0Var = new iaz0();
            iaz0Var.a(new iaz0.a());
        }
        iVar.r(yabVar, iaz0Var, yabVar2);
        if (!this.y) {
            this.y = true;
            if (i >= 0) {
                if (iVar.Z) {
                    iVar.Z = false;
                    iVar.a0 = null;
                    hab habVar = iVar.z;
                    int i2 = -1;
                    if (i == -1) {
                        habVar.getClass();
                    } else {
                        i2 = habVar.f() + i;
                    }
                    TimelineLayoutManager timelineLayoutManager = iVar.M;
                    timelineLayoutManager.K.makeAtTop(i2);
                    timelineLayoutManager.b0 = 0;
                    timelineLayoutManager.i1();
                }
            } else if (iVar.a0 != null) {
                iVar.a0 = null;
                iVar.Z = false;
                Toast.makeText(iVar.L.getContext(), oyh0.messenger_removed_message_text, 0).show();
            }
        }
        kgx kgxVar = D[0];
        this.z.b(yabVar);
    }

    public final void b(yab yabVar, int i) {
        int i2 = i - this.C.d.a;
        if (i2 < 0) {
            i2 = 0;
        }
        Cursor cursor = yabVar.a;
        AbstractWindowedCursor abstractWindowedCursor = cursor instanceof AbstractWindowedCursor ? (AbstractWindowedCursor) cursor : null;
        if (abstractWindowedCursor != null) {
            if (i2 < 0) {
                abstractWindowedCursor.getCount();
            } else {
                abstractWindowedCursor.onMove(0, i2);
                abstractWindowedCursor.moveToPosition(i2);
            }
        }
    }

    @Override // defpackage.a9b
    public final void close() {
        this.a = null;
        kgx kgxVar = D[0];
        this.z.b(null);
    }

    @Override // defpackage.a9b
    public final e1k w(s020 s020Var) {
        z83.g(null, this.C.a.get(), Looper.myLooper());
        rbb rbbVar = (rbb) ((m8g) s020Var).t0.get();
        ServerMessageRef serverMessageRef = this.B;
        rbbVar.getClass();
        return new qbb(rbbVar, this, this.b, serverMessageRef);
    }
}
