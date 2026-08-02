package defpackage;

import androidx.room.util.a;
import com.yandex.messaging.ChatRequest;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes15.dex */
public final class l221 extends ky4 implements zub0 {
    public avb0 A;
    public final k020 y;
    public yub0 z;

    public l221(ChatRequest chatRequest, k020 k020Var) {
        super(chatRequest);
        this.y = k020Var;
    }

    @Override // defpackage.ky4, defpackage.xx4, defpackage.hr
    public final void b() {
        super.b();
        yub0 yub0Var = this.z;
        if (yub0Var != null) {
            yub0Var.cancel();
            this.z = null;
        }
        this.A = null;
    }

    @Override // defpackage.zub0
    public final void c(int i) {
        h();
        this.A = null;
    }

    @Override // defpackage.ky4, defpackage.xx4
    public final void j(cl21 cl21Var) {
        d9g d9gVar = (d9g) cl21Var;
        this.A = (avb0) d9gVar.F0.get();
        super.j(d9gVar);
    }

    @Override // defpackage.b9b
    public final void k(j3b j3bVar, s020 s020Var) {
        String[] strArr = (String[]) a.b(this.y.b.L().a, true, false, new fnb0(7));
        String str = j3bVar.b;
        z83.h("Try to unpin already unpinned chat", j73.y(strArr, str));
        avb0 avb0Var = this.A;
        Objects.requireNonNull(avb0Var);
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArr) {
            if (!jl40.l(str2, str)) {
                arrayList.add(str2);
            }
        }
        this.z = avb0Var.a((String[]) arrayList.toArray(new String[0]), this);
    }

    @Override // defpackage.zub0
    public final void success() {
        h();
        this.A = null;
    }
}
