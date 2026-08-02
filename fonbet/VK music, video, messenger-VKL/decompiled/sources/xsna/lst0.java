package xsna;

import com.vk.clips.sdk.shared.item.clip.ClipItemAction;
import com.vk.clips.sdk.shared.item.clip.ClipItemPatch;
import xsna.o8e;
import xsna.wk50;
import xsna.z2d;

/* compiled from: VideoWatchTimeApplier.kt */
/* loaded from: classes17.dex */
public final class lst0 implements oj50<z2d, ClipItemAction, ClipItemPatch> {
    public final p8e a;
    public volatile long b;

    public lst0(p8e p8eVar) {
        this.a = p8eVar;
    }

    @Override // xsna.oj50
    public final void a(wk50.a aVar, km50 km50Var, kj50 kj50Var) {
        z2d z2dVar = (z2d) km50Var;
        ClipItemAction clipItemAction = (ClipItemAction) kj50Var;
        if (z2dVar instanceof z2d.a) {
            if (clipItemAction.equals(ClipItemAction.m0.l.b)) {
                if (this.b > 0) {
                    p8e p8eVar = this.a;
                    if (p8eVar != null) {
                        z2d.a aVar2 = (z2d.a) z2dVar;
                        p8eVar.a(new o8e(aVar2.b.a.I0(), aVar2.b.a.o0(), new o8e.a.d(aVar2.b.a.getDuration(), (int) (this.b / 1000))));
                    }
                    this.b = 0L;
                    return;
                }
                return;
            }
            if (clipItemAction instanceof ClipItemAction.m0.o) {
                z2d.a aVar3 = (z2d.a) z2dVar;
                if (epx.f(aVar3.b.a.a1(), aVar3.d.A().a1())) {
                    ClipItemAction.m0.o oVar = (ClipItemAction.m0.o) clipItemAction;
                    this.b = (oVar.c - oVar.b) + this.b;
                }
            }
        }
    }

    @Override // xsna.oj50
    public final void onDestroy() {
    }
}
