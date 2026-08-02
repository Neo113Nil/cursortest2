package xsna;

import com.vk.clips.sdk.shared.api.ui.ClipSeekBarController;
import java.util.Iterator;

/* compiled from: ClipSeekBarControllerImpl.kt */
/* loaded from: classes17.dex */
public final class ecd implements k3i0 {
    public final /* synthetic */ dcd a;

    public ecd(dcd dcdVar) {
        this.a = dcdVar;
    }

    @Override // xsna.k3i0
    public final void a(float f, boolean z) {
        Iterator it = this.a.e.iterator();
        while (it.hasNext()) {
            ((ClipSeekBarController.a) it.next()).a(f, z);
        }
    }

    @Override // xsna.k3i0
    public final void b(float f) {
        Float valueOf = Float.valueOf(f);
        dcd dcdVar = this.a;
        if (!epx.e(dcdVar.c, valueOf)) {
            dcdVar.c = valueOf;
        }
        dcdVar.n(dcd.k, dcd.m);
        Iterator it = dcdVar.e.iterator();
        while (it.hasNext()) {
            ((ClipSeekBarController.a) it.next()).b(f);
        }
    }

    @Override // xsna.k3i0
    public final void c(float f) {
        Float valueOf = Float.valueOf(f);
        dcd dcdVar = this.a;
        if (!epx.e(dcdVar.c, valueOf)) {
            dcdVar.c = valueOf;
        }
        dcdVar.n(dcd.l, dcd.n);
        Iterator it = dcdVar.e.iterator();
        while (it.hasNext()) {
            ((ClipSeekBarController.a) it.next()).c();
        }
    }
}
