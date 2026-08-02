package defpackage;

import android.view.ViewGroup;
import com.yandex.messaging.data.a;
import com.yandex.messaging.internal.view.timeline.overlay.b;
import com.yandex.messaging.internal.view.timeline.overlay.e;
import com.yandex.messaging.internal.view.timeline.overlay.f;

/* loaded from: classes15.dex */
public final class e190 {
    public final kz10 a;
    public final fbi0 b;
    public final a0u0 c;
    public final i5o d;
    public final vxy0 e;

    public e190(kz10 kz10Var, fbi0 fbi0Var, a0u0 a0u0Var, i5o i5oVar, vxy0 vxy0Var) {
        this.a = kz10Var;
        this.b = fbi0Var;
        this.c = a0u0Var;
        this.d = i5oVar;
        this.e = vxy0Var;
    }

    public final b a(ViewGroup viewGroup, ip31 ip31Var, t8 t8Var) {
        dbi0 ebi0Var;
        fbi0 fbi0Var = this.b;
        if (fbi0Var.d.a().reactionsEnabled) {
            viewGroup.setClipChildren(false);
            ebi0Var = new ebi0(fbi0Var, viewGroup, ip31Var);
        } else {
            ebi0Var = vvb1.y;
        }
        a0u0 a0u0Var = this.c;
        e eVar = new e(a0u0Var.a, (a) a0u0Var.b.get(), a0u0Var.c, viewGroup, ip31Var);
        com.yandex.messaging.internal.view.timeline.overlay.a aVar = new com.yandex.messaging.internal.view.timeline.overlay.a(this.d.a, viewGroup, ip31Var);
        vxy0 vxy0Var = this.e;
        return new b(viewGroup, ip31Var, this.a, ebi0Var, eVar, aVar, new f(vxy0Var.a, vxy0Var.b, vxy0Var.c, viewGroup, ip31Var), t8Var);
    }
}
