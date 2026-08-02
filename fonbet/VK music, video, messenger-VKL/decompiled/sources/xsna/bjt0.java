package xsna;

import com.vk.clips.sdk.shared.item.clip.ClipItemAction;
import com.vk.clips.sdk.shared.item.clip.ClipItemPatch;
import kotlin.NoWhenBranchMatchedException;
import xsna.t0d;
import xsna.wk50;
import xsna.z2d;

/* compiled from: VideoSurfaceActionApplier.kt */
/* loaded from: classes17.dex */
public final class bjt0 implements oj50<z2d, ClipItemAction, ClipItemPatch> {
    public final f4z a;

    public bjt0(f4z f4zVar) {
        this.a = f4zVar;
    }

    @Override // xsna.oj50
    public final void a(wk50.a aVar, km50 km50Var, kj50 kj50Var) {
        z2d z2dVar = (z2d) km50Var;
        ClipItemAction clipItemAction = (ClipItemAction) kj50Var;
        if ((z2dVar instanceof z2d.a) && (clipItemAction instanceof ClipItemAction.l0)) {
            if (!(((ClipItemAction.l0) clipItemAction) instanceof ClipItemAction.l0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            z2d.a aVar2 = (z2d.a) z2dVar;
            this.a.b(new t0d.p(aVar2.d, aVar2.e));
        }
    }

    @Override // xsna.oj50
    public final void onDestroy() {
    }
}
