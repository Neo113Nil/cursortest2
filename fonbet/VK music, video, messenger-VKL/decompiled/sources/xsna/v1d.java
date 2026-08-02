package xsna;

import com.vk.clips.tool.view.viewer.feed.list.nps.LazyNpsOverlay;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import xsna.bm70;
import xsna.yl70;

/* compiled from: ClipItemNpsOverlayRenderDelegate.kt */
/* loaded from: classes17.dex */
public final class v1d {
    public final u6d a;
    public final LazyNpsOverlay b;
    public final yux c;
    public bm70 d;
    public bm70.b e;

    public v1d(u6d u6dVar, LazyNpsOverlay lazyNpsOverlay, yux yuxVar) {
        this.a = u6dVar;
        this.b = lazyNpsOverlay;
        this.c = yuxVar;
    }

    public final void a(bm70 bm70Var) {
        bm70 bm70Var2 = this.d;
        boolean f = epx.f(bm70Var2 != null ? bm70Var2.F() : null, bm70Var.F());
        bm70 bm70Var3 = this.d;
        boolean z = bm70Var3 instanceof bm70.b;
        boolean z2 = bm70Var instanceof bm70.b;
        boolean z3 = !z && z2;
        boolean z4 = z && !z2;
        yux yuxVar = this.c;
        if (!f) {
            if (bm70Var3 != null) {
                yuxVar.d(bm70Var3.F());
            }
            if (z2) {
                yuxVar.b(bm70Var.F());
            }
        } else if (z4) {
            if (bm70Var3 != null) {
                yuxVar.d(bm70Var3.F());
            }
        } else if (z3) {
            yuxVar.b(bm70Var.F());
        }
        if (!z2) {
            this.d = bm70Var;
            return;
        }
        bm70.b bVar = (bm70.b) bm70Var;
        bm70 bm70Var4 = this.d;
        boolean z5 = epx.f(bVar.F(), bm70Var4 != null ? bm70Var4.F() : null) && (bm70Var4 instanceof bm70.b);
        if (!bVar.equals(this.e)) {
            boolean z6 = bVar instanceof bm70.b.a;
            LazyNpsOverlay lazyNpsOverlay = this.b;
            if (z6) {
                bm70.b.a aVar = (bm70.b.a) bVar;
                ArrayList arrayList = aVar.d;
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new yl70.a(((bm70.b.a.C2613a) it.next()).a));
                }
                lazyNpsOverlay.setState(new yl70.b.C4110b(z5, aVar.b, aVar.c, arrayList2, new com.vk.voip.ui.menu.feature.a(this, 22), new com.vk.movika.sdk.base.logic.interactor.j(this, 19)));
            } else {
                if (!(bVar instanceof bm70.b.C2614b)) {
                    throw new NoWhenBranchMatchedException();
                }
                lazyNpsOverlay.setState(new yl70.b.c(z5));
            }
        }
        this.d = bm70Var;
        this.e = bVar;
    }
}
