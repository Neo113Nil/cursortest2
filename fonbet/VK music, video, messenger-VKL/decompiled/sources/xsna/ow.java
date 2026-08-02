package xsna;

import com.vk.clips.sdk.facade.api.MyTargetFacadeCustomStatType;
import com.vk.clips.sdk.models.SdkActionLink;
import com.vk.clips.sdk.shared.api.analytics.SdkClipViewerClick;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.item.clip.ClipItemAction;
import com.vk.clips.sdk.shared.item.clip.ClipItemPatch;
import xsna.t0d;
import xsna.t1d;
import xsna.wk50;
import xsna.xp50;
import xsna.z2d;

/* compiled from: ActionButtonsActionApplier.kt */
/* loaded from: classes17.dex */
public final class ow implements oj50<z2d, ClipItemAction, ClipItemPatch> {
    public final ClipFeedTab a;
    public final pih0 b;
    public final f4z c;
    public final f4z d;
    public final vdd e;

    public ow(ClipFeedTab clipFeedTab, pih0 pih0Var, f4z f4zVar, f4z f4zVar2, vdd vddVar) {
        this.a = clipFeedTab;
        this.b = pih0Var;
        this.c = f4zVar;
        this.d = f4zVar2;
        this.e = vddVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    @Override // xsna.oj50
    public final void a(wk50.a aVar, km50 km50Var, kj50 kj50Var) {
        z2d z2dVar = (z2d) km50Var;
        ClipItemAction clipItemAction = (ClipItemAction) kj50Var;
        if ((z2dVar instanceof z2d.a) && (clipItemAction instanceof ClipItemAction.a)) {
            ClipItemAction.a aVar2 = (ClipItemAction.a) clipItemAction;
            if (aVar2 instanceof ClipItemAction.a.c) {
                b((z2d.a) z2dVar, ((ClipItemAction.a.c) clipItemAction).b);
                return;
            }
            if (aVar2 instanceof ClipItemAction.a.e) {
                b((z2d.a) z2dVar, ((ClipItemAction.a.e) clipItemAction).b);
                return;
            }
            boolean z = aVar2 instanceof ClipItemAction.a.b;
            f4z f4zVar = this.c;
            f4z f4zVar2 = this.d;
            if (!z) {
                if (aVar2 instanceof ClipItemAction.a.C0651a) {
                    z2d.a aVar3 = (z2d.a) z2dVar;
                    SdkClipVideoFile sdkClipVideoFile = aVar3.b.a;
                    if (sdkClipVideoFile.U()) {
                        f4zVar2.b(new t1d.u(sdkClipVideoFile.I0()));
                        return;
                    } else {
                        f4zVar.b(new t0d.m.c(aVar3.c));
                        return;
                    }
                }
                return;
            }
            z2d.a aVar4 = (z2d.a) z2dVar;
            wp50 wp50Var = aVar4.B;
            if (wp50Var != null) {
                wp50Var.f(new xp50.k(MyTargetFacadeCustomStatType.CTA_CLICK));
            }
            m0d m0dVar = aVar4.b;
            SdkClipVideoFile sdkClipVideoFile2 = m0dVar.a;
            SdkClipVideoFile b = m0dVar.b();
            SdkActionLink m1 = sdkClipVideoFile2.m1();
            if (m1 != null) {
                String str = m1.f;
                this.b.o2(new SdkClipViewerClick.a(b, m1));
                String str2 = m1.e;
                switch (str2.hashCode()) {
                    case -652765742:
                        if (str2.equals("clips_user_link")) {
                            f4zVar2.b(new t1d.y(b));
                            return;
                        }
                        break;
                    case -591591220:
                        if (str2.equals("link_community_with_subscribe")) {
                            f4zVar.b(t0d.h.a);
                            return;
                        }
                        break;
                    case 112202875:
                        if (str2.equals("video")) {
                            aVar.a(ClipItemAction.h.c.b);
                            return;
                        }
                        break;
                    case 1217056139:
                        if (str2.equals("clips_compilation_next")) {
                            f4zVar2.b(t1d.a0.a);
                            return;
                        }
                        break;
                    case 1378026881:
                        if (str2.equals("clips_trend")) {
                            f4zVar2.b(new t1d.x(str));
                            return;
                        }
                        break;
                }
                f4zVar2.b(new t1d.m(str));
            }
        }
    }

    public final void b(z2d.a aVar, boolean z) {
        if (z) {
            SdkClipVideoFile sdkClipVideoFile = aVar.b.a;
            SdkActionLink m1 = sdkClipVideoFile.m1();
            if (epx.f(m1 != null ? m1.e : null, "clips_trend") && aVar.x) {
                this.e.d(this.a, sdkClipVideoFile.a1());
            }
        }
    }

    @Override // xsna.oj50
    public final void onDestroy() {
    }
}
