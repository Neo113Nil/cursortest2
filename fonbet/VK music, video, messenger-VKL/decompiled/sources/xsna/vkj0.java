package xsna;

import com.vk.clips.sdk.facade.api.MyTargetFacadeCustomStatType;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.item.clip.ClipItemAction;
import com.vk.clips.sdk.shared.item.clip.ClipItemPatch;
import kotlin.NoWhenBranchMatchedException;
import xsna.e3d;
import xsna.j0d;
import xsna.t0d;
import xsna.t1d;
import xsna.wk50;
import xsna.xp50;
import xsna.z2d;

/* compiled from: SideControlsActionApplier.kt */
/* loaded from: classes17.dex */
public final class vkj0 implements oj50<z2d, ClipItemAction, ClipItemPatch> {
    public final f4z a;
    public final f4z b;
    public final f4z c;
    public final f4z d;
    public final izs<qvq, s3q0> e;

    public vkj0(f4z f4zVar, f4z f4zVar2, f4z f4zVar3, f4z f4zVar4, izs izsVar) {
        this.a = f4zVar;
        this.b = f4zVar2;
        this.c = f4zVar3;
        this.d = f4zVar4;
        this.e = izsVar;
    }

    @Override // xsna.oj50
    public final void a(wk50.a aVar, km50 km50Var, kj50 kj50Var) {
        t0d dVar;
        wp50 wp50Var;
        z2d z2dVar = (z2d) km50Var;
        ClipItemAction clipItemAction = (ClipItemAction) kj50Var;
        if ((z2dVar instanceof z2d.a) && (clipItemAction instanceof ClipItemAction.h0)) {
            ClipItemAction.h0 h0Var = (ClipItemAction.h0) clipItemAction;
            boolean z = h0Var instanceof ClipItemAction.h0.a;
            f4z f4zVar = this.c;
            if (z) {
                z2d.a aVar2 = (z2d.a) z2dVar;
                m0d m0dVar = aVar2.b;
                SdkClipVideoFile sdkClipVideoFile = m0dVar.a;
                SdkClipVideoFile b = m0dVar.b();
                boolean w1 = sdkClipVideoFile.w1();
                if (!sdkClipVideoFile.J() && (wp50Var = aVar2.B) != null) {
                    wp50Var.f(new xp50.k(MyTargetFacadeCustomStatType.CLIP_LIKE));
                }
                f4zVar.b(new e3d.c(b));
                if (!w1) {
                    this.a.b(j0d.g.a);
                }
                aVar.a(ClipItemAction.Tooltip.Hide.IMMEDIATE);
                return;
            }
            boolean z2 = h0Var instanceof ClipItemAction.h0.b;
            f4z f4zVar2 = this.d;
            if (z2) {
                z2d.a aVar3 = (z2d.a) z2dVar;
                SdkClipVideoFile b2 = aVar3.b.b();
                wp50 wp50Var2 = aVar3.B;
                if (wp50Var2 != null) {
                    wp50Var2.f(new xp50.k(MyTargetFacadeCustomStatType.CLIP_SHARE));
                }
                f4zVar2.b(new t0d.e(b2));
                return;
            }
            if (!(h0Var instanceof ClipItemAction.h0.c)) {
                throw new NoWhenBranchMatchedException();
            }
            z2d.a aVar4 = (z2d.a) z2dVar;
            ClipItemAction.h0.c cVar = (ClipItemAction.h0.c) clipItemAction;
            m0d m0dVar2 = aVar4.b;
            kih0 kih0Var = aVar4.d;
            SdkClipVideoFile b3 = m0dVar2.b();
            boolean z3 = cVar instanceof ClipItemAction.h0.c.e;
            f4z f4zVar3 = this.b;
            if (z3) {
                f4zVar3.b(new t1d.n(b3));
                return;
            }
            if (cVar instanceof ClipItemAction.h0.c.a) {
                f4zVar3.b(new t1d.c(b3, kih0Var, aVar4.e));
                return;
            }
            if (cVar instanceof ClipItemAction.h0.c.C0657c) {
                f4zVar3.b(new t1d.e0(b3));
                return;
            }
            if (!(cVar instanceof ClipItemAction.h0.c.b)) {
                if (cVar instanceof ClipItemAction.h0.c.d) {
                    f4zVar3.b(new t1d.g0(kih0Var));
                    return;
                } else if (cVar instanceof ClipItemAction.h0.c.f) {
                    f4zVar.b(new e3d.d(b3));
                    return;
                } else {
                    if (!(cVar instanceof ClipItemAction.h0.c.g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f4zVar.b(new e3d.e(b3));
                    return;
                }
            }
            ClipItemAction.h0.c.b bVar = (ClipItemAction.h0.c.b) cVar;
            if (epx.f(bVar, ClipItemAction.h0.c.b.a.b)) {
                dVar = new t0d.k.b.a(b3);
            } else if (epx.f(bVar, ClipItemAction.h0.c.b.C0655b.b)) {
                dVar = new t0d.k.b.C3712b(b3);
            } else if (epx.f(bVar, ClipItemAction.h0.c.b.C0656c.b)) {
                dVar = new t0d.k.b.c(b3);
            } else {
                if (!epx.f(bVar, ClipItemAction.h0.c.b.d.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                dVar = new t0d.k.b.d(b3);
            }
            f4zVar2.b(dVar);
        }
    }

    @Override // xsna.oj50
    public final void onDestroy() {
    }
}
