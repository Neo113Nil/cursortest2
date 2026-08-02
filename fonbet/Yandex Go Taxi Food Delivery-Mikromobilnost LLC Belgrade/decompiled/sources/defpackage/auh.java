package defpackage;

import com.yandex.go.delivery.tracking.map_overlay.a;
import java.util.LinkedHashSet;

/* loaded from: classes12.dex */
public final class auh extends h55 {
    public final a D;

    public auh(a aVar) {
        super(null);
        this.D = aVar;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        a aVar = this.D;
        LinkedHashSet linkedHashSet = aVar.w;
        if (linkedHashSet.remove(this) && linkedHashSet.isEmpty()) {
            aVar.c.Cg();
        }
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        this.D.Hg(this);
    }
}
