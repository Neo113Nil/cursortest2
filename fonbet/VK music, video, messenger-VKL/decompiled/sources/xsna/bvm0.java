package xsna;

import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.item.clip.ClipItemAction;
import com.vk.clips.sdk.shared.item.clip.ClipItemPatch;
import kotlin.NoWhenBranchMatchedException;
import xsna.t0d;
import xsna.t1d;
import xsna.wk50;
import xsna.z2d;

/* compiled from: SubscribeActionButtonActionApplier.kt */
/* loaded from: classes17.dex */
public final class bvm0 implements oj50<z2d, ClipItemAction, ClipItemPatch> {
    public final pih0 a;
    public final f4z b;
    public final f4z c;

    public bvm0(pih0 pih0Var, f4z f4zVar, f4z f4zVar2) {
        this.a = pih0Var;
        this.b = f4zVar;
        this.c = f4zVar2;
    }

    @Override // xsna.oj50
    public final void a(wk50.a aVar, km50 km50Var, kj50 kj50Var) {
        z2d z2dVar = (z2d) km50Var;
        ClipItemAction clipItemAction = (ClipItemAction) kj50Var;
        if ((z2dVar instanceof z2d.a) && (clipItemAction instanceof ClipItemAction.k0)) {
            ClipItemAction.k0 k0Var = (ClipItemAction.k0) clipItemAction;
            if (k0Var.equals(ClipItemAction.k0.b.b)) {
                this.b.b(new t0d.k.f(((z2d.a) z2dVar).b.a.I0()));
            } else {
                if (!k0Var.equals(ClipItemAction.k0.a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                SdkClipVideoFile sdkClipVideoFile = ((z2d.a) z2dVar).b.a;
                this.a.ai(new mfd(sdkClipVideoFile));
                this.c.b(new t1d.u(sdkClipVideoFile.I0()));
            }
        }
    }

    @Override // xsna.oj50
    public final void onDestroy() {
    }
}
