package xsna;

import com.vk.clips.sdk.facade.api.MyTargetFacadeCustomStatType;
import com.vk.clips.sdk.shared.api.analytics.SdkClipViewerClick;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.item.clip.ClipItemAction;
import com.vk.clips.sdk.shared.item.clip.ClipItemPatch;
import kotlin.NoWhenBranchMatchedException;
import xsna.j0d;
import xsna.t1d;
import xsna.wk50;
import xsna.xp50;
import xsna.z2d;

/* compiled from: DescriptionActionApplier.kt */
/* loaded from: classes17.dex */
public final class l1m implements oj50<z2d, ClipItemAction, ClipItemPatch> {
    public final pih0 a;
    public final f4z b;
    public final f4z c;
    public final yof d;

    public l1m(pih0 pih0Var, f4z f4zVar, f4z f4zVar2, yof yofVar) {
        this.a = pih0Var;
        this.b = f4zVar;
        this.c = f4zVar2;
        this.d = yofVar;
    }

    @Override // xsna.oj50
    public final void a(wk50.a aVar, km50 km50Var, kj50 kj50Var) {
        z2d z2dVar = (z2d) km50Var;
        ClipItemAction clipItemAction = (ClipItemAction) kj50Var;
        if ((z2dVar instanceof z2d.a) && (clipItemAction instanceof ClipItemAction.g)) {
            ClipItemAction.g gVar = (ClipItemAction.g) clipItemAction;
            boolean z = gVar instanceof ClipItemAction.g.b;
            pih0 pih0Var = this.a;
            if (z) {
                pih0Var.o2(new SdkClipViewerClick.f(((z2d.a) z2dVar).b.b()));
                aVar.b(ClipItemPatch.c.b.b);
                this.c.b(j0d.b.a);
                return;
            }
            if (gVar instanceof ClipItemAction.g.a) {
                aVar.b(ClipItemPatch.c.a.b);
                return;
            }
            if (gVar instanceof ClipItemAction.g.c) {
                SdkClipVideoFile b = ((z2d.a) z2dVar).b.b();
                String str = ((ClipItemAction.g.c) clipItemAction).b;
                pih0Var.o2(new SdkClipViewerClick.e.a(b, str));
                this.b.b(new t1d.l(str));
                return;
            }
            if (gVar instanceof ClipItemAction.g.e) {
                pih0Var.o2(new SdkClipViewerClick.e.c(((z2d.a) z2dVar).b.b(), ((ClipItemAction.g.e) clipItemAction).b));
                return;
            }
            if (!(gVar instanceof ClipItemAction.g.d)) {
                throw new NoWhenBranchMatchedException();
            }
            z2d.a aVar2 = (z2d.a) z2dVar;
            ClipItemAction.g.d dVar = (ClipItemAction.g.d) clipItemAction;
            wp50 wp50Var = aVar2.B;
            if (wp50Var != null) {
                wp50Var.f(new xp50.k(MyTargetFacadeCustomStatType.LINK_EXT));
            }
            pih0Var.o2(new SdkClipViewerClick.e.b(aVar2.b.b(), dVar.b));
        }
    }

    @Override // xsna.oj50
    public final void onDestroy() {
    }
}
