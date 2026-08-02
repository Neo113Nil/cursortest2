package xsna;

import java.util.concurrent.CopyOnWriteArrayList;
import one.video.cast.session.action.CastAction;
import xsna.lvf0;
import xsna.xsi0;

/* compiled from: RemoteMediaClientAdapter.kt */
/* loaded from: classes11.dex */
public final class mvf0 extends lvf0.a {
    public final xsi0.b a;
    public lvf0 b;

    public mvf0(xsi0.b bVar) {
        this.a = bVar;
    }

    @Override // xsna.lvf0.a
    public final void e() {
        lvf0 lvf0Var = this.b;
        Integer valueOf = lvf0Var != null ? Integer.valueOf(lvf0Var.i()) : null;
        xsi0.b bVar = this.a;
        if (valueOf != null && valueOf.intValue() == 0) {
            if (bVar != null) {
                CopyOnWriteArrayList<ez9> copyOnWriteArrayList = xsi0.a;
                xsi0.a(CastAction.PLAYER_STATE_UNKNOWN);
                return;
            }
            return;
        }
        if (valueOf == null || valueOf.intValue() != 1) {
            if (valueOf != null && valueOf.intValue() == 2) {
                if (bVar != null) {
                    CopyOnWriteArrayList<ez9> copyOnWriteArrayList2 = xsi0.a;
                    xsi0.a(CastAction.VIDEO_PLAYED);
                    return;
                }
                return;
            }
            if (valueOf != null && valueOf.intValue() == 3) {
                if (bVar != null) {
                    CopyOnWriteArrayList<ez9> copyOnWriteArrayList3 = xsi0.a;
                    xsi0.a(CastAction.VIDEO_PAUSED);
                    return;
                }
                return;
            }
            if (valueOf != null && valueOf.intValue() == 4) {
                if (bVar != null) {
                    CopyOnWriteArrayList<ez9> copyOnWriteArrayList4 = xsi0.a;
                    xsi0.a(CastAction.VIDEO_BUFFERING);
                    return;
                }
                return;
            }
            if (valueOf == null || valueOf.intValue() != 5 || bVar == null) {
                return;
            }
            CopyOnWriteArrayList<ez9> copyOnWriteArrayList5 = xsi0.a;
            xsi0.a(CastAction.VIDEO_LOADING);
            return;
        }
        lvf0 lvf0Var2 = this.b;
        Integer valueOf2 = lvf0Var2 != null ? Integer.valueOf(lvf0Var2.e()) : null;
        if (valueOf2 != null && valueOf2.intValue() == 0) {
            if (bVar != null) {
                CopyOnWriteArrayList<ez9> copyOnWriteArrayList6 = xsi0.a;
                xsi0.a(CastAction.SESSION_STARTED);
                return;
            }
            return;
        }
        if (valueOf2 != null && valueOf2.intValue() == 1) {
            if (bVar != null) {
                CopyOnWriteArrayList<ez9> copyOnWriteArrayList7 = xsi0.a;
                xsi0.a(CastAction.VIDEO_FINISHED);
                return;
            }
            return;
        }
        if (valueOf2 != null && valueOf2.intValue() == 2) {
            if (bVar != null) {
                CopyOnWriteArrayList<ez9> copyOnWriteArrayList8 = xsi0.a;
                xsi0.a(CastAction.PLAYER_STATE_IDLE_REASON_CANCELED);
                return;
            }
            return;
        }
        if (valueOf2 != null && valueOf2.intValue() == 3) {
            if (bVar != null) {
                CopyOnWriteArrayList<ez9> copyOnWriteArrayList9 = xsi0.a;
                xsi0.a(CastAction.PLAYER_STATE_IDLE_REASON_INTERRUPTED);
                return;
            }
            return;
        }
        if (valueOf2 == null || valueOf2.intValue() != 4 || bVar == null) {
            return;
        }
        CopyOnWriteArrayList<ez9> copyOnWriteArrayList10 = xsi0.a;
        xsi0.a(CastAction.PLAYER_STATE_IDLE_REASON_ERROR);
    }
}
