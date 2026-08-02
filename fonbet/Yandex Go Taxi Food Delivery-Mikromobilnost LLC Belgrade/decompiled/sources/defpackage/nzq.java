package defpackage;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.authorized.d;
import com.yandex.messaging.internal.authorized.f;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.EmptyList;

/* loaded from: classes15.dex */
public final class nzq extends ky4 {
    public f A;
    public final String y;
    public final String z;

    public nzq(ChatRequest chatRequest, String str, String str2) {
        super(chatRequest);
        this.y = str;
        this.z = str2;
    }

    @Override // defpackage.ky4, defpackage.xx4, defpackage.hr
    public final void b() {
        super.b();
        f fVar = this.A;
        if (fVar != null) {
            fVar.c(this.y);
        }
    }

    @Override // defpackage.hr
    public final boolean f(hr hrVar) {
        if (!(hrVar instanceof pyq)) {
            return false;
        }
        pyq pyqVar = (pyq) hrVar;
        return pyqVar.w.equals(this.w) && this.y.equals(pyqVar.y);
    }

    @Override // defpackage.b9b
    public final void k(j3b j3bVar, s020 s020Var) {
        if (this.A == null) {
            this.A = (f) ((m8g) s020Var).d.L0.get();
        }
        f fVar = this.A;
        ConcurrentHashMap concurrentHashMap = fVar.g;
        if (ydz.a.a()) {
            ydz.d();
        }
        String str = this.y;
        if (!concurrentHashMap.containsKey(str)) {
            concurrentHashMap.put(str, new d(fVar, str, this.z, EmptyList.a, false));
        }
        h();
    }
}
