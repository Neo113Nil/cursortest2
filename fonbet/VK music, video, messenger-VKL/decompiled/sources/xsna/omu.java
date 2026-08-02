package xsna;

import com.vk.dto.group.Group;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class omu implements izs {
    public final /* synthetic */ qmu b;
    public final /* synthetic */ Group c;
    public final /* synthetic */ int d;

    public /* synthetic */ omu(int i, Group group, qmu qmuVar) {
        this.b = qmuVar;
        this.c = group;
        this.d = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        com.vk.metrics.eventtracking.b.a.a(th);
        qmu qmuVar = this.b;
        qmuVar.u = null;
        this.c.C = this.d;
        qmuVar.o6();
        j03.l(th);
        return s3q0.a;
    }
}
