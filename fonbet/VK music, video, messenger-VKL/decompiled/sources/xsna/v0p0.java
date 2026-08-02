package xsna;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.toggle.b;

/* compiled from: ToggleStorageHelper.kt */
@ozl
/* loaded from: classes11.dex */
public final class v0p0 {
    public final com.vk.toggle.c a;

    public v0p0(com.vk.toggle.c cVar) {
        this.a = cVar;
    }

    public final boolean a(b.d dVar, boolean z) {
        this.a.c(dVar, z);
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"toggle save: ~ " + dVar});
        }
        return com.vk.toggle.b.A.l.containsKey(dVar.b.toString());
    }
}
