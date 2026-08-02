package xsna;

import android.graphics.Rect;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.sdk.shared.api.utils.ClipFeedTooltip$ClipFeedTooltipType;
import com.vk.clips.sdk.shared.item.clip.ClipItemAction;
import com.vk.clips.sdk.shared.item.clip.ClipItemPatch;
import kotlin.NoWhenBranchMatchedException;
import xsna.j0d;
import xsna.t0d;
import xsna.wk50;
import xsna.z2d;

/* compiled from: GestureActionApplier.kt */
/* loaded from: classes17.dex */
public final class znt implements oj50<z2d, ClipItemAction, ClipItemPatch> {
    public final wj50<j0d> a;
    public final wj50<t0d> b;
    public final bd80 c;
    public final yof d;

    public znt(f4z f4zVar, f4z f4zVar2, bd80 bd80Var, yof yofVar) {
        this.a = f4zVar;
        this.b = f4zVar2;
        this.c = bd80Var;
        this.d = yofVar;
    }

    @Override // xsna.oj50
    public final void a(wk50.a aVar, km50 km50Var, kj50 kj50Var) {
        z2d z2dVar = (z2d) km50Var;
        ClipItemAction clipItemAction = (ClipItemAction) kj50Var;
        if ((z2dVar instanceof z2d.a) && (clipItemAction instanceof ClipItemAction.i)) {
            ClipItemAction.i iVar = (ClipItemAction.i) clipItemAction;
            if (iVar instanceof ClipItemAction.i.d) {
                z2d.a aVar2 = (z2d.a) z2dVar;
                ClipItemAction.i.d dVar = (ClipItemAction.i.d) clipItemAction;
                if (b(aVar, aVar2, dVar)) {
                    return;
                }
                this.b.b(new t0d.f(aVar2.b.a, dVar.b, aVar2.d, aVar2.e));
                return;
            }
            if (!(iVar instanceof ClipItemAction.i.b)) {
                if (iVar instanceof ClipItemAction.i.c) {
                    z2d.a aVar3 = (z2d.a) z2dVar;
                    if (b(aVar, aVar3, (ClipItemAction.i.c) clipItemAction)) {
                        return;
                    }
                    c(aVar3, true);
                    return;
                }
                if (iVar instanceof ClipItemAction.i.a) {
                    b(aVar, (z2d.a) z2dVar, iVar);
                    return;
                } else {
                    if (!(iVar instanceof ClipItemAction.i.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    b(aVar, (z2d.a) z2dVar, iVar);
                    return;
                }
            }
            z2d.a aVar4 = (z2d.a) z2dVar;
            ClipItemAction.i.b bVar = (ClipItemAction.i.b) clipItemAction;
            boolean b = b(aVar, aVar4, bVar);
            m0d m0dVar = aVar4.b;
            if (b) {
                return;
            }
            this.c.a(ClipFeedTooltip$ClipFeedTooltipType.DOUBLE_TAP_ONBOARDING);
            boolean w1 = m0dVar.a.w1();
            if (m0dVar.a.i0()) {
                j0d.f fVar = new j0d.f(bVar.b);
                wj50<j0d> wj50Var = this.a;
                wj50Var.b(fVar);
                if (w1) {
                    return;
                }
                wj50Var.b(new j0d.e(false));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x009f, code lost:
    
        if (c(r12, false) == false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(wk50.a aVar, z2d.a aVar2, ClipItemAction.i iVar) {
        boolean z = aVar2.p;
        ixp0 ixp0Var = aVar2.q;
        if (!z) {
            boolean z2 = iVar instanceof ClipItemAction.i.c;
            ClipItemAction.i.c cVar = z2 ? (ClipItemAction.i.c) iVar : null;
            yof yofVar = this.d;
            yofVar.e().getClass();
            j4b0 j4b0Var = aVar2.n;
            kih0 kih0Var = aVar2.d;
            if (!j4b0Var.c) {
                wj50<t0d> wj50Var = this.b;
                if (cVar == null && ixp0Var.f) {
                    wj50Var.b(new t0d.d.a(kih0Var));
                    return true;
                }
                if (cVar != null) {
                    Rect rect = cVar.c;
                    if (aVar2.b.a.X0() == null) {
                        float width = rect.width() * 0.24f;
                        float f = rect.right;
                        float x = cVar.b.getX();
                        if ((UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= x && x <= width) || (f - width <= x && x <= f)) {
                            wj50Var.b(new t0d.d.b(kih0Var));
                            return true;
                        }
                    }
                }
            }
            if (z2) {
                if (!ixp0Var.b) {
                    yofVar.e().getClass();
                }
                aVar.a(ClipItemAction.Tooltip.Hide.ANIMATED);
                if (!(iVar instanceof ClipItemAction.i.e) || (iVar instanceof ClipItemAction.i.a) || !aVar2.m) {
                    return false;
                }
                aVar.b(ClipItemPatch.c.a.b);
                return true;
            }
            if (!(iVar instanceof ClipItemAction.i.b) && !(iVar instanceof ClipItemAction.i.d)) {
                if (!(iVar instanceof ClipItemAction.i.a) && !(iVar instanceof ClipItemAction.i.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar.a(ClipItemAction.Tooltip.Hide.ANIMATED);
                if (!(iVar instanceof ClipItemAction.i.e)) {
                }
                return false;
            }
        }
        return true;
    }

    public final boolean c(z2d.a aVar, boolean z) {
        ixp0 ixp0Var = aVar.q;
        m0d m0dVar = aVar.b;
        if (ixp0Var.b == z) {
            return false;
        }
        wj50<t0d> wj50Var = this.b;
        if (!z) {
            wj50Var.b(new t0d.n(m0dVar.a, false));
            return true;
        }
        if (!dgd.c(m0dVar.a)) {
            this.d.e().getClass();
            wj50Var.b(new t0d.n(m0dVar.a, true));
        }
        return true;
    }

    @Override // xsna.oj50
    public final void onDestroy() {
    }
}
