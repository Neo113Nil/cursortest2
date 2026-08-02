package xsna;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: TaskInvalidateComposingEndFromEvent.kt */
/* loaded from: classes2.dex */
public final class f6o0 extends zzp0<Void> {
    public static final f9w g = e9w.a(f6o0.class);
    public final com.vk.im.ui.components.dialogs_list.c d;
    public final long e;
    public final vh30 f;

    public f6o0(com.vk.im.ui.components.dialogs_list.c cVar, long j, vh30 vh30Var) {
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

    @Override // xsna.zzp0
    public final void e(Void r7) {
        com.vk.im.ui.components.dialogs_list.c cVar = this.d;
        HashMap hashMap = cVar.h.t;
        long j = this.e;
        List list = (List) hashMap.get(Long.valueOf(j));
        if (list != null) {
            if (list.isEmpty()) {
                list = null;
            }
            if (list != null) {
                ArrayList arrayList = new ArrayList(list);
                if (!arrayList.remove(this.f)) {
                    arrayList = null;
                }
                if (arrayList != null) {
                    if (arrayList.isEmpty()) {
                        hashMap.remove(Long.valueOf(j));
                    } else {
                        hashMap.put(Long.valueOf(j), arrayList);
                    }
                    vtm f = cVar.f();
                    com.vk.im.ui.components.dialogs_list.c cVar2 = cVar;
                    if (f == null) {
                        cVar2 = null;
                    }
                    if (cVar2 != null) {
                        cVar2.B(cVar2);
                    }
                }
            }
        }
    }

    public final String toString() {
        return "TaskInvalidateComposingEndFromEvent(dialogId=" + this.e + ", composing=" + this.f + ')';
    }
}
