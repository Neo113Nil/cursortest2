package xsna;

import com.vk.clips.sdk.facade.api.MyTargetFacadeCustomStatType;
import com.vk.clips.sdk.shared.api.analytics.SdkClipViewerClick;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.item.clip.ClipItemAction;
import com.vk.clips.sdk.shared.item.clip.ClipItemPatch;
import kotlin.NoWhenBranchMatchedException;
import xsna.t0d;
import xsna.t1d;
import xsna.wk50;
import xsna.xp50;
import xsna.z2d;

/* compiled from: RightTitleActionApplier.kt */
/* loaded from: classes17.dex */
public final class rkg0 implements oj50<z2d, ClipItemAction, ClipItemPatch> {
    public final pih0 a;
    public final f4z b;
    public final f4z c;

    public rkg0(pih0 pih0Var, f4z f4zVar, f4z f4zVar2) {
        this.a = pih0Var;
        this.b = f4zVar;
        this.c = f4zVar2;
    }

    @Override // xsna.oj50
    public final void a(wk50.a aVar, km50 km50Var, kj50 kj50Var) {
        z2d z2dVar = (z2d) km50Var;
        ClipItemAction clipItemAction = (ClipItemAction) kj50Var;
        if ((z2dVar instanceof z2d.a) && (clipItemAction instanceof ClipItemAction.g0)) {
            ClipItemAction.g0 g0Var = (ClipItemAction.g0) clipItemAction;
            boolean z = g0Var instanceof ClipItemAction.g0.a;
            pih0 pih0Var = this.a;
            if (!z) {
                if (!(g0Var instanceof ClipItemAction.g0.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                izs<SdkClipVideoFile, s3q0> izsVar = ((ClipItemAction.g0.b) clipItemAction).b;
                pih0Var.o2(new SdkClipViewerClick.u(((z2d.a) z2dVar).b.a, false));
                this.c.b(new t1d.h0(izsVar));
                return;
            }
            z2d.a aVar2 = (z2d.a) z2dVar;
            izs<SdkClipVideoFile, s3q0> izsVar2 = ((ClipItemAction.g0.a) clipItemAction).b;
            wp50 wp50Var = aVar2.B;
            if (wp50Var != null) {
                wp50Var.f(new xp50.k(MyTargetFacadeCustomStatType.CLIP_SUBSCRIBE));
            }
            pih0Var.o2(new SdkClipViewerClick.u(aVar2.b.a, true));
            this.b.b(new t0d.m.b(aVar2.c, izsVar2));
        }
    }

    @Override // xsna.oj50
    public final void onDestroy() {
    }
}
