package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import xsna.g1e0;

/* compiled from: TaskInvalidateComposingBeginViaEvent.kt */
/* loaded from: classes2.dex */
public final class e6o0 extends zzp0<Void> {
    public static final f9w g = e9w.a(e6o0.class);
    public final com.vk.im.ui.components.dialogs_list.c d;
    public final long e;
    public final vh30 f;

    public e6o0(com.vk.im.ui.components.dialogs_list.c cVar, long j, vh30 vh30Var) {
        this.d = cVar;
        this.e = j;
        this.f = vh30Var;
    }

    @Override // xsna.zzp0
    public final void c(Throwable th) {
        g.a(th);
        if (this.d.f() != null) {
            zk70.e(th);
        }
    }

    @Override // xsna.zzp0
    public final void d() {
        h(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.zzp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Void r10) {
        ProfilesInfo profilesInfo;
        Peer peer;
        com.vk.im.ui.components.dialogs_list.c cVar = this.d;
        com.vk.im.ui.components.dialogs_list.e eVar = cVar.h;
        HashMap hashMap = eVar.t;
        long j = this.e;
        List list = (List) hashMap.get(Long.valueOf(j));
        ArrayList arrayList = list != null ? new ArrayList(list) : new ArrayList();
        vh30 vh30Var = this.f;
        int indexOf = arrayList.indexOf(vh30Var);
        if (indexOf >= 0) {
            if (((vh30) arrayList.get(indexOf)).b != vh30Var.b) {
                arrayList.remove(indexOf);
                arrayList.add(vh30Var);
            }
            profilesInfo = eVar.h;
            peer = vh30Var.a;
            if (((wpp) profilesInfo.g.get(peer.c)).b(Long.valueOf(peer.d))) {
                Peer peer2 = vh30Var.a;
                g1e0.a aVar = new g1e0.a();
                aVar.a.c(peer2);
                aVar.b = Source.ACTUAL;
                aVar.c = true;
                aVar.d = "DialogsListPresenter";
                cVar.m.b(cVar.d.F(cVar, new d1e0(new g1e0(aVar))).m(asu0.a.d()).subscribe(new gn0(new ow4(cVar, 3), 19), new iu1(new pw4(cVar, 3), 14)));
                return;
            }
            return;
        }
        arrayList.add(vh30Var);
        hashMap.put(Long.valueOf(j), arrayList);
        com.vk.im.ui.components.dialogs_list.c cVar2 = cVar.f() != null ? cVar : null;
        if (cVar2 != null) {
            cVar2.B(cVar2);
        }
        profilesInfo = eVar.h;
        peer = vh30Var.a;
        if (((wpp) profilesInfo.g.get(peer.c)).b(Long.valueOf(peer.d))) {
        }
    }

    public final String toString() {
        return "TaskInvalidateComposingBeginViaEvent(dialogId=" + this.e + ", composing=" + this.f + ')';
    }
}
