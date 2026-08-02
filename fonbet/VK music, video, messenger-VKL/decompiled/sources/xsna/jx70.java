package xsna;

import java.util.ArrayList;
import ru.ok.gl.effects.media.controller.video.ExtraVideoSupplier;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class jx70 implements Runnable {
    public final /* synthetic */ com.vk.media.ok.b b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ jx70(com.vk.media.ok.b bVar, ArrayList arrayList, boolean z) {
        this.b = bVar;
        this.c = arrayList;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.vk.media.ok.b bVar = this.b;
        ArrayList<Long> arrayList = this.c;
        bVar.y = arrayList;
        ExtraVideoSupplier extraVideoSupplier = bVar.G;
        ExtraVideoSupplier extraVideoSupplier2 = bVar.F;
        if (this.d) {
            g5g.J(arrayList);
        }
        long j = 0;
        long longValue = bVar.y.size() == 0 ? 0L : ((Number) xy9.b(1, bVar.y)).longValue();
        if ((bVar.u() || bVar.q()) && extraVideoSupplier2.isFirstRendered()) {
            j = extraVideoSupplier2.restart(longValue);
        }
        if (!bVar.u() && extraVideoSupplier.isFirstRendered()) {
            j = extraVideoSupplier.restart(longValue);
        }
        bVar.i.seek(bVar.A, j);
    }
}
