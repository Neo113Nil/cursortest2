package xsna;

import com.vk.clips.sdk.facade.api.MyTargetVideoPlaybackErrorType;
import com.vk.clips.sdk.models.SdkActionLink;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.feed.analytics.ClipViewerAnalyticsEvent;
import com.vk.clips.sdk.shared.item.clip.ClipItemAction;
import com.vk.clips.sdk.shared.item.clip.ClipItemPatch;
import com.vk.clips.sdk.shared.item.clip.events.ClipItemTooltipEvent;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import one.video.player.error.OneVideoPlaybackException;
import xsna.qzb0;
import xsna.t0d;
import xsna.wk50;
import xsna.xp50;
import xsna.z2d;

/* compiled from: VideoUIEventActionApplier.kt */
/* loaded from: classes17.dex */
public final class fnt0 implements oj50<z2d, ClipItemAction, ClipItemPatch> {
    public final f4z a;
    public final f4z b;
    public final u0d c;
    public final pih0 d;

    public fnt0(f4z f4zVar, f4z f4zVar2, u0d u0dVar, pih0 pih0Var) {
        this.a = f4zVar;
        this.b = f4zVar2;
        this.c = u0dVar;
        this.d = pih0Var;
    }

    @Override // xsna.oj50
    public final void a(wk50.a aVar, km50 km50Var, kj50 kj50Var) {
        Pair pair;
        boolean z;
        boolean z2;
        wp50 wp50Var;
        z2d z2dVar = (z2d) km50Var;
        ClipItemAction clipItemAction = (ClipItemAction) kj50Var;
        if ((z2dVar instanceof z2d.a) && (clipItemAction instanceof ClipItemAction.m0)) {
            ClipItemAction.m0 m0Var = (ClipItemAction.m0) clipItemAction;
            if (m0Var instanceof ClipItemAction.m0.g) {
                z2d.a aVar2 = (z2d.a) z2dVar;
                aVar.b(new ClipItemPatch.t.f(((ClipItemAction.m0.g) clipItemAction).b));
                wp50 wp50Var2 = aVar2.B;
                if (wp50Var2 != null) {
                    j4b0 j4b0Var = aVar2.n;
                    if (j4b0Var.d) {
                        wp50Var2.f(xp50.f.a);
                        return;
                    } else {
                        if (j4b0Var.a) {
                            return;
                        }
                        wp50Var2.f(xp50.g.a);
                        return;
                    }
                }
                return;
            }
            if (m0Var instanceof ClipItemAction.m0.k) {
                ((ClipItemAction.m0.k) clipItemAction).getClass();
                aVar.b(new ClipItemPatch.t.i());
                wp50 wp50Var3 = ((z2d.a) z2dVar).B;
                if (wp50Var3 != null) {
                    wp50Var3.f(xp50.f.a);
                    return;
                }
                return;
            }
            if (m0Var instanceof ClipItemAction.m0.f) {
                z2d.a aVar3 = (z2d.a) z2dVar;
                aVar.b(new ClipItemPatch.t.e(((ClipItemAction.m0.f) clipItemAction).b));
                if (aVar3.n.d || (wp50Var = aVar3.B) == null) {
                    return;
                }
                wp50Var.f(xp50.e.a);
                return;
            }
            if (m0Var instanceof ClipItemAction.m0.b) {
                ClipItemAction.m0.b bVar = (ClipItemAction.m0.b) clipItemAction;
                aVar.b(new ClipItemPatch.t.b(bVar.b, bVar.c));
                wp50 wp50Var4 = ((z2d.a) z2dVar).B;
                if (wp50Var4 != null) {
                    OneVideoPlaybackException.ErrorCode errorCode = bVar.d;
                    wp50Var4.f(new xp50.d((errorCode == OneVideoPlaybackException.ErrorCode.TIMEOUT || errorCode == OneVideoPlaybackException.ErrorCode.IO_NETWORK_CONNECTION_TIMEOUT) ? MyTargetVideoPlaybackErrorType.TIMEOUT : MyTargetVideoPlaybackErrorType.UNKNOWN_ERROR));
                    return;
                }
                return;
            }
            boolean z3 = m0Var instanceof ClipItemAction.m0.i;
            f4z f4zVar = this.b;
            if (z3) {
                aVar.b(new ClipItemPatch.t.h(((ClipItemAction.m0.i) clipItemAction).b));
                f4zVar.b(t0d.g.a.a);
                return;
            }
            if (m0Var instanceof ClipItemAction.m0.c) {
                aVar.b(new ClipItemPatch.t.c(((ClipItemAction.m0.c) clipItemAction).b));
                return;
            }
            if (m0Var instanceof ClipItemAction.m0.n) {
                u0d u0dVar = this.c;
                boolean booleanValue = ((Boolean) u0dVar.invoke()).booleanValue();
                wp50 wp50Var5 = ((z2d.a) z2dVar).B;
                if (wp50Var5 != null) {
                    wp50Var5.f(new xp50.h(!booleanValue));
                }
                aVar.b(new ClipItemPatch.t.k(((Boolean) u0dVar.invoke()).booleanValue()));
                return;
            }
            if (!(m0Var instanceof ClipItemAction.m0.h)) {
                if (m0Var instanceof ClipItemAction.m0.d) {
                    aVar.b(new ClipItemPatch.t.d(((ClipItemAction.m0.d) clipItemAction).b));
                    return;
                }
                if (m0Var instanceof ClipItemAction.m0.a) {
                    aVar.b(new ClipItemPatch.t.a(((ClipItemAction.m0.a) clipItemAction).b));
                    return;
                }
                if (m0Var instanceof ClipItemAction.m0.m) {
                    aVar.b(new ClipItemPatch.t.j(((ClipItemAction.m0.m) clipItemAction).b));
                    return;
                }
                if (m0Var instanceof ClipItemAction.m0.e) {
                    f4zVar.b(t0d.k.d.a);
                    return;
                }
                if (!(m0Var instanceof ClipItemAction.m0.j)) {
                    if (!(m0Var instanceof ClipItemAction.m0.o) && !(m0Var instanceof ClipItemAction.m0.l)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                } else {
                    wp50 wp50Var6 = ((z2d.a) z2dVar).B;
                    if (wp50Var6 != null) {
                        wp50Var6.f(xp50.c.a);
                        return;
                    }
                    return;
                }
            }
            z2d.a aVar4 = (z2d.a) z2dVar;
            qzb0 qzb0Var = ((ClipItemAction.m0.h) clipItemAction).b;
            qzb0.a aVar5 = qzb0Var.a;
            qzb0.b bVar2 = qzb0Var.d;
            qzb0.d dVar = qzb0Var.e;
            boolean z4 = aVar5.a;
            boolean z5 = aVar5.b;
            boolean z6 = z4 && !z5;
            boolean z7 = aVar5.c;
            ny nyVar = aVar4.o;
            umc umcVar = aVar4.i;
            boolean z8 = nyVar.a;
            boolean z9 = nyVar.b;
            boolean z10 = umcVar.b ? true : qzb0Var.c.a;
            SdkClipVideoFile sdkClipVideoFile = aVar4.b.a;
            SdkActionLink m1 = sdkClipVideoFile.m1();
            if (epx.f(m1 != null ? m1.e : null, "video")) {
                SdkActionLink m12 = sdkClipVideoFile.m1();
                if ((m12 != null ? m12.g : null) != null && !umcVar.b && z10) {
                    this.d.ai(new ClipViewerAnalyticsEvent.e(sdkClipVideoFile));
                }
            }
            if (aVar4.z.a) {
                pair = new Pair(Boolean.valueOf(bVar2.b), Boolean.valueOf(bVar2.a));
            } else {
                Boolean bool = Boolean.FALSE;
                pair = new Pair(bool, bool);
            }
            boolean booleanValue2 = ((Boolean) pair.d()).booleanValue();
            boolean booleanValue3 = ((Boolean) pair.g()).booleanValue();
            mfj0 mfj0Var = aVar4.g;
            boolean z11 = !mfj0Var.a ? dVar.a : true;
            boolean z12 = mfj0Var.c;
            boolean z13 = !z12 ? dVar.a : true;
            boolean z14 = !z12 && dVar.a;
            if (z6 || (z8 && !z5)) {
                z = z9;
                z2 = true;
            } else {
                z = z9;
                z2 = false;
            }
            aVar.b(new ClipItemPatch.t.g(z2, z7 || z, qzb0Var, z10, booleanValue2, booleanValue3, z11, z13));
            this.a.b(new ClipItemTooltipEvent.e(qzb0Var.b));
            if (z14) {
                aVar.a(ClipItemAction.i0.a.b);
            }
        }
    }

    @Override // xsna.oj50
    public final void onDestroy() {
    }
}
